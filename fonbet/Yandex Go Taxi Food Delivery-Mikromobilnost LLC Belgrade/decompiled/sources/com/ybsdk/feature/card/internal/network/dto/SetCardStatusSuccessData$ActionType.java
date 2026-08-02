package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType", "", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "<init>", "(Ljava/lang/String;I)V", "DEEPLINK", "DIVKIT", "SET_STATE", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SetCardStatusSuccessData$ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SetCardStatusSuccessData$ActionType[] $VALUES;

    @Json(name = "DEEPLINK")
    public static final SetCardStatusSuccessData$ActionType DEEPLINK = new SetCardStatusSuccessData$ActionType("DEEPLINK", 0);

    @Json(name = "DIVKIT")
    public static final SetCardStatusSuccessData$ActionType DIVKIT = new SetCardStatusSuccessData$ActionType("DIVKIT", 1);

    @Json(name = "SET_STATE")
    public static final SetCardStatusSuccessData$ActionType SET_STATE = new SetCardStatusSuccessData$ActionType("SET_STATE", 2);

    private static final /* synthetic */ SetCardStatusSuccessData$ActionType[] $values() {
        return new SetCardStatusSuccessData$ActionType[]{DEEPLINK, DIVKIT, SET_STATE};
    }

    static {
        SetCardStatusSuccessData$ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SetCardStatusSuccessData$ActionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SetCardStatusSuccessData$ActionType valueOf(String str) {
        return (SetCardStatusSuccessData$ActionType) Enum.valueOf(SetCardStatusSuccessData$ActionType.class, str);
    }

    public static SetCardStatusSuccessData$ActionType[] values() {
        return (SetCardStatusSuccessData$ActionType[]) $VALUES.clone();
    }
}
