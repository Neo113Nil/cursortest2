package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import okhttp3.TlsVersion;
import xsna.bpn0;
import xsna.c5g;
import xsna.epx;
import xsna.gzs;
import xsna.x2r0;

/* compiled from: Handshake.kt */
/* loaded from: classes8.dex */
public final class j {
    public final TlsVersion a;
    public final e b;
    public final List<Certificate> c;
    public final bpn0 d;

    /* compiled from: Handshake.kt */
    public static final class a {

        /* compiled from: Handshake.kt */
        /* renamed from: okhttp3.j$a$a, reason: collision with other inner class name */
        public static final class C2168a extends Lambda implements gzs<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2168a(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // xsna.gzs
            public final List<? extends Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        public static j a(SSLSession sSLSession) throws IOException {
            List list;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            e b = e.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.Companion.getClass();
            TlsVersion a = TlsVersion.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                list = peerCertificates != null ? x2r0.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.b;
            } catch (SSLPeerUnverifiedException unused) {
                list = EmptyList.b;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new j(a, b, localCertificates != null ? x2r0.k(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.b, new C2168a(list));
        }
    }

    /* compiled from: Handshake.kt */
    public static final class b extends Lambda implements gzs<List<? extends Certificate>> {
        final /* synthetic */ gzs<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(gzs<? extends List<? extends Certificate>> gzsVar) {
            super(0);
            this.$peerCertificatesFn = gzsVar;
        }

        @Override // xsna.gzs
        public final List<? extends Certificate> invoke() {
            try {
                return this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return EmptyList.b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(TlsVersion tlsVersion, e eVar, List<? extends Certificate> list, gzs<? extends List<? extends Certificate>> gzsVar) {
        this.a = tlsVersion;
        this.b = eVar;
        this.c = list;
        this.d = new bpn0(new b(gzsVar));
    }

    public final e a() {
        return this.b;
    }

    public final List<Certificate> b() {
        return this.c;
    }

    public final List<Certificate> c() {
        return (List) this.d.getValue();
    }

    public final TlsVersion d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.a == this.a && epx.f(jVar.b, this.b) && epx.f(jVar.c(), c()) && epx.f(jVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((c().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> c = c();
        ArrayList arrayList = new ArrayList(c5g.u(c, 10));
        for (Certificate certificate : c) {
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
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        return io.reactivex.rxjava3.internal.operators.mixed.j.b('}', sb, arrayList2);
    }
}
