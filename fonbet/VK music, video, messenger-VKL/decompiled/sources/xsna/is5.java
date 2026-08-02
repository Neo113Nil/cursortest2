package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.commons.http.Http;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.hsk;
import xsna.iiz;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.rco0;
import xsna.ty6;
import xsna.xpv;

/* compiled from: AvatarScreenContent.kt */
/* loaded from: classes18.dex */
public final class is5 implements yah0 {
    public final fgg0 b = new fgg0(e43.l(16, 20, 24, 28, 32, 36, 40, 44, 48, 56, 64, 72, 80, 88, 96));
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvatarScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ClippedIcon;
        public static final a ClippedLive;
        public static final a Icon;
        public static final a Live;
        public static final a MobileOnline;
        public static final a None;
        public static final a WebOnline;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("MobileOnline", 1);
            MobileOnline = aVar2;
            a aVar3 = new a("WebOnline", 2);
            WebOnline = aVar3;
            a aVar4 = new a("Icon", 3);
            Icon = aVar4;
            a aVar5 = new a("ClippedIcon", 4);
            ClippedIcon = aVar5;
            a aVar6 = new a("Live", 5);
            Live = aVar6;
            a aVar7 = new a("ClippedLive", 6);
            ClippedLive = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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
    /* compiled from: AvatarScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Icon;
        public static final b Image;
        public static final b Text;

        static {
            b bVar = new b("Icon", 0);
            Icon = bVar;
            b bVar2 = new b("Text", 1);
            Text = bVar2;
            b bVar3 = new b("Image", 2);
            Image = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
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
    /* compiled from: AvatarScreenContent.kt */
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
    /* compiled from: AvatarScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Dark;
        public static final d None;

        static {
            d dVar = new d("None", 0);
            None = dVar;
            d dVar2 = new d("Dark", 1);
            Dark = dVar2;
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

    /* compiled from: AvatarScreenContent.kt */
    public static final /* synthetic */ class e extends AdaptedFunctionReference implements izs<Context, VkAvatar> {
        public static final e b = new e(1, VkAvatar.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);

        @Override // xsna.izs
        public final VkAvatar invoke(Context context) {
            return new VkAvatar(context, null, 6, 0);
        }
    }

