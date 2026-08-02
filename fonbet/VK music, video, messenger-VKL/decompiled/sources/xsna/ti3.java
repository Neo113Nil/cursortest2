package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.ej3;
import xsna.mi3;

/* compiled from: ArchiveReducer.kt */
/* loaded from: classes4.dex */
public final class ti3 extends dm50<oj3, mi3, ej3> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti3() {
        super(ej3.f);
        ej3 ej3Var = ej3.f;
    }

    @Override // xsna.dm50
    public final ej3 c(ej3 ej3Var, mi3 mi3Var) {
        VKList<Photo> vKList;
        ej3 ej3Var2 = ej3Var;
        mi3 mi3Var2 = mi3Var;
        ej3.a aVar = ej3Var2.c;
        if (mi3Var2 instanceof mi3.i) {
            return ej3.a(ej3Var2, ((mi3.i) mi3Var2).b, null, false, false, 10);
        }
        if (mi3Var2 instanceof mi3.b) {
            mi3.b bVar = (mi3.b) mi3Var2;
            boolean z = bVar.d;
            VKList<Photo> vKList2 = bVar.b;
            if (z) {
                vKList = new VKList<>();
            } else {
                vKList = aVar.a;
                if (vKList == null) {
                    vKList = new VKList<>();
                }
            }
            VKList<Photo> vKList3 = vKList;
            vKList3.addAll(vKList2);
            vKList3.o(vKList2.i());
            vKList3.n(vKList2.j());
            ej3.a aVar2 = ej3Var2.c;
            return ej3.a(ej3Var2, false, ej3.a.a(aVar2, vKList3, null, bVar.c, z ? EmptySet.b : aVar2.d, 2), false, false, 8);
        }
        if (mi3Var2 instanceof mi3.c) {
            return ej3.a(ej3Var2, false, null, false, false, 10);
        }
        if (mi3Var2 instanceof mi3.h) {
            return ej3.a(ej3Var2, false, null, ((mi3.h) mi3Var2).b, false, 11);
        }
        if (!(mi3Var2 instanceof mi3.d)) {
            if (mi3Var2 instanceof mi3.a) {
                return ej3.a(ej3Var2, false, ej3.a.a(aVar, null, EmptySet.b, false, null, 13), false, ((mi3.a) mi3Var2).b, 5);
            }
            if (mi3Var2 instanceof mi3.e) {
                return ej3.a(ej3Var2, false, ej3.a.a(aVar, null, izi0.k(aVar.b, ((mi3.e) mi3Var2).b), false, null, 13), false, false, 13);
            }
            if (mi3Var2 instanceof mi3.f) {
                return ej3.a(ej3Var2, false, ej3.a.a(aVar, null, izi0.f(aVar.b, ((mi3.f) mi3Var2).b), false, null, 13), false, false, 13);
            }
            if (mi3Var2 instanceof mi3.g) {
                return ej3.a(ej3Var2, false, ej3.a.a(aVar, null, null, false, izi0.j(aVar.d, ((mi3.g) mi3Var2).b), 7), false, false, 13);
            }
            throw new NoWhenBranchMatchedException();
        }
        Set<Integer> set = ((mi3.d) mi3Var2).b;
        VKList vKList4 = new VKList();
        VKList<Photo> vKList5 = aVar.a;
        if (vKList5 != null) {
            ArrayList arrayList = new ArrayList();
            for (Photo photo : vKList5) {
                if (!set.contains(Integer.valueOf(photo.c))) {
                    arrayList.add(photo);
                }
            }
            vKList4.addAll(arrayList);
            vKList4.o(vKList5.i() - (vKList5.size() - vKList4.size()));
            vKList4.n(vKList5.j());
        }
        ej3.a aVar3 = ej3Var2.c;
        Set<Photo> set2 = aVar3.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set2) {
            if (!set.contains(Integer.valueOf(((Photo) obj).c))) {
                arrayList2.add(obj);
            }
        }
        return ej3.a(ej3Var2, false, ej3.a.a(aVar3, vKList4, j5g.S0(arrayList2), false, null, 12), false, false, 13);
    }

    @Override // xsna.dm50
    public final oj3 d() {
        return new oj3(e(new sa(this, 4)));
    }

    @Override // xsna.dm50
    public final void h(ej3 ej3Var, oj3 oj3Var) {
        f(oj3Var.a, ej3Var);
    }
}
