package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: MilkshakeTopBarScreenContent.kt */
/* loaded from: classes18.dex */
public final class go20 {
    public static final go20 a = new go20();
    public static final LinkedHashMap b;
    public static final LinkedHashMap c;
    public static final LinkedHashMap d;
    public static final LinkedHashMap e;
    public static final LinkedHashMap f;
    public static final LinkedHashMap g;
    public static final LinkedHashMap h;
    public static final LinkedHashMap i;
    public static final LinkedHashMap j;
    public static final LinkedHashMap k;
    public static final kg50 l;
    public static final wh50 m;
    public static final wh50 n;
    public static final wh50 o;
    public static final wh50 p;
    public static final wh50 q;
    public static final wh50 r;
    public static final wh50 s;
    public static final wh50 t;
    public static final wh50 u;
    public static final wh50 v;
    public static final wh50 w;
    public static final wh50 x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Avatar;
        public static final a ButtonGroup;
        public static final a Close;
        public static final a Done;
        public static final a More;
        public static final a Nothing;
        public static final a TextButton;

        static {
            a aVar = new a("Nothing", 0);
            Nothing = aVar;
            a aVar2 = new a("Avatar", 1);
            Avatar = aVar2;
            a aVar3 = new a("ButtonGroup", 2);
            ButtonGroup = aVar3;
            a aVar4 = new a("TextButton", 3);
            TextButton = aVar4;
            a aVar5 = new a("Done", 4);
            Done = aVar5;
            a aVar6 = new a("More", 5);
            More = aVar6;
            a aVar7 = new a("Close", 6);
            Close = aVar7;
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
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Back;
        public static final b BackCounter;
        public static final b Nothing;

        static {
            b bVar = new b("Nothing", 0);
            Nothing = bVar;
            b bVar2 = new b("Back", 1);
            Back = bVar2;
            b bVar3 = new b("BackCounter", 2);
            BackCounter = bVar3;
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
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Avatar;
        public static final c Close;
        public static final c IconButton;
        public static final c Nothing;

        static {
            c cVar = new c("Nothing", 0);
            Nothing = cVar;
            c cVar2 = new c("Avatar", 1);
            Avatar = cVar2;
            c cVar3 = new c("IconButton", 2);
            IconButton = cVar3;
            c cVar4 = new c("Close", 3);
            Close = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Custom;
        public static final d Nothing;

        static {
            d dVar = new d("Nothing", 0);
            Nothing = dVar;
            d dVar2 = new d("Custom", 1);
            Custom = dVar2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class e {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e OneIcon;
        public static final e ThreeIcons;
        public static final e TwoIcons;

        static {
            e eVar = new e("OneIcon", 0);
            OneIcon = eVar;
            e eVar2 = new e("TwoIcons", 1);
            TwoIcons = eVar2;
            e eVar3 = new e("ThreeIcons", 2);
            ThreeIcons = eVar3;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class f {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;
        public static final f Empty;
        public static final f Search;
        public static final f Text;

        static {
            f fVar = new f("Empty", 0);
            Empty = fVar;
            f fVar2 = new f("Text", 1);
            Text = fVar2;
            f fVar3 = new f("Search", 2);
            Search = fVar3;
            f[] fVarArr = {fVar, fVar2, fVar3};
            $VALUES = fVarArr;
            $ENTRIES = new asp(fVarArr);
        }

        public f() {
            throw null;
        }

        public static zrp<f> h() {
            return $ENTRIES;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class g {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final g Overlay;
        public static final g OverlayPlus;
        public static final g Regular;

        static {
            g gVar = new g("Regular", 0);
            Regular = gVar;
            g gVar2 = new g("Overlay", 1);
            Overlay = gVar2;
            g gVar3 = new g("OverlayPlus", 2);
            OverlayPlus = gVar3;
            g[] gVarArr = {gVar, gVar2, gVar3};
            $VALUES = gVarArr;
            $ENTRIES = new asp(gVarArr);
        }

        public g() {
            throw null;
        }

        public static zrp<g> h() {
            return $ENTRIES;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class h {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ h[] $VALUES;
        public static final h Nothing;
        public static final h Text;
        public static final h TextOneIcon;

        static {
            h hVar = new h("Nothing", 0);
            Nothing = hVar;
            h hVar2 = new h("Text", 1);
            Text = hVar2;
            h hVar3 = new h("TextOneIcon", 2);
            TextOneIcon = hVar3;
            h[] hVarArr = {hVar, hVar2, hVar3};
            $VALUES = hVarArr;
            $ENTRIES = new asp(hVarArr);
        }

        public h() {
            throw null;
        }

        public static zrp<h> h() {
            return $ENTRIES;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class i {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ i[] $VALUES;
        public static final i Text;
        public static final i TextDropdown;
        public static final i TextOneIcon;
        public static final i TextTwoIcons;

        static {
            i iVar = new i("Text", 0);
            Text = iVar;
            i iVar2 = new i("TextDropdown", 1);
            TextDropdown = iVar2;
            i iVar3 = new i("TextOneIcon", 2);
            TextOneIcon = iVar3;
            i iVar4 = new i("TextTwoIcons", 3);
            TextTwoIcons = iVar4;
            i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
            $VALUES = iVarArr;
            $ENTRIES = new asp(iVarArr);
        }

        public i() {
            throw null;
        }

        public static zrp<i> h() {
            return $ENTRIES;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final class j {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ j[] $VALUES;
        public static final j Medium;
        public static final j Small;

        static {
            j jVar = new j("Small", 0);
            Small = jVar;
            j jVar2 = new j("Medium", 1);
            Medium = jVar2;
            j[] jVarArr = {jVar, jVar2};
            $VALUES = jVarArr;
            $ENTRIES = new asp(jVarArr);
        }

        public j() {
            throw null;
        }

        public static zrp<j> h() {
            return $ENTRIES;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    /* compiled from: MilkshakeTopBarScreenContent.kt */
    public static final /* synthetic */ class k {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Nothing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.BackCounter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.Nothing.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c.Avatar.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.IconButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[j.values().length];
            try {
                iArr3[j.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[j.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[f.values().length];
            try {
                iArr4[f.Empty.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[f.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[f.Search.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[i.values().length];
            try {
                iArr5[i.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[i.TextDropdown.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[i.TextOneIcon.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[i.TextTwoIcons.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[h.values().length];
            try {
                iArr6[h.Nothing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[h.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[h.TextOneIcon.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[e.values().length];
            try {
                iArr7[e.OneIcon.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[e.TwoIcons.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[e.ThreeIcons.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[a.values().length];
            try {
                iArr8[a.Nothing.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr8[a.Avatar.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[a.ButtonGroup.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[a.TextButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[a.Done.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[a.More.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[a.Close.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[d.values().length];
            try {
                iArr9[d.Nothing.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr9[d.Custom.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[g.values().length];
            try {
                iArr10[g.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr10[g.Overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr10[g.OverlayPlus.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$9 = iArr10;
        }
    }

    static {
        zrp<g> h2 = g.h();
        int e2 = on00.e(c5g.u(h2, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : h2) {
            linkedHashMap.put(obj, ((g) obj).name());
        }
        b = linkedHashMap;
        zrp<b> h3 = b.h();
        int e3 = on00.e(c5g.u(h3, 10));
        if (e3 < 16) {
            e3 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3);
        for (Object obj2 : h3) {
            linkedHashMap2.put(obj2, ((b) obj2).name());
        }
        c = linkedHashMap2;
        zrp<c> h4 = c.h();
        int e4 = on00.e(c5g.u(h4, 10));
        if (e4 < 16) {
            e4 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4);
        for (Object obj3 : h4) {
            linkedHashMap3.put(obj3, ((c) obj3).name());
        }
        d = linkedHashMap3;
        zrp<f> h5 = f.h();
        int e5 = on00.e(c5g.u(h5, 10));
        if (e5 < 16) {
            e5 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e5);
        for (Object obj4 : h5) {
            linkedHashMap4.put(obj4, ((f) obj4).name());
        }
        e = linkedHashMap4;
        zrp<i> h6 = i.h();
        int e6 = on00.e(c5g.u(h6, 10));
        if (e6 < 16) {
            e6 = 16;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e6);
        for (Object obj5 : h6) {
            linkedHashMap5.put(obj5, ((i) obj5).name());
        }
        f = linkedHashMap5;
        zrp<j> h7 = j.h();
        int e7 = on00.e(c5g.u(h7, 10));
        if (e7 < 16) {
            e7 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(e7);
        for (Object obj6 : h7) {
            linkedHashMap6.put(obj6, ((j) obj6).name());
        }
        g = linkedHashMap6;
        zrp<h> h8 = h.h();
        int e8 = on00.e(c5g.u(h8, 10));
        if (e8 < 16) {
            e8 = 16;
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(e8);
        for (Object obj7 : h8) {
            linkedHashMap7.put(obj7, ((h) obj7).name());
        }
        h = linkedHashMap7;
        zrp<a> h9 = a.h();
        int e9 = on00.e(c5g.u(h9, 10));
        if (e9 < 16) {
            e9 = 16;
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(e9);
        for (Object obj8 : h9) {
            linkedHashMap8.put(obj8, ((a) obj8).name());
        }
        i = linkedHashMap8;
        zrp<e> h10 = e.h();
        int e10 = on00.e(c5g.u(h10, 10));
        if (e10 < 16) {
            e10 = 16;
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(e10);
        for (Object obj9 : h10) {
            linkedHashMap9.put(obj9, ((e) obj9).name());
        }
        j = linkedHashMap9;
        zrp<d> h11 = d.h();
        int e11 = on00.e(c5g.u(h11, 10));
        LinkedHashMap linkedHashMap10 = new LinkedHashMap(e11 >= 16 ? e11 : 16);
        for (Object obj10 : h11) {
            linkedHashMap10.put(obj10, ((d) obj10).name());
        }
        k = linkedHashMap10;
        l = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        m = androidx.compose.runtime.k.b(g.Regular);
        Boolean bool = Boolean.FALSE;
        n = androidx.compose.runtime.k.b(bool);
        o = androidx.compose.runtime.k.b(b.Nothing);
        p = androidx.compose.runtime.k.b(c.Nothing);
        q = androidx.compose.runtime.k.b(f.Text);
        r = androidx.compose.runtime.k.b(i.Text);
        s = androidx.compose.runtime.k.b(j.Small);
        t = androidx.compose.runtime.k.b(h.Nothing);
        u = androidx.compose.runtime.k.b(a.Nothing);
        v = androidx.compose.runtime.k.b(e.OneIcon);
        w = androidx.compose.runtime.k.b(d.Nothing);
        x = androidx.compose.runtime.k.b(bool);
    }

    public final void a(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-147572594);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-147572594, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.AfterControls (MilkshakeTopBarScreenContent.kt:399)");
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
            wh50 wh50Var = u;
            a aVar3 = (a) ((zak0) wh50Var).getValue();
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new n82(27);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("After", i, aVar3, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            if (((a) ((zak0) wh50Var).getValue()) == a.ButtonGroup) {
                M.K(1431727430);
                e eVar = (e) ((zak0) v).getValue();
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new t3v(2);
                    M.R(x3);
                }
                izs izsVar2 = (izs) x3;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                y9i0.a("Buttons", j, eVar, izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            } else {
                M.K(1417368664);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ht7(this, i2, 8);
        }
    }

    public final void b(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1989884285);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1989884285, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.BottomControls (MilkshakeTopBarScreenContent.kt:421)");
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
            d dVar = (d) ((zak0) w).getValue();
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new pyz(6);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Bottom", k, dVar, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            boolean booleanValue = ((Boolean) ((zak0) x).getValue()).booleanValue();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qey(8);
                M.R(x3);
            }
            zov0.b(booleanValue, "Separator", (izs) x3, xpyVar, null, false, false, M, Tensorflow.FRAME_WIDTH, 112);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new pg(this, i2, 5);
        }
    }

    public final void c(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(863187107);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(863187107, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.Component (MilkshakeTopBarScreenContent.kt:89)");
            }
            q630 m2 = hr80.m(q630.a.a, f870.d(4280039764L), androidx.compose.ui.graphics.e.a);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new u620(3);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new gzn(15);
                M.R(x3);
            }
            ae2.a(438, 0, M, izsVar, (izs) x3, m2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new hq5(this, i2, 11);
        }
    }

    public final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1917871646);
        int i3 = i2 | 6;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1917871646, i3, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.Content (MilkshakeTopBarScreenContent.kt:71)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c2 = qri.c(M, q630Var2);
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
            go20 go20Var = a;
            go20Var.c(6, M);
            q630 D2 = p490.D(q9g.a(txj0.f(q630Var2, 1.0f), 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            go20Var.e(6, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new yn7(this, q630Var2, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        go20 go20Var;
        go20 go20Var2 = this;
        androidx.compose.runtime.a M = aVar.M(-1315117586);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1315117586, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.Controls (MilkshakeTopBarScreenContent.kt:297)");
            }
            go20Var2.g(6, M);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, c2, dVar);
            b bVar3 = (b) ((zak0) o).getValue();
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new bqt(6);
                M.R(x2);
            }
            tpg0 tpg0Var = tpg0.a;
            y9i0.a("Back", c, bVar3, (izs) x2, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            c cVar2 = (c) ((zak0) p).getValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qcw(8);
                M.R(x3);
            }
            y9i0.a("Before", d, cVar2, (izs) x3, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            M.G();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, c3, dVar);
            wh50 wh50Var = q;
            f fVar = (f) ((zak0) wh50Var).getValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new d37(25);
                M.R(x4);
            }
            y9i0.a("Middle", e, fVar, (izs) x4, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            M.G();
            int i4 = k.$EnumSwitchMapping$3[((f) ((zak0) wh50Var).getValue()).ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    M.K(-1107585086);
                    i3 = 6;
                    go20Var = this;
                    go20Var.f(6, M);
                    M.j();
                    go20Var.a(i3, M);
                    go20Var.b(i3, M);
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c4 = qri.c(M, aVar2);
                    if (M.N() != null) {
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
                    ur.d(hashCode3, M, bVar2, M, c2678a);
                    k9q0.w(M, c4, dVar);
                    StringBuilder sb = new StringBuilder("Progress: ");
                    vak0 vak0Var = (vak0) l;
                    sb.append(vak0Var.getFloatValue());
                    String sb2 = sb.toString();
                    float floatValue = vak0Var.getFloatValue();
                    q630 b2 = tpg0Var.b(1.0f, aVar2, true);
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new y8m(13);
                        M.R(x5);
                    }
                    izs izsVar = (izs) x5;
                    go20Var2 = go20Var;
                    hkv0.d(floatValue, izsVar, b2, sb2, false, null, null, 0, null, M, 48, 1008);
                    M = M;
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else if (i4 != 3) {
                    throw alb0.c(-1107588641, M);
                }
            }
            i3 = 6;
            go20Var = this;
            M.K(24556901);
            M.j();
            go20Var.a(i3, M);
            go20Var.b(i3, M);
            androidx.compose.foundation.layout.k a42 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode32 = Long.hashCode(n34.n(M));
            sy90 D32 = M.D();
            q630 c42 = qri.c(M, aVar2);
            if (M.N() != null) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new com.vk.movika.tools.controls.seekbar.v(go20Var2, i2, 10);
        }
    }

    public final void f(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1483801900);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1483801900, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.MiddleTextControls (MilkshakeTopBarScreenContent.kt:370)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, c2, dVar);
            i iVar = (i) ((zak0) r).getValue();
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new f6w(9);
                M.R(x2);
            }
            tpg0 tpg0Var = tpg0.a;
            y9i0.a("Title", f, iVar, (izs) x2, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            j jVar = (j) ((zak0) s).getValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new fo20(0);
                M.R(x3);
            }
            y9i0.a("Size", g, jVar, (izs) x3, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            M.G();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, c3, dVar);
            h hVar = (h) ((zak0) t).getValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new oey(5);
                M.R(x4);
            }
            y9i0.a("Subtitle", h, hVar, (izs) x4, tpg0Var.b(1.0f, aVar2, true), M, 3126, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new lk1(this, i2, 7);
        }
    }

    public final void g(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1212107403);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1212107403, i2, -1, "com.vk.design.demo.presentation.screens.topbar.MilkshakeTopBarScreenContent.ModeControls (MilkshakeTopBarScreenContent.kt:344)");
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
            wh50 wh50Var = m;
            g gVar = (g) ((zak0) wh50Var).getValue();
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new leq(15);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Mode", b, gVar, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 3126, 0);
            int i4 = k.$EnumSwitchMapping$9[((g) ((zak0) wh50Var).getValue()).ordinal()];
            wh50 wh50Var2 = n;
            if (i4 == 1) {
                M.K(-1786481038);
                M.j();
                ((zak0) wh50Var2).setValue(Boolean.FALSE);
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw alb0.c(635107139, M);
                }
                M.K(-1786343584);
                boolean booleanValue = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new i0r(6);
                    M.R(x3);
                }
                zov0.b(booleanValue, "Gradient", (izs) x3, xpyVar, null, false, false, M, Tensorflow.FRAME_WIDTH, 112);
                M = M;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new com.vk.movika.tools.controls.seekbar.h(this, i2, 9);
        }
    }
}
