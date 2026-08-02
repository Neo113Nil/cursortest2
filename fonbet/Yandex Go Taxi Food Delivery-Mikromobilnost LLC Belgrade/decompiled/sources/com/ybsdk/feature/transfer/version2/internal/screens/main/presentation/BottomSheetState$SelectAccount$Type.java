package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/main/presentation/BottomSheetState$SelectAccount$Type", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/BottomSheetState$SelectAccount$Type;", "<init>", "(Ljava/lang/String;I)V", "SUBJECT", "MAIN", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetState$SelectAccount$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomSheetState$SelectAccount$Type[] $VALUES;
    public static final BottomSheetState$SelectAccount$Type SUBJECT = new BottomSheetState$SelectAccount$Type("SUBJECT", 0);
    public static final BottomSheetState$SelectAccount$Type MAIN = new BottomSheetState$SelectAccount$Type("MAIN", 1);

    private static final /* synthetic */ BottomSheetState$SelectAccount$Type[] $values() {
        return new BottomSheetState$SelectAccount$Type[]{SUBJECT, MAIN};
    }

    static {
        BottomSheetState$SelectAccount$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BottomSheetState$SelectAccount$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetState$SelectAccount$Type valueOf(String str) {
        return (BottomSheetState$SelectAccount$Type) Enum.valueOf(BottomSheetState$SelectAccount$Type.class, str);
    }

    public static BottomSheetState$SelectAccount$Type[] values() {
        return (BottomSheetState$SelectAccount$Type[]) $VALUES.clone();
    }
}
