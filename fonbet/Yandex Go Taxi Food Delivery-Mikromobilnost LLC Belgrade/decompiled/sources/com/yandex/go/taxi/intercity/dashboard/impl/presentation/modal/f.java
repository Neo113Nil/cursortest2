package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.address.models.Address;
import defpackage.aow;
import defpackage.bow;
import defpackage.fhw;
import defpackage.nfw;
import defpackage.rnw;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xnw;
import defpackage.ynw;
import defpackage.znw;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        bow bowVar;
        bow bowVar2 = (bow) obj;
        g gVar = this.a;
        r0 r0Var = gVar.C.b;
        do {
            value = r0Var.getValue();
            bowVar = (bow) value;
            if (bowVar == bowVar2) {
                bowVar = null;
            }
        } while (!r0Var.k(value, bowVar));
        tt2 tt2Var = gVar.y;
        if (bowVar2 instanceof znw) {
            PointType pointType = ((znw) bowVar2).a;
            nfw nfwVar = gVar.x;
            int i = fhw.a[pointType.ordinal()];
            if (i == 1) {
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e.U(nfwVar.a, PointType.SOURCE);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e.U(nfwVar.a, PointType.DESTINATION);
            }
        } else if (bowVar2 instanceof aow) {
            aow aowVar = (aow) bowVar2;
            Address address = aowVar.a;
            PointType pointType2 = aowVar.b;
            tse Jg = gVar.Jg();
            tt2Var.getClass();
            com.yandex.go.coroutines.b.g(Jg, uyj.a, null, new IntercityDashboardPresenter$setResolvedAddress$1(gVar, address, pointType2, null), 2);
        } else if (bowVar2 instanceof xnw) {
            com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = gVar.z;
            if (!com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f.e(fVar.a.a().d, fVar.j())) {
                tse Jg2 = gVar.Jg();
                tt2Var.getClass();
                com.yandex.go.coroutines.b.g(Jg2, uyj.a, null, new IntercityDashboardPresenter$onSuggestDataChanged$1(gVar, null), 2);
            }
        } else {
            if (!(bowVar2 instanceof ynw)) {
                w511.b();
                return null;
            }
            rnw rnwVar = ((ynw) bowVar2).a;
            tse Jg3 = gVar.Jg();
            tt2Var.getClass();
            tje.N(Jg3, uyj.a, null, new IntercityDashboardPresenter$handleModalViewOpenData$1(gVar, rnwVar, null), 2);
        }
        return zy11.a;
    }
}
