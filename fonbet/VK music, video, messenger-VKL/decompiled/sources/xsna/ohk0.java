package xsna;

import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.trace.StatusCode;
import java.util.function.BiConsumer;

/* compiled from: Span.java */
/* loaded from: classes11.dex */
public interface ohk0 extends vpw {
    static ohk0 current() {
        ohk0 ohk0Var = (ohk0) wmj.current().c(vhk0.a);
        return ohk0Var == null ? u6e0.b : ohk0Var;
    }

    static ohk0 o(wmj wmjVar) {
        if (wmjVar == null) {
            i03.a();
            return u6e0.b;
        }
        ohk0 ohk0Var = (ohk0) wmjVar.c(vhk0.a);
        return ohk0Var == null ? u6e0.b : ohk0Var;
    }

    @Override // xsna.vpw
    default wmj b(wmj wmjVar) {
        return wmjVar.a(vhk0.a, this);
    }

    default void c(String str) {
        j(str, jk3.e);
    }

    default void d(jk3 jk3Var) {
        if (jk3Var.isEmpty()) {
            return;
        }
        jk3Var.forEach(new BiConsumer() { // from class: xsna.nhk0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ohk0.this.a((i94) obj, obj2);
            }
        });
    }

    ohk0 e(StatusCode statusCode, String str);

    void end();

    default void f(Throwable th) {
        n(th, jk3.e);
    }

    ohk0 g(String str);

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    <T> ohk0 a(i94<T> i94Var, T t);

    qhk0 i();

    ohk0 j(String str, q94 q94Var);

    default void k(i94 i94Var, int i) {
        a(i94Var, Long.valueOf(i));
    }

    default void l(StatusCode statusCode) {
        e(statusCode, "");
    }

    default void m(long j, String str) {
        a(xfx.a(AttributeType.LONG, str), Long.valueOf(j));
    }

    ohk0 n(Throwable th, q94 q94Var);

    default void setAttribute(String str, String str2) {
        a(xfx.a(AttributeType.STRING, str), str2);
    }
}
