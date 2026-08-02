package xsna;

import android.view.View;

/* compiled from: MotionLayoutPerformanceImpl.kt */
/* loaded from: classes7.dex */
public final class wa30 {
    public final View a;
    public va30 b;

    public wa30(View view, of ofVar) {
        this.a = view;
        ofVar.W2(new a());
    }

    /* compiled from: MotionLayoutPerformanceImpl.kt */
    public static final class a implements bb30 {
        public a() {
        }

        @Override // xsna.bb30
        public final void a(nb30 nb30Var) {
            va30 va30Var = wa30.this.b;
            if (va30Var != null) {
                va30Var.J2();
            }
        }

        @Override // xsna.bb30
        public final void b(nb30 nb30Var, nb30 nb30Var2) {
            va30 va30Var = wa30.this.b;
            if (va30Var != null) {
                va30Var.Y2();
            }
        }

        @Override // xsna.bb30
        public final void d(nb30 nb30Var, nb30 nb30Var2) {
        }

        @Override // xsna.bb30
        public final void c(nb30 nb30Var, nb30 nb30Var2, float f) {
        }
    }
}
