package androidx.media3.exoplayer.scheduler;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public final class RequirementsWatcher$NetworkCallback extends ConnectivityManager.NetworkCallback {
    private boolean networkValidated;
    private boolean receivedCapabilitiesChange;
    final /* synthetic */ b this$0;

    private RequirementsWatcher$NetworkCallback(b bVar) {
        this.this$0 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postCheckRequirements$0() {
        b bVar = this.this$0;
        if (bVar.g != null) {
            bVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$postRecheckNotMetNetworkRequirements$1() {
        b bVar = this.this$0;
        if (bVar.g == null || (bVar.f & 3) == 0) {
            return;
        }
        bVar.a();
    }

    private void postCheckRequirements() {
        this.this$0.d.post(new a(this, 0));
    }

    private void postRecheckNotMetNetworkRequirements() {
        this.this$0.d.post(new a(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        postCheckRequirements();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        postRecheckNotMetNetworkRequirements();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        if (this.receivedCapabilitiesChange && this.networkValidated == hasCapability) {
            if (hasCapability) {
                postRecheckNotMetNetworkRequirements();
            }
        } else {
            this.receivedCapabilitiesChange = true;
            this.networkValidated = hasCapability;
            postCheckRequirements();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        postCheckRequirements();
    }
}
