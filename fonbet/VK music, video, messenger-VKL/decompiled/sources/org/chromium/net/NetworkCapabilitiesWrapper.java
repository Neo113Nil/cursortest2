package org.chromium.net;

import android.net.NetworkCapabilities;

/* loaded from: classes11.dex */
class NetworkCapabilitiesWrapper {
    private final long mNetworkCapabilities;
    private final long mTransportTypes;
    private final NetworkCapabilities mWrapped;

    public NetworkCapabilitiesWrapper(int[] iArr, int[] iArr2) {
        this.mNetworkCapabilities = packIntoLong(iArr);
        this.mTransportTypes = packIntoLong(iArr2);
        this.mWrapped = null;
    }

    private static long packIntoLong(int[] iArr) {
        long j = 0;
        for (int i : iArr) {
            j |= 1 << i;
        }
        return j;
    }

    public boolean hasCapability(int i) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        return networkCapabilities != null ? networkCapabilities.hasCapability(i) : i >= 0 && i < 64 && (this.mNetworkCapabilities & (1 << i)) != 0;
    }

    public boolean hasTransport(int i) {
        NetworkCapabilities networkCapabilities = this.mWrapped;
        return networkCapabilities != null ? networkCapabilities.hasTransport(i) : i >= 0 && i < 64 && (this.mTransportTypes & ((long) (1 << i))) != 0;
    }

    public NetworkCapabilitiesWrapper(NetworkCapabilities networkCapabilities) {
        this.mWrapped = networkCapabilities;
        this.mNetworkCapabilities = -1L;
        this.mTransportTypes = -1L;
    }
}
