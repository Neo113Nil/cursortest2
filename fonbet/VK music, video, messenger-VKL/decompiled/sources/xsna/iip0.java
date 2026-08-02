package xsna;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import one.video.player.model.FrameSize;
import xsna.dip0;
import xsna.jza0;
import xsna.npl;
import xsna.so4;

/* compiled from: TracksManager.kt */
/* loaded from: classes8.dex */
public final class iip0 implements jza0.b, by1 {
    public final ao80 b;
    public final CopyOnWriteArrayList<a> c = new CopyOnWriteArrayList<>();
    public Object d;
    public List<mlt0> e;
    public Object f;
    public hz4 g;
    public one.video.player.tracks.c h;
    public mlt0 i;
    public cno0 j;
    public boolean k;
    public FrameSize l;
    public final LinkedHashMap m;
    public androidx.media3.common.a n;
    public androidx.media3.common.a o;

    public iip0(ao80 ao80Var, int i) {
        this.b = ao80Var;
        EmptyList emptyList = EmptyList.b;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        this.m = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    @Override // xsna.jza0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(dip0 dip0Var) {
        ArrayList arrayList;
        Object obj;
        Iterator it;
        cno0 cno0Var;
        Object obj2;
        FrameSize frameSize;
        cms0 cms0Var;
        int i;
        int i2;
        String str;
        int i3;
        androidx.media3.common.a aVar;
        ao80 ao80Var;
        ImmutableList<Integer> immutableList;
        Integer num;
        String str2;
        if (wn80.q) {
            Objects.toString(dip0Var);
        }
        one.video.player.tracks.c cVar = this.h;
        cno0 cno0Var2 = this.j;
        EmptyList emptyList = EmptyList.b;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        so4 so4Var = null;
        if (!wn80.m) {
            this.h = null;
        }
        this.j = null;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        ImmutableList.b listIterator = dip0Var.a.listIterator(0);
        dip0.a aVar2 = null;
        while (listIterator.hasNext()) {
            dip0.a aVar3 = (dip0.a) listIterator.next();
            int i5 = aVar3.b.c;
            if (i5 == 1) {
                arrayList2.add(aVar3);
            } else if (i5 != 2) {
                if (i5 == 3) {
                    arrayList3.add(aVar3);
                }
            } else if (aVar3.a() && aVar2 == null) {
                aVar2 = aVar3;
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.c;
        if (isEmpty) {
            arrayList = arrayList3;
            int i6 = wn80.a;
            if (this.g != null) {
                this.g = null;
                this.o = null;
                Iterator<a> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().d(null);
                }
            }
        } else {
            LinkedHashMap linkedHashMap = this.m;
            linkedHashMap.clear();
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                dip0.a aVar4 = (dip0.a) it3.next();
                if (aVar4.a()) {
                    int i7 = aVar4.a;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (aVar4.e[i8]) {
                            str2 = aVar4.b.d[i8].n;
                            break;
                        }
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                int i9 = wn80.a;
                arrayList = arrayList3;
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    dip0.a aVar5 = (dip0.a) it4.next();
                    pfp0 pfp0Var = aVar5.b;
                    String str3 = pfp0Var.b;
                    ArrayList arrayList5 = new ArrayList();
                    int i10 = aVar5.a;
                    while (i4 < i10) {
                        Iterator it5 = it4;
                        androidx.media3.common.a aVar6 = pfp0Var.d[i4];
                        ArrayList arrayList6 = arrayList3;
                        so4 a2 = fr10.a(aVar6);
                        int i11 = i4;
                        if (epx.f(a2.b, str2)) {
                            linkedHashMap.put(a2.a, str3);
                            arrayList5.add(Integer.valueOf(i11));
                            if (so4Var == null) {
                                so4.a aVar7 = new so4.a();
                                aVar7.b = aVar6.n;
                                aVar7.c = aVar6.k;
                                aVar7.g = aVar6.b;
                                aVar7.h = aVar6.d;
                                so4Var = aVar7.a();
                            }
                        }
                        i4 = i11 + 1;
                        it4 = it5;
                        arrayList3 = arrayList6;
                    }
                    Iterator it6 = it4;
                    ArrayList arrayList7 = arrayList3;
                    if (!arrayList5.isEmpty()) {
                        arrayList4.add(new hz4(new nie(pfp0Var, arrayList5), str3, so4Var));
                    }
                    it4 = it6;
                    arrayList3 = arrayList7;
                    so4Var = null;
                    i4 = 0;
                }
                arrayList = arrayList3;
                this.d = arrayList4;
                if (wn80.q) {
                    arrayList4.size();
                    Objects.toString(linkedHashMap);
                }
            }
            androidx.media3.common.a aVar8 = this.o;
            if (this.g == null && aVar8 != null) {
                j0(aVar8);
            }
        }
        if (aVar2 != null) {
            this.k = aVar2.c;
            pfp0 pfp0Var2 = aVar2.b;
            ao80 ao80Var2 = this.b;
            zgp0 zgp0Var = ao80Var2.a().w.get(pfp0Var2);
            if (zgp0Var != null) {
                if (zgp0Var.b.size() <= 0) {
                    zgp0Var = null;
                }
                if (zgp0Var != null && (immutableList = zgp0Var.b) != null && (num = immutableList.get(0)) != null) {
                    i = num.intValue();
                    ArrayList arrayList8 = new ArrayList();
                    i2 = aVar2.a;
                    str = null;
                    i3 = 0;
                    while (i3 < i2) {
                        boolean b = aVar2.b(i3);
                        if (b) {
                            cms0 d = fr10.d(pfp0Var2.d[i3]);
                            xgp0 xgp0Var = ao80Var2.l.a;
                            FrameSize frameSize2 = xgp0Var.a;
                            FrameSize frameSize3 = xgp0Var.b;
                            ao80Var = ao80Var2;
                            FrameSize b2 = d.b();
                            if (b2.compareTo(frameSize2) >= 0 && b2.compareTo(frameSize3) <= 0) {
                                mlt0 mlt0Var = new mlt0(new nie(pfp0Var2, Collections.singletonList(Integer.valueOf(i3))), hr80.x(d), d, b);
                                arrayList8.add(mlt0Var);
                                if (!wn80.m && i3 == i) {
                                    this.h = mlt0Var;
                                }
                                if (aVar2.e[i3] && str == null) {
                                    str = d.b;
                                }
                            }
                        } else {
                            int i12 = wn80.a;
                            ao80Var = ao80Var2;
                        }
                        i3++;
                        ao80Var2 = ao80Var;
                    }
                    if (str != null) {
                        ArrayList arrayList9 = new ArrayList();
                        Iterator it7 = arrayList8.iterator();
                        while (it7.hasNext()) {
                            Object next = it7.next();
                            if (epx.f(((cms0) ((mlt0) next).c).b, str)) {
                                arrayList9.add(next);
                            }
                        }
                        this.e = j5g.D0(new oz2(3), arrayList9);
                    }
                    if (wn80.q) {
                        this.e.size();
                    }
                    aVar = this.n;
                    if (this.i == null && aVar != null) {
                        k0(aVar);
                    }
                }
            }
            i = -1;
            ArrayList arrayList82 = new ArrayList();
            i2 = aVar2.a;
            str = null;
            i3 = 0;
            while (i3 < i2) {
            }
            if (str != null) {
            }
            if (wn80.q) {
            }
            aVar = this.n;
            if (this.i == null) {
                k0(aVar);
            }
        } else {
            int i13 = wn80.a;
            if (this.i != null) {
                obj = null;
                this.i = null;
                this.n = null;
                Iterator<a> it8 = copyOnWriteArrayList.iterator();
                while (it8.hasNext()) {
                    it8.next().c(null);
                }
                ArrayList arrayList10 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    dip0.a aVar9 = (dip0.a) it.next();
                    pfp0 pfp0Var3 = aVar9.b;
                    String str4 = pfp0Var3.b;
                    if (aVar9.a > 0) {
                        cno0 cno0Var3 = new cno0(new nie(aVar9.b, Collections.singletonList(0)), str4, fr10.c(pfp0Var3.d[0]));
                        arrayList10.add(cno0Var3);
                        if (aVar9.e[0]) {
                            this.j = cno0Var3;
                        }
                    }
                }
                this.f = arrayList10;
                if (!wn80.m) {
                    one.video.player.tracks.c cVar2 = this.h;
                    if (!epx.f(cVar2 != null ? cVar2.b : obj, cVar != null ? cVar.b : obj)) {
                        h0(this.h);
                    }
                }
                cno0Var = this.j;
                if (!epx.f(cno0Var == null ? cno0Var.b : obj, cno0Var2 == null ? cno0Var2.b : obj)) {
                    cno0 cno0Var4 = this.j;
                    boolean z = cno0Var4 != null && cno0Var4.d;
                    Iterator<a> it9 = copyOnWriteArrayList.iterator();
                    while (it9.hasNext()) {
                        it9.next().a(cno0Var4, z);
                    }
                }
                obj2 = this.l;
                if (obj2 == null) {
                    if (!wn80.m) {
                        one.video.player.tracks.c cVar3 = this.h;
                        if (obj2 == ((cVar3 == null || (cms0Var = (cms0) cVar3.c) == null) ? obj : cms0Var.b())) {
                            return;
                        }
                    }
                    if (this.e.isEmpty() || (frameSize = this.l) == null) {
                        return;
                    }
                    AtomicInteger atomicInteger = e3r0.a;
                    List<mlt0> list = this.e;
                    final k87 k87Var = new k87(frameSize, 14);
                    TreeSet treeSet = new TreeSet(new Comparator() { // from class: xsna.z2r0
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            return ((Number) k87.this.invoke(obj3, obj4)).intValue();
                        }
                    });
                    j5g.K0(list, treeSet);
                    i0((one.video.player.tracks.c) treeSet.first());
                    this.l = frameSize;
                    return;
                }
                return;
            }
        }
        obj = null;
        ArrayList arrayList102 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        this.f = arrayList102;
        if (!wn80.m) {
        }
        cno0Var = this.j;
        if (!epx.f(cno0Var == null ? cno0Var.b : obj, cno0Var2 == null ? cno0Var2.b : obj)) {
        }
        obj2 = this.l;
        if (obj2 == null) {
        }
    }

    @Override // xsna.by1
    public final void P(androidx.media3.common.a aVar) {
        if (wn80.q) {
            Objects.toString(aVar);
        }
        this.o = aVar;
        j0(aVar);
    }

    @Override // xsna.by1
    public final void b0(androidx.media3.common.a aVar, n8l n8lVar) {
        if (wn80.q) {
            Objects.toString(aVar);
        }
        this.n = aVar;
        k0(aVar);
    }

    public final void h0(one.video.player.tracks.c cVar) {
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final boolean i0(one.video.player.tracks.c cVar) {
        mlt0 mlt0Var;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                mlt0Var = 0;
                break;
            }
            mlt0Var = it.next();
            if (epx.f(((one.video.player.tracks.c) mlt0Var).b, cVar.b)) {
                break;
            }
        }
        mlt0 mlt0Var2 = mlt0Var instanceof mlt0 ? mlt0Var : null;
        if (mlt0Var2 == null) {
            return false;
        }
        this.l = ((cms0) cVar.c).b();
        if (wn80.m) {
            this.h = cVar;
            h0(cVar);
            return true;
        }
        ao80 ao80Var = this.b;
        npl.d a2 = ao80Var.a();
        a2.getClass();
        npl.d.a aVar = new npl.d.a(a2);
        nie nieVar = mlt0Var2.e;
        aVar.j(new zgp0((pfp0) nieVar.b, (List) nieVar.c));
        ao80Var.i(new npl.d(aVar));
        return true;
    }

    public final void j0(androidx.media3.common.a aVar) {
        Object obj;
        so4 a2 = fr10.a(aVar);
        String str = (String) this.m.get(a2.a);
        hz4 hz4Var = this.g;
        Iterator it = ((Iterable) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((hz4) obj).b, str)) {
                    break;
                }
            }
        }
        hz4 hz4Var2 = (hz4) obj;
        hz4 hz4Var3 = hz4Var2 != null ? new hz4(hz4Var2.d, hz4Var2.b, a2) : null;
        if (hz4Var3 != hz4Var) {
            this.g = hz4Var3;
            Iterator<a> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().d(hz4Var3);
            }
        }
        if (wn80.q) {
            hz4 hz4Var4 = this.g;
            aVar.toString();
            Objects.toString(hz4Var4);
        }
    }

    public final void k0(androidx.media3.common.a aVar) {
        Object obj;
        cms0 d = fr10.d(aVar);
        mlt0 mlt0Var = this.i;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((mlt0) obj).b, hr80.x(d))) {
                    break;
                }
            }
        }
        mlt0 mlt0Var2 = (mlt0) obj;
        mlt0 mlt0Var3 = mlt0Var2 != null ? new mlt0(mlt0Var2.e, mlt0Var2.b, d, mlt0Var2.d) : null;
        if (mlt0Var3 != mlt0Var) {
            this.i = mlt0Var3;
            Iterator<a> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().c(mlt0Var3);
            }
        }
        if (wn80.q) {
            mlt0 mlt0Var4 = this.i;
            aVar.toString();
            Objects.toString(mlt0Var4);
        }
    }

    /* compiled from: TracksManager.kt */
    public interface a {
        default void b(one.video.player.tracks.c cVar) {
        }

        default void c(one.video.player.tracks.c cVar) {
        }

        default void d(one.video.player.tracks.a aVar) {
        }

        default void a(cno0 cno0Var, boolean z) {
        }
    }
}
