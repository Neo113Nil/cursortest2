package defpackage;

import com.yandex.go.overdraft.data.model.PaymentState;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class bka0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
