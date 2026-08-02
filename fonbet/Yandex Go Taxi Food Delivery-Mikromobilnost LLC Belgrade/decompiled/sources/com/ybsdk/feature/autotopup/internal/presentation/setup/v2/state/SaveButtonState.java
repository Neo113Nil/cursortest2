package com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/state/SaveButtonState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "LOADING", "SETTINGS_NOT_CHANGED", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SaveButtonState[] $VALUES;
    public static final SaveButtonState DEFAULT = new SaveButtonState("DEFAULT", 0, "default");
    public static final SaveButtonState LOADING = new SaveButtonState("LOADING", 1, ResultType.RESULT_TYPE_LOADING);
    public static final SaveButtonState SETTINGS_NOT_CHANGED = new SaveButtonState("SETTINGS_NOT_CHANGED", 2, "settings_not_changed");
    private final String value;

    private static final /* synthetic */ SaveButtonState[] $values() {
        return new SaveButtonState[]{DEFAULT, LOADING, SETTINGS_NOT_CHANGED};
    }

    static {
        SaveButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SaveButtonState(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SaveButtonState valueOf(String str) {
        return (SaveButtonState) Enum.valueOf(SaveButtonState.class, str);
    }

    public static SaveButtonState[] values() {
        return (SaveButtonState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
