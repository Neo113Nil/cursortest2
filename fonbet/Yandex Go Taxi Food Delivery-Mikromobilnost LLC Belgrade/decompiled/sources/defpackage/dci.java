package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.DeliveryBitmapTransformation;

/* loaded from: classes11.dex */
public interface dci {
    default Object a(String str, int i, int i2, DeliveryBitmapTransformation deliveryBitmapTransformation, Continuation continuation) {
        return b(str, (SuspendLambda) continuation);
    }

    Object b(String str, SuspendLambda suspendLambda);
}
