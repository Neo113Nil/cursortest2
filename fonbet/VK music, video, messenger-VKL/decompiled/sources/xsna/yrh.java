package xsna;

import android.content.Context;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.hints.HintId;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.xrh;

/* compiled from: CommunityProfileOnboardingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class yrh {
    public final Context a;
    public final h7v b;
    public final q7v0 c;
    public final wtn0 d;
    public final lpd e;
    public final y89 f;
    public final Object g;
    public final Object h;

    /* compiled from: CommunityProfileOnboardingFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupContentTabType.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yrh(Context context, h7v h7vVar, q7v0 q7v0Var, wtn0 wtn0Var, lpd lpdVar, y89 y89Var) {
        this.a = context;
        this.b = h7vVar;
        this.c = q7v0Var;
        this.d = wtn0Var;
        this.e = lpdVar;
        this.f = y89Var;
        w9 w9Var = new w9(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, w9Var);
        this.h = msy.a(lazyThreadSafetyMode, new sk4(7));
    }

    public final void a(CommunityProfileState communityProfileState, e8v0 e8v0Var) {
        xrh xrhVar = communityProfileState.i;
        if (xrhVar == null) {
            return;
        }
        this.e.invoke(d.m.a.b);
        if ((xrhVar instanceof xrh.d.C4044d) || (xrhVar instanceof xrh.d.e)) {
            b(xrhVar, e8v0Var);
            return;
        }
        boolean z = xrhVar instanceof xrh.d.c;
        h7v h7vVar = this.b;
        if (z) {
            Iterator it = e43.l(HintId.DONUT_ADMIN_PROMO_ONBOARDING_STEP_1, HintId.DONUT_ADMIN_PROMO_ONBOARDING_STEP_2, HintId.DONUT_ADMIN_PROMO_ONBOARDING_STEP_3).iterator();
            while (it.hasNext()) {
                h7vVar.b(((HintId) it.next()).getId());
            }
        } else if (!(xrhVar instanceof xrh.a)) {
            h7vVar.b(xrhVar.a());
        } else {
            if (e8v0Var == null) {
                return;
            }
            xrh.a aVar = (xrh.a) xrhVar;
            this.c.a(aVar.b, aVar.c, e8v0Var);
        }
    }

    public final void b(xrh xrhVar, e8v0 e8v0Var) {
        String str;
        if (e8v0Var == null) {
            return;
        }
        if (xrhVar instanceof xrh.d.C4044d) {
            str = "com:sections_in_about_admin";
        } else if (!(xrhVar instanceof xrh.d.e)) {
            return;
        } else {
            str = "com:sections_in_about_user";
        }
        q7v0 q7v0Var = this.c;
        VkOnboardingCampaign e = q7v0Var.e(str);
        if (e != null) {
            q7v0Var.a(e, VkOnboardingType.Tooltip, e8v0Var);
        }
    }
}
