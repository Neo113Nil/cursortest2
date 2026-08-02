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
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.y430;

/* compiled from: ModerationConfirmAdultView.kt */
/* loaded from: classes18.dex */
public final class x430 extends i6v0<y430, k430> {
    public final boolean f;

    public x430(Context context, l430 l430Var, boolean z) {
        super(context, l430Var);
        this.f = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((y430) ao50Var, izsVar, aVar, 512);
    }

    public final void h(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        boolean z2;
        String str;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1707118366);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1707118366, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.confirm.ModerationConfirmAdultView.ContentView (ModerationConfirmAdultView.kt:76)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f2 = 8;
            q630 H = s200.H(new gcv(dt1.a.o), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            qzu0.a.getClass();
            pzu0.b(qzu0.e0(M), null, H, wlb0.h(M).getIcon().a, M, 56, 0);
            yqv0.c(d370.N(R.string.moderation_confirm_adult_dialog_title, 0, M), txj0.f(s200.H(ahn.E(aVar2, "AgeConfirmDialogTitle"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 48, 0, 8120);
            float f3 = 16;
            yqv0.c(d370.N(R.string.moderation_good_available_for_adult_description, 0, M), txj0.f(s200.H(ahn.E(aVar2, "AgeConfirmDialogSubtitle"), f3, f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 3, null, wlb0.l(M).m0, M, 0, 48, 6072);
            q630 f4 = txj0.f(s200.H(ahn.E(aVar2, "AgeConfirmButton"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (z) {
                M.K(-719717294);
                M.j();
                str = "";
            } else {
                str = zq.a(M, 946612305, R.string.moderation_confirm_adult_dialog_confirm, M, 0);
            }
            String str2 = str;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new j87(izsVar2, 3);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f4, null, z, false, null, null, null, str2, null, null, null, null, false, null, null, null, M, ((i2 << 21) & 29360128) | 28080, 0, 0, 4190048);
            z2 = z;
            q630 f5 = txj0.f(s200.H(ahn.E(aVar2, "AgeCancelButton"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
            String N = d370.N(R.string.moderation_confirm_adult_dialog_cancel, 0, M);
            boolean z4 = i3 == 32;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new dn7(izsVar, 5);
                M.R(x2);
            }
            izsVar2 = izsVar;
            bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, f5, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h4s(this, z2, izsVar2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(y430 y430Var, izs<? super k430, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-995127586);
        int i2 = (M.J(y430Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-995127586, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.confirm.ModerationConfirmAdultView.ThemedContent (ModerationConfirmAdultView.kt:40)");
            }
            fm50 fm50Var = (fm50) d(y430.b.a, (n0u0[]) Arrays.copyOf(new n0u0[]{y430Var.a}, 1), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (fm50Var instanceof y430.a) {
                M.K(1340838897);
                j((i2 & 896) | (i2 & 112) | 512, M, izsVar, ((Boolean) jk50.d(((y430.a) fm50Var).a, Boolean.FALSE, M, 48).getValue()).booleanValue());
            } else {
                M.K(1339010703);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 5, this, y430Var, izsVar);
        }
    }

    public final void j(int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(996146365);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(996146365, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.confirm.ModerationConfirmAdultView.ThemedContentView (ModerationConfirmAdultView.kt:56)");
            }
            if (this.f) {
                M.K(-2027482663);
                rrv0.e(true, null, null, null, null, null, kai.c(-742799489, new wzs() { // from class: xsna.v430
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-742799489, intValue, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.confirm.ModerationConfirmAdultView.ThemedContentView.<anonymous> (ModerationConfirmAdultView.kt:59)");
                            }
                            x430.this.h(512, aVar2, izsVar, z);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 1572870, 62);
                M.j();
            } else {
                M.K(-2027276792);
                h((i2 & 896) | (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512, M, izsVar, z);
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
            s.d = new w430(i, 0, this, izsVar, z);
        }
    }
}
