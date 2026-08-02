package defpackage;

import com.yandex.go.navigator.domain.t;
import com.yandex.mapkit.navigation.automotive.Navigation;

/* loaded from: classes12.dex */
public final class f850 extends ofs0 {
    public final /* synthetic */ t a;

    public f850(t tVar) {
        this.a = tVar;
    }

    @Override // defpackage.ofs0, com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onManoeuvresChanged() {
        t tVar = this.a;
        Navigation navigation = tVar.w;
        if (navigation == null) {
            return;
        }
        tVar.F.l(navigation.getGuidance().getWindshield().getManoeuvres());
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onNearestLanesChanged() {
    }

    @Override // defpackage.ofs0, com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onRoadEventsChanged() {
        t tVar = this.a;
        Navigation navigation = tVar.w;
        if (navigation == null) {
            return;
        }
        b621 b621Var = tVar.j;
        b621Var.a.l(navigation.getGuidance().getWindshield().getRoadEvents());
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onTrafficLightsChanged() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onTrafficLightsCountdownUpdated() {
    }
}
