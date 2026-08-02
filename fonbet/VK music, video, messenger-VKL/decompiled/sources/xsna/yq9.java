package xsna;

import androidx.compose.ui.graphics.Path;

/* compiled from: Canvas.kt */
/* loaded from: classes11.dex */
public interface yq9 {
    void a();

    default void b(zhf0 zhf0Var) {
        c(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d, 1);
    }

    void c(float f, float f2, float f3, float f4, int i);

    void d(float f, long j, fg90 fg90Var);

    void e();

    void f();

    void g(float f, float f2);

    void h(float f, float f2, float f3, float f4, fg90 fg90Var);

    void i(float f, float f2, float f3, float f4, fg90 fg90Var);

    void j(Path path, int i);

    void k(Path path, fg90 fg90Var);

    void l(float f, float f2, float f3, float f4, float f5, float f6, fg90 fg90Var);

    void m(float[] fArr);

    default void n(zhf0 zhf0Var, va2 va2Var) {
        i(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d, va2Var);
    }

    void o(float f, float f2, float f3, float f4, float f5, float f6, fg90 fg90Var);

    void p(float f, float f2);

    void q(agw agwVar, long j, long j2, long j3, long j4, fg90 fg90Var);

    void r(zhf0 zhf0Var, fg90 fg90Var);

    void s();

    void t(float f);

    void u(long j, long j2, fg90 fg90Var);

    void v(agw agwVar, long j, fg90 fg90Var);
}
