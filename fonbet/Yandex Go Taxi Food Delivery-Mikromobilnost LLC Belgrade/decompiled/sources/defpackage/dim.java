package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.go.taxi.order.search.ui.driver.DriverAcceptanceGradientView;

/* loaded from: classes14.dex */
public final /* synthetic */ class dim implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ eim b;

    public /* synthetic */ dim(eim eimVar, int i) {
        this.a = i;
        this.b = eimVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        eim eimVar = this.b;
        switch (i) {
            case 0:
                eimVar.b.cancel();
                ValueAnimator valueAnimator = eimVar.b;
                valueAnimator.setCurrentPlayTime(0L);
                valueAnimator.start();
                break;
            default:
                View view = (View) eimVar.d.get();
                DriverAcceptanceGradientView driverAcceptanceGradientView = eimVar.c;
                if (view != null) {
                    driverAcceptanceGradientView.attachToView(view);
                    driverAcceptanceGradientView.playAnimation();
                    qke.v(eimVar.a);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
