package xsna;

/* compiled from: AnonymousQueueDelegateSubscribeProviderImpl.kt */
/* loaded from: classes7.dex */
public final class dvm0 {
    public final yqe0 a;
    public final io.reactivex.rxjava3.core.q<fjw0> b;

    public dvm0(yqe0 yqe0Var, io.reactivex.rxjava3.core.q<fjw0> qVar) {
        this.a = yqe0Var;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvm0)) {
            return false;
        }
        dvm0 dvm0Var = (dvm0) obj;
        return epx.f(this.a, dvm0Var.a) && epx.f(this.b, dvm0Var.b);
    }

    public final int hashCode() {
        yqe0 yqe0Var = this.a;
        return this.b.hashCode() + ((yqe0Var == null ? 0 : yqe0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SubscribeAnonymousParams(queueAnonymInfo=" + this.a + ", callStatesObservable=" + this.b + ')';
    }
}
