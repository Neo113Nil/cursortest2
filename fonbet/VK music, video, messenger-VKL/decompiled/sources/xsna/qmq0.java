package xsna;

/* compiled from: UserProfileParamsComponent.kt */
/* loaded from: classes5.dex */
public final class qmq0 implements l9i {
    public final htq0 a;

    public qmq0(htq0 htq0Var) {
        this.a = htq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmq0) && epx.f(this.a, ((qmq0) obj).a);
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserProfileComponentParams(userProfileParams=" + this.a + ')';
    }
}
