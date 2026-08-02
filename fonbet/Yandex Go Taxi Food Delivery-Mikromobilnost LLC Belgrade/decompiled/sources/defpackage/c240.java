package defpackage;

import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.masstransit.stop.ui.overlay.a;

/* loaded from: classes6.dex */
public final class c240 implements b240 {
    public final /* synthetic */ a a;

    public c240(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.b240
    public final void b4(WalkingRouteUiState walkingRouteUiState) {
        a aVar = this.a;
        uo21 uo21Var = aVar.c;
        j741 j741Var = aVar.b;
        if (walkingRouteUiState != null) {
            ((c) j741Var).d(walkingRouteUiState);
            uo21Var.attach();
        } else {
            ((c) j741Var).a();
            uo21Var.detach();
        }
    }
}
