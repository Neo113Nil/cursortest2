package xsna;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.ror;

/* compiled from: GalvitaFlexDecoration.kt */
/* loaded from: classes4.dex */
public final class r5t implements ror.b {
    public final xso0 a;
    public final RectF b = new RectF();

    public r5t(float f, float f2) {
        this.a = new xso0(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24);
    }

    @Override // xsna.ror.b
    public final void e(View view, Canvas canvas) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ror.c cVar = layoutParams instanceof ror.c ? (ror.c) layoutParams : null;
        if (cVar == null) {
            return;
        }
        int save = canvas.save();
        float left = view.getLeft();
        float top = view.getTop();
        float right = view.getRight();
        float bottom = view.getBottom();
        RectF rectF = this.b;
        rectF.set(left, top, right, bottom);
        rectF.offset(view.getTranslationX(), view.getTranslationY());
        canvas.clipRect(rectF);
        this.a.b(canvas, rectF, cVar.a);
        canvas.restoreToCount(save);
    }

    @Override // xsna.ror.b
    public final void f(Canvas canvas, ror rorVar) {
        int childCount = rorVar.getChildCount();
        if (childCount == 0) {
            return;
        }
        int save = canvas.save();
        int paddingLeft = rorVar.getPaddingLeft();
        int paddingTop = rorVar.getPaddingTop();
        canvas.clipRect(rorVar.getLeft() + paddingLeft, rorVar.getTop() + paddingTop, rorVar.getRight() + paddingLeft, rorVar.getBottom() + paddingTop);
        for (int i = 0; i < childCount; i++) {
            View childAt = rorVar.getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ror.c cVar = layoutParams instanceof ror.c ? (ror.c) layoutParams : null;
                if (cVar != null) {
                    float left = childAt.getLeft();
                    float top = childAt.getTop();
                    float right = childAt.getRight();
                    float bottom = childAt.getBottom();
                    RectF rectF = this.b;
                    rectF.set(left, top, right, bottom);
                    this.a.b(canvas, rectF, cVar.a);
                }
            }
        }
        canvas.restoreToCount(save);
    }
}
