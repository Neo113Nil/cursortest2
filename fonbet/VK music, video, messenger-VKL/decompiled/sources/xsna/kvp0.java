package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.modal.Mode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.kvp0;
import xsna.q630;
import xsna.s2x;
import xsna.ty6;

/* compiled from: TypographyPlaygroundContent.kt */
/* loaded from: classes18.dex */
public final class kvp0 implements yah0 {
    public final Object b;

    /* compiled from: TypographyPlaygroundContent.kt */
    public static final class a {
        public final String a;
        public final nmo0 b;
        public final fno0 c;
        public final b6s d;

        public a(String str, nmo0 nmo0Var, fno0 fno0Var, b6s b6sVar) {
            this.a = str;
            this.b = nmo0Var;
            this.c = fno0Var;
            this.d = b6sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = yga0.b(this.b, this.a.hashCode() * 31, 31);
            fno0 fno0Var = this.c;
            int hashCode = (b + (fno0Var == null ? 0 : Long.hashCode(fno0Var.a))) * 31;
            b6s b6sVar = this.d;
            return hashCode + (b6sVar != null ? b6sVar.b : 0);
        }

        public final String toString() {
            return "TextStyleWrapper(name=" + this.a + ", textStyle=" + this.b + ", opticalSize=" + this.c + ", fontWeight=" + this.d + ')';
        }
    }

    public kvp0() {
        wuv0 b = c2v0.b();
        this.b = pn00.k(new Pair("Title1", b.u), new Pair("Title2", b.z), new Pair("Title3", b.E), new Pair("Label1", b.W0), new Pair("Label2", b.b1), new Pair("Body", b.g1), new Pair("Headline", b.l1), new Pair("TextBold", b.V), new Pair("Text", b.T), new Pair("Paragraph", b.Y), new Pair("Footnote", b.i0), new Pair("FootnoteBold", b.k0));
    }

