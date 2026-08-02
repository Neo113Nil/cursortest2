package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.fpv0;
import xsna.phw;
import xsna.q630;

/* compiled from: BottomBarScreenContent.kt */
/* loaded from: classes18.dex */
public final class o48 implements yah0 {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final rg50 i;
    public final rg50 j;
    public final wh50 k;
    public final wh50 l;

    public o48() {
        Boolean bool = Boolean.FALSE;
        this.b = androidx.compose.runtime.k.b(bool);
        this.c = androidx.compose.runtime.k.b(bool);
        this.d = androidx.compose.runtime.k.b(bool);
        this.e = androidx.compose.runtime.k.b(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f = androidx.compose.runtime.k.b(bool2);
        this.g = androidx.compose.runtime.k.b(bool2);
        this.h = androidx.compose.runtime.k.b(bool2);
        this.i = androidx.compose.runtime.i.a(4);
        this.j = androidx.compose.runtime.i.a(0);
        this.k = androidx.compose.runtime.k.b(null);
        this.l = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-420583481);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (73875 & i4) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-420583481, i4, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.Content (BottomBarScreenContent.kt:87)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                Object wowVar = new wow(e43.l(Integer.valueOf(R.drawable.vk_icon_lego_home_28), Integer.valueOf(R.drawable.vk_icon_lego_search_filled_28), Integer.valueOf(R.drawable.vk_icon_lego_bubble_text_28), Integer.valueOf(R.drawable.vk_icon_lego_menu_28)));
                M.R(wowVar);
                x = wowVar;
            }
            final List<T> list = ((wow) x).b;
            Object x2 = M.x();
            if (x2 == obj) {
                Object wowVar2 = new wow(e43.l(Integer.valueOf(R.drawable.vk_icon_lego_music_28), Integer.valueOf(R.drawable.vk_icon_lego_logo_clips_28)));
                M.R(wowVar2);
                x2 = wowVar2;
            }
            final List<T> list2 = ((wow) x2).b;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(null);
                M.R(x3);
            }
            final wh50 wh50Var = (wh50) x3;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ra8 ra8Var = ra8.a;
            q630 a = ra8Var.a(aVar2);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, a);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            e(gzsVar, gzsVar2, x5Var, M, (i4 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i4 >> 6) & 7168));
            djn0.a(false, true, M, 390, 1);
            q630 d3 = txj0.d(aVar2, 1.0f);
            int i5 = 458752 & i4;
            boolean z = i5 == 131072;
            Object x4 = M.x();
            if (z || x4 == obj) {
                x4 = new na7(1, this, wh50Var);
                M.R(x4);
            }
            ae2.a(48, 4, M, (izs) x4, null, d3);
            M.G();
            q630 b = ra8Var.b(txj0.f(aVar2, 1.0f), dt1.a.i);
            boolean z2 = i5 == 131072;
            Object x5 = M.x();
            if (z2 || x5 == obj) {
                x5 = new wl0(this, 7);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            boolean z3 = i5 == 131072;
            Object x6 = M.x();
            if (z3 || x6 == obj) {
                x6 = new izs() { // from class: xsna.k48
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        VkBottomBar vkBottomBar = (VkBottomBar) obj2;
                        final o48 o48Var = o48.this;
                        if (((Boolean) ((zak0) o48Var.b).getValue()).booleanValue()) {
                            vkBottomBar.getContext();
                        }
                        vkBottomBar.setTopSlot(null);
                        vkBottomBar.getButton().setVisibility(((Boolean) ((zak0) o48Var.d).getValue()).booleanValue() ? 0 : 8);
                        vkBottomBar.getSecondButton().setVisibility(((Boolean) ((zak0) o48Var.e).getValue()).booleanValue() ? 0 : 8);
                        vkBottomBar.getTabBar().setVisibility(((Boolean) ((zak0) o48Var.f).getValue()).booleanValue() ? 0 : 8);
                        if (((Boolean) ((zak0) o48Var.c).getValue()).booleanValue()) {
                            vkBottomBar.getContext();
                        }
                        vkBottomBar.setBottomSlot(null);
                        int intValue = ((wak0) o48Var.i).getIntValue();
                        List list3 = list;
                        int size = intValue - list3.size();
                        ArrayList u0 = j5g.u0(j5g.I0(1, new wow(list3)), j5g.u0(j5g.H0(new wow(list2), size >= 0 ? size : 0), j5g.T(1, new wow(list3))));
                        ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
                        Iterator it = u0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new fpv0.a(new fpv0.a.InterfaceC2887a.b(vkBottomBar.getContext().getDrawable(((Number) it.next()).intValue())), null));
                        }
                        vkBottomBar.getTabBar().setItems(arrayList);
                        vkBottomBar.getTabBar().d.add(new fpv0.c() { // from class: xsna.m48
                            @Override // xsna.fpv0.c
                            public final void c(int i6) {
                                ((wak0) o48.this.j).C(i6);
                            }
                        });
                        vkBottomBar.getTabBar().a(((wak0) o48Var.j).getIntValue());
                        vkBottomBar.setupWithBlurContentView((VkBlurContentView) wh50Var.getValue());
                        vkBottomBar.setBlurEnabled(((Boolean) ((zak0) o48Var.g).getValue()).booleanValue());
                        vkBottomBar.setOverlayEnabled(((Boolean) ((zak0) o48Var.h).getValue()).booleanValue());
                        return s3q0.a;
                    }
                };
                M.R(x6);
            }
            ae2.a(0, 0, M, izsVar2, (izs) x6, b);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l48(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        o48 o48Var;
        o48 o48Var2 = this;
        androidx.compose.runtime.a M = aVar.M(821584964);
        int i2 = i | (M.J(r9g.a) ? 4 : 2) | (M.J(o48Var2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(821584964, i2, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.MainContent (BottomBarScreenContent.kt:179)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 8;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, p490.D(q9g.a(txj0.f(aVar2, 1.0f), 1.0f), p490.x(M), 14));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            o48Var2.c((i2 >> 3) & 14, M);
            StringBuilder sb = new StringBuilder("Tab count: ");
            wak0 wak0Var = (wak0) o48Var2.i;
            sb.append(wak0Var.getIntValue());
            float f2 = 16;
            yqv0.c(sb.toString(), s200.E(aVar2, f2, 12), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 48, 0, 16380);
            float intValue = wak0Var.getIntValue();
            awf awfVar = new awf(4.0f, 6.0f);
            q630 F2 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new tl0(this, 15);
                M.R(x);
            }
            hkv0.c(intValue, (izs) x, F2, false, null, awfVar, 2, null, M, 1573248, InterfaceC4413l1.a.b.h);
            q630 f3 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = s200.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f2, f);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new oo(this, 8);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, "Show Snackbar", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190176);
            ButtonStyle buttonStyle2 = ButtonStyle.Outline;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 F3 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            boolean z3 = i3 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                o48Var = this;
                x3 = new wm1(o48Var, 8);
                M.R(x3);
            } else {
                o48Var = this;
            }
            gzs gzsVar = (gzs) x3;
            o48Var2 = o48Var;
            bhu0.e(gzsVar, buttonSize, buttonStyle2, buttonAppearance, F3, null, false, false, null, null, null, "Hide Snackbar", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190176);
            M = M;
            M.G();
            o48Var2.d(6 | i3, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bn7(o48Var2, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        if (r8 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
    
        if (r7 == r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0176, code lost:
    
        if (r7 == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c2, code lost:
    
        if (r7 == r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020e, code lost:
    
        if (r7 == r6) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        wh50 wh50Var;
        boolean z;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        a.C0011a.C0012a c0012a3;
        a.C0011a.C0012a c0012a4;
        a.C0011a.C0012a c0012a5;
        androidx.compose.runtime.a M = aVar.M(116750899);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(116750899, i2, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.Settings (BottomBarScreenContent.kt:284)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            q630.a aVar2 = q630.a.a;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a6 = a.C0011a.a;
            if (z2 || x == c0012a6) {
                x = new yx0(this, 11);
                M.R(x);
            }
            zov0.b(booleanValue, "Show top slot (SexyCell)", (izs) x, F, null, false, false, M, 3120, 112);
            wh50 wh50Var2 = this.d;
            if (((Boolean) ((zak0) wh50Var2).getValue()).booleanValue() && ((Boolean) ((zak0) this.e).getValue()).booleanValue()) {
                wh50Var = wh50Var2;
                z = true;
            } else {
                wh50Var = wh50Var2;
                z = false;
            }
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3) {
                c0012a = c0012a6;
            } else {
                c0012a = c0012a6;
            }
            x2 = new d7(this, 9);
            M.R(x2);
            a.C0011a.C0012a c0012a7 = c0012a;
            zov0.b(z, "Show two buttons", (izs) x2, F2, null, false, false, M, 3120, 112);
            boolean booleanValue2 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            q630 F3 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4) {
                c0012a2 = c0012a7;
            } else {
                c0012a2 = c0012a7;
            }
            x3 = new vs(this, 10);
            M.R(x3);
            a.C0011a.C0012a c0012a8 = c0012a2;
            zov0.b(booleanValue2, "Show button", (izs) x3, F3, null, false, false, M, 3120, 112);
            boolean booleanValue3 = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            q630 F4 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z5 = i3 == 4;
            Object x4 = M.x();
            if (z5) {
                c0012a3 = c0012a8;
            } else {
                c0012a3 = c0012a8;
            }
            x4 = new com.vk.movika.sdk.base.logic.interactor.p(this, 8);
            M.R(x4);
            a.C0011a.C0012a c0012a9 = c0012a3;
            zov0.b(booleanValue3, "Show bottom slot (SexyCell)", (izs) x4, F4, null, false, false, M, 3120, 112);
            boolean booleanValue4 = ((Boolean) ((zak0) this.f).getValue()).booleanValue();
            q630 F5 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z6 = i3 == 4;
            Object x5 = M.x();
            if (z6) {
                c0012a4 = c0012a9;
            } else {
                c0012a4 = c0012a9;
            }
            x5 = new zx0(this, 11);
            M.R(x5);
            a.C0011a.C0012a c0012a10 = c0012a4;
            zov0.b(booleanValue4, "Show tab bar", (izs) x5, F5, null, false, false, M, 3120, 112);
            boolean booleanValue5 = ((Boolean) ((zak0) this.g).getValue()).booleanValue();
            q630 F6 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z7 = i3 == 4;
            Object x6 = M.x();
            if (z7) {
                c0012a5 = c0012a10;
            } else {
                c0012a5 = c0012a10;
            }
            x6 = new ay0(this, 9);
            M.R(x6);
            a.C0011a.C0012a c0012a11 = c0012a5;
            zov0.b(booleanValue5, "Enable blur", (izs) x6, F6, null, false, false, M, 3120, 112);
            boolean booleanValue6 = ((Boolean) ((zak0) this.h).getValue()).booleanValue();
            q630 F7 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z8 = i3 == 4;
            Object x7 = M.x();
            if (z8 || x7 == c0012a11) {
                x7 = new ns1(this, 10);
                M.R(x7);
            }
            zov0.b(booleanValue6, "Enable overlay", (izs) x7, F7, null, false, false, M, 3120, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j48(this, i, 0);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1709963375);
        int i2 = 2;
        boolean z = true;
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1709963375, i, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.StubContent (BottomBarScreenContent.kt:352)");
            }
            int i3 = 0;
            while (i3 < 4) {
                androidx.compose.runtime.a aVar2 = M;
                lg90 l = fwu0.l("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null, null, null, aVar2, 6, 62);
                com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.g.a(phw.a.a(l, null, null, null, null, aVar2, 196616, 30), Cell$Left.Main.Size.Large, null, null, null, aVar2, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), null, aVar2, i2);
                com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(tgw.b(i3, "Title #", " with loooooooooooooooooooooooooooooong name"), null, null, 0, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b("Subtitle with loooooooooooooooooooooooooooooong name", 0, null, null, null, aVar2, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar2, 196608, 28);
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new d14(3);
                    aVar2.R(x);
                }
                int i4 = i3;
                wiu0.b(null, false, a, a2, o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Detail", null, null, null, false, null, null, (gzs) x, aVar2, 3072, 1769472, 32759), null, null, null, null, aVar2, 62), null, null, aVar2, 0, 99);
                q630 q = txj0.q(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, q630.a.a), 100);
                dt1.a.getClass();
                r0v0.a(l, lr.c(dt1.a.o, q), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar2, 8, 252);
                M = aVar2;
                i3 = i4 + 1;
                z = true;
                i2 = i2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a86(this, i, 1);
        }
    }

    public final void e(gzs gzsVar, gzs gzsVar2, x5 x5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-1133052170);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1133052170, i3, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.TopBar (BottomBarScreenContent.kt:257)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Bottom Bar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a2 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(2058576770);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(2058577603);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a3 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i3 << 3) & 896), 58);
            M.K(-608350816);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a, null, null, null, null, a2, d.a.a(a3, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i3 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n48(i, 0, this, gzsVar, gzsVar2, x5Var);
        }
    }
}
