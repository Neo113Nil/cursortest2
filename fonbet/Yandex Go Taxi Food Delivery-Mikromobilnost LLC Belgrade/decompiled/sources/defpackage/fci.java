package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.DeliveryBitmapTransformation;

/* loaded from: classes14.dex */
public final class fci implements dci {
    public final pav a;

    public fci(pav pavVar) {
        this.a = pavVar;
    }

    @Override // defpackage.dci
    public final Object a(String str, int i, int i2, DeliveryBitmapTransformation deliveryBitmapTransformation, Continuation continuation) {
        tfv tfvVar;
        g16 g = this.a.b().b(str).g(i, i2);
        int i3 = deliveryBitmapTransformation == null ? -1 : eci.a[deliveryBitmapTransformation.ordinal()];
        if (i3 == -1) {
            tfvVar = pfv.a;
        } else {
            if (i3 != 1) {
                w511.b();
                return null;
            }
            tfvVar = ofv.a;
        }
        return g.e(tfvVar).a(continuation);
    }

    @Override // defpackage.dci
    public final Object b(String str, SuspendLambda suspendLambda) {
        return this.a.b().b(str).a(suspendLambda);
    }
}
