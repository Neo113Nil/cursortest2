package xsna;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zx20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ zx20(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        dw20.a c;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                c = new kmu0(context, new hy20()).w0("Свайп отключен").s0("Попробуйте свайпнуть - не получится!").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                ((dw20.b) c).p(false).I0(null);
                return s3q0.a;
            case 1:
                esj0 esj0Var = new esj0(context);
                esj0Var.setState(new int[]{R.attr.state_selected});
                return esj0Var;
            case 2:
                int i2 = StoryBottomViewGroup.P;
                int color = context.getColor(com.vkontakte.android.R.color.vk_red_nice);
                Drawable drawable = context.getDrawable(com.vkontakte.android.R.drawable.vk_icon_like_36);
                if (drawable == null) {
                    return null;
                }
                drawable.setTint(color);
                return drawable;
            default:
                return Preference.h(context, 0, "shared_preferences_survey_key");
        }
    }

    public /* synthetic */ zx20(iy20 iy20Var, Context context) {
        this.b = 0;
        this.c = context;
    }
}
