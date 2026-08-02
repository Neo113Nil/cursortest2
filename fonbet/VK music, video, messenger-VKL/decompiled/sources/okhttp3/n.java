package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.k;
import okhttp3.m;
import okhttp3.t;
import okio.ByteString;
import ru.ok.android.commons.http.Http;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.an8;
import xsna.emb;
import xsna.fw3;
import xsna.vl8;
import xsna.x2r0;

/* compiled from: MultipartBody.kt */
/* loaded from: classes8.dex */
public final class n extends t {
    public static final m g;
    public static final m h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public final ByteString c;
    public final List<c> d;
    public final m e;
    public long f;

    /* compiled from: MultipartBody.kt */
    public static final class a {
        public final ByteString a;
        public m b;
        public final ArrayList c;

        public a() {
            this(0);
        }

        public final void a(String str, String str2) {
            t.Companion.getClass();
            this.c.add(c.a.a(str, null, t.a.a(str2, null)));
        }

        public final void b(String str, String str2, t tVar) {
            this.c.add(c.a.a(str, str2, tVar));
        }

        public final n c() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new n(this.a, this.b, x2r0.w(arrayList));
        }

        public final void d(m mVar) {
            if (mVar.b.equals("multipart")) {
                this.b = mVar;
            } else {
                throw new IllegalArgumentException(("multipart != " + mVar).toString());
            }
        }

        public a(int i) {
            String uuid = UUID.randomUUID().toString();
            ByteString byteString = new ByteString(uuid.getBytes(emb.b));
            byteString.c = uuid;
            this.a = byteString;
            this.b = n.g;
            this.c = new ArrayList();
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class b {
        public static void a(String str, StringBuilder sb) {
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class c {
        public final k a;
        public final t b;

        /* compiled from: MultipartBody.kt */
        public static final class a {
            public static c a(String str, String str2, t tVar) {
                StringBuilder e = fw3.e("form-data; name=");
                m mVar = n.g;
                b.a(str, e);
                if (str2 != null) {
                    e.append("; filename=");
                    b.a(str2, e);
                }
                String sb = e.toString();
                k.a aVar = new k.a();
                for (int i = 0; i < 19; i++) {
                    char charAt = Http.Header.CONTENT_DISPOSITION.charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(x2r0.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), Http.Header.CONTENT_DISPOSITION).toString());
                    }
                }
                aVar.d(Http.Header.CONTENT_DISPOSITION, sb);
                k e2 = aVar.e();
                if (e2.a("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (e2.a(Http.Header.CONTENT_LENGTH) == null) {
                    return new c(e2, tVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public c(k kVar, t tVar) {
            this.a = kVar;
            this.b = tVar;
        }
    }

    static {
        Pattern pattern = m.e;
        g = m.a.a("multipart/mixed");
        m.a.a("multipart/alternative");
        m.a.a("multipart/digest");
        m.a.a("multipart/parallel");
        h = m.a.a("multipart/form-data");
        i = new byte[]{58, 32};
        j = new byte[]{AmfConstants.TYPE_UNSUPPORTED_MARKER, 10};
        k = new byte[]{45, 45};
    }

    public n(ByteString byteString, m mVar, List<c> list) {
        this.c = byteString;
        this.d = list;
        Pattern pattern = m.e;
        this.e = m.a.a(mVar + "; boundary=" + byteString.A());
        this.f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(an8 an8Var, boolean z) throws IOException {
        vl8 vl8Var;
        an8 an8Var2;
        if (z) {
            an8Var2 = new vl8();
            vl8Var = an8Var2;
        } else {
            vl8Var = 0;
            an8Var2 = an8Var;
        }
        List<c> list = this.d;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            ByteString byteString = this.c;
            byte[] bArr = k;
            byte[] bArr2 = j;
            if (i2 >= size) {
                an8Var2.write(bArr);
                an8Var2.P0(byteString);
                an8Var2.write(bArr);
                an8Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                long j3 = j2 + vl8Var.c;
                vl8Var.m();
                return j3;
            }
            c cVar = list.get(i2);
            k kVar = cVar.a;
            t tVar = cVar.b;
            an8Var2.write(bArr);
            an8Var2.P0(byteString);
            an8Var2.write(bArr2);
            int size2 = kVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                an8Var2.y1(kVar.c(i3)).write(i).y1(kVar.f(i3)).write(bArr2);
            }
            m contentType = tVar.contentType();
            if (contentType != null) {
                an8Var2.y1("Content-Type: ").y1(contentType.a).write(bArr2);
            }
            long contentLength = tVar.contentLength();
            if (contentLength != -1) {
                an8Var2.y1("Content-Length: ").v0(contentLength).write(bArr2);
            } else if (z) {
                vl8Var.m();
                return -1L;
            }
            an8Var2.write(bArr2);
            if (z) {
                j2 += contentLength;
            } else {
                tVar.writeTo(an8Var2);
            }
            an8Var2.write(bArr2);
            i2++;
        }
    }

    @Override // okhttp3.t
    public final long contentLength() throws IOException {
        long j2 = this.f;
        if (j2 != -1) {
            return j2;
        }
        long a2 = a(null, true);
        this.f = a2;
        return a2;
    }

    @Override // okhttp3.t
    public final m contentType() {
        return this.e;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) throws IOException {
        a(an8Var, false);
    }
}
