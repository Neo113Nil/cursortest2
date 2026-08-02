package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class jvf implements x760, ryj0 {
    public final /* synthetic */ kvf a;

    public /* synthetic */ jvf(kvf kvfVar) {
        this.a = kvfVar;
    }

    @Override // defpackage.x760
    public rwo getEventReporter() {
        return this.a.b;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        kvf kvfVar = this.a;
        kvfVar.N.m(kl41.a);
        kvfVar.L.m(new in8((PaymentKitError) obj));
        new Handler(Looper.getMainLooper()).postDelayed(new uz(24, kvfVar), 1500L);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        kvf kvfVar = this.a;
        kvfVar.L.m(new ln8((BoundCard) obj));
        kvfVar.N.m(kl41.a);
        new Handler(Looper.getMainLooper()).postDelayed(new uz(24, kvfVar), 1500L);
    }
}
