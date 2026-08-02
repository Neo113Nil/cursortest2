package xsna;

import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;
import com.vk.mytarget.AdsSdkComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ mnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((OnlineBookingComponent) this.c.a(fpf0.a(OnlineBookingComponent.class))).d();
            default:
                return ((AdsSdkComponent) this.c.mo408a(fpf0.a(AdsSdkComponent.class))).A1();
        }
    }
}
