package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.presentation.BookingPreloaderTask;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BookingPreloaderBootstrapper.kt */
/* loaded from: classes18.dex */
public final class hs7 implements vj50<ss7, on50, BookingPreloaderTask, ks7> {
    public final BookingScreenParams a;

    public hs7(BookingScreenParams bookingScreenParams, com.vk.movika.sdk.base.ui.v vVar) {
        this.a = bookingScreenParams;
    }

    @Override // xsna.vj50
    public final ss7 a() {
        qcy<Object>[] qcyVarArr = BookingPreloaderFragment.S;
        return new ss7(this.a, true, null);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ ks7 b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<BookingPreloaderTask> c(ss7 ss7Var) {
        return EmptyList.b;
    }
}
