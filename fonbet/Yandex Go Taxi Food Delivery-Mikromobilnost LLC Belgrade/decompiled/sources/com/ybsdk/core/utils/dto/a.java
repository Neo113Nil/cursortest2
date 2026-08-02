package com.ybsdk.core.utils.dto;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OldDataWithStatusResponse.Status.values().length];
        try {
            iArr[OldDataWithStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OldDataWithStatusResponse.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DataWithStatusResponse.Status.values().length];
        try {
            iArr2[DataWithStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DataWithStatusResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DataWithStatusResponse.Status.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
