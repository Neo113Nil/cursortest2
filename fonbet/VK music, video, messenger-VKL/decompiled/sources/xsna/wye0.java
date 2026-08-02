package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.ewh;
import xsna.phw;
import xsna.q630;

/* compiled from: ReBookingBannerContent.kt */
/* loaded from: classes5.dex */
public final class wye0 {
    public static final void a(ewh ewhVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2114619850);
        int i2 = (M.J(ewhVar) ? 4 : 2) | i | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2114619850, i2, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.ReBookingBannerContent (ReBookingBannerContent.kt:47)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            uog0 uog0Var = wpu0.a;
            q630.a aVar2 = q630.a.a;
            q630 m = hr80.m(aVar2, j, uog0Var);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            c(ewhVar, izsVar, M, (i2 & 14) | 48 | (i2 & 896));
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
            s.d = new r67(ewhVar, q630Var2, izsVar, i, 2);
        }
    }

    public static final void b(final ewh.a aVar, final gzs gzsVar, q630 q630Var, final gzs gzsVar2, androidx.compose.runtime.a aVar2, final int i) {
        q630 q630Var2;
        String str;
        int i2;
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.f1 f1Var;
        androidx.compose.runtime.a M = aVar2.M(1421536790);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1421536790, i3, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.ReBookingRecordItem (ReBookingBannerContent.kt:72)");
            }
            ArrayList arrayList = aVar.c;
            ewh.a.b bVar = aVar.b;
            ewh.a.C2838a c2838a = (ewh.a.C2838a) j5g.a0(arrayList);
            String str2 = c2838a != null ? c2838a.b : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = aVar.d;
            int length = str3.length();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (length > 0) {
                M.K(625329948);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new xsq(22);
                    M.R(x);
                }
                i2 = i3;
                c0012a = c0012a2;
                com.vk.core.compose.component.cell.content.f1 a = RichCell$Middle.c.b.a(str3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
                str = str3;
                M.j();
                f1Var = a;
            } else {
                str = str3;
                i2 = i3;
                c0012a = c0012a2;
                M.K(625567160);
                M.j();
                f1Var = null;
            }
            q630Var2 = q630Var;
            q630 g = q630Var2.g(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, ojc.c(ahn.E(q630.a.a, "community_rebooking_record"), false, null, null, gzsVar2, 15)));
            lg90 l = fwu0.l(null, bVar.c, null, null, M, 0, 61);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phw a2 = phw.a.a(l, new rek0(ylu0Var.getBackground().x), null, null, null, M, 196616, 28);
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new irt(17);
                M.R(x2);
            }
            a.C0011a.C0012a c0012a3 = c0012a;
            int i4 = i2;
            String str4 = str2;
            com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(a2, size, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            String str5 = bVar.b;
            Object x3 = M.x();
            if (x3 == c0012a3) {
                x3 = new ow60(9);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.f1 a4 = RichCell$Middle.h.b.a(str5, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 196608, 14);
            boolean z = str.length() == 0;
            Object x4 = M.x();
            if (x4 == c0012a3) {
                x4 = new juz(21);
                M.R(x4);
            }
            com.vk.core.compose.component.cell.content.f1 a5 = RichCell$Middle.g.b.a(str4, z, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 196608, 12);
            String N = d370.N(R.string.community_profile_re_booking_sign_up_again, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x5 = M.x();
            if (x5 == c0012a3) {
                x5 = new y8m(28);
                M.R(x5);
            }
            ygv0.a(g, a3, RichCell$Middle.b.a(null, a4, a5, f1Var, null, RichCell$Middle.a.C0734a.a(buttonStyle, buttonAppearance, buttonSize, N, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), gzsVar, M, 438, ((i4 << 9) & 57344) | 196608, 8176), null, null, null, M, 0, 1955), null, null, M, 0, 56);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(gzsVar, q630Var3, gzsVar2, i) { // from class: xsna.uye0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    wye0.b(ewh.a.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final ewh ewhVar, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        u890 u890Var;
        androidx.compose.runtime.a M = aVar.M(1897689904);
        if ((i & 6) == 0) {
            i2 = (M.J(ewhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1897689904, i2, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.RecordsPager (ReBookingBannerContent.kt:139)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new hj60(ewhVar, 19);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            if (ewhVar.b.size() > 1) {
                u890Var = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            } else {
                float f = 0;
                u890Var = new u890(f, f, f, f);
            }
            dt1.a.getClass();
            aVar2 = M;
            nb90.a(b, q630.a.a, u890Var, null, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dt1.a.k, null, false, null, null, null, null, kai.c(-625151793, new zzs() { // from class: xsna.vye0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-625151793, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.RecordsPager.<anonymous> (ReBookingBannerContent.kt:157)");
                    }
                    ewh.a aVar4 = (ewh.a) ewh.this.b.get(intValue);
                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                    Object obj5 = izsVar;
                    boolean J = aVar3.J(obj5) | aVar3.J(aVar4);
                    Object x2 = aVar3.x();
                    Object obj6 = a.C0011a.a;
                    if (J || x2 == obj6) {
                        x2 = new cm(26, obj5, aVar4);
                        aVar3.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    boolean J2 = aVar3.J(obj5) | aVar3.J(aVar4);
                    Object x3 = aVar3.x();
                    if (J2 || x3 == obj6) {
                        x3 = new gd0(16, obj5, aVar4);
                        aVar3.R(x3);
                    }
                    wye0.b(aVar4, gzsVar, f2, (gzs) x3, aVar3, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 1597488, 24576, 16296);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ks3(ewhVar, izsVar, i);
        }
    }
}
