package defpackage;

import com.yandex.go.navigation.compose.modal.ComposeAdapterModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class mw0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ mw0(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 animateDismiss$lambda$0;
        zy11 onBackPressedListener$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                animateDismiss$lambda$0 = ComposeAdapterModalView.animateDismiss$lambda$0(runnable);
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                onBackPressedListener$lambda$0 = ScootersDetailedOrderV2ModalView.setOnBackPressedListener$lambda$0(runnable);
                break;
            case 6:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return zy11Var;
    }
}
