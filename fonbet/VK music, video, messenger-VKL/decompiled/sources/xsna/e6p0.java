package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.ktv0;
import xsna.q630;
import xsna.s2x;
import xsna.ty6;

/* compiled from: TooltipScreenContent.kt */
/* loaded from: classes18.dex */
public final class e6p0 implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;

    /* compiled from: TooltipScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l6p0.values().length];
            try {
                iArr[l6p0.Lego.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l6p0.Milkshake.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e6p0() {
        zrp<upw> h = upw.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((upw) obj).name());
        }
        this.b = linkedHashMap;
        zrp<l6p0> h2 = l6p0.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : h2) {
            linkedHashMap2.put(obj2, ((l6p0) obj2).name());
        }
        this.c = linkedHashMap2;
        this.d = androidx.compose.runtime.k.b(new tho0("Title", 0L, 6));
        this.e = androidx.compose.runtime.k.b(new tho0("Description", 0L, 6));
        Boolean bool = Boolean.TRUE;
        this.f = androidx.compose.runtime.k.b(bool);
        Boolean bool2 = Boolean.FALSE;
        this.g = androidx.compose.runtime.k.b(bool2);
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = androidx.compose.runtime.k.b(bool);
        this.j = androidx.compose.runtime.k.b(bool);
        this.k = androidx.compose.runtime.k.b(bool2);
        this.l = androidx.compose.runtime.k.b(bool2);
        this.m = androidx.compose.runtime.k.b(VkTooltip.Appearance.Accent);
        this.n = androidx.compose.runtime.k.b(VkTooltipAppearance.Accent);
        this.o = androidx.compose.runtime.k.b(upw.View);
        this.p = androidx.compose.runtime.k.b(l6p0.Milkshake);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        Throwable th;
        wh50 wh50Var;
        e6p0 e6p0Var = this;
        androidx.compose.runtime.a M = aVar.M(1773447805);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(e6p0Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1773447805, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.Content (TooltipScreenContent.kt:96)");
            }
            q630 D = p490.D(txj0.d(aVar2, 1.0f), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Tooltip", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, true, M, 438, 0);
            l6p0 n = e6p0Var.n();
            boolean z = (i4 & 458752) == 131072;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                th = null;
                x = new d6p0(e6p0Var, null);
                M.R(x);
            } else {
                th = null;
            }
            bap.g(n, (wzs) x, M, 0);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(dt1.a.o);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(dt1.a.f);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            q630 f = txj0.f(aVar2, 1.0f);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(cVar2, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            Throwable th2 = th;
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, f);
            if (M.N() == null) {
                n34.r();
                throw th2;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new n26(3, wh50Var3);
                M.R(x4);
            }
            mpj0.a(390, 2, M, "Top", (gzs) x4, null);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new o26(4, wh50Var3);
                M.R(x5);
            }
            mpj0.a(390, 2, M, "Center", (gzs) x5, null);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new q26(2, wh50Var3);
                M.R(x6);
            }
            mpj0.a(390, 2, M, "Bottom", (gzs) x6, null);
            M.G();
            q630 f2 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(cVar2, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw th2;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object x7 = M.x();
            if (x7 == c0012a) {
                wh50Var = wh50Var2;
                x7 = new r26(2, wh50Var);
                M.R(x7);
            } else {
                wh50Var = wh50Var2;
            }
            mpj0.a(390, 2, M, "Left", (gzs) x7, null);
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new s26(3, wh50Var);
                M.R(x8);
            }
            mpj0.a(390, 2, M, "Center", (gzs) x8, null);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new v1e0(1, wh50Var);
                M.R(x9);
            }
            mpj0.a(390, 2, M, "Right", (gzs) x9, null);
            M.G();
            e6p0Var = this;
            if (((upw) ((zak0) e6p0Var.o).getValue()) == upw.View) {
                M.K(-257919189);
                e6p0Var.h((dt1) wh50Var3.getValue(), (dt1.b) wh50Var.getValue(), M, (i4 >> 9) & 896);
                M.j();
            } else {
                M.K(-257813944);
                e6p0Var.g((dt1) wh50Var3.getValue(), (dt1.b) wh50Var.getValue(), M, (i4 >> 9) & 896);
                M.j();
            }
            e6p0Var.d((i4 >> 15) & 14, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u26(e6p0Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        LayoutNode.a aVar2;
        LayoutNode.a aVar3;
        androidx.compose.runtime.a M = aVar.M(522844383);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(522844383, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.CheckboxControls (TooltipScreenContent.kt:487)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, aVar4, true);
            boolean q = q();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new v5n0(this, 4);
                M.R(x);
            }
            eku0.d("Without Close button", (gzs) x, b, q, null, false, false, M, 6, 112);
            q630 b2 = tpg0Var.b(1.0f, aVar4, true);
            boolean r = r();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new tsk0(this, 8);
                M.R(x2);
            }
            eku0.d("Without pointer", (gzs) x2, b2, r, null, false, false, M, 6, 112);
            M.G();
            q630 f2 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar5;
                M.I(aVar2);
            } else {
                aVar2 = aVar5;
                M.f();
            }
            k9q0.w(M, a3, cVar2);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b3 = tpg0Var.b(1.0f, aVar4, true);
            boolean p = p();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new wzb0(this, 19);
                M.R(x3);
            }
            LayoutNode.a aVar6 = aVar2;
            eku0.d("Allow dismiss outside", (gzs) x3, b3, p, null, false, false, M, 6, 112);
            q630 b4 = tpg0Var.b(1.0f, aVar4, true);
            boolean o = o();
            boolean z4 = i3 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new dei0(this, 15);
                M.R(x4);
            }
            eku0.d("Auto change gravity", (gzs) x4, b4, o, null, false, false, M, 6, 112);
            M.G();
            q630 f3 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar6;
                M.I(aVar3);
            } else {
                aVar3 = aVar6;
                M.f();
            }
            k9q0.w(M, a4, cVar2);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 b5 = tpg0Var.b(1.0f, aVar4, true);
            boolean m = m();
            boolean z5 = i3 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new iml0(this, 5);
                M.R(x5);
            }
            LayoutNode.a aVar7 = aVar3;
            eku0.d("Dismiss on tooltip click", (gzs) x5, b5, m, null, false, false, M, 6, 112);
            q630 b6 = tpg0Var.b(1.0f, aVar4, true);
            boolean j = j();
            boolean z6 = i3 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new ofc0(this, 15);
                M.R(x6);
            }
            eku0.d("Add extra", (gzs) x6, b6, j, null, false, false, M, 6, 112);
            M.G();
            q630 f4 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar2);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar2, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b7 = tpg0Var.b(1.0f, aVar4, true);
            boolean booleanValue = ((Boolean) ((zak0) this.l).getValue()).booleanValue();
            boolean z7 = i3 == 4;
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new rrn0(this, 4);
                M.R(x7);
            }
            eku0.d("Long text (3 lines)", (gzs) x7, b7, booleanValue, null, false, false, M, 6, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new loa(this, i, 2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1284528153);
        int i2 = i | 6 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1284528153, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ComposableExtraContent (TooltipScreenContent.kt:431)");
            }
            float f = 4;
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(aVar2, f);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.T;
            boolean z = false;
            yqv0.c("Хочешь стать мобильным разработчиком?", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 6, 0, 8186);
            q630 f2 = txj0.f(aVar2, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new gjw(2, gzsVar);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f2, null, false, false, null, null, null, "Нет, спасибо", null, null, null, null, false, null, null, null, M, 28080, 384, 0, 4190176);
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
            s.d = new bqg(i, 7, this, q630Var2, gzsVar);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-539599428);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-539599428, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.Controls (TooltipScreenContent.kt:456)");
            }
            int i3 = i2 & 14;
            i(i3, M);
            b(i3, M);
            f(i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jma(this, i, 3);
        }
    }

    public final void e(dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-894620391);
        if ((i & 48) == 0) {
            i2 = (M.J(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-894620391, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.LongTextExampleButton (TooltipScreenContent.kt:230)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new LinkedHashMap();
                M.R(x);
            }
            Map map = (Map) x;
            boolean y = M.y(map);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new yyl0(map, 6);
                M.R(x2);
            }
            q630 o = egi.o(q630.a.a, (izs) x2);
            boolean y2 = M.y(context) | ((i2 & 112) == 32) | M.y(map);
            Object x3 = M.x();
            if (y2 || x3 == c0012a) {
                x3 = new kfg(this, context, map, 5);
                M.R(x3);
            }
            mpj0.a(6, 0, M, "Long text (3 lines)", (gzs) x3, o);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pv1(this, bVar, i, 4);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2002912716);
        int i2 = (i & 6) == 0 ? (M.J(this) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2002912716, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.SelectionControls (TooltipScreenContent.kt:541)");
            }
            wh50 wh50Var = this.o;
            upw upwVar = (upw) ((zak0) wh50Var).getValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new hfm0(this, 6);
                M.R(x);
            }
            y9i0.a("Implementation", this.b, upwVar, (izs) x, null, M, 6, 16);
            l6p0 n = n();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new rzl0(this, 8);
                M.R(x2);
            }
            y9i0.a("Theme", this.c, n, (izs) x2, null, M, 6, 16);
            if (((upw) ((zak0) wh50Var).getValue()) == upw.View) {
                M.K(-1206886004);
                zrp<VkTooltip.Appearance> h = VkTooltip.Appearance.h();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : h) {
                    if (((VkTooltip.Appearance) obj2) != VkTooltip.Appearance.Transparent || n() == l6p0.Milkshake) {
                        arrayList.add(obj2);
                    }
                }
                int e = on00.e(c5g.u(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(e >= 16 ? e : 16);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((VkTooltip.Appearance) next).name(), next);
                }
                String name = k().name();
                boolean J = M.J(linkedHashMap) | (i3 == 4);
                Object x3 = M.x();
                if (J || x3 == obj) {
                    x3 = new g6m0(1, this, linkedHashMap);
                    M.R(x3);
                }
                y9i0.a("Appearance", linkedHashMap, name, (izs) x3, null, M, 6, 16);
                M.j();
            } else {
                M.K(-1206390407);
                zrp<VkTooltipAppearance> h2 = VkTooltipAppearance.h();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : h2) {
                    if (((VkTooltipAppearance) obj3) != VkTooltipAppearance.Accent || n() == l6p0.Milkshake) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((VkTooltipAppearance) next2) != VkTooltipAppearance.Transparent || n() == l6p0.Milkshake) {
                        arrayList3.add(next2);
                    }
                }
                int e2 = on00.e(c5g.u(arrayList3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    linkedHashMap2.put(((VkTooltipAppearance) next3).name(), next3);
                }
                String name2 = l().name();
                boolean J2 = M.J(linkedHashMap2) | (i3 == 4);
                Object x4 = M.x();
                if (J2 || x4 == obj) {
                    x4 = new pm90(6, this, linkedHashMap2);
                    M.R(x4);
                }
                y9i0.a("Appearance", linkedHashMap2, name2, (izs) x4, null, M, 6, 16);
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
            s.d = new ech0(this, i, 2);
        }
    }

    public final void g(dt1 dt1Var, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        Map map;
        androidx.compose.runtime.a M = aVar.M(603379314);
        int i2 = (i & 6) == 0 ? (M.J(dt1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(603379314, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipComposeButtons (TooltipScreenContent.kt:332)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = pn00.k(new Pair(ktv0.e.a, "Top"), new Pair(ktv0.c.a, "Left"), new Pair(ktv0.d.a, "Right"), new Pair(ktv0.a.a, "Bottom"));
                M.R(x);
            }
            Map map2 = (Map) x;
            q630.a aVar3 = q630.a.a;
            q630 h = txj0.h(txj0.d(aVar3, 1.0f), 500);
            int i3 = i2 << 3;
            cp10 d = ja8.d(dt1Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 D2 = s200.D(txj0.f(aVar3, 1.0f), kqu0.v);
            if (androidx.compose.runtime.b.d()) {
                map = map2;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                map = map2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(D2, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, bVar, M, ((i3 & 896) >> 3) & 112);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            VkTooltipAppearance l = (n() == l6p0.Lego && (l() == VkTooltipAppearance.Accent || l() == VkTooltipAppearance.Transparent)) ? VkTooltipAppearance.Neutral : l();
            M.K(-1791827680);
            for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                ktv0 ktv0Var = (ktv0) entry.getKey();
                String str = (String) entry.getValue();
                guv0 s = sdi.s(false, !p(), M, 6, 0);
                cuv0.b(((tho0) ((zak0) this.d).getValue()).a.c, ktv0Var, l, null, ((tho0) ((zak0) this.e).getValue()).a.c, q(), o(), r(), m(), s, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, kai.c(-1445399373, new iq8(8, this, s), M), 0, kai.c(-1445399373, new rv7(11, str, s), M), M, 0, 199680, 23560);
            }
            aVar2 = M;
            aVar2.j();
            if (((Boolean) ((zak0) this.l).getValue()).booleanValue()) {
                aVar2.K(289318714);
                guv0 s2 = sdi.s(false, !p(), aVar2, 6, 0);
                cuv0.b("Long text example", ktv0.e.a, l, null, "Это очень длинный текст на три строки, чтобы показать как работает ограничение по количеству строк в tooltip, и убедиться что текст обрезается корректно и эллипсис отображается как ожидается", q(), o(), r(), m(), s2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, kai.c(1117963154, new xs8(9, this, s2), aVar2), 3, kai.c(-1435360944, new fne(s2, 9), aVar2), aVar2, 24582, 224256, 7176);
            } else {
                aVar2.K(272675124);
            }
            aVar2.j();
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s3 = aVar2.s();
        if (s3 != null) {
            s3.d = new le1(i, 3, this, dt1Var, bVar);
        }
    }

    public final void h(dt1 dt1Var, dt1.b bVar, androidx.compose.runtime.a aVar, int i) {
        e6p0 e6p0Var;
        androidx.compose.runtime.a aVar2;
        Context context;
        q630.a aVar3;
        int i2;
        String str;
        LinkedHashMap linkedHashMap;
        androidx.compose.runtime.a M = aVar.M(881927759);
        int i3 = (i & 6) == 0 ? (M.J(dt1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(881927759, i4, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipViewButtons (TooltipScreenContent.kt:188)");
            }
            Context context2 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = pn00.k(new Pair(VkTooltip.TooltipGravity.TOP, "Top"), new Pair(VkTooltip.TooltipGravity.LEFT, "Left"), new Pair(VkTooltip.TooltipGravity.RIGHT, "Right"), new Pair(VkTooltip.TooltipGravity.BOTTOM, "Bottom"));
                M.R(x);
            }
            Map map = (Map) x;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            q630.a aVar4 = q630.a.a;
            q630 h = txj0.h(txj0.d(aVar4, 1.0f), 500);
            int i5 = i4 << 3;
            cp10 d = ja8.d(dt1Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 D2 = s200.D(txj0.f(aVar4, 1.0f), kqu0.v);
            if (androidx.compose.runtime.b.d()) {
                context = context2;
                aVar3 = aVar4;
                i2 = i4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                context = context2;
                aVar3 = aVar4;
                i2 = i4;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(D2, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, bVar, M, ((i5 & 896) >> 3) & 112);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, m);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(709741055);
            for (Map.Entry entry : map.entrySet()) {
                VkTooltip.TooltipGravity tooltipGravity = (VkTooltip.TooltipGravity) entry.getKey();
                String str2 = (String) entry.getValue();
                boolean y = M.y(linkedHashMap2) | M.J(str2);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new defpackage.h0(25, linkedHashMap2, str2);
                    M.R(x2);
                }
                q630.a aVar6 = aVar3;
                q630 o = egi.o(aVar6, (izs) x2);
                int i6 = i2;
                Context context3 = context;
                boolean y2 = ((i6 & 896) == 256) | M.y(context3) | M.y(linkedHashMap2) | M.J(str2) | M.o(tooltipGravity.ordinal());
                Object x3 = M.x();
                if (y2 || x3 == c0012a) {
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    str = str2;
                    z8o0 z8o0Var = new z8o0(this, context3, linkedHashMap3, str, tooltipGravity, 1);
                    context = context3;
                    linkedHashMap = linkedHashMap3;
                    M.R(z8o0Var);
                    x3 = z8o0Var;
                } else {
                    context = context3;
                    linkedHashMap = linkedHashMap2;
                    str = str2;
                }
                mpj0.a(0, 0, M, str, (gzs) x3, o);
                aVar3 = aVar6;
                i2 = i6;
                linkedHashMap2 = linkedHashMap;
            }
            e6p0Var = this;
            aVar2 = M;
            int i7 = i2;
            aVar2.j();
            if (((Boolean) ((zak0) e6p0Var.l).getValue()).booleanValue()) {
                aVar2.K(527592950);
                e6p0Var.e(bVar, aVar2, (i7 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            } else {
                aVar2.K(518287215);
            }
            aVar2.j();
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            e6p0Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hj(i, 8, e6p0Var, dt1Var, bVar);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(945003677);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(945003677, i2, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.TextInputControls (TooltipScreenContent.kt:463)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.k, M, 6);
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
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tho0 tho0Var = (tho0) ((zak0) this.d).getValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xd40(this, 26);
                M.R(x);
            }
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14), xpyVar, null, null, null, M, 0, 28);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tho0 tho0Var2 = (tho0) ((zak0) this.e).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new fuc0(this, 16);
                M.R(x2);
            }
            aVar2 = M;
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var2, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, aVar2, 0, 196608, 32764), null, false, null, aVar2, 24576, 14), xpyVar2, null, null, null, aVar2, 0, 28);
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
            s.d = new j95(this, i, 4);
        }
    }

    public final boolean j() {
        return ((Boolean) ((zak0) this.k).getValue()).booleanValue();
    }

    public final VkTooltip.Appearance k() {
        return (VkTooltip.Appearance) ((zak0) this.m).getValue();
    }

    public final VkTooltipAppearance l() {
        return (VkTooltipAppearance) ((zak0) this.n).getValue();
    }

    public final boolean m() {
        return ((Boolean) ((zak0) this.j).getValue()).booleanValue();
    }

    public final l6p0 n() {
        return (l6p0) ((zak0) this.p).getValue();
    }

    public final boolean o() {
        return ((Boolean) ((zak0) this.h).getValue()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) ((zak0) this.i).getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) ((zak0) this.g).getValue()).booleanValue();
    }

    public final LinearLayout s(Context context, gzs gzsVar) {
        if (!j()) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(hbh0.b(4, context), hbh0.b(4, context), hbh0.b(4, context), hbh0.b(4, context));
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_contrast));
        vkText.setTextAppearance(R.style.VkUiTypography_Text);
        vkText.setText("Хочешь стать мобильным разработчиком?");
        linearLayout.addView(vkText, layoutParams);
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setText("Нет, спасибо");
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setOnClickListener(new bj6(gzsVar, 9));
        linearLayout.addView(vkButton, layoutParams);
        return linearLayout;
    }
}
