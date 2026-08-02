package defpackage;

import com.yandex.go.intercity.flex.dashboard.point_selection.layers.IntercityGetToPointLocationsInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.intercity.flex.dashboard.point_selection.layers.IntercityGetToPointPresenter$onResume$$inlined$safeCollectIn$1;
import com.yandex.go.intercity.flex.dashboard.point_selection.layers.e;
import com.yandex.mapkit.transport.masstransit.Route;

/* loaded from: classes12.dex */
public final class lnw extends qc5 {
    public final e A;
    public final anw B;
    public final int C;
    public final int D;
    public Route E;

    public lnw(ney neyVar, e eVar, anw anwVar) {
        super(inw.class, neyVar);
        this.A = eVar;
        this.B = anwVar;
        Integer num = anwVar.g;
        this.C = num != null ? num.intValue() : 0;
        Integer num2 = anwVar.f;
        this.D = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((inw) Dg()).e0();
        super.Cg();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        e eVar = this.A;
        tje.N(Kg(), null, null, new IntercityGetToPointPresenter$onResume$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(new mth(eVar.d.a, 6), new IntercityGetToPointLocationsInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, eVar)), null, this), 3);
    }
}
