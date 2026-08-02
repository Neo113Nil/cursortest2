package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes11.dex */
public final class gqa {
    public static final gqa c = new gqa(j5g.S0(new ArrayList()), null);
    public final Set<b> a;
    public final fqa b;

    /* compiled from: CertificatePinner.kt */
    public static final class a {
        public static String a(X509Certificate x509Certificate) {
            if (x509Certificate == null) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + ByteString.a.c(x509Certificate.getPublicKey().getEncoded()).l("SHA-256").h();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes8.dex */
    public static final class b {
        public static boolean a(String str) {
            if (brm0.B(null, "**.", false)) {
                throw null;
            }
            if (brm0.B(null, "*.", false)) {
                throw null;
            }
            return str.equals(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public gqa(Set<b> set, fqa fqaVar) {
        this.a = set;
        this.b = fqaVar;
    }

    public final void a(String str, gzs<? extends List<? extends X509Certificate>> gzsVar) {
        Set<b> set = this.a;
        List<b> list = EmptyList.b;
        for (Object obj : set) {
            ((b) obj).getClass();
            if (b.a(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                ttp0.b(list).add(obj);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = gzsVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((b) it.next()).getClass();
                throw new AssertionError("unsupported hashAlgorithm: null");
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(a.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (b bVar : list) {
            sb.append("\n    ");
            sb.append(bVar);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gqa)) {
            return false;
        }
        gqa gqaVar = (gqa) obj;
        return epx.f(gqaVar.a, this.a) && epx.f(gqaVar.b, this.b);
    }

    public final int hashCode() {
        int b2 = fw3.b(1517, 41, this.a);
        fqa fqaVar = this.b;
        return b2 + (fqaVar != null ? fqaVar.hashCode() : 0);
    }
}
