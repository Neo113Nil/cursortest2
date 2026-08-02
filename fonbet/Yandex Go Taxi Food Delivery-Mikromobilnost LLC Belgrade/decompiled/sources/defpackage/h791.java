package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.messaging.domain.user.UserNameType;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class h791 {
    public static au2 a;

    public static final void a(CharSequence charSequence, boolean z, sls slsVar, rwa rwaVar, boolean z2, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 x2yVar;
        boolean z3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1904779996);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.k(rwaVar) ? 2048 : 1024) | (btsVar2.a(z2) ? 16384 : 8192) | (btsVar2.k(f530Var) ? 131072 : 65536);
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 l = ymb1.l(f530Var, cyk0.c(rwaVar.b));
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            f530 m = an91.m(q791.b(l, (zx40) Q, null, false, null, null, slsVar, 28), rwaVar.k, 0.0f, 2);
            lhl0 a2 = khl0.a(lr20.e, x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            ety0 ety0Var = xya1.e(btsVar2).g.a;
            wp2 wp2Var = z ? rwaVar.h : rwaVar.i;
            int i3 = z ? 2 : 1;
            c530 c530Var = c530.a;
            if (z) {
                x2yVar = c530Var;
                z3 = false;
            } else {
                z3 = false;
                x2yVar = new x2y(1.0f, false);
            }
            boolean z4 = z3;
            qgy.b(charSequence, null, an91.m(x2yVar, rwaVar.n, 0.0f, 2), wp2Var, 0L, 0L, new sjy0(3), 0L, 2, i3, 0, ety0Var, null, btsVar2, (i2 & 14) | 805306368, 0, 10610);
            btsVar = btsVar2;
            if (z2) {
                btsVar.e0(2110042214);
                long j = rwaVar.m;
                k3r k3rVar = ljs0.a;
                pi6.a(bzk0.c(ymb1.l(ljs0.n(c530Var, c8m.b(j), c8m.a(j)), cyk0.a), rwaVar.j, qke.q), btsVar, z4 ? 1 : 0);
                btsVar.t(z4);
            } else {
                btsVar.e0(2110192130);
                btsVar.t(z4);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qwa(charSequence, z, slsVar, rwaVar, z2, f530Var, i);
        }
    }

    public static final void b(final f530 f530Var, final List list, final nwa nwaVar, final tls tlsVar, rwa rwaVar, fid fidVar, final int i) {
        bts btsVar;
        final rwa rwaVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1508384674);
        int i2 = i | (btsVar2.k(list) ? 32 : 16) | (btsVar2.k(nwaVar) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            final rwa rwaVar3 = rwa.p;
            if (list.isEmpty()) {
                aii0 v = btsVar2.v();
                if (v != null) {
                    final int i3 = 0;
                    v.d = new wls(f530Var, list, nwaVar, tlsVar, rwaVar3, i, i3) { // from class: owa
                        public final /* synthetic */ int a;
                        public final /* synthetic */ f530 b;
                        public final /* synthetic */ List c;
                        public final /* synthetic */ nwa w;
                        public final /* synthetic */ tls x;
                        public final /* synthetic */ rwa y;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(7);
                                    h791.b(this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(7);
                                    h791.b(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (jl40.l((nwa) it.next(), nwaVar)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                Integer valueOf = Integer.valueOf(i4);
                if (i4 < 0) {
                    valueOf = null;
                }
                Q = Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
                btsVar2.o0(Q);
            }
            final int intValue = ((Number) Q).intValue();
            final lry0 b = pnb1.b(btsVar2);
            btsVar = btsVar2;
            xab1.a(an91.k(bzk0.c(ymb1.l(ljs0.e(ljs0.c(f530Var, 1.0f), rwaVar3.a), cyk0.c(rwaVar3.b)), rwaVar3.c, qke.q), rwaVar3.f), null, wwg.S(2102837900, true, new zls() { // from class: pwa
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    pwa pwaVar = this;
                    dj6 dj6Var = (dj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                        btsVar3.e0(-2102373354);
                        fwi fwiVar = (fwi) btsVar3.m(j.h);
                        nwa nwaVar2 = nwa.this;
                        float H = fwiVar.H((int) (lry0.a(b, nwaVar2.b.toString(), xya1.e(btsVar3).g.a, null, 1004).c >> 32));
                        btsVar3.t(false);
                        boolean z2 = nwaVar2.c;
                        rwa rwaVar4 = rwaVar3;
                        float b2 = z2 ? c8m.b(rwaVar4.m) + rwaVar4.n : 0.0f;
                        float f = rwaVar4.k;
                        float f2 = rwaVar4.e;
                        float f3 = rwaVar4.d;
                        float f4 = (f * 2.0f) + H + rwaVar4.o + b2;
                        float d = dj6Var.d();
                        List list2 = list;
                        float size = d / list2.size();
                        y7m y7mVar = new y7m(f4);
                        y7m y7mVar2 = new y7m(rwaVar4.l);
                        y7m y7mVar3 = new y7m(dj6Var.d());
                        if (y7mVar2.compareTo(y7mVar3) > 0) {
                            y7mVar2 = y7mVar3;
                        }
                        if (y7mVar.compareTo(y7mVar2) > 0) {
                            y7mVar = y7mVar2;
                        }
                        int size2 = list2.size();
                        float f5 = y7mVar.a;
                        float d2 = size2 == 1 ? f5 : (dj6Var.d() - f5) / scc.f(list2);
                        boolean z3 = y7m.a(d2, f5) >= 0;
                        if (z3) {
                            f5 = size;
                        }
                        if (!z3) {
                            size = d2;
                        }
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        Iterator it2 = list3.iterator();
                        int i5 = 0;
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            int i6 = intValue;
                            if (hasNext) {
                                Object next = it2.next();
                                int i7 = i5 + 1;
                                if (i5 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                arrayList.add(new y7m(i5 == i6 ? f5 : size));
                                i5 = i7;
                            } else {
                                Iterator it3 = a.A0(arrayList, i6).iterator();
                                float f6 = 0.0f;
                                while (it3.hasNext()) {
                                    f6 += ((y7m) it3.next()).a;
                                }
                                m3u0 a2 = androidx.compose.animation.core.b.a(f6, null, "ChargersTabIndicatorOffset", null, btsVar3, 384, 10);
                                m3u0 a3 = androidx.compose.animation.core.b.a(((y7m) arrayList.get(i6)).a, null, "ChargersTabIndicatorWidth", null, btsVar3, 384, 10);
                                float f7 = ((y7m) a2.getValue()).a;
                                c530 c530Var = c530.a;
                                pi6.a(bzk0.c(ymb1.l(hbb1.b(ljs0.e(ljs0.q(sm91.f(c530Var, f7, 0.0f, 2), ((y7m) a3.getValue()).a), f3), dbb1.a(btsVar3), cyk0.c(f2), false, 12), cyk0.c(f2)), rwaVar4.g, qke.q), btsVar3, 0);
                                f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), f3);
                                lhl0 a4 = khl0.a(lr20.e, x4c.D, btsVar3, 6);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d3 = b.d(btsVar3, e);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a4);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                btsVar3.e0(791788203);
                                int i8 = 0;
                                for (Object obj4 : list3) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    nwa nwaVar3 = (nwa) obj4;
                                    CharSequence charSequence = nwaVar3.b;
                                    boolean z4 = nwaVar3.c;
                                    boolean equals = nwaVar2.equals(nwaVar3);
                                    f530 e2 = ljs0.e(ljs0.q(c530Var, ((y7m) arrayList.get(i8)).a), f3);
                                    tls tlsVar2 = tlsVar;
                                    boolean k = btsVar3.k(tlsVar2) | btsVar3.k(nwaVar3);
                                    Object Q2 = btsVar3.Q();
                                    if (k || Q2 == did.a) {
                                        Q2 = new n8a(9, tlsVar2, nwaVar3);
                                        btsVar3.o0(Q2);
                                    }
                                    bts btsVar4 = btsVar3;
                                    h791.a(charSequence, equals, (sls) Q2, rwaVar4, z4, e2, btsVar4, 0);
                                    c530Var = c530Var;
                                    i8 = i9;
                                    btsVar3 = btsVar4;
                                    pwaVar = this;
                                }
                                btsVar3.t(false);
                                btsVar3.t(true);
                            }
                        }
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            rwaVar2 = rwaVar3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            rwaVar2 = rwaVar;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i5 = 1;
            v2.d = new wls(f530Var, list, nwaVar, tlsVar, rwaVar2, i, i5) { // from class: owa
                public final /* synthetic */ int a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ nwa w;
                public final /* synthetic */ tls x;
                public final /* synthetic */ rwa y;

                {
                    this.a = i5;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(7);
                            h791.b(this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(7);
                            h791.b(this.b, this.c, this.w, this.x, this.y, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static y0h c(j3h j3hVar, String str) {
        y0h a2;
        l3h l3hVar = (l3h) j3hVar;
        Deeplink e = w691.e(l3hVar.d, Uri.parse(str), true, null, false, 12);
        return (e == null || (a2 = l3hVar.a(e, true)) == null) ? x0h.a : a2;
    }

    public static y0h d(j3h j3hVar, Uri uri, int i) {
        l3h l3hVar = (l3h) j3hVar;
        return l3hVar.d(uri != null ? ((com.ybsdk.screens.initial.deeplink.a) l3hVar.d).a(uri, true, DeeplinkSource.UNSPECIFIED, (i & 8) == 0) : null);
    }

    public static y0h e(j3h j3hVar, String str, boolean z, DeeplinkSource deeplinkSource, int i) {
        Uri uri;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            deeplinkSource = DeeplinkSource.UNSPECIFIED;
        }
        l3h l3hVar = (l3h) j3hVar;
        if (str != null) {
            l3hVar.getClass();
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        return l3hVar.d(uri != null ? ((com.ybsdk.screens.initial.deeplink.a) l3hVar.d).a(uri, z, deeplinkSource, false) : null);
    }

    public static void f(j3h j3hVar, String str, FragmentScreen fragmentScreen) {
        l3h l3hVar = (l3h) j3hVar;
        l3hVar.getClass();
        if (e(l3hVar, str, true, null, 4) instanceof x0h) {
            l3hVar.a.h(fragmentScreen);
        }
    }

    public static final String g(qp21 qp21Var, Resources resources, String str) {
        String str2 = qp21Var.a;
        return str2 == null ? qp21Var.b == UserNameType.DELETED ? resources.getString(oyh0.deleted_account_name) : str == null ? "" : str : str2;
    }
}
