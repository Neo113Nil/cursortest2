package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.a;
import okhttp3.TlsVersion;

/* loaded from: classes9.dex */
public final class o6u {
    public final TlsVersion a;
    public final gtb b;
    public final List c;
    public final i3y d;

    public o6u(TlsVersion tlsVersion, gtb gtbVar, List list, sls slsVar) {
        this.a = tlsVersion;
        this.b = gtbVar;
        this.c = list;
        this.d = a.a(new ueo(1, slsVar));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o6u)) {
            return false;
        }
        o6u o6uVar = (o6u) obj;
        return o6uVar.a == this.a && o6uVar.b == this.b && jl40.l(o6uVar.a(), a()) && o6uVar.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> a = a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (Certificate certificate : a) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        return smw0.m(sb, arrayList2, '}');
    }
}
