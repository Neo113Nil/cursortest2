package xsna;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: RealConnection.kt */
/* loaded from: classes8.dex */
public final class i8f0 extends Lambda implements gzs<List<? extends X509Certificate>> {
    final /* synthetic */ g8f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8f0(g8f0 g8f0Var) {
        super(0);
        this.this$0 = g8f0Var;
    }

    @Override // xsna.gzs
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> c = this.this$0.e.c();
        ArrayList arrayList = new ArrayList(c5g.u(c, 10));
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
