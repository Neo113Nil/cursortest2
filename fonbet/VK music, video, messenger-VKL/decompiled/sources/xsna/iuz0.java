package xsna;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.IsReadyToPayRequest;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class iuz0 extends f5o0<com.google.android.gms.internal.wallet.zzv, Boolean> {
    public final /* synthetic */ IsReadyToPayRequest d;

    public iuz0(IsReadyToPayRequest isReadyToPayRequest) {
        this.d = isReadyToPayRequest;
    }

    @Override // xsna.f5o0
    public final /* synthetic */ void b(com.google.android.gms.internal.wallet.zzv zzvVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzvVar.zza(this.d, taskCompletionSource);
    }
}
