package com.ybsdk.feature.pdf.internal.network.dto;

import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportStatusResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GenerateReportStatusResponse.Status.values().length];
        try {
            iArr[GenerateReportStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GenerateReportStatusResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
