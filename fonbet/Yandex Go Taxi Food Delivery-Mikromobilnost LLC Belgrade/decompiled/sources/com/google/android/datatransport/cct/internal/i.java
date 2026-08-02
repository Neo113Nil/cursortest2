package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* loaded from: classes.dex */
public final class i extends NetworkConnectionInfo {
    public final NetworkConnectionInfo.NetworkType a;
    public final NetworkConnectionInfo.MobileSubtype b;

    public i(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.a = networkType;
        this.b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.MobileSubtype a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final NetworkConnectionInfo.NetworkType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.a;
        if (networkType == null) {
            if (networkConnectionInfo.b() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.b())) {
            return false;
        }
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return mobileSubtype == null ? networkConnectionInfo.a() == null : mobileSubtype.equals(networkConnectionInfo.a());
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.a;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return hashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
