package com.yandex.payment.sdk.nfcscanner.tools.ownimpl.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/payment/sdk/nfcscanner/tools/ownimpl/models/INfcTag$Class", "", "Lcom/yandex/payment/sdk/nfcscanner/tools/ownimpl/models/INfcTag$Class;", "UNIVERSAL", "APPLICATION", "CONTEXT_SPECIFIC", "PRIVATE", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class INfcTag$Class {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ INfcTag$Class[] $VALUES;
    public static final INfcTag$Class APPLICATION;
    public static final INfcTag$Class CONTEXT_SPECIFIC;
    public static final INfcTag$Class PRIVATE;
    public static final INfcTag$Class UNIVERSAL;

    static {
        INfcTag$Class iNfcTag$Class = new INfcTag$Class("UNIVERSAL", 0);
        UNIVERSAL = iNfcTag$Class;
        INfcTag$Class iNfcTag$Class2 = new INfcTag$Class("APPLICATION", 1);
        APPLICATION = iNfcTag$Class2;
        INfcTag$Class iNfcTag$Class3 = new INfcTag$Class("CONTEXT_SPECIFIC", 2);
        CONTEXT_SPECIFIC = iNfcTag$Class3;
        INfcTag$Class iNfcTag$Class4 = new INfcTag$Class("PRIVATE", 3);
        PRIVATE = iNfcTag$Class4;
        INfcTag$Class[] iNfcTag$ClassArr = {iNfcTag$Class, iNfcTag$Class2, iNfcTag$Class3, iNfcTag$Class4};
        $VALUES = iNfcTag$ClassArr;
        $ENTRIES = a.a(iNfcTag$ClassArr);
    }

    public static INfcTag$Class valueOf(String str) {
        return (INfcTag$Class) Enum.valueOf(INfcTag$Class.class, str);
    }

    public static INfcTag$Class[] values() {
        return (INfcTag$Class[]) $VALUES.clone();
    }
}
