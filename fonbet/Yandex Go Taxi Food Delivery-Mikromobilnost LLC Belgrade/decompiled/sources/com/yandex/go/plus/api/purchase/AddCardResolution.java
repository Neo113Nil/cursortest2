package com.yandex.go.plus.api.purchase;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/plus/api/purchase/AddCardResolution;", "", "SUCCESS", "FAILED", "CANCEL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddCardResolution[] $VALUES;
    public static final AddCardResolution CANCEL;
    public static final AddCardResolution FAILED;
    public static final AddCardResolution SUCCESS;

    static {
        AddCardResolution addCardResolution = new AddCardResolution("SUCCESS", 0);
        SUCCESS = addCardResolution;
        AddCardResolution addCardResolution2 = new AddCardResolution("FAILED", 1);
        FAILED = addCardResolution2;
        AddCardResolution addCardResolution3 = new AddCardResolution("CANCEL", 2);
        CANCEL = addCardResolution3;
        AddCardResolution[] addCardResolutionArr = {addCardResolution, addCardResolution2, addCardResolution3};
        $VALUES = addCardResolutionArr;
        $ENTRIES = a.a(addCardResolutionArr);
    }

    public static AddCardResolution valueOf(String str) {
        return (AddCardResolution) Enum.valueOf(AddCardResolution.class, str);
    }

    public static AddCardResolution[] values() {
        return (AddCardResolution[]) $VALUES.clone();
    }
}
