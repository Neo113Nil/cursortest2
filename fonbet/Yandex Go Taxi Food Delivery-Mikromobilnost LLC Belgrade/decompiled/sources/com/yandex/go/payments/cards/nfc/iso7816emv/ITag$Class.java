package com.yandex.go.payments.cards.nfc.iso7816emv;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/payments/cards/nfc/iso7816emv/ITag$Class", "", "Lcom/yandex/go/payments/cards/nfc/iso7816emv/ITag$Class;", "UNIVERSAL", "APPLICATION", "CONTEXT_SPECIFIC", "PRIVATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ITag$Class {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ITag$Class[] $VALUES;
    public static final ITag$Class APPLICATION;
    public static final ITag$Class CONTEXT_SPECIFIC;
    public static final ITag$Class PRIVATE;
    public static final ITag$Class UNIVERSAL;

    static {
        ITag$Class iTag$Class = new ITag$Class("UNIVERSAL", 0);
        UNIVERSAL = iTag$Class;
        ITag$Class iTag$Class2 = new ITag$Class("APPLICATION", 1);
        APPLICATION = iTag$Class2;
        ITag$Class iTag$Class3 = new ITag$Class("CONTEXT_SPECIFIC", 2);
        CONTEXT_SPECIFIC = iTag$Class3;
        ITag$Class iTag$Class4 = new ITag$Class("PRIVATE", 3);
        PRIVATE = iTag$Class4;
        ITag$Class[] iTag$ClassArr = {iTag$Class, iTag$Class2, iTag$Class3, iTag$Class4};
        $VALUES = iTag$ClassArr;
        $ENTRIES = a.a(iTag$ClassArr);
    }

    public static ITag$Class valueOf(String str) {
        return (ITag$Class) Enum.valueOf(ITag$Class.class, str);
    }

    public static ITag$Class[] values() {
        return (ITag$Class[]) $VALUES.clone();
    }
}
