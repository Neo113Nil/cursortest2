package com.ybsdk.network.okhttp.interceptors;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HostAvailabilityCheckInterceptor$Type.values().length];
        try {
            iArr[HostAvailabilityCheckInterceptor$Type.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HostAvailabilityCheckInterceptor$Type.PCI_DSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HostAvailabilityCheckInterceptor$Type.UZ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
