package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import yads.ek2;
import yads.h30;

/* loaded from: classes7.dex */
public final class c771 extends yd71 {
    public AssetFileDescriptor A;
    public FileInputStream B;
    public long C;
    public boolean D;
    public final Resources x;
    public final String y;
    public Uri z;

    public c771(Context context) {
        super(false);
        this.x = context.getResources();
        this.y = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r7.matches("\\d+") != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    @Override // defpackage.u871
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Q(no71 no71Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri uri = no71Var.a;
        long j = no71Var.f;
        long j2 = no71Var.e;
        this.z = uri;
        boolean equals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.x;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new ek2(1004, null, "URI must either use scheme rawresource or android.resource");
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = resources.getIdentifier((TextUtils.isEmpty(host) ? "" : b64.j(host, ":")).concat(path), "raw", this.y);
                    if (parseInt == 0) {
                        throw new ek2(2005, null, "Resource not found.");
                    }
                    h();
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.A = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new ek2(2000, null, unr0.n(uri, "Resource is compressed: "));
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.B = fileInputStream;
                    try {
                        if (length != -1 && j2 > length) {
                            throw new ek2(2008, null, null);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                        if (skip != j2) {
                            throw new ek2(2008, null, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.C = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.C = size;
                                if (size < 0) {
                                    throw new ek2(2008, null, null);
                                }
                            }
                        } else {
                            long j3 = length - skip;
                            this.C = j3;
                            if (j3 < 0) {
                                throw new h30();
                            }
                        }
                        if (j != -1) {
                            long j4 = this.C;
                            this.C = j4 == -1 ? j : Math.min(j4, j);
                        }
                        this.D = true;
                        a(no71Var);
                        return j != -1 ? j : this.C;
                    } catch (ek2 e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new ek2(2000, e2, null);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.A = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new ek2(2005, e3, null);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            h();
        } catch (NumberFormatException unused) {
            throw new ek2(1004, null, "Resource identifier must be an integer.");
        }
    }

    @Override // defpackage.u871
    public final void close() {
        this.z = null;
        try {
            try {
                FileInputStream fileInputStream = this.B;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.B = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ek2(2000, e, null);
                    }
                } finally {
                    this.A = null;
                    if (this.D) {
                        this.D = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new ek2(2000, e2, null);
            }
        } catch (Throwable th) {
            this.B = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A = null;
                    if (this.D) {
                        this.D = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ek2(2000, e3, null);
                }
            } finally {
                this.A = null;
                if (this.D) {
                    this.D = false;
                    g();
                }
            }
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        return this.z;
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.C;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ek2(2000, e, null);
                }
            }
            FileInputStream fileInputStream = this.B;
            int i3 = rf71.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.C;
            if (read != -1) {
                if (j2 != -1) {
                    this.C = j2 - read;
                }
                c(read);
                return read;
            }
            if (j2 != -1) {
                throw new ek2(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
