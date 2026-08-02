package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.drz;
import xsna.qzr;
import xsna.szr;

/* compiled from: FolderPeersSelectFeature.kt */
/* loaded from: classes18.dex */
public final class pzr extends di6<vzr, szr, uzr, qzr> {
    public final ysm h;
    public final kzr i;
    public final iu90 j;
    public final htm k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pzr(ysm ysmVar, kzr kzrVar, iu90 iu90Var, io.reactivex.rxjava3.subjects.f fVar, io.reactivex.rxjava3.core.q qVar, htm htmVar, io.reactivex.rxjava3.core.q qVar2) {
        super(new vzr(r5, r6, r5, r6, r9, false, r11, r12, r13, r13, r13, r6));
        EmptyList emptyList = EmptyList.b;
        ProfilesInfo profilesInfo = new ProfilesInfo();
        Set<Long> set = iu90Var.b;
        Set<Long> set2 = iu90Var.c;
        EmptySet emptySet = EmptySet.b;
        jgp jgpVar = jgp.b;
        this.h = ysmVar;
        this.i = kzrVar;
        this.j = iu90Var;
        this.k = htmVar;
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        io.reactivex.rxjava3.subjects.d<drz.a<xrm>> dVar = kzrVar.b;
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(c);
        hv hvVar = new hv(this, 22);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a0, nVar, hvVar);
        i(new io.reactivex.rxjava3.internal.operators.observable.c0(ysmVar.a.getState().a0(c), io.reactivex.rxjava3.internal.functions.a.d, new cpd(this, 1)), nVar, new defpackage.n(this, 25));
        i(qVar.a0(c), nVar, new qz(this, 16));
        i(htmVar.d().a0(c).r0(c), nVar, new defpackage.p(this, 26));
        ysmVar.a(20);
        i(fVar.a0(c), nVar, new bf2(this, 15));
        i(qVar2.a0(c), nVar, new sv(this, 29));
    }

    public static LinkedHashMap A(vzr vzrVar, List list, Set set) {
        List<Dialog> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Dialog dialog : list2) {
            wt90 wt90Var = vzrVar.a.get(dialog.Sb());
            Long Sb = dialog.Sb();
            if (wt90Var == null || set.contains(dialog.Sb())) {
                boolean v = v(vzrVar.l, dialog);
                wt90Var = yaq.a(dialog, vzrVar.e, s(dialog.Sb().longValue(), vzrVar) || v, !v, false, v);
            }
            Pair pair = new Pair(Sb, wt90Var);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return p4g.h(linkedHashMap);
    }

    public static ArrayList B(List list, vzr vzrVar) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof wt90) {
                wt90 wt90Var = (wt90) obj;
                obj = wt90.a(wt90Var, s(wt90Var.b, vzrVar));
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static LinkedHashMap E(Map map, vzr vzrVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), wt90.a((wt90) entry.getValue(), s(((Number) entry.getKey()).longValue(), vzrVar)));
        }
        return linkedHashMap;
    }

    public static boolean s(long j, vzr vzrVar) {
        if (vzrVar.i.contains(Long.valueOf(j))) {
            return true;
        }
        if (vzrVar.j.contains(Long.valueOf(j))) {
            return false;
        }
        if (vzrVar.g.contains(Long.valueOf(j))) {
            return true;
        }
        return !vzrVar.h.contains(Long.valueOf(j)) && vzrVar.k.contains(Long.valueOf(j));
    }

    public static ArrayList u(LinkedHashMap linkedHashMap, boolean z, boolean z2) {
        return j5g.u0((!z || z2) ? EmptyList.b : Collections.singletonList(new gtz(0)), j5g.O0(linkedHashMap.values()));
    }

    public static boolean v(List list, Dialog dialog) {
        if (list.isEmpty()) {
            return false;
        }
        List<b0s> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (b0s b0sVar : list2) {
            long Mb = dialog.Mb();
            cum0 cum0Var = b0sVar.d;
            if ((Mb & cum0Var.a) == cum0Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.hfz] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.wt90] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.wt90] */
    public static ArrayList w(long j, List list) {
        List<??> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (?? r1 : list2) {
            if (r1 instanceof wt90) {
                r1 = (wt90) r1;
                if (r1.b == j) {
                    r1 = wt90.a(r1, !r1.h);
                }
            }
            arrayList.add(r1);
        }
        return arrayList;
    }

    public static LinkedHashMap y(Map map, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        wt90 wt90Var = (wt90) map.get(Long.valueOf(j));
        if (wt90Var != null) {
            linkedHashMap.put(Long.valueOf(j), wt90.a(wt90Var, !wt90Var.h));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap z(List list, vzr vzrVar) {
        List<Dialog> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Dialog dialog : list2) {
            boolean v = v(vzrVar.l, dialog);
            Pair pair = new Pair(dialog.Sb(), yaq.a(dialog, vzrVar.e, s(dialog.Sb().longValue(), vzrVar) || v, !v, false, v));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return p4g.h(linkedHashMap);
    }

    @Override // xsna.di6
    public final void d(szr szrVar) {
        szr szrVar2 = szrVar;
        if (szrVar2.equals(szr.a.b)) {
            m(qzr.b.a);
            return;
        }
        if (szrVar2.equals(szr.b.b)) {
            r(new wje(this, 20));
            return;
        }
        if (szrVar2 instanceof szr.c) {
            q(new defpackage.s(14, this, szrVar2));
            return;
        }
        if (szrVar2 instanceof szr.d) {
            q(new mre(20, (szr.d) szrVar2, this));
        } else {
            if (!(szrVar2 instanceof szr.e)) {
                throw new NoWhenBranchMatchedException();
            }
            r(new mm1(14, szrVar2, this));
        }
    }
}
