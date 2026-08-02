package xsna;

import com.google.android.flexbox.FlexboxLayout;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class o3l0 implements gzs<s3q0> {
    public final /* synthetic */ FlexboxLayout b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ tn20 e;

    public o3l0(FlexboxLayout flexboxLayout, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, tn20 tn20Var) {
        this.b = flexboxLayout;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = tn20Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        FlexboxLayout flexboxLayout = this.b;
        int measuredWidth = flexboxLayout.getMeasuredWidth();
        int measuredHeight = flexboxLayout.getMeasuredHeight();
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
