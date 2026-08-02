package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.c16;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.k36;
import xsna.q630;
import xsna.rco0;
import xsna.tdu0;
import xsna.ty6;
import xsna.z06;
import xsna.zr5;

/* compiled from: BannerScreenContent.kt */
/* loaded from: classes18.dex */
public final class k36 implements yah0 {
    public final zrp b = Banner$Notification$Appearance.h();
    public final zrp c = c.h();
    public final zrp d = d.h();
    public final zrp e = Banner$BackgroundMode.h();
    public final zrp f = b.h();
    public final zrp g = a.h();
    public final List h;
    public final zrp i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Illustration;
        public static final a Image;
        public static final a None;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("Image", 1);
            Image = aVar2;
            a aVar3 = new a("Illustration", 2);
            Illustration = aVar3;
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
    /* compiled from: BannerScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Chevron;
        public static final b Dismiss;
        public static final b More;
        public static final b None;

        static {
            b bVar = new b("Dismiss", 0);
            Dismiss = bVar;
            b bVar2 = new b("Chevron", 1);
            Chevron = bVar2;
            b bVar3 = new b("More", 2);
            More = bVar3;
            b bVar4 = new b("None", 3);
            None = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
    /* compiled from: BannerScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Icon;
        public static final c None;

        static {
            c cVar = new c("Icon", 0);
            Icon = cVar;
            c cVar2 = new c("None", 1);
            None = cVar2;
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
    /* compiled from: BannerScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Avatar;
        public static final d Icon;
        public static final d Image;
        public static final d None;

        static {
            d dVar = new d("Image", 0);
            Image = dVar;
            d dVar2 = new d("Avatar", 1);
            Avatar = dVar2;
            d dVar3 = new d("Icon", 2);
            Icon = dVar3;
            d dVar4 = new d("None", 3);
            None = dVar4;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerScreenContent.kt */
    public static final class e {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e Expandable;
        public static final e None;
        public static final e Plain;

        static {
            e eVar = new e("None", 0);
            None = eVar;
            e eVar2 = new e("Plain", 1);
            Plain = eVar2;
            e eVar3 = new e("Expandable", 2);
            Expandable = eVar3;
            e[] eVarArr = {eVar, eVar2, eVar3};
            $VALUES = eVarArr;
            $ENTRIES = new asp(eVarArr);
        }

        public e() {
            throw null;
        }

