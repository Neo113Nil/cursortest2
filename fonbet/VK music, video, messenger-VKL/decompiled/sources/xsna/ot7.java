package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.hu7;
import xsna.nt7;
import xsna.qt7;
import xsna.ru7;

/* compiled from: BookingRecordCompletedScreenActor.kt */
/* loaded from: classes18.dex */
public final class ot7 extends al50<lu7, nt7, on50, ru7, hu7, qt7> {
    public final BookingScreenParams c;

    /* compiled from: BookingRecordCompletedScreenActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingButton.Action.values().length];
            try {
                iArr[BookingButton.Action.Reschedule.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingButton.Action.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingButton.Action.Other.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ot7(BookingScreenParams bookingScreenParams, sj50<lu7, on50, ru7, hu7, qt7> sj50Var) {
        super(sj50Var);
        this.c = bookingScreenParams;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        UserId userId;
        nt7 nt7Var = (nt7) lj50Var;
        boolean z = nt7Var instanceof nt7.d;
        BookingScreenParams bookingScreenParams = this.c;
        if (z) {
            if (bookingScreenParams == null) {
                throw new IllegalStateException("params must be not null");
            }
            a(ru7.b.b);
            return;
        }
        if (nt7Var instanceof nt7.a) {
            if (bookingScreenParams == null) {
                throw new IllegalStateException("params must be not null");
            }
            BookingRecord bookingRecord = ((lu7) this.b.getCurrentState()).d;
            if (bookingRecord != null) {
                int i = bookingRecord.b;
                e(hu7.d.a);
                a(new ru7.a(bookingScreenParams.b, i));
                return;
            }
            return;
        }
        if (nt7Var instanceof nt7.c) {
            e(hu7.a.a);
            return;
        }
        if (!(nt7Var instanceof nt7.f)) {
            if (nt7Var instanceof nt7.b) {
                c(qt7.c.b.a);
                return;
            }
            if (!(nt7Var instanceof nt7.e)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bookingScreenParams != null && com.vk.ecomm.onlinebooking.impl.navhostfragment.c.a(bookingScreenParams)) {
                c(qt7.c.b.a);
                return;
            } else {
                if (bookingScreenParams == null || (userId = bookingScreenParams.b) == null) {
                    return;
                }
                c(new st7(userId, Integer.valueOf(bookingScreenParams.l)));
                c(new qt7.c.e(new BookingScreenParams(userId, a.f.d.a, null, null, null, false, null, null, null, null, 0, null, 0, null, null, null, null, 131068, null)));
                return;
            }
        }
        nt7.f fVar = (nt7.f) nt7Var;
        BookingButton.Action action = fVar.b;
        BookingRecord bookingRecord2 = fVar.c;
        int i2 = a.$EnumSwitchMapping$0[action.ordinal()];
        if (i2 == 1) {
            if (bookingScreenParams == null) {
                return;
            }
            UserId userId2 = bookingScreenParams.b;
            c(new tt7(userId2, Integer.valueOf(bookingScreenParams.l)));
            c(new qt7.c.C3571c(userId2, bookingScreenParams.d, bookingRecord2));
            return;
        }
        if (i2 == 2) {
            e(hu7.b.a);
            if (bookingScreenParams == null) {
                return;
            }
            c(new rt7(bookingScreenParams.b, Integer.valueOf(bookingScreenParams.l)));
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (bookingScreenParams == null) {
            return;
        }
        c(new qt7.c.d(bookingScreenParams.b, bookingScreenParams.d, bookingRecord2));
    }
}
