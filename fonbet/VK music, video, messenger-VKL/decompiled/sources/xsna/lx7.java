package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTask;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hx7;

/* compiled from: BookingServicesScreenBootstrapper.kt */
/* loaded from: classes18.dex */
public final class lx7 implements vj50<BookingServicesScreenState, on50, BookingServicesScreenTask, com.vk.ecomm.onlinebooking.impl.services.presentation.e> {
    public final BookingScreenParams a;
    public final hx7.a b;

    public lx7(BookingScreenParams bookingScreenParams, hx7.a aVar, f20 f20Var) {
        this.a = bookingScreenParams;
        this.b = aVar;
    }

    @Override // xsna.vj50
    public final BookingServicesScreenState a() {
        qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
        EmptyList emptyList = EmptyList.b;
        return new BookingServicesScreenState(this.a, false, null, emptyList, emptyList, emptyList, jgp.b, "", null, BookingServicesScreenState.a.C0986a.a, BookingServicesScreenState.e.d, false, this.b);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ com.vk.ecomm.onlinebooking.impl.services.presentation.e b() {
        return null;
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ List<BookingServicesScreenTask> c(BookingServicesScreenState bookingServicesScreenState) {
        return null;
    }
}
