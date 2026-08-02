package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ar20;
import xsna.ayv0;
import xsna.br20;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.zq20;

/* compiled from: MiniInfoCellScreenContent.kt */
/* loaded from: classes18.dex */
public final class dr20 implements yah0 {
    public final Object b = pn00.k(new Pair("short text", "Short text"), new Pair("long text", "Very very very very very very very very long text to check multiline mode and ellipsis"), new Pair("expandable", "Very very very very very very very very long text to check multiline mode and ellipsis\nVery very very very very very very very long text to check multiline mode and ellipsis\nVery very very very very very very very long text to check multiline mode and ellipsis"));
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;

    /* compiled from: MiniInfoCellScreenContent.kt */
    public static final class a implements wq5<ayv0> {
        public static final a b = new a();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(ayv0 ayv0Var, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            rlw vlwVar;
            androidx.compose.runtime.a M = aVar.M(-766574912);
            if ((i & 6) == 0) {
                i2 = (M.J(ayv0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-766574912, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.MiniInfoCellContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (MiniInfoCellScreenContent.kt:188)");
                }
                if (ayv0Var instanceof ayv0.a) {
                    vlwVar = new slw(((ayv0.a) ayv0Var).a);
                } else if (ayv0Var instanceof ayv0.b) {
                    vlwVar = new ulw(((ayv0.b) ayv0Var).a);
                } else {
                    if (!(ayv0Var instanceof ayv0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vlwVar = new vlw(((ayv0.c) ayv0Var).a, null);
                }
                if (as.a((i2 & 112) | 8, yzsVar, tlw.a(vlwVar, M, 0), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new bj(i, 1, this, ayv0Var, yzsVar);
            }
        }
    }

    /* compiled from: MiniInfoCellScreenContent.kt */
    public static final class b implements ixj {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // xsna.ixj
        public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-2088088894);
            if ((i & 6) == 0) {
                i2 = (M.y(yzsVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2088088894, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.MiniInfoCellContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (MiniInfoCellScreenContent.kt:198)");
                }
                yzsVar.invoke(Integer.valueOf(this.b), M, Integer.valueOf((i2 << 3) & 112));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new h9g(this, yzsVar, i, 3);
            }
        }
    }

    /* compiled from: MiniInfoCellScreenContent.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkMiniInfoCell.Mode.values().length];
            try {
                iArr[VkMiniInfoCell.Mode.Base.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkMiniInfoCell.Mode.BaseAccent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkMiniInfoCell.Mode.Link.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkMiniInfoCell.Mode.AddInfo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkMiniInfoCell.Mode.MoreInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dr20() {
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair("single line", bool);
        Boolean bool2 = Boolean.TRUE;
        this.c = pn00.k(pair, new Pair("multiline", bool2));
        this.d = pn00.k(new Pair("none", bool), new Pair("chevron", bool2));
        this.e = pn00.k(new Pair("base", VkMiniInfoCell.Mode.Base), new Pair("base accent", VkMiniInfoCell.Mode.BaseAccent), new Pair("link", VkMiniInfoCell.Mode.Link), new Pair("add info", VkMiniInfoCell.Mode.AddInfo), new Pair("more info", VkMiniInfoCell.Mode.MoreInfo));
        this.f = pn00.k(new Pair("none", null), new Pair("icon", new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_lock_outline_16), oq.d(tlo0.Companion, "Content description"), 4)));
        this.g = pn00.k(new Pair("none", null), new Pair("avatars", new VkMiniInfoCell.f(e43.l(new ayv0.b(R.drawable.vk_icon_app_birthday_24), new ayv0.b(R.drawable.vk_icon_app_birthday_24), new ayv0.b(R.drawable.vk_icon_app_birthday_24)), null, 6)), new Pair("avatars & counter", new VkMiniInfoCell.f(e43.l(new ayv0.b(R.drawable.vk_icon_app_birthday_24), new ayv0.b(R.drawable.vk_icon_app_birthday_24)), null, 4)));
        this.h = androidx.compose.runtime.k.b("short text");
        this.i = androidx.compose.runtime.k.b("base");
        this.j = androidx.compose.runtime.k.b("single line");
        this.k = androidx.compose.runtime.k.b("none");
        this.l = androidx.compose.runtime.k.b("none");
        this.m = androidx.compose.runtime.k.b("none");
        this.n = androidx.compose.runtime.k.b(bool);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        dr20 dr20Var = this;
        androidx.compose.runtime.a M = aVar.M(999434281);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(dr20Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(999434281, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.Content (MiniInfoCellScreenContent.kt:110)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new g53(x5Var, 26);
                M.R(x);
            }
            int i4 = i2;
            jjn0.b("Mini Info Cell", gzsVar3, (izs) x, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | ((i2 << 6) & 7168), 48);
            djn0.a(true, true, M, 438, 0);
            q630 a3 = q9g.a(txj0.f(aVar2, 1.0f), 1.0f);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, aVar3, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, a3);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, aVar2);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            int i5 = (i4 >> 15) & 14;
            dr20Var = this;
            dr20Var.c(i5, M);
            f9t.e(txj0.h(aVar2, 24), M, 6);
            dr20Var.b(i5, M);
            M.G();
            M.G();
            dr20Var.d(i5, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wm10(dr20Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        MiniInfoCell$Mode miniInfoCell$Mode;
        String str;
        zq20 a2;
        androidx.compose.runtime.a M = aVar.M(336821672);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(336821672, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.MiniInfoCellContent (MiniInfoCellScreenContent.kt:169)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            ar20 a3 = ar20.a.a((String) this.b.get((String) ((zak0) this.h).getValue()), ((Boolean) this.c.get((String) ((zak0) this.j).getValue())).booleanValue(), ((Boolean) this.d.get((String) ((zak0) this.l).getValue())).booleanValue(), ((Boolean) ((zak0) this.n).getValue()).booleanValue(), null, M, 196608, 16);
            int i3 = c.$EnumSwitchMapping$0[((VkMiniInfoCell.Mode) this.e.get((String) ((zak0) this.i).getValue())).ordinal()];
            if (i3 == 1) {
                miniInfoCell$Mode = MiniInfoCell$Mode.Base;
            } else if (i3 == 2) {
                miniInfoCell$Mode = MiniInfoCell$Mode.BaseAccent;
            } else if (i3 == 3) {
                miniInfoCell$Mode = MiniInfoCell$Mode.Link;
            } else if (i3 == 4) {
                miniInfoCell$Mode = MiniInfoCell$Mode.AddInfo;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                miniInfoCell$Mode = MiniInfoCell$Mode.MoreInfo;
            }
            MiniInfoCell$Mode miniInfoCell$Mode2 = miniInfoCell$Mode;
            VkMiniInfoCell.d dVar = (VkMiniInfoCell.d) this.f.get((String) ((zak0) this.k).getValue());
            br20 br20Var = null;
            if (dVar == null) {
                M.K(1211334505);
                M.j();
                a2 = null;
            } else {
                M.K(1211334506);
                lg90 a4 = fko.a(dVar.a, M);
                tlo0 tlo0Var = dVar.b;
                if (tlo0Var == null) {
                    M.K(-417154747);
                    M.j();
                    str = null;
                } else {
                    M.K(817827388);
                    String I = blk.I(tlo0Var, M);
                    M.j();
                    str = I;
                }
                a2 = zq20.a.a(a4, null, str, M, 24584, 10);
                M.j();
            }
            VkMiniInfoCell.f fVar = (VkMiniInfoCell.f) this.g.get((String) ((zak0) this.m).getValue());
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (fVar == null) {
                M.K(1211610560);
            } else {
                M.K(1211610561);
                boolean y = M.y(fVar);
                Object x = M.x();
                if (y || x == c0012a) {
                    x = new bq00(fVar, 7);
                    M.R(x);
                }
                br20Var = br20.a.a(null, (izs) x, M, 24576, 7);
            }
            M.j();
            br20 br20Var2 = br20Var;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d1(23);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new pd4(18);
                M.R(x3);
            }
            b4v0.a(a3, miniInfoCell$Mode2, m, a2, br20Var2, gzsVar, (gzs) x3, M, 1769472, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new si1(this, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-928298515);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-928298515, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.MiniInfoCellContentView (MiniInfoCellScreenContent.kt:138)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new kz0(29);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new zxo(this, 28);
                M.R(x2);
            }
            ae2.a(6, 0, M, izsVar, (izs) x2, m);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ys3(this, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, java.util.Map] */
    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1932579036);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1932579036, i2, -1, "com.vk.design.demo.presentation.screens.MiniInfoCellScreenContent.MiniInfoCellSettings (MiniInfoCellScreenContent.kt:213)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.i, false);
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
            k9q0.w(M, d, cVar);
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
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 f3 = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            int i4 = i2;
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            String str = (String) ((zak0) this.h).getValue();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i3 = i5;
                x = new d2y(this, 6);
                M.R(x);
            } else {
                i3 = i5;
            }
            int i6 = i3;
            y9i0.a("Text", this.b, str, (izs) x, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            String str2 = (String) ((zak0) this.i).getValue();
            boolean z2 = i6 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new pb00(this, 5);
                M.R(x2);
            }
            y9i0.a("Mode", this.e, str2, (izs) x2, b3, M, 6, 0);
            q630 b4 = tpg0Var.b(1.0f, aVar2, true);
            String str3 = (String) ((zak0) this.j).getValue();
            boolean z3 = i6 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new r3h(this, 25);
                M.R(x3);
            }
            y9i0.a("Multiline", this.c, str3, (izs) x3, b4, M, 6, 0);
            M.G();
            q630 f4 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b5 = tpg0Var.b(1.0f, aVar2, true);
            String str4 = (String) ((zak0) this.k).getValue();
            boolean z4 = i6 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new zl20(this, 2);
                M.R(x4);
            }
            y9i0.a("Icon", this.f, str4, (izs) x4, b5, M, 6, 0);
            q630 b6 = tpg0Var.b(1.0f, aVar2, true);
            String str5 = (String) ((zak0) this.l).getValue();
            boolean z5 = i6 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new owv(this, 7);
                M.R(x5);
            }
            y9i0.a("Chevron", this.d, str5, (izs) x5, b6, M, 6, 0);
            q630 b7 = tpg0Var.b(1.0f, aVar2, true);
            String str6 = (String) ((zak0) this.m).getValue();
            boolean z6 = i6 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new l6u(this, 13);
                M.R(x6);
            }
            y9i0.a("User stack", this.g, str6, (izs) x6, b7, M, 6, 0);
            M.G();
            boolean booleanValue = ((Boolean) ((zak0) this.n).getValue()).booleanValue();
            boolean z7 = i6 == 4;
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new cr20(this, 0);
                M.R(x7);
            }
            eku0.d("Is Text Selectable", (gzs) x7, null, booleanValue, null, false, false, M, 6, 116);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nzy(this, i);
        }
    }
}
