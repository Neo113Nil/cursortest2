package xsna;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.catalog2.common.ui.mvp.holder.music.KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.List;
import java.util.WeakHashMap;
import xsna.m8v0;
import xsna.tiy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w66 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w66(int i, TabLayout tabLayout, tiy tiyVar) {
        this.d = tabLayout;
        this.c = i;
        this.e = tiyVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        q7v0 q7v0Var;
        VkOnboardingCampaign e;
        TabLayout.g b;
        TabLayout.i iVar;
        int i = this.b;
        Object obj = this.e;
        int i2 = this.c;
        KeyEvent.Callback callback = this.d;
        switch (i) {
            case 0:
                List<BaseAvatarPickerActivity.ImageSourceAction> list = BaseAvatarPickerActivity.f;
                ((BaseAvatarPickerActivity) callback).startActivityForResult((Intent) obj, i2);
                break;
            default:
                TabLayout tabLayout = (TabLayout) callback;
                tiy tiyVar = (tiy) obj;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!tabLayout.isLaidOut()) {
                    tabLayout.addOnLayoutChangeListener(new tiy.c(i2, tabLayout, tiyVar));
                } else if (i2 >= 0 && tabLayout.getTabCount() > 0 && (e = (q7v0Var = tiyVar.a).e("music:kids_section_superapp_tooltip")) != null && q7v0Var.d(e) && q7v0Var.b(e, false) && (b = tabLayout.b(i2)) != null && (iVar = b.h) != null) {
                    if (iVar.isLaidOut()) {
                        tabLayout.smoothScrollTo(iVar.getWidth() + tabLayout.getScrollX() + ((int) iVar.getX()), 0);
                        KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 = new KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1(tiyVar, e);
                        int i3 = m8v0.M;
                        m8v0.a.a(iVar, tabLayout.getContext().getString(R.string.navigation_tab_kids_onboarding_title), null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new tiy.a(b), tiy.b.b, null, null, null, null, kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1, 0, false, null, null, false, null, false, 16759812);
                    } else {
                        iVar.addOnLayoutChangeListener(new tiy.d(tabLayout, iVar, tiyVar, e, b));
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w66(BaseAvatarPickerActivity baseAvatarPickerActivity, Intent intent, int i) {
        this.d = baseAvatarPickerActivity;
        this.e = intent;
        this.c = i;
    }
}
