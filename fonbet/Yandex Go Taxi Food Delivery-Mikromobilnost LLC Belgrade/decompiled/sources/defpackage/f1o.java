package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import android.util.Log;

/* loaded from: classes10.dex */
public final class f1o implements e1o {
    public final IEngagementSignalsCallback a;

    public f1o(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.a = iEngagementSignalsCallback;
    }

    @Override // defpackage.e1o
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.a.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // defpackage.e1o
    public final void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.a.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // defpackage.e1o
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.a.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
