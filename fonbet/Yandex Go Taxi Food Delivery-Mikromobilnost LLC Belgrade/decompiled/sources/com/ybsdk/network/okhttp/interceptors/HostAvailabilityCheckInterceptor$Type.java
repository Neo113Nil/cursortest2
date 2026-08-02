package com.ybsdk.network.okhttp.interceptors;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/ybsdk/network/okhttp/interceptors/HostAvailabilityCheckInterceptor$Type", "", "Lcom/ybsdk/network/okhttp/interceptors/HostAvailabilityCheckInterceptor$Type;", "REGULAR", "PCI_DSS", "UZ", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class HostAvailabilityCheckInterceptor$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HostAvailabilityCheckInterceptor$Type[] $VALUES;
    public static final HostAvailabilityCheckInterceptor$Type PCI_DSS;
    public static final HostAvailabilityCheckInterceptor$Type REGULAR;
    public static final HostAvailabilityCheckInterceptor$Type UZ;

    static {
        HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type = new HostAvailabilityCheckInterceptor$Type("REGULAR", 0);
        REGULAR = hostAvailabilityCheckInterceptor$Type;
        HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type2 = new HostAvailabilityCheckInterceptor$Type("PCI_DSS", 1);
        PCI_DSS = hostAvailabilityCheckInterceptor$Type2;
        HostAvailabilityCheckInterceptor$Type hostAvailabilityCheckInterceptor$Type3 = new HostAvailabilityCheckInterceptor$Type("UZ", 2);
        UZ = hostAvailabilityCheckInterceptor$Type3;
        HostAvailabilityCheckInterceptor$Type[] hostAvailabilityCheckInterceptor$TypeArr = {hostAvailabilityCheckInterceptor$Type, hostAvailabilityCheckInterceptor$Type2, hostAvailabilityCheckInterceptor$Type3};
        $VALUES = hostAvailabilityCheckInterceptor$TypeArr;
        $ENTRIES = kotlin.enums.a.a(hostAvailabilityCheckInterceptor$TypeArr);
    }

    public static HostAvailabilityCheckInterceptor$Type valueOf(String str) {
        return (HostAvailabilityCheckInterceptor$Type) Enum.valueOf(HostAvailabilityCheckInterceptor$Type.class, str);
    }

    public static HostAvailabilityCheckInterceptor$Type[] values() {
        return (HostAvailabilityCheckInterceptor$Type[]) $VALUES.clone();
    }
}
