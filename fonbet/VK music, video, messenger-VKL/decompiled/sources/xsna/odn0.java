package xsna;

import android.view.View;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class odn0 implements gzs<s3q0> {
    public final /* synthetic */ View b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ ii4 e;

    public odn0(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ii4 ii4Var) {
        this.b = view;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = ii4Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        View view = this.b;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            this.e.run();
        }
        return s3q0.a;
    }
}
