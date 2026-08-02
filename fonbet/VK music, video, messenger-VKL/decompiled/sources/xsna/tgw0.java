package xsna;

/* compiled from: VoipCallByPhoneViewState.kt */
/* loaded from: classes7.dex */
public final class tgw0 implements ao50 {
    public final fi50 a;

    public tgw0(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgw0) && this.a.equals(((tgw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipCallByPhoneViewState(scene="), this.a, ')');
    }
}
