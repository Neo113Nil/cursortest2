package xsna;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class n1u implements com.vk.im.ui.components.msg_search.vc.a {
    public final gyh0<qtd0> b;

    public n1u(gyh0<qtd0> gyh0Var) {
        this.b = gyh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1u) && epx.f(this.b, ((n1u) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.a.id());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GlobalPeerItem(searchResultItem=" + this.b + ')';
    }
}