    public static b5s d(String str, fno0 fno0Var, b6s b6sVar) {
        if (epx.f(str, "Title1")) {
            return u4s.b;
        }
        ArrayList arrayList = new ArrayList();
        if (fno0Var != null) {
            long j = fno0Var.a;
            if (!fno0.e(j)) {
                vzw.a("'opsz' must be provided in sp units");
            }
            arrayList.add(new z5s(j));
        }
        if (b6sVar != null) {
            int i = b6sVar.b;
            if (1 > i || i >= 1001) {
                vzw.a("'wght' value must be in [1, 1000]. Actual: " + i);
            }
            arrayList.add(new y5s(i));
        }
        x5s[] x5sVarArr = (x5s[]) arrayList.toArray(new x5s[0]);
        return new b5s(Collections.singletonList(a5s.a(new a6s((x5s[]) Arrays.copyOf(x5sVarArr, x5sVarArr.length)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        final wh50 wh50Var;
        a.C0011a.C0012a c0012a;
        final wh50 wh50Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1044998088);
        int i3 = (i & 6) == 0 ? (M.y(gzsVar) ? 4 : 2) | i : i;
        int i4 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i3 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (73731 & i3) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1044998088, i3, -1, "com.vk.design.demo.presentation.screens.typography.TypographyPlaygroundContent.Content (TypographyPlaygroundContent.kt:112)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                ?? r11 = this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(r11.size()));
                for (Map.Entry entry : r11.entrySet()) {
                    Object key = entry.getKey();
                    String str = (String) entry.getKey();
                    frv0 frv0Var = (frv0) entry.getValue();
                    b6s b6sVar = frv0Var.a.a.c;
                    b6s b6sVar2 = epx.f(str, "Title1") ? b6sVar : null;
                    if (epx.f(str, "Title1")) {
                        b6sVar = null;
                    }
                    linkedHashMap.put(key, new a(str, nmo0.a(frv0Var.a, 0L, 0L, b6sVar2, d(str, null, b6sVar), 0L, 0L, null, null, 16777179), null, b6sVar));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                M.R(linkedHashMap2);
                x = linkedHashMap2;
            }
            final Map map = (Map) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b("Центр экспериментальной музеологии — это инициатива фонда V-A-C");
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = androidx.compose.runtime.k.b(null);
                M.R(x4);
            }
            wh50 wh50Var5 = (wh50) x4;
            lg90 m = m200.m(M);
            lg90 r = m200.r(M);
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = new iml0(wh50Var4, 7);
                M.R(x5);
            }
            wh50 wh50Var6 = wh50Var5;
            muv0.e("Lego Typography Playground", null, null, m, null, gzsVar, false, r, false, (gzs) x5, M, ((i3 << 15) & 458752) | 16781318, 6, 854);
            androidx.compose.runtime.a aVar5 = M;
            q630 D2 = p490.D(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), p490.x(aVar5), 14);
            a.m mVar2 = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar6 = dt1.a.n;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, aVar6, aVar5, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar5));
            sy90 D3 = aVar5.D();
            q630 c2 = qri.c(aVar5, D2);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (aVar5.N() == null) {
                n34.r();
                throw null;
            }
            aVar5.H();
            if (aVar5.L()) {
                aVar5.I(aVar7);
            } else {
                aVar5.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar5, a3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar5, D3, eVar);
            Integer valueOf = Integer.valueOf(hashCode2);
            cri.a.b bVar = cri.a.g;
            k9q0.w(aVar5, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(aVar5, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar5, c2, dVar);
            float f2 = 24;
            f9t.e(txj0.h(aVar3, f2), aVar5, 6);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(30), aVar6, aVar5, 6);
            int hashCode3 = Long.hashCode(n34.n(aVar5));
            sy90 D4 = aVar5.D();
            q630 c3 = qri.c(aVar5, aVar3);
            if (aVar5.N() == null) {
                n34.r();
                throw null;
            }
            aVar5.H();
            if (aVar5.L()) {
                aVar5.I(aVar7);
            } else {
                aVar5.f();
            }
            k9q0.w(aVar5, a4, cVar);
            k9q0.w(aVar5, D4, eVar);
            ur.d(hashCode3, aVar5, bVar, aVar5, c2678a);
            k9q0.w(aVar5, c3, dVar);
            aVar5.K(1688989679);
            for (Map.Entry entry2 : map.entrySet()) {
                String str2 = (String) entry2.getKey();
                a aVar8 = (a) entry2.getValue();
                String str3 = (String) wh50Var3.getValue();
                boolean J = aVar5.J(str2);
                Object x6 = aVar5.x();
                if (J || x6 == c0012a2) {
                    i2 = 24;
                    x6 = new ni0(i2, str2, wh50Var6);
                    aVar5.R(x6);
                } else {
                    i2 = 24;
                }
                wh50 wh50Var7 = wh50Var6;
                androidx.compose.runtime.a aVar9 = aVar5;
                c(str2, aVar8, str3, (gzs) x6, aVar9, (i3 >> 3) & 57344, 0);
                i3 = i3;
                wh50Var3 = wh50Var3;
                aVar3 = aVar3;
                c0012a2 = c0012a2;
                aVar5 = aVar9;
                wh50Var6 = wh50Var7;
            }
            wh50 wh50Var8 = wh50Var3;
            wh50 wh50Var9 = wh50Var6;
            q630.a aVar10 = aVar3;
            a.C0011a.C0012a c0012a3 = c0012a2;
            androidx.compose.runtime.a aVar11 = aVar5;
            aVar11.j();
            aVar11.G();
            f9t.e(txj0.h(aVar10, f2), aVar11, 6);
            aVar11.G();
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                aVar11.K(-988418123);
                Mode mode = Mode.Card;
                Object x7 = aVar11.x();
                if (x7 == c0012a3) {
                    x7 = new g2c(2, wh50Var4);
                    aVar11.R(x7);
                }
                jai c4 = kai.c(-465175815, new gyn(wh50Var8, 5), aVar11);
                c0012a = c0012a3;
                wh50Var = wh50Var8;
                wh50Var2 = wh50Var9;
                a030.b(mode, (gzs) x7, aVar10, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, c4, aVar11, 438, 100663296, 262136);
                aVar2 = aVar11;
            } else {
                aVar2 = aVar11;
                wh50Var = wh50Var8;
                c0012a = c0012a3;
                wh50Var2 = wh50Var9;
                aVar2.K(-995267728);
            }
            aVar2.j();
            final String str4 = (String) wh50Var2.getValue();
            if (str4 == null) {
                aVar2.K(-987761823);
            } else {
                aVar2.K(-987761822);
                Mode mode2 = Mode.Card;
                Object x8 = aVar2.x();
                if (x8 == c0012a) {
                    x8 = new moi(1, wh50Var2);
                    aVar2.R(x8);
                }
                androidx.compose.runtime.a aVar12 = aVar2;
                a030.b(mode2, (gzs) x8, aVar10, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(605055150, new yzs() { // from class: xsna.gvp0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if (aVar13.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(605055150, intValue, -1, "com.vk.design.demo.presentation.screens.typography.TypographyPlaygroundContent.Content.<anonymous>.<anonymous>.<anonymous> (TypographyPlaygroundContent.kt:207)");
                            }
                            Map map2 = map;
                            String str5 = str4;
                            kvp0.a aVar14 = (kvp0.a) map2.get(str5);
                            String str6 = (String) wh50Var.getValue();
                            boolean y = aVar13.y(map2) | aVar13.J(str5);
                            Object x9 = aVar13.x();
                            if (y || x9 == a.C0011a.a) {
                                x9 = new cp9(map2, str5, wh50Var2, 6);
                                aVar13.R(x9);
                            }
                            kvp0.this.b(str5, aVar14, str6, (izs) x9, aVar13, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar13.h();
                        }
                        return s3q0.a;
                    }
                }, aVar2), aVar12, 438, 100663296, 262136);
                aVar2 = aVar12;
                s3q0 s3q0Var = s3q0.a;
            }
            aVar2.j();
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
            s.d = new i07(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final String str, final a aVar, final String str2, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        final wh50 wh50Var4;
        String f;
        String num;
        izs<? super a, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(-1539282640);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.J(aVar) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | (M.y(this) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1539282640, i3, -1, "com.vk.design.demo.presentation.screens.typography.TypographyPlaygroundContent.EditStyleForm (TypographyPlaygroundContent.kt:265)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(new a(aVar.a, aVar.b, aVar.c, aVar.d));
                M.R(x);
            }
            wh50 wh50Var5 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b(String.valueOf(fno0.d(((a) wh50Var5.getValue()).b.a.b)));
                M.R(x2);
            }
            wh50 wh50Var6 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(String.valueOf(fno0.d(((a) wh50Var5.getValue()).b.b.c)));
                M.R(x3);
            }
            wh50 wh50Var7 = (wh50) x3;
            Object x4 = M.x();
            String str3 = "";
            if (x4 == c0012a2) {
                b6s b6sVar = ((a) wh50Var5.getValue()).d;
                if (b6sVar == null || (num = Integer.valueOf(b6sVar.b).toString()) == null) {
                    b6s b6sVar2 = ((a) wh50Var5.getValue()).b.a.c;
                    num = b6sVar2 != null ? Integer.valueOf(b6sVar2.b).toString() : "";
                }
                x4 = androidx.compose.runtime.k.b(num);
                M.R(x4);
            }
            wh50 wh50Var8 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a2) {
                fno0 fno0Var = ((a) wh50Var5.getValue()).c;
                i2 = i3;
                if (fno0Var != null && (f = Float.valueOf(fno0.d(fno0Var.a)).toString()) != null) {
                    str3 = f;
                }
                x5 = androidx.compose.runtime.k.b(str3);
                M.R(x5);
            } else {
                i2 = i3;
            }
            final wh50 wh50Var9 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a2) {
                c0012a = c0012a2;
                x6 = androidx.compose.runtime.k.b(String.valueOf(fno0.d(((a) wh50Var5.getValue()).b.a.h)));
                M.R(x6);
            } else {
                c0012a = c0012a2;
            }
            final wh50 wh50Var10 = (wh50) x6;
            q630.a aVar3 = q630.a.a;
            float f2 = 12;
            q630 D = s200.D(txj0.f(aVar3, 1.0f), f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            c(str, (a) wh50Var5.getValue(), str2, null, M, i2 & 58254, 8);
            float f3 = 24;
            f9t.e(txj0.h(aVar3, f3), M, 6);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.k, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f4 = txj0.f(aVar3, 1.0f);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, f4, true);
            String str4 = (String) wh50Var6.getValue();
            Object x7 = M.x();
            a.C0011a.C0012a c0012a3 = c0012a;
            if (x7 == c0012a3) {
                wh50Var = wh50Var6;
                x7 = new e9i0(wh50Var, 13);
                M.R(x7);
            } else {
                wh50Var = wh50Var6;
            }
            int i4 = i2;
            final wh50 wh50Var11 = wh50Var;
            z0v0.a(s2x.a.C3649a.a(str4, (izs) x7, null, null, null, M, 48, 32764), b, null, false, M, 0, 12);
            q630 b2 = tpg0Var.b(1.0f, txj0.f(aVar3, 1.0f), true);
            String str5 = (String) wh50Var7.getValue();
            Object x8 = M.x();
            if (x8 == c0012a3) {
                wh50Var2 = wh50Var7;
                x8 = new kzq(1, wh50Var2);
                M.R(x8);
            } else {
                wh50Var2 = wh50Var7;
            }
            final wh50 wh50Var12 = wh50Var2;
            z0v0.a(s2x.a.C3649a.a(str5, (izs) x8, null, null, null, M, 48, 32764), b2, null, false, M, 0, 12);
            q630 b3 = tpg0Var.b(1.0f, txj0.f(aVar3, 1.0f), true);
            String str6 = (String) wh50Var8.getValue();
            Object x9 = M.x();
            if (x9 == c0012a3) {
                wh50Var3 = wh50Var8;
                x9 = new lyl0(wh50Var3, 7);
                M.R(x9);
            } else {
                wh50Var3 = wh50Var8;
            }
            final wh50 wh50Var13 = wh50Var3;
            z0v0.a(s2x.a.C3649a.a(str6, (izs) x9, null, null, null, M, 48, 32764), b3, null, false, M, 0, 12);
            q630 b4 = tpg0Var.b(1.0f, txj0.f(aVar3, 1.0f), true);
            String str7 = (String) wh50Var9.getValue();
            Object x10 = M.x();
            if (x10 == c0012a3) {
                x10 = new xka0(wh50Var9, 18);
                M.R(x10);
            }
            z0v0.a(s2x.a.C3649a.a(str7, (izs) x10, null, null, null, M, 48, 32764), b4, null, false, M, 0, 12);
            q630 b5 = tpg0Var.b(1.0f, txj0.f(aVar3, 1.0f), true);
            String str8 = (String) wh50Var10.getValue();
            Object x11 = M.x();
            if (x11 == c0012a3) {
                x11 = new hij0(wh50Var10, 10);
                M.R(x11);
            }
            boolean z = true;
            z0v0.a(s2x.a.C3649a.a(str8, (izs) x11, null, null, null, M, 48, 32764), b5, null, false, M, 0, 12);
            M.G();
            f9t.e(txj0.h(aVar3, f3), M, 6);
            q630 f5 = txj0.f(aVar3, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Medium;
            boolean y = M.y(this);
            Object x12 = M.x();
            if (y || x12 == c0012a3) {
                wh50Var4 = wh50Var5;
                gzs gzsVar = new gzs() { // from class: xsna.ivp0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final Object invoke() {
                        kvp0 kvp0Var = kvp0.this;
                        wh50 wh50Var14 = wh50Var9;
                        wh50 wh50Var15 = wh50Var13;
                        wh50 wh50Var16 = wh50Var4;
                        wh50 wh50Var17 = wh50Var11;
                        wh50 wh50Var18 = wh50Var12;
                        wh50 wh50Var19 = wh50Var10;
                        try {
                            b6s b6sVar3 = null;
                            fno0 fno0Var2 = ((String) wh50Var14.getValue()).length() == 0 ? null : new fno0(l2l0.n(Float.parseFloat((String) wh50Var14.getValue()), 4294967296L));
                            b6s b6sVar4 = new b6s(Integer.parseInt((String) wh50Var15.getValue()));
                            b6s b6sVar5 = epx.f(((kvp0.a) wh50Var16.getValue()).a, "Title1") ? b6sVar4 : null;
                            if (!epx.f(((kvp0.a) wh50Var16.getValue()).a, "Title1")) {
                                b6sVar3 = b6sVar4;
                            }
                            String str9 = ((kvp0.a) wh50Var16.getValue()).a;
                            nmo0 nmo0Var = ((kvp0.a) wh50Var16.getValue()).b;
                            String str10 = ((kvp0.a) wh50Var16.getValue()).a;
                            kvp0Var.getClass();
                            wh50Var16.setValue(new kvp0.a(str9, nmo0.a(nmo0Var, 0L, l2l0.n(Float.parseFloat((String) wh50Var17.getValue()), 4294967296L), b6sVar5, kvp0.d(str10, fno0Var2, b6sVar3), l2l0.n(Float.parseFloat((String) wh50Var19.getValue()), 8589934592L), l2l0.n(Float.parseFloat((String) wh50Var18.getValue()), 4294967296L), null, null, 16645977), fno0Var2, b6sVar3));
                        } catch (NumberFormatException unused) {
                        }
                        return s3q0.a;
                    }
                };
                M.R(gzsVar);
                x12 = gzsVar;
            } else {
                wh50Var4 = wh50Var5;
            }
            bhu0.e((gzs) x12, buttonSize, buttonStyle, buttonAppearance, f5, null, false, false, null, null, null, "Примерить значения", null, null, null, null, false, null, null, null, M, 28080, 384, 0, 4190176);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 f6 = txj0.f(aVar3, 1.0f);
            ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
            if ((i4 & 7168) != 2048) {
                z = false;
            }
            Object x13 = M.x();
            if (z || x13 == c0012a3) {
                izsVar2 = izsVar;
                x13 = new y4(26, izsVar2, wh50Var4);
                M.R(x13);
            } else {
                izsVar2 = izsVar;
            }
            M = M;
            bhu0.e((gzs) x13, buttonSize, buttonStyle2, buttonAppearance, f6, null, false, false, null, null, null, "Сохранить и закрыть", null, null, null, null, false, null, null, null, M, 28080, 384, 0, 4190176);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final izs<? super a, s3q0> izsVar3 = izsVar2;
            s.d = new wzs(str, aVar, str2, izsVar3, i) { // from class: xsna.jvp0
                public final /* synthetic */ String c;
                public final /* synthetic */ kvp0.a d;
                public final /* synthetic */ String e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kvp0.this.b(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007c  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, a aVar, String str2, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i, int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a aVar3;
        gzs<s3q0> gzsVar3;
        androidx.compose.runtime.f s;
        int i4;
        int i5;
        String f;
        androidx.compose.runtime.a M = aVar2.M(-312427706);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(str2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.y(this) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                aVar3 = M;
                aVar3.h();
                gzsVar3 = gzsVar2;
            } else {
                gzs<s3q0> gzsVar4 = i6 != 0 ? null : gzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-312427706, i3, -1, "com.vk.design.demo.presentation.screens.typography.TypographyPlaygroundContent.TextStyleCard (TypographyPlaygroundContent.kt:227)");
                }
                q630.a aVar4 = q630.a.a;
                q630 f2 = txj0.f(aVar4, 1.0f);
                boolean z = (i3 & 7168) == 2048;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new t(1, gzsVar4);
                    M.R(x);
                }
                q630 c = ojc.c(f2, false, null, null, (gzs) x, 15);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, c);
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
                int i7 = i3;
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c2, dVar);
                q630 f3 = txj0.f(aVar4, 1.0f);
                gzs<s3q0> gzsVar5 = gzsVar4;
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.k, M, 6);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, f3);
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
                k9q0.w(M, a3, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c3, dVar);
                ?? r4 = this.b;
                nmo0 nmo0Var = ((frv0) r4.get("Footnote")).a;
                if (androidx.compose.runtime.b.d()) {
                    i4 = -1;
                    i5 = 0;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    i4 = -1;
                    i5 = 0;
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i8 = i5;
                int i9 = i4;
                djo0.b(str, null, l5g.c(14, ylu0Var.getText().m, 0.5f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nmo0Var, M, i7 & 14, 0, 65530);
                nmo0 nmo0Var2 = aVar.b;
                fno0 fno0Var = aVar.c;
                b6s b6sVar = aVar.d;
                String f4 = fno0.f(nmo0Var2.a.b);
                String f5 = fno0.f(nmo0Var2.b.c);
                String str3 = "-";
                String valueOf2 = b6sVar != null ? Integer.valueOf(b6sVar.b) : "-";
                if (fno0Var != null && (f = fno0.f(fno0Var.a)) != null) {
                    str3 = f;
                }
                String f6 = fno0.f(nmo0Var2.a.h);
                StringBuilder sb = new StringBuilder();
                sb.append(f4);
                sb.append(" / ");
                sb.append(f5);
                sb.append(" / ");
                sb.append(valueOf2);
                String d = h5s.d(sb, " / ", str3, " / ", f6);
                nmo0 nmo0Var3 = ((frv0) r4.get("Footnote")).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i8, i9, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = M;
                djo0.b(d, null, l5g.c(14, ylu0Var2.getText().m, 0.5f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, nmo0Var3, aVar3, 0, 0, 65530);
                aVar3.G();
                f9t.e(txj0.h(aVar4, 6), aVar3, 6);
                djo0.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.b, aVar3, (i7 >> 6) & 14, 0, 65534);
                aVar3.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                gzsVar3 = gzsVar5;
            }
            s = aVar3.s();
            if (s == null) {
                s.d = new hvp0(this, str, aVar, str2, gzsVar3, i, i2);
                return;
            }
            return;
        }
        gzsVar2 = gzsVar;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = aVar3.s();
        if (s == null) {
        }
    }
}
