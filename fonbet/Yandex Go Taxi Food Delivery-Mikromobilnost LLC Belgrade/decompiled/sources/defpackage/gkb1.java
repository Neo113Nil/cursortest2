package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.badge.BadgeSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class gkb1 {
    public static final void a(swa swaVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-940488357);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(swaVar) : btsVar.e(swaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = swaVar.a;
            List list = swaVar.c;
            tn9 tn9Var = swaVar.b;
            if (charSequence == null && tn9Var == null) {
                btsVar.e0(-1780330863);
                btsVar.t(false);
            } else {
                btsVar.e0(-1780434651);
                c(swaVar.a, tn9Var, btsVar, 0);
                btsVar.t(false);
            }
            if (list.isEmpty()) {
                btsVar.e0(-1780105679);
                btsVar.t(false);
            } else {
                btsVar.e0(-1780288269);
                b(list, tlsVar, tlsVar2, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new aya(swaVar, tlsVar, tlsVar2, i, 1);
        }
    }

    public static final void b(List list, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2074181636);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(list) : btsVar.e(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-2055024961);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ckb1.a((twa) it.next(), tlsVar, tlsVar2, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) list, (Object) tlsVar, (Object) tlsVar2, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public static final void c(CharSequence charSequence, tn9 tn9Var, fid fidVar, int i) {
        CharSequence charSequence2;
        tn9 tn9Var2;
        bts btsVar;
        ?? r12;
        bts btsVar2;
        boolean z;
        l690 b;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1942717719);
        int i2 = i | (btsVar3.k(charSequence) ? 4 : 2) | (btsVar3.e(tn9Var) ? 32 : 16);
        if (btsVar3.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.g, x4c.D, btsVar3, 6);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, c);
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
            qje.W(btsVar3, d.f, a);
            qje.W(btsVar3, d.e, o);
            qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar3, d.h);
            qje.W(btsVar3, d.d, d);
            if (charSequence != null) {
                btsVar3.e0(1086840291);
                qgy.b(charSequence, null, c530Var, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, (i2 & 14) | 384, 0, 16378);
                charSequence2 = charSequence;
                bts btsVar4 = btsVar3;
                r12 = 0;
                btsVar4.t(false);
                btsVar2 = btsVar4;
            } else {
                r12 = 0;
                charSequence2 = charSequence;
                btsVar3.e0(1086919093);
                btsVar3.t(false);
                btsVar2 = btsVar3;
            }
            tn9Var2 = tn9Var;
            if (tn9Var2 != null) {
                btsVar2.e0(1086948946);
                mm4 mm4Var = wk4.a;
                mm4 mm4Var2 = new mm4(new up2(rzo.d(tn9Var2.b)), mm4Var.b, mm4Var.c);
                String obj = tn9Var2.a.toString();
                BadgeSize badgeSize = BadgeSize.M;
                int i3 = gya.a[badgeSize.ordinal()];
                z = true;
                if (i3 == 1) {
                    b = an91.b(4.0f, 0.0f, 2);
                } else if (i3 == 2) {
                    b = an91.b(6.0f, 0.0f, 2);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return;
                    }
                    b = an91.b(6.0f, 0.0f, 2);
                }
                wk4.a(badgeSize, mm4Var2, b, c530Var, wwg.S(-1790062893, true, new hya(badgeSize, obj, r12), btsVar2), btsVar2, ImageMetadata.EDGE_MODE);
                btsVar2.t(r12);
            } else {
                z = true;
                btsVar2.e0(1087136341);
                btsVar2.t(r12);
            }
            btsVar2.t(z);
            btsVar = btsVar2;
        } else {
            charSequence2 = charSequence;
            tn9Var2 = tn9Var;
            btsVar3.Y();
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(charSequence2, tn9Var2, i, 11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dc, code lost:
    
        r0 = r8.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e0, code lost:
    
        defpackage.gwk0.m(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s5x0 d(oll0 oll0Var, String str) {
        Map j;
        SetBuilder setBuilder;
        ull0 T0 = oll0Var.T0("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (T0.q()) {
                int k = eja1.k(T0, "name");
                int k2 = eja1.k(T0, "type");
                int k3 = eja1.k(T0, "notnull");
                int k4 = eja1.k(T0, "pk");
                int k5 = eja1.k(T0, "dflt_value");
                MapBuilder mapBuilder = new MapBuilder();
                do {
                    String Y1 = T0.Y1(k);
                    mapBuilder.put(Y1, new p5x0((int) T0.getLong(k4), Y1, T0.Y1(k2), T0.isNull(k5) ? null : T0.Y1(k5), T0.getLong(k3) != 0, 2));
                } while (T0.q());
                j = mapBuilder.j();
                gwk0.m(T0, null);
            } else {
                j = kotlin.collections.b.f();
                gwk0.m(T0, null);
            }
            T0 = oll0Var.T0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int k6 = eja1.k(T0, "id");
                int k7 = eja1.k(T0, "seq");
                int k8 = eja1.k(T0, "table");
                int k9 = eja1.k(T0, "on_delete");
                int k10 = eja1.k(T0, "on_update");
                List f = rza1.f(T0);
                T0.reset();
                SetBuilder setBuilder2 = new SetBuilder();
                while (T0.q()) {
                    if (T0.getLong(k7) == j2) {
                        int i = (int) T0.getLong(k6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = k6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : f) {
                            int i3 = k7;
                            List list = f;
                            if (((v2s) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            k7 = i3;
                            f = list;
                        }
                        int i4 = k7;
                        List list2 = f;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            v2s v2sVar = (v2s) it.next();
                            arrayList.add(v2sVar.c);
                            arrayList2.add(v2sVar.w);
                        }
                        setBuilder2.add(new q5x0(T0.Y1(k8), arrayList, T0.Y1(k9), arrayList2, T0.Y1(k10)));
                        k6 = i2;
                        k7 = i4;
                        f = list2;
                        j2 = 0;
                    }
                }
                SetBuilder b = setBuilder2.b();
                gwk0.m(T0, null);
                T0 = oll0Var.T0("PRAGMA index_list(`" + str + "`)");
                try {
                    int k11 = eja1.k(T0, "name");
                    int k12 = eja1.k(T0, "origin");
                    int k13 = eja1.k(T0, "unique");
                    if (k11 == -1 || k12 == -1 || k13 == -1) {
                        gwk0.m(T0, null);
                        setBuilder = null;
                    } else {
                        SetBuilder setBuilder3 = new SetBuilder();
                        while (true) {
                            if (!T0.q()) {
                                break;
                            }
                            if ("c".equals(T0.Y1(k12))) {
                                r5x0 g = rza1.g(oll0Var, T0.Y1(k11), T0.getLong(k13) == 1);
                                if (g == null) {
                                    gwk0.m(T0, null);
                                    setBuilder = null;
                                    break;
                                }
                                setBuilder3.add(g);
                            }
                        }
                    }
                    return new s5x0(str, j, b, setBuilder);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
