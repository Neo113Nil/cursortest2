package defpackage;

import com.yandex.go.scooters.driver_license.a;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.d;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersMobilityHubFinishResolution;

/* loaded from: classes6.dex */
public final class dgn0 implements ypm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dgn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d) obj).invoke();
                break;
            case 1:
                ((a) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.ypm0
    public final void c1() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d) obj).invoke();
                break;
            case 1:
                ((a) obj).r(new qu(9));
                break;
            default:
                ryn0 ryn0Var = (ryn0) obj;
                ryn0.P(ryn0Var);
                ryn0Var.H.Fg(ScootersMobilityHubFinishResolution.CONTINUE_ROUTE);
                ryn0Var.r(new vkn0(25));
                break;
        }
    }

    @Override // defpackage.ypm0
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d) obj).invoke();
                break;
            case 1:
                ((a) obj).r(new qu(9));
                break;
            default:
                ryn0 ryn0Var = (ryn0) obj;
                ryn0.P(ryn0Var);
                ryn0Var.H.Fg(ScootersMobilityHubFinishResolution.DISMISS_ROUTE);
                ryn0Var.r(new vkn0(26));
                break;
        }
    }
}
