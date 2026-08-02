package xsna;

import xsna.et7;
import xsna.gs7;

/* compiled from: BookingPreloaderStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class ts7 implements izs<ss7, et7> {
    public static final ts7 b = new ts7();

    @Override // xsna.izs
    public final et7 invoke(ss7 ss7Var) {
        ss7 ss7Var2 = ss7Var;
        Exception exc = ss7Var2.d;
        return exc != null ? new et7.b(com.vk.ecomm.onlinebooking.impl.common.b.c(exc), gs7.c.b) : ss7Var2.c ? et7.c.b : et7.a.b;
    }
}
