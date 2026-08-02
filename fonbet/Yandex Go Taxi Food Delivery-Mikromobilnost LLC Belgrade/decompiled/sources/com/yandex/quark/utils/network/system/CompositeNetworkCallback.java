package com.yandex.quark.utils.network.system;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.ko50;
import defpackage.mp50;
import defpackage.np50;
import defpackage.op50;
import defpackage.pp50;
import defpackage.qp50;
import defpackage.w511;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/quark/utils/network/system/CompositeNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "", "initialIsNetworkAvailable", "<init>", "(Z)V", "Lqp50;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "handleEvent", "(Lqp50;)V", "isNetworkAvailable", "handleNetworkAvailabilityChange", "Lko50;", "listener", "addListener", "(Lko50;)Z", "removeListener", "onUnavailable", "()V", "Landroid/net/Network;", "network", "onLost", "(Landroid/net/Network;)V", "onAvailable", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "Z", "Lcom/yandex/quark/utils/network/system/NetworkState;", ClidProvider.STATE, "Lcom/yandex/quark/utils/network/system/NetworkState;", "", "listeners", "Ljava/util/Set;", "", "getListenersCount", "()I", "listenersCount", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeNetworkCallback extends ConnectivityManager.NetworkCallback {
    private boolean isNetworkAvailable;
    private final Set<ko50> listeners;
    private volatile NetworkState state;

    public CompositeNetworkCallback(boolean z) {
        this.isNetworkAvailable = z;
        this.state = z ? NetworkState.NETWORK_VALIDATED : NetworkState.NETWORK_UNAVAILABLE;
        this.listeners = new LinkedHashSet();
    }

    private final void handleEvent(qp50 event) {
        if ((event instanceof pp50) || (event instanceof op50)) {
            this.state = NetworkState.NETWORK_UNAVAILABLE;
        } else if (event instanceof mp50) {
            this.state = NetworkState.NETWORK_AVAILABLE;
        } else {
            if (!(event instanceof np50)) {
                w511.b();
                return;
            }
            this.state = ((np50) event).a ? NetworkState.NETWORK_VALIDATED : NetworkState.NETWORK_AVAILABLE;
        }
        int i = a.a[this.state.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            z = false;
        } else if (i != 3) {
            w511.b();
            return;
        }
        handleNetworkAvailabilityChange(z);
    }

    private final synchronized void handleNetworkAvailabilityChange(boolean isNetworkAvailable) {
        try {
            if (isNetworkAvailable != this.isNetworkAvailable) {
                this.isNetworkAvailable = isNetworkAvailable;
                Iterator<ko50> it = this.listeners.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }

    public final synchronized boolean addListener(ko50 listener) {
        boolean z;
        if (this.listeners.add(listener)) {
            listener.a();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized int getListenersCount() {
        return this.listeners.size();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        handleEvent(mp50.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        handleEvent(new np50(networkCapabilities.hasCapability(16)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        handleEvent(op50.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        handleEvent(pp50.a);
    }

    public final synchronized boolean removeListener(ko50 listener) {
        return this.listeners.remove(listener);
    }
}
