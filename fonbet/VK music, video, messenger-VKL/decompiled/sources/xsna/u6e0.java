package xsna;

import io.opentelemetry.api.trace.StatusCode;

/* compiled from: PropagatedSpan.java */
/* loaded from: classes11.dex */
public final class u6e0 implements ohk0 {
    public static final u6e0 b = new u6e0(kpw.a);
    public final qhk0 a;

    public u6e0(qhk0 qhk0Var) {
        this.a = qhk0Var;
    }

    @Override // xsna.ohk0
    public final qhk0 i() {
        return this.a;
    }

    public final String toString() {
        return "PropagatedSpan{" + this.a + '}';
    }

    @Override // xsna.ohk0
    public final void end() {
    }

    @Override // xsna.ohk0
    public final void c(String str) {
    }

    @Override // xsna.ohk0
    public final void d(jk3 jk3Var) {
    }

    @Override // xsna.ohk0
    public final void f(Throwable th) {
    }

    @Override // xsna.ohk0
    public final ohk0 g(String str) {
        return this;
    }

    @Override // xsna.ohk0
    public final void l(StatusCode statusCode) {
    }

    @Override // xsna.ohk0
    public final ohk0 e(StatusCode statusCode, String str) {
        return this;
    }

    @Override // xsna.ohk0
    /* renamed from: h */
    public final <T> ohk0 a(i94<T> i94Var, T t) {
        return this;
    }

    @Override // xsna.ohk0
    public final ohk0 j(String str, q94 q94Var) {
        return this;
    }

    @Override // xsna.ohk0
    public final void m(long j, String str) {
    }

    @Override // xsna.ohk0
    public final ohk0 n(Throwable th, q94 q94Var) {
        return this;
    }

    @Override // xsna.ohk0
    public final void setAttribute(String str, String str2) {
    }
}
