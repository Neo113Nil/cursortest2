package xsna;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes8.dex */
public final class hqa extends Lambda implements gzs<List<? extends X509Certificate>> {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List<Certificate> $peerCertificates;
    final /* synthetic */ gqa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hqa(gqa gqaVar, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = gqaVar;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // xsna.gzs
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> list;
        fqa fqaVar = this.this$0.b;
        if (fqaVar != null) {
            list = fqaVar.d(this.$hostname, this.$peerCertificates);
        } else {
            list = this.$peerCertificates;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
