package com.ybsdk.feature.transfer.version2.internal.screens.result;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/result/Required3dsPageState;", "", "<init>", "(Ljava/lang/String;I)V", "PAGE_FAILURE", "PAGE_SUCCESS", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Required3dsPageState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Required3dsPageState[] $VALUES;
    public static final Required3dsPageState PAGE_FAILURE = new Required3dsPageState("PAGE_FAILURE", 0);
    public static final Required3dsPageState PAGE_SUCCESS = new Required3dsPageState("PAGE_SUCCESS", 1);

    private static final /* synthetic */ Required3dsPageState[] $values() {
        return new Required3dsPageState[]{PAGE_FAILURE, PAGE_SUCCESS};
    }

    static {
        Required3dsPageState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Required3dsPageState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Required3dsPageState valueOf(String str) {
        return (Required3dsPageState) Enum.valueOf(Required3dsPageState.class, str);
    }

    public static Required3dsPageState[] values() {
        return (Required3dsPageState[]) $VALUES.clone();
    }
}
