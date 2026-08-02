package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.List;

/* loaded from: classes10.dex */
public final class yo1 {
    public final jy1 a = new jy1();
    public final by1 b = new by1();
    public final zx1 c = new zx1();

    public final kw2 a(v9 v9Var, ov2 ov2Var, CustomizableMediaView customizableMediaView, nj2 nj2Var, List list, bp1 bp1Var, qz2 qz2Var) {
        wx1 wx1Var;
        Long l;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        cy1 cy1Var = new cy1(context, v9Var, ov2Var);
        ky1 ky1Var = new ky1(viewPager2);
        long longValue = (qz2Var == null || (l = qz2Var.b) == null) ? 0L : l.longValue();
        if (longValue > 0) {
            wx1Var = new wx1(viewPager2, ky1Var, cy1Var, new ri1());
            viewPager2.addOnAttachStateChangeListener(new gy1(wx1Var, longValue));
        } else {
            wx1Var = null;
        }
        viewPager2.b(new hc2(cy1Var, wx1Var));
        by1 by1Var = this.b;
        by1Var.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ft2 ft2Var = by1Var.a;
        int i = R$layout.monetization_ads_internal_multibanner_controls;
        ft2Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) ft2.a(context, MultiBannerControlsContainer.class, i, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(viewPager2);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new vz(ky1Var, cy1Var, wx1Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new wz(ky1Var, cy1Var, wx1Var));
        }
        zx1 zx1Var = this.c;
        zx1Var.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        zx1Var.a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new pl2((float) hy1.a(list), new ik1()));
        this.a.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        return new kw2(customizableMediaView, bp1Var, new ml3(new ly1(viewPager2, nj2Var, ((mv3) ov2Var).a(), v9Var)));
    }
}
