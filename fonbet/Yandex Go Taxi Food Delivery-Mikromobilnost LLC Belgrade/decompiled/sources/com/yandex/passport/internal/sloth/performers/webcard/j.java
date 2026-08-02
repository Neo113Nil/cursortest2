package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.common.web.BridgeMethod;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BridgeMethod.values().length];
        try {
            iArr[BridgeMethod.BeginChangePasswordFlow.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BridgeMethod.SetPopupSize.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BridgeMethod.GetPhoneRegionCode.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BridgeMethod.RequestSavedExperiments.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BridgeMethod.GetCustomEulaStrings.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BridgeMethod.RequestLoginCredentials.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BridgeMethod.WebAuthNAvailability.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
