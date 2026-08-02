package xsna;

import android.view.View;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import xsna.lrv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zr7 implements lrv0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.fragment.app.d c;

    public /* synthetic */ zr7(androidx.fragment.app.d dVar, int i) {
        this.b = i;
        this.c = dVar;
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        int i = this.b;
        androidx.fragment.app.d dVar = this.c;
        switch (i) {
            case 0:
                BookingNavHostFragment bookingNavHostFragment = (BookingNavHostFragment) dVar;
                int i2 = BookingNavHostFragment.S;
                View view = bookingNavHostFragment.getView();
                if (view != null) {
                    view.post(new hv1(bookingNavHostFragment, 1));
                    break;
                }
                break;
            default:
                ((oeu0) dVar).tn();
                break;
        }
    }
}
