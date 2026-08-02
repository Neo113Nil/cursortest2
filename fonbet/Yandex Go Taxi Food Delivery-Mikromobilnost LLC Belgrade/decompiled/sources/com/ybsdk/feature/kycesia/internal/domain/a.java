package com.ybsdk.feature.kycesia.internal.domain;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EsiaResultInteractor$BrowserResultAction.values().length];
        try {
            iArr[EsiaResultInteractor$BrowserResultAction.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EsiaResultInteractor$BrowserResultAction.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EsiaResultInteractor$BrowserResultAction.KYC_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EsiaResultInteractor$BrowserResultAction.OPEN_SUPPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EsiaResultInteractor$BrowserResultAction.SIMPLIFY_IDENTIFICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
