package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.List;
import yads.eq0;
import yads.iw1;
import yads.jz;
import yads.kz;

/* loaded from: classes7.dex */
public final class mz71 {
    public final xq71 a = new xq71();
    public final x171 b = new x171();
    public final rn61 c = new rn61();

    public final j381 a(d881 d881Var, v981 v981Var, CustomizableMediaView customizableMediaView, v881 v881Var, List list, j981 j981Var, ak81 ak81Var) {
        ew81 ew81Var;
        Long l;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        b571 b571Var = new b571(context, d881Var, v981Var);
        vt71 vt71Var = new vt71(viewPager2);
        long longValue = (ak81Var == null || (l = ak81Var.b) == null) ? 0L : l.longValue();
        if (longValue > 0) {
            ew81Var = new ew81(viewPager2, vt71Var, b571Var);
            viewPager2.addOnAttachStateChangeListener(new iw1(ew81Var, longValue));
        } else {
            ew81Var = null;
        }
        viewPager2.registerOnPageChangeCallback(new ob81(b571Var, ew81Var));
        this.b.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) on71.a(context, MultiBannerControlsContainer.class, R$layout.monetization_ads_internal_multibanner_controls, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(viewPager2);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new jz(vt71Var, b571Var, ew81Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new kz(vt71Var, b571Var, ew81Var));
        }
        this.c.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        extendedViewContainer.setMeasureSpecProvider(new auo((float) bl71.a(list)));
        this.a.getClass();
        if (!b9a1.a(customizableMediaView.getContext(), eq0.e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        Context context2 = ((n291) v981Var).a;
        return new j381(customizableMediaView, new gx71(viewPager2, v881Var, wha1.c(context2, context2), d881Var), j981Var);
    }
}
