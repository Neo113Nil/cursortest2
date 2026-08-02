package defpackage;

import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.OrdinarySearchMVPPresenter$queryRoute$$inlined$suspendCallbackApi$2;
import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.b;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class fr30 extends uhs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FunctionReferenceImpl b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr30(FunctionReferenceImpl functionReferenceImpl, Object obj, int i) {
        this.a = i;
        this.b = functionReferenceImpl;
        this.c = obj;
    }

    private final void c() {
    }

    @Override // defpackage.nlm
    public final void a() {
        switch (this.a) {
            case 0:
                jst.e.n("Receiving driving route cancelled");
                break;
        }
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        int i = this.a;
        FunctionReferenceImpl functionReferenceImpl = this.b;
        switch (i) {
            case 0:
                ((MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$2) functionReferenceImpl).invoke(drivingRoute);
                break;
            default:
                ((OrdinarySearchMVPPresenter$queryRoute$$inlined$suspendCallbackApi$2) functionReferenceImpl).invoke(drivingRoute);
                break;
        }
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$3) obj).invoke(iOException);
                break;
            default:
                a3y0.d(((b) obj).D, "queryRoute", iOException, null, 4);
                ((OrdinarySearchMVPPresenter$queryRoute$$inlined$suspendCallbackApi$2) this.b).invoke(null);
                break;
        }
    }
}
