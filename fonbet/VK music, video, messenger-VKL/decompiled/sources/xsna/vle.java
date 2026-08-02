package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vle implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ vle(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                ylw ylwVar = new ylw(R.drawable.vk_icon_music_16);
                ylwVar.d(R.color.vk_white);
                ylwVar.c = 0;
                float f = 16;
                int y = (int) iah0.y(f);
                int y2 = (int) iah0.y(f);
                ylwVar.a = y;
                ylwVar.b = y2;
                return ylwVar.b(context);
            default:
                int i2 = VkCellSkeleton.n;
                LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                layoutParams.topMargin = e3m.a(R.dimen.vk_ui_spacing_size_s, context);
                layoutParams.bottomMargin = e3m.a(R.dimen.vk_ui_spacing_size_s, context);
                layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_xs, context));
                a.setLayoutParams(layoutParams);
                a.setGravity(16);
                return a;
        }
    }
}
