package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainFragment$Companion$PagerScrollType", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainFragment$Companion$PagerScrollType;", "<init>", "(Ljava/lang/String;I)V", "INSTANT", "SMOOTH", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferMainFragment$Companion$PagerScrollType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferMainFragment$Companion$PagerScrollType[] $VALUES;
    public static final TransferMainFragment$Companion$PagerScrollType INSTANT = new TransferMainFragment$Companion$PagerScrollType("INSTANT", 0);
    public static final TransferMainFragment$Companion$PagerScrollType SMOOTH = new TransferMainFragment$Companion$PagerScrollType("SMOOTH", 1);

    private static final /* synthetic */ TransferMainFragment$Companion$PagerScrollType[] $values() {
        return new TransferMainFragment$Companion$PagerScrollType[]{INSTANT, SMOOTH};
    }

    static {
        TransferMainFragment$Companion$PagerScrollType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferMainFragment$Companion$PagerScrollType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferMainFragment$Companion$PagerScrollType valueOf(String str) {
        return (TransferMainFragment$Companion$PagerScrollType) Enum.valueOf(TransferMainFragment$Companion$PagerScrollType.class, str);
    }

    public static TransferMainFragment$Companion$PagerScrollType[] values() {
        return (TransferMainFragment$Companion$PagerScrollType[]) $VALUES.clone();
    }
}
