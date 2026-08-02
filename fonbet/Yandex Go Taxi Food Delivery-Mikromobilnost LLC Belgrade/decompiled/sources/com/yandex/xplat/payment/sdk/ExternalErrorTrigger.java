package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ExternalErrorTrigger;", "", "internal_sdk", "mobile_backend", "diehard", "nspk", "passport", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalErrorTrigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExternalErrorTrigger[] $VALUES;
    public static final ExternalErrorTrigger diehard;
    public static final ExternalErrorTrigger internal_sdk;
    public static final ExternalErrorTrigger mobile_backend;
    public static final ExternalErrorTrigger nspk;
    public static final ExternalErrorTrigger passport;

    static {
        ExternalErrorTrigger externalErrorTrigger = new ExternalErrorTrigger("internal_sdk", 0);
        internal_sdk = externalErrorTrigger;
        ExternalErrorTrigger externalErrorTrigger2 = new ExternalErrorTrigger("mobile_backend", 1);
        mobile_backend = externalErrorTrigger2;
        ExternalErrorTrigger externalErrorTrigger3 = new ExternalErrorTrigger("diehard", 2);
        diehard = externalErrorTrigger3;
        ExternalErrorTrigger externalErrorTrigger4 = new ExternalErrorTrigger("nspk", 3);
        nspk = externalErrorTrigger4;
        ExternalErrorTrigger externalErrorTrigger5 = new ExternalErrorTrigger("passport", 4);
        passport = externalErrorTrigger5;
        ExternalErrorTrigger[] externalErrorTriggerArr = {externalErrorTrigger, externalErrorTrigger2, externalErrorTrigger3, externalErrorTrigger4, externalErrorTrigger5};
        $VALUES = externalErrorTriggerArr;
        $ENTRIES = a.a(externalErrorTriggerArr);
    }

    public static ExternalErrorTrigger valueOf(String str) {
        return (ExternalErrorTrigger) Enum.valueOf(ExternalErrorTrigger.class, str);
    }

    public static ExternalErrorTrigger[] values() {
        return (ExternalErrorTrigger[]) $VALUES.clone();
    }
}
