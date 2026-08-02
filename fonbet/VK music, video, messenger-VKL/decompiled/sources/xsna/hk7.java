package xsna;

import android.widget.TextView;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes5.dex */
public final class hk7 implements gzs<s3q0> {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ ik7 e;

    public hk7(TextView textView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ik7 ik7Var) {
        this.b = textView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = ik7Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            TextView textView2 = this.e.p;
            if (textView2.getPaint().getShader() != null) {
                textView2.getPaint().setShader(zk7.b(Integer.valueOf(measuredWidth)));
                textView2.invalidate();
            }
        }
        return s3q0.a;
    }
}
