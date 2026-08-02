package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VKSocialViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ifr0 implements r1a0 {
    public final /* synthetic */ kfr0 a;

    /* compiled from: VKSocialViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDiscountTransitionFrom.values().length];
            try {
                iArr[PersonalDiscountTransitionFrom.FROM_SNACK_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ifr0(kfr0 kfr0Var) {
        this.a = kfr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // xsna.r1a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, f4v f4vVar) {
        Rect rect;
        VkBridgeAnalytics E;
        boolean z2 = f4vVar.a;
        kfr0 kfr0Var = this.a;
        if (z2 && (E = kfr0Var.a.E()) != null) {
            E.l(VkBridgeAnalytics.PersonalDiscountEvent.HIDE_PROMO_MODAL, f4vVar.b);
        }
        if (!z) {
            return;
        }
        tdr0 tdr0Var = kfr0Var.d;
        ViewGroup a2 = tdr0Var.e.a();
        if (a2 != null) {
            Rect b = f4m.b(a2);
            yfu0 yfu0Var = tdr0Var.i;
            if (yfu0Var == null) {
                yfu0Var = null;
            }
            if (yfu0Var != null) {
                rect = new Rect();
                yfu0Var.b.getGlobalVisibleRect(rect);
                int i = b.right;
                int i2 = rect.right;
                if (i == i2) {
                    int i3 = i2 - rect.left;
                    int a3 = iah0.a(64);
                    if (i3 < a3) {
                        int i4 = rect.right;
                        rect = new Rect(i4 - a3, rect.top, i4, rect.bottom);
                    }
                }
                if (rect != null) {
                    return;
                }
                Context context = ((ggu0) kfr0Var.f.c).b;
                String string = context.getString(R.string.vk_apps_personal_discount_tooltip);
                e3m.a aVar = e3m.a;
                new Tooltip(context, string, "", null, null, null, null, context.getColor(R.color.vk_white), context.getColor(R.color.vk_black), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -392, 15).n(context, new dac0(rect, 26), true, null);
                return;
            }
        }
        rect = null;
        if (rect != null) {
        }
    }

    @Override // xsna.r1a0
    public final void b(String str) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(((ggu0) this.a.f.c).b, Uri.parse(str));
    }

    @Override // xsna.r1a0
    public final void c(BannerType bannerType, PersonalDiscountTransitionFrom personalDiscountTransitionFrom) {
        VkBridgeAnalytics E;
        fvv0 fvv0Var = this.a.a;
        if ((personalDiscountTransitionFrom == null ? -1 : a.$EnumSwitchMapping$0[personalDiscountTransitionFrom.ordinal()]) == 1 && (E = fvv0Var.E()) != null) {
            E.l(VkBridgeAnalytics.PersonalDiscountEvent.OPEN_SNACK_BAR_PROMO, bannerType);
        }
        VkBridgeAnalytics E2 = fvv0Var.E();
        if (E2 != null) {
            E2.l(VkBridgeAnalytics.PersonalDiscountEvent.VIEW_PROMO_MODAL, bannerType);
        }
    }

    @Override // xsna.r1a0
    public final void d(String str, BannerType bannerType) {
        kfr0 kfr0Var = this.a;
        fvv0 fvv0Var = kfr0Var.a;
        VkBridgeAnalytics E = fvv0Var.E();
        if (E != null) {
            E.l(VkBridgeAnalytics.PersonalDiscountEvent.OPEN_TAB_MODAL_PURCHASE, bannerType);
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0 rex0Var2 = rex0Var;
        rex0Var2.a(fvv0Var.t().b, ((ggu0) kfr0Var.f.c).b, (r8 & 8) != 0 ? null : 125, str);
    }
}
