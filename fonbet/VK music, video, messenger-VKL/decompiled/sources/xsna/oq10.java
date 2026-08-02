package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vkontakte.android.R;

/* compiled from: MediaContentDecoration.kt */
/* loaded from: classes18.dex */
public final class oq10 extends GalvitaLayout.a {
    public final xso0 a;
    public final RectF b = new RectF();
    public final Rect c = new Rect();

    public oq10(float f) {
        this.a = new xso0(24.0f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24);
    }

    @Override // com.vk.core.tool.view.galvitalayout.GalvitaLayout.a
    public final void a(Canvas canvas, GalvitaLayout galvitaLayout) {
        int childCount = galvitaLayout.getChildCount();
        RectF rectF = this.b;
        rectF.setEmpty();
        for (int i = 0; i < childCount; i++) {
            View childAt = galvitaLayout.getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                GalvitaLayout.b bVar = layoutParams instanceof GalvitaLayout.b ? (GalvitaLayout.b) layoutParams : null;
                if (bVar != null) {
                    int left = childAt.getLeft();
                    int top = childAt.getTop();
                    int right = childAt.getRight();
                    int bottom = childAt.getBottom();
                    Rect rect = this.c;
                    rect.set(left, top, right, bottom);
                    rectF.set(rect);
                    rect.setEmpty();
                    this.a.b(canvas, rectF, bVar.a);
                }
            }
        }
    }
}
