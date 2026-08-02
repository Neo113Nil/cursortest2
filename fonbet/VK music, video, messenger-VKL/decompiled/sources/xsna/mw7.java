package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import xsna.iw7;

/* compiled from: BookingRecordsScreenViewState.kt */
/* loaded from: classes18.dex */
public final class mw7 implements fm50<iw7.d> {
    public final yzt0<wow<bv7>> a;
    public final yzt0<BookingRecord> b;
    public final yzt0<String> c;
    public final yzt0<BookingActionResult> d;
    public final yzt0<Boolean> e;

    public mw7(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
        this.e = h0u0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw7)) {
            return false;
        }
        mw7 mw7Var = (mw7) obj;
        return epx.f(this.a, mw7Var.a) && epx.f(this.b, mw7Var.b) && epx.f(this.c, mw7Var.c) && epx.f(this.d, mw7Var.d) && epx.f(this.e, mw7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Main(records=");
        sb.append(this.a);
        sb.append(", cancelableRecord=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", actionResult=");
        sb.append(this.d);
        sb.append(", isPaginationAvailable=");
        return tr.c(sb, this.e, ')');
    }
}
