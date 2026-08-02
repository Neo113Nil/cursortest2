package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import yads.cz;

/* loaded from: classes7.dex */
public final class e271 extends yd71 {
    public FileInputStream A;
    public long B;
    public boolean C;
    public final ContentResolver x;
    public Uri y;
    public AssetFileDescriptor z;

    public e271(Context context) {
        super(false);
        this.x = context.getContentResolver();
    }

    @Override // defpackage.u871
    public final long Q(no71 no71Var) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = no71Var.a;
                long j = no71Var.f;
                long j2 = no71Var.e;
                this.y = uri;
                h();
                boolean equals = "content".equals(no71Var.a.getScheme());
                ContentResolver contentResolver = this.x;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                }
                this.z = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new cz(2000, new IOException("Could not open file descriptor for: " + uri));
                    } catch (IOException e) {
                        e = e;
                        throw new cz(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new cz(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new cz(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.B = -1L;
                    } else {
                        long position = size - channel.position();
                        this.B = position;
                        if (position < 0) {
                            throw new cz(2008, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.B = j3;
                    if (j3 < 0) {
                        throw new cz(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.B;
                    this.B = j4 == -1 ? j : Math.min(j4, j);
                }
                this.C = true;
                a(no71Var);
                return j != -1 ? j : this.B;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (cz e3) {
            throw e3;
        }
    }

    @Override // defpackage.u871
    public final void close() {
        this.y = null;
        try {
            try {
                FileInputStream fileInputStream = this.A;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.A = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.z;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new cz(2000, e);
                    }
                } finally {
                    this.z = null;
                    if (this.C) {
                        this.C = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new cz(2000, e2);
            }
        } catch (Throwable th) {
            this.A = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.z;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.z = null;
                    if (this.C) {
                        this.C = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new cz(2000, e3);
                }
            } finally {
                this.z = null;
                if (this.C) {
                    this.C = false;
                    g();
                }
            }
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.y;
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.B;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new cz(2000, e);
            }
        }
        FileInputStream fileInputStream = this.A;
        int i3 = rf71.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.B;
        if (j2 != -1) {
            this.B = j2 - read;
        }
        c(read);
        return read;
    }
}
