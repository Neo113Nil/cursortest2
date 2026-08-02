package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Condition;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;

@gsq0
/* loaded from: classes5.dex */
public final class bhb {
    public static final ygb Companion = new ygb();
    public static final i3y[] c;
    public final CheckPaymentResponse$Result a;
    public final CheckPaymentResponse$Condition b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new eua(24)), a.b(lazyThreadSafetyMode, new eua(25))};
    }

    public /* synthetic */ bhb(int i, CheckPaymentResponse$Result checkPaymentResponse$Result, CheckPaymentResponse$Condition checkPaymentResponse$Condition) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, xgb.a.getDescriptor());
            throw null;
        }
        this.a = checkPaymentResponse$Result;
        this.b = checkPaymentResponse$Condition;
    }

    public bhb(CheckPaymentResponse$Result checkPaymentResponse$Result, CheckPaymentResponse$Condition checkPaymentResponse$Condition) {
        this.a = checkPaymentResponse$Result;
        this.b = checkPaymentResponse$Condition;
    }
}
