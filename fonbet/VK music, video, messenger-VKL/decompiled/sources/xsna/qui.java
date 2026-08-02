package xsna;

/* compiled from: CompositeSpanPerformanceReporter.kt */
/* loaded from: classes5.dex */
public class qui<Span, MeasuringPoint> implements eik0<Span, MeasuringPoint> {
    public final eik0<Span, MeasuringPoint>[] a;

    public qui(eik0<Span, MeasuringPoint>... eik0VarArr) {
        this.a = eik0VarArr;
    }

    @Override // xsna.eik0
    public final void b() {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.b();
        }
    }

    @Override // xsna.eik0
    public final void c(Object obj) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.c(obj);
        }
    }

    @Override // xsna.eik0
    public final void d(Object obj) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.d(obj);
        }
    }

    @Override // xsna.eik0
    public final void f(Span span, Object obj) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.f(span, obj);
        }
    }

    @Override // xsna.eik0
    public final void g(String str) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.g(str);
        }
    }

    @Override // xsna.eik0
    public final boolean h() {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            if (eik0Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.eik0
    public final void m(String str) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.m(str);
        }
    }

    @Override // xsna.eik0
    public final void n(Object obj) {
        for (eik0<Span, MeasuringPoint> eik0Var : this.a) {
            eik0Var.n(obj);
        }
    }
}
