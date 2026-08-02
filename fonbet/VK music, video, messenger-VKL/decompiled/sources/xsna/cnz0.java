package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.grf0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class cnz0 extends eqf0 {
    public final /* synthetic */ grf0.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnz0(grf0.a aVar, ehz ehzVar, Feature[] featureArr, boolean z, int i) {
        super(ehzVar, featureArr, z, i);
        this.e = aVar;
    }

    @Override // xsna.eqf0
    public final void c(a.b bVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.e.a.accept(bVar, taskCompletionSource);
    }
}
