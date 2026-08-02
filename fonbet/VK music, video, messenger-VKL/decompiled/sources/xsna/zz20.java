package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.q630;
import xsna.us2;

/* compiled from: Modal.kt */
/* loaded from: classes7.dex */
public final class zz20 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(896533707);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(896533707, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.description.compose.modal.ExitConfirmDialog (Modal.kt:189)");
            }
            String N = d370.N(R.string.description_exit_confirm_dialog_title, 0, M);
            String N2 = d370.N(R.string.description_exit_confirm_dialog_message_video, 0, M);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new tz20(izsVar, 0);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N3 = d370.N(R.string.description_exit_confirm_dialog_button_exit, 0, M);
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new v67(izsVar, 5);
                M.R(x2);
            }
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x2, Alert$Button.Style.Negative, null);
            String N4 = d370.N(R.string.description_exit_confirm_dialog_button_cancel, 0, M);
            boolean z3 = i4 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new h97(izsVar, 5);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N4, (gzs) x3, Alert$Button.Style.Neutral, null);
            xim ximVar = new xim(false, 5);
            q630Var2 = q630.a.a;
            p7u0.c(100663296 | ((i3 << 9) & 57344), 96, M, alert$Button, alert$Button2, null, null, N, N2, ximVar, izsVar2, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(izsVar, q630Var2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(u2m u2mVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        long j;
        a.C0011a.C0012a c0012a;
        int i3;
        Object x;
        androidx.compose.runtime.a M = aVar.M(1068680496);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = i | (M.J(u2mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1068680496, i5, -1, "com.vk.video.ui.upload.impl.publish.presentation.description.compose.modal.InputContent (Modal.kt:113)");
            }
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x2 == c0012a2) {
                String str = u2mVar.b;
                int length = str.length();
                x2 = androidx.compose.runtime.k.b(new tho0(str, jgz.c(length, length), 4));
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            String str2 = u2mVar.b;
            tho0 a = tho0.a(tho0Var, str2);
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = new rwr();
                M.R(x3);
            }
            rwr rwrVar = (rwr) x3;
            String O = d370.O(R.string.description_bottom_sheet_counter_talkback, new Object[]{Integer.valueOf(str2.length()), 5000}, M);
            boolean J = M.J(a);
            Object x4 = M.x();
            if (J || x4 == c0012a2) {
                x4 = new dy0(17, a, wh50Var);
                M.R(x4);
            }
            bap.i((gzs) x4, M, 0);
            tho0 tho0Var2 = (tho0) wh50Var.getValue();
            boolean J2 = M.J(a) | ((i5 & 112) == 32);
            Object x5 = M.x();
            if (J2 || x5 == c0012a2) {
                x5 = new ftm(a, izsVar, wh50Var, i4);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            String N = d370.N(R.string.description_bottom_sheet_placeholder, 0, M);
            Object x6 = M.x();
            if (x6 == c0012a2) {
                x6 = new d37(26);
                M.R(x6);
            }
            ybo0 a2 = g8s.e.a.a(tho0Var2, izsVar2, N, null, 8, 8, false, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, 221184, 24576, 8136);
            M = M;
            q630.a aVar2 = q630.a.a;
            q630 d = jvi.d(aVar2, rwrVar);
            us2.b b = xga0.b(504829797, M);
            if (u2mVar.c) {
                M.K(-124786617);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().p;
                M.j();
            } else {
                M.K(-124708280);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().k;
                M.j();
            }
            long j2 = j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int m = b.m(nmo0.a(wuv0Var.i0.a, j2, 0L, null, null, 0L, 0L, null, null, 16777214).a);
            try {
                b.g(String.valueOf(str2.length()));
                s3q0 s3q0Var = s3q0.a;
                b.k(m);
                b.g("/5000");
                us2 n = b.n();
                M.j();
                boolean J3 = M.J(O);
                Object x7 = M.x();
                if (J3) {
                    c0012a = c0012a2;
                } else {
                    c0012a = c0012a2;
                    if (x7 != c0012a) {
                        i3 = 3;
                        nvu0.a(a2, d, null, null, f8s.a.b(n, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, i3), M, 6), M, 0, 12);
                        s3q0 s3q0Var2 = s3q0.a;
                        x = M.x();
                        if (x == c0012a) {
                            x = new wz20(rwrVar, null);
                            M.R(x);
                        }
                        bap.g(s3q0Var2, (wzs) x, M, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var2 = aVar2;
                    }
                }
                i3 = 3;
                x7 = new rf5(O, i3);
                M.R(x7);
                nvu0.a(a2, d, null, null, f8s.a.b(n, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, i3), M, 6), M, 0, 12);
                s3q0 s3q0Var22 = s3q0.a;
                x = M.x();
                if (x == c0012a) {
                }
                bap.g(s3q0Var22, (wzs) x, M, 6);
                if (androidx.compose.runtime.b.d()) {
                }
                q630Var2 = aVar2;
            } catch (Throwable th) {
                b.k(m);
                throw th;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n1k(i, 1, (Object) u2mVar, (Object) izsVar, (Object) q630Var2);
        }
    }

    public static final void c(u2m u2mVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1174215794);
        if ((i & 6) == 0) {
            i2 = i | (M.J(u2mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1174215794, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.description.compose.modal.Modal (Modal.kt:54)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.description_bottom_sheet_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.description_bottom_sheet_icon_cancel_talkback, 0, M);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new i97(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new i0r(7);
                M.R(x2);
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.d.a.a(N, gzsVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24576, 4), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            int i5 = i3 & 14;
            b(u2mVar, izsVar, null, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            boolean z2 = i5 == 4;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new kn20(u2mVar, 2);
                M.R(x3);
            }
            q630 E = ahn.E(s200.E(txj0.f(com.vk.core.compose.component.semantics.b.b(aVar2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3)), 1.0f), 16, 12), "ModalTags.BUTTON_SAVE");
            String N2 = d370.N(R.string.description_bottom_sheet_button_save, 0, M);
            boolean z3 = u2mVar.d;
            boolean z4 = i4 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new zn1(izsVar, 6);
                M.R(x4);
            }
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N2, null, null, null, null, z3, null, null, null, M, X2.b.f, 0, 0, 4059104);
            M = M;
            M.G();
            if (u2mVar.e) {
                M.K(172370413);
                a((i3 >> 3) & 14, M, izsVar, null);
            } else {
                M.K(168031498);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uhg(i, 1, u2mVar, izsVar, q630Var2);
        }
    }
}
