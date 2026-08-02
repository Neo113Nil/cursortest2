package com.ybsdk.screens.upgrade.domain.mapper;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/screens/upgrade/domain/mapper/SecondDocumentHelperTextMapper$SecondDocumentDisplayType", "", "Lcom/ybsdk/screens/upgrade/domain/mapper/SecondDocumentHelperTextMapper$SecondDocumentDisplayType;", "<init>", "(Ljava/lang/String;I)V", "SUMMARY", "EDIT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondDocumentHelperTextMapper$SecondDocumentDisplayType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SecondDocumentHelperTextMapper$SecondDocumentDisplayType[] $VALUES;
    public static final SecondDocumentHelperTextMapper$SecondDocumentDisplayType SUMMARY = new SecondDocumentHelperTextMapper$SecondDocumentDisplayType("SUMMARY", 0);
    public static final SecondDocumentHelperTextMapper$SecondDocumentDisplayType EDIT = new SecondDocumentHelperTextMapper$SecondDocumentDisplayType("EDIT", 1);

    private static final /* synthetic */ SecondDocumentHelperTextMapper$SecondDocumentDisplayType[] $values() {
        return new SecondDocumentHelperTextMapper$SecondDocumentDisplayType[]{SUMMARY, EDIT};
    }

    static {
        SecondDocumentHelperTextMapper$SecondDocumentDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SecondDocumentHelperTextMapper$SecondDocumentDisplayType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SecondDocumentHelperTextMapper$SecondDocumentDisplayType valueOf(String str) {
        return (SecondDocumentHelperTextMapper$SecondDocumentDisplayType) Enum.valueOf(SecondDocumentHelperTextMapper$SecondDocumentDisplayType.class, str);
    }

    public static SecondDocumentHelperTextMapper$SecondDocumentDisplayType[] values() {
        return (SecondDocumentHelperTextMapper$SecondDocumentDisplayType[]) $VALUES.clone();
    }
}
