package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.rco0;
import xsna.ty6;
import xsna.wra0;
import xsna.zr5;
import xsna.zra0;

/* compiled from: MilkshakePlaceholderScreenContent.kt */
/* loaded from: classes18.dex */
public final class vn20 {
    public static final vn20 a = new vn20();
    public static final zrp b = c.h();
    public static final zrp c = a.h();
    public static final zrp d = b.h();
    public static final String e = "https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg";
    public static final String f = "https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg";
    public static final wh50 g = androidx.compose.runtime.k.b(c.Icon);
    public static final wh50 h = androidx.compose.runtime.k.b(b.TitleAndSubtitle);
    public static final wh50 i = androidx.compose.runtime.k.b(a.SingleButton);
    public static final wh50 j = androidx.compose.runtime.k.b(PlaceholderMode.Primary);
    public static final wh50 k = androidx.compose.runtime.k.b(Boolean.FALSE);
    public static final wh50 l = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakePlaceholderScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a None;
        public static final a SingleButton;
        public static final a ThreeButtons;
        public static final a TwoButtons;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("SingleButton", 1);
            SingleButton = aVar2;
            a aVar3 = new a("TwoButtons", 2);
            TwoButtons = aVar3;
            a aVar4 = new a("ThreeButtons", 3);
            ThreeButtons = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
    /* compiled from: MilkshakePlaceholderScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b None;
        public static final b Subtitle;
        public static final b Title;
        public static final b TitleAndSubtitle;

        static {
            b bVar = new b("None", 0);
            None = bVar;
            b bVar2 = new b("Title", 1);
            Title = bVar2;
            b bVar3 = new b("Subtitle", 2);
            Subtitle = bVar3;
            b bVar4 = new b("TitleAndSubtitle", 3);
            TitleAndSubtitle = bVar4;
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
    /* compiled from: MilkshakePlaceholderScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Avatar;
        public static final c Icon;
        public static final c Image;
        public static final c None;
        public static final c Picture;

        static {
            c cVar = new c("None", 0);
            None = cVar;
            c cVar2 = new c("Image", 1);
            Image = cVar2;
            c cVar3 = new c("Icon", 2);
            Icon = cVar3;
            c cVar4 = new c("Avatar", 3);
            Avatar = cVar4;
            c cVar5 = new c("Picture", 4);
            Picture = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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

    /* compiled from: MilkshakePlaceholderScreenContent.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SingleButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.TwoButtons.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ThreeButtons.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.Title.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.Subtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b.TitleAndSubtitle.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[c.Icon.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c.Avatar.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[c.Picture.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlaceholderMode.values().length];
            try {
                iArr4[PlaceholderMode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PlaceholderMode.Overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[PlaceholderMode.Neutral.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static boolean e() {
        return ((Boolean) ((zak0) k).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [xsna.zra0] */
    public final void a(int i2, androidx.compose.runtime.a aVar) {
        bsa0 bsa0Var;
        y48 y48Var;
        int i3;
        int i4;
        Object obj;
        bsa0 bsa0Var2;
        bsa0 s;
        int i5;
        long j2;
        Object a2;
        y48 a3;
        androidx.compose.runtime.a M = aVar.M(-199691821);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-199691821, i2, -1, "com.vk.design.demo.presentation.screens.MilkshakePlaceholderScreenContent.ComposePlaceholder (MilkshakePlaceholderScreenContent.kt:174)");
            }
            int i6 = d.$EnumSwitchMapping$0[((a) ((zak0) i).getValue()).ordinal()];
            if (i6 != 1) {
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i6 != 2) {
                    if (i6 == 3) {
                        M.K(1369705930);
                        Object x = M.x();
                        if (x == c0012a) {
                            x = new uz(15);
                            M.R(x);
                        }
                        r48 a4 = wra0.a.C3954a.a("Button", (gzs) x, null, null, null, false, null, null, null, null, null, null, e(), false, null, null, M, 54, 12582912, 122876);
                        ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                        boolean e2 = e();
                        Object x2 = M.x();
                        if (x2 == c0012a) {
                            x2 = new pr1(28);
                            M.R(x2);
                        }
                        r48 a5 = wra0.a.C3954a.a("Button", (gzs) x2, null, buttonStyle, null, false, null, null, null, null, null, null, e2, false, null, null, M, 3126, 12582912, 122868);
                        M = M;
                        a3 = wra0.b.a(a4, a5, null, M, 12);
                        M.j();
                    } else {
                        if (i6 != 4) {
                            throw alb0.c(1369692581, M);
                        }
                        M.K(1369716437);
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = new daz(3);
                            M.R(x3);
                        }
                        r48 a6 = wra0.a.C3954a.a("Button", (gzs) x3, null, null, null, false, null, null, null, null, null, null, e(), false, null, null, M, 54, 12582912, 122876);
                        ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
                        boolean e3 = e();
                        Object x4 = M.x();
                        if (x4 == c0012a) {
                            x4 = new d1(22);
                            M.R(x4);
                        }
                        r48 a7 = wra0.a.C3954a.a("Button", (gzs) x4, null, buttonStyle2, null, false, null, null, null, null, null, null, e3, false, null, null, M, 3126, 12582912, 122868);
                        boolean e4 = e();
                        Object x5 = M.x();
                        if (x5 == c0012a) {
                            x5 = new pd4(17);
                            M.R(x5);
                        }
                        r48 a8 = wra0.a.C3954a.a("Button", (gzs) x5, null, buttonStyle2, null, false, null, null, null, null, null, null, e4, false, null, null, M, 3126, 12582912, 122868);
                        M = M;
                        a3 = wra0.b.a(a6, a7, a8, M, 8);
                        M.j();
                    }
                    y48Var = a3;
                    bsa0Var = null;
                } else {
                    M.K(1369695129);
                    ButtonStyle buttonStyle3 = ButtonStyle.Secondary;
                    boolean e5 = e();
                    Object x6 = M.x();
                    if (x6 == c0012a) {
                        x6 = new x0(23);
                        M.R(x6);
                    }
                    r48 a9 = wra0.a.C3954a.a("Button", (gzs) x6, null, buttonStyle3, null, false, null, null, null, null, null, null, e5, false, null, null, M, 3126, 12582912, 122868);
                    M = M;
                    bsa0Var = null;
                    y48 a10 = wra0.b.a(a9, null, null, M, 14);
                    M.j();
                    y48Var = a10;
                }
            } else {
                bsa0Var = null;
                M.K(-489181558);
                M.j();
                y48Var = null;
            }
            int i7 = d.$EnumSwitchMapping$1[((b) ((zak0) h).getValue()).ordinal()];
            if (i7 != 1) {
                i4 = 2;
                if (i7 == 2) {
                    i3 = 4;
                    M.K(1369733878);
                    a2 = zra0.a.a("Lorem ipsum", null, null, null, M, 196614, 30);
                    M.j();
                } else if (i7 != 3) {
                    i3 = 4;
                    if (i7 != 4) {
                        throw alb0.c(1369731130, M);
                    }
                    M.K(1369742803);
                    a2 = zra0.a.a("Lorem ipsum", null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", null, M, 196998, 26);
                    M.j();
                } else {
                    i3 = 4;
                    M.K(1369737416);
                    a2 = zra0.a.a(null, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit", null, M, 196992, 27);
                    M.j();
                }
                obj = a2;
            } else {
                i3 = 4;
                i4 = 2;
                M.K(-487966358);
                M.j();
                obj = bsa0Var;
            }
            int i8 = d.$EnumSwitchMapping$2[((c) ((zak0) g).getValue()).ordinal()];
            wh50 wh50Var = j;
            if (i8 != 1) {
                if (i8 == i4) {
                    M.K(1369751599);
                    qzu0.a.getClass();
                    androidx.compose.runtime.a aVar2 = M;
                    s = ad0.s(qzu0.p0(M), 0L, null, null, null, null, null, aVar2, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    M = aVar2;
                    M.j();
                } else if (i8 == 3) {
                    M.K(1369756015);
                    if (androidx.compose.runtime.b.d()) {
                        i5 = 0;
                        androidx.compose.runtime.b.f(-2039266880, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GlobeCrossOutline56> (VkSdkIcons.kt:998)");
                    } else {
                        i5 = 0;
                    }
                    lg90 a11 = pg90.a(R.drawable.vk_icon_globe_cross_outline_56, i5, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (((PlaceholderMode) ((zak0) wh50Var).getValue()) == PlaceholderMode.Primary) {
                        M.K(1369760701);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var.getIcon().a;
                    } else {
                        M.K(1369761855);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var2.getIcon().c;
                    }
                    M.j();
                    androidx.compose.runtime.a aVar3 = M;
                    s = csa0.a(a11, j2, 0L, null, null, aVar3, 196616, 28);
                    M = aVar3;
                    M.j();
                } else if (i8 == i3) {
                    M.K(1369764328);
                    androidx.compose.runtime.a aVar4 = M;
                    s = cvk.p(rco0.a.a(new zr5.b(2L), "AV", M, 438), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar4, 196608, 30);
                    M = aVar4;
                    M.j();
                } else {
                    if (i8 != 5) {
                        throw alb0.c(1369749562, M);
                    }
                    M.K(1369768489);
                    s = alk.r(rco0.a.a(new zr5.b(1L), "IM", M, 438), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, M, 30);
                    M.j();
                }
                bsa0Var2 = s;
            } else {
                M.K(-487421750);
                M.j();
                bsa0Var2 = bsa0Var;
            }
            androidx.compose.runtime.a aVar5 = M;
            ldv0.d(null, bsa0Var2, obj, y48Var, (PlaceholderMode) ((zak0) wh50Var).getValue(), null, false, aVar5, 0, 97);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new th3(this, i2, 5);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-440701736);
        int i3 = i2 | 6;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-440701736, i3, -1, "com.vk.design.demo.presentation.screens.MilkshakePlaceholderScreenContent.Content (MilkshakePlaceholderScreenContent.kt:74)");
            }
            q630Var2 = q630.a.a;
            q630 f2 = txj0.f(q630Var2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
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
            djn0.a(true, true, M, 438, 0);
            q630 a3 = q9g.a(txj0.f(s200.F(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2), 1.0f), 1.0f);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, a3);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            a.c(54, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(this, q630Var2, i2, 7);
        }
    }

    public final void c(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        long j2;
        androidx.compose.runtime.a M = aVar.M(759883961);
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(759883961, i2, -1, "com.vk.design.demo.presentation.screens.MilkshakePlaceholderScreenContent.Placeholder (MilkshakePlaceholderScreenContent.kt:92)");
            }
            wh50 wh50Var = j;
            if (((PlaceholderMode) ((zak0) wh50Var).getValue()) == PlaceholderMode.Primary) {
                M.K(-1069371290);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var.getBackground().g;
                M.j();
            } else {
                M.K(-1069298657);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var2.getBackground().i;
                M.j();
            }
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(txj0.f(aVar3, 1.0f), j2, androidx.compose.ui.graphics.e.a);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            wh50 wh50Var2 = l;
            boolean booleanValue = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
            vn20 vn20Var = a;
            if (booleanValue) {
                M.K(-2124934497);
                vn20Var.a(6, M);
                M.j();
            } else {
                M.K(-2124877054);
                vn20Var.d(6, M);
                M.j();
            }
            M.G();
            q630 D2 = p490.D(txj0.f(aVar3, 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, a3, cVar2);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            boolean booleanValue2 = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pr0(20);
                M.R(x);
            }
            eku0.d("Compose", (gzs) x, null, booleanValue2, null, false, false, M, 54, 116);
            q630 f2 = txj0.f(aVar3, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, f2);
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
            k9q0.w(M, a4, cVar2);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar3, true);
            c cVar3 = (c) ((zak0) g).getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new s6x(8);
                M.R(x2);
            }
            y9i0.b("Top", b, cVar3, (izs) x2, b2, M, 3126, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar3, true);
            b bVar3 = (b) ((zak0) h).getValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ehu(9);
                M.R(x3);
            }
            y9i0.b("Middle", d, bVar3, (izs) x3, b3, M, 3126, 0);
            M.G();
            q630 f3 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, f3);
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
            k9q0.w(M, a5, cVar2);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b4 = tpg0Var.b(1.0f, aVar3, true);
            a aVar5 = (a) ((zak0) i).getValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new byo(9);
                M.R(x4);
            }
            y9i0.b("Bottom", c, aVar5, (izs) x4, b4, M, 3126, 0);
            aVar2 = M;
            aVar2.G();
            boolean e2 = e();
            Object x5 = aVar2.x();
            if (x5 == c0012a) {
                x5 = new u4u(12);
                aVar2.R(x5);
            }
            zov0.b(e2, "Stretched buttons", (izs) x5, null, null, false, false, aVar2, Tensorflow.FRAME_WIDTH, 120);
            boolean z = ((PlaceholderMode) ((zak0) wh50Var).getValue()) == PlaceholderMode.Overlay;
            Object x6 = aVar2.x();
            if (x6 == c0012a) {
                x6 = new xmz(7);
                aVar2.R(x6);
            }
            zov0.b(z, "Overlay mode", (izs) x6, null, null, false, false, aVar2, Tensorflow.FRAME_WIDTH, 120);
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
            s.d = new uog(this, i2, 3);
        }
    }

    public final void d(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-249794876);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-249794876, i2, -1, "com.vk.design.demo.presentation.screens.MilkshakePlaceholderScreenContent.ViewPlaceholder (MilkshakePlaceholderScreenContent.kt:237)");
            }
            q630 f2 = txj0.f(q630.a.a, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new nj(29);
                M.R(x);
            }
            izs izsVar = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new per(12);
                M.R(x2);
            }
            ae2.a(438, 0, M, izsVar, (izs) x2, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s77(this, i2, 5);
        }
    }
}
