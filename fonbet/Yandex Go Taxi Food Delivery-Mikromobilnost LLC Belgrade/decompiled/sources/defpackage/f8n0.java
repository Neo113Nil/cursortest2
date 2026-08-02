package defpackage;

import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;

/* loaded from: classes6.dex */
public final class f8n0 implements d8n0 {
    public final /* synthetic */ ScootersCompassRotatableFloatButton a;

    public f8n0(ScootersCompassRotatableFloatButton scootersCompassRotatableFloatButton) {
        this.a = scootersCompassRotatableFloatButton;
    }

    @Override // defpackage.d8n0
    public final void k(gwc gwcVar) {
        int i = gwcVar.a ? 0 : 8;
        ScootersCompassRotatableFloatButton scootersCompassRotatableFloatButton = this.a;
        scootersCompassRotatableFloatButton.setVisibility(i);
        scootersCompassRotatableFloatButton.setImageRotation(gwcVar.b);
    }
}
