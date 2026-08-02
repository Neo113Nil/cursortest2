package com.yandex.passport.data.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/data/models/LiteDataNecessityState;", "", "", "networkValue", "Ljava/lang/String;", "Companion", "com/yandex/passport/data/models/j", "NOT_USED", "OPTIONAL", "REQUIRED", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LiteDataNecessityState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LiteDataNecessityState[] $VALUES;
    public static final j Companion;
    public static final LiteDataNecessityState NOT_USED;
    public static final LiteDataNecessityState OPTIONAL;
    public static final LiteDataNecessityState REQUIRED;
    private final String networkValue;

    static {
        LiteDataNecessityState liteDataNecessityState = new LiteDataNecessityState("NOT_USED", 0, "not_used");
        NOT_USED = liteDataNecessityState;
        LiteDataNecessityState liteDataNecessityState2 = new LiteDataNecessityState("OPTIONAL", 1, "optional");
        OPTIONAL = liteDataNecessityState2;
        LiteDataNecessityState liteDataNecessityState3 = new LiteDataNecessityState("REQUIRED", 2, "required");
        REQUIRED = liteDataNecessityState3;
        LiteDataNecessityState[] liteDataNecessityStateArr = {liteDataNecessityState, liteDataNecessityState2, liteDataNecessityState3};
        $VALUES = liteDataNecessityStateArr;
        $ENTRIES = kotlin.enums.a.a(liteDataNecessityStateArr);
        Companion = new j();
    }

    public LiteDataNecessityState(String str, int i, String str2) {
        this.networkValue = str2;
    }

    public static LiteDataNecessityState valueOf(String str) {
        return (LiteDataNecessityState) Enum.valueOf(LiteDataNecessityState.class, str);
    }

    public static LiteDataNecessityState[] values() {
        return (LiteDataNecessityState[]) $VALUES.clone();
    }
}
