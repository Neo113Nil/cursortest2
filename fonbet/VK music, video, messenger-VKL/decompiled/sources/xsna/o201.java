package xsna;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class o201 extends t201 {
    @Override // xsna.t201, xsna.f401
    public final void Z(int i, Bundle bundle) throws RemoteException {
        super.Z(i, bundle);
        this.a.trySetResult(Integer.valueOf(i));
    }
}
