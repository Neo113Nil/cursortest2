package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketButton.kt */
/* loaded from: classes18.dex */
public final class zt00 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs gzsVar, final ButtonStyle buttonStyle, final ButtonAppearance buttonAppearance, final q630 q630Var, au00 au00Var, final au00 au00Var2, boolean z, sg50 sg50Var, buw buwVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final au00 au00Var3;
        int i4;
        final boolean z2;
        final sg50 sg50Var2;
        final buw buwVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(2072116575);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(buttonStyle.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.o(buttonAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            au00Var3 = au00Var;
            i3 |= M.J(au00Var3) ? 16384 : 8192;
            if ((196608 & i) == 0) {
                i3 |= M.J(au00Var2) ? 131072 : 65536;
            }
            i4 = i3 | 920125440;
            if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
                M.h();
                z2 = z;
                sg50Var2 = sg50Var;
                buwVar2 = buwVar;
            } else {
                if (i5 != 0) {
                    au00Var3 = null;
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var3 = (sg50) x;
                mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2072116575, i4, 6, "com.vk.ecomm.design.compose.marketbutton.MarketButton (MarketButton.kt:51)");
                }
                bn20 z3 = hr80.z();
                int i6 = i4 >> 3;
                int i7 = i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                mgu0 mgu0Var = (mgu0) z3.b(buttonStyle, buttonAppearance, M, i7);
                wh50 a2 = mgu0Var.a(true, M, (i4 >> 21) & 14);
                y18 t = hr80.z().t(buttonStyle, buttonAppearance, true, M, i7 | ((i4 >> 15) & 896));
                ButtonSize buttonSize = ButtonSize.Large;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new i0r(5);
                    M.R(x2);
                }
                uov0.b(gzsVar, egi0.b(q630Var, false, (izs) x2), hr80.z().x(6, M), ((l5g) a2.getValue()).a, ((l5g) a2.getValue()).a, t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sg50Var3, a, true, null, kai.c(481720660, new edn(buttonSize, mgu0Var, au00Var3, au00Var2), M), M, (i4 & 14) | (29360128 & i6) | (i6 & 234881024) | (1879048192 & (i4 << 6)), 54, 64);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                sg50Var2 = sg50Var3;
                buwVar2 = a;
                z2 = true;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.xt00
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zt00.a(gzs.this, buttonStyle, buttonAppearance, q630Var, au00Var3, au00Var2, z2, sg50Var2, buwVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        au00Var3 = au00Var;
        if ((196608 & i) == 0) {
        }
        i4 = i3 | 920125440;
        if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(final ButtonSize buttonSize, final lgu0 lgu0Var, final au00 au00Var, final au00 au00Var2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1762433084);
        int i2 = (M.J(lgu0Var) ? 32 : 16) | i | (M.l(true) ? 256 : 128) | (M.J(au00Var) ? 2048 : 1024) | (M.J(au00Var2) ? 16384 : 8192) | (M.J(null) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1762433084, i2, -1, "com.vk.ecomm.design.compose.marketbutton.MarketButtonContent (MarketButton.kt:108)");
            }
            if (au00Var != null) {
                au00Var.b(buttonSize);
            }
            if (au00Var2 != null) {
                au00Var2.b(buttonSize);
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            hr80.z().getClass();
            op8.h();
            float f = kqu0.s;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.o), dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (au00Var != null) {
                M.K(-532722528);
                au00Var.a(lgu0Var, M, (i2 & 112) | 390);
            } else {
                M.K(-537010014);
            }
            M.j();
            if (au00Var2 != null) {
                M.K(-532628288);
                au00Var2.a(lgu0Var, M, (i2 & 112) | 390);
            } else {
                M.K(-537010014);
            }
            M.j();
            M.K(-537010014);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(lgu0Var, au00Var, au00Var2, i) { // from class: xsna.yt00
                public final /* synthetic */ lgu0 c;
                public final /* synthetic */ au00 d;
                public final /* synthetic */ au00 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    zt00.b(ButtonSize.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
