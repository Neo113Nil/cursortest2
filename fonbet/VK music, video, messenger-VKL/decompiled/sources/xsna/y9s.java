package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingRequestListener2.kt */
/* loaded from: classes.dex */
public final class y9s implements w7g0 {
    public final ArrayList a;

    public y9s(Set<? extends w7g0> set) {
        if (set == null) {
            this.a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.a = arrayList;
        j5g.W(set, arrayList);
    }

    @Override // xsna.w7g0
    public final void a(ozi0 ozi0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).a(ozi0Var);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final void b(uhd0 uhd0Var, String str, Throwable th, Map<String, String> map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).b(uhd0Var, str, th, map);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // xsna.w7g0
    public final void c(uhd0 uhd0Var, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).c(uhd0Var, th);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // xsna.w7g0
    public final void d(uhd0 uhd0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).d(uhd0Var);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final void e(uhd0 uhd0Var, String str, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).e(uhd0Var, str, z);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final void f(uhd0 uhd0Var, String str, Map<String, String> map) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).f(uhd0Var, str, map);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final void g(uhd0 uhd0Var, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).g(uhd0Var, str);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // xsna.w7g0
    public final void h(uhd0 uhd0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).h(uhd0Var);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final boolean i(uhd0 uhd0Var, String str) {
        ArrayList arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((w7g0) it.next()).i(uhd0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.yhd0
    public final void j(uhd0 uhd0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).j(uhd0Var);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // xsna.yhd0
    public final void k(uhd0 uhd0Var, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((w7g0) it.next()).k(uhd0Var, str);
            } catch (Exception e) {
                ahq.e("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }
}
