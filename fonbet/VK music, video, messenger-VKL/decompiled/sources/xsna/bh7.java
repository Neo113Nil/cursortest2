package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.bh7;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.yk8;

/* compiled from: BlurScreenContent.kt */
/* loaded from: classes18.dex */
public final class bh7 implements yah0 {
    public final LinkedHashMap b;
    public final wh50 c;
    public final kg50 d;
    public final wh50 e;
    public final LinkedHashMap f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlurScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PROGRESSIVE_BOTTOM_TO_TOP;
        public static final a PROGRESSIVE_TOP_TO_BOTTOM;
        public static final a SIMPLE;

        static {
            a aVar = new a("SIMPLE", 0);
            SIMPLE = aVar;
            a aVar2 = new a("PROGRESSIVE_TOP_TO_BOTTOM", 1);
            PROGRESSIVE_TOP_TO_BOTTOM = aVar2;
            a aVar3 = new a("PROGRESSIVE_BOTTOM_TO_TOP", 2);
            PROGRESSIVE_BOTTOM_TO_TOP = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlurScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Compose;
        public static final b View;

        static {
            b bVar = new b("View", 0);
            View = bVar;
            b bVar2 = new b("Compose", 1);
            Compose = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: BlurScreenContent.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.PROGRESSIVE_TOP_TO_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.PROGRESSIVE_BOTTOM_TO_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public bh7() {
        zrp<a> h = a.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(((a) obj).name(), obj);
        }
        this.b = linkedHashMap;
        this.c = androidx.compose.runtime.k.b(a.SIMPLE);
        this.d = androidx.compose.runtime.d.a(5.0f);
        this.e = androidx.compose.runtime.k.b(b.View);
        zrp<b> h2 = b.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : h2) {
            linkedHashMap2.put(obj2, ((b) obj2).name());
        }
        this.f = linkedHashMap2;
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(754798121);
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
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (65683 & i2) != 65682)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(754798121, i2, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.Content (BlurScreenContent.kt:76)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            uov0.a(null, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1069996400, new wzs() { // from class: xsna.wg7
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    LayoutNode.a aVar3;
                    bh7 bh7Var = this;
                    wh50 wh50Var = bh7Var.e;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1069996400, intValue, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.Content.<anonymous> (BlurScreenContent.kt:78)");
                        }
                        q630.a aVar5 = q630.a.a;
                        q630 d = txj0.d(aVar5, 1.0f);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        ty6.a aVar6 = dt1.a.n;
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar4, 0);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c2 = qri.c(aVar4, d);
                        cri.h7.getClass();
                        LayoutNode.a aVar7 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar7);
                        } else {
                            aVar4.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar4, a2, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar4, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar4, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar4, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar4, c2, dVar);
                        jjn0.a("Blur", gzs.this, x5Var, gzsVar2, null, null, aVar4, 6, 48);
                        q630 a3 = q9g.a(aVar5, 1.0f);
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c3 = qri.c(aVar4, a3);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar3 = aVar7;
                            aVar4.I(aVar3);
                        } else {
                            aVar3 = aVar7;
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d2, cVar);
                        k9q0.w(aVar4, D2, eVar);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c3, dVar);
                        q630 D3 = p490.D(txj0.d(aVar5, 1.0f), p490.x(aVar4), 14);
                        androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar4, 0);
                        int hashCode3 = Long.hashCode(n34.n(aVar4));
                        sy90 D4 = aVar4.D();
                        q630 c4 = qri.c(aVar4, D3);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar3);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a4, cVar);
                        k9q0.w(aVar4, D4, eVar);
                        ur.d(hashCode3, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c4, dVar);
                        djn0.a(true, true, aVar4, 438, 0);
                        LinkedHashMap linkedHashMap = bh7Var.f;
                        kg50 kg50Var = bh7Var.d;
                        bh7.b bVar2 = (bh7.b) ((zak0) wh50Var).getValue();
                        boolean J = aVar4.J(bh7Var);
                        Object x = aVar4.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x == c0012a) {
                            x = new mz(bh7Var, 10);
                            aVar4.R(x);
                        }
                        y9i0.a("Implementation", linkedHashMap, bVar2, (izs) x, null, aVar4, 6, 16);
                        LinkedHashMap linkedHashMap2 = bh7Var.b;
                        String name = ((bh7.a) ((zak0) bh7Var.c).getValue()).name();
                        boolean J2 = aVar4.J(bh7Var);
                        Object x2 = aVar4.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new w8(bh7Var, 10);
                            aVar4.R(x2);
                        }
                        y9i0.a("Type", linkedHashMap2, name, (izs) x2, null, aVar4, 6, 16);
                        q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5);
                        vak0 vak0Var = (vak0) kg50Var;
                        float floatValue = vak0Var.getFloatValue();
                        String str = "Blur radius = " + an10.b(vak0Var.getFloatValue());
                        awf awfVar = new awf(1.0f, 25.0f);
                        boolean J3 = aVar4.J(bh7Var);
                        Object x3 = aVar4.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new e5(bh7Var, 10);
                            aVar4.R(x3);
                        }
                        hkv0.d(floatValue, (izs) x3, F, str, false, null, awfVar, 23, null, aVar4, 12583296, 816);
                        bh7Var.d(0, aVar4);
                        bh7Var.c(0, aVar4);
                        aVar4.G();
                        int i3 = bh7.c.$EnumSwitchMapping$0[((bh7.b) ((zak0) wh50Var).getValue()).ordinal()];
                        if (i3 == 1) {
                            aVar4.K(1844942821);
                            bh7Var.e(6, aVar4);
                            aVar4.j();
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            if (i3 != 2) {
                                throw alb0.c(1844940469, aVar4);
                            }
                            aVar4.K(1844945128);
                            bh7Var.b(6, aVar4);
                            aVar4.j();
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        if (kr.f(aVar4)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 1572864, 59);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xg7(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        izs izsVar;
        float f;
        y7z y7zVar;
        izs izsVar2;
        Window window;
        View decorView;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        androidx.compose.runtime.a M = aVar.M(-333396593);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-333396593, i2, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.ComposeDynamicBlur (BlurScreenContent.kt:225)");
            }
            Activity h = e3m.h((Context) M.r(AndroidCompositionLocals_androidKt.b));
            y7z y7zVar2 = null;
            ViewGroup viewGroup = (h == null || (window = h.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : (ViewGroup) decorView.findViewById(R.id.content);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(viewGroup);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            wh50Var.setValue(viewGroup);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar2 = q630.a.a;
            q630 b2 = ra8Var.b(aVar2, ty6Var);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, c2, cri.a.d);
            float floatValue = ((vak0) this.d).getFloatValue();
            int i3 = c.$EnumSwitchMapping$1[((a) ((zak0) this.c).getValue()).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    y7zVar2 = yk8.a.h(new Pair[]{new Pair(valueOf2, new l5g(l5g.b)), new Pair(valueOf, new l5g(l5g.j))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y7zVar2 = yk8.a.h(new Pair[]{new Pair(valueOf2, new l5g(l5g.j)), new Pair(valueOf, new l5g(l5g.b))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                }
            }
            y7z y7zVar3 = y7zVar2;
            int i4 = 8 & 8;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 != 0) {
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new zlm0(11);
                    M.R(x2);
                }
                izsVar = (izs) x2;
            } else {
                izsVar = null;
            }
            izs izsVar3 = izsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-180676439, 6, -1, "com.vk.core.tool.compose.blur.rememberDynamicViewBlurState (ViewBlur.kt:90)");
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new int[2];
                M.R(x3);
            }
            int[] iArr = (int[]) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new va2();
                M.R(x4);
            }
            fg90 fg90Var = (fg90) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                xqo xqoVar = new xqo(wh50Var, iArr, fg90Var, floatValue, y7zVar3, izsVar3);
                f = floatValue;
                y7zVar = y7zVar3;
                izsVar2 = izsVar3;
                M.R(xqoVar);
                x5 = xqoVar;
            } else {
                f = floatValue;
                y7zVar = y7zVar3;
                izsVar2 = izsVar3;
            }
            xqo xqoVar2 = (xqo) x5;
            ((vak0) xqoVar2.d).g(f);
            ((zak0) xqoVar2.e).setValue(y7zVar);
            ((zak0) xqoVar2.f).setValue(izsVar2);
            T value = wh50Var.getValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new gib0(xqoVar2, 27);
                M.R(x6);
            }
            bap.c(value, (izs) x6, M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            but0.a(xqoVar2, txj0.h(txj0.f(aVar2, 1.0f), 150), M, 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg7(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-925449497);
        int i2 = i | (M.J(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-925449497, i2, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.StaticBlur (BlurScreenContent.kt:154)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            float f = kqu0.t;
            float f2 = kqu0.b;
            q630.a aVar3 = q630.a.a;
            q630 E = s200.E(aVar3, f2, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = true;
            yqv0.c("Static blur", E, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.E, M, 6, 0, 8188);
            int i3 = c.$EnumSwitchMapping$0[((b) ((zak0) this.e).getValue()).ordinal()];
            if (i3 == 1) {
                M.K(-670437331);
                q630 q = txj0.q(aVar3, 150);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new kz0(3);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                if ((i2 & 14) != 4) {
                    z = false;
                }
                boolean y = z | M.y(context);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new mm1(2, this, context);
                    M.R(x2);
                }
                ae2.a(54, 0, M, izsVar, (izs) x2, q);
                aVar2 = M;
                aVar2.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(-298723393, M);
                }
                M.K(-669725943);
                vjw.a(fwu0.l("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null, null, null, M, 6, 62), null, kh7.a(txj0.q(aVar3, 150), ((vak0) this.d).getFloatValue(), l5g.c(14, l5g.d, 0.5f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
                M.j();
                aVar2 = M;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ah7(this, i, 0);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-946740927);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-946740927, i, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.StubContent (BlurScreenContent.kt:128)");
            }
            for (int i3 = 0; i3 < 15; i3++) {
                androidx.compose.runtime.a aVar2 = M;
                com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.g.a(phw.a.a(fwu0.l("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null, null, null, aVar2, 6, 62), null, null, null, null, aVar2, 196616, 30), Cell$Left.Main.Size.Large, null, null, null, aVar2, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), null, aVar2, 2);
                com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(tgw.b(i3, "Title #", " with loooooooooooooooooooooooooooooong name"), null, null, 0, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b("Subtitle with loooooooooooooooooooooooooooooong name", 0, null, null, null, aVar2, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar2, 196608, 28);
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new i13(3);
                    aVar2.R(x);
                }
                wiu0.b(null, false, a2, a3, o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Detail", null, null, null, false, null, null, (gzs) x, aVar2, 3072, 1769472, 32759), null, null, null, null, aVar2, 62), null, null, aVar2, 0, 99);
                M = aVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yg7(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        Window window;
        View decorView;
        VkBlurContentView vkBlurContentView;
        androidx.compose.runtime.a M = aVar.M(1761950606);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1761950606, i2, -1, "com.vk.design.demo.presentation.screens.BlurScreenContent.ViewDynamicBlur (BlurScreenContent.kt:197)");
            }
            Activity h = e3m.h((Context) M.r(AndroidCompositionLocals_androidKt.b));
            if (h == null || (window = h.getWindow()) == null || (decorView = window.getDecorView()) == null || (vkBlurContentView = (VkBlurContentView) decorView.findViewById(com.vkontakte.android.R.id.blur_content_view)) == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new com.vk.movika.sdk.android.defaultplayer.control.l(this, i, 1);
                    fVar.d = wzsVar;
                }
                return;
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar2 = q630.a.a;
            q630 b2 = ra8Var.b(aVar2, ty6Var);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, c2, cri.a.d);
            q630 h2 = txj0.h(txj0.f(aVar2, 1.0f), 150);
            boolean y = M.y(vkBlurContentView);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new com.vk.movika.sdk.base.observable.w(vkBlurContentView, 8);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y2 = M.y(vkBlurContentView) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new td0(3, vkBlurContentView, this);
                M.R(x2);
            }
            ae2.a(48, 0, M, izsVar, (izs) x2, h2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new id4(this, i, 1);
            fVar.d = wzsVar;
        }
    }
}