    /* compiled from: AvatarScreenContent.kt */
    public static final /* synthetic */ class f {
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
                iArr2[b.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[d.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[a.values().length];
            try {
                iArr4[a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[a.MobileOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[a.WebOnline.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[a.Live.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[a.Icon.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[a.ClippedIcon.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[a.ClippedLive.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BadgeAlignment.values().length];
            try {
                iArr5[BadgeAlignment.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[BadgeAlignment.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[BadgeAlignment.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[BadgeAlignment.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public is5() {
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
        zrp<d> h3 = d.h();
        int e4 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4 < 16 ? 16 : e4);
        for (Object obj3 : h3) {
            linkedHashMap3.put(((d) obj3).name(), obj3);
        }
        this.e = linkedHashMap3;
        zrp<b> h4 = b.h();
        int e5 = on00.e(c5g.u(h4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e5 < 16 ? 16 : e5);
        for (Object obj4 : h4) {
            linkedHashMap4.put(((b) obj4).name(), obj4);
        }
        this.f = linkedHashMap4;
        zrp<c> h5 = c.h();
        int e6 = on00.e(c5g.u(h5, 10));
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e6 >= 16 ? e6 : 16);
        for (Object obj5 : h5) {
            linkedHashMap5.put(obj5, ((c) obj5).name());
        }
        this.g = linkedHashMap5;
        this.h = androidx.compose.runtime.k.b(a.None);
        this.i = androidx.compose.runtime.k.b(BadgeAlignment.BottomRight);
        this.j = androidx.compose.runtime.k.b(d.None);
        this.k = androidx.compose.runtime.k.b(b.Image);
        this.l = androidx.compose.runtime.k.b(c.View);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(2094625832);
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
                androidx.compose.runtime.b.f(2094625832, i2, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.Content (AvatarScreenContent.kt:95)");
            }
            boolean l = M.l(false);
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                x = new an20();
                M.R(x);
            }
            ds5 ds5Var = (ds5) x;
            q630 d2 = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d2);
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
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Avatars", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            } else {
                i3 = 0;
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i5 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            aVar2 = M;
            q630 a4 = q9g.a(txj0.f(aVar3, 1.0f), 1.0f);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar4, aVar2, i3);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c3 = qri.c(aVar2, a4);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a5, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c3, dVar);
            aVar2.K(1577693960);
            d(ds5Var, aVar2, ((i5 >> 9) & 896) | 6);
            aVar2.j();
            e(ds5Var, aVar2, (i5 >> 12) & 112);
            aVar2.G();
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
            s.d = new b74(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(ds5 ds5Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1867450106);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(ds5Var) : M.y(ds5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        boolean z = false;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1867450106, i3, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.AvatarsRow (AvatarScreenContent.kt:201)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, txj0.f(aVar2, 1.0f));
            float f2 = 8;
            u890 u890Var = new u890(f2, f2, f2, f2);
            efu.a aVar3 = new efu.a(120);
            boolean z2 = (i3 & 896) == 256;
            if ((i3 & 14) == 4 || ((8 & i3) != 0 && M.y(ds5Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new defpackage.h0(2, this, ds5Var);
                M.R(x);
            }
            uqy.b(aVar3, F, null, u890Var, null, null, null, false, null, (izs) x, M, 3072, 0, 1012);
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
            s.d = new es5(i, 0, this, ds5Var, q630Var2);
        }
    }

    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final void c(final ds5 ds5Var, final float f2, androidx.compose.runtime.a aVar, final int i) {
        ?? r15;
        int i2;
        efj a2;
        z190 z190Var;
        iy5 iy5Var;
        androidx.compose.runtime.a M = aVar.M(-677022745);
        int i3 = (M.J(ds5Var) ? 4 : 2) | i | (M.n(f2) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-677022745, i3, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.ComposeImplementation (AvatarScreenContent.kt:223)");
            }
            q630 D = s200.D(q630.a.a, 4);
            int i4 = f.$EnumSwitchMapping$1[((b) ((zak0) this.k).getValue()).ordinal()];
            if (i4 == 1) {
                r15 = 0;
                i2 = -1;
                M.K(-2078786292);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2106424732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-User28> (VkSdkIcons.kt:3542)");
                }
                lg90 b2 = or.b(M, -1267804465, R.drawable.vk_icon_user_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.K(-17678773);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                M.j();
                a2 = xpv.a.a(b2, j, null, M, 24584, 12);
                M = M;
                M.j();
            } else if (i4 == 2) {
                r15 = 0;
                i2 = -1;
                M.K(-2078775475);
                M.K(-17361767);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar = new l5g(ylu0Var2.getIcon().a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y7z y7zVar = new y7z(e43.l(l5gVar, new l5g(ylu0Var3.getIcon().i)), null, 0L, 9187343241974906880L, 0);
                M.j();
                a2 = rco0.a.b(y7zVar, "ИБ", M, 3120);
                M.j();
            } else {
                if (i4 != 3) {
                    throw alb0.c(-2078787286, M);
                }
                M.K(-2078758005);
                i2 = -1;
                r15 = 0;
                a2 = phw.a.a(xus.s("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", 0L, M, 6, 2), null, null, null, null, M, 196616, 30);
                M = M;
                M.j();
            }
            efj efjVar = a2;
            k18 b3 = ds5Var.b(i3 & 14, M);
            int i5 = f.$EnumSwitchMapping$2[((d) ((zak0) this.j).getValue()).ordinal()];
            if (i5 == 1) {
                M.K(-2078748013);
                M.j();
                z190Var = tgp.a;
            } else {
                if (i5 != 2) {
                    throw alb0.c(-2078749654, M);
                }
                M.K(-2078746382);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(849846374, r15, i2, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                }
                lg90 b4 = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, r15);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z190Var = hsk.a.a(b4, 0L, M, 3080, 6);
                M.j();
            }
            z190 z190Var2 = z190Var;
            int i6 = f.$EnumSwitchMapping$3[((a) ((zak0) this.h).getValue()).ordinal()];
            wh50 wh50Var = this.i;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            switch (i6) {
                case 1:
                    M.K(-2078741199);
                    M.j();
                    iy5Var = rep.a;
                    break;
                case 2:
                    M.K(-2078739494);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-266960355, 48, -1, "com.vk.core.compose.component.image.badge.MobileOnlineBadge.Companion.invoke (MobileOnlineBadge.kt:59)");
                    }
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new ou20();
                        M.R(x);
                    }
                    ou20 ou20Var = (ou20) x;
                    ((zak0) ou20Var.a).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    iy5Var = ou20Var;
                    break;
                case 3:
                    M.K(-2078737609);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1962975051, 48, -1, "com.vk.core.compose.component.image.badge.WebOnlineBadge.Companion.invoke (WebOnlineBadge.kt:61)");
                    }
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new dhx0();
                        M.R(x2);
                    }
                    dhx0 dhx0Var = (dhx0) x2;
                    ((zak0) dhx0Var.a).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    iy5Var = dhx0Var;
                    break;
                case 4:
                    M.K(-2078735982);
                    iy5 a3 = iiz.a.a(384, 3, M, r15);
                    M.j();
                    iy5Var = a3;
                    break;
                case 5:
                    M.K(-2078734347);
                    qzu0.a.getClass();
                    iy5 a4 = kpv.a.a(qzu0.I(M), l5g.k, 0L, (BadgeAlignment) ((zak0) wh50Var).getValue(), false, null, null, M, 100663352, 236);
                    M.j();
                    iy5Var = a4;
                    break;
                case 6:
                    M.K(-16038842);
                    qzu0.a.getClass();
                    iy5 a5 = kpv.a.a(qzu0.I(M), l5g.k, 0L, (BadgeAlignment) ((zak0) wh50Var).getValue(), true, null, null, M, 100859960, 204);
                    M.j();
                    iy5Var = a5;
                    break;
                case 7:
                    M.K(-2078719363);
                    iy5 a6 = iiz.a.a(390, 2, M, true);
                    M.j();
                    iy5Var = a6;
                    break;
                default:
                    throw alb0.c(-2078742134, M);
            }
            androidx.compose.runtime.a aVar2 = M;
            ldu0.b(efjVar, f2, D, iy5Var, b3, false, z190Var2, null, null, aVar2, (i3 & 112) | 384, Http.StatusCode.RANGE_NOT_SATISFIABLE);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(ds5Var, f2, i) { // from class: xsna.hs5
                public final /* synthetic */ ds5 c;
                public final /* synthetic */ float d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    is5.this.c(this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(ds5 ds5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1962104032);
        if ((i & 6) == 0) {
            i2 = (M.J(r9g.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(ds5Var) : M.y(ds5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1962104032, i2, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.Content (AvatarScreenContent.kt:129)");
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
            b(ds5Var, null, M, ((i2 >> 3) & 14) | (i2 & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t41(this, ds5Var, i, 1);
        }
    }

    public final void e(ds5 ds5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str;
        LayoutNode.a aVar2;
        androidx.compose.runtime.a M = aVar.M(672759209);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? M.J(ds5Var) : M.y(ds5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(672759209, i3, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.Controls (AvatarScreenContent.kt:141)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(aVar3, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            k9q0.w(M, c2, dVar);
            q630 f3 = txj0.f(aVar3, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f3);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar3, true);
            String name = ((a) ((zak0) this.h).getValue()).name();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                str = name;
                x = new tl0(this, 9);
                M.R(x);
            } else {
                str = name;
            }
            y9i0.a("Badge", this.c, str, (izs) x, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar3, true);
            String name2 = ((BadgeAlignment) ((zak0) this.i).getValue()).name();
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new ns1(this, 6);
                M.R(x2);
            }
            y9i0.a("Badge Alignments", this.d, name2, (izs) x2, b3, M, 6, 0);
            M.G();
            q630 f4 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar4;
                M.I(aVar2);
            } else {
                aVar2 = aVar4;
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            ds5Var.c(tpg0Var.b(1.0f, aVar3, true), M, (i3 << 3) & 112);
            LayoutNode.a aVar5 = aVar2;
            q630 b4 = tpg0Var.b(1.0f, aVar3, true);
            String name3 = ((d) ((zak0) this.j).getValue()).name();
            boolean z3 = i4 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.hooks.p(this, 11);
                M.R(x3);
            }
            y9i0.a("Overlay", this.e, name3, (izs) x3, b4, M, 6, 0);
            M.G();
            q630 f5 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, f5);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b5 = tpg0Var.b(1.0f, aVar3, true);
            String name4 = ((b) ((zak0) this.k).getValue()).name();
            boolean z4 = i4 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new qm1(this, 2);
                M.R(x4);
            }
            y9i0.a("Content", this.f, name4, (izs) x4, b5, M, 6, 0);
            q630 b6 = tpg0Var.b(1.0f, aVar3, true);
            c cVar2 = (c) ((zak0) this.l).getValue();
            boolean z5 = i4 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new p40(this, 9);
                M.R(x5);
            }
            y9i0.a("Implementation", this.g, cVar2, (izs) x5, b6, M, 6, 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pv1(this, ds5Var, i, 1);
        }
    }

    public final void f(ds5 ds5Var, int i, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1172597389);
        int i3 = (M.J(ds5Var) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1172597389, i3, -1, "com.vk.design.demo.presentation.screens.avatar.AvatarScreenContent.ViewImplementation (AvatarScreenContent.kt:289)");
            }
            hdu0 a2 = ds5Var.a(i3 & 14, M);
            q630 D = s200.D(q630.a.a, 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = e.b;
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y = ((i3 & 112) == 32) | ((i3 & 896) == 256) | M.y(a2) | M.l(false);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new fs5(i, this, a2);
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
            s.d = new gs5(this, ds5Var, i, i2);
        }
    }
}
