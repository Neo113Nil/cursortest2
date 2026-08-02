package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a3p0;
import xsna.a7f0;
import xsna.aye;
import xsna.chd;
import xsna.dye;
import xsna.hud0;
import xsna.hye;
import xsna.ixe;
import xsna.mvd0;
import xsna.rvd0;
import xsna.zxe;

/* compiled from: ClipsProfileToolbarFeature.kt */
/* loaded from: classes17.dex */
public final class cye extends wk50<pye, hye, ixe, dye> {
    public final Object f;
    public final f4z g;

    public cye(ixe.j jVar, Lazy<? extends rhd> lazy) {
        super(jVar, new gye(new hye.b(null, jVar.b)));
        this.f = lazy;
        this.g = new f4z();
    }

    public static hud0.b.C3022b U(UserId userId, hye.a aVar) {
        Object obj;
        rvd0 rvd0Var;
        Object obj2;
        Iterator it = aVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hud0 hud0Var = (hud0) obj;
            hud0.b.C3022b c3022b = hud0Var instanceof hud0.b.C3022b ? (hud0.b.C3022b) hud0Var : null;
            if (epx.f((c3022b == null || (rvd0Var = c3022b.a) == null || (obj2 = rvd0Var.a) == null) ? null : ((ClipsAuthor) obj2).b.b, userId)) {
                break;
            }
        }
        if (obj instanceof hud0.b.C3022b) {
            return (hud0.b.C3022b) obj;
        }
        return null;
    }

    public static final rvd0 V(mvd0.a.C3374a c3374a, ClipGridParams.Data.Profile profile, s8u0 s8u0Var) {
        ClipsAuthor clipsAuthor = profile.b;
        boolean z = clipsAuthor.b.o;
        boolean d = clipsAuthor.d();
        ClipsAuthor clipsAuthor2 = profile.b;
        int i = clipsAuthor2.f;
        Owner owner = clipsAuthor2.b;
        String f = owner.f(200);
        String str = f == null ? "" : f;
        UserId userId = owner.b;
        long j = clipsAuthor2.j();
        boolean i2 = owner.i(1024);
        VerifyInfo verifyInfo = owner.f;
        String str2 = owner.c;
        return new rvd0(clipsAuthor, i, new rvd0.a(s8u0Var, str, str2 == null ? "" : str2, userId, j, i2, new qow(verifyInfo), new qow(owner.k)), c3374a, z, d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.wk50
    public final void N(hye hyeVar, ixe ixeVar) {
        int i;
        hud0.b.C3022b U;
        hud0.b.C3022b U2;
        String obj;
        hud0.b.a aVar;
        int i2;
        rvd0 rvd0Var;
        Object obj2;
        mvd0 bVar;
        hye hyeVar2 = hyeVar;
        ixe ixeVar2 = ixeVar;
        if (ixeVar2 instanceof ixe.d) {
            ixe.d dVar = (ixe.d) ixeVar2;
            if (dVar instanceof ixe.j) {
                ixe.j jVar = (ixe.j) dVar;
                T(new dye.a(jVar.c, jVar.b));
                return;
            } else {
                if (!(dVar instanceof ixe.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(dye.f.b);
                return;
            }
        }
        boolean z = ixeVar2 instanceof ixe.x;
        f4z f4zVar = this.g;
        r6 = null;
        chd bVar2 = null;
        boolean z2 = true;
        if (z) {
            ixe.x xVar = (ixe.x) ixeVar2;
            if (xVar instanceof ixe.a) {
                if (hyeVar2 instanceof hye.a) {
                    hye.a aVar2 = (hye.a) hyeVar2;
                    List list = aVar2.d;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (obj2 instanceof hud0.b.a) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    if (!(obj2 instanceof hud0.b.a)) {
                        obj2 = null;
                    }
                    hud0.b.a aVar3 = (hud0.b.a) obj2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof hud0.b.C3022b) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        rvd0 rvd0Var2 = ((hud0.b.C3022b) it2.next()).a;
                        mvd0 mvd0Var = rvd0Var2.d;
                        if (mvd0Var instanceof mvd0.a) {
                            bVar = new mvd0.a.b(((mvd0.a) mvd0Var).H());
                        } else {
                            if (!(mvd0Var instanceof mvd0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new mvd0.b(fkq0.d(rvd0Var2.c.d) ? 4 : 3);
                        }
                        arrayList2.add(new hud0.b.C3022b(new rvd0(rvd0Var2.a, rvd0Var2.b, rvd0Var2.c, bVar, rvd0Var2.e, rvd0Var2.f)));
                    }
                    T(new dye.e(j5g.u0(arrayList2, aVar3 != null ? Collections.singletonList(aVar3) : EmptyList.b), aVar2.e));
                }
                ClipGridParams.Data.Profile profile = ((ixe.a) xVar).b;
                Owner owner = profile.b.b;
                if (qr.f(owner.b) && fkq0.d(owner.b)) {
                    bVar2 = new chd.d(o25.a().o());
                } else if (fkq0.b(owner.b) && hyeVar2.F0()) {
                    bVar2 = new chd.b(fkq0.e(owner.b), owner.c);
                }
                if (bVar2 != null) {
                    ((rhd) this.f.getValue()).h(bVar2, false);
                }
                f4zVar.b(new aye.a(profile));
                return;
            }
            if (xVar instanceof ixe.e) {
                f4zVar.b(new aye.c(((ixe.e) xVar).b));
                return;
            }
            if (xVar instanceof ixe.b) {
                f4zVar.b(aye.b.a);
                return;
            }
            if (xVar instanceof ixe.i) {
                f4zVar.b(new aye.e(((ixe.i) xVar).b));
                return;
            }
            if (xVar instanceof ixe.u) {
                ixe.u uVar = (ixe.u) xVar;
                f4zVar.b(new aye.f(uVar.b, uVar.c, uVar.d));
                return;
            }
            if (xVar instanceof ixe.g) {
                ixe.g gVar = (ixe.g) xVar;
                f4zVar.b(new aye.d(gVar.b, gVar.c));
                return;
            }
            if (xVar instanceof ixe.c) {
                C(new ixe.o(((ixe.c) xVar).b));
                return;
            }
            if (xVar instanceof ixe.o) {
                f4zVar.b(new aye.g(((ixe.o) xVar).b));
                return;
            }
            if (!(xVar instanceof jxe)) {
                if (!(xVar instanceof ixe.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                a3p0.c cVar = ((ixe.m) xVar).b;
                T(new dye.e(e43.o(new hud0.a(cVar.b, cVar.a)), 0));
                return;
            }
            if (hyeVar2 instanceof hye.a) {
                List list2 = ((hye.a) hyeVar2).d;
                Object Y = j5g.Y(new wow(list2));
                if (list2.size() != 1) {
                    Y = null;
                }
                hud0 hud0Var = (hud0) Y;
                if (hud0Var == null) {
                    return;
                }
                hud0.d dVar2 = hud0Var instanceof hud0.d ? (hud0.d) hud0Var : null;
                if (dVar2 == null || (rvd0Var = dVar2.a) == null) {
                    return;
                }
                f4zVar.b(new aye.g((ClipsAuthor) rvd0Var.a));
                return;
            }
            return;
        }
        if (!(ixeVar2 instanceof ixe.w)) {
            if (!(ixeVar2 instanceof ixe.k)) {
                throw new NoWhenBranchMatchedException();
            }
            ixe.k kVar = (ixe.k) ixeVar2;
            if (!(kVar instanceof ixe.q)) {
                throw new NoWhenBranchMatchedException();
            }
            List<BaseImageDto> list3 = ((ixe.q) kVar).b;
            if (hyeVar2 instanceof hye.a) {
                Iterator it3 = ((hye.a) hyeVar2).d.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        if (((hud0) it3.next()) instanceof hud0.b.a) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                }
                T(new dye.d(i, list3));
                return;
            }
            return;
        }
        ixe.w wVar = (ixe.w) ixeVar2;
        if (wVar instanceof ixe.f) {
            ixe.f fVar = (ixe.f) wVar;
            if (hyeVar2 instanceof hye.a) {
                List list4 = ((hye.a) hyeVar2).d;
                Object Y2 = j5g.Y(new wow(list4));
                if (list4.size() != 1) {
                    Y2 = null;
                }
                hud0 hud0Var2 = (hud0) Y2;
                if (hud0Var2 == null) {
                    return;
                }
                zxe a = hud0Var2.a();
                zxe.d dVar3 = a instanceof zxe.d ? (zxe.d) a : null;
                if (dVar3 == null) {
                    return;
                }
                T(new dye.c(zxe.d.a(dVar3, fVar.b, fVar.c, fVar.d, false, 8)));
                return;
            }
            return;
        }
        if (wVar instanceof ixe.v) {
            ixe.v vVar = (ixe.v) wVar;
            if (hyeVar2 instanceof hye.a) {
                List list5 = ((hye.a) hyeVar2).d;
                Object Y3 = j5g.Y(new wow(list5));
                if (list5.size() != 1) {
                    Y3 = null;
                }
                hud0 hud0Var3 = (hud0) Y3;
                if (hud0Var3 == null) {
                    return;
                }
                zxe a2 = hud0Var3.a();
                zxe.d dVar4 = a2 instanceof zxe.d ? (zxe.d) a2 : null;
                if (dVar4 == null) {
                    return;
                }
                T(new dye.c(zxe.d.a(dVar4, false, false, false, vVar.b, 7)));
                return;
            }
            return;
        }
        String str = "";
        if (!(wVar instanceof ixe.h)) {
            if (wVar instanceof ixe.l) {
                T(new dye.b(((ixe.l) wVar).b));
                return;
            }
            if (!(wVar instanceof ixe.p)) {
                if (wVar instanceof ixe.r) {
                    return;
                }
                if (wVar instanceof ixe.n) {
                    if (!(hyeVar2 instanceof hye.a) || (U2 = U(((ixe.n) wVar).b, (hye.a) hyeVar2)) == null) {
                        return;
                    }
                    rvd0 rvd0Var3 = U2.a;
                    f4zVar.b(new aye.f((ClipsAuthor) rvd0Var3.a, rvd0Var3.c.a.toString(), true));
                    return;
                }
                if (!(wVar instanceof ixe.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(hyeVar2 instanceof hye.a) || (U = U(((ixe.t) wVar).b, (hye.a) hyeVar2)) == null) {
                    return;
                }
                f4zVar.b(new aye.h((ClipsAuthor) U.a.a));
                return;
            }
            ixe.p pVar = (ixe.p) wVar;
            ClipGridParams.Data.Profile profile2 = pVar.b;
            ?? r2 = pVar.c;
            ClipsAuthor clipsAuthor = profile2.b;
            String str2 = clipsAuthor.i;
            if (str2 != null && (obj = drm0.p0(str2).toString()) != null) {
                str = obj;
            }
            s8u0 s8u0Var = (s8u0) r2.invoke(str, Boolean.FALSE);
            rvd0.b bVar3 = new rvd0.b(clipsAuthor);
            bVar3.d(false);
            bVar3.b(false);
            bVar3.a();
            bVar3.c();
            mvd0.a.C3374a c3374a = new mvd0.a.C3374a(hg10.r(bVar3.b));
            T(new dye.e(clipsAuthor.j == null ? Collections.singletonList(new hud0.d(V(c3374a, profile2, s8u0Var), new zxe.d(ehd.a(clipsAuthor), clipsAuthor.U(), clipsAuthor.b.o, true))) : Collections.singletonList(new hud0.c(V(c3374a, profile2, s8u0Var))), 0));
            return;
        }
        jwe e = g620.f().e();
        ixe.h hVar = (ixe.h) wVar;
        List<UserId> list6 = hVar.c;
        List<UserId> list7 = list6;
        e.i((UserId[]) list7.toArray(new UserId[0]));
        List<ClipGridParams.Data.Profile> list8 = hVar.b;
        ?? r22 = hVar.d;
        g620.f().e().i((UserId[]) list7.toArray(new UserId[0]));
        int i4 = 200;
        int i5 = 1024;
        if (!(hyeVar2 instanceof hye.a)) {
            UserId p = hyeVar2.p();
            ArrayList o = e43.o(new hud0.b.a());
            Set R0 = j5g.R0(list6);
            if (p != null && !R0.contains(p)) {
                R0.add(p);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list8) {
                if (R0.contains(((ClipGridParams.Data.Profile) obj4).b.b.b)) {
                    arrayList3.add(obj4);
                }
            }
            Iterator it4 = j5g.D0(new bye(0), arrayList3).iterator();
            while (it4.hasNext()) {
                ClipsAuthor clipsAuthor2 = ((ClipGridParams.Data.Profile) it4.next()).b;
                String str3 = clipsAuthor2.i;
                Owner owner2 = clipsAuthor2.b;
                if (str3 == null) {
                    str3 = "";
                }
                s8u0 s8u0Var2 = (s8u0) r22.invoke(str3, Boolean.TRUE);
                int i6 = clipsAuthor2.f;
                rvd0.b bVar4 = new rvd0.b(clipsAuthor2);
                bVar4.d(true);
                bVar4.b(true);
                bVar4.a();
                bVar4.c();
                mvd0.a.C3374a c3374a2 = new mvd0.a.C3374a(hg10.r(bVar4.b));
                boolean d = clipsAuthor2.d();
                String f = owner2.f(i4);
                String str4 = f == null ? "" : f;
                UserId userId = owner2.b;
                long j = clipsAuthor2.j();
                boolean i7 = owner2.i(i5);
                VerifyInfo verifyInfo = owner2.f;
                String str5 = owner2.c;
                o.add(new hud0.b.C3022b(new rvd0(clipsAuthor2, i6, new rvd0.a(s8u0Var2, str4, str5 == null ? "" : str5, userId, j, i7, new qow(verifyInfo), new qow(owner2.k)), c3374a2, false, d)));
                i4 = 200;
                i5 = 1024;
            }
            a7f0.a.f(this, rsg0.T(yfb.x(new ngj0().b(Collections.singletonList("clipsProfileRedesign")))).K().l(new vj0(new kz0(12), 11)), new l5(this, 25), new tr0(7), 1);
            Iterator it5 = o.iterator();
            int i8 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i8 = -1;
                    break;
                }
                hud0.b bVar5 = (hud0.b) it5.next();
                if ((bVar5 instanceof hud0.b.C3022b) && epx.f(((hud0.b.C3022b) bVar5).a.c.d, p)) {
                    break;
                } else {
                    i8++;
                }
            }
            Iterator it6 = o.iterator();
            int i9 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (((hud0.b) it6.next()) instanceof hud0.b.C3022b) {
                        i2 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int i10 = i2 < 0 ? 0 : i2;
            if (i8 < i10) {
                i8 = i10;
            }
            T(new dye.e(o, i8));
            return;
        }
        hye.a aVar4 = (hye.a) hyeVar2;
        List list9 = aVar4.d;
        Iterator it7 = list9.iterator();
        while (true) {
            if (it7.hasNext()) {
                aVar = it7.next();
                if (((hud0) aVar) instanceof hud0.b.a) {
                    break;
                }
            } else {
                aVar = null;
                break;
            }
        }
        hud0.b.a aVar5 = aVar instanceof hud0.b.a ? aVar : null;
        if (aVar5 == null) {
            aVar5 = new hud0.b.a();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list9) {
            if (obj5 instanceof hud0.b.C3022b) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            arrayList5.add(((hud0.b.C3022b) it8.next()).a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList5.size());
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            Object next = it9.next();
            linkedHashMap.put(((rvd0) next).c.d, next);
        }
        List<ClipGridParams.Data.Profile> list10 = list8;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list10) {
            if (list6.contains(((ClipGridParams.Data.Profile) obj6).b.b.b)) {
                arrayList6.add(obj6);
            }
        }
        Iterator it10 = arrayList6.iterator();
        wzs wzsVar = r22;
        while (it10.hasNext()) {
            ClipsAuthor clipsAuthor3 = ((ClipGridParams.Data.Profile) it10.next()).b;
            Owner owner3 = clipsAuthor3.b;
            Owner owner4 = clipsAuthor3.b;
            UserId userId2 = owner3.b;
            int i11 = clipsAuthor3.f;
            rvd0.b bVar6 = new rvd0.b(clipsAuthor3);
            bVar6.d(z2);
            bVar6.b(z2);
            bVar6.a();
            bVar6.c();
            mvd0.a.C3374a c3374a3 = new mvd0.a.C3374a(hg10.r(bVar6.b));
            boolean d2 = clipsAuthor3.d();
            String str6 = clipsAuthor3.i;
            if (str6 == null) {
                str6 = "";
            }
            s8u0 s8u0Var3 = (s8u0) wzsVar.invoke(str6, Boolean.TRUE);
            String f2 = owner4.f(200);
            String str7 = f2 == null ? "" : f2;
            UserId userId3 = owner4.b;
            long j2 = clipsAuthor3.j();
            boolean i12 = owner4.i(1024);
            VerifyInfo verifyInfo2 = owner4.f;
            wzs wzsVar2 = wzsVar;
            String str8 = owner4.c;
            linkedHashMap.put(userId2, new rvd0(clipsAuthor3, i11, new rvd0.a(s8u0Var3, str7, str8 == null ? "" : str8, userId3, j2, i12, new qow(verifyInfo2), new qow(owner4.k)), c3374a3, false, d2));
            wzsVar = wzsVar2;
            z2 = true;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list10) {
            if (!list6.contains(((ClipGridParams.Data.Profile) obj7).b.b.b)) {
                arrayList7.add(obj7);
            }
        }
        Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            linkedHashMap.remove(((ClipGridParams.Data.Profile) it11.next()).b.b.b);
        }
        List singletonList = Collections.singletonList(aVar5);
        Collection values = linkedHashMap.values();
        ArrayList arrayList8 = new ArrayList(c5g.u(values, 10));
        Iterator it12 = values.iterator();
        while (it12.hasNext()) {
            arrayList8.add(new hud0.b.C3022b((rvd0) it12.next()));
        }
        T(new dye.e(j5g.u0(arrayList8, singletonList), aVar4.e));
    }
}
