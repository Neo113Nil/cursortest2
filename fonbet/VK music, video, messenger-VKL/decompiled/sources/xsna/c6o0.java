package xsna;

/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class c6o0 {
    public final String a;
    public final Class<? extends cbn<?, ?>> b;

    public c6o0(String str, Class<? extends cbn<?, ?>> cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6o0)) {
            return false;
        }
        c6o0 c6o0Var = (c6o0) obj;
        return epx.f(this.a, c6o0Var.a) && epx.f(this.b, c6o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaskFinishedArgs(taskId=" + this.a + ", taskClass=" + this.b + ")";
    }
}
