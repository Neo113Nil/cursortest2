package xsna;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class dab implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dab(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Object obj, int i) {
        this.b = i;
        this.e = view;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.f = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                w9b w9bVar = (w9b) this.f;
                TextView textView = (TextView) this.e;
                int measuredWidth = textView.getMeasuredWidth();
                int measuredHeight = textView.getMeasuredHeight();
                Ref$IntRef ref$IntRef = this.c;
                int i = ref$IntRef.element;
                Ref$IntRef ref$IntRef2 = this.d;
                if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
                    ref$IntRef.element = measuredWidth;
                    ref$IntRef2.element = measuredHeight;
                    TextView textView2 = w9bVar.q;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setPivotX(measuredWidth / 2.0f);
                    TextView textView3 = w9bVar.q;
                    (textView3 != null ? textView3 : null).setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.e;
                int measuredWidth2 = linearLayout.getMeasuredWidth();
                int measuredHeight2 = linearLayout.getMeasuredHeight();
                Ref$IntRef ref$IntRef3 = this.c;
                int i2 = ref$IntRef3.element;
                Ref$IntRef ref$IntRef4 = this.d;
                if (i2 != measuredWidth2 || ref$IntRef4.element != measuredHeight2) {
                    ref$IntRef3.element = measuredWidth2;
                    ref$IntRef4.element = measuredHeight2;
                    f7w0 f7w0Var = (f7w0) this.f;
                    f7w0Var.i6(measuredWidth2, f7w0Var.s);
                }
                break;
        }
        return s3q0.a;
    }
}
