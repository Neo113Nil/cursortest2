package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import org.webrtc.PeerConnectionFactory;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;
import xsna.t2x;
import xsna.wbo0;
import xsna.xbo0;

/* compiled from: InputSelectScreenContent.kt */
/* loaded from: classes18.dex */
public final class g3x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-564869329);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-564869329, i, -1, "com.vk.design.demo.presentation.screens.ClickableSelect (InputSelectScreenContent.kt:160)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b("Value");
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(InputSelect$State.Default);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(null);
                M.R(x4);
            }
            wh50 wh50Var4 = (wh50) x4;
            String str = (String) wh50Var.getValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new lg(17);
                M.R(x5);
            }
            z0v0.a(s2x.b.a.a(str, (gzs) x5, "Placeholder", 0L, (r2x) wh50Var4.getValue(), null, M, 805306800, 440), txj0.f(q630.a.a, 1.0f), (InputSelect$State) wh50Var2.getValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), M, 48, 0);
            aVar2 = M;
            f(wh50Var2, wh50Var3, wh50Var4, null, null, null, aVar2, 438, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yx5(i, 8);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-325009013);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-325009013, i, -1, "com.vk.design.demo.presentation.screens.Content (InputSelectScreenContent.kt:95)");
            }
            float f = kqu0.b;
            q630 H = s200.H(p490.D(q630Var, p490.x(M), 14), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 10, 2);
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            w0n0.a(6, 2, M, "Input", null);
            e(0, M);
            jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
            w0n0.a(6, 2, M, "Select (Clickable)", null);
            a(0, M);
            jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
            w0n0.a(6, 2, M, "Select (Dropdown)", null);
            h(0, M);
            jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
            w0n0.a(6, 2, M, "TextArea", null);
            j(0, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fw9(q630Var, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(wh50<InputSelect$State> wh50Var, wh50<zbo0> wh50Var2, androidx.compose.runtime.a aVar, int i) {
        wh50<InputSelect$State> wh50Var3;
        wbo0 wbo0Var;
        androidx.compose.runtime.a M = aVar.M(-252255977);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-252255977, i, -1, "com.vk.design.demo.presentation.screens.ExtendableTextArea (InputSelectScreenContent.kt:234)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(null, 0L, 7, M);
            }
            wh50 wh50Var4 = (wh50) x;
            w0n0.a(6, 2, M, "Compose", null);
            InputSelect$State value = wh50Var.getValue();
            tho0 tho0Var = (tho0) wh50Var4.getValue();
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            String str = wh50Var2.getValue().e ? "Placeholder" : null;
            xbo0 xbo0Var = wh50Var2.getValue().a;
            wbo0 wbo0Var2 = wh50Var2.getValue().b;
            boolean z = wh50Var2.getValue().c;
            boolean z2 = wh50Var2.getValue().d;
            Object x2 = M.x();
            if (x2 == c0012a) {
                wbo0Var = wbo0Var2;
                x2 = new eho(1, wh50Var4);
                M.R(x2);
            } else {
                wbo0Var = wbo0Var2;
            }
            hqv0.d(tho0Var, (izs) x2, f, str, value, 1, 8, z2, false, 0L, 0L, null, null, null, null, null, null, xbo0Var, wbo0Var, z, M, 1769904, 0, 130816);
            M = M;
            w0n0.a(6, 2, M, "View", null);
            q630 f2 = txj0.f(aVar2, 1.0f);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new jr3(20);
                M.R(x3);
            }
            izs izsVar = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                wh50Var3 = wh50Var;
                x4 = new fh1(15, wh50Var3, wh50Var2);
                M.R(x4);
            } else {
                wh50Var3 = wh50Var;
            }
            ae2.a(54, 0, M, izsVar, (izs) x4, f2);
            g(wh50Var3, null, M, 6);
            i(wh50Var2, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wh50Var3 = wh50Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qm7(wh50Var3, wh50Var2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(wh50<InputSelect$State> wh50Var, wh50<zbo0> wh50Var2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1037355013);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1037355013, i, -1, "com.vk.design.demo.presentation.screens.FixedTextArea (InputSelectScreenContent.kt:355)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a("Text value", 0L, 6, M);
            }
            wh50 wh50Var3 = (wh50) x;
            InputSelect$State value = wh50Var.getValue();
            tho0 tho0Var = (tho0) wh50Var3.getValue();
            q630 f = txj0.f(q630.a.a, 1.0f);
            String str = wh50Var2.getValue().e ? "Placeholder" : null;
            xbo0 xbo0Var = wh50Var2.getValue().a;
            wbo0 wbo0Var = wh50Var2.getValue().b;
            boolean z = wh50Var2.getValue().c;
            boolean z2 = wh50Var2.getValue().d;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new x2x(0, wh50Var3);
                M.R(x2);
            }
            aVar2 = M;
            hqv0.d(tho0Var, (izs) x2, f, str, value, 8, 8, z2, false, 0L, 0L, null, null, null, null, null, null, xbo0Var, wbo0Var, z, aVar2, 1769904, 0, 130816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ke4(wh50Var, wh50Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(959224803);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(959224803, i, -1, "com.vk.design.demo.presentation.screens.Input (InputSelectScreenContent.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(null, 0L, 7, M);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(InputSelect$State.Default);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(null);
                M.R(x4);
            }
            wh50 wh50Var4 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(null);
                M.R(x5);
            }
            wh50 wh50Var5 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            wh50 wh50Var6 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x7);
            }
            wh50 wh50Var7 = (wh50) x7;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new qfr(1, wh50Var);
                M.R(x8);
            }
            aVar2 = M;
            z0v0.a(s2x.a.C3649a.b(tho0Var, (izs) x8, ((Boolean) wh50Var7.getValue()).booleanValue() ? "Placeholder" : null, 0L, 0L, null, null, null, (r2x) wh50Var4.getValue(), (t2x) wh50Var5.getValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), null, aVar2, 48, 196608, 18424), txj0.f(q630.a.a, 1.0f), (InputSelect$State) wh50Var2.getValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), aVar2, 48, 0);
            f(wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, wh50Var7, aVar2, 224694, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j21(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final wh50<InputSelect$State> wh50Var, wh50<Boolean> wh50Var2, final wh50<r2x> wh50Var3, wh50<t2x> wh50Var4, wh50<Boolean> wh50Var5, wh50<Boolean> wh50Var6, androidx.compose.runtime.a aVar, final int i, final int i2) {
        wh50<t2x> wh50Var7;
        int i3;
        final wh50<Boolean> wh50Var8;
        int i4;
        wh50<Boolean> wh50Var9;
        int i5;
        wh50<Boolean> wh50Var10;
        wh50<t2x> wh50Var11;
        final wh50<Boolean> wh50Var12;
        androidx.compose.runtime.f s;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-1577467392);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i | 3072;
            wh50Var7 = wh50Var4;
        } else if ((i & 3072) == 0) {
            wh50Var7 = wh50Var4;
            i3 = (M.J(wh50Var7) ? 2048 : 1024) | i;
        } else {
            wh50Var7 = wh50Var4;
            i3 = i;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            wh50Var8 = wh50Var5;
            i3 |= M.J(wh50Var8) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                wh50Var9 = wh50Var6;
                i3 |= M.J(wh50Var9) ? 131072 : 65536;
                i5 = i3;
                if (M.t(i5 & 1, (74899 & i5) != 74898)) {
                    if (i6 != 0) {
                        wh50Var7 = null;
                    }
                    if (i7 != 0) {
                        wh50Var8 = null;
                    }
                    if (i4 != 0) {
                        wh50Var9 = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1577467392, i5, -1, "com.vk.design.demo.presentation.screens.InputSelectControl (InputSelectScreenContent.kt:386)");
                    }
                    qzu0.a.getClass();
                    lg90 W0 = qzu0.W0(M);
                    wh50<Boolean> wh50Var13 = wh50Var8;
                    wh50Var11 = wh50Var7;
                    tzy s2 = sv1.s(W0, null, 0L, M, 12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1349760420, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-View24> (VkSdkIcons.kt:3730)");
                    }
                    lg90 b = or.b(M, -1228680689, R.drawable.vk_icon_view_24, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new ek(13);
                        M.R(x);
                    }
                    wh50Var12 = wh50Var9;
                    wh50Var8 = wh50Var13;
                    hkg0 a = t2x.b.a.a(b, null, (gzs) x, 0L, null, M, 197000, 26);
                    M = M;
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
                    k9q0.w(M, a2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), dt1.a.k, M, 0);
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
                    k9q0.w(M, a3, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    g(wh50Var, null, M, 6);
                    M.G();
                    boolean booleanValue = wh50Var2.getValue().booleanValue();
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        wh50Var10 = wh50Var2;
                        x2 = new y2x(0, wh50Var10);
                        M.R(x2);
                    } else {
                        wh50Var10 = wh50Var2;
                    }
                    zov0.b(booleanValue, PeerConnectionFactory.TRIAL_ENABLED, (izs) x2, null, null, false, false, M, 48, 120);
                    boolean z2 = wh50Var3.getValue() != null;
                    boolean J = M.J(s2);
                    Object x3 = M.x();
                    if (J || x3 == c0012a) {
                        x3 = new kp5(14, wh50Var3, s2);
                        M.R(x3);
                    }
                    zov0.b(z2, "Left icon", (izs) x3, null, null, false, false, M, 48, 120);
                    if (wh50Var11 == null) {
                        M.K(-1143630640);
                    } else {
                        M.K(-1143630639);
                        boolean z3 = wh50Var11.getValue() != null;
                        boolean J2 = M.J(wh50Var11) | M.J(a);
                        Object x4 = M.x();
                        if (J2 || x4 == c0012a) {
                            x4 = new rh4(16, wh50Var11, a);
                            M.R(x4);
                        }
                        zov0.b(z3, "Right icon", (izs) x4, null, null, false, false, M, 48, 120);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    M.j();
                    if (wh50Var8 == null) {
                        M.K(-1143227888);
                        M.j();
                        z = false;
                    } else {
                        M.K(-1143227887);
                        boolean booleanValue2 = wh50Var8.getValue().booleanValue();
                        boolean z4 = (i5 & 57344) == 16384;
                        Object x5 = M.x();
                        if (z4 || x5 == c0012a) {
                            z = false;
                            x5 = new z2x(0, wh50Var8);
                            M.R(x5);
                        } else {
                            z = false;
                        }
                        zov0.b(booleanValue2, "Clear", (izs) x5, null, null, false, false, M, 48, 120);
                        s3q0 s3q0Var2 = s3q0.a;
                        M.j();
                    }
                    if (wh50Var12 == null) {
                        M.K(-1142999883);
                    } else {
                        M.K(-1142999882);
                        boolean booleanValue3 = wh50Var12.getValue().booleanValue();
                        boolean z5 = (i5 & 458752) == 131072 ? true : z;
                        Object x6 = M.x();
                        if (z5 || x6 == c0012a) {
                            x6 = new nfr(1, wh50Var12);
                            M.R(x6);
                        }
                        zov0.b(booleanValue3, "Has placeholder", (izs) x6, null, null, false, false, M, 48, 120);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    wh50Var10 = wh50Var2;
                    M.h();
                    wh50Var11 = wh50Var7;
                    wh50Var12 = wh50Var9;
                }
                s = M.s();
                if (s != null) {
                    final wh50<t2x> wh50Var14 = wh50Var11;
                    final wh50<Boolean> wh50Var15 = wh50Var10;
                    s.d = new wzs() { // from class: xsna.a3x
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g3x.f(wh50.this, wh50Var15, wh50Var3, wh50Var14, wh50Var8, wh50Var12, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            wh50Var9 = wh50Var6;
            i5 = i3;
            if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        wh50Var8 = wh50Var5;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        wh50Var9 = wh50Var6;
        i5 = i3;
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void g(wh50 wh50Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wh50 wh50Var2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1292074585);
        if ((i & 6) == 0) {
            i2 = i | (M.J(wh50Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1292074585, i3, -1, "com.vk.design.demo.presentation.screens.InputSelectStatesRow (InputSelectScreenContent.kt:297)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.i iVar = androidx.compose.foundation.layout.a.f;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(iVar, dt1.a.k, M, 6);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ymi(2, wh50Var);
                M.R(x);
            }
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Default", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new g3(1, wh50Var);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Active", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            boolean z3 = i4 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new hoi(1, wh50Var);
                M.R(x3);
            }
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Hover", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            boolean z4 = i4 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new e3x(0, wh50Var);
                M.R(x4);
            }
            bhu0.e((gzs) x4, buttonSize, buttonStyle, ButtonAppearance.Negative, null, null, false, false, null, null, null, "Error", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            boolean z5 = i4 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                wh50Var2 = wh50Var;
                x5 = new f3x(0, wh50Var2);
                M.R(x5);
            } else {
                wh50Var2 = wh50Var;
            }
            aVar2 = M;
            bhu0.e((gzs) x5, buttonSize, buttonStyle, ButtonAppearance.Positive, null, null, false, false, null, null, null, "Valid", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            wh50Var2 = wh50Var;
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new knc(wh50Var2, q630Var2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1161882718);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1161882718, i, -1, "com.vk.design.demo.presentation.screens.SelectWithDropdown (InputSelectScreenContent.kt:186)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b("Value");
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(InputSelect$State.Default);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(null);
                M.R(x4);
            }
            wh50 wh50Var4 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var5 = (wh50) x5;
            String str = (String) wh50Var.getValue();
            boolean booleanValue = ((Boolean) wh50Var5.getValue()).booleanValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new f36(1, wh50Var5);
                M.R(x6);
            }
            z0v0.a(s2x.b.a.b(str, booleanValue, (izs) x6, null, (r2x) wh50Var4.getValue(), 0L, 0L, null, tgi.a, M, 384, 1000), txj0.f(q630.a.a, 1.0f), (InputSelect$State) wh50Var2.getValue(), ((Boolean) wh50Var3.getValue()).booleanValue(), M, 48, 0);
            f(wh50Var2, wh50Var3, wh50Var4, null, null, null, M, 438, 56);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uhd(i, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
    
        if (r5 == r4) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(wh50<zbo0> wh50Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-581759732);
        if ((i & 6) == 0) {
            i2 = (M.J(wh50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-581759732, i2, -1, "com.vk.design.demo.presentation.screens.TextAreaControls (InputSelectScreenContent.kt:454)");
            }
            qzu0.a.getClass();
            Object a = xbo0.a.C3992a.a(qzu0.W0(M), 0L, null, M, 24584, 14);
            lg90 W0 = qzu0.W0(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1159174527, 3080, -1, "com.vk.core.compose.component.input.TextArea.After.Icon.Companion.invoke (TextArea.kt:105)");
            }
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = new wbo0.a(W0);
                M.R(x);
            }
            wbo0.a aVar2 = (wbo0.a) x;
            ((zak0) aVar2.a).setValue(W0);
            ((zak0) aVar2.b).setValue(null);
            ((zak0) aVar2.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            boolean z = wh50Var.getValue().d;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == obj2) {
                x2 = new b3x(0, wh50Var);
                M.R(x2);
            }
            zov0.b(z, PeerConnectionFactory.TRIAL_ENABLED, (izs) x2, null, null, false, false, M, 48, 120);
            boolean z3 = wh50Var.getValue().a != null;
            boolean J = (i3 == 4) | M.J(a);
            Object x3 = M.x();
            if (J) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            x3 = new ma(16, wh50Var, a);
            M.R(x3);
            Object obj3 = obj;
            zov0.b(z3, "Before", (izs) x3, null, null, false, false, M, 48, 120);
            boolean z4 = wh50Var.getValue().b != null;
            boolean J2 = (i3 == 4) | M.J(aVar2);
            Object x4 = M.x();
            if (J2 || x4 == obj3) {
                x4 = new com.vk.movika.sdk.base.ui.s0(15, wh50Var, aVar2);
                M.R(x4);
            }
            zov0.b(z4, "After", (izs) x4, null, null, false, false, M, 48, 120);
            boolean z5 = wh50Var.getValue().c;
            boolean z6 = i3 == 4;
            Object x5 = M.x();
            if (z6 || x5 == obj3) {
                x5 = new qpj(wh50Var, 21);
                M.R(x5);
            }
            zov0.b(z5, "Clear", (izs) x5, null, null, false, false, M, 48, 120);
            boolean z7 = wh50Var.getValue().e;
            boolean z8 = i3 == 4;
            Object x6 = M.x();
            if (z8 || x6 == obj3) {
                x6 = new c3x(0, wh50Var);
                M.R(x6);
            }
            zov0.b(z7, "Has placeholder", (izs) x6, null, null, false, false, M, 48, 120);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d3x(wh50Var, i, 0);
        }
    }

    public static final void j(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(581050680);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(581050680, i, -1, "com.vk.design.demo.presentation.screens.TextAreasWithControls (InputSelectScreenContent.kt:222)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(InputSelect$State.Default);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(new zbo0(0));
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            c(wh50Var, wh50Var2, M, 54);
            d(wh50Var, wh50Var2, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t8c(i, 5);
        }
    }
}
