package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.z890;
import xsna.zja;

/* compiled from: CategoriesScreenContent.kt */
/* loaded from: classes18.dex */
public final class zja {

    /* compiled from: CategoriesScreenContent.kt */
    public static final class a implements izs<li2<cka>, llj> {
        @Override // xsna.izs
        public final llj invoke(li2<cka> li2Var) {
            li2<cka> li2Var2 = li2Var;
            int signum = Integer.signum(li2Var2.f().b - li2Var2.b().b);
            nkk nkkVar = luo.a;
            dtp0 d = jq2.d(250, 0, nkkVar, 2);
            dtp0 d2 = jq2.d(250, 0, nkkVar, 2);
            xja xjaVar = new xja(signum);
            jtp0 jtp0Var = anp.a;
            return new llj(new rpp(new gmp0((ciq) null, new b0k0(d, new unp(xjaVar)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125)).b(anp.e(d2, 2)), anp.n(d, new yja(signum)).b(anp.f(d2, 2)), 12);
        }
    }

    /* compiled from: CategoriesScreenContent.kt */
    public static final class b implements izs<li2<z890.c>, llj> {
        @Override // xsna.izs
        public final llj invoke(li2<z890.c> li2Var) {
            li2<z890.c> li2Var2 = li2Var;
            int signum = Integer.signum(li2Var2.f().c - li2Var2.b().c);
            nkk nkkVar = luo.a;
            dtp0 d = jq2.d(250, 0, nkkVar, 2);
            dtp0 d2 = jq2.d(250, 0, nkkVar, 2);
            aka akaVar = new aka(signum);
            jtp0 jtp0Var = anp.a;
            return new llj(new rpp(new gmp0((ciq) null, new b0k0(d, new unp(akaVar)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125)).b(anp.e(d2, 2)), anp.n(d, new bka(signum)).b(anp.f(d2, 2)), 12);
        }
    }

    public static final void a(final String str, cka ckaVar, final izs<? super fja, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        cka ckaVar2;
        androidx.compose.runtime.a M = aVar.M(177645114);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ckaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(177645114, i2, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesScreenContent (CategoriesScreenContent.kt:38)");
            }
            a aVar2 = new a();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new qt0(9);
                M.R(x);
            }
            ckaVar2 = ckaVar;
            xh2.a(ckaVar2, null, aVar2, null, "CategoriesScreenContent", (izs) x, kai.c(465838730, new zzs() { // from class: xsna.uja
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    cka ckaVar3 = (cka) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(465838730, intValue, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesScreenContent.<anonymous> (CategoriesScreenContent.kt:45)");
                    }
                    z890 z890Var = ckaVar3.d;
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    ty6.a aVar4 = dt1.a.n;
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630.a aVar5 = q630.a.a;
                    q630 c = qri.c(aVar3, aVar5);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar6);
                    } else {
                        aVar3.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar3, a2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar3, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar3, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar3, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar3, c, dVar);
                    String title = z890Var.getTitle();
                    if (drm0.N(title)) {
                        title = str;
                    }
                    final izs izsVar2 = izsVar;
                    boolean J = aVar3.J(izsVar2);
                    Object x2 = aVar3.x();
                    Object obj5 = a.C0011a.a;
                    if (J || x2 == obj5) {
                        x2 = new o87(izsVar2, 1);
                        aVar3.R(x2);
                    }
                    rja.a(title, (gzs) x2, aVar3, 0);
                    q630 D2 = p490.D(aVar5, p490.x(aVar3), 14);
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, aVar3, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                    sy90 D3 = aVar3.D();
                    q630 c2 = qri.c(aVar3, D2);
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar6);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a3, cVar);
                    k9q0.w(aVar3, D3, eVar);
                    ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                    k9q0.w(aVar3, c2, dVar);
                    if (z890Var instanceof z890.b) {
                        aVar3.K(1443620500);
                        zja.b(0, aVar3, ((z890.b) z890Var).c, izsVar2);
                        aVar3.j();
                    } else {
                        if (!(z890Var instanceof z890.c)) {
                            throw alb0.c(-1200358658, aVar3);
                        }
                        aVar3.K(1443787559);
                        z890.c cVar2 = (z890.c) z890Var;
                        List list = cVar2.d;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((z890.e) it.next()).a);
                        }
                        int i3 = cVar2.c;
                        boolean J2 = aVar3.J(izsVar2);
                        Object x3 = aVar3.x();
                        if (J2 || x3 == obj5) {
                            x3 = new op3(izsVar2, 1);
                            aVar3.R(x3);
                        }
                        nka.a(i3, arrayList, (izs) x3, aVar3, 0);
                        zja.b bVar2 = new zja.b();
                        Object x4 = aVar3.x();
                        if (x4 == obj5) {
                            x4 = new gt(4);
                            aVar3.R(x4);
                        }
                        xh2.a(cVar2, null, bVar2, null, "CategoriesTabContent", (izs) x4, kai.c(1964805897, new zzs() { // from class: xsna.vja
                            @Override // xsna.zzs
                            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                z890.c cVar3 = (z890.c) obj7;
                                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1964805897, intValue2, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CategoriesScreenContent.kt:74)");
                                }
                                a.m mVar2 = androidx.compose.foundation.layout.a.c;
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar7, 0);
                                int hashCode3 = Long.hashCode(n34.n(aVar7));
                                sy90 D4 = aVar7.D();
                                q630 c3 = qri.c(aVar7, q630.a.a);
                                cri.h7.getClass();
                                LayoutNode.a aVar8 = cri.a.b;
                                if (aVar7.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar7.H();
                                if (aVar7.L()) {
                                    aVar7.I(aVar8);
                                } else {
                                    aVar7.f();
                                }
                                k9q0.w(aVar7, a4, cri.a.f);
                                k9q0.w(aVar7, D4, cri.a.e);
                                k9q0.w(aVar7, Integer.valueOf(hashCode3), cri.a.g);
                                k9q0.t(aVar7, cri.a.h);
                                k9q0.w(aVar7, c3, cri.a.d);
                                z890.e eVar2 = (z890.e) j5g.b0(cVar3.c, new wow(cVar3.d));
                                ArrayList arrayList2 = eVar2 != null ? eVar2.b : null;
                                if (arrayList2 == null) {
                                    aVar7.K(-1317071356);
                                } else {
                                    aVar7.K(-1317071355);
                                    zja.b(0, aVar7, arrayList2, izs.this);
                                }
                                aVar7.j();
                                aVar7.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 1794048, 10);
                        aVar3.j();
                    }
                    if (kr.f(aVar3)) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 3) & 14) | 1794048, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            ckaVar2 = ckaVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx9(str, ckaVar2, izsVar, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(-1887344374);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1887344374, i2, -1, "com.vk.ecomm.categories.impl.presentation.ui.EntryListContent (CategoriesScreenContent.kt:88)");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                z890.d dVar = (z890.d) list.get(i3);
                Image image = dVar.c;
                String h = ixj0.h(image != null ? image.b : null);
                q630 E = ahn.E(q630.a.a, "category_list_item_" + i3);
                String str = dVar.b;
                boolean J = ((i2 & 112) == 32) | M.J(dVar);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new kg(5, izsVar, dVar);
                    M.R(x);
                }
                lja.a(0, M, h, str, (gzs) x, E);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wja(list, izsVar, i, 0);
        }
    }
}
