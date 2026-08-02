package androidx.view.fragment;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.pq60;
import defpackage.tls;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements pq60, jms {
    public final /* synthetic */ tls a;

    public c(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.pq60
    public final /* synthetic */ void a(Object obj) {
        ((FragmentNavigator$attachObservers$1) this.a).invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof pq60) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
