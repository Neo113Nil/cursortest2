package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.mm7;

/* compiled from: BookingInternalRouter.kt */
/* loaded from: classes18.dex */
public final class tq7 {
    public final FragmentImpl a;
    public final qdz b;
    public final fy00 c;
    public final lm7 d;
    public final Class<? extends FragmentImpl> e;
    public final FragmentManager f;
    public final UiTracker.a g;

    public tq7(FragmentImpl fragmentImpl, qdz qdzVar, fy00 fy00Var, lm7 lm7Var) {
        this.a = fragmentImpl;
        this.b = qdzVar;
        this.c = fy00Var;
        this.d = lm7Var;
        this.e = fragmentImpl.getClass();
        this.f = fragmentImpl.getChildFragmentManager();
        UiTracker uiTracker = UiTracker.a;
        this.g = UiTracker.f(fragmentImpl.kn());
    }

    public final void a(UserId userId, BookingServiceType bookingServiceType) {
        if (userId != null) {
            lm7 lm7Var = this.d;
            lm7Var.getClass();
            lm7Var.a(new mm7.a.d(userId, bookingServiceType));
        }
        this.a.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(FragmentImpl fragmentImpl) {
        Object nVar;
        boolean z = fragmentImpl instanceof bs7;
        if (!z) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Screen " + fragmentImpl + " is not BookingNavScreen"));
        }
        FragmentManager fragmentManager = this.f;
        androidx.fragment.app.a b = tk5.b(fragmentManager, fragmentManager);
        b.r = true;
        StringBuilder sb = new StringBuilder("OnlineBooking");
        bs7 bs7Var = z ? (bs7) fragmentImpl : null;
        if (bs7Var == null || (nVar = bs7Var.X9()) == null) {
            nVar = fragmentImpl.toString();
        }
        sb.append(nVar);
        String sb2 = sb.toString();
        b.g(R.id.fragment_container, fragmentImpl, sb2);
        b.d(sb2);
        b.k(false);
        fragmentManager.F();
        this.g.a(null, fragmentImpl, true);
    }

    public final void c(com.vk.ecomm.onlinebooking.impl.navhostfragment.b bVar, BookingScreenParams bookingScreenParams) {
        if (epx.f(bVar, b.e.b)) {
            if (bookingScreenParams != null) {
                j(bookingScreenParams);
                return;
            }
            return;
        }
        if (bVar instanceof b.a) {
            if (bookingScreenParams != null) {
                b.a aVar = (b.a) bVar;
                d(bookingScreenParams, aVar.b, aVar.c, aVar.d);
                return;
            }
            return;
        }
        if (bVar instanceof b.j) {
            if (bookingScreenParams != null) {
                b.j jVar = (b.j) bVar;
                i(bookingScreenParams, jVar.b, jVar.c);
                return;
            }
            return;
        }
        if (epx.f(bVar, b.d.b)) {
            if (bookingScreenParams != null) {
                f(bookingScreenParams);
                return;
            }
            return;
        }
        if (bVar instanceof b.C0978b) {
            if (bookingScreenParams != null) {
                b.C0978b c0978b = (b.C0978b) bVar;
                e(bookingScreenParams, c0978b.b, c0978b.c);
                return;
            }
            return;
        }
        if (epx.f(bVar, b.i.b)) {
            if (bookingScreenParams != null) {
                h(bookingScreenParams);
                return;
            }
            return;
        }
        if (bVar instanceof b.h) {
            if (bookingScreenParams != null) {
                g(bookingScreenParams);
                return;
            }
            return;
        }
        if (!epx.f(bVar, b.f.b)) {
            if (!epx.f(bVar, b.g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bookingScreenParams != null) {
                BookingPreloaderFragment.a aVar2 = new BookingPreloaderFragment.a(BookingPreloaderFragment.class, null, null);
                aVar2.j.putParcelable("initParams", bookingScreenParams);
                aVar2.s(true);
                aVar2.v(this.e);
                b(aVar2.f());
                return;
            }
            return;
        }
        if (bookingScreenParams != null) {
            BookingServiceModel bookingServiceModel = (BookingServiceModel) j5g.a0(bookingScreenParams.e);
            if (bookingServiceModel != null) {
                UserId userId = bookingScreenParams.b;
                String str = bookingServiceModel.c;
                Context requireContext = this.a.requireContext();
                int i = bookingServiceModel.e;
                if (i <= 0) {
                    i = 0;
                }
                int i2 = bookingServiceModel.f;
                this.c.b(new cx7(str, Long.valueOf(bookingServiceModel.b), userId, mri0.c(requireContext, new ft7(i, i2 > 0 ? i2 : 0), bookingScreenParams.d.c)));
            }
            a(null, null);
        }
    }

    public final void d(BookingScreenParams bookingScreenParams, boolean z, boolean z2, boolean z3) {
        BookingCalendarScreenFragment.a aVar = new BookingCalendarScreenFragment.a(BookingCalendarScreenFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("initParams", bookingScreenParams);
        bundle.putBoolean("isMasterChangeable", z);
        bundle.putBoolean("isServiceChangeable", z2);
        bundle.putBoolean("isEmptyDate", z3);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void e(BookingScreenParams bookingScreenParams, boolean z, boolean z2) {
        BookingEditScreenFragment.a aVar = new BookingEditScreenFragment.a(BookingEditScreenFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("initParams", bookingScreenParams);
        bundle.putBoolean("isRescheduling", z);
        bundle.putBoolean("isRebooking", z2);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void f(BookingScreenParams bookingScreenParams) {
        BookingMastersScreenFragmentMvi2.a aVar = new BookingMastersScreenFragmentMvi2.a(BookingMastersScreenFragmentMvi2.class, null, null);
        aVar.j.putParcelable("initParams", bookingScreenParams);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void g(BookingScreenParams bookingScreenParams) {
        BookingRecordCompletedScreenFragment.a aVar = new BookingRecordCompletedScreenFragment.a(BookingRecordCompletedScreenFragment.class, null, null);
        aVar.j.putParcelable("initParams", bookingScreenParams);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void h(BookingScreenParams bookingScreenParams) {
        BookingRecordsScreenFragment.a aVar = new BookingRecordsScreenFragment.a(BookingRecordsScreenFragment.class, null, null);
        aVar.j.putParcelable("initParams", bookingScreenParams);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void i(BookingScreenParams bookingScreenParams, boolean z, boolean z2) {
        BookingServicesScreenFragment.a aVar = new BookingServicesScreenFragment.a(BookingServicesScreenFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("initParams", bookingScreenParams);
        bundle.putBoolean("canGoBack", z);
        bundle.putBoolean("isPickerMode", z2);
        bundle.putBoolean("force_dark_theme", z2);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }

    public final void j(BookingScreenParams bookingScreenParams) {
        BookingStartScreenFragment.a aVar = new BookingStartScreenFragment.a(BookingStartScreenFragment.class, null, null);
        aVar.j.putParcelable("initParams", bookingScreenParams);
        aVar.s(true);
        aVar.v(this.e);
        b(aVar.f());
    }
}
