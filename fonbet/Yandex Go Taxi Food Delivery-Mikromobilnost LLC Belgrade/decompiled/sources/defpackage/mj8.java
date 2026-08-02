package defpackage;

import com.yandex.go.payments.paymentlist.experiments.CardNetwork;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class mj8 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CardNetwork.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
