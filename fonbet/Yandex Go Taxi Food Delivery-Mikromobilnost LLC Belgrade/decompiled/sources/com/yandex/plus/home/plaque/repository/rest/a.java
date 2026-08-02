package com.yandex.plus.home.plaque.repository.rest;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$HorizontalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$VerticalGravity;
import com.yandex.plus.home.plaque.repository.api.model.Predicate$Compare$Type;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Source;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;
import defpackage.aic0;
import defpackage.aie0;
import defpackage.aw50;
import defpackage.b5d0;
import defpackage.be20;
import defpackage.br50;
import defpackage.cg20;
import defpackage.cic0;
import defpackage.cie0;
import defpackage.co50;
import defpackage.cp50;
import defpackage.cq50;
import defpackage.cs50;
import defpackage.cv50;
import defpackage.de20;
import defpackage.dic0;
import defpackage.dr50;
import defpackage.du50;
import defpackage.dw50;
import defpackage.dz50;
import defpackage.e0k;
import defpackage.e3n;
import defpackage.eg20;
import defpackage.ehr;
import defpackage.eic0;
import defpackage.eie0;
import defpackage.f160;
import defpackage.fe20;
import defpackage.fp50;
import defpackage.fs50;
import defpackage.go50;
import defpackage.gu50;
import defpackage.gw00;
import defpackage.h0k;
import defpackage.h260;
import defpackage.hr50;
import defpackage.hw50;
import defpackage.i151;
import defpackage.i160;
import defpackage.ie20;
import defpackage.iv50;
import defpackage.j151;
import defpackage.je20;
import defpackage.jo50;
import defpackage.joc0;
import defpackage.jse;
import defpackage.ju50;
import defpackage.k060;
import defpackage.k151;
import defpackage.k260;
import defpackage.khc;
import defpackage.koc0;
import defpackage.kp50;
import defpackage.kw50;
import defpackage.l151;
import defpackage.l160;
import defpackage.l8s;
import defpackage.le20;
import defpackage.loc0;
import defpackage.lv50;
import defpackage.m8s;
import defpackage.me20;
import defpackage.mo50;
import defpackage.mr50;
import defpackage.n160;
import defpackage.noh;
import defpackage.npi0;
import defpackage.nq50;
import defpackage.ny61;
import defpackage.o060;
import defpackage.o430;
import defpackage.oe20;
import defpackage.ov50;
import defpackage.oyr;
import defpackage.p151;
import defpackage.pfe;
import defpackage.phc0;
import defpackage.pq50;
import defpackage.pu50;
import defpackage.px50;
import defpackage.qe20;
import defpackage.qf20;
import defpackage.qhe0;
import defpackage.qo50;
import defpackage.r060;
import defpackage.r160;
import defpackage.rhc0;
import defpackage.rhe0;
import defpackage.rkj;
import defpackage.roc0;
import defpackage.ry50;
import defpackage.se20;
import defpackage.she0;
import defpackage.su50;
import defpackage.sv50;
import defpackage.sx50;
import defpackage.tcc;
import defpackage.the0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ue20;
import defpackage.uhe0;
import defpackage.unr0;
import defpackage.v4r0;
import defpackage.vg10;
import defpackage.vhe0;
import defpackage.vr50;
import defpackage.vy50;
import defpackage.w160;
import defpackage.w511;
import defpackage.whe0;
import defpackage.wo50;
import defpackage.xd20;
import defpackage.xfo;
import defpackage.xhe0;
import defpackage.xy50;
import defpackage.yhe0;
import defpackage.yq50;
import defpackage.yr50;
import defpackage.zhc0;
import defpackage.zhe0;
import defpackage.znc0;
import defpackage.zo50;
import defpackage.zp50;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.plus.plaquesdk.widget.a a;
    public final b5d0 b;
    public final tse c;
    public final jse d;

    public a(com.yandex.plus.plaquesdk.widget.a aVar, b5d0 b5d0Var, tse tseVar, jse jseVar) {
        this.a = aVar;
        this.b = b5d0Var;
        this.c = tseVar;
        this.d = jseVar;
    }

    public static eie0 a(ry50 ry50Var, int i, LinkedHashMap linkedHashMap, Set set) {
        Predicate$Compare$Type predicate$Compare$Type;
        if (set.contains(Integer.valueOf(i))) {
            xfo.g(oyr.i(i, "Cyclic predicates tree for index="));
            return null;
        }
        if (ry50Var instanceof go50) {
            List list = ((go50) ry50Var).b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Object obj = linkedHashMap.get(Integer.valueOf(intValue));
                if (obj == null) {
                    xfo.g(oyr.j(intValue, "Predicate with index=", " not found"));
                    return null;
                }
                arrayList.add(a((ry50) obj, intValue, linkedHashMap, v4r0.i(set, Integer.valueOf(i))));
            }
            return new qhe0(arrayList);
        }
        if (ry50Var instanceof jo50) {
            List list2 = ((jo50) ry50Var).b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Number) it2.next()).intValue();
                Object obj2 = linkedHashMap.get(Integer.valueOf(intValue2));
                if (obj2 == null) {
                    xfo.g(oyr.j(intValue2, "Predicate with index=", " not found"));
                    return null;
                }
                arrayList2.add(a((ry50) obj2, intValue2, linkedHashMap, v4r0.i(set, Integer.valueOf(i))));
            }
            return new rhe0(arrayList2);
        }
        if (ry50Var instanceof px50) {
            int i2 = ((px50) ry50Var).b;
            Object obj3 = linkedHashMap.get(Integer.valueOf(i2));
            if (obj3 != null) {
                return new xhe0(a((ry50) obj3, i2, linkedHashMap, v4r0.i(set, Integer.valueOf(i))));
            }
            xfo.g(oyr.j(i2, "Predicate with index=", " not found"));
            return null;
        }
        if (ry50Var instanceof zo50) {
            return new she0(((zo50) ry50Var).b);
        }
        if (ry50Var instanceof zp50) {
            zp50 zp50Var = (zp50) ry50Var;
            String str = zp50Var.b;
            int i3 = znc0.b[zp50Var.d.ordinal()];
            if (i3 == 1) {
                predicate$Compare$Type = Predicate$Compare$Type.EQUALS;
            } else if (i3 == 2) {
                predicate$Compare$Type = Predicate$Compare$Type.GREATER;
            } else if (i3 == 3) {
                predicate$Compare$Type = Predicate$Compare$Type.GREATER_OR_EQUALS;
            } else if (i3 == 4) {
                predicate$Compare$Type = Predicate$Compare$Type.LESSER;
            } else {
                if (i3 != 5) {
                    w511.b();
                    return null;
                }
                predicate$Compare$Type = Predicate$Compare$Type.LESSER_OR_EQUALS;
            }
            return new the0(str, predicate$Compare$Type, m(zp50Var.c));
        }
        if (ry50Var instanceof nq50) {
            nq50 nq50Var = (nq50) ry50Var;
            return new uhe0(nq50Var.b, m(nq50Var.c));
        }
        if (!(ry50Var instanceof lv50)) {
            if (ry50Var instanceof aw50) {
                return new whe0(((aw50) ry50Var).b);
            }
            w511.b();
            return null;
        }
        lv50 lv50Var = (lv50) ry50Var;
        List list3 = lv50Var.c;
        String str2 = lv50Var.b;
        HashSet hashSet = new HashSet(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            hashSet.add(m((xy50) it3.next()));
        }
        return new vhe0(str2, hashSet);
    }

    public static eie0 c(int i, List list) {
        Object S = kotlin.collections.a.S(i, list);
        if (S == null) {
            throw new IllegalStateException(("Can't find root predicate with id=" + i + ", predicates=" + list).toString());
        }
        ry50 ry50Var = (ry50) S;
        List list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        int i2 = 0;
        for (Object obj : list2) {
            linkedHashMap.put(Integer.valueOf(i2), obj);
            i2++;
        }
        return a(ry50Var, 0, linkedHashMap, EmptySet.a);
    }

    public static String h(a aVar, String str, Map map) {
        String X = kotlin.collections.a.X(map.keySet(), "|", null, null, new PlaqueMapper$replace$pattern$1(1, Regex.a, npi0.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0), 30);
        Iterator<E> it = EmptySet.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((RegexOption) it.next()).getValue();
        }
        if ((i & 2) != 0) {
            i |= 64;
        }
        return new Regex(Pattern.compile(X, i)).i(str, new ehr(map));
    }

    public static fe20 i(mo50 mo50Var) {
        if (mo50Var instanceof kw50) {
            kw50 kw50Var = (kw50) mo50Var;
            List<pu50> list = kw50Var.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (pu50 pu50Var : list) {
                Integer a = khc.a(pu50Var.a);
                double d = pu50Var.b;
                arrayList.add(a != null ? new qe20(a.intValue(), (float) d) : new qe20(0, (float) d));
            }
            su50 su50Var = kw50Var.c;
            PointF pointF = new PointF((float) su50Var.a, (float) su50Var.b);
            su50 su50Var2 = kw50Var.d;
            return new be20(arrayList, pointF, new PointF((float) su50Var2.a, (float) su50Var2.b));
        }
        if (!(mo50Var instanceof dz50)) {
            if (mo50Var instanceof w160) {
                return ie20.a;
            }
            w511.b();
            return null;
        }
        dz50 dz50Var = (dz50) mo50Var;
        List<pu50> list2 = dz50Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (pu50 pu50Var2 : list2) {
            Integer a2 = khc.a(pu50Var2.a);
            double d2 = pu50Var2.b;
            arrayList2.add(a2 != null ? new qe20(a2.intValue(), (float) d2) : new qe20(0, (float) d2));
        }
        su50 su50Var3 = dz50Var.c;
        return new de20(arrayList2, new PointF((float) su50Var3.a, (float) su50Var3.b));
    }

    public static oe20 k(dr50 dr50Var) {
        if (dr50Var instanceof yq50) {
            return new le20(new rkj(Integer.valueOf(((yq50) dr50Var).b)));
        }
        if (dr50Var instanceof br50) {
            return me20.a;
        }
        w511.b();
        return null;
    }

    public static eic0 l(co50 co50Var) {
        if (co50Var instanceof mr50) {
            mr50 mr50Var = (mr50) co50Var;
            return new zhc0(mr50Var.a, mr50Var.c);
        }
        if (co50Var instanceof dw50) {
            return new aic0(((dw50) co50Var).a);
        }
        if (!(co50Var instanceof k060)) {
            w511.b();
            return null;
        }
        k060 k060Var = (k060) co50Var;
        String str = k060Var.a;
        String str2 = k060Var.b;
        Map map = k060Var.d;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        return new cic0(str, str2, map);
    }

    public static cie0 m(xy50 xy50Var) {
        if (xy50Var instanceof sv50) {
            return new zhe0(Long.valueOf(((sv50) xy50Var).b));
        }
        if (xy50Var instanceof cs50) {
            return new zhe0(Double.valueOf(((cs50) xy50Var).b));
        }
        if (xy50Var instanceof f160) {
            return new aie0(((f160) xy50Var).b);
        }
        if (xy50Var instanceof wo50) {
            return new yhe0(((wo50) xy50Var).b);
        }
        w511.b();
        return null;
    }

    public static p151 n(yr50 yr50Var, boolean z) {
        int i;
        int i2;
        je20 je20Var;
        l151 k151Var;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity = yr50Var.f;
        qo50 qo50Var = yr50Var.c;
        ov50 ov50Var = yr50Var.e;
        int i3 = networkDisplayRulesModel$HorizontalGravity == null ? -1 : znc0.d[networkDisplayRulesModel$HorizontalGravity.ordinal()];
        if (i3 == -1) {
            i = 0;
        } else if (i3 == 1) {
            i = 3;
        } else if (i3 == 2) {
            i = 1;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            i = 5;
        }
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity = yr50Var.g;
        int i4 = networkDisplayRulesModel$VerticalGravity == null ? -1 : znc0.e[networkDisplayRulesModel$VerticalGravity.ordinal()];
        if (i4 == -1) {
            i2 = 0;
        } else if (i4 == 1) {
            i2 = 48;
        } else if (i4 == 2) {
            i2 = 16;
        } else {
            if (i4 != 3) {
                w511.b();
                return null;
            }
            i2 = 80;
        }
        e0k e0kVar = new e0k(new rkj(ov50Var != null ? Integer.valueOf(ov50Var.a) : 0), new rkj(ov50Var != null ? Integer.valueOf(ov50Var.b) : 0), new rkj(ov50Var != null ? Integer.valueOf(ov50Var.c) : 0), new rkj(ov50Var != null ? Integer.valueOf(ov50Var.d) : 0));
        List list = yr50Var.b;
        int size = list.size();
        if (size == 0) {
            je20Var = ie20.a;
        } else if (size != 1) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((mo50) it.next()));
            }
            je20Var = new xd20(arrayList);
        } else {
            je20Var = i((mo50) list.get(0));
        }
        h0k h0kVar = new h0k(e0kVar, new ue20(je20Var, new se20(k(qo50Var.a), k(qo50Var.b), k(qo50Var.d), k(qo50Var.c)), z));
        k260 k260Var = yr50Var.a;
        if (k260Var instanceof du50) {
            k151Var = i151.a;
        } else if (k260Var instanceof gu50) {
            k151Var = j151.a;
        } else {
            if (!(k260Var instanceof ju50)) {
                w511.b();
                return null;
            }
            k151Var = new k151(new rkj(Integer.valueOf(((ju50) k260Var).b)));
        }
        return new p151(h0kVar, k151Var, i | i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.yandex.plus.home.plaque.repository.rest.a] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0355 -> B:30:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x026c -> B:52:0x0279). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h260 h260Var, Map map, Map map2, Set set, Map map3, ContinuationImpl continuationImpl) {
        PlaqueMapper$asTree$1 plaqueMapper$asTree$1;
        String str;
        pfe j;
        eic0 eic0Var;
        p151 p151Var;
        String str2;
        eic0 eic0Var2;
        pfe pfeVar;
        p151 p151Var2;
        eic0 l;
        pfe pfeVar2;
        p151 p151Var3;
        String str3;
        String str4;
        eic0 eic0Var3;
        pfe pfeVar3;
        p151 p151Var4;
        ArrayList arrayList;
        Iterator it;
        Map map4;
        PlaqueMapper$asTree$1 plaqueMapper$asTree$12;
        String str5;
        String str6;
        eic0 eic0Var4;
        p151 p151Var5;
        int i;
        h260 h260Var2;
        Set set2;
        pfe pfeVar4;
        int i2;
        Map map5;
        Map map6;
        pfe j2;
        p151 n;
        ArrayList arrayList2;
        h260 h260Var3;
        String str7;
        PlaqueMapper$asTree$1 plaqueMapper$asTree$13;
        String str8;
        String str9;
        eic0 eic0Var5;
        int i3;
        int i4;
        Iterator it2;
        Set set3;
        Map map7;
        Map map8;
        Map map9;
        Object obj;
        Map map10;
        Object obj2;
        eic0 eic0Var6;
        Map map11;
        p151 p151Var6;
        Iterator it3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i5;
        String str10;
        Iterator it4;
        Map map12;
        p151 p151Var7;
        int i6;
        int i7;
        Set set4;
        Map map13;
        eic0 eic0Var7;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Integer num;
        h260 h260Var4 = h260Var;
        if (continuationImpl instanceof PlaqueMapper$asTree$1) {
            plaqueMapper$asTree$1 = (PlaqueMapper$asTree$1) continuationImpl;
            int i8 = plaqueMapper$asTree$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$asTree$1.label = i8 - Integer.MIN_VALUE;
                Object obj3 = plaqueMapper$asTree$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                String str11 = "Widget with id=";
                switch (plaqueMapper$asTree$1.label) {
                    case 0:
                        kotlin.b.b(obj3);
                        if (!set.contains(h260Var4.getId())) {
                            if (!(h260Var4 instanceof cp50)) {
                                if (!(h260Var4 instanceof hw50)) {
                                    if (!(h260Var4 instanceof fp50)) {
                                        if (!(h260Var4 instanceof iv50)) {
                                            if (!(h260Var4 instanceof r060)) {
                                                if (!(h260Var4 instanceof l160)) {
                                                    if (!(h260Var4 instanceof r160)) {
                                                        w511.b();
                                                        break;
                                                    } else {
                                                        r160 r160Var = (r160) h260Var4;
                                                        str = r160Var.c;
                                                        co50 co50Var = r160Var.g;
                                                        eic0 l2 = co50Var != null ? l(co50Var) : null;
                                                        j = j(r160Var.b, map3);
                                                        p151 n2 = n(r160Var.a, false);
                                                        List list = r160Var.e;
                                                        List list2 = r160Var.f;
                                                        plaqueMapper$asTree$1.L$0 = h260Var4;
                                                        plaqueMapper$asTree$1.L$1 = null;
                                                        plaqueMapper$asTree$1.L$2 = null;
                                                        plaqueMapper$asTree$1.L$3 = null;
                                                        plaqueMapper$asTree$1.L$4 = null;
                                                        plaqueMapper$asTree$1.L$5 = str;
                                                        plaqueMapper$asTree$1.L$6 = l2;
                                                        plaqueMapper$asTree$1.L$7 = j;
                                                        plaqueMapper$asTree$1.L$8 = n2;
                                                        plaqueMapper$asTree$1.label = 6;
                                                        obj3 = p(list, list2, map3, plaqueMapper$asTree$1);
                                                        if (obj3 != coroutineSingletons) {
                                                            eic0Var = l2;
                                                            p151Var = n2;
                                                            cg20 cg20Var = (cg20) obj3;
                                                            num = ((r160) h260Var4).h;
                                                            if (num == null) {
                                                                num = null;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    l160 l160Var = (l160) h260Var4;
                                                    str2 = l160Var.c;
                                                    dic0 dic0Var = new dic0(str2);
                                                    pfe j3 = j(l160Var.b, map3);
                                                    p151 n3 = n(l160Var.a, false);
                                                    List list3 = l160Var.g;
                                                    if (list3 == null) {
                                                        list3 = EmptyList.a;
                                                    }
                                                    List list4 = l160Var.e;
                                                    plaqueMapper$asTree$1.L$0 = null;
                                                    plaqueMapper$asTree$1.L$1 = null;
                                                    plaqueMapper$asTree$1.L$2 = null;
                                                    plaqueMapper$asTree$1.L$3 = null;
                                                    plaqueMapper$asTree$1.L$4 = null;
                                                    plaqueMapper$asTree$1.L$5 = str2;
                                                    plaqueMapper$asTree$1.L$6 = dic0Var;
                                                    plaqueMapper$asTree$1.L$7 = j3;
                                                    plaqueMapper$asTree$1.L$8 = n3;
                                                    plaqueMapper$asTree$1.label = 5;
                                                    Object p = p(list3, list4, map3, plaqueMapper$asTree$1);
                                                    if (p != coroutineSingletons) {
                                                        eic0Var2 = dic0Var;
                                                        pfeVar = j3;
                                                        obj3 = p;
                                                        p151Var2 = n3;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                r060 r060Var = (r060) h260Var4;
                                                String str12 = r060Var.c;
                                                co50 co50Var2 = r060Var.f;
                                                break;
                                            }
                                        } else {
                                            iv50 iv50Var = (iv50) h260Var4;
                                            URI uri = iv50Var.e;
                                            String str13 = iv50Var.c;
                                            co50 co50Var3 = iv50Var.g;
                                            l = co50Var3 != null ? l(co50Var3) : null;
                                            pfe j4 = j(iv50Var.b, map3);
                                            p151 n4 = n(iv50Var.a, false);
                                            Object obj4 = map2.get(uri.toString());
                                            if (obj4 == null) {
                                                w511.g(uri, " is absent");
                                                break;
                                            } else {
                                                plaqueMapper$asTree$1.L$0 = h260Var4;
                                                plaqueMapper$asTree$1.L$1 = null;
                                                plaqueMapper$asTree$1.L$2 = null;
                                                plaqueMapper$asTree$1.L$3 = null;
                                                plaqueMapper$asTree$1.L$4 = null;
                                                plaqueMapper$asTree$1.L$5 = str13;
                                                plaqueMapper$asTree$1.L$6 = l;
                                                plaqueMapper$asTree$1.L$7 = j4;
                                                plaqueMapper$asTree$1.L$8 = n4;
                                                plaqueMapper$asTree$1.label = 4;
                                                obj3 = ((noh) obj4).k(plaqueMapper$asTree$1);
                                                if (obj3 != coroutineSingletons) {
                                                    pfeVar2 = j4;
                                                    p151Var3 = n4;
                                                    str3 = str13;
                                                    Object value = ((Result) obj3).getValue();
                                                    kotlin.b.b(value);
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        fp50 fp50Var = (fp50) h260Var4;
                                        str4 = fp50Var.c;
                                        co50 co50Var4 = fp50Var.g;
                                        eic0 l3 = co50Var4 != null ? l(co50Var4) : null;
                                        pfe j5 = j(fp50Var.b, map3);
                                        p151 n5 = n(fp50Var.a, true);
                                        List list5 = fp50Var.e;
                                        List list6 = fp50Var.f;
                                        plaqueMapper$asTree$1.L$0 = null;
                                        plaqueMapper$asTree$1.L$1 = null;
                                        plaqueMapper$asTree$1.L$2 = null;
                                        plaqueMapper$asTree$1.L$3 = null;
                                        plaqueMapper$asTree$1.L$4 = null;
                                        plaqueMapper$asTree$1.L$5 = str4;
                                        plaqueMapper$asTree$1.L$6 = l3;
                                        plaqueMapper$asTree$1.L$7 = j5;
                                        plaqueMapper$asTree$1.L$8 = n5;
                                        plaqueMapper$asTree$1.label = 3;
                                        Object p2 = p(list5, list6, map3, plaqueMapper$asTree$1);
                                        if (p2 != coroutineSingletons) {
                                            eic0Var3 = l3;
                                            pfeVar3 = j5;
                                            obj3 = p2;
                                            p151Var4 = n5;
                                            break;
                                        }
                                    }
                                } else {
                                    hw50 hw50Var = (hw50) h260Var4;
                                    String str14 = hw50Var.c;
                                    co50 co50Var5 = hw50Var.h;
                                    eic0 l4 = co50Var5 != null ? l(co50Var5) : null;
                                    pfe j6 = j(hw50Var.b, map3);
                                    p151 n6 = n(hw50Var.a, false);
                                    List list7 = hw50Var.e;
                                    arrayList = new ArrayList(tcc.n(list7, 10));
                                    it = list7.iterator();
                                    map4 = map2;
                                    plaqueMapper$asTree$12 = plaqueMapper$asTree$1;
                                    str5 = " not found";
                                    str6 = str14;
                                    eic0Var4 = l4;
                                    p151Var5 = n6;
                                    i = 0;
                                    h260Var2 = h260Var4;
                                    set2 = set;
                                    pfeVar4 = j6;
                                    i2 = 0;
                                    map5 = map3;
                                    map6 = map;
                                    String str15 = str11;
                                    if (!it.hasNext()) {
                                        pfe pfeVar5 = pfeVar4;
                                        eic0 eic0Var8 = eic0Var4;
                                        ArrayList arrayList7 = arrayList;
                                        int i9 = znc0.a[((hw50) h260Var2).f.ordinal()];
                                        if (i9 == 1) {
                                            i5 = 0;
                                        } else if (i9 != 2) {
                                            w511.b();
                                            break;
                                        } else {
                                            i5 = 1;
                                        }
                                        break;
                                    } else {
                                        String str16 = (String) it.next();
                                        Object obj5 = map6.get(str16);
                                        if (obj5 == null) {
                                            xfo.g(oyr.p(str15, str16, str5));
                                            break;
                                        } else {
                                            h260 h260Var5 = (h260) obj5;
                                            LinkedHashSet i10 = v4r0.i(set2, ((hw50) h260Var2).c);
                                            plaqueMapper$asTree$12.L$0 = h260Var2;
                                            plaqueMapper$asTree$12.L$1 = map6;
                                            plaqueMapper$asTree$12.L$2 = map4;
                                            plaqueMapper$asTree$12.L$3 = set2;
                                            plaqueMapper$asTree$12.L$4 = map5;
                                            plaqueMapper$asTree$12.L$5 = null;
                                            plaqueMapper$asTree$12.L$6 = null;
                                            plaqueMapper$asTree$12.L$7 = arrayList;
                                            plaqueMapper$asTree$12.L$8 = it;
                                            plaqueMapper$asTree$12.L$9 = null;
                                            plaqueMapper$asTree$12.L$10 = null;
                                            plaqueMapper$asTree$12.L$11 = null;
                                            plaqueMapper$asTree$12.L$12 = str6;
                                            plaqueMapper$asTree$12.L$13 = eic0Var4;
                                            plaqueMapper$asTree$12.L$14 = pfeVar4;
                                            plaqueMapper$asTree$12.L$15 = p151Var5;
                                            plaqueMapper$asTree$12.L$16 = arrayList;
                                            plaqueMapper$asTree$12.I$0 = i;
                                            plaqueMapper$asTree$12.I$1 = i2;
                                            plaqueMapper$asTree$12.I$2 = 0;
                                            plaqueMapper$asTree$12.label = 2;
                                            map6 = map6;
                                            pfe pfeVar6 = pfeVar4;
                                            str10 = str15;
                                            eic0 eic0Var9 = eic0Var4;
                                            it4 = it;
                                            Object b = b(h260Var5, map6, map4, i10, map5, plaqueMapper$asTree$12);
                                            if (b != coroutineSingletons) {
                                                map12 = map4;
                                                obj3 = b;
                                                pfeVar4 = pfeVar6;
                                                p151Var7 = p151Var5;
                                                i6 = i;
                                                i7 = i2;
                                                set4 = set2;
                                                map13 = map5;
                                                ArrayList arrayList8 = arrayList;
                                                eic0Var7 = eic0Var9;
                                                arrayList5 = arrayList8;
                                                arrayList6 = arrayList8;
                                                arrayList6.add((eg20) obj3);
                                                map4 = map12;
                                                it = it4;
                                                map5 = map13;
                                                set2 = set4;
                                                i2 = i7;
                                                eic0Var4 = eic0Var7;
                                                i = i6;
                                                str11 = str10;
                                                arrayList = arrayList5;
                                                p151Var5 = p151Var7;
                                                String str152 = str11;
                                                if (!it.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                cp50 cp50Var = (cp50) h260Var4;
                                String str17 = cp50Var.c;
                                co50 co50Var6 = cp50Var.g;
                                eic0 l5 = co50Var6 != null ? l(co50Var6) : null;
                                j2 = j(cp50Var.b, map3);
                                n = n(cp50Var.a, false);
                                List list8 = cp50Var.e;
                                arrayList2 = new ArrayList(tcc.n(list8, 10));
                                h260Var3 = h260Var4;
                                str7 = str17;
                                plaqueMapper$asTree$13 = plaqueMapper$asTree$1;
                                str8 = " not found";
                                str9 = "Widget with id=";
                                eic0Var5 = l5;
                                i3 = 0;
                                i4 = 0;
                                it2 = list8.iterator();
                                set3 = set;
                                map7 = map2;
                                map8 = map3;
                                map9 = map;
                                if (!it2.hasNext()) {
                                    break;
                                } else {
                                    String str18 = (String) it2.next();
                                    Object obj6 = map9.get(str18);
                                    if (obj6 == null) {
                                        xfo.g(oyr.p(str9, str18, str8));
                                        break;
                                    } else {
                                        h260 h260Var6 = (h260) obj6;
                                        LinkedHashSet i11 = v4r0.i(set3, ((cp50) h260Var3).c);
                                        plaqueMapper$asTree$13.L$0 = h260Var3;
                                        plaqueMapper$asTree$13.L$1 = map9;
                                        plaqueMapper$asTree$13.L$2 = map7;
                                        plaqueMapper$asTree$13.L$3 = set3;
                                        plaqueMapper$asTree$13.L$4 = map8;
                                        plaqueMapper$asTree$13.L$5 = null;
                                        plaqueMapper$asTree$13.L$6 = null;
                                        plaqueMapper$asTree$13.L$7 = arrayList2;
                                        plaqueMapper$asTree$13.L$8 = it2;
                                        plaqueMapper$asTree$13.L$9 = null;
                                        plaqueMapper$asTree$13.L$10 = null;
                                        plaqueMapper$asTree$13.L$11 = null;
                                        plaqueMapper$asTree$13.L$12 = str7;
                                        plaqueMapper$asTree$13.L$13 = eic0Var5;
                                        plaqueMapper$asTree$13.L$14 = j2;
                                        plaqueMapper$asTree$13.L$15 = n;
                                        plaqueMapper$asTree$13.L$16 = arrayList2;
                                        plaqueMapper$asTree$13.I$0 = i3;
                                        plaqueMapper$asTree$13.I$1 = i4;
                                        plaqueMapper$asTree$13.I$2 = 0;
                                        plaqueMapper$asTree$13.label = 1;
                                        String str19 = str7;
                                        Iterator it5 = it2;
                                        Object b2 = b(h260Var6, map9, map7, i11, map8, plaqueMapper$asTree$13);
                                        Map map14 = map7;
                                        obj = this;
                                        if (b2 != coroutineSingletons) {
                                            map10 = map14;
                                            obj2 = b2;
                                            str7 = str19;
                                            eic0Var6 = eic0Var5;
                                            map11 = map8;
                                            ArrayList arrayList9 = arrayList2;
                                            p151Var6 = n;
                                            it3 = it5;
                                            arrayList3 = arrayList9;
                                            arrayList4 = arrayList9;
                                            arrayList4.add((eg20) obj2);
                                            map7 = map10;
                                            it2 = it3;
                                            n = p151Var6;
                                            map8 = map11;
                                            arrayList2 = arrayList3;
                                            eic0Var5 = eic0Var6;
                                            if (!it2.hasNext()) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            vg10.o(h260Var4.getId(), "Cyclic widgets tree for id=");
                            break;
                        }
                        break;
                    case 1:
                        int i12 = plaqueMapper$asTree$1.I$1;
                        int i13 = plaqueMapper$asTree$1.I$0;
                        ?? r5 = (Collection) plaqueMapper$asTree$1.L$16;
                        p151 p151Var8 = (p151) plaqueMapper$asTree$1.L$15;
                        pfe pfeVar7 = (pfe) plaqueMapper$asTree$1.L$14;
                        eic0 eic0Var10 = (eic0) plaqueMapper$asTree$1.L$13;
                        String str20 = (String) plaqueMapper$asTree$1.L$12;
                        it3 = (Iterator) plaqueMapper$asTree$1.L$8;
                        ?? r14 = (Collection) plaqueMapper$asTree$1.L$7;
                        map11 = (Map) plaqueMapper$asTree$1.L$4;
                        Set set5 = (Set) plaqueMapper$asTree$1.L$3;
                        Map map15 = (Map) plaqueMapper$asTree$1.L$2;
                        Map map16 = (Map) plaqueMapper$asTree$1.L$1;
                        h260 h260Var7 = (h260) plaqueMapper$asTree$1.L$0;
                        kotlin.b.b(obj3);
                        obj = this;
                        obj2 = obj3;
                        h260Var3 = h260Var7;
                        str7 = str20;
                        j2 = pfeVar7;
                        str8 = " not found";
                        str9 = "Widget with id=";
                        eic0Var6 = eic0Var10;
                        arrayList3 = r14;
                        i4 = i12;
                        set3 = set5;
                        i3 = i13;
                        p151Var6 = p151Var8;
                        map9 = map16;
                        plaqueMapper$asTree$13 = plaqueMapper$asTree$1;
                        map10 = map15;
                        arrayList4 = r5;
                        arrayList4.add((eg20) obj2);
                        map7 = map10;
                        it2 = it3;
                        n = p151Var6;
                        map8 = map11;
                        arrayList2 = arrayList3;
                        eic0Var5 = eic0Var6;
                        if (!it2.hasNext()) {
                        }
                        break;
                    case 2:
                        int i14 = plaqueMapper$asTree$1.I$1;
                        int i15 = plaqueMapper$asTree$1.I$0;
                        ?? r52 = (Collection) plaqueMapper$asTree$1.L$16;
                        p151 p151Var9 = (p151) plaqueMapper$asTree$1.L$15;
                        pfe pfeVar8 = (pfe) plaqueMapper$asTree$1.L$14;
                        eic0Var7 = (eic0) plaqueMapper$asTree$1.L$13;
                        String str21 = (String) plaqueMapper$asTree$1.L$12;
                        Iterator it6 = (Iterator) plaqueMapper$asTree$1.L$8;
                        ?? r12 = (Collection) plaqueMapper$asTree$1.L$7;
                        map13 = (Map) plaqueMapper$asTree$1.L$4;
                        Set set6 = (Set) plaqueMapper$asTree$1.L$3;
                        Map map17 = (Map) plaqueMapper$asTree$1.L$2;
                        Map map18 = (Map) plaqueMapper$asTree$1.L$1;
                        h260 h260Var8 = (h260) plaqueMapper$asTree$1.L$0;
                        kotlin.b.b(obj3);
                        p151Var7 = p151Var9;
                        str5 = " not found";
                        str10 = "Widget with id=";
                        it4 = it6;
                        arrayList5 = r12;
                        str6 = str21;
                        set4 = set6;
                        h260Var2 = h260Var8;
                        i6 = i15;
                        plaqueMapper$asTree$12 = plaqueMapper$asTree$1;
                        pfeVar4 = pfeVar8;
                        i7 = i14;
                        map12 = map17;
                        map6 = map18;
                        arrayList6 = r52;
                        arrayList6.add((eg20) obj3);
                        map4 = map12;
                        it = it4;
                        map5 = map13;
                        set2 = set4;
                        i2 = i7;
                        eic0Var4 = eic0Var7;
                        i = i6;
                        str11 = str10;
                        arrayList = arrayList5;
                        p151Var5 = p151Var7;
                        String str1522 = str11;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        p151Var4 = (p151) plaqueMapper$asTree$1.L$8;
                        pfeVar3 = (pfe) plaqueMapper$asTree$1.L$7;
                        eic0Var3 = (eic0) plaqueMapper$asTree$1.L$6;
                        str4 = (String) plaqueMapper$asTree$1.L$5;
                        kotlin.b.b(obj3);
                        break;
                    case 4:
                        p151Var3 = (p151) plaqueMapper$asTree$1.L$8;
                        pfe pfeVar9 = (pfe) plaqueMapper$asTree$1.L$7;
                        eic0 eic0Var11 = (eic0) plaqueMapper$asTree$1.L$6;
                        str3 = (String) plaqueMapper$asTree$1.L$5;
                        h260 h260Var9 = (h260) plaqueMapper$asTree$1.L$0;
                        kotlin.b.b(obj3);
                        l = eic0Var11;
                        pfeVar2 = pfeVar9;
                        h260Var4 = h260Var9;
                        Object value2 = ((Result) obj3).getValue();
                        kotlin.b.b(value2);
                        break;
                    case 5:
                        p151Var2 = (p151) plaqueMapper$asTree$1.L$8;
                        pfeVar = (pfe) plaqueMapper$asTree$1.L$7;
                        eic0Var2 = (eic0) plaqueMapper$asTree$1.L$6;
                        str2 = (String) plaqueMapper$asTree$1.L$5;
                        kotlin.b.b(obj3);
                        break;
                    case 6:
                        p151Var = (p151) plaqueMapper$asTree$1.L$8;
                        pfe pfeVar10 = (pfe) plaqueMapper$asTree$1.L$7;
                        eic0Var = (eic0) plaqueMapper$asTree$1.L$6;
                        str = (String) plaqueMapper$asTree$1.L$5;
                        h260 h260Var10 = (h260) plaqueMapper$asTree$1.L$0;
                        kotlin.b.b(obj3);
                        j = pfeVar10;
                        h260Var4 = h260Var10;
                        cg20 cg20Var2 = (cg20) obj3;
                        num = ((r160) h260Var4).h;
                        if (num == null) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        plaqueMapper$asTree$1 = new PlaqueMapper$asTree$1(this, continuationImpl);
        Object obj32 = plaqueMapper$asTree$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str112 = "Widget with id=";
        switch (plaqueMapper$asTree$1.label) {
        }
        return null;
    }

    public final Object d(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map, ContinuationImpl continuationImpl) {
        Object obj = linkedHashMap.get(str);
        if (obj != null) {
            return b((h260) obj, linkedHashMap, linkedHashMap2, EmptySet.a, map, continuationImpl);
        }
        StringBuilder x = unr0.x("Can't find root widget with id=", str, ", widgetsMapKeys=");
        x.append(linkedHashMap.keySet());
        throw new IllegalStateException(x.toString().toString());
    }

    public final LinkedHashMap e(sx50 sx50Var, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (sx50Var != null && (sx50Var instanceof cv50)) {
            linkedHashSet.add(((cv50) sx50Var).c.toString());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h260 h260Var = (h260) it.next();
            if (h260Var instanceof iv50) {
                linkedHashSet.add(((iv50) h260Var).e.toString());
            }
        }
        int d = gw00.d(tcc.n(linkedHashSet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(obj, tje.h(this.c, this.d, null, new PlaqueMapper$extractImagesDeferredMap$2$1(this, (String) obj, null), 2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b A[Catch: all -> 0x020c, CancellationException -> 0x0213, TimeoutCancellationException -> 0x0215, TryCatch #2 {TimeoutCancellationException -> 0x0215, CancellationException -> 0x0213, all -> 0x020c, blocks: (B:13:0x0061, B:14:0x013d, B:16:0x014b, B:18:0x015b, B:19:0x015f, B:21:0x0164, B:22:0x0168, B:28:0x0090, B:29:0x00fe, B:31:0x0113, B:37:0x0097, B:40:0x00a9, B:41:0x00b3, B:43:0x00b9, B:45:0x00c8, B:47:0x00d2, B:51:0x0184, B:52:0x0199, B:54:0x019f, B:56:0x01b0, B:58:0x01b8, B:61:0x01be, B:62:0x01d5, B:64:0x01db, B:66:0x01fb, B:67:0x020b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164 A[Catch: all -> 0x020c, CancellationException -> 0x0213, TimeoutCancellationException -> 0x0215, TryCatch #2 {TimeoutCancellationException -> 0x0215, CancellationException -> 0x0213, all -> 0x020c, blocks: (B:13:0x0061, B:14:0x013d, B:16:0x014b, B:18:0x015b, B:19:0x015f, B:21:0x0164, B:22:0x0168, B:28:0x0090, B:29:0x00fe, B:31:0x0113, B:37:0x0097, B:40:0x00a9, B:41:0x00b3, B:43:0x00b9, B:45:0x00c8, B:47:0x00d2, B:51:0x0184, B:52:0x0199, B:54:0x019f, B:56:0x01b0, B:58:0x01b8, B:61:0x01be, B:62:0x01d5, B:64:0x01db, B:66:0x01fb, B:67:0x020b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113 A[Catch: all -> 0x020c, CancellationException -> 0x0213, TimeoutCancellationException -> 0x0215, TryCatch #2 {TimeoutCancellationException -> 0x0215, CancellationException -> 0x0213, all -> 0x020c, blocks: (B:13:0x0061, B:14:0x013d, B:16:0x014b, B:18:0x015b, B:19:0x015f, B:21:0x0164, B:22:0x0168, B:28:0x0090, B:29:0x00fe, B:31:0x0113, B:37:0x0097, B:40:0x00a9, B:41:0x00b3, B:43:0x00b9, B:45:0x00c8, B:47:0x00d2, B:51:0x0184, B:52:0x0199, B:54:0x019f, B:56:0x01b0, B:58:0x01b8, B:61:0x01be, B:62:0x01d5, B:64:0x01db, B:66:0x01fb, B:67:0x020b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cq50 cq50Var, List list, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToDomainModel$3 plaqueMapper$mapToDomainModel$3;
        int i;
        a aVar;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap;
        sx50 sx50Var;
        eg20 eg20Var;
        cq50 cq50Var2;
        String str;
        eie0 eie0Var;
        eg20 eg20Var2;
        cq50 cq50Var3;
        eie0 eie0Var2;
        String str2;
        Map map2;
        Map map3;
        cq50 cq50Var4 = cq50Var;
        try {
            if (continuationImpl instanceof PlaqueMapper$mapToDomainModel$3) {
                plaqueMapper$mapToDomainModel$3 = (PlaqueMapper$mapToDomainModel$3) continuationImpl;
                int i4 = plaqueMapper$mapToDomainModel$3.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    plaqueMapper$mapToDomainModel$3.label = i4 - Integer.MIN_VALUE;
                    PlaqueMapper$mapToDomainModel$3 plaqueMapper$mapToDomainModel$32 = plaqueMapper$mapToDomainModel$3;
                    Object obj = plaqueMapper$mapToDomainModel$32.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plaqueMapper$mapToDomainModel$32.label;
                    loc0 loc0Var = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        List list2 = list;
                        int d = gw00.d(tcc.n(list2, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                        for (Object obj2 : list2) {
                            linkedHashMap2.put(((h260) obj2).getId(), obj2);
                        }
                        if (list.size() != linkedHashMap2.size()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("There are widgets with equal keys: ");
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj3 : list) {
                                String id = ((h260) obj3).getId();
                                Object obj4 = linkedHashMap3.get(id);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap3.put(id, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(gw00.d(linkedHashMap3.size()));
                            for (Object obj5 : linkedHashMap3.entrySet()) {
                                linkedHashMap4.put(((Map.Entry) obj5).getKey(), new Integer(((List) ((Map.Entry) obj5).getValue()).size()));
                            }
                            sb.append(linkedHashMap4);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        LinkedHashMap e = e(cq50Var4.h, list);
                        String str3 = cq50Var4.c;
                        plaqueMapper$mapToDomainModel$32.L$0 = cq50Var4;
                        plaqueMapper$mapToDomainModel$32.L$1 = null;
                        plaqueMapper$mapToDomainModel$32.L$2 = null;
                        plaqueMapper$mapToDomainModel$32.L$3 = null;
                        plaqueMapper$mapToDomainModel$32.L$4 = null;
                        plaqueMapper$mapToDomainModel$32.L$5 = this;
                        plaqueMapper$mapToDomainModel$32.L$6 = e;
                        plaqueMapper$mapToDomainModel$32.L$7 = null;
                        plaqueMapper$mapToDomainModel$32.I$0 = 0;
                        plaqueMapper$mapToDomainModel$32.I$1 = 0;
                        plaqueMapper$mapToDomainModel$32.label = 1;
                        obj = d(str3, linkedHashMap2, e, map, plaqueMapper$mapToDomainModel$32);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = this;
                        i2 = 0;
                        i3 = 0;
                        linkedHashMap = e;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) plaqueMapper$mapToDomainModel$32.L$11;
                            eg20Var2 = (eg20) plaqueMapper$mapToDomainModel$32.L$10;
                            eie0Var2 = (eie0) plaqueMapper$mapToDomainModel$32.L$8;
                            cq50Var3 = (cq50) plaqueMapper$mapToDomainModel$32.L$0;
                            kotlin.b.b(obj);
                            loc0Var = (loc0) obj;
                            str = str2;
                            eie0Var = eie0Var2;
                            cq50Var2 = cq50Var3;
                            eg20Var = eg20Var2;
                            roc0 roc0Var = new roc0(str, eg20Var, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.REST, false);
                            String str4 = cq50Var2.b;
                            map2 = cq50Var2.j;
                            if (map2 == null) {
                                map2 = kotlin.collections.b.f();
                            }
                            Map map4 = map2;
                            map3 = cq50Var2.i;
                            if (map3 == null) {
                                map3 = kotlin.collections.b.f();
                            }
                            Map map5 = map3;
                            String str5 = cq50Var2.k;
                            int i5 = cq50Var2.e;
                            o430 o430Var = e3n.b;
                            long j = cq50Var2.f;
                            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                            return new phc0(roc0Var, str4, map4, map5, i5, eie0Var, str5, kp50.V(j, durationUnit), kp50.V(cq50Var2.g, durationUnit));
                        }
                        i2 = plaqueMapper$mapToDomainModel$32.I$1;
                        i3 = plaqueMapper$mapToDomainModel$32.I$0;
                        ?? r3 = (Map) plaqueMapper$mapToDomainModel$32.L$6;
                        a aVar2 = (a) plaqueMapper$mapToDomainModel$32.L$5;
                        cq50Var4 = (cq50) plaqueMapper$mapToDomainModel$32.L$0;
                        kotlin.b.b(obj);
                        linkedHashMap = r3;
                        aVar = aVar2;
                    }
                    eg20 eg20Var3 = (eg20) obj;
                    vy50 vy50Var = cq50Var4.d;
                    int i6 = vy50Var.a;
                    List list3 = vy50Var.b;
                    aVar.getClass();
                    eie0 c = c(i6, list3);
                    String str6 = cq50Var4.a;
                    sx50Var = cq50Var4.h;
                    if (sx50Var != null) {
                        eg20Var = eg20Var3;
                        cq50Var2 = cq50Var4;
                        str = str6;
                        eie0Var = c;
                        roc0 roc0Var2 = new roc0(str, eg20Var, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.REST, false);
                        String str42 = cq50Var2.b;
                        map2 = cq50Var2.j;
                        if (map2 == null) {
                        }
                        Map map42 = map2;
                        map3 = cq50Var2.i;
                        if (map3 == null) {
                        }
                        Map map52 = map3;
                        String str52 = cq50Var2.k;
                        int i52 = cq50Var2.e;
                        o430 o430Var2 = e3n.b;
                        long j2 = cq50Var2.f;
                        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                        return new phc0(roc0Var2, str42, map42, map52, i52, eie0Var, str52, kp50.V(j2, durationUnit2), kp50.V(cq50Var2.g, durationUnit2));
                    }
                    plaqueMapper$mapToDomainModel$32.L$0 = cq50Var4;
                    plaqueMapper$mapToDomainModel$32.L$1 = null;
                    plaqueMapper$mapToDomainModel$32.L$2 = null;
                    plaqueMapper$mapToDomainModel$32.L$3 = null;
                    plaqueMapper$mapToDomainModel$32.L$4 = null;
                    plaqueMapper$mapToDomainModel$32.L$5 = null;
                    plaqueMapper$mapToDomainModel$32.L$6 = null;
                    plaqueMapper$mapToDomainModel$32.L$7 = null;
                    plaqueMapper$mapToDomainModel$32.L$8 = c;
                    plaqueMapper$mapToDomainModel$32.L$9 = null;
                    plaqueMapper$mapToDomainModel$32.L$10 = eg20Var3;
                    plaqueMapper$mapToDomainModel$32.L$11 = str6;
                    plaqueMapper$mapToDomainModel$32.I$0 = i3;
                    plaqueMapper$mapToDomainModel$32.I$1 = i2;
                    plaqueMapper$mapToDomainModel$32.label = 2;
                    Object o = aVar.o(sx50Var, linkedHashMap, plaqueMapper$mapToDomainModel$32);
                    if (o != coroutineSingletons) {
                        eg20Var2 = eg20Var3;
                        cq50Var3 = cq50Var4;
                        eie0Var2 = c;
                        obj = o;
                        str2 = str6;
                        loc0Var = (loc0) obj;
                        str = str2;
                        eie0Var = eie0Var2;
                        cq50Var2 = cq50Var3;
                        eg20Var = eg20Var2;
                        roc0 roc0Var22 = new roc0(str, eg20Var, loc0Var, PlaqueModel$Type.CONDITIONAL, PlaqueModel$Source.REST, false);
                        String str422 = cq50Var2.b;
                        map2 = cq50Var2.j;
                        if (map2 == null) {
                        }
                        Map map422 = map2;
                        map3 = cq50Var2.i;
                        if (map3 == null) {
                        }
                        Map map522 = map3;
                        String str522 = cq50Var2.k;
                        int i522 = cq50Var2.e;
                        o430 o430Var22 = e3n.b;
                        long j22 = cq50Var2.f;
                        DurationUnit durationUnit22 = DurationUnit.MILLISECONDS;
                        return new phc0(roc0Var22, str422, map422, map522, i522, eie0Var, str522, kp50.V(j22, durationUnit22), kp50.V(cq50Var2.g, durationUnit22));
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            eg20 eg20Var32 = (eg20) obj;
            vy50 vy50Var2 = cq50Var4.d;
            int i62 = vy50Var2.a;
            List list32 = vy50Var2.b;
            aVar.getClass();
            eie0 c2 = c(i62, list32);
            String str62 = cq50Var4.a;
            sx50Var = cq50Var4.h;
            if (sx50Var != null) {
            }
        } catch (TimeoutCancellationException e2) {
            return new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plaqueMapper$mapToDomainModel$3 = new PlaqueMapper$mapToDomainModel$3(this, continuationImpl);
        PlaqueMapper$mapToDomainModel$3 plaqueMapper$mapToDomainModel$322 = plaqueMapper$mapToDomainModel$3;
        Object obj6 = plaqueMapper$mapToDomainModel$322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToDomainModel$322.label;
        loc0 loc0Var2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0158 A[Catch: all -> 0x01ff, CancellationException -> 0x0206, TimeoutCancellationException -> 0x0208, TryCatch #2 {TimeoutCancellationException -> 0x0208, CancellationException -> 0x0206, all -> 0x01ff, blocks: (B:13:0x0061, B:14:0x013c, B:16:0x0149, B:18:0x0158, B:19:0x015c, B:21:0x0161, B:22:0x0165, B:28:0x0094, B:29:0x010a, B:31:0x0112, B:37:0x009c, B:40:0x00ae, B:41:0x00b8, B:43:0x00be, B:45:0x00cd, B:47:0x00d7, B:51:0x0177, B:52:0x018c, B:54:0x0192, B:56:0x01a3, B:58:0x01ab, B:61:0x01b1, B:62:0x01c8, B:64:0x01ce, B:66:0x01ee, B:67:0x01fe), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161 A[Catch: all -> 0x01ff, CancellationException -> 0x0206, TimeoutCancellationException -> 0x0208, TryCatch #2 {TimeoutCancellationException -> 0x0208, CancellationException -> 0x0206, all -> 0x01ff, blocks: (B:13:0x0061, B:14:0x013c, B:16:0x0149, B:18:0x0158, B:19:0x015c, B:21:0x0161, B:22:0x0165, B:28:0x0094, B:29:0x010a, B:31:0x0112, B:37:0x009c, B:40:0x00ae, B:41:0x00b8, B:43:0x00be, B:45:0x00cd, B:47:0x00d7, B:51:0x0177, B:52:0x018c, B:54:0x0192, B:56:0x01a3, B:58:0x01ab, B:61:0x01b1, B:62:0x01c8, B:64:0x01ce, B:66:0x01ee, B:67:0x01fe), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112 A[Catch: all -> 0x01ff, CancellationException -> 0x0206, TimeoutCancellationException -> 0x0208, TryCatch #2 {TimeoutCancellationException -> 0x0208, CancellationException -> 0x0206, all -> 0x01ff, blocks: (B:13:0x0061, B:14:0x013c, B:16:0x0149, B:18:0x0158, B:19:0x015c, B:21:0x0161, B:22:0x0165, B:28:0x0094, B:29:0x010a, B:31:0x0112, B:37:0x009c, B:40:0x00ae, B:41:0x00b8, B:43:0x00be, B:45:0x00cd, B:47:0x00d7, B:51:0x0177, B:52:0x018c, B:54:0x0192, B:56:0x01a3, B:58:0x01ab, B:61:0x01b1, B:62:0x01c8, B:64:0x01ce, B:66:0x01ee, B:67:0x01fe), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(o060 o060Var, List list, Map map, PlaqueModel$Type plaqueModel$Type, ContinuationImpl continuationImpl) {
        PlaqueMapper$mapToDomainModel$1 plaqueMapper$mapToDomainModel$1;
        int i;
        o060 o060Var2;
        PlaqueModel$Type plaqueModel$Type2;
        a aVar;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap;
        sx50 sx50Var;
        eg20 eg20Var;
        PlaqueModel$Type plaqueModel$Type3;
        String str;
        eg20 eg20Var2;
        PlaqueModel$Type plaqueModel$Type4;
        o060 o060Var3;
        String str2;
        Map map2;
        Map map3;
        try {
            if (continuationImpl instanceof PlaqueMapper$mapToDomainModel$1) {
                plaqueMapper$mapToDomainModel$1 = (PlaqueMapper$mapToDomainModel$1) continuationImpl;
                int i4 = plaqueMapper$mapToDomainModel$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    plaqueMapper$mapToDomainModel$1.label = i4 - Integer.MIN_VALUE;
                    PlaqueMapper$mapToDomainModel$1 plaqueMapper$mapToDomainModel$12 = plaqueMapper$mapToDomainModel$1;
                    Object obj = plaqueMapper$mapToDomainModel$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plaqueMapper$mapToDomainModel$12.label;
                    loc0 loc0Var = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        List list2 = list;
                        int d = gw00.d(tcc.n(list2, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                        for (Object obj2 : list2) {
                            linkedHashMap2.put(((h260) obj2).getId(), obj2);
                        }
                        if (list.size() != linkedHashMap2.size()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("There are widgets with equal keys: ");
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj3 : list) {
                                String id = ((h260) obj3).getId();
                                Object obj4 = linkedHashMap3.get(id);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap3.put(id, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(gw00.d(linkedHashMap3.size()));
                            for (Object obj5 : linkedHashMap3.entrySet()) {
                                linkedHashMap4.put(((Map.Entry) obj5).getKey(), new Integer(((List) ((Map.Entry) obj5).getValue()).size()));
                            }
                            sb.append(linkedHashMap4);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        LinkedHashMap e = e(o060Var.d, list);
                        String str3 = o060Var.c;
                        plaqueMapper$mapToDomainModel$12.L$0 = o060Var;
                        plaqueMapper$mapToDomainModel$12.L$1 = null;
                        plaqueMapper$mapToDomainModel$12.L$2 = null;
                        plaqueMapper$mapToDomainModel$12.L$3 = plaqueModel$Type;
                        plaqueMapper$mapToDomainModel$12.L$4 = null;
                        plaqueMapper$mapToDomainModel$12.L$5 = null;
                        plaqueMapper$mapToDomainModel$12.L$6 = this;
                        plaqueMapper$mapToDomainModel$12.L$7 = e;
                        plaqueMapper$mapToDomainModel$12.L$8 = null;
                        plaqueMapper$mapToDomainModel$12.I$0 = 0;
                        plaqueMapper$mapToDomainModel$12.I$1 = 0;
                        plaqueMapper$mapToDomainModel$12.label = 1;
                        obj = d(str3, linkedHashMap2, e, map, plaqueMapper$mapToDomainModel$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        o060Var2 = o060Var;
                        plaqueModel$Type2 = plaqueModel$Type;
                        aVar = this;
                        i2 = 0;
                        i3 = 0;
                        linkedHashMap = e;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) plaqueMapper$mapToDomainModel$12.L$11;
                            eg20Var2 = (eg20) plaqueMapper$mapToDomainModel$12.L$10;
                            plaqueModel$Type4 = (PlaqueModel$Type) plaqueMapper$mapToDomainModel$12.L$3;
                            o060Var3 = (o060) plaqueMapper$mapToDomainModel$12.L$0;
                            kotlin.b.b(obj);
                            loc0Var = (loc0) obj;
                            str = str2;
                            plaqueModel$Type3 = plaqueModel$Type4;
                            o060Var2 = o060Var3;
                            eg20Var = eg20Var2;
                            roc0 roc0Var = new roc0(str, eg20Var, loc0Var, plaqueModel$Type3, PlaqueModel$Source.REST, false);
                            String str4 = o060Var2.b;
                            map2 = o060Var2.f;
                            if (map2 == null) {
                                map2 = kotlin.collections.b.f();
                            }
                            Map map4 = map2;
                            map3 = o060Var2.e;
                            if (map3 == null) {
                                map3 = kotlin.collections.b.f();
                            }
                            return new rhc0(roc0Var, str4, map4, map3, 0, new qhe0(EmptyList.a));
                        }
                        i2 = plaqueMapper$mapToDomainModel$12.I$1;
                        i3 = plaqueMapper$mapToDomainModel$12.I$0;
                        ?? r3 = (Map) plaqueMapper$mapToDomainModel$12.L$7;
                        a aVar2 = (a) plaqueMapper$mapToDomainModel$12.L$6;
                        plaqueModel$Type2 = (PlaqueModel$Type) plaqueMapper$mapToDomainModel$12.L$3;
                        o060Var2 = (o060) plaqueMapper$mapToDomainModel$12.L$0;
                        kotlin.b.b(obj);
                        linkedHashMap = r3;
                        aVar = aVar2;
                    }
                    eg20 eg20Var3 = (eg20) obj;
                    String str5 = o060Var2.a;
                    sx50Var = o060Var2.d;
                    if (sx50Var != null) {
                        eg20Var = eg20Var3;
                        plaqueModel$Type3 = plaqueModel$Type2;
                        str = str5;
                        roc0 roc0Var2 = new roc0(str, eg20Var, loc0Var, plaqueModel$Type3, PlaqueModel$Source.REST, false);
                        String str42 = o060Var2.b;
                        map2 = o060Var2.f;
                        if (map2 == null) {
                        }
                        Map map42 = map2;
                        map3 = o060Var2.e;
                        if (map3 == null) {
                        }
                        return new rhc0(roc0Var2, str42, map42, map3, 0, new qhe0(EmptyList.a));
                    }
                    plaqueMapper$mapToDomainModel$12.L$0 = o060Var2;
                    plaqueMapper$mapToDomainModel$12.L$1 = null;
                    plaqueMapper$mapToDomainModel$12.L$2 = null;
                    plaqueMapper$mapToDomainModel$12.L$3 = plaqueModel$Type2;
                    plaqueMapper$mapToDomainModel$12.L$4 = null;
                    plaqueMapper$mapToDomainModel$12.L$5 = null;
                    plaqueMapper$mapToDomainModel$12.L$6 = null;
                    plaqueMapper$mapToDomainModel$12.L$7 = null;
                    plaqueMapper$mapToDomainModel$12.L$8 = null;
                    plaqueMapper$mapToDomainModel$12.L$9 = null;
                    plaqueMapper$mapToDomainModel$12.L$10 = eg20Var3;
                    plaqueMapper$mapToDomainModel$12.L$11 = str5;
                    plaqueMapper$mapToDomainModel$12.I$0 = i3;
                    plaqueMapper$mapToDomainModel$12.I$1 = i2;
                    plaqueMapper$mapToDomainModel$12.label = 2;
                    Object o = aVar.o(sx50Var, linkedHashMap, plaqueMapper$mapToDomainModel$12);
                    if (o != coroutineSingletons) {
                        eg20Var2 = eg20Var3;
                        plaqueModel$Type4 = plaqueModel$Type2;
                        o060Var3 = o060Var2;
                        obj = o;
                        str2 = str5;
                        loc0Var = (loc0) obj;
                        str = str2;
                        plaqueModel$Type3 = plaqueModel$Type4;
                        o060Var2 = o060Var3;
                        eg20Var = eg20Var2;
                        roc0 roc0Var22 = new roc0(str, eg20Var, loc0Var, plaqueModel$Type3, PlaqueModel$Source.REST, false);
                        String str422 = o060Var2.b;
                        map2 = o060Var2.f;
                        if (map2 == null) {
                        }
                        Map map422 = map2;
                        map3 = o060Var2.e;
                        if (map3 == null) {
                        }
                        return new rhc0(roc0Var22, str422, map422, map3, 0, new qhe0(EmptyList.a));
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            eg20 eg20Var32 = (eg20) obj;
            String str52 = o060Var2.a;
            sx50Var = o060Var2.d;
            if (sx50Var != null) {
            }
        } catch (TimeoutCancellationException e2) {
            return new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        plaqueMapper$mapToDomainModel$1 = new PlaqueMapper$mapToDomainModel$1(this, continuationImpl);
        PlaqueMapper$mapToDomainModel$1 plaqueMapper$mapToDomainModel$122 = plaqueMapper$mapToDomainModel$1;
        Object obj6 = plaqueMapper$mapToDomainModel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$mapToDomainModel$122.label;
        loc0 loc0Var2 = null;
    }

    public final pfe j(pq50 pq50Var, Map map) {
        if (pq50Var instanceof fs50) {
            fs50 fs50Var = (fs50) pq50Var;
            return new pfe(1, h(this, fs50Var.b, map), fs50Var.c);
        }
        if (pq50Var instanceof vr50) {
            return new pfe(2, null, null);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(sx50 sx50Var, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$toDomain$1 plaqueMapper$toDomain$1;
        int i;
        PlaqueModel$Notification$Position plaqueModel$Notification$Position;
        String uri;
        PlaqueModel$Notification$Position plaqueModel$Notification$Position2;
        if (continuationImpl instanceof PlaqueMapper$toDomain$1) {
            plaqueMapper$toDomain$1 = (PlaqueMapper$toDomain$1) continuationImpl;
            int i2 = plaqueMapper$toDomain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$toDomain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$toDomain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$toDomain$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = znc0.c[sx50Var.getPosition().ordinal()];
                    if (i3 == 1) {
                        plaqueModel$Notification$Position = PlaqueModel$Notification$Position.LEFT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        plaqueModel$Notification$Position = PlaqueModel$Notification$Position.RIGHT;
                    }
                    if (sx50Var instanceof hr50) {
                        return new joc0(plaqueModel$Notification$Position, ((hr50) sx50Var).c);
                    }
                    if (!(sx50Var instanceof cv50)) {
                        w511.b();
                        return null;
                    }
                    uri = ((cv50) sx50Var).c.toString();
                    Object obj2 = map.get(uri);
                    if (obj2 == null) {
                        w511.f(uri.concat(" is absent"));
                        return null;
                    }
                    plaqueMapper$toDomain$1.L$0 = null;
                    plaqueMapper$toDomain$1.L$1 = null;
                    plaqueMapper$toDomain$1.L$2 = plaqueModel$Notification$Position;
                    plaqueMapper$toDomain$1.L$3 = uri;
                    plaqueMapper$toDomain$1.label = 1;
                    Object k = ((noh) obj2).k(plaqueMapper$toDomain$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    plaqueModel$Notification$Position2 = plaqueModel$Notification$Position;
                    obj = k;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (String) plaqueMapper$toDomain$1.L$3;
                    plaqueModel$Notification$Position2 = (PlaqueModel$Notification$Position) plaqueMapper$toDomain$1.L$2;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return new koc0(new qf20(uri, (Drawable) value), plaqueModel$Notification$Position2);
            }
        }
        plaqueMapper$toDomain$1 = new PlaqueMapper$toDomain$1(this, continuationImpl);
        Object obj3 = plaqueMapper$toDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$toDomain$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj3).getValue();
        kotlin.b.b(value2);
        return new koc0(new qf20(uri, (Drawable) value2), plaqueModel$Notification$Position2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(List list, List list2, Map map, ContinuationImpl continuationImpl) {
        PlaqueMapper$toDomain$5 plaqueMapper$toDomain$5;
        int i;
        ArrayList arrayList;
        m8s m8sVar;
        FormattedText$FontStyle formattedText$FontStyle;
        if (continuationImpl instanceof PlaqueMapper$toDomain$5) {
            plaqueMapper$toDomain$5 = (PlaqueMapper$toDomain$5) continuationImpl;
            int i2 = plaqueMapper$toDomain$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueMapper$toDomain$5.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueMapper$toDomain$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueMapper$toDomain$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set N0 = list2 != null ? kotlin.collections.a.N0(list2) : null;
                    if (N0 != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : N0) {
                            if (map.get((String) obj2) == null) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        vg10.o(arrayList, "Templates keys are absent: ");
                        return null;
                    }
                    List<n160> list3 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    for (n160 n160Var : list3) {
                        if (!(n160Var instanceof i160)) {
                            w511.b();
                            return null;
                        }
                        i160 i160Var = (i160) n160Var;
                        String h = h(this, i160Var.b, map);
                        int i3 = znc0.f[i160Var.e.ordinal()];
                        if (i3 == 1) {
                            formattedText$FontStyle = FormattedText$FontStyle.NORMAL;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            formattedText$FontStyle = FormattedText$FontStyle.ITALIC;
                        }
                        FormattedText$FontStyle formattedText$FontStyle2 = formattedText$FontStyle;
                        int i4 = i160Var.d;
                        arrayList2.add(new l8s(h, formattedText$FontStyle2, (i4 < 0 || i4 >= 201) ? (201 > i4 || i4 >= 301) ? (301 > i4 || i4 >= 401) ? (401 > i4 || i4 >= 501) ? (501 > i4 || i4 >= 601) ? (601 > i4 || i4 >= 701) ? (701 > i4 || i4 >= 801) ? (801 > i4 || i4 >= 901) ? (901 > i4 || i4 >= 1001) ? FormattedText$FontWeight.REGULAR : FormattedText$FontWeight.HEAVY : FormattedText$FontWeight.EXTRA_BOLD : FormattedText$FontWeight.BOLD : FormattedText$FontWeight.SEMI_BOLD : FormattedText$FontWeight.MEDIUM : FormattedText$FontWeight.REGULAR : FormattedText$FontWeight.LIGHT : FormattedText$FontWeight.EXTRA_LIGHT : FormattedText$FontWeight.THIN, new Integer(i160Var.c), EmptyList.a, i160Var.f, null));
                    }
                    m8s m8sVar2 = new m8s(arrayList2);
                    plaqueMapper$toDomain$5.L$0 = null;
                    plaqueMapper$toDomain$5.L$1 = null;
                    plaqueMapper$toDomain$5.L$2 = null;
                    plaqueMapper$toDomain$5.L$3 = null;
                    plaqueMapper$toDomain$5.L$4 = m8sVar2;
                    plaqueMapper$toDomain$5.label = 1;
                    obj = this.a.d(m8sVar2, plaqueMapper$toDomain$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m8sVar = m8sVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m8sVar = (m8s) plaqueMapper$toDomain$5.L$4;
                    kotlin.b.b(obj);
                }
                return new cg20((CharSequence) obj, m8sVar);
            }
        }
        plaqueMapper$toDomain$5 = new PlaqueMapper$toDomain$5(this, continuationImpl);
        Object obj3 = plaqueMapper$toDomain$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueMapper$toDomain$5.label;
        if (i != 0) {
        }
        return new cg20((CharSequence) obj3, m8sVar);
    }
}
