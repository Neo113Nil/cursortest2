package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import okhttp3.m;
import okio.ByteString;
import xsna.an8;
import xsna.emb;
import xsna.ozl;
import xsna.x2r0;

/* compiled from: RequestBody.kt */
/* loaded from: classes11.dex */
public abstract class t {
    public static final a Companion = new a();

    /* compiled from: RequestBody.kt */
    public static final class a {
        public static s a(String str, m mVar) {
            Charset charset = emb.b;
            if (mVar != null) {
                Pattern pattern = m.e;
                Charset a = mVar.a(null);
                if (a == null) {
                    try {
                        mVar = m.a.a(mVar + "; charset=utf-8");
                    } catch (IllegalArgumentException unused) {
                        mVar = null;
                    }
                } else {
                    charset = a;
                }
            }
            byte[] bytes = str.getBytes(charset);
            return b(mVar, bytes, 0, bytes.length);
        }

        public static s b(m mVar, byte[] bArr, int i, int i2) {
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = x2r0.a;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new s(mVar, bArr, i2, i);
        }

        public static s c(a aVar, m mVar, byte[] bArr, int i, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return b(mVar, bArr, i, length);
        }

        public static /* synthetic */ s d(a aVar, byte[] bArr, m mVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                mVar = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return b(mVar, bArr, i, length);
        }
    }

    public static final t create(String str, m mVar) {
        Companion.getClass();
        return a.a(str, mVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract m contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(an8 an8Var) throws IOException;

    @ozl
    public static final t create(m mVar, byte[] bArr) {
        a aVar = Companion;
        aVar.getClass();
        return a.c(aVar, mVar, bArr, 0, 12);
    }

    @ozl
    public static final t create(m mVar, byte[] bArr, int i) {
        a aVar = Companion;
        aVar.getClass();
        return a.c(aVar, mVar, bArr, i, 8);
    }

    public static final t create(byte[] bArr) {
        a aVar = Companion;
        aVar.getClass();
        return a.d(aVar, bArr, null, 0, 7);
    }

    public static final t create(byte[] bArr, m mVar) {
        a aVar = Companion;
        aVar.getClass();
        return a.d(aVar, bArr, mVar, 0, 6);
    }

    public static final t create(byte[] bArr, m mVar, int i) {
        a aVar = Companion;
        aVar.getClass();
        return a.d(aVar, bArr, mVar, i, 4);
    }

    public static final t create(byte[] bArr, m mVar, int i, int i2) {
        Companion.getClass();
        return a.b(mVar, bArr, i, i2);
    }

    @ozl
    public static final t create(m mVar, ByteString byteString) {
        Companion.getClass();
        return new r(mVar, byteString);
    }

    public static final t create(ByteString byteString, m mVar) {
        Companion.getClass();
        return new r(mVar, byteString);
    }

    public static final t create(File file, m mVar) {
        Companion.getClass();
        return new q(mVar, file);
    }

    @ozl
    public static final t create(m mVar, File file) {
        Companion.getClass();
        return new q(mVar, file);
    }

    @ozl
    public static final t create(m mVar, String str) {
        Companion.getClass();
        return a.a(str, mVar);
    }

    @ozl
    public static final t create(m mVar, byte[] bArr, int i, int i2) {
        Companion.getClass();
        return a.b(mVar, bArr, i, i2);
    }
}
