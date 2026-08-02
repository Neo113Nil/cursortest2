package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.hsk;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;
import xsna.xpv;

/* compiled from: PictureScreenContent.kt */
/* loaded from: classes18.dex */
public final class ala0 implements yah0 {
    public final fgg0 b = new fgg0(e43.l(16, 20, 24, 28, 32, 36, 40, 44, 48, 56, 64, 72, 80, 88, 96));
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PictureScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ClippedIcon;
        public static final a Icon;
        public static final a None;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("Icon", 1);
            Icon = aVar2;
            a aVar3 = new a("ClippedIcon", 2);
            ClippedIcon = aVar3;
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
    /* compiled from: PictureScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Icon;
        public static final b Image;

        static {
            b bVar = new b("Icon", 0);
            Icon = bVar;
            b bVar2 = new b("Image", 1);
            Image = bVar2;
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
    /* compiled from: PictureScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Compose;
        public static final c View;

        static {
            c cVar = new c("View", 0);
            View = cVar;
            c cVar2 = new c("Compose", 1);
            Compose = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static zrp<c> h() {
            return $ENTRIES;
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
    /* compiled from: PictureScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Dark;
        public static final d Light;
        public static final d None;

        static {
            d dVar = new d("None", 0);
            None = dVar;
            d dVar2 = new d("Dark", 1);
            Dark = dVar2;
            d dVar3 = new d("Light", 2);
            Light = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
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

    /* compiled from: PictureScreenContent.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.Icon.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PictureRadius.values().length];
            try {
                iArr3[PictureRadius.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[PictureRadius.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PictureRadius.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[d.values().length];
            try {
                iArr4[d.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[d.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[d.Light.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[a.values().length];
            try {
                iArr5[a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[a.Icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[a.ClippedIcon.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public ala0() {
        zrp<a> h = a.h();
        int e2 = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj : h) {
            linkedHashMap.put(((a) obj).name(), obj);
        }
        this.c = linkedHashMap;
        zrp<BadgeAlignment> h2 = BadgeAlignment.h();
        int e3 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        for (Object obj2 : h2) {
            linkedHashMap2.put(((BadgeAlignment) obj2).name(), obj2);
        }
        this.d = linkedHashMap2;
        zrp<PictureRadius> h3 = PictureRadius.h();
        int e4 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4 < 16 ? 16 : e4);
        for (Object obj3 : h3) {
            linkedHashMap3.put(((PictureRadius) obj3).name(), obj3);
        }
        this.e = linkedHashMap3;
        zrp<b> h4 = b.h();
        int e5 = on00.e(c5g.u(h4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e5 < 16 ? 16 : e5);
        for (Object obj4 : h4) {
            linkedHashMap4.put(((b) obj4).name(), obj4);
        }
        this.f = linkedHashMap4;
        zrp<d> h5 = d.h();
        int e6 = on00.e(c5g.u(h5, 10));
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e6 < 16 ? 16 : e6);
        for (Object obj5 : h5) {
            linkedHashMap5.put(((d) obj5).name(), obj5);
        }
        this.g = linkedHashMap5;
        zrp<c> h6 = c.h();
        int e7 = on00.e(c5g.u(h6, 10));
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(e7 >= 16 ? e7 : 16);
        for (Object obj6 : h6) {
            linkedHashMap6.put(((c) obj6).name(), obj6);
        }
        this.h = linkedHashMap6;
        this.i = androidx.compose.runtime.k.b(a.None);
        this.j = androidx.compose.runtime.k.b(PictureRadius.Medium);
        this.k = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.l = androidx.compose.runtime.k.b(d.None);
        this.m = androidx.compose.runtime.k.b(BadgeAlignment.BottomRight);
        this.n = androidx.compose.runtime.k.b(b.Image);
        this.o = androidx.compose.runtime.k.b(c.View);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        lg90 c2;
        androidx.compose.runtime.a M = aVar.M(-2121312205);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 32 : 16;
        } else {
            gzsVar4 = gzsVar2;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2121312205, i2, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.Content (PictureScreenContent.kt:86)");
            }
            q630 d2 = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, d2);
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
            k9q0.w(M, c3, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Picture", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b2, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-986422859);
                c2 = jh.c(qzu0.a, M);
            } else {
                M.K(-986422026);
                c2 = j8.c(qzu0.a, M);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c2, null, gzsVar4, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            djn0.a(true, true, M, 438, 0);
            c(((i2 >> 12) & 112) | 6, M);
            d((i2 >> 15) & 14, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dft(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        int i3;
        float f;
        int i4;
        efj a2;
        androidx.compose.runtime.a aVar3;
        q630 q630Var;
        int i5;
        int i6;
        Object obj;
        z190 z190Var;
        androidx.compose.runtime.a M = aVar.M(1483707338);
        int i7 = (M.o(i) ? 4 : 2) | i2 | (M.J(this) ? 32 : 16);
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1483707338, i7, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.ComposeVkPicture (PictureScreenContent.kt:289)");
            }
            M.K(1617309314);
            q630 D = s200.D(q630.a.a, 4);
            float f2 = i;
            int i8 = (i7 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-800158736, i8, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.getContent (PictureScreenContent.kt:321)");
            }
            int i9 = e.$EnumSwitchMapping$1[((b) ((zak0) this.n).getValue()).ordinal()];
            if (i9 == 1) {
                i3 = -1;
                f = f2;
                i4 = i8;
                M.K(-153395109);
                qzu0.a.getClass();
                lg90 y1 = qzu0.y1(M);
                M.K(-460126670);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                M.j();
                a2 = xpv.a.a(y1, j, null, M, 24584, 12);
                aVar3 = M;
                aVar3.j();
            } else {
                if (i9 != 2) {
                    throw alb0.c(-153396416, M);
                }
                M.K(-153386657);
                i4 = i8;
                f = f2;
                i3 = -1;
                a2 = phw.a.a(xus.s("https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", 0L, M, 6, 2), null, wkj.a.a, null, null, M, 197000, 26);
                aVar3 = M;
                aVar3.j();
            }
            efj efjVar = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            PictureRadius pictureRadius = (PictureRadius) ((zak0) this.j).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(753589808, i4, i3, "com.vk.design.demo.presentation.screens.PictureScreenContent.getBadge (PictureScreenContent.kt:338)");
            }
            int i10 = e.$EnumSwitchMapping$4[((a) ((zak0) this.i).getValue()).ordinal()];
            if (i10 == 1) {
                q630Var = D;
                i5 = i3;
                i6 = i4;
                aVar3.K(-1649664550);
                aVar3.j();
                obj = rep.a;
            } else if (i10 == 2) {
                q630Var = D;
                i5 = i3;
                i6 = i4;
                aVar3.K(-1649663234);
                qzu0.a.getClass();
                androidx.compose.runtime.a aVar4 = aVar3;
                obj = kpv.a.a(qzu0.I(aVar3), l5g.k, 0L, g(), false, null, null, aVar4, 100663352, 236);
                aVar3 = aVar4;
                aVar3.j();
            } else {
                if (i10 != 3) {
                    throw alb0.c(-1649665562, aVar3);
                }
                aVar3.K(400223845);
                qzu0.a.getClass();
                int i11 = i4;
                androidx.compose.runtime.a aVar5 = aVar3;
                q630Var = D;
                i6 = i11;
                i5 = i3;
                obj = kpv.a.a(qzu0.I(aVar3), l5g.k, 0L, g(), true, null, null, aVar5, 100859960, 204);
                aVar3 = aVar5;
                aVar3.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            List singletonList = Collections.singletonList(obj);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2072314416, i6, i5, "com.vk.design.demo.presentation.screens.PictureScreenContent.getOverlay (PictureScreenContent.kt:313)");
            }
            int i12 = e.$EnumSwitchMapping$3[((d) ((zak0) this.l).getValue()).ordinal()];
            if (i12 == 1) {
                aVar3.K(1370674524);
                aVar3.j();
                z190Var = tgp.a;
            } else if (i12 == 2) {
                aVar3.K(1370675864);
                qzu0.a.getClass();
                z190 a3 = hsk.a.a(qzu0.d(aVar3), 0L, aVar3, 3080, 6);
                aVar3.j();
                z190Var = a3;
            } else {
                if (i12 != 3) {
                    throw alb0.c(1370673151, aVar3);
                }
                aVar3.K(1370678105);
                qzu0.a.getClass();
                lg90 d2 = qzu0.d(aVar3);
                long f3 = xcv0.f(false, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-258390570, 3080, i5, "com.vk.core.compose.component.image.overlay.LightOverlay.Companion.invoke (LightOverlay.kt:53)");
                }
                Object x = aVar3.x();
                if (x == a.C0011a.a) {
                    x = new w5z(d2, f3);
                    aVar3.R(x);
                }
                w5z w5zVar = (w5z) x;
                ((zak0) w5zVar.a).setValue(d2);
                ((zak0) w5zVar.b).setValue(new l5g(f3));
                ((zak0) w5zVar.c).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                z190Var = w5zVar;
            }
            z190 z190Var2 = z190Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            gdv0.b(efjVar, f, singletonList, q630Var, pictureRadius, z190Var2, null, aVar6, 3072, 64);
            aVar2 = aVar6;
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ms3(this, i, i2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(812485865);
        if ((i & 6) == 0) {
            i2 = (M.J(r9g.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(812485865, i2, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.Content (PictureScreenContent.kt:110)");
            }
            q630 a2 = q9g.a(txj0.f(q630.a.a, 1.0f), 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a2);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            e(null, M, i2 & 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v9q(this, i, 4);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-139392142);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-139392142, i2, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.Controls (PictureScreenContent.kt:123)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, c2, dVar);
            q630 f2 = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            int i4 = i2;
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f2);
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
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            String name = ((a) ((zak0) this.i).getValue()).name();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i3 = i5;
                x = new bgy(this, 22);
                M.R(x);
            } else {
                i3 = i5;
            }
            int i6 = i3;
            y9i0.a("Badge", this.c, name, (izs) x, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            String name2 = g().name();
            boolean z2 = i6 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new lxz(this, 17);
                M.R(x2);
            }
            y9i0.a("badge Alignments", this.d, name2, (izs) x2, b3, M, 6, 0);
            q630 b4 = tpg0Var.b(1.0f, aVar2, true);
            String name3 = ((c) ((zak0) this.o).getValue()).name();
            boolean z3 = i6 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new wq20(this, 16);
                M.R(x3);
            }
            y9i0.a("Implementation", this.h, name3, (izs) x3, b4, M, 6, 0);
            M.G();
            q630 f3 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f3);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            M.K(-123124555);
            q630 b5 = tpg0Var.b(1.0f, aVar2, true);
            String name4 = ((PictureRadius) ((zak0) this.j).getValue()).name();
            boolean z4 = i6 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new px30(this, 17);
                M.R(x4);
            }
            y9i0.a("Border Radius", this.e, name4, (izs) x4, b5, M, 6, 0);
            M.j();
            q630 b6 = tpg0Var.b(1.0f, aVar2, true);
            String name5 = ((d) ((zak0) this.l).getValue()).name();
            boolean z5 = i6 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new uh40(this, 9);
                M.R(x5);
            }
            y9i0.a("Overlay", this.g, name5, (izs) x5, b6, M, 6, 0);
            q630 b7 = tpg0Var.b(1.0f, aVar2, true);
            String name6 = ((b) ((zak0) this.n).getValue()).name();
            boolean z6 = i6 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new yka0(this, 0);
                M.R(x6);
            }
            y9i0.a("Content", this.f, name6, (izs) x6, b7, M, 6, 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new clk(this, i, 1);
        }
    }

    public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2089799560);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2089799560, i2, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.ProductImagesRow (PictureScreenContent.kt:196)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, txj0.f(aVar2, 1.0f));
            float f = 8;
            u890 u890Var = new u890(f, f, f, f);
            int i3 = i2;
            efu.a aVar3 = new efu.a(120);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new xka0(this, 0);
                M.R(x);
            }
            q630Var2 = aVar2;
            uqy.b(aVar3, F, null, u890Var, null, null, null, false, null, (izs) x, M, 3072, 0, 1012);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(this, q630Var2, i, 6);
        }
    }

    public final void f(int i, int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1735437895);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1735437895, i3, -1, "com.vk.design.demo.presentation.screens.PictureScreenContent.ViewVkPicture (PictureScreenContent.kt:220)");
            }
            q630 D = s200.D(q630.a.a, 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ow60(4);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean l = ((i3 & 112) == 32) | M.l(false) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new e7g(this, i, 1);
                M.R(x2);
            }
            ae2.a(54, 0, M, izsVar, (izs) x2, D);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zka0(this, i, i2);
        }
    }

    public final BadgeAlignment g() {
        return (BadgeAlignment) ((zak0) this.m).getValue();
    }
}
