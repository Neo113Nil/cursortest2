package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.Tile$TextAlignment;
import com.vk.core.compose.component.tile.Tile$TextSize;
import com.vk.core.compose.component.tile.TileContentType;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.iev;
import xsna.jto0;
import xsna.phw;
import xsna.q630;
import xsna.wkj;

/* compiled from: MilkshakeTileScreenContent.kt */
/* loaded from: classes18.dex */
public final class co20 {
    public static final co20 a = new co20();
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final Object d;
    public static final Object e;
    public static final jto0 f;
    public static final wh50 g;
    public static final wh50 h;
    public static final wh50 i;
    public static final wh50 j;
    public static final wh50 k;
    public static final kg50 l;
    public static final kg50 m;
    public static final kg50 n;
    public static final kg50 o;
    public static final kg50 p;
    public static final wh50 q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTileScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Compose;
        public static final a View;

        static {
            a aVar = new a("View", 0);
            View = aVar;
            a aVar2 = new a("Compose", 1);
            Compose = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
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
    /* compiled from: MilkshakeTileScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Fill;
        public static final b Hug;

        static {
            b bVar = new b("Hug", 0);
            Hug = bVar;
            b bVar2 = new b("Fill", 1);
            Fill = bVar2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTileScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c First;
        public static final c Second;
        public static final c Third;

        static {
            c cVar = new c("First", 0);
            First = cVar;
            c cVar2 = new c("Second", 1);
            Second = cVar2;
            c cVar3 = new c("Third", 2);
            Third = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTileScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Avatar;
        public static final d Picture;

        static {
            d dVar = new d("Avatar", 0);
            Avatar = dVar;
            d dVar2 = new d("Picture", 1);
            Picture = dVar2;
            d[] dVarArr = {dVar, dVar2};
            $VALUES = dVarArr;
            $ENTRIES = new asp(dVarArr);
        }

        public d() {
            throw null;
        }

        public static zrp<d> h() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* compiled from: MilkshakeTileScreenContent.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Hug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Fill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.Avatar.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[d.Picture.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TileContentType.values().length];
            try {
                iArr4[TileContentType.Avatar.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[TileContentType.Other.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[c.values().length];
            try {
                iArr5[c.First.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[c.Second.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[c.Third.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    static {
        zrp<d> h2 = d.h();
        int e2 = on00.e(c5g.u(h2, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : h2) {
            linkedHashMap.put(obj, ((d) obj).name());
        }
        b = linkedHashMap;
        zrp<b> h3 = b.h();
        int e3 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
        for (Object obj2 : h3) {
            linkedHashMap2.put(obj2, ((b) obj2).name());
        }
        c = linkedHashMap2;
        c cVar = c.First;
        d = pn00.k(new Pair(cVar, "Picture 1"), new Pair(c.Second, "Picture 2"), new Pair(c.Third, "Picture 3"));
        a aVar = a.View;
        e = pn00.k(new Pair(aVar, "View"), new Pair(a.Compose, "Compose"));
        f = new jto0();
        g = androidx.compose.runtime.k.b(b.Hug);
        h = androidx.compose.runtime.k.b(d.Avatar);
        i = androidx.compose.runtime.k.b(cVar);
        Boolean bool = Boolean.FALSE;
        j = androidx.compose.runtime.k.b(bool);
        k = androidx.compose.runtime.k.b(bool);
        l = androidx.compose.runtime.d.a(0.3f);
        m = androidx.compose.runtime.d.a(64.0f);
        n = androidx.compose.runtime.d.a(64.0f);
        o = androidx.compose.runtime.d.a(1.0f);
        p = androidx.compose.runtime.d.a(300.0f);
        q = androidx.compose.runtime.k.b(aVar);
    }

    public static d k() {
        return (d) ((zak0) h).getValue();
    }

    public static b l() {
        return (b) ((zak0) g).getValue();
    }

    public static int m(c cVar) {
        int i2 = e.$EnumSwitchMapping$4[cVar.ordinal()];
        if (i2 == 1) {
            return R.drawable.ds_demo_image_1;
        }
        if (i2 == 2) {
            return R.drawable.ds_demo_image_2;
        }
        if (i2 == 3) {
            return R.drawable.ds_demo_image_3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean n() {
        return ((Boolean) ((zak0) k).getValue()).booleanValue();
    }

    public final void a(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(898964237);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(898964237, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ChooseBadges (MilkshakeTileScreenContent.kt:253)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) j).getValue()).booleanValue();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new gvs(8);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            zov0.b(booleanValue, "Removable", izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, Tensorflow.FRAME_WIDTH, 112);
            boolean n2 = n();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new nyq(14);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            zov0.b(n2, "Selected", izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, Tensorflow.FRAME_WIDTH, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k87(this, i2, 8);
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    public final void b(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(488767758);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(488767758, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ChooseContent (MilkshakeTileScreenContent.kt:233)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            d k2 = k();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new x8m(19);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Content", b, k2, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            c cVar = (c) ((zak0) i).getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new t810(2);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Picture", d, cVar, izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nx7(this, i2, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void c(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1040685111);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040685111, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ChooseImplementationDetails (MilkshakeTileScreenContent.kt:344)");
            }
            a aVar2 = (a) ((zak0) q).getValue();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new c4r(15);
                M.R(x);
            }
            y9i0.a("Implementation", e, aVar2, (izs) x, txj0.f(q630.a.a, 1.0f), M, 27654, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z77(this, i2, 7);
        }
    }

    public final void d(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-269105965);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-269105965, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ChooseLayout (MilkshakeTileScreenContent.kt:220)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            b l2 = l();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new kpr(8);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Layout", c, l2, izsVar, new xpy(1.0f, true), M, 3126, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w61(this, i2, 7);
        }
    }

    public final void e(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1101752458);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1101752458, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ChooseSizeParams (MilkshakeTileScreenContent.kt:271)");
            }
            q630 E = s200.E(q630.a.a, kqu0.b, kqu0.c);
            a.j g2 = androidx.compose.foundation.layout.a.g(0);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g2, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i4 = e.$EnumSwitchMapping$0[l().ordinal()];
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 == 1) {
                M.K(-1369281269);
                yqv0.c("Width", null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 6, 0, 8186);
                M = M;
                float floatValue = ((vak0) m).getFloatValue();
                awf awfVar = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 180.0f);
                Object x = M.x();
                if (x == c0012a) {
                    x = new oqu(9);
                    M.R(x);
                }
                hkv0.c(floatValue, (izs) x, null, false, null, awfVar, 0, null, M, 48, 476);
                if (k() == d.Picture) {
                    M.K(-1368806132);
                    yqv0.c("Height", null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 6, 0, 8186);
                    M = M;
                    float floatValue2 = ((vak0) n).getFloatValue();
                    awf awfVar2 = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 180.0f);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new zsw(8);
                        M.R(x2);
                    }
                    hkv0.c(floatValue2, (izs) x2, null, false, null, awfVar2, 0, null, M, 48, 476);
                } else {
                    M.K(-1379953546);
                }
                M.j();
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(-1568191192, M);
                }
                M.K(-1368235794);
                yqv0.c("Parent width", null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 6, 0, 8186);
                androidx.compose.runtime.a aVar3 = M;
                float floatValue3 = ((vak0) l).getFloatValue();
                awf awfVar3 = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Object x3 = aVar3.x();
                if (x3 == c0012a) {
                    x3 = new b4r(14);
                    aVar3.R(x3);
                }
                hkv0.c(floatValue3, (izs) x3, null, false, null, awfVar3, 0, null, aVar3, 48, 476);
                if (k() == d.Picture) {
                    aVar3.K(-1367761277);
                    yqv0.c("Aspect ratio", null, wlb0.h(aVar3).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).i0, aVar3, 6, 0, 8186);
                    aVar3 = aVar3;
                    float floatValue4 = ((vak0) o).getFloatValue();
                    awf awfVar4 = new awf(Math.nextUp(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 3.0f);
                    Object x4 = aVar3.x();
                    if (x4 == c0012a) {
                        x4 = new uuz(6);
                        aVar3.R(x4);
                    }
                    hkv0.c(floatValue4, (izs) x4, null, false, null, awfVar4, 0, null, aVar3, 48, 476);
                } else {
                    aVar3.K(-1379953546);
                }
                aVar3.j();
                androidx.compose.runtime.a aVar4 = aVar3;
                yqv0.c("Max height", null, wlb0.h(aVar3).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).i0, aVar4, 6, 0, 8186);
                M = aVar4;
                float floatValue5 = ((vak0) p).getFloatValue();
                awf awfVar5 = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300.0f);
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new ept(10);
                    M.R(x5);
                }
                hkv0.c(floatValue5, (izs) x5, null, false, null, awfVar5, 0, null, M, 48, 476);
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
            s.d = new a86(this, i2, 9);
        }
    }

    public final void f(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        HorizontalListItem$VisualContent a2;
        Tile$TextAlignment tile$TextAlignment;
        Tile$TextSize tile$TextSize;
        Tile$TextAlignment tile$TextAlignment2;
        String str;
        androidx.compose.runtime.a aVar2;
        azo0 azo0Var;
        TileContentType tileContentType;
        long b2;
        androidx.compose.runtime.a M = aVar.M(513503363);
        int i3 = i2 | (M.J(q630Var) ? 4 : 2);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(513503363, i3, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ComposeImplementation (MilkshakeTileScreenContent.kt:187)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2139923682, 6, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.createVisualContent (MilkshakeTileScreenContent.kt:373)");
            }
            phw a3 = phw.a.a(pg90.a(m((c) ((zak0) i).getValue()), 0, M), null, wkj.a.a, null, null, M, 197000, 26);
            d k2 = k();
            int[] iArr = e.$EnumSwitchMapping$2;
            int i4 = iArr[k2.ordinal()];
            kg50 kg50Var = p;
            if (i4 == 1) {
                M.K(-266455903);
                int i5 = e.$EnumSwitchMapping$0[l().ordinal()];
                if (i5 == 1) {
                    M.K(822691087);
                    a2 = HorizontalListItem$VisualContent.a.a(a3, null, czl0.a(M), 0, M, 0, 26);
                    M = M;
                    M.j();
                } else {
                    if (i5 != 2) {
                        throw alb0.c(822688641, M);
                    }
                    M.K(-266196867);
                    p5g a4 = czl0.a(M);
                    float floatValue = ((vak0) kg50Var).getFloatValue();
                    rep repVar = rep.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1323953122, 0, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.ResizableAvatar.invoke (HorizontalListItem.kt:121)");
                    }
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new p9g0(a3, floatValue, a4);
                        M.R(x);
                    }
                    p9g0 p9g0Var = (p9g0) x;
                    ((zak0) p9g0Var.a).setValue(a3);
                    ((zak0) p9g0Var.b).setValue(new pco(floatValue));
                    ((zak0) p9g0Var.c).setValue(a4);
                    ((zak0) p9g0Var.d).setValue(repVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    a2 = p9g0Var;
                }
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(822687125, M);
                }
                M.K(-265964088);
                int i6 = e.$EnumSwitchMapping$0[l().ordinal()];
                if (i6 == 1) {
                    M.K(822706948);
                    a2 = HorizontalListItem$VisualContent.c.a(a3, M, 0, 6);
                    M.j();
                } else {
                    if (i6 != 2) {
                        throw alb0.c(822704506, M);
                    }
                    M.K(822711529);
                    a2 = HorizontalListItem$VisualContent.e.a(a3, ((vak0) o).getFloatValue(), ((vak0) kg50Var).getFloatValue(), null, null, M, 0, 24);
                    M.j();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            jto0 jto0Var = f;
            jto0Var.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1096924601, 0, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.getComposeContent (TileScreenRichTextContent.kt:70)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
            }
            lg90 a5 = pg90.a(R.drawable.vk_icon_verified_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            azo0 azo0Var2 = new azo0(a5, null);
            qzu0.a.getClass();
            azo0 azo0Var3 = new azo0(qzu0.S(M), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2057337474, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Services12> (VkIcons.kt:9716)");
            }
            lg90 a6 = pg90.a(R.drawable.vk_icon_services_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            azo0 azo0Var4 = new azo0(a6, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-166060868, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Tag12> (VkIcons.kt:10708)");
            }
            lg90 a7 = pg90.a(R.drawable.vk_icon_tag_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.K(1925761691);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            azo0 azo0Var5 = new azo0(a7, com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var.getIcon().n, M));
            jto0.b bVar = (jto0.b) ((zak0) jto0Var.c).getValue();
            int i7 = jto0.d.$EnumSwitchMapping$0[bVar.a.ordinal()];
            if (i7 == 1) {
                tile$TextAlignment = Tile$TextAlignment.Start;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tile$TextAlignment = Tile$TextAlignment.Center;
            }
            int i8 = jto0.d.$EnumSwitchMapping$1[bVar.b.ordinal()];
            if (i8 == 1) {
                tile$TextSize = Tile$TextSize.Small;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tile$TextSize = Tile$TextSize.Medium;
            }
            String str2 = bVar.c.a.c;
            String str3 = bVar.d.a.c;
            if (!bVar.e) {
                str3 = null;
            }
            String str4 = bVar.f.a.c;
            if (!bVar.g) {
                str4 = null;
            }
            if (!bVar.h) {
                azo0Var4 = null;
            }
            if (!bVar.i) {
                azo0Var2 = null;
            }
            if (bVar.j) {
                tile$TextAlignment2 = tile$TextAlignment;
                str = str4;
                aVar2 = M;
                azo0Var = azo0Var3;
            } else {
                tile$TextAlignment2 = tile$TextAlignment;
                str = str4;
                aVar2 = M;
                azo0Var = null;
            }
            String str5 = bVar.k.a.c;
            HorizontalListItem$VisualContent horizontalListItem$VisualContent = a2;
            if (!bVar.l) {
                str5 = null;
            }
            if (!bVar.m) {
                azo0Var5 = null;
            }
            if (!bVar.n) {
                azo0Var3 = null;
            }
            String str6 = str5;
            Tile$TextSize tile$TextSize2 = tile$TextSize;
            fsv0 a8 = iev.b.a(str2, str3, str, azo0Var4, azo0Var2, azo0Var, str6, azo0Var5, azo0Var3, bVar.p ? bVar.o.a.c : null, tile$TextAlignment2, tile$TextSize2, aVar2, 0, 0);
            androidx.compose.runtime.a aVar3 = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i9 = iArr[k().ordinal()];
            if (i9 == 1) {
                tileContentType = TileContentType.Avatar;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tileContentType = TileContentType.Other;
            }
            int i10 = e.$EnumSwitchMapping$0[l().ordinal()];
            wh50 wh50Var = j;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            if (i10 == 1) {
                aVar3.K(-444492476);
                int i11 = e.$EnumSwitchMapping$3[tileContentType.ordinal()];
                kg50 kg50Var2 = m;
                if (i11 == 1) {
                    float floatValue2 = ((vak0) kg50Var2).getFloatValue();
                    b2 = byc0.b(floatValue2, floatValue2);
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b2 = byc0.b(((vak0) kg50Var2).getFloatValue(), ((vak0) n).getFloatValue());
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                asv0.d(tileContentType, horizontalListItem$VisualContent, b2, a8, hr80.m(q630Var, ylu0Var2.getBackground().g, aVar4), ((Boolean) ((zak0) wh50Var).getValue()).booleanValue(), n(), null, null, null, aVar3, 0, 896);
                M = aVar3;
                M.j();
            } else {
                if (i10 != 2) {
                    throw alb0.c(-444493645, aVar3);
                }
                aVar3.K(-444473195);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                asv0.c(tileContentType, horizontalListItem$VisualContent, a8, hr80.m(q630Var, ylu0Var3.getBackground().g, aVar4), ((Boolean) ((zak0) wh50Var).getValue()).booleanValue(), n(), null, null, null, aVar3, 0, 448);
                M = aVar3;
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
            s.d = new zw5(this, q630Var, i2, 5);
        }
    }

    public final void g(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(481784398);
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(481784398, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.Content (MilkshakeTileScreenContent.kt:79)");
            }
            h(6, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getBackground().j;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(p490.D(hr80.m(aVar3, j2, aVar2), p490.x(M), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            co20 co20Var = a;
            co20Var.d(6, M);
            co20Var.b(6, M);
            co20Var.a(6, M);
            co20Var.e(6, M);
            co20Var.i(6, M);
            f.c(null, fz5.c, M, Tensorflow.FRAME_WIDTH);
            co20Var.i(6, M);
            co20Var.c(6, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar3;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(this, q630Var, i2, 5);
        }
    }

    public final void h(final int i2, androidx.compose.runtime.a aVar) {
        int i3;
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(1632339490);
        if ((i2 & 6) == 0) {
            i3 = (M.J(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1632339490, i3, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.Implementation (MilkshakeTileScreenContent.kt:102)");
            }
            int i4 = e.$EnumSwitchMapping$0[l().ordinal()];
            q630.a aVar2 = q630.a.a;
            if (i4 == 1) {
                q630Var = aVar2;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                q630Var = txj0.f(aVar2, ((vak0) l).getFloatValue());
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 1, aVar2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i5 = e.$EnumSwitchMapping$1[((a) ((zak0) q).getValue()).ordinal()];
            co20 co20Var = a;
            if (i5 == 1) {
                M.K(33246450);
                co20Var.j(q630Var, M, 48);
                M.j();
            } else {
                if (i5 != 2) {
                    throw alb0.c(33244355, M);
                }
                M.K(33249301);
                co20Var.f(q630Var, M, 48);
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
            s.d = new wzs() { // from class: xsna.bo20
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    co20.this.h(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1863609771);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1863609771, i2, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.Separator (MilkshakeTileScreenContent.kt:355)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(txj0.h(aVar2, 24), 1.0f));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 f2 = txj0.f(txj0.h(aVar2, 1), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(f2, ylu0Var.p().a, androidx.compose.ui.graphics.e.a), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bn7(this, i2, 9);
        }
    }

    public final void j(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-390892236);
        int i3 = (M.J(q630Var) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-390892236, i3, -1, "com.vk.design.demo.presentation.screens.tile.MilkshakeTileScreenContent.ViewImplementation (MilkshakeTileScreenContent.kt:116)");
            }
            Object obj = f;
            obj.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-74394518, 0, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.createViewContentUpdater (TileScreenRichTextContent.kt:120)");
            }
            boolean J = M.J(obj);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new whg0(obj, 14);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            Object obj2 = a.C0011a.a;
            if (x2 == obj2) {
                x2 = new d4r(10);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean J2 = M.J(izsVar);
            Object x3 = M.x();
            if (J2 || x3 == obj2) {
                x3 = new ppd(izsVar, 2);
                M.R(x3);
            }
            q630Var2 = q630Var;
            ae2.a(((i3 << 3) & 112) | 6, 0, M, izsVar2, (izs) x3, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y61(this, q630Var2, i2, 7);
        }
    }
}
