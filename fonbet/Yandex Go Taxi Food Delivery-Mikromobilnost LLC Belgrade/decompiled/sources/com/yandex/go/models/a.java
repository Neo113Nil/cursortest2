package com.yandex.go.models;

import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.models.SummaryRedirectActionModel;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Action$SummaryRedirect.State.values().length];
        try {
            iArr[Action$SummaryRedirect.State.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action$SummaryRedirect.State.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action$SummaryRedirect.State.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SummaryRedirectActionModel.State.values().length];
        try {
            iArr2[SummaryRedirectActionModel.State.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SummaryRedirectActionModel.State.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SummaryRedirectActionModel.State.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
