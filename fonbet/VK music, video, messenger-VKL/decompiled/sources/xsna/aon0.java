package xsna;

/* compiled from: SwitcherUserDataModel.kt */
/* loaded from: classes6.dex */
public final class aon0 {
    public final com.vk.superapp.multiaccount.api.f a;
    public final l0r0 b;

    public aon0(com.vk.superapp.multiaccount.api.f fVar, l0r0 l0r0Var) {
        this.a = fVar;
        this.b = l0r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aon0)) {
            return false;
        }
        aon0 aon0Var = (aon0) obj;
        return epx.f(this.a, aon0Var.a) && epx.f(this.b, aon0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitcherUserDataModel(user=" + this.a + ", userViewState=" + this.b + ')';
    }
}
