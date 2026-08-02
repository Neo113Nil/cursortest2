package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;

/* compiled from: ContentBadgeScreenContent.kt */
/* loaded from: classes18.dex */
public final class rfj implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final Object d;
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
    public final String p;
    public final String q;

    /* compiled from: ContentBadgeScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContentBadgeMode.values().length];
            try {
                iArr[ContentBadgeMode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentBadgeMode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentBadgeMode.Outline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContentBadgeSize.values().length];
            try {
                iArr2[ContentBadgeSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContentBadgeSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public rfj() {
        zrp<ContentBadgeMode> h = ContentBadgeMode.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(((ContentBadgeMode) obj).name(), obj);
        }
        this.b = linkedHashMap;
        zrp<ContentBadgeSize> h2 = ContentBadgeSize.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : h2) {
            linkedHashMap2.put(((ContentBadgeSize) obj2).name(), obj2);
        }
        this.c = linkedHashMap2;
        this.d = pn00.k(new Pair("View", "View"), new Pair("Compose", "Compose"));
        this.e = androidx.compose.runtime.k.b(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = androidx.compose.runtime.k.b(bool);
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = androidx.compose.runtime.k.b(bool);
        this.j = androidx.compose.runtime.k.b(bool);
        this.k = androidx.compose.runtime.k.b(bool);
        this.l = androidx.compose.runtime.k.b("Primary");
        this.m = androidx.compose.runtime.k.b("Large");
        this.n = androidx.compose.runtime.k.b("Compose");
        this.o = androidx.compose.runtime.k.b("Accent");
        this.p = "Very very long badge text Very very long badge text Very very long badge text ";
        this.q = "Text";
    }

    public static b8g f(l5g l5gVar) {
        return new b8g(f870.H(l5gVar != null ? l5gVar.a : l5g.k));
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        boolean z;
        Map map;
        float f;
        androidx.compose.runtime.a M = aVar.M(-877612983);
        int i2 = (i & 6) == 0 ? (M.y(gzsVar) ? 4 : 2) | i : i;
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-877612983, i2, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.Content (ContentBadgeScreenContent.kt:98)");
            }
            ContentBadgeMode contentBadgeMode = (ContentBadgeMode) this.b.get((String) ((zak0) this.l).getValue());
            if (contentBadgeMode == null) {
                contentBadgeMode = ContentBadgeMode.Primary;
            }
            int i4 = (i2 >> 12) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-75467871, i4, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.rememberAppearances (ContentBadgeScreenContent.kt:400)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.q().k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getText().d;
            boolean p = M.p(j) | M.p(j2) | M.o(contentBadgeMode.ordinal());
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                MapBuilder mapBuilder = new MapBuilder();
                zrp<ContentBadgeAppearance.Design> h = ContentBadgeAppearance.Design.h();
                int e = on00.e(c5g.u(h, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj : h) {
                    linkedHashMap.put(((ContentBadgeAppearance.Design) obj).name(), obj);
                }
                mapBuilder.putAll(new bpw(linkedHashMap));
                int i5 = a.$EnumSwitchMapping$0[contentBadgeMode.ordinal()];
                z = true;
                if (i5 == 1) {
                } else if (i5 != 2) {
                }
                x = new bpw(mapBuilder.h());
                M.R(x);
            } else {
                z = true;
            }
            Map map2 = ((bpw) x).b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 f2 = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Content Badge", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i6 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            aVar2 = M;
            djn0.a(true, true, aVar2, 438, 0);
            q630 D2 = s200.D(txj0.z(txj0.f(aVar3, 1.0f), null, 3), 8);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar4, aVar2, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D3 = aVar2.D();
            q630 c2 = qri.c(aVar2, D2);
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
            k9q0.w(aVar2, a4, cVar);
            k9q0.w(aVar2, D3, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            String str = (String) this.d.get((String) ((zak0) this.n).getValue());
            if (epx.f(str, "View")) {
                aVar2.K(-1466642809);
                map = map2;
                e(map, q9g.a(aVar3, 1.0f), aVar2, (i6 >> 9) & 896);
                aVar2.j();
                f = 1.0f;
            } else {
                map = map2;
                if (epx.f(str, "Compose")) {
                    aVar2.K(-1466539548);
                    f = 1.0f;
                    c(map, q9g.a(aVar3, 1.0f), aVar2, (i6 >> 9) & 896);
                } else {
                    f = 1.0f;
                    aVar2.K(-1471957139);
                }
                aVar2.j();
            }
            d(map, q9g.a(aVar3, f), aVar2, 6 | ((i6 >> 6) & 7168));
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
            s.d = new wzs() { // from class: xsna.pfj
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rfj.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, java.util.Map] */
    public final void b(Map map, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        Map map2 = map;
        androidx.compose.runtime.a M = aVar.M(1475299889);
        if ((i & 6) == 0) {
            i2 = i | (M.J(map2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1475299889, i2, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.AppearanceSelectSlots (ContentBadgeScreenContent.kt:217)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(gVar, bVar, M, 6);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
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
            q630 b = tpg0Var.b(1.0f, aVar2, true);
            String str = (String) ((zak0) this.l).getValue();
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i3 = i2;
                x = new wcj(this, 1);
                M.R(x);
            } else {
                i3 = i2;
            }
            y9i0.a("Mode", this.b, str, (izs) x, b, M, 6, 0);
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            String str2 = (String) ((zak0) this.m).getValue();
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new t9e(this, 11);
                M.R(x2);
            }
            y9i0.a("Size", this.c, str2, (izs) x2, b2, M, 6, 0);
            M.G();
            q630 f2 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
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
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            String str3 = (String) ((zak0) this.o).getValue();
            boolean z3 = i4 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new dkg(this, 8);
                M.R(x3);
            }
            map2 = map;
            y9i0.a("Appearance", map2, str3, (izs) x3, b3, M, 6 | ((i3 << 3) & 112), 0);
            q630 b4 = tpg0Var.b(1.0f, aVar2, true);
            String str4 = (String) ((zak0) this.n).getValue();
            boolean z4 = i4 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new nfj(this, 0);
                M.R(x4);
            }
            M = M;
            y9i0.a("View/Compose", this.d, str4, (izs) x4, b4, M, 6, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ofj(this, map2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [xsna.lg90] */
    public final void c(Map map, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        rfj rfjVar;
        Map map2;
        String str;
        ow6 ow6Var;
        androidx.compose.runtime.a M = aVar.M(1257182518);
        if ((i & 6) == 0) {
            i2 = (M.J(map) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1257182518, i2, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.ComposeContent (ContentBadgeScreenContent.kt:256)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            rv5 c2 = lv5.c(M);
            q630.a aVar3 = q630.a.a;
            vjw.a(pg90.a(R.drawable.ds_demo_image_3, 0, M), null, lv5.b(txj0.d(aVar3, 1.0f), c2, 0L, 6), null, wkj.a.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            long j = l5g.d;
            yqv0.c("This layout is scrollable!", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 390, 0, 16378);
            yqv0.c("Compose:", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 390, 0, 16378);
            M.G();
            q630 D3 = s200.D(txj0.f(txj0.h(p490.D(aVar3, p490.x(M), 14), 400), 1.0f), 8);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, D3);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            float f = 100;
            f9t.e(txj0.h(aVar3, f), M, 6);
            gcv gcvVar = new gcv(dt1.a.o);
            rfjVar = this;
            if (((Boolean) ((zak0) rfjVar.f).getValue()).booleanValue()) {
                M.K(-1943362994);
                qzu0.a.getClass();
                str = null;
                ow6 f2 = lmc.f(qzu0.a(M), null, M, 392, 2);
                M.j();
                ow6Var = f2;
            } else {
                str = null;
                M.K(-1943315471);
                M.j();
                ow6Var = null;
            }
            String str2 = ((Boolean) ((zak0) rfjVar.e).getValue()).booleanValue() ? ((Boolean) ((zak0) rfjVar.k).getValue()).booleanValue() ? rfjVar.p : rfjVar.q : str;
            String str3 = ((Boolean) ((zak0) rfjVar.i).getValue()).booleanValue() ? "1\u2009940\u2009₽" : str;
            qzu0.a.getClass();
            Object obj = qzu0.a(M);
            if (!((Boolean) ((zak0) rfjVar.h).getValue()).booleanValue()) {
                obj = str;
            }
            ContentBadgeMode contentBadgeMode = (ContentBadgeMode) rfjVar.b.get((String) ((zak0) rfjVar.l).getValue());
            if (contentBadgeMode == null) {
                contentBadgeMode = ContentBadgeMode.Primary;
            }
            ContentBadgeMode contentBadgeMode2 = contentBadgeMode;
            ContentBadgeSize contentBadgeSize = (ContentBadgeSize) rfjVar.c.get((String) ((zak0) rfjVar.m).getValue());
            if (contentBadgeSize == null) {
                contentBadgeSize = ContentBadgeSize.Large;
            }
            ContentBadgeSize contentBadgeSize2 = contentBadgeSize;
            boolean booleanValue = ((Boolean) ((zak0) rfjVar.g).getValue()).booleanValue();
            map2 = map;
            ContentBadgeAppearance contentBadgeAppearance = (ContentBadgeAppearance) map2.get((String) ((zak0) rfjVar.o).getValue());
            if (contentBadgeAppearance == null) {
                contentBadgeAppearance = ContentBadgeAppearance.Design.Accent;
            }
            rnu0.d(contentBadgeSize2, contentBadgeMode2, contentBadgeAppearance, gcvVar, ow6Var, str2, str3, obj, booleanValue, ((Boolean) ((zak0) rfjVar.j).getValue()).booleanValue(), c2, M, 1073741824);
            M = M;
            f9t.e(txj0.h(aVar3, f), M, 6);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            rfjVar = this;
            map2 = map;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rh2(i, 2, rfjVar, map2, q630Var);
        }
    }

    public final void d(Map map, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        LayoutNode.a aVar2;
        LayoutNode.a aVar3;
        Map map2 = map;
        androidx.compose.runtime.a M = aVar.M(1553544951);
        if ((i & 48) == 0) {
            i2 = (M.J(map2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1553544951, i2, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.Controls (ContentBadgeScreenContent.kt:133)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
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
            jgh0 x = p490.x(M);
            q630.a aVar5 = q630.a.a;
            q630 f = txj0.f(p490.D(aVar5, x, 14), 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f2 = txj0.f(aVar5, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, f2);
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
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x2 == c0012a) {
                x2 = new m3g(this, 7);
                M.R(x2);
            }
            int i4 = i2;
            eku0.d("Text", (gzs) x2, b, booleanValue, null, false, false, M, 6, 112);
            q630 b2 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue2 = ((Boolean) ((zak0) this.g).getValue()).booleanValue();
            boolean z2 = i3 == 2048;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new im0(this, 28);
                M.R(x3);
            }
            eku0.d("Capsule", (gzs) x3, b2, booleanValue2, null, false, false, M, 6, 112);
            M.G();
            q630 f3 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, f3);
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
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b3 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue3 = ((Boolean) ((zak0) this.f).getValue()).booleanValue();
            boolean z3 = i3 == 2048;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new qfj(this, 0);
                M.R(x4);
            }
            LayoutNode.a aVar6 = aVar2;
            eku0.d("Icon (Content Before for Lego)", (gzs) x4, b3, booleanValue3, null, false, false, M, 6, 112);
            q630 b4 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue4 = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            boolean z4 = i3 == 2048;
            Object x5 = M.x();
            if (z4 || x5 == c0012a) {
                x5 = new v6(this, 28);
                M.R(x5);
            }
            eku0.d("Subtitle", (gzs) x5, b4, booleanValue4, null, false, false, M, 6, 112);
            M.G();
            q630 f4 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, f4);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b5 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue5 = ((Boolean) ((zak0) this.j).getValue()).booleanValue();
            boolean z5 = i3 == 2048;
            Object x6 = M.x();
            if (z5 || x6 == c0012a) {
                x6 = new bih(this, 7);
                M.R(x6);
            }
            LayoutNode.a aVar7 = aVar3;
            eku0.d("Fade", (gzs) x6, b5, booleanValue5, null, false, false, M, 6, 112);
            q630 b6 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue6 = ((Boolean) ((zak0) this.h).getValue()).booleanValue();
            boolean z6 = i3 == 2048;
            Object x7 = M.x();
            if (z6 || x7 == c0012a) {
                x7 = new h1j(this, 1);
                M.R(x7);
            }
            boolean z7 = true;
            eku0.d("Trailing Icon", (gzs) x7, b6, booleanValue6, null, false, false, M, 6, 112);
            M.G();
            q630 f5 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode6 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c6 = qri.c(M, f5);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D6, eVar);
            ur.d(hashCode6, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            boolean booleanValue7 = ((Boolean) ((zak0) this.k).getValue()).booleanValue();
            if (i3 != 2048) {
                z7 = false;
            }
            Object x8 = M.x();
            if (z7 || x8 == c0012a) {
                x8 = new wzh(this, 7);
                M.R(x8);
            }
            eku0.d("Long text", (gzs) x8, null, booleanValue7, null, false, false, M, 6, 116);
            M.G();
            map2 = map;
            b(map2, M, ((i4 >> 3) & 14) | ((i4 >> 6) & 112));
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pha(this, map2, q630Var, i, 2);
        }
    }

    public final void e(Map map, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-296012187);
        if ((i & 6) == 0) {
            i2 = (M.J(map) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-296012187, i2, -1, "com.vk.design.demo.presentation.screens.ContentBadgeScreenContent.ViewContent (ContentBadgeScreenContent.kt:306)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 D2 = s200.D(txj0.h(q630.a.a, 400), 4);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new lt0(this, 28);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = (i3 == 256) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.logic.interactor.i(7, this, map);
                M.R(x2);
            }
            ae2.a(48, 0, M, izsVar, (izs) x2, D2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jx(this, map, q630Var, i, 2);
        }
    }
}
