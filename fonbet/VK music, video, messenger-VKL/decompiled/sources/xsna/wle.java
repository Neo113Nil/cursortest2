package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vkontakte.android.R;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wle implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wle(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        File webViewConfigurationDataStore$lambda$3;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                ylw ylwVar = new ylw(R.drawable.vk_icon_music_16);
                ylwVar.d(R.color.vk_white);
                ylwVar.c = 2;
                float f = 16;
                int a = iah0.a(f);
                int a2 = iah0.a(f);
                ylwVar.a = a;
                ylwVar.b = a2;
                return ylwVar.b(context);
            case 1:
                webViewConfigurationDataStore$lambda$3 = UnityAdsModule.webViewConfigurationDataStore$lambda$3(context);
                return webViewConfigurationDataStore$lambda$3;
            default:
                int i2 = VkCellSkeleton.n;
                LinearLayout a3 = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                a3.setLayoutParams(layoutParams);
                a3.setGravity(16);
                a3.setPaddingRelative(e3m.a(R.dimen.vk_ui_spacing_size2_xs, context), e3m.a(R.dimen.vk_ui_spacing_size_l, context), 0, e3m.a(R.dimen.vk_ui_spacing_size_l, context));
                return a3;
        }
    }
}
