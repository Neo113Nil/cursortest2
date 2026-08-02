package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.an10;

/* loaded from: classes10.dex */
public final class dq0 {
    public final rm3 a;

    public /* synthetic */ dq0() {
        this(new rm3());
    }

    public final cq0 a(View view) {
        int i;
        this.a.getClass();
        RectF rectF = null;
        if (rm3.a(view)) {
            i = om3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float a = om3.a(context, rect.left);
                float b = an10.b(rect.top / context.getResources().getDisplayMetrics().density);
                float b2 = an10.b(rect.right / context.getResources().getDisplayMetrics().density);
                float b3 = an10.b(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f = b3 - b;
                if (b2 - a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    rectF = new RectF(a, b, b2, b3);
                }
            }
        } else {
            i = 0;
        }
        return new cq0(i, rectF);
    }

    public dq0(rm3 rm3Var) {
        this.a = rm3Var;
    }
}
