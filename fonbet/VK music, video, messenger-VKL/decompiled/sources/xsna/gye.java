package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dye;
import xsna.hud0;
import xsna.hye;

/* compiled from: ClipsProfileToolbarReducer.kt */
/* loaded from: classes17.dex */
public final class gye extends dm50<pye, dye, hye> {
    @Override // xsna.dm50
    public final hye c(hye hyeVar, dye dyeVar) {
        hye hyeVar2 = hyeVar;
        dye dyeVar2 = dyeVar;
        if (dyeVar2 instanceof dye.a) {
            dye.a aVar = (dye.a) dyeVar2;
            return new hye.b(aVar.c, aVar.b);
        }
        int i = 0;
        if (dyeVar2.equals(dye.f.b)) {
            return new hye.b(null, false);
        }
        if (dyeVar2 instanceof dye.b) {
            return new hye.b(hyeVar2.p(), ((dye.b) dyeVar2).b);
        }
        if (dyeVar2 instanceof dye.e) {
            dye.e eVar = (dye.e) dyeVar2;
            return new hye.a(eVar.c, hyeVar2.p(), eVar.b, hyeVar2.F0());
        }
        if (dyeVar2 instanceof dye.d) {
            dye.d dVar = (dye.d) dyeVar2;
            int i2 = dVar.b;
            if (hyeVar2 instanceof hye.a) {
                hye.a aVar2 = (hye.a) hyeVar2;
                List list = aVar2.d;
                hud0.b.a aVar3 = (hud0.b.a) list.get(i2);
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                for (Object obj : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    hud0 hud0Var = (hud0) obj;
                    if (i == i2) {
                        List<BaseImageDto> list2 = dVar.c;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new qow((BaseImageDto) it.next()));
                        }
                        aVar3.getClass();
                        hud0Var = new hud0.b.a(arrayList2);
                    }
                    arrayList.add(hud0Var);
                    i = i3;
                }
                return hye.a.a(aVar2, arrayList);
            }
        } else {
            if (!(dyeVar2 instanceof dye.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dye.c cVar = (dye.c) dyeVar2;
            if (hyeVar2 instanceof hye.a) {
                hye.a aVar4 = (hye.a) hyeVar2;
                List list3 = aVar4.d;
                Object Y = j5g.Y(new wow(list3));
                hud0 hud0Var2 = (hud0) (list3.size() == 1 ? Y : null);
                return (hud0Var2 != null && (hud0Var2 instanceof hud0.d)) ? hye.a.a(aVar4, rl3.u0(new hud0[]{new hud0.d(((hud0.d) hud0Var2).a, cVar.b)})) : hyeVar2;
            }
        }
        return hyeVar2;
    }

    @Override // xsna.dm50
    public final pye d() {
        return new pye(e(new ur0(12)), e(new vr0(18)));
    }

    @Override // xsna.dm50
    public final void h(hye hyeVar, pye pyeVar) {
        hye hyeVar2 = hyeVar;
        pye pyeVar2 = pyeVar;
        if (hyeVar2 instanceof hye.b) {
            f(pyeVar2.b, hyeVar2);
        } else {
            if (!(hyeVar2 instanceof hye.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(pyeVar2.a, hyeVar2);
        }
    }
}
