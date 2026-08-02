package defpackage;

import com.yandex.go.payments.paymentlist.experiments.CardNetwork;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes8.dex */
public final class irs {
    public final i3y a;
    public final List b = scc.g(CardNetwork.VISA, CardNetwork.MASTERCARD);

    public irs(rqo rqoVar) {
        this.a = a.b(LazyThreadSafetyMode.NONE, new zf2(rqoVar, 1));
    }
}
