package com.yandex.passport.internal.network;

import com.yandex.passport.data.network.core.DataEvents;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataEvents.values().length];
        try {
            iArr[DataEvents.DeviceAuthorizationCommit.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataEvents.DeviceAuthorizationSubmit.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataEvents.SendAuthToTrack.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataEvents.GetDeviceCode.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