        public static zrp<e> h() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* compiled from: BannerScreenContent.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[Banner$BackgroundMode.values().length];
            try {
                iArr[Banner$BackgroundMode.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Banner$BackgroundMode.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.Avatar.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.Icon.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[b.values().length];
            try {
                iArr3[b.Dismiss.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[b.Chevron.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[b.More.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[b.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[a.values().length];
            try {
                iArr4[a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[a.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[a.Illustration.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[c.values().length];
            try {
                iArr5[c.Icon.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[c.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[e.values().length];
            try {
                iArr6[e.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[e.Plain.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[e.Expandable.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public k36() {
        dt1.a.getClass();
        this.h = e43.l(dt1.a.b, dt1.a.e);
        this.i = e.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d16.c e(e eVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(694957546, i, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.textSample (BannerScreenContent.kt:470)");
        }
        int i2 = f.$EnumSwitchMapping$5[eVar.ordinal()];
        d16.c cVar = null;
        if (i2 == 1) {
            aVar.K(1738005084);
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(1738063209);
            cVar = d16.c.b.a.a("Text text text", null, aVar, 390, 2);
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(2134274175, aVar);
            }
            aVar.K(1738219480);
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                aVar.R(x);
            }
            wh50 wh50Var = (wh50) x;
            us2 b2 = ws2.b("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Incididunt ut labore.\nLorem ipsum dolor sit amet.", aVar, 6);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x2 = aVar.x();
            if (x2 == c0012a) {
                x2 = new m26(0, wh50Var);
                aVar.R(x2);
            }
            cVar = d16.c.a.C2698a.a(b2, booleanValue, (gzs) x2, "Show more", 0, null, 0L, 0L, null, aVar, 3456, 2032);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-407537207);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-407537207, i2, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Content (BannerScreenContent.kt:75)");
            }
            q630 f2 = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Banner", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = qq.h(0, M);
            }
            wh50 wh50Var = (wh50) x;
            vpu0.c(((Number) wh50Var.getValue()).intValue(), kai.c(665978706, new t26(wh50Var, 0), M), txj0.f(aVar2, 1.0f), 0L, false, null, M, Tensorflow.FRAME_WIDTH, 120);
            M = M;
            djn0.a(true, true, M, 438, 0);
            q630 d2 = txj0.d(s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 1.0f);
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, d2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            int intValue = ((Number) wh50Var.getValue()).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    M.K(2041933629);
                } else {
                    M.K(-1735086822);
                    c((i4 >> 15) & 14, M);
                }
                M.j();
            } else {
                M.K(-1735087954);
                b((i4 >> 15) & 14, M);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u26(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        Object obj;
        String str;
        String str2;
        LayoutNode.a aVar3;
        Banner$BackgroundMode banner$BackgroundMode;
        e eVar;
        Object obj2 = this;
        androidx.compose.runtime.a M = aVar.M(-1159458627);
        if ((i & 6) == 0) {
            i2 = i | (M.J(obj2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1159458627, i2, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Banners (BannerScreenContent.kt:118)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Banner$BackgroundMode.Auto);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(d.Image);
                M.R(x2);
            }
            final wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(b.Chevron);
                M.R(x3);
            }
            final wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x4);
            }
            final wh50 wh50Var4 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x5);
            }
            final wh50 wh50Var5 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(e.None);
                M.R(x6);
            }
            final wh50 wh50Var6 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            final wh50 wh50Var7 = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            final wh50 wh50Var8 = (wh50) x8;
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x9);
            }
            final wh50 wh50Var9 = (wh50) x9;
            Object x10 = M.x();
            if (x10 == c0012a) {
                x10 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x10);
            }
            final wh50 wh50Var10 = (wh50) x10;
            Object x11 = M.x();
            if (x11 == c0012a) {
                x11 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x11);
            }
            final wh50 wh50Var11 = (wh50) x11;
            Object x12 = M.x();
            if (x12 == c0012a) {
                x12 = androidx.compose.runtime.k.b(a.None);
                M.R(x12);
            }
            final wh50 wh50Var12 = (wh50) x12;
            Object x13 = M.x();
            if (x13 == c0012a) {
                x13 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x13);
            }
            final wh50 wh50Var13 = (wh50) x13;
            q630.a aVar4 = q630.a.a;
            q630 D = p490.D(txj0.f(aVar4, 1.0f), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D2, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            int i3 = i2;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x14 = M.x();
            if (x14 == c0012a) {
                x14 = new af0(2);
                M.R(x14);
            }
            final zp8 a3 = d16.a.C2697a.a(buttonStyle, buttonAppearance, null, "Button", null, null, null, null, null, null, null, null, (gzs) x14, M, 3126, 27648, 8180);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, aVar4);
            int i4 = f.$EnumSwitchMapping$0[((Banner$BackgroundMode) wh50Var.getValue()).ordinal()];
            if (i4 == 1) {
                str = "https://t4.ftcdn.net/jpg/03/26/59/69/360_F_326596944_m7WkrlErKIg1W2HAIzuOWUwGZ5R54v4h.jpg";
            } else if (i4 != 2) {
                str2 = null;
                fwu0.c(F, null, str2, null, null, null, null, kai.c(571224580, new a0t(this) { // from class: xsna.d36
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x03df  */
                    /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x02a1  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x0282  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x021d  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x01ba  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x025c  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x026b  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x027e  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x029f  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x02b0  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x02c3  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x02d2  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0301  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x03f2  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x040c  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x042d  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0410  */
                    @Override // xsna.a0t
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                        androidx.compose.runtime.a aVar6;
                        int i5;
                        b16 f2;
                        b16 b16Var;
                        int i6;
                        a.C0011a.C0012a c0012a2;
                        z06 z06Var;
                        zp8 zp8Var;
                        androidx.compose.runtime.a aVar7;
                        jai jaiVar;
                        int i7;
                        a.C0011a.C0012a c0012a3;
                        gzs gzsVar;
                        c16 c16Var;
                        Object x15;
                        int i8;
                        int i9;
                        int i10;
                        z06 a4;
                        lg90 lg90Var = (lg90) obj5;
                        androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar8.J(lg90Var) : aVar8.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar8.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(571224580, intValue, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Banners.<anonymous>.<anonymous> (BannerScreenContent.kt:155)");
                            }
                            Banner$BackgroundMode banner$BackgroundMode2 = (Banner$BackgroundMode) wh50Var.getValue();
                            int i11 = k36.f.$EnumSwitchMapping$1[((k36.d) wh50Var2.getValue()).ordinal()];
                            if (i11 == 1) {
                                aVar6 = aVar8;
                                i5 = 2;
                                aVar6.K(-808985797);
                                f2 = wp80.f(rco0.a.a(new zr5.b(1L), "IM", aVar6, 438), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                aVar6.j();
                            } else if (i11 != 2) {
                                if (i11 == 3) {
                                    aVar8.K(-808978056);
                                    qzu0.a.getClass();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1805075810, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationCall48> (VkIcons.kt:3564)");
                                    }
                                    lg90 a5 = pg90.a(R.drawable.vk_icon_illustration_call_48, 0, aVar8);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1868000606, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationDonutCalendar48H> (VkIcons.kt:3720)");
                                    }
                                    lg90 a6 = pg90.a(R.drawable.vk_icon_illustration_donut_calendar_48h, 0, aVar8);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(320832415, 72, -1, "com.vk.core.tool.compose.core.painterThemable (painterResourceThemable.kt:22)");
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar8.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (!ylu0Var.s()) {
                                        a5 = a6;
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar6 = aVar8;
                                    pw6 a7 = a16.a(a5, 0L, 0L, null, aVar6, 14);
                                    aVar6.j();
                                    b16Var = a7;
                                } else {
                                    if (i11 != 4) {
                                        throw alb0.c(-808987807, aVar8);
                                    }
                                    aVar8.K(691675993);
                                    aVar8.j();
                                    b16Var = null;
                                    aVar6 = aVar8;
                                }
                                i5 = 2;
                                i6 = k36.f.$EnumSwitchMapping$2[((k36.b) wh50Var3.getValue()).ordinal()];
                                a.C0011a.C0012a c0012a4 = a.C0011a.a;
                                if (i6 == 1) {
                                    if (i6 == i5) {
                                        aVar6.K(-808964999);
                                        Object x16 = aVar6.x();
                                        if (x16 == c0012a4) {
                                            x16 = new iy2(4);
                                            aVar6.R(x16);
                                        }
                                        a4 = z06.a.C4145a.a((gzs) x16, null, null, aVar6, 3078, 6);
                                        aVar6.j();
                                    } else if (i6 == 3) {
                                        aVar6.K(-808962442);
                                        Object x17 = aVar6.x();
                                        if (x17 == c0012a4) {
                                            x17 = new com.vk.movika.sdk.base.logic.interactor.g(3);
                                            aVar6.R(x17);
                                        }
                                        a4 = z06.c.a.a((gzs) x17, aVar6);
                                        aVar6.j();
                                    } else {
                                        if (i6 != 4) {
                                            throw alb0.c(-808969748, aVar6);
                                        }
                                        aVar6.K(692031129);
                                        aVar6.j();
                                        c0012a2 = c0012a4;
                                        z06Var = null;
                                    }
                                    z06Var = a4;
                                    c0012a2 = c0012a4;
                                } else {
                                    aVar6.K(-808967655);
                                    Object x18 = aVar6.x();
                                    if (x18 == c0012a4) {
                                        x18 = new com.vk.movika.sdk.base.ui.g0(5);
                                        aVar6.R(x18);
                                    }
                                    c0012a2 = c0012a4;
                                    z06 a8 = z06.b.a.a((gzs) x18, null, null, null, null, null, aVar6, 1572870, 62);
                                    aVar6.j();
                                    z06Var = a8;
                                }
                                if (!((Boolean) wh50Var11.getValue()).booleanValue()) {
                                    lg90Var = null;
                                }
                                String str3 = !((Boolean) wh50Var4.getValue()).booleanValue() ? "Header" : null;
                                String str4 = !((Boolean) wh50Var5.getValue()).booleanValue() ? "Subhead" : null;
                                d16.c e2 = k36.e((k36.e) wh50Var6.getValue(), aVar6, 0);
                                boolean booleanValue = ((Boolean) wh50Var7.getValue()).booleanValue();
                                zp8 zp8Var2 = a3;
                                zp8 zp8Var3 = !booleanValue ? zp8Var2 : null;
                                if (((Boolean) wh50Var8.getValue()).booleanValue()) {
                                    zp8Var = zp8Var2;
                                    zp8Var2 = null;
                                } else {
                                    zp8Var = zp8Var2;
                                }
                                if (!((Boolean) wh50Var9.getValue()).booleanValue()) {
                                    zp8Var = null;
                                }
                                if (((Boolean) wh50Var13.getValue()).booleanValue()) {
                                    aVar7 = aVar6;
                                    jaiVar = null;
                                } else {
                                    aVar7 = aVar6;
                                    jaiVar = rbi.a;
                                }
                                a.C0011a.C0012a c0012a5 = c0012a2;
                                androidx.compose.runtime.a aVar9 = aVar7;
                                xl20 a9 = d16.b.a(str3, str4, e2, zp8Var3, zp8Var2, zp8Var, jaiVar, null, aVar9, 100663296, 128);
                                i7 = k36.f.$EnumSwitchMapping$3[((k36.a) wh50Var12.getValue()).ordinal()];
                                if (i7 != 1) {
                                    c0012a3 = c0012a5;
                                    gzsVar = null;
                                    aVar9.K(693706617);
                                    aVar9.j();
                                    c16Var = null;
                                } else if (i7 == i5) {
                                    aVar9.K(-808904115);
                                    if (androidx.compose.runtime.b.d()) {
                                        i8 = 0;
                                        androidx.compose.runtime.b.f(-688645362, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationPhone120H> (VkSdkIcons.kt:1200)");
                                    } else {
                                        i8 = 0;
                                    }
                                    lg90 a10 = pg90.a(R.drawable.vk_icon_illustration_phone_120h, i8, aVar9);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    ex5 ex5Var = new ex5(a10, l5g.c(14, l5g.h, 0.5f));
                                    if (androidx.compose.runtime.b.d()) {
                                        i9 = -1;
                                        androidx.compose.runtime.b.f(-1433774837, 3080, -1, "com.vk.core.compose.component.banner.Banner.Fixed.Image.Companion.invoke (Banner.kt:477)");
                                    } else {
                                        i9 = -1;
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-2081797204, 70, i9, "com.vk.core.compose.component.banner.remember (FixedImageImpl.kt:47)");
                                    }
                                    Object x19 = aVar9.x();
                                    c0012a3 = c0012a5;
                                    if (x19 == c0012a3) {
                                        x19 = new zmr(ex5Var);
                                        aVar9.R(x19);
                                    }
                                    zmr zmrVar = (zmr) x19;
                                    ((zak0) zmrVar.a).setValue(ex5Var);
                                    gzsVar = null;
                                    ((zak0) zmrVar.b).setValue(null);
                                    ((zak0) zmrVar.c).setValue(null);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar9.j();
                                    c16Var = zmrVar;
                                } else {
                                    if (i7 != 3) {
                                        throw alb0.c(-808907820, aVar9);
                                    }
                                    aVar9.K(-808895535);
                                    if (androidx.compose.runtime.b.d()) {
                                        i10 = 0;
                                        androidx.compose.runtime.b.f(-688645362, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationPhone120H> (VkSdkIcons.kt:1200)");
                                    } else {
                                        i10 = 0;
                                    }
                                    lg90 a11 = pg90.a(R.drawable.vk_icon_illustration_phone_120h, i10, aVar9);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    ymr a12 = c16.a.C2633a.a(new ex5(a11, l5g.c(14, l5g.e, 0.5f)), aVar9, 3080, 6);
                                    aVar9.j();
                                    c16Var = a12;
                                    c0012a3 = c0012a5;
                                    gzsVar = null;
                                }
                                x15 = aVar9.x();
                                if (x15 == c0012a3) {
                                    x15 = new qe3(2);
                                    aVar9.R(x15);
                                }
                                beu0.a(a9, null, lg90Var, null, null, banner$BackgroundMode2, null, b16Var, z06Var, null, c16Var, !((Boolean) wh50Var10.getValue()).booleanValue() ? (gzs) x15 : gzsVar, aVar9, 512, 0, 602);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar8.K(-808981926);
                                rco0 a13 = rco0.a.a(new zr5.b(2L), "AV", aVar8, 438);
                                float f3 = 48;
                                rep repVar = rep.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-2042635230, 12582912, -1, "com.vk.core.compose.component.banner.Banner.Before.Avatar.Companion.invoke (Banner.kt:372)");
                                }
                                i5 = 2;
                                f2 = sdy.s(a13, Collections.singletonList(repVar), f3, wep.a, tgp.a, null, null, aVar8, 6);
                                aVar6 = aVar8;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar6.j();
                            }
                            b16Var = f2;
                            i6 = k36.f.$EnumSwitchMapping$2[((k36.b) wh50Var3.getValue()).ordinal()];
                            a.C0011a.C0012a c0012a42 = a.C0011a.a;
                            if (i6 == 1) {
                            }
                            if (!((Boolean) wh50Var11.getValue()).booleanValue()) {
                            }
                            if (!((Boolean) wh50Var4.getValue()).booleanValue()) {
                            }
                            if (!((Boolean) wh50Var5.getValue()).booleanValue()) {
                            }
                            d16.c e22 = k36.e((k36.e) wh50Var6.getValue(), aVar6, 0);
                            boolean booleanValue2 = ((Boolean) wh50Var7.getValue()).booleanValue();
                            zp8 zp8Var22 = a3;
                            if (!booleanValue2) {
                            }
                            if (((Boolean) wh50Var8.getValue()).booleanValue()) {
                            }
                            if (!((Boolean) wh50Var9.getValue()).booleanValue()) {
                            }
                            if (((Boolean) wh50Var13.getValue()).booleanValue()) {
                            }
                            a.C0011a.C0012a c0012a52 = c0012a2;
                            androidx.compose.runtime.a aVar92 = aVar7;
                            xl20 a92 = d16.b.a(str3, str4, e22, zp8Var3, zp8Var22, zp8Var, jaiVar, null, aVar92, 100663296, 128);
                            i7 = k36.f.$EnumSwitchMapping$3[((k36.a) wh50Var12.getValue()).ordinal()];
                            if (i7 != 1) {
                            }
                            x15 = aVar92.x();
                            if (x15 == c0012a3) {
                            }
                            beu0.a(a92, null, lg90Var, null, null, banner$BackgroundMode2, null, b16Var, z06Var, null, c16Var, !((Boolean) wh50Var10.getValue()).booleanValue() ? (gzs) x15 : gzsVar, aVar92, 512, 0, 602);
                            if (androidx.compose.runtime.b.d()) {
                            }
                        } else {
                            aVar8.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 100663302, 250);
                q630 f2 = txj0.f(aVar4, 1.0f);
                androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c3 = qri.c(M, f2);
                if (M.N() != null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    aVar3 = aVar5;
                    M.I(aVar3);
                } else {
                    aVar3 = aVar5;
                    M.f();
                }
                k9q0.w(M, a4, cVar);
                k9q0.w(M, D3, eVar2);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c3, dVar);
                q630 f3 = txj0.f(aVar4, 1.0f);
                a.g gVar = androidx.compose.foundation.layout.a.h;
                ty6.b bVar2 = dt1.a.k;
                androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
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
                k9q0.w(M, a5, cVar);
                k9q0.w(M, D4, eVar2);
                ur.d(hashCode3, M, bVar, M, c2678a);
                k9q0.w(M, c4, dVar);
                tpg0 tpg0Var = tpg0.a;
                q630 b2 = tpg0Var.b(1.0f, aVar4, true);
                Banner$BackgroundMode banner$BackgroundMode2 = (Banner$BackgroundMode) wh50Var.getValue();
                Object x15 = M.x();
                if (x15 == c0012a) {
                    banner$BackgroundMode = banner$BackgroundMode2;
                    x15 = new e36(0, wh50Var);
                    M.R(x15);
                } else {
                    banner$BackgroundMode = banner$BackgroundMode2;
                }
                y9i0.b("BgMode", this.e, banner$BackgroundMode, (izs) x15, b2, M, 3078, 0);
                M.G();
                q630 f4 = txj0.f(aVar4, 1.0f);
                androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D5 = M.D();
                q630 c5 = qri.c(M, f4);
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
                k9q0.w(M, a6, cVar);
                k9q0.w(M, D5, eVar2);
                ur.d(hashCode4, M, bVar, M, c2678a);
                k9q0.w(M, c5, dVar);
                q630 b3 = tpg0Var.b(1.0f, aVar4, true);
                e eVar3 = (e) wh50Var6.getValue();
                Object x16 = M.x();
                if (x16 == c0012a) {
                    eVar = eVar3;
                    x16 = new dm3(1, wh50Var6);
                    M.R(x16);
                } else {
                    eVar = eVar3;
                }
                y9i0.b("Text", this.i, eVar, (izs) x16, b3, M, 3078, 0);
                M.G();
                q630 f5 = txj0.f(aVar4, 1.0f);
                androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
                int hashCode5 = Long.hashCode(n34.n(M));
                sy90 D6 = M.D();
                q630 c6 = qri.c(M, f5);
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
                k9q0.w(M, a7, cVar);
                k9q0.w(M, D6, eVar2);
                ur.d(hashCode5, M, bVar, M, c2678a);
                k9q0.w(M, c6, dVar);
                q630 b4 = tpg0Var.b(1.0f, aVar4, true);
                d dVar2 = (d) wh50Var2.getValue();
                Object x17 = M.x();
                if (x17 == c0012a) {
                    x17 = new f36(0, wh50Var2);
                    M.R(x17);
                }
                y9i0.b("Left", this.d, dVar2, (izs) x17, b4, M, 3078, 0);
                q630 b5 = tpg0Var.b(1.0f, aVar4, true);
                b bVar3 = (b) wh50Var3.getValue();
                Object x18 = M.x();
                if (x18 == c0012a) {
                    x18 = new r6(wh50Var3, 7);
                    M.R(x18);
                }
                y9i0.b("Rights", this.f, bVar3, (izs) x18, b5, M, 3078, 0);
                M.G();
                k36 k36Var = this;
                k36Var.d(wh50Var4, wh50Var5, wh50Var7, wh50Var8, wh50Var9, wh50Var10, kai.c(913368481, new yzs() { // from class: xsna.g36
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.yzs
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if (aVar6.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(913368481, intValue, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Banners.<anonymous>.<anonymous>.<anonymous> (BannerScreenContent.kt:261)");
                            }
                            q630.a aVar7 = q630.a.a;
                            q630 f6 = txj0.f(aVar7, 1.0f);
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar6, 0);
                            int hashCode6 = Long.hashCode(n34.n(aVar6));
                            sy90 D7 = aVar6.D();
                            q630 c7 = qri.c(aVar6, f6);
                            cri.h7.getClass();
                            LayoutNode.a aVar8 = cri.a.b;
                            if (aVar6.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar6.H();
                            if (aVar6.L()) {
                                aVar6.I(aVar8);
                            } else {
                                aVar6.f();
                            }
                            cri.a.c cVar2 = cri.a.f;
                            k9q0.w(aVar6, a8, cVar2);
                            cri.a.e eVar4 = cri.a.e;
                            k9q0.w(aVar6, D7, eVar4);
                            Integer valueOf2 = Integer.valueOf(hashCode6);
                            cri.a.b bVar4 = cri.a.g;
                            k9q0.w(aVar6, valueOf2, bVar4);
                            cri.a.C2678a c2678a2 = cri.a.h;
                            k9q0.t(aVar6, c2678a2);
                            cri.a.d dVar3 = cri.a.d;
                            k9q0.w(aVar6, c7, dVar3);
                            if (0.5f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            xpy xpyVar = new xpy(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
                            a.m mVar2 = androidx.compose.foundation.layout.a.c;
                            ty6.a aVar9 = dt1.a.n;
                            androidx.compose.foundation.layout.c a9 = androidx.compose.foundation.layout.b.a(mVar2, aVar9, aVar6, 0);
                            int hashCode7 = Long.hashCode(n34.n(aVar6));
                            sy90 D8 = aVar6.D();
                            q630 c8 = qri.c(aVar6, xpyVar);
                            if (aVar6.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar6.H();
                            if (aVar6.L()) {
                                aVar6.I(aVar8);
                            } else {
                                aVar6.f();
                            }
                            k9q0.w(aVar6, a9, cVar2);
                            k9q0.w(aVar6, D8, eVar4);
                            ur.d(hashCode7, aVar6, bVar4, aVar6, c2678a2);
                            k9q0.w(aVar6, c8, dVar3);
                            wh50 wh50Var14 = wh50.this;
                            boolean booleanValue = ((Boolean) wh50Var14.getValue()).booleanValue();
                            Object x19 = aVar6.x();
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            if (x19 == c0012a2) {
                                x19 = new zc2(1, wh50Var14);
                                aVar6.R(x19);
                            }
                            eku0.d("Image", (gzs) x19, null, booleanValue, null, false, false, aVar6, 54, 116);
                            wh50 wh50Var15 = wh50Var13;
                            boolean booleanValue2 = ((Boolean) wh50Var15.getValue()).booleanValue();
                            Object x20 = aVar6.x();
                            if (x20 == c0012a2) {
                                x20 = new i36(0, wh50Var15);
                                aVar6.R(x20);
                            }
                            eku0.d("Top Slot", (gzs) x20, null, booleanValue2, null, false, false, aVar6, 54, 116);
                            aVar6.G();
                            if (0.5f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            xpy xpyVar2 = new xpy(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
                            androidx.compose.foundation.layout.c a10 = androidx.compose.foundation.layout.b.a(mVar2, aVar9, aVar6, 0);
                            int hashCode8 = Long.hashCode(n34.n(aVar6));
                            sy90 D9 = aVar6.D();
                            q630 c9 = qri.c(aVar6, xpyVar2);
                            if (aVar6.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar6.H();
                            if (aVar6.L()) {
                                aVar6.I(aVar8);
                            } else {
                                aVar6.f();
                            }
                            k9q0.w(aVar6, a10, cVar2);
                            k9q0.w(aVar6, D9, eVar4);
                            ur.d(hashCode8, aVar6, bVar4, aVar6, c2678a2);
                            k9q0.w(aVar6, c9, dVar3);
                            zrp zrpVar = this.g;
                            wh50 wh50Var16 = wh50Var12;
                            k36.a aVar10 = (k36.a) wh50Var16.getValue();
                            Object x21 = aVar6.x();
                            if (x21 == c0012a2) {
                                x21 = new j36(0, wh50Var16);
                                aVar6.R(x21);
                            }
                            y9i0.b("Fixed", zrpVar, aVar10, (izs) x21, aVar7, aVar6, 27654, 0);
                            if (kr.f(aVar6)) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar6.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i3 << 21) & 29360128) | 1797558);
                androidx.compose.runtime.a aVar6 = M;
                boolean f6 = kr.f(aVar6);
                obj = k36Var;
                aVar2 = aVar6;
                if (f6) {
                    androidx.compose.runtime.b.e();
                    obj = k36Var;
                    aVar2 = aVar6;
                }
            } else {
                str = "https://as1.ftcdn.net/v2/jpg/06/62/22/18/1000_F_662221837_IgjCCnagTwxjED3h3gszRN0TjdDTgtl0.jpg";
            }
            str2 = str;
            fwu0.c(F, null, str2, null, null, null, null, kai.c(571224580, new a0t(this) { // from class: xsna.d36
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:107:0x03df  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x02a1  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0282  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x021d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x01ba  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x025c  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x026b  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x029f  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x02b0  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x02c3  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x02d2  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0301  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x03f2  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x040c  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x042d  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0410  */
                @Override // xsna.a0t
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    androidx.compose.runtime.a aVar62;
                    int i5;
                    b16 f22;
                    b16 b16Var;
                    int i6;
                    a.C0011a.C0012a c0012a2;
                    z06 z06Var;
                    zp8 zp8Var;
                    androidx.compose.runtime.a aVar7;
                    jai jaiVar;
                    int i7;
                    a.C0011a.C0012a c0012a3;
                    gzs gzsVar;
                    c16 c16Var;
                    Object x152;
                    int i8;
                    int i9;
                    int i10;
                    z06 a42;
                    lg90 lg90Var = (lg90) obj5;
                    androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar8.J(lg90Var) : aVar8.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar8.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(571224580, intValue, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Banners.<anonymous>.<anonymous> (BannerScreenContent.kt:155)");
                        }
                        Banner$BackgroundMode banner$BackgroundMode22 = (Banner$BackgroundMode) wh50Var.getValue();
                        int i11 = k36.f.$EnumSwitchMapping$1[((k36.d) wh50Var2.getValue()).ordinal()];
                        if (i11 == 1) {
                            aVar62 = aVar8;
                            i5 = 2;
                            aVar62.K(-808985797);
                            f22 = wp80.f(rco0.a.a(new zr5.b(1L), "IM", aVar62, 438), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar62, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                            aVar62.j();
                        } else if (i11 != 2) {
                            if (i11 == 3) {
                                aVar8.K(-808978056);
                                qzu0.a.getClass();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1805075810, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationCall48> (VkIcons.kt:3564)");
                                }
                                lg90 a52 = pg90.a(R.drawable.vk_icon_illustration_call_48, 0, aVar8);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1868000606, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationDonutCalendar48H> (VkIcons.kt:3720)");
                                }
                                lg90 a62 = pg90.a(R.drawable.vk_icon_illustration_donut_calendar_48h, 0, aVar8);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(320832415, 72, -1, "com.vk.core.tool.compose.core.painterThemable (painterResourceThemable.kt:22)");
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar8.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (!ylu0Var.s()) {
                                    a52 = a62;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar62 = aVar8;
                                pw6 a72 = a16.a(a52, 0L, 0L, null, aVar62, 14);
                                aVar62.j();
                                b16Var = a72;
                            } else {
                                if (i11 != 4) {
                                    throw alb0.c(-808987807, aVar8);
                                }
                                aVar8.K(691675993);
                                aVar8.j();
                                b16Var = null;
                                aVar62 = aVar8;
                            }
                            i5 = 2;
                            i6 = k36.f.$EnumSwitchMapping$2[((k36.b) wh50Var3.getValue()).ordinal()];
                            a.C0011a.C0012a c0012a42 = a.C0011a.a;
                            if (i6 == 1) {
                                if (i6 == i5) {
                                    aVar62.K(-808964999);
                                    Object x162 = aVar62.x();
                                    if (x162 == c0012a42) {
                                        x162 = new iy2(4);
                                        aVar62.R(x162);
                                    }
                                    a42 = z06.a.C4145a.a((gzs) x162, null, null, aVar62, 3078, 6);
                                    aVar62.j();
                                } else if (i6 == 3) {
                                    aVar62.K(-808962442);
                                    Object x172 = aVar62.x();
                                    if (x172 == c0012a42) {
                                        x172 = new com.vk.movika.sdk.base.logic.interactor.g(3);
                                        aVar62.R(x172);
                                    }
                                    a42 = z06.c.a.a((gzs) x172, aVar62);
                                    aVar62.j();
                                } else {
                                    if (i6 != 4) {
                                        throw alb0.c(-808969748, aVar62);
                                    }
                                    aVar62.K(692031129);
                                    aVar62.j();
                                    c0012a2 = c0012a42;
                                    z06Var = null;
                                }
                                z06Var = a42;
                                c0012a2 = c0012a42;
                            } else {
                                aVar62.K(-808967655);
                                Object x182 = aVar62.x();
                                if (x182 == c0012a42) {
                                    x182 = new com.vk.movika.sdk.base.ui.g0(5);
                                    aVar62.R(x182);
                                }
                                c0012a2 = c0012a42;
                                z06 a8 = z06.b.a.a((gzs) x182, null, null, null, null, null, aVar62, 1572870, 62);
                                aVar62.j();
                                z06Var = a8;
                            }
                            if (!((Boolean) wh50Var11.getValue()).booleanValue()) {
                                lg90Var = null;
                            }
                            String str3 = !((Boolean) wh50Var4.getValue()).booleanValue() ? "Header" : null;
                            String str4 = !((Boolean) wh50Var5.getValue()).booleanValue() ? "Subhead" : null;
                            d16.c e22 = k36.e((k36.e) wh50Var6.getValue(), aVar62, 0);
                            boolean booleanValue2 = ((Boolean) wh50Var7.getValue()).booleanValue();
                            zp8 zp8Var22 = a3;
                            zp8 zp8Var3 = !booleanValue2 ? zp8Var22 : null;
                            if (((Boolean) wh50Var8.getValue()).booleanValue()) {
                                zp8Var = zp8Var22;
                                zp8Var22 = null;
                            } else {
                                zp8Var = zp8Var22;
                            }
                            if (!((Boolean) wh50Var9.getValue()).booleanValue()) {
                                zp8Var = null;
                            }
                            if (((Boolean) wh50Var13.getValue()).booleanValue()) {
                                aVar7 = aVar62;
                                jaiVar = null;
                            } else {
                                aVar7 = aVar62;
                                jaiVar = rbi.a;
                            }
                            a.C0011a.C0012a c0012a52 = c0012a2;
                            androidx.compose.runtime.a aVar92 = aVar7;
                            xl20 a92 = d16.b.a(str3, str4, e22, zp8Var3, zp8Var22, zp8Var, jaiVar, null, aVar92, 100663296, 128);
                            i7 = k36.f.$EnumSwitchMapping$3[((k36.a) wh50Var12.getValue()).ordinal()];
                            if (i7 != 1) {
                                c0012a3 = c0012a52;
                                gzsVar = null;
                                aVar92.K(693706617);
                                aVar92.j();
                                c16Var = null;
                            } else if (i7 == i5) {
                                aVar92.K(-808904115);
                                if (androidx.compose.runtime.b.d()) {
                                    i8 = 0;
                                    androidx.compose.runtime.b.f(-688645362, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationPhone120H> (VkSdkIcons.kt:1200)");
                                } else {
                                    i8 = 0;
                                }
                                lg90 a10 = pg90.a(R.drawable.vk_icon_illustration_phone_120h, i8, aVar92);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                ex5 ex5Var = new ex5(a10, l5g.c(14, l5g.h, 0.5f));
                                if (androidx.compose.runtime.b.d()) {
                                    i9 = -1;
                                    androidx.compose.runtime.b.f(-1433774837, 3080, -1, "com.vk.core.compose.component.banner.Banner.Fixed.Image.Companion.invoke (Banner.kt:477)");
                                } else {
                                    i9 = -1;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-2081797204, 70, i9, "com.vk.core.compose.component.banner.remember (FixedImageImpl.kt:47)");
                                }
                                Object x19 = aVar92.x();
                                c0012a3 = c0012a52;
                                if (x19 == c0012a3) {
                                    x19 = new zmr(ex5Var);
                                    aVar92.R(x19);
                                }
                                zmr zmrVar = (zmr) x19;
                                ((zak0) zmrVar.a).setValue(ex5Var);
                                gzsVar = null;
                                ((zak0) zmrVar.b).setValue(null);
                                ((zak0) zmrVar.c).setValue(null);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar92.j();
                                c16Var = zmrVar;
                            } else {
                                if (i7 != 3) {
                                    throw alb0.c(-808907820, aVar92);
                                }
                                aVar92.K(-808895535);
                                if (androidx.compose.runtime.b.d()) {
                                    i10 = 0;
                                    androidx.compose.runtime.b.f(-688645362, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationPhone120H> (VkSdkIcons.kt:1200)");
                                } else {
                                    i10 = 0;
                                }
                                lg90 a11 = pg90.a(R.drawable.vk_icon_illustration_phone_120h, i10, aVar92);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                ymr a12 = c16.a.C2633a.a(new ex5(a11, l5g.c(14, l5g.e, 0.5f)), aVar92, 3080, 6);
                                aVar92.j();
                                c16Var = a12;
                                c0012a3 = c0012a52;
                                gzsVar = null;
                            }
                            x152 = aVar92.x();
                            if (x152 == c0012a3) {
                                x152 = new qe3(2);
                                aVar92.R(x152);
                            }
                            beu0.a(a92, null, lg90Var, null, null, banner$BackgroundMode22, null, b16Var, z06Var, null, c16Var, !((Boolean) wh50Var10.getValue()).booleanValue() ? (gzs) x152 : gzsVar, aVar92, 512, 0, 602);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar8.K(-808981926);
                            rco0 a13 = rco0.a.a(new zr5.b(2L), "AV", aVar8, 438);
                            float f32 = 48;
                            rep repVar = rep.a;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2042635230, 12582912, -1, "com.vk.core.compose.component.banner.Banner.Before.Avatar.Companion.invoke (Banner.kt:372)");
                            }
                            i5 = 2;
                            f22 = sdy.s(a13, Collections.singletonList(repVar), f32, wep.a, tgp.a, null, null, aVar8, 6);
                            aVar62 = aVar8;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar62.j();
                        }
                        b16Var = f22;
                        i6 = k36.f.$EnumSwitchMapping$2[((k36.b) wh50Var3.getValue()).ordinal()];
                        a.C0011a.C0012a c0012a422 = a.C0011a.a;
                        if (i6 == 1) {
                        }
                        if (!((Boolean) wh50Var11.getValue()).booleanValue()) {
                        }
                        if (!((Boolean) wh50Var4.getValue()).booleanValue()) {
                        }
                        if (!((Boolean) wh50Var5.getValue()).booleanValue()) {
                        }
                        d16.c e222 = k36.e((k36.e) wh50Var6.getValue(), aVar62, 0);
                        boolean booleanValue22 = ((Boolean) wh50Var7.getValue()).booleanValue();
                        zp8 zp8Var222 = a3;
                        if (!booleanValue22) {
                        }
                        if (((Boolean) wh50Var8.getValue()).booleanValue()) {
                        }
                        if (!((Boolean) wh50Var9.getValue()).booleanValue()) {
                        }
                        if (((Boolean) wh50Var13.getValue()).booleanValue()) {
                        }
                        a.C0011a.C0012a c0012a522 = c0012a2;
                        androidx.compose.runtime.a aVar922 = aVar7;
                        xl20 a922 = d16.b.a(str3, str4, e222, zp8Var3, zp8Var222, zp8Var, jaiVar, null, aVar922, 100663296, 128);
                        i7 = k36.f.$EnumSwitchMapping$3[((k36.a) wh50Var12.getValue()).ordinal()];
                        if (i7 != 1) {
                        }
                        x152 = aVar922.x();
                        if (x152 == c0012a3) {
                        }
                        beu0.a(a922, null, lg90Var, null, null, banner$BackgroundMode22, null, b16Var, z06Var, null, c16Var, !((Boolean) wh50Var10.getValue()).booleanValue() ? (gzs) x152 : gzsVar, aVar922, 512, 0, 602);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    } else {
                        aVar8.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663302, 250);
            q630 f22 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.c a42 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode22 = Long.hashCode(n34.n(M));
            sy90 D32 = M.D();
            q630 c32 = qri.c(M, f22);
            if (M.N() != null) {
            }
        } else {
            M.h();
            obj = obj2;
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new h36(obj, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        wh50 wh50Var;
        int i3;
        wh50 wh50Var2;
        cri.a.d dVar;
        int i4;
        int i5;
        long j;
        xzy xzyVar;
        a.C0011a.C0012a c0012a;
        cri.a.e eVar;
        wh50 wh50Var3;
        cri.a.C2678a c2678a;
        cri.a.d dVar2;
        cri.a.b bVar;
        wh50 wh50Var4;
        cri.a.c cVar;
        androidx.compose.runtime.a aVar2;
        z06 z06Var;
        a.g gVar;
        k36 k36Var = this;
        androidx.compose.runtime.a M = aVar.M(-163945134);
        if ((i & 6) == 0) {
            i2 = i | (M.J(k36Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-163945134, i2, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.NotificationBanners (BannerScreenContent.kt:292)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(Banner$Notification$Appearance.Neutral);
                M.R(x);
            }
            wh50 wh50Var5 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b(c.Icon);
                M.R(x2);
            }
            wh50 wh50Var6 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(b.Dismiss);
                M.R(x3);
            }
            wh50 wh50Var7 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = androidx.compose.runtime.k.b(j5g.Y(new wow(k36Var.h)));
                M.R(x4);
            }
            wh50 wh50Var8 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x5);
            }
            wh50 wh50Var9 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a2) {
                x6 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x6);
            }
            wh50 wh50Var10 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == c0012a2) {
                x7 = androidx.compose.runtime.k.b(e.None);
                M.R(x7);
            }
            wh50 wh50Var11 = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a2) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            wh50 wh50Var12 = (wh50) x8;
            Object x9 = M.x();
            if (x9 == c0012a2) {
                x9 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x9);
            }
            wh50 wh50Var13 = (wh50) x9;
            Object x10 = M.x();
            if (x10 == c0012a2) {
                x10 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x10);
            }
            wh50 wh50Var14 = (wh50) x10;
            Object x11 = M.x();
            if (x11 == c0012a2) {
                x11 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x11);
            }
            wh50 wh50Var15 = (wh50) x11;
            q630.a aVar3 = q630.a.a;
            int i6 = i2;
            q630 D = p490.D(txj0.d(aVar3, 1.0f), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D2, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar3 = cri.a.d;
            k9q0.w(M, c2, dVar3);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            Object x12 = M.x();
            if (x12 == c0012a2) {
                wh50Var = wh50Var6;
                x12 = new qo0(2);
                M.R(x12);
            } else {
                wh50Var = wh50Var6;
            }
            wh50 wh50Var16 = wh50Var;
            zp8 a3 = d16.a.C2697a.a(buttonStyle, buttonAppearance, null, "Button", null, null, null, null, null, null, null, null, (gzs) x12, M, 3126, 27648, 8180);
            androidx.compose.runtime.a aVar5 = M;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, aVar3);
            Banner$Notification$Appearance banner$Notification$Appearance = (Banner$Notification$Appearance) wh50Var5.getValue();
            int i7 = f.$EnumSwitchMapping$4[((c) wh50Var16.getValue()).ordinal()];
            if (i7 == 1) {
                aVar5.K(-268766750);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(660419258, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-InfoOutline28> (VkIcons.kt:4172)");
                } else {
                    i3 = 0;
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_info_outline_28, i3, aVar5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Banner$Notification$Appearance banner$Notification$Appearance2 = (Banner$Notification$Appearance) wh50Var5.getValue();
                if (androidx.compose.runtime.b.d()) {
                    wh50Var2 = wh50Var8;
                    dVar = dVar3;
                    i4 = -1;
                    androidx.compose.runtime.b.f(1850908012, 196616, -1, "com.vk.core.compose.component.banner.Banner.Notification.Left.Icon.Companion.invoke (Banner.kt:533)");
                } else {
                    wh50Var2 = wh50Var8;
                    dVar = dVar3;
                    i4 = -1;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1480424157, 48, i4, "com.vk.core.compose.component.defaults.VkBannerDefaults.iconColor (VkBannerDefaults.kt:74)");
                }
                aVar5.K(-1702910630);
                int i8 = tdu0.a.$EnumSwitchMapping$1[banner$Notification$Appearance2.ordinal()];
                if (i8 == 1) {
                    i5 = 3;
                    j = vcl0.a(aVar5, 1053449002, aVar5).l;
                    aVar5.j();
                } else if (i8 != 2) {
                    i5 = 3;
                    if (i8 == 3) {
                        j = vcl0.a(aVar5, 1053454601, aVar5).h;
                        aVar5.j();
                    } else {
                        if (i8 != 4) {
                            throw alb0.c(1053446360, aVar5);
                        }
                        j = vcl0.a(aVar5, 1053457417, aVar5).i;
                        aVar5.j();
                    }
                } else {
                    i5 = 3;
                    j = vcl0.a(aVar5, 1053451816, aVar5).p;
                    aVar5.j();
                }
                aVar5.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                xzy a5 = yzy.a(a4, j, 9205357640488583168L, null, null, aVar5, 70);
                aVar5 = aVar5;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                xzyVar = a5;
            } else {
                if (i7 != 2) {
                    throw alb0.c(-268769495, aVar5);
                }
                aVar5.K(258336277);
                aVar5.j();
                wh50Var2 = wh50Var8;
                dVar = dVar3;
                xzyVar = null;
                i5 = 3;
            }
            int i9 = f.$EnumSwitchMapping$2[((b) wh50Var7.getValue()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    aVar5.K(-268753731);
                    Object x13 = aVar5.x();
                    if (x13 == c0012a2) {
                        x13 = new x5(3);
                        aVar5.R(x13);
                    }
                    androidx.compose.runtime.a aVar6 = aVar5;
                    z06 a6 = z06.a.C4145a.a((gzs) x13, null, null, aVar6, 3078, 6);
                    aVar6.j();
                    z06Var = a6;
                    c0012a = c0012a2;
                    eVar = eVar2;
                    wh50Var3 = wh50Var11;
                    dVar2 = dVar;
                    cVar = cVar2;
                    bVar = bVar2;
                    aVar2 = aVar6;
                    c2678a = c2678a2;
                } else if (i9 == i5) {
                    aVar5.K(-268751302);
                    Object x14 = aVar5.x();
                    if (x14 == c0012a2) {
                        x14 = new re0(1);
                        aVar5.R(x14);
                    }
                    z06 a7 = z06.c.a.a((gzs) x14, aVar5);
                    aVar5.j();
                    c2678a = c2678a2;
                    wh50Var3 = wh50Var11;
                    z06Var = a7;
                    eVar = eVar2;
                    aVar2 = aVar5;
                    dVar2 = dVar;
                    bVar = bVar2;
                    c0012a = c0012a2;
                    wh50Var4 = wh50Var2;
                    cVar = cVar2;
                } else {
                    if (i9 != 4) {
                        throw alb0.c(-268759360, aVar5);
                    }
                    aVar5.K(258703317);
                    aVar5.j();
                    c2678a = c2678a2;
                    wh50Var3 = wh50Var11;
                    c0012a = c0012a2;
                    eVar = eVar2;
                    aVar2 = aVar5;
                    dVar2 = dVar;
                    z06Var = null;
                    cVar = cVar2;
                    bVar = bVar2;
                }
                wh50Var4 = wh50Var2;
            } else {
                androidx.compose.runtime.a aVar7 = aVar5;
                aVar7.K(-268757344);
                Object x15 = aVar7.x();
                if (x15 == c0012a2) {
                    x15 = new l35(1);
                    aVar7.R(x15);
                }
                c0012a = c0012a2;
                eVar = eVar2;
                wh50Var3 = wh50Var11;
                c2678a = c2678a2;
                dVar2 = dVar;
                bVar = bVar2;
                wh50Var4 = wh50Var2;
                cVar = cVar2;
                z06 a8 = z06.b.a.a((gzs) x15, null, null, null, null, (dt1) wh50Var2.getValue(), aVar7, 1572870, 30);
                aVar2 = aVar7;
                aVar2.j();
                z06Var = a8;
            }
            androidx.compose.runtime.a aVar8 = aVar2;
            xl20 a9 = d16.b.a(((Boolean) wh50Var9.getValue()).booleanValue() ? "Header" : null, ((Boolean) wh50Var10.getValue()).booleanValue() ? "Subhead" : null, e((e) wh50Var3.getValue(), aVar2, (i6 << 3) & 112), ((Boolean) wh50Var12.getValue()).booleanValue() ? a3 : null, ((Boolean) wh50Var13.getValue()).booleanValue() ? a3 : null, ((Boolean) wh50Var14.getValue()).booleanValue() ? a3 : null, null, null, aVar8, 102236160, 128);
            Object x16 = aVar8.x();
            if (x16 == c0012a) {
                x16 = new se0(1);
                aVar8.R(x16);
            }
            s6v0.a(a9, banner$Notification$Appearance, F, xzyVar, z06Var, null, ((Boolean) wh50Var15.getValue()).booleanValue() ? (gzs) x16 : null, aVar8, 384, 32);
            q630 f2 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.c a10 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, aVar8, 54);
            int hashCode2 = Long.hashCode(n34.n(aVar8));
            sy90 D3 = aVar8.D();
            q630 c3 = qri.c(aVar8, f2);
            if (aVar8.N() == null) {
                n34.r();
                throw null;
            }
            aVar8.H();
            if (aVar8.L()) {
                aVar8.I(aVar4);
            } else {
                aVar8.f();
            }
            k9q0.w(aVar8, a10, cVar);
            k9q0.w(aVar8, D3, eVar);
            ur.d(hashCode2, aVar8, bVar, aVar8, c2678a);
            k9q0.w(aVar8, c3, dVar2);
            q630 f3 = txj0.f(aVar3, 1.0f);
            a.g gVar2 = androidx.compose.foundation.layout.a.h;
            ty6.b bVar3 = dt1.a.k;
            wh50 wh50Var17 = wh50Var3;
            androidx.compose.foundation.layout.k a11 = androidx.compose.foundation.layout.j.a(gVar2, bVar3, aVar8, 6);
            int hashCode3 = Long.hashCode(n34.n(aVar8));
            sy90 D4 = aVar8.D();
            q630 c4 = qri.c(aVar8, f3);
            if (aVar8.N() == null) {
                n34.r();
                throw null;
            }
            aVar8.H();
            if (aVar8.L()) {
                aVar8.I(aVar4);
            } else {
                aVar8.f();
            }
            k9q0.w(aVar8, a11, cVar);
            k9q0.w(aVar8, D4, eVar);
            ur.d(hashCode3, aVar8, bVar, aVar8, c2678a);
            k9q0.w(aVar8, c4, dVar2);
            tpg0 tpg0Var = tpg0.a;
            cri.a.b bVar4 = bVar;
            q630 b2 = tpg0Var.b(1.0f, aVar3, true);
            Banner$Notification$Appearance banner$Notification$Appearance3 = (Banner$Notification$Appearance) wh50Var5.getValue();
            Object x17 = aVar8.x();
            if (x17 == c0012a) {
                x17 = new n40(wh50Var5, 8);
                aVar8.R(x17);
            }
            cri.a.c cVar3 = cVar;
            a.C0011a.C0012a c0012a3 = c0012a;
            zrp zrpVar = k36Var.b;
            cri.a.C2678a c2678a3 = c2678a;
            wh50 wh50Var18 = wh50Var4;
            cri.a.e eVar3 = eVar;
            cri.a.d dVar4 = dVar2;
            y9i0.b("Appearance", zrpVar, banner$Notification$Appearance3, (izs) x17, b2, aVar8, 3078, 0);
            aVar8.G();
            q630 f4 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a12 = androidx.compose.foundation.layout.j.a(gVar2, bVar3, aVar8, 6);
            int hashCode4 = Long.hashCode(n34.n(aVar8));
            sy90 D5 = aVar8.D();
            q630 c5 = qri.c(aVar8, f4);
            if (aVar8.N() == null) {
                n34.r();
                throw null;
            }
            aVar8.H();
            if (aVar8.L()) {
                aVar8.I(aVar4);
            } else {
                aVar8.f();
            }
            k9q0.w(aVar8, a12, cVar3);
            k9q0.w(aVar8, D5, eVar3);
            ur.d(hashCode4, aVar8, bVar4, aVar8, c2678a3);
            k9q0.w(aVar8, c5, dVar4);
            q630 b3 = tpg0Var.b(1.0f, aVar3, true);
            e eVar4 = (e) wh50Var17.getValue();
            Object x18 = aVar8.x();
            if (x18 == c0012a3) {
                gVar = gVar2;
                x18 = new qm1(wh50Var17, 4);
                aVar8.R(x18);
            } else {
                gVar = gVar2;
            }
            y9i0.b("Text", this.i, eVar4, (izs) x18, b3, aVar8, 3078, 0);
            aVar8.G();
            q630 f5 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a13 = androidx.compose.foundation.layout.j.a(gVar, bVar3, aVar8, 6);
            int hashCode5 = Long.hashCode(n34.n(aVar8));
            sy90 D6 = aVar8.D();
            q630 c6 = qri.c(aVar8, f5);
            if (aVar8.N() == null) {
                n34.r();
                throw null;
            }
            aVar8.H();
            if (aVar8.L()) {
                aVar8.I(aVar4);
            } else {
                aVar8.f();
            }
            k9q0.w(aVar8, a13, cVar3);
            k9q0.w(aVar8, D6, eVar3);
            ur.d(hashCode5, aVar8, bVar4, aVar8, c2678a3);
            k9q0.w(aVar8, c6, dVar4);
            q630 b4 = tpg0Var.b(1.0f, aVar3, true);
            c cVar4 = (c) wh50Var16.getValue();
            Object x19 = aVar8.x();
            if (x19 == c0012a3) {
                x19 = new x26(0, wh50Var16);
                aVar8.R(x19);
            }
            y9i0.b("Lefts", this.c, cVar4, (izs) x19, b4, aVar8, 3078, 0);
            q630 b5 = tpg0Var.b(1.0f, aVar3, true);
            b bVar5 = (b) wh50Var7.getValue();
            Object x20 = aVar8.x();
            if (x20 == c0012a3) {
                x20 = new y26(0, wh50Var7);
                aVar8.R(x20);
            }
            y9i0.b("Rights", this.f, bVar5, (izs) x20, b5, aVar8, 3078, 0);
            aVar8.G();
            q630 f6 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a14 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar3, aVar8, 0);
            int hashCode6 = Long.hashCode(n34.n(aVar8));
            sy90 D7 = aVar8.D();
            q630 c7 = qri.c(aVar8, f6);
            if (aVar8.N() == null) {
                n34.r();
                throw null;
            }
            aVar8.H();
            if (aVar8.L()) {
                aVar8.I(aVar4);
            } else {
                aVar8.f();
            }
            k9q0.w(aVar8, a14, cVar3);
            k9q0.w(aVar8, D7, eVar3);
            ur.d(hashCode6, aVar8, bVar4, aVar8, c2678a3);
            k9q0.w(aVar8, c7, dVar4);
            q630 b6 = tpg0Var.b(1.0f, aVar3, true);
            dt1 dt1Var = (dt1) wh50Var18.getValue();
            Object x21 = aVar8.x();
            if (x21 == c0012a3) {
                x21 = new z26(0, wh50Var18);
                aVar8.R(x21);
            }
            y9i0.b("Dismiss align", this.h, dt1Var, (izs) x21, b6, aVar8, 3078, 0);
            aVar8.G();
            k36Var = this;
            k36Var.d(wh50Var9, wh50Var10, wh50Var12, wh50Var13, wh50Var14, wh50Var15, null, aVar8, ((i6 << 21) & 29360128) | 1797558);
            M = aVar8;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v26(k36Var, i, 0);
        }
    }

    public final void d(final wh50 wh50Var, final wh50 wh50Var2, final wh50 wh50Var3, final wh50 wh50Var4, final wh50 wh50Var5, final wh50 wh50Var6, final yzs yzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1377365161);
        if ((i & 6) == 0) {
            i2 = (M.J(wh50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(wh50Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(wh50Var4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(wh50Var5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(wh50Var6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1377365161, i2, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Toggles (BannerScreenContent.kt:424)");
            }
            float f2 = 8;
            aVar2 = M;
            androidx.compose.foundation.layout.e.a(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), androidx.compose.foundation.layout.a.g(f2), null, null, 0, 0, kai.c(-1146960302, new yzs() { // from class: xsna.w26
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gur gurVar = (gur) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(gurVar) ? 4 : 2;
                    }
                    int i3 = intValue;
                    if (aVar3.t(i3 & 1, (i3 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1146960302, i3, -1, "com.vk.design.demo.presentation.screens.BannerScreenContent.Toggles.<anonymous> (BannerScreenContent.kt:430)");
                        }
                        wh50 wh50Var7 = wh50.this;
                        boolean booleanValue = ((Boolean) wh50Var7.getValue()).booleanValue();
                        float f3 = 160;
                        q630.a aVar4 = q630.a.a;
                        q630 v = txj0.v(aVar4, f3);
                        boolean J = aVar3.J(wh50Var7);
                        Object x = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (J || x == obj4) {
                            x = new n26(0, wh50Var7);
                            aVar3.R(x);
                        }
                        eku0.d("Header", (gzs) x, v, booleanValue, null, false, false, aVar3, 390, 112);
                        wh50 wh50Var8 = wh50Var2;
                        boolean booleanValue2 = ((Boolean) wh50Var8.getValue()).booleanValue();
                        q630 v2 = txj0.v(aVar4, f3);
                        boolean J2 = aVar3.J(wh50Var8);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == obj4) {
                            x2 = new o26(0, wh50Var8);
                            aVar3.R(x2);
                        }
                        eku0.d("Subhead", (gzs) x2, v2, booleanValue2, null, false, false, aVar3, 390, 112);
                        wh50 wh50Var9 = wh50Var3;
                        boolean booleanValue3 = ((Boolean) wh50Var9.getValue()).booleanValue();
                        q630 v3 = txj0.v(aVar4, f3);
                        boolean J3 = aVar3.J(wh50Var9);
                        Object x3 = aVar3.x();
                        if (J3 || x3 == obj4) {
                            x3 = new p26(0, wh50Var9);
                            aVar3.R(x3);
                        }
                        eku0.d("Button", (gzs) x3, v3, booleanValue3, null, false, false, aVar3, 390, 112);
                        wh50 wh50Var10 = wh50Var4;
                        boolean booleanValue4 = ((Boolean) wh50Var10.getValue()).booleanValue();
                        q630 v4 = txj0.v(aVar4, f3);
                        boolean J4 = aVar3.J(wh50Var10);
                        Object x4 = aVar3.x();
                        if (J4 || x4 == obj4) {
                            x4 = new q26(0, wh50Var10);
                            aVar3.R(x4);
                        }
                        eku0.d("2-nd Button", (gzs) x4, v4, booleanValue4, null, false, false, aVar3, 390, 112);
                        wh50 wh50Var11 = wh50Var5;
                        boolean booleanValue5 = ((Boolean) wh50Var11.getValue()).booleanValue();
                        q630 v5 = txj0.v(aVar4, f3);
                        boolean J5 = aVar3.J(wh50Var11);
                        Object x5 = aVar3.x();
                        if (J5 || x5 == obj4) {
                            x5 = new r26(0, wh50Var11);
                            aVar3.R(x5);
                        }
                        eku0.d("3-rd Button", (gzs) x5, v5, booleanValue5, null, false, false, aVar3, 390, 112);
                        wh50 wh50Var12 = wh50Var6;
                        boolean booleanValue6 = ((Boolean) wh50Var12.getValue()).booleanValue();
                        boolean J6 = aVar3.J(wh50Var12);
                        Object x6 = aVar3.x();
                        if (J6 || x6 == obj4) {
                            x6 = new s26(0, wh50Var12);
                            aVar3.R(x6);
                        }
                        eku0.d("Clickable", (gzs) x6, null, booleanValue6, null, false, false, aVar3, 6, 116);
                        yzs yzsVar2 = yzsVar;
                        if (yzsVar2 == null) {
                            aVar3.K(1666915651);
                        } else {
                            aVar3.K(1577792126);
                            yzsVar2.invoke(gurVar, aVar3, Integer.valueOf(i3 & 14));
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 1572918, 60);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.b36
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k36.this.d(wh50Var, wh50Var2, wh50Var3, wh50Var4, wh50Var5, wh50Var6, yzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
