package defpackage;

import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class krf implements x760, ryj0 {
    public final /* synthetic */ b a;

    public /* synthetic */ krf(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.x760
    public rwo getEventReporter() {
        return this.a.c;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        b bVar = this.a;
        bVar.O.l(kl41.a);
        bVar.M.l(new in8((PaymentKitError) obj));
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        b bVar = this.a;
        bVar.O.l(kl41.a);
        bVar.M.l(new ln8((BoundCard) obj));
    }
}
