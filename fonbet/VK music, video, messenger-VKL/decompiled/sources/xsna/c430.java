package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.dw20;
import xsna.q630;

/* compiled from: ModerationAvailableOnlyForAdultDialog.kt */
/* loaded from: classes18.dex */
public final class c430 extends jmu0 {
    public static final /* synthetic */ int h1 = 0;

    /* compiled from: ModerationAvailableOnlyForAdultDialog.kt */
    public static final class a extends dw20.b {
        public final boolean e;

        public a(Context context, boolean z) {
            super(context, null);
            this.e = z;
            C(0.3f);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c430 c430Var = new c430();
            c430Var.setArguments(yfb.b(new Pair("force_dark_theme", Boolean.valueOf(this.e))));
            return c430Var;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-237302099);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-237302099, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.ModerationAvailableOnlyForAdultDialog.ThemedContent (ModerationAvailableOnlyForAdultDialog.kt:29)");
            }
            if (requireArguments().getBoolean("force_dark_theme")) {
                M.K(49496877);
                rrv0.e(true, null, null, null, null, null, kai.c(338098731, new nq1(this, 8), M), M, 1572870, 62);
                M.j();
            } else {
                M.K(49603920);
                eo((i2 & 14) | 8, M);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cd4(this, i, 9);
        }
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1955153491);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1955153491, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.ModerationAvailableOnlyForAdultDialog.ContentView (ModerationAvailableOnlyForAdultDialog.kt:41)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f2 = 8;
            q630 H = s200.H(new gcv(dt1.a.o), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            qzu0.a.getClass();
            pzu0.b(qzu0.g0(M), null, H, wlb0.h(M).getIcon().a, M, 56, 0);
            yqv0.c(d370.N(R.string.moderation_available_only_for_adult_dialog_title, 0, M), txj0.f(s200.H(ahn.E(aVar3, "OnlyForAdultTitle"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 48, 0, 8120);
            float f3 = 16;
            yqv0.c(d370.N(R.string.moderation_good_available_for_adult_description, 0, M), txj0.f(s200.H(ahn.E(aVar3, "OnlyForAdultSubTitle"), f3, f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 3, null, wlb0.l(M).m0, M, 0, 48, 6072);
            q630 f4 = txj0.f(s200.H(ahn.E(aVar3, "OnlyForAdultConfirmButton"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.moderation_available_only_for_adult_dialog_confirm, 0, M);
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z3i(this, 27);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f4, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.l(this, i, 8);
        }
    }
}
