package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class inz0 extends f5o0 {
    public final /* synthetic */ f5o0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inz0(f5o0.a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = aVar;
    }

    @Override // xsna.f5o0
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.d.a.accept(bVar, taskCompletionSource);
    }
}
