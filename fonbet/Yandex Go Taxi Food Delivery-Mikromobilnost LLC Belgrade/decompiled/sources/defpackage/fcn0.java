package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class fcn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersDamageView b;

    public /* synthetic */ fcn0(ScootersDamageView scootersDamageView, int i) {
        this.a = i;
        this.b = scootersDamageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        sls slsVar;
        RecyclerView recyclerView;
        int i = this.a;
        ScootersDamageView scootersDamageView = this.b;
        switch (i) {
            case 0:
                ScootersDamageView.onAttachedToWindow$lambda$1(scootersDamageView);
                break;
            case 1:
                ScootersDamageView.onAttachedToWindow$lambda$2(scootersDamageView);
                break;
            case 2:
                dVar = scootersDamageView.scootersDamagePresenter;
                dVar.E.b(dVar.B);
                ((ybn0) dVar.Dg()).dismissView();
                break;
            case 3:
                slsVar = scootersDamageView.onUploadImage;
                slsVar.invoke();
                break;
            default:
                recyclerView = scootersDamageView.rv;
                recyclerView.scrollToPosition(0);
                break;
        }
    }
}
