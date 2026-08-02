package ru.ok.android.externcalls.sdk.dev;

import xsna.zcl;

/* compiled from: CallsSDKException.kt */
/* loaded from: classes9.dex */
public final class CallsSDKException extends RuntimeException {
    public CallsSDKException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ CallsSDKException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
