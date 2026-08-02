package xsna;

import com.vk.search.params.api.City;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.bfc;
import xsna.cfc;
import xsna.hfc;
import xsna.pec;
import xsna.xec;

/* compiled from: CityParameterFeature.kt */
/* loaded from: classes5.dex */
public final class tec extends wk50<gfc, cfc, pec, xec> {
    public final hfc f;
    public final jfc g;
    public final f4z h;

    public tec(afc afcVar, hfc hfcVar, jfc jfcVar) {
        super(pec.b.b, afcVar);
        this.f = hfcVar;
        this.g = jfcVar;
        this.h = new f4z();
        fuq[] fuqVarArr = {hfcVar, jfcVar};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(fuqVarArr[i].d());
        }
        io.reactivex.rxjava3.internal.operators.observable.u0 O = io.reactivex.rxjava3.core.q.O(arrayList);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        this.e.b(O.L(qVar, false).subscribe(new ew(new com.vk.repository.internal.repos.stickers.suggests.a(1, this, tec.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), 11)));
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList2.add(fuqVarArr[i2].e());
        }
        this.e.b(io.reactivex.rxjava3.core.q.O(arrayList2).L(qVar, false).subscribe(new pm1(new sec(1, this.h, wj50.class, "notify", "notify(Ljava/lang/Object;)V", 0, 0), 8)));
    }

    @Override // xsna.wk50
    public final void N(cfc cfcVar, pec pecVar) {
        cfc cfcVar2 = cfcVar;
        pec pecVar2 = pecVar;
        cfc.b bVar = cfcVar2.b;
        boolean equals = pecVar2.equals(pec.b.b);
        long j = 0;
        hfc hfcVar = this.f;
        if (equals) {
            T(new xec.c(""));
            hfcVar.b.onNext(new hfc.a("", 0L));
            return;
        }
        if (pecVar2.equals(pec.d.b)) {
            T(new xec.c(bVar.b));
            hfcVar.b.onNext(new hfc.a(drm0.p0(bVar.b).toString(), 0L));
            return;
        }
        if (!(pecVar2 instanceof pec.c)) {
            if (!(pecVar2 instanceof pec.a)) {
                throw new NoWhenBranchMatchedException();
            }
            uec uecVar = ((pec.a) pecVar2).b;
            this.g.a.onNext(new bfc.a(new City(uecVar.b, uecVar.c, null, null, 12, null)));
            return;
        }
        cfc.a aVar = cfcVar2.c;
        String str = bVar.b;
        String str2 = ((pec.c) pecVar2).b;
        if (!epx.f(str, str2)) {
            T(new xec.c(str2));
        }
        String obj = drm0.p0(bVar.b).toString();
        String obj2 = drm0.p0(str2).toString();
        boolean f = epx.f(obj, obj2);
        cfc.a.b bVar2 = cfc.a.b.b;
        if (!f || epx.f(aVar, bVar2)) {
            if (obj2.length() != 0 && !epx.f(aVar, bVar2)) {
                j = 300;
            }
            hfcVar.b.onNext(new hfc.a(obj2, j));
        }
    }
}
