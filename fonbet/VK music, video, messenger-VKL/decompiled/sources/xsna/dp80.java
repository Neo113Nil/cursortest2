package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.api.router.BookingSource;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;

/* compiled from: OnlineBookingRouterImpl.kt */
/* loaded from: classes18.dex */
public final class dp80 implements cp80 {
    @Override // xsna.cp80
    public final void a(Context context, UserId userId, String str, String str2, BookingSource bookingSource) {
        BookingNavHostFragment.a aVar = new BookingNavHostFragment.a(userId, str, str2, bookingSource);
        aVar.s(true);
        aVar.k(context);
    }

    @Override // xsna.cp80
    public final void b(Context context, UserId userId) {
        BookingNavHostFragment.a aVar = new BookingNavHostFragment.a(userId, "", "pick-service", BookingSource.RECORD);
        aVar.j.putBoolean("force_dark_theme", true);
        aVar.s(true);
        aVar.k(context);
    }
}
