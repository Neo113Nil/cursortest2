package xsna;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class ljq implements com.vk.im.ui.components.msg_search.vc.a {
    public final String b;

    public ljq(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljq) && epx.f(this.b, ((ljq) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FakeContactItem(phone="), this.b, ')');
    }
}
