package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalPageScreenContent.kt */
/* loaded from: classes18.dex */
public final class n030 implements yah0 {
    public final List b;
    public final wh50 c;
    public final String d;

    /* compiled from: ModalPageScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.DynamicHeight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Card.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n030() {
        Mode mode = Mode.FullScreen;
        this.b = rl3.u0(new Mode[]{mode, Mode.DynamicHeight});
        this.c = androidx.compose.runtime.k.b(mode);
        this.d = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0266, code lost:
    
        if (r13 == r6) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        Object obj;
        Object obj2;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        Object obj3;
        androidx.compose.runtime.a M = aVar.M(-75121233);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-75121233, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.Content (ModalPageScreenContent.kt:70)");
            }
            Object x = M.x();
            Object obj4 = a.C0011a.a;
            Object obj5 = x;
            if (x == obj4) {
                Object b = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(b);
                obj5 = b;
            }
            wh50 wh50Var4 = (wh50) obj5;
            wh50 wh50Var5 = this.c;
            fdj0 H = nr2.H((Mode) ((zak0) wh50Var5).getValue(), M, 0);
            Object x2 = M.x();
            Object obj6 = x2;
            if (x2 == obj4) {
                Object b2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(b2);
                obj6 = b2;
            }
            wh50 wh50Var6 = (wh50) obj6;
            Object x3 = M.x();
            Object obj7 = x3;
            if (x3 == obj4) {
                Object b3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(b3);
                obj7 = b3;
            }
            wh50 wh50Var7 = (wh50) obj7;
            Object x4 = M.x();
            Object obj8 = x4;
            if (x4 == obj4) {
                Object b4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(b4);
                obj8 = b4;
            }
            wh50 wh50Var8 = (wh50) obj8;
            Object obj9 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 d = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            int i5 = i2;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Modal Page", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            } else {
                i3 = 0;
            }
            lg90 b5 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b5, null, gzsVar, null, null, null, M, 1572872 | ((i5 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(true, true, M, 438, i3);
            q630 D2 = p490.D(q9g.a(txj0.f(s200.F(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Mode mode = (Mode) ((zak0) wh50Var5).getValue();
            int i6 = i5 & 458752;
            int i7 = i6 == 131072 ? 1 : i3;
            Object x5 = M.x();
            if (i7 == 0) {
                obj = obj4;
                obj2 = x5;
            } else {
                obj = obj4;
            }
            Object g1jVar = new g1j(this, 27);
            M.R(g1jVar);
            obj2 = g1jVar;
            y9i0.b("Mode", this.b, mode, (izs) obj2, null, M, 6, 16);
            int i8 = i3;
            q630 f = txj0.f(aVar3, 1.0f);
            Object x6 = M.x();
            Object obj10 = x6;
            if (x6 == obj) {
                Object xwnVar = new xwn(1, wh50Var4);
                M.R(xwnVar);
                obj10 = xwnVar;
            }
            Object obj11 = obj;
            mpj0.a(438, 0, M, "Show Compose ModalPage", (gzs) obj10, f);
            q630 f2 = txj0.f(aVar3, 1.0f);
            if (i6 == 131072) {
                i8 = 1;
            }
            int i9 = i8 | (M.y(obj9) ? 1 : 0);
            Object x7 = M.x();
            Object obj12 = x7;
            if (i9 != 0 || x7 == obj11) {
                Object ss3Var = new ss3(12, this, obj9);
                M.R(ss3Var);
                obj12 = ss3Var;
            }
            mpj0.a(54, 0, M, "Show View ModalPage", (gzs) obj12, f2);
            aVar2 = M;
            Object x8 = aVar2.x();
            if (x8 == obj11) {
                x8 = new a2k(2, wh50Var6);
                aVar2.R(x8);
            }
            gzs<s3q0> gzsVar3 = (gzs) x8;
            Object x9 = aVar2.x();
            if (x9 == obj11) {
                x9 = new b2k(2, wh50Var7);
                aVar2.R(x9);
            }
            gzs<s3q0> gzsVar4 = (gzs) x9;
            Object x10 = aVar2.x();
            if (x10 == obj11) {
                wh50Var = wh50Var8;
                x10 = new m26(1, wh50Var);
                aVar2.R(x10);
            } else {
                wh50Var = wh50Var8;
            }
            f(gzsVar3, gzsVar4, (gzs) x10, aVar2, ((i5 >> 6) & 7168) | 438);
            aVar2.G();
            aVar2.G();
            Object x11 = aVar2.x();
            if (x11 == obj11) {
                x11 = bap.j(EmptyCoroutineContext.b, aVar2);
                aVar2.R(x11);
            }
            Object obj13 = (yvj) x11;
            boolean y = aVar2.y(obj13) | aVar2.J(H);
            Object x12 = aVar2.x();
            if (y || x12 == obj11) {
                x12 = new d5f(obj13, H, wh50Var4, 5);
                aVar2.R(x12);
            }
            gzs gzsVar5 = (gzs) x12;
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                aVar2.K(-256056147);
                Mode mode2 = (Mode) ((zak0) wh50Var5).getValue();
                boolean J = aVar2.J(gzsVar5);
                Object x13 = aVar2.x();
                if (J || x13 == obj11) {
                    x13 = new l70(2, gzsVar5);
                    aVar2.R(x13);
                }
                gzs gzsVar6 = (gzs) x13;
                zji zjiVar = new zji(3);
                jai c3 = kai.c(545667816, new kj6(2, this, gzsVar5), aVar2);
                wh50Var3 = wh50Var7;
                wh50Var2 = wh50Var6;
                obj3 = obj11;
                a030.b(mode2, gzsVar6, null, H, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, zjiVar, false, null, null, false, null, null, c3, aVar2, 0, 100663296, 260084);
                aVar2 = aVar2;
            } else {
                wh50Var2 = wh50Var6;
                wh50Var3 = wh50Var7;
                obj3 = obj11;
                aVar2.K(-261657165);
            }
            aVar2.j();
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) wh50Var3.getValue()).booleanValue();
            boolean booleanValue3 = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x14 = aVar2.x();
            if (x14 == obj3) {
                x14 = new l030(0, wh50Var2);
                aVar2.R(x14);
            }
            gzs<s3q0> gzsVar7 = (gzs) x14;
            Object x15 = aVar2.x();
            if (x15 == obj3) {
                x15 = new p8s(1, wh50Var3);
                aVar2.R(x15);
            }
            gzs<s3q0> gzsVar8 = (gzs) x15;
            Object x16 = aVar2.x();
            if (x16 == obj3) {
                x16 = new f030(0, wh50Var);
                aVar2.R(x16);
            }
            e(booleanValue, booleanValue2, booleanValue3, gzsVar7, gzsVar8, (gzs) x16, aVar2, ((i5 << 3) & 3670016) | 224256);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new g030(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(139227073);
        int i2 = (M.y(gzsVar2) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(139227073, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.ComposeModalPageContent (ModalPageScreenContent.kt:311)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            TopBar$Before.d a3 = TopBar$Before.d.a.a(null, gzsVar2, null, null, M, ((i2 << 3) & 112) | 24576, 13);
            gzsVar2 = gzsVar;
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Modal Page", null, null, null, null, M, 196614, 30), null, null, null, M, 14), null, null, null, null, a3, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            yqv0.c(this.d, s200.E(aVar2, kqu0.b, kqu0.c), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 0, 0, 16380);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(this, gzsVar2, i, 5);
        }
    }

    public final void c(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1832124427);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1832124427, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoAccessorySample (ModalPageScreenContent.kt:251)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            final float j1 = azlVar.j1(rg50Var.getIntValue());
            aVar2 = M;
            a030.b(Mode.DynamicHeight, gzsVar, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, Boolean.TRUE, kai.c(-1281941018, new rig(2, rg50Var, gzsVar), M), kai.c(-483163945, new yzs() { // from class: xsna.k030
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-483163945, intValue, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoAccessorySample.<anonymous> (ModalPageScreenContent.kt:289)");
                        }
                        q630 f = txj0.f(q630.a.a, 1.0f);
                        u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j1, 7);
                        Object x2 = aVar3.x();
                        if (x2 == a.C0011a.a) {
                            x2 = new io3(26);
                            aVar3.R(x2);
                        }
                        lqy.a(f, null, n, null, null, null, false, null, (izs) x2, aVar3, 805306374, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i2 << 3) & 112) | 6, 114819072, 65532);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vi1(this, gzsVar, i, 4);
        }
    }

    public final void d(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(431567437);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(431567437, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoHugSample (ModalPageScreenContent.kt:203)");
            }
            aVar2 = M;
            a030.b(Mode.DynamicHeight, gzsVar, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, Boolean.TRUE, null, vhi.a, aVar2, ((i2 << 3) & 112) | 6, 102236160, 196604);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new edh(this, gzsVar, i, 2);
        }
    }

    public final void e(final boolean z, final boolean z2, final boolean z3, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1218624907);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1218624907, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoModalSamples (ModalPageScreenContent.kt:196)");
            }
            if (z) {
                M.K(-1427527418);
                d(gzsVar, M, ((i2 >> 9) & 14) | ((i2 >> 15) & 112));
            } else {
                M.K(-1311118825);
            }
            M.j();
            if (z2) {
                M.K(-1427525748);
                g(gzsVar2, M, ((i2 >> 12) & 14) | ((i2 >> 15) & 112));
            } else {
                M.K(-1311118825);
            }
            M.j();
            if (z3) {
                M.K(-1427523790);
                c(gzsVar3, M, (i2 >> 15) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            } else {
                M.K(-1311118825);
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
            s.d = new wzs() { // from class: xsna.h030
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    n030.this.e(z, z2, z3, gzsVar, gzsVar2, gzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void f(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1238523102);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar3) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1238523102, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoSampleButtons (ModalPageScreenContent.kt:164)");
            }
            float f = kqu0.w;
            q630.a aVar2 = q630.a.a;
            if (a690.d(aVar2, f, M, 0)) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c("Lego VkModal samples", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, M, 6, 0, 8190);
            M = M;
            f9t.e(txj0.h(aVar2, kqu0.t), M, 0);
            mpj0.a(((i3 << 6) & 896) | 54, 0, M, "Lego: hug (short content, 3 rows)", gzsVar, txj0.f(aVar2, 1.0f));
            mpj0.a(((i3 << 3) & 896) | 54, 0, M, "Lego: scroll (40 rows, blur+fade)", gzsVar2, txj0.f(aVar2, 1.0f));
            mpj0.a((i3 & 896) | 54, 0, M, "Lego: accessory bottomBar (30 rows)", gzsVar3, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j030(i, 0, this, gzsVar, gzsVar2, gzsVar3);
        }
    }

    public final void g(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(396867356);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(396867356, i2, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.LegoScrollSample (ModalPageScreenContent.kt:227)");
            }
            aVar2 = M;
            a030.b(Mode.DynamicHeight, gzsVar, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, true, Boolean.TRUE, null, vhi.c, aVar2, ((i2 << 3) & 112) | 6, 102432768, 163836);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wi1(this, gzsVar, i, 4);
        }
    }
}
