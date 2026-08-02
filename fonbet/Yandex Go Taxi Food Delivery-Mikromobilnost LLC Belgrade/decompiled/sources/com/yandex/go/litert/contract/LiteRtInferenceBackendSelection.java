package com.yandex.go.litert.contract;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/litert/contract/LiteRtInferenceBackendSelection;", "", "AUTO", "CPU", "GPU", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LiteRtInferenceBackendSelection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LiteRtInferenceBackendSelection[] $VALUES;
    public static final LiteRtInferenceBackendSelection AUTO;
    public static final LiteRtInferenceBackendSelection CPU;
    public static final LiteRtInferenceBackendSelection GPU;

    static {
        LiteRtInferenceBackendSelection liteRtInferenceBackendSelection = new LiteRtInferenceBackendSelection("AUTO", 0);
        AUTO = liteRtInferenceBackendSelection;
        LiteRtInferenceBackendSelection liteRtInferenceBackendSelection2 = new LiteRtInferenceBackendSelection("CPU", 1);
        CPU = liteRtInferenceBackendSelection2;
        LiteRtInferenceBackendSelection liteRtInferenceBackendSelection3 = new LiteRtInferenceBackendSelection("GPU", 2);
        GPU = liteRtInferenceBackendSelection3;
        LiteRtInferenceBackendSelection[] liteRtInferenceBackendSelectionArr = {liteRtInferenceBackendSelection, liteRtInferenceBackendSelection2, liteRtInferenceBackendSelection3};
        $VALUES = liteRtInferenceBackendSelectionArr;
        $ENTRIES = a.a(liteRtInferenceBackendSelectionArr);
    }

    public static LiteRtInferenceBackendSelection valueOf(String str) {
        return (LiteRtInferenceBackendSelection) Enum.valueOf(LiteRtInferenceBackendSelection.class, str);
    }

    public static LiteRtInferenceBackendSelection[] values() {
        return (LiteRtInferenceBackendSelection[]) $VALUES.clone();
    }
}
