package com.ybsdk.core.utils.dto;

import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SecondAuthorizationResponse.RequestStatus.values().length];
        try {
            iArr[SecondAuthorizationResponse.RequestStatus.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecondAuthorizationResponse.RequestStatus.AUTHORIZATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecondAuthorizationResponse.RequestStatus.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
