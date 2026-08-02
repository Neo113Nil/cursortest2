package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final class b4a0 {
    public static PaymentMethod$Type a(String str) {
        Object obj;
        Iterator<E> it = PaymentMethod$Type.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((PaymentMethod$Type) obj).getCode(), str)) {
                break;
            }
        }
        return (PaymentMethod$Type) obj;
    }

    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentMethod$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
