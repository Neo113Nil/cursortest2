package defpackage;

import defpackage.yp6;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class na7 {
    public static final String k;
    public static final String l;
    public final kwu a;
    public final meu b;
    public final String c;
    public final Protocol d;
    public final int e;
    public final String f;
    public final meu g;
    public final o6u h;
    public final long i;
    public final long j;

    static {
        d72 d72Var = dvc0.a;
        dvc0.a.getClass();
        k = "OkHttp-Sent-Millis";
        dvc0.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public na7(y9t0 y9t0Var) {
        kwu kwuVar;
        TlsVersion tlsVersion;
        try {
            jci0 jci0Var = new jci0(y9t0Var);
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            try {
                jwu jwuVar = new jwu();
                jwuVar.i(null, j1);
                kwuVar = jwuVar.e();
            } catch (IllegalArgumentException unused) {
                kwuVar = null;
            }
            if (kwuVar == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(j1));
                d72 d72Var = dvc0.a;
                dvc0.a.getClass();
                kva1.d();
                throw iOException;
            }
            this.a = kwuVar;
            this.c = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            keu keuVar = new keu();
            int W = q5z.W(jci0Var);
            for (int i = 0; i < W; i++) {
                keuVar.b(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
            }
            this.b = keuVar.d();
            suu O = rzo.O(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
            this.d = (Protocol) O.d;
            this.e = O.b;
            this.f = (String) O.c;
            keu keuVar2 = new keu();
            int W2 = q5z.W(jci0Var);
            for (int i2 = 0; i2 < W2; i2++) {
                keuVar2.b(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
            }
            String str = k;
            String e = keuVar2.e(str);
            String str2 = l;
            String e2 = keuVar2.e(str2);
            keuVar2.f(str);
            keuVar2.f(str2);
            this.i = e != null ? Long.parseLong(e) : 0L;
            this.j = e2 != null ? Long.parseLong(e2) : 0L;
            this.g = keuVar2.d();
            if (this.a.f()) {
                String j12 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                if (j12.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + j12 + OpenList.CHAR_QUOTE);
                }
                gtb o = gtb.b.o(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
                List a = a(jci0Var);
                List a2 = a(jci0Var);
                if (jci0Var.I1()) {
                    tlsVersion = TlsVersion.SSL_3_0;
                } else {
                    jjz0 jjz0Var = TlsVersion.Companion;
                    String j13 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                    jjz0Var.getClass();
                    tlsVersion = jjz0.a(j13);
                }
                this.h = new o6u(tlsVersion, o, bg61.k(a2), new oac(bg61.k(a), 1));
            } else {
                this.h = null;
            }
            y9t0Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(y9t0Var, th);
                throw th2;
            }
        }
    }

    public static List a(jci0 jci0Var) {
        int W = q5z.W(jci0Var);
        if (W == -1) {
            return EmptyList.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            ArrayList arrayList = new ArrayList(W);
            for (int i = 0; i < W; i++) {
                String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                yp6 yp6Var = new yp6();
                ByteString q = cvw.q(j1);
                if (q == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                yp6Var.b0(q);
                arrayList.add(certificateFactory.generateCertificate(new wp6(yp6Var, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            ny61.v(e.getMessage());
            return null;
        }
    }

    public static void b(ici0 ici0Var, List list) {
        try {
            ici0Var.d0(list.size());
            ici0Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                yp6.a aVar = j.a;
                int length = encoded.length;
                j.b(encoded.length, 0L, length);
                ici0Var.p1(new ByteString(f73.m(0, length, encoded)).a());
                ici0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            ny61.v(e.getMessage());
        }
    }

    public final void c(lxj lxjVar) {
        kwu kwuVar = this.a;
        o6u o6uVar = this.h;
        meu meuVar = this.g;
        meu meuVar2 = this.b;
        ici0 ici0Var = new ici0(lxjVar.h(0));
        try {
            ici0Var.p1(kwuVar.i);
            ici0Var.writeByte(10);
            ici0Var.p1(this.c);
            ici0Var.writeByte(10);
            ici0Var.d0(meuVar2.size());
            ici0Var.writeByte(10);
            int size = meuVar2.size();
            for (int i = 0; i < size; i++) {
                ici0Var.p1(meuVar2.b(i));
                ici0Var.p1(Extension.COLON_SPACE);
                ici0Var.p1(meuVar2.f(i));
                ici0Var.writeByte(10);
            }
            Protocol protocol = this.d;
            int i2 = this.e;
            String str = this.f;
            StringBuilder sb = new StringBuilder();
            if (protocol == Protocol.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(HexString.CHAR_SPACE);
            sb.append(i2);
            sb.append(HexString.CHAR_SPACE);
            sb.append(str);
            ici0Var.p1(sb.toString());
            ici0Var.writeByte(10);
            ici0Var.d0(meuVar.size() + 2);
            ici0Var.writeByte(10);
            int size2 = meuVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ici0Var.p1(meuVar.b(i3));
                ici0Var.p1(Extension.COLON_SPACE);
                ici0Var.p1(meuVar.f(i3));
                ici0Var.writeByte(10);
            }
            ici0Var.p1(k);
            ici0Var.p1(Extension.COLON_SPACE);
            ici0Var.d0(this.i);
            ici0Var.writeByte(10);
            ici0Var.p1(l);
            ici0Var.p1(Extension.COLON_SPACE);
            ici0Var.d0(this.j);
            ici0Var.writeByte(10);
            if (kwuVar.f()) {
                ici0Var.writeByte(10);
                ici0Var.p1(o6uVar.b.a);
                ici0Var.writeByte(10);
                b(ici0Var, o6uVar.a());
                b(ici0Var, o6uVar.c);
                ici0Var.p1(o6uVar.a.getJavaName());
                ici0Var.writeByte(10);
            }
            ici0Var.close();
        } finally {
        }
    }

    public na7(kvj0 kvj0Var) {
        meu d;
        d5j0 d5j0Var = kvj0Var.a;
        this.a = d5j0Var.a;
        meu meuVar = kvj0Var.B.a.c;
        meu meuVar2 = kvj0Var.y;
        Set o0 = q5z.o0(meuVar2);
        if (o0.isEmpty()) {
            d = meu.b;
        } else {
            keu keuVar = new keu();
            int size = meuVar.size();
            for (int i = 0; i < size; i++) {
                String b = meuVar.b(i);
                if (o0.contains(b)) {
                    keuVar.a(b, meuVar.f(i));
                }
            }
            d = keuVar.d();
        }
        this.b = d;
        this.c = d5j0Var.b;
        this.d = kvj0Var.b;
        this.e = kvj0Var.w;
        this.f = kvj0Var.c;
        this.g = meuVar2;
        this.h = kvj0Var.x;
        this.i = kvj0Var.E;
        this.j = kvj0Var.F;
    }
}
