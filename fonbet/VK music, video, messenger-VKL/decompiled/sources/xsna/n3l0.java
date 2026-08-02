package xsna;

import android.widget.LinearLayout;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class n3l0 implements gzs<s3q0> {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ tn20 e;

    public n3l0(LinearLayout linearLayout, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, tn20 tn20Var) {
        this.b = linearLayout;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = tn20Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        LinearLayout linearLayout = this.b;
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            this.e.invoke(Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        }
        return s3q0.a;
    }
}
