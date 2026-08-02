package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes10.dex */
public final class pz extends eo {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public pz(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = u30Var.a;
                this.f = uri;
                e();
                if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(u30Var.a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new oz(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new oz(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && u30Var.f > length) {
                    throw new oz(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(u30Var.f + startOffset) - startOffset;
                if (skip != u30Var.f) {
                    throw new oz(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.i = position;
                        if (position < 0) {
                            throw new oz(null, 2008);
                        }
                    }
                } else {
                    long j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new oz(null, 2008);
                    }
                }
                long j2 = u30Var.g;
                if (j2 != -1) {
                    long j3 = this.i;
                    if (j3 != -1) {
                        j2 = Math.min(j3, j2);
                    }
                    this.i = j2;
                }
                this.j = true;
                b(u30Var);
                long j4 = u30Var.g;
                return j4 != -1 ? j4 : this.i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (oz e3) {
            throw e3;
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new oz(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new oz(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new oz(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    d();
                }
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new oz(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = mc3.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        c(read);
        return read;
    }
}
