package xsna;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: UiHelper.kt */
/* loaded from: classes6.dex */
public final class fzp0 {
    public static final float a = iah0.b(20.0f);

    public static ShapeDrawable a(Context context, boolean z, boolean z2) {
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = a;
        float f3 = z ? f2 : 0.0f;
        if (z2) {
            f = f2;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f3, f3, f3, f3, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(e3m.f(R.attr.vk_ui_background_content, context));
        return shapeDrawable;
    }
}
