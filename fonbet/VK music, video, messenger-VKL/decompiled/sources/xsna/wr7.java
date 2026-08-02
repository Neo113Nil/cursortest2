package xsna;

import androidx.fragment.app.Fragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;

/* compiled from: BookingNavExtensions.kt */
/* loaded from: classes18.dex */
public final class wr7 {
    public static final <F extends Fragment & bs7> void a(F f, as7 as7Var) {
        Fragment parentFragment = f.getParentFragment();
        BookingNavHostFragment bookingNavHostFragment = parentFragment instanceof BookingNavHostFragment ? (BookingNavHostFragment) parentFragment : null;
        if (bookingNavHostFragment != null) {
            bookingNavHostFragment.go(as7Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public static final <F extends Fragment & bs7> void b(F f, com.vk.ecomm.onlinebooking.impl.navhostfragment.b bVar, mm7 mm7Var) {
        Fragment parentFragment = f.getParentFragment();
        BookingNavHostFragment bookingNavHostFragment = parentFragment instanceof BookingNavHostFragment ? (BookingNavHostFragment) parentFragment : null;
        if (bookingNavHostFragment != null) {
            ((OnlineBookingInternalComponent) bookingNavHostFragment.P.getValue()).Df().b(bVar, mm7Var);
        }
    }
}
