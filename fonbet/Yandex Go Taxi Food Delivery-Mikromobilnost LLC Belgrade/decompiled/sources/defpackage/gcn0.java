package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView;

/* loaded from: classes6.dex */
public final /* synthetic */ class gcn0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersDamageView b;

    public /* synthetic */ gcn0(ScootersDamageView scootersDamageView, int i) {
        this.a = i;
        this.b = scootersDamageView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAttachedToWindow$lambda$3;
        zy11 onAttachedToWindow$lambda$4;
        zy11 insetsType$lambda$0;
        int i = this.a;
        ScootersDamageView scootersDamageView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$3 = ScootersDamageView.onAttachedToWindow$lambda$3(scootersDamageView, ((Boolean) obj).booleanValue());
                return onAttachedToWindow$lambda$3;
            case 1:
                onAttachedToWindow$lambda$4 = ScootersDamageView.onAttachedToWindow$lambda$4(scootersDamageView, (w8v) obj);
                return onAttachedToWindow$lambda$4;
            default:
                insetsType$lambda$0 = ScootersDamageView.insetsType$lambda$0(scootersDamageView, (t1w) obj);
                return insetsType$lambda$0;
        }
    }
}
