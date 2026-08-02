package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: TileScreenRichTextContent.kt */
/* loaded from: classes18.dex */
public final class jto0 {
    public final Object a;
    public final Object b;
    public final wh50<b> c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TileScreenRichTextContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Center;
        public static final a Start;

        static {
            a aVar = new a("Start", 0);
            Start = aVar;
            a aVar2 = new a("Center", 1);
            Center = aVar2;
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

    /* compiled from: TileScreenRichTextContent.kt */
    public static final class b {
        public final a a;
        public final c b;
        public final tho0 c;
        public final tho0 d;
        public final boolean e;
        public final tho0 f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final tho0 k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final tho0 o;
        public final boolean p;

        public b(a aVar, c cVar, tho0 tho0Var, tho0 tho0Var2, boolean z, tho0 tho0Var3, boolean z2, boolean z3, boolean z4, boolean z5, tho0 tho0Var4, boolean z6, boolean z7, boolean z8, tho0 tho0Var5, boolean z9) {
            this.a = aVar;
            this.b = cVar;
            this.c = tho0Var;
            this.d = tho0Var2;
            this.e = z;
            this.f = tho0Var3;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
            this.k = tho0Var4;
            this.l = z6;
            this.m = z7;
            this.n = z8;
            this.o = tho0Var5;
            this.p = z9;
        }

        public static b a(b bVar, a aVar, c cVar, tho0 tho0Var, tho0 tho0Var2, boolean z, tho0 tho0Var3, boolean z2, boolean z3, boolean z4, boolean z5, tho0 tho0Var4, boolean z6, boolean z7, boolean z8, tho0 tho0Var5, boolean z9, int i) {
            a aVar2 = (i & 1) != 0 ? bVar.a : aVar;
            c cVar2 = (i & 2) != 0 ? bVar.b : cVar;
            tho0 tho0Var6 = (i & 4) != 0 ? bVar.c : tho0Var;
            tho0 tho0Var7 = (i & 8) != 0 ? bVar.d : tho0Var2;
            boolean z10 = (i & 16) != 0 ? bVar.e : z;
            tho0 tho0Var8 = (i & 32) != 0 ? bVar.f : tho0Var3;
            boolean z11 = (i & 64) != 0 ? bVar.g : z2;
            boolean z12 = (i & 128) != 0 ? bVar.h : z3;
            boolean z13 = (i & 256) != 0 ? bVar.i : z4;
            boolean z14 = (i & 512) != 0 ? bVar.j : z5;
            tho0 tho0Var9 = (i & 1024) != 0 ? bVar.k : tho0Var4;
            boolean z15 = (i & 2048) != 0 ? bVar.l : z6;
            boolean z16 = (i & 4096) != 0 ? bVar.m : z7;
            boolean z17 = (i & 8192) != 0 ? bVar.n : z8;
            a aVar3 = aVar2;
            tho0 tho0Var10 = (i & 16384) != 0 ? bVar.o : tho0Var5;
            boolean z18 = (i & 32768) != 0 ? bVar.p : z9;
            bVar.getClass();
            return new b(aVar3, cVar2, tho0Var6, tho0Var7, z10, tho0Var8, z11, z12, z13, z14, tho0Var9, z15, z16, z17, tho0Var10, z18);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && epx.f(this.k, bVar.k) && this.l == bVar.l && this.m == bVar.m && this.n == bVar.n && epx.f(this.o, bVar.o) && this.p == bVar.p;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.p) + ((this.o.hashCode() + qoy.b(qoy.b(qoy.b((this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.f.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextProperties(alignment=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", overtitle=");
            sb.append(this.d);
            sb.append(", isOvertitleEnabled=");
            sb.append(this.e);
            sb.append(", titleMeta=");
            sb.append(this.f);
            sb.append(", isTitleMetaEnabled=");
            sb.append(this.g);
            sb.append(", isTitleBeforeIconEnabled=");
            sb.append(this.h);
            sb.append(", isTitleAfterIcon1Enabled=");
            sb.append(this.i);
            sb.append(", isTitleAfterIcon2Enabled=");
            sb.append(this.j);
            sb.append(", subtitle=");
            sb.append(this.k);
            sb.append(", isSubtitleEnabled=");
            sb.append(this.l);
            sb.append(", isSubtitleBeforeIconEnabled=");
            sb.append(this.m);
            sb.append(", isSubtitleAfterIconEnabled=");
            sb.append(this.n);
            sb.append(", extraSubtitle=");
            sb.append(this.o);
            sb.append(", isExtraSubtitleEnabled=");
            return defpackage.q0.a(sb, this.p, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TileScreenRichTextContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Medium;
        public static final c Small;

        static {
            c cVar = new c("Small", 0);
            Small = cVar;
            c cVar2 = new c("Medium", 1);
            Medium = cVar2;
            c[] cVarArr = {cVar, cVar2};
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

    /* compiled from: TileScreenRichTextContent.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public jto0() {
        tho0 tho0Var = new tho0("Title", 0L, 6);
        tho0 tho0Var2 = new tho0("Subtitle", 0L, 6);
        a aVar = a.Start;
        this.a = pn00.k(new Pair(aVar, "Start"), new Pair(a.Center, "Center"));
        c cVar = c.Small;
        this.b = pn00.k(new Pair(cVar, "Small"), new Pair(c.Medium, "Medium"));
        this.c = androidx.compose.runtime.k.b(new b(aVar, cVar, tho0Var, new tho0("Overtitle", 0L, 6), false, new tho0("Meta", 0L, 6), false, false, false, false, tho0Var2, true, false, false, new tho0("Extra Subtitle", 0L, 6), false));
    }

    public final void a(b bVar, i0b0 i0b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1591606856);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(i0b0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1591606856, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseExtraSubtitle (TileScreenRichTextContent.kt:366)");
            }
            boolean z = bVar.p;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new whi0(7, i0b0Var, bVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            zov0.b(z, "Extra Subtitle", (izs) x, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            tho0 tho0Var = bVar.o;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new zsl0(4, i0b0Var, bVar);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a2, txj0.f(aVar2, 1.0f), h8s.a.a("Extra Subtitle", false, null, null, null, M, 196614, 30), null, null, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sol(i, 4, this, bVar, i0b0Var);
        }
    }

    public final void b(b bVar, i0b0 i0b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-59280756);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(i0b0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-59280756, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseOvertitle (TileScreenRichTextContent.kt:282)");
            }
            boolean z = bVar.e;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new een0(1, i0b0Var, bVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            zov0.b(z, "Overtitle", (izs) x, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            tho0 tho0Var = bVar.d;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new wqb(26, i0b0Var, bVar);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a2, txj0.f(aVar2, 1.0f), h8s.a.a("Overtitle", false, null, null, null, M, 196614, 30), null, null, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z9k(i, 2, this, bVar, i0b0Var);
        }
    }

    public final void c(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-147829098);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-147829098, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseRichTextContentProperties (TileScreenRichTextContent.kt:185)");
            }
            zak0 zak0Var = (zak0) this.c;
            b bVar = (b) zak0Var.getValue();
            i0b0 i0b0Var = new i0b0(zak0Var, 14);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            e(bVar, i0b0Var, M, 384);
            tho0 tho0Var = bVar.c;
            boolean J = M.J(i0b0Var) | M.J(bVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new qb6(29, i0b0Var, bVar);
                M.R(x);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, txj0.f(aVar2, 1.0f), h8s.a.a("Title", false, null, null, null, M, 196614, 30), null, null, M, 48, 24);
            jaiVar.invoke(M, 6);
            d(bVar, i0b0Var, M, 384);
            jaiVar.invoke(M, 6);
            b(bVar, i0b0Var, M, 384);
            jaiVar.invoke(M, 6);
            f(bVar, i0b0Var, M, 384);
            jaiVar.invoke(M, 6);
            a(bVar, i0b0Var, M, 384);
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
            s.d = new br0(i, 12, this, q630Var2, jaiVar);
        }
    }

    public final void d(b bVar, i0b0 i0b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1127767566);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(i0b0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1127767566, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseSubtitle (TileScreenRichTextContent.kt:239)");
            }
            boolean z = bVar.l;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new c1o0(1, i0b0Var, bVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            zov0.b(z, "Subtitle", (izs) x, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            boolean z3 = bVar.m;
            boolean z4 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new isb0(7, i0b0Var, bVar);
                M.R(x2);
            }
            zov0.b(z3, "Subtitle Before", (izs) x2, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            boolean z5 = bVar.n;
            boolean z6 = (i3 == 32) | (i4 == 4);
            Object x3 = M.x();
            if (z6 || x3 == c0012a) {
                x3 = new a5(24, i0b0Var, bVar);
                M.R(x3);
            }
            zov0.b(z5, "Subtitle After", (izs) x3, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            tho0 tho0Var = bVar.k;
            boolean z7 = (i3 == 32) | (i4 == 4);
            Object x4 = M.x();
            if (z7 || x4 == c0012a) {
                x4 = new qum0(1, i0b0Var, bVar);
                M.R(x4);
            }
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x4, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14), txj0.f(aVar2, 1.0f), h8s.a.a("Subtitle", false, null, null, null, M, 196614, 30), null, null, M, 48, 24);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o37(i, 3, this, bVar, i0b0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Map] */
    public final void e(b bVar, i0b0 i0b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-973057512);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(i0b0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-973057512, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseTextSize (TileScreenRichTextContent.kt:214)");
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
            M.K(12079398);
            M.j();
            a aVar3 = bVar.a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ito0(0, i0b0Var, bVar);
                M.R(x);
            }
            izs izsVar = (izs) x;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Text alignment", this.a, aVar3, izsVar, new xpy(1.0f, true), M, 6, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uq7(this, bVar, i0b0Var, i, 4);
        }
    }

    public final void f(b bVar, i0b0 i0b0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-920801997);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(i0b0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-920801997, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenRichTextContent.ChooseTitleMeta (TileScreenRichTextContent.kt:309)");
            }
            M.K(344527372);
            tho0 tho0Var = bVar.f;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new mz80(17, i0b0Var, bVar);
                M.R(x);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14);
            hly a3 = h8s.a.a("Meta", false, null, null, null, M, 196614, 30);
            q630.a aVar2 = q630.a.a;
            nvu0.a(a2, txj0.f(aVar2, 1.0f), a3, null, null, M, 48, 24);
            M = M;
            boolean z2 = bVar.g;
            boolean z3 = (i4 == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new h9i0(4, i0b0Var, bVar);
                M.R(x2);
            }
            zov0.b(z2, "Meta", (izs) x2, txj0.f(aVar2, 1.0f), null, false, false, M, 3120, 112);
            M.j();
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
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
            k9q0.w(M, a4, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z4 = bVar.i;
            boolean z5 = (i3 == 32) | (i4 == 4);
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                x3 = new ll1(28, i0b0Var, bVar);
                M.R(x3);
            }
            izs izsVar = (izs) x3;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            boolean z6 = false;
            zov0.b(z4, "Title After 1", izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, 48, 112);
            boolean z7 = bVar.j;
            boolean z8 = i3 == 32;
            if (i4 == 4) {
                z6 = true;
            }
            boolean z9 = z8 | z6;
            Object x4 = M.x();
            if (z9 || x4 == c0012a) {
                x4 = new hto0(0, i0b0Var, bVar);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            zov0.b(z7, "Title After 2", izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, 48, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d9c(i, 5, this, bVar, i0b0Var);
        }
    }
}
