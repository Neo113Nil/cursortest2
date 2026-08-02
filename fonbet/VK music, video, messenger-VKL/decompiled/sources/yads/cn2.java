package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import xsna.fo8;
import xsna.i5s;
import xsna.i6n0;

/* loaded from: classes10.dex */
public final class cn2 extends eo {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public cn2(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r3.matches("\\d+") != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(u30 u30Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri uri = u30Var.a;
        this.g = uri;
        try {
            try {
                if (!TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new bn2("URI must either use scheme rawresource or android.resource", null, 1004);
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith(DomExceptionUtils.SEPARATOR)) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = this.e.getIdentifier(i5s.a(new StringBuilder(), TextUtils.isEmpty(host) ? "" : fo8.a(host, StringUtils.PROCESS_POSTFIX_DELIMITER), path), "raw", this.f);
                    if (parseInt == 0) {
                        throw new bn2("Resource not found.", null, 2005);
                    }
                    e();
                    openRawResourceFd = this.e.openRawResourceFd(parseInt);
                    this.h = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new bn2(i6n0.a(uri, "Resource is compressed: "), null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.i = fileInputStream;
                    if (length != -1) {
                        try {
                            if (u30Var.f > length) {
                                throw new bn2(null, null, 2008);
                            }
                        } catch (bn2 e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new bn2(null, e2, 2000);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(u30Var.f + startOffset) - startOffset;
                    if (skip != u30Var.f) {
                        throw new bn2(null, null, 2008);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.j = size;
                            if (size < 0) {
                                throw new bn2(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.j = j;
                        if (j < 0) {
                            throw new q30(2008);
                        }
                    }
                    long j2 = u30Var.g;
                    if (j2 != -1) {
                        long j3 = this.j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.j = j2;
                    }
                    this.k = true;
                    b(u30Var);
                    long j4 = u30Var.g;
                    return j4 != -1 ? j4 : this.j;
                }
                openRawResourceFd = this.e.openRawResourceFd(parseInt);
                this.h = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new bn2(null, e3, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            e();
        } catch (NumberFormatException unused) {
            throw new bn2("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new bn2(null, e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new bn2(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new bn2(null, e3, 2000);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    d();
                }
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.g;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new bn2(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = mc3.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new bn2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        c(read);
        return read;
    }
}
