package xsna;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.music.KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.music.navigation.VkMusicNavigationTab;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.m8v0;

/* compiled from: KidsMusicOnboardingDelegate.kt */
/* loaded from: classes16.dex */
public final class tiy implements vsn0 {
    public final q7v0 a;
    public final bn7 b;
    public final Object c;

    /* compiled from: KidsMusicOnboardingDelegate.kt */
    public static final class a implements izs<etv0, s3q0> {
        public final /* synthetic */ TabLayout.g b;

        public a(TabLayout.g gVar) {
            this.b = gVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(etv0 etv0Var) {
            etv0Var.b(false);
            this.b.j();
            return s3q0.a;
        }
    }

    /* compiled from: KidsMusicOnboardingDelegate.kt */
    public static final class b implements izs<etv0, s3q0> {
        public static final b b = new b();

        @Override // xsna.izs
        public final s3q0 invoke(etv0 etv0Var) {
            etv0Var.b(false);
            return s3q0.a;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ TabLayout c;
        public final /* synthetic */ tiy d;

        public c(int i, TabLayout tabLayout, tiy tiyVar) {
            this.b = i;
            this.c = tabLayout;
            this.d = tiyVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            VkOnboardingCampaign e;
            TabLayout.g b;
            TabLayout.i iVar;
            tiy tiyVar = this.d;
            q7v0 q7v0Var = tiyVar.a;
            view.removeOnLayoutChangeListener(this);
            int i9 = this.b;
            if (i9 >= 0) {
                TabLayout tabLayout = this.c;
                if (tabLayout.getTabCount() <= 0 || (e = q7v0Var.e("music:kids_section_superapp_tooltip")) == null || !q7v0Var.d(e) || !q7v0Var.b(e, false) || (b = tabLayout.b(i9)) == null || (iVar = b.h) == null) {
                    return;
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!iVar.isLaidOut()) {
                    iVar.addOnLayoutChangeListener(new d(this.c, iVar, tiyVar, e, b));
                    return;
                }
                tabLayout.smoothScrollTo(iVar.getWidth() + tabLayout.getScrollX() + ((int) iVar.getX()), 0);
                KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 = new KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1(tiyVar, e);
                int i10 = m8v0.M;
                m8v0.a.a(iVar, tabLayout.getContext().getString(R.string.navigation_tab_kids_onboarding_title), null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new a(b), b.b, null, null, null, null, kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1, 0, false, null, null, false, null, false, 16759812);
            }
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class d implements View.OnLayoutChangeListener {
        public final /* synthetic */ TabLayout b;
        public final /* synthetic */ TabLayout.i c;
        public final /* synthetic */ tiy d;
        public final /* synthetic */ VkOnboardingCampaign e;
        public final /* synthetic */ TabLayout.g f;

        public d(TabLayout tabLayout, TabLayout.i iVar, tiy tiyVar, VkOnboardingCampaign vkOnboardingCampaign, TabLayout.g gVar) {
            this.b = tabLayout;
            this.c = iVar;
            this.d = tiyVar;
            this.e = vkOnboardingCampaign;
            this.f = gVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            TabLayout tabLayout = this.b;
            int scrollX = tabLayout.getScrollX();
            TabLayout.i iVar = this.c;
            tabLayout.smoothScrollTo(iVar.getWidth() + scrollX + ((int) iVar.getX()), 0);
            KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 = new KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1(this.d, this.e);
            int i9 = m8v0.M;
            m8v0.a.a(iVar, tabLayout.getContext().getString(R.string.navigation_tab_kids_onboarding_title), null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new a(this.f), b.b, null, null, null, null, kidsMusicOnboardingDelegate$createOnboardingStatDelegate$1, 0, false, null, null, false, null, false, 16759812);
        }
    }

    public tiy(q7v0 q7v0Var, bn7 bn7Var) {
        this.a = q7v0Var;
        this.b = bn7Var;
        if (!q7v0Var.isReady()) {
            q7v0Var.init();
        }
        this.c = msy.a(LazyThreadSafetyMode.NONE, new ldl(this, 21));
    }

    @Override // xsna.vsn0
    public final void a(TabLayout tabLayout, UIBlockCatalog uIBlockCatalog) {
        String str;
        Iterator<UIBlock> it = uIBlockCatalog.A.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            UIBlock next = it.next();
            UIBlockList uIBlockList = next instanceof UIBlockList ? (UIBlockList) next : null;
            if (uIBlockList != null && (str = uIBlockList.M) != null && drm0.D(str, VkMusicNavigationTab.KIDS.i(), false)) {
                break;
            } else {
                i++;
            }
        }
        this.a.c(new w66(i, tabLayout, this));
    }
}
