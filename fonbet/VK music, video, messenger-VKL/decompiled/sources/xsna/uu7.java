package xsna;

import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.ru7;

/* compiled from: BookingRecordCompletedScreenTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class uu7 extends uvj<lu7, on50, ru7, ru7, hu7, qt7> {
    public final zu7 g;
    public final BookingScreenParams h;

    public uu7(zu7 zu7Var, BookingScreenParams bookingScreenParams, nn50 nn50Var) {
        super(tci.c, nn50Var);
        this.g = zu7Var;
        this.h = bookingScreenParams;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ru7 ru7Var = (ru7) hn50Var;
        boolean z = ru7Var instanceof ru7.a;
        hpj hpjVar = this.f;
        if (z) {
            return m(myc0.h(hpjVar, null, null, new su7(this, (ru7.a) ru7Var, null), 3));
        }
        if (ru7Var instanceof ru7.b) {
            return m(myc0.h(hpjVar, null, null, new tu7(this, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
        m(myc0.h(this.f, null, null, new tu7(this, null), 3));
    }
}
