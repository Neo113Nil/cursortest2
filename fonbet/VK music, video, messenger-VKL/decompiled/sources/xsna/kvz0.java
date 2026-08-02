package xsna;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class kvz0 extends f5o0<com.google.android.gms.internal.wallet.zzv, PaymentData> {
    public final /* synthetic */ PaymentDataRequest d;

    public kvz0(PaymentDataRequest paymentDataRequest) {
        this.d = paymentDataRequest;
    }

    @Override // xsna.f5o0
    public final /* synthetic */ void b(com.google.android.gms.internal.wallet.zzv zzvVar, TaskCompletionSource<PaymentData> taskCompletionSource) throws RemoteException {
        zzvVar.zza(this.d, taskCompletionSource);
    }
}
