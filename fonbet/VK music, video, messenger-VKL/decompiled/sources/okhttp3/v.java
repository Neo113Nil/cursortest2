package okhttp3;

import defpackage.k0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import okhttp3.m;
import okio.ByteString;
import xsna.bn8;
import xsna.efz;
import xsna.emb;
import xsna.eq0;
import xsna.izs;
import xsna.ji;
import xsna.ozl;
import xsna.ro;
import xsna.s3q0;
import xsna.vl8;
import xsna.x2r0;

/* compiled from: ResponseBody.kt */
/* loaded from: classes11.dex */
public abstract class v implements Closeable {
    public static final b Companion = new b();
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    /* loaded from: classes8.dex */
    public static final class a extends Reader {
        public final bn8 b;
        public final Charset c;
        public boolean d;
        public InputStreamReader e;

        public a(bn8 bn8Var, Charset charset) {
            this.b = bn8Var;
            this.c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            s3q0 s3q0Var;
            this.d = true;
            InputStreamReader inputStreamReader = this.e;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var == null) {
                this.b.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            if (this.d) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.e;
            if (inputStreamReader == null) {
                bn8 bn8Var = this.b;
                inputStreamReader = new InputStreamReader(bn8Var.f4(), x2r0.r(bn8Var, this.c));
                this.e = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class b {
        public static w a(String str, m mVar) {
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
            vl8 vl8Var = new vl8();
            int length = str.length();
            if (length < 0) {
                throw new IllegalArgumentException(efz.a(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > str.length()) {
                StringBuilder b = ji.b(length, "endIndex > string.length: ", " > ");
                b.append(str.length());
                throw new IllegalArgumentException(b.toString().toString());
            }
            if (charset.equals(emb.b)) {
                vl8Var.Q(0, length, str);
            } else {
                byte[] bytes = str.substring(0, length).getBytes(charset);
                vl8Var.write(bytes, 0, bytes.length);
            }
            return new w(mVar, vl8Var.c, vl8Var);
        }

        public static w b(byte[] bArr, m mVar) {
            vl8 vl8Var = new vl8();
            vl8Var.write(bArr, 0, bArr.length);
            return new w(mVar, bArr.length, vl8Var);
        }
    }

    private final Charset charset() {
        Charset a2;
        m contentType = contentType();
        return (contentType == null || (a2 = contentType.a(emb.b)) == null) ? emb.b : a2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(izs<? super bn8, ? extends T> izsVar, izs<? super T, Integer> izsVar2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(k0.a(contentLength, "Cannot buffer entire body for content length: "));
        }
        bn8 source = source();
        try {
            T invoke = izsVar.invoke(source);
            ro.e(source, null);
            int intValue = izsVar2.invoke(invoke).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return invoke;
            }
            StringBuilder a2 = eq0.a(intValue, "Content-Length (", ") and stream length (", contentLength);
            a2.append(") disagree");
            throw new IOException(a2.toString());
        } finally {
        }
    }

    public static final v create(String str, m mVar) {
        Companion.getClass();
        return b.a(str, mVar);
    }

    public final InputStream byteStream() {
        return source().f4();
    }

    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(k0.a(contentLength, "Cannot buffer entire body for content length: "));
        }
        bn8 source = source();
        try {
            ByteString H0 = source.H0();
            source.close();
            int n = H0.n();
            if (contentLength == -1 || contentLength == n) {
                return H0;
            }
            StringBuilder a2 = eq0.a(n, "Content-Length (", ") and stream length (", contentLength);
            a2.append(") disagree");
            throw new IOException(a2.toString());
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(k0.a(contentLength, "Cannot buffer entire body for content length: "));
        }
        bn8 source = source();
        try {
            byte[] V2 = source.V2();
            source.close();
            int length = V2.length;
            if (contentLength == -1 || contentLength == length) {
                return V2;
            }
            StringBuilder a2 = eq0.a(length, "Content-Length (", ") and stream length (", contentLength);
            a2.append(") disagree");
            throw new IOException(a2.toString());
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x2r0.c(source());
    }

    public abstract long contentLength();

    public abstract m contentType();

    public abstract bn8 source();

    public final String string() throws IOException {
        bn8 source = source();
        try {
            String p3 = source.p3(x2r0.r(source, charset()));
            source.close();
            return p3;
        } finally {
        }
    }

    public static final v create(byte[] bArr, m mVar) {
        Companion.getClass();
        return b.b(bArr, mVar);
    }

    @ozl
    public static final v create(m mVar, ByteString byteString) {
        Companion.getClass();
        vl8 vl8Var = new vl8();
        vl8Var.H(byteString);
        return new w(mVar, byteString.n(), vl8Var);
    }

    public static final v create(ByteString byteString, m mVar) {
        Companion.getClass();
        vl8 vl8Var = new vl8();
        vl8Var.H(byteString);
        return new w(mVar, byteString.n(), vl8Var);
    }

    @ozl
    public static final v create(m mVar, long j, bn8 bn8Var) {
        Companion.getClass();
        return new w(mVar, j, bn8Var);
    }

    public static final v create(bn8 bn8Var, m mVar, long j) {
        Companion.getClass();
        return new w(mVar, j, bn8Var);
    }

    @ozl
    public static final v create(m mVar, String str) {
        Companion.getClass();
        return b.a(str, mVar);
    }

    @ozl
    public static final v create(m mVar, byte[] bArr) {
        Companion.getClass();
        return b.b(bArr, mVar);
    }
}
