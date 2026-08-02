package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fy20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ fy20(Context context, int i) {
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
                c = new dw20.b(context, null).w0("Сразу Full Screen").s0("Шит должен открыться сразу на весь экран").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                dw20.b bVar = (dw20.b) c;
                bVar.getClass();
                bVar.d.m0 = true;
                bVar.I0(null);
                return s3q0.a;
            case 1:
                int i2 = NewsFeedControlsLayout.D;
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, context));
            default:
                return context;
        }
    }

    public /* synthetic */ fy20(iy20 iy20Var, Context context) {
        this.b = 0;
        this.c = context;
    }
}
