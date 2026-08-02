package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemIconAppearance;
import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemTextAppearance;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ActionsSheetContent.kt */
/* loaded from: classes18.dex */
public final class z70 {

    /* compiled from: ActionsSheetContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActionItemIconAppearance.values().length];
            try {
                iArr[ActionItemIconAppearance.Negative.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionItemIconAppearance.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionItemTextAppearance.values().length];
            try {
                iArr2[ActionItemTextAppearance.Negative.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ActionItemTextAppearance.Primary.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(final t10 t10Var, izs<? super u60, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-784539286);
        if ((i & 6) == 0) {
            i2 = (M.J(t10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-784539286, i2, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemContent (ActionsSheetContent.kt:54)");
            }
            String obj = t10Var.a.toString();
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(aVar2, obj);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new defpackage.e0(2, izsVar, t10Var);
                M.R(x);
            }
            q630 f = txj0.f(xa4.J(E, false, (gzs) x), 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Integer num = t10Var.b;
            if (num == null) {
                M.K(-2107949338);
                M.j();
            } else {
                M.K(-2107949337);
                lg90 a3 = pg90.a(num.intValue(), 0, M);
                ActionItemIconAppearance actionItemIconAppearance = t10Var.e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(758285829, 0, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.getIconTint (ActionsSheetContent.kt:96)");
                }
                int i3 = a.$EnumSwitchMapping$0[actionItemIconAppearance.ordinal()];
                if (i3 == 1) {
                    M.K(-1431752015);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().h;
                    M.j();
                } else {
                    if (i3 != 2) {
                        throw alb0.c(-1431754694, M);
                    }
                    M.K(-1431749585);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().a;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a3, null, null, j, M, 56, 4);
                mq.d(aVar2, 16, M, 6);
            }
            final String N = d370.N(t10Var.c, 0, M);
            if (t10Var.f) {
                M.K(-2107617699);
                d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, VkOnboarding$HighlighterMarkerType.Type4, null, false, false, false, null, kai.c(-679168091, new zzs() { // from class: xsna.x70
                    @Override // xsna.zzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        izs izsVar2 = (izs) obj2;
                        ((Boolean) obj3).getClass();
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar4.y(izsVar2) ? 4 : 2;
                        }
                        if (aVar4.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-679168091, intValue, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemContent.<anonymous>.<anonymous> (ActionsSheetContent.kt:77)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yqv0.c(N, null, z70.c(t10.this.d, aVar4), null, null, 0, 0, null, 0, false, 0, 0, izsVar2, wuv0Var.p1, aVar4, 0, (intValue << 6) & 896, 4090);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 805306752, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
                M.j();
            } else {
                M.K(-2107153164);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(N, null, c(t10Var.d, M), null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.p1, M, 0, 0, 8186);
                M = M;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y70(t10Var, izsVar, i, 0);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(234755351);
        int i2 = i | (M.J(list) ? 4 : 2) | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(234755351, i2, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionsSheetContent (ActionsSheetContent.kt:34)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(p490.D(txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 1.0f), p490.x(M), 14), "actionList");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c, cri.a.d, -1555691319, list);
            int i3 = 0;
            while (a3.hasNext()) {
                Object next = a3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                t10 t10Var = (t10) next;
                a.m mVar2 = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, aVar2);
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
                k9q0.w(M, a4, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                if (i3 != 0) {
                    M.K(1109999840);
                    ck70.b(aVar2, 20, M, 6);
                } else {
                    M.K(1108243473);
                    M.j();
                }
                a(t10Var, izsVar, M, (i2 >> 3) & 112);
                M.G();
                i3 = i4;
            }
            q630Var2 = aVar2;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar2;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w70(list, q630Var2, izsVar, i, 0);
        }
    }

    public static final long c(ActionItemTextAppearance actionItemTextAppearance, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1155346727, 0, -1, "com.vk.ecomm.reviews.impl.dialogs.actionsmenu.getTextColor (ActionsSheetContent.kt:105)");
        }
        int i = a.$EnumSwitchMapping$1[actionItemTextAppearance.ordinal()];
        if (i == 1) {
            aVar.K(-2108318349);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().k;
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(-2108321026, aVar);
            }
            aVar.K(-2108315886);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().m;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
