package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes10.dex */
public final class nfe extends nz4 {
    public final ContentResolver a;
    public Uri b;
    public AssetFileDescriptor c;
    public FileInputStream w;
    public long x;
    public boolean y;

    public nfe(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.kpg
    public final void close() {
        this.b = null;
        try {
            try {
                FileInputStream fileInputStream = this.w;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.w = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSource$ContentDataSourceException(2000, e);
                    }
                } finally {
                    this.c = null;
                    if (this.y) {
                        this.y = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSource$ContentDataSourceException(2000, e2);
            }
        } catch (Throwable th) {
            this.w = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.y) {
                        this.y = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSource$ContentDataSourceException(2000, e3);
                }
            } finally {
                this.c = null;
                if (this.y) {
                    this.y = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.b;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = npgVar.a;
                long j = npgVar.g;
                long j2 = npgVar.f;
                Uri normalizeScheme = uri.normalizeScheme();
                this.b = normalizeScheme;
                transferInitializing(npgVar);
                boolean equals = "content".equals(normalizeScheme.getScheme());
                ContentResolver contentResolver = this.a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.c = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSource$ContentDataSourceException(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.w = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.x = -1L;
                    } else {
                        long position = size - channel.position();
                        this.x = position;
                        if (position < 0) {
                            throw new ContentDataSource$ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.x = j3;
                    if (j3 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.x;
                    this.x = j4 == -1 ? j : Math.min(j4, j);
                }
                this.y = true;
                transferStarted(npgVar);
                return j != -1 ? j : this.x;
            } catch (ContentDataSource$ContentDataSourceException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.x;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(2000, e);
                }
            }
            FileInputStream fileInputStream = this.w;
            int i3 = tw21.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.x;
                if (j2 != -1) {
                    this.x = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
