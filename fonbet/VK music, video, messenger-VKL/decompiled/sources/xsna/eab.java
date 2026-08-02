package xsna;

import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class eab implements gzs<s3q0> {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ w9b e;

    public eab(TextView textView, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, w9b w9bVar) {
        this.b = textView;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = w9bVar;
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
            w9b w9bVar = this.e;
            TextView textView2 = w9bVar.y;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setPivotX(measuredWidth / 2.0f);
            TextView textView3 = w9bVar.y;
            (textView3 != null ? textView3 : null).setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return s3q0.a;
    }
}
