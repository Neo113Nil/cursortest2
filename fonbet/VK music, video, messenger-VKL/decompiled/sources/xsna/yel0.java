package xsna;

import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class yel0 implements gzs<s3q0> {
    public final /* synthetic */ rv40 b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ rv40 e;
    public final /* synthetic */ int f;

    public yel0(rv40 rv40Var, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, rv40 rv40Var2, int i) {
        this.b = rv40Var;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = rv40Var2;
        this.f = i;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        rv40 rv40Var = this.b;
        int measuredWidth = rv40Var.getMeasuredWidth();
        int measuredHeight = rv40Var.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            f4m.q(measuredHeight + this.f, this.e);
        }
        return s3q0.a;
    }
}
