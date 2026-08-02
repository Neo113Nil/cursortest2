package com.yandex.go.loyalty.impl.selector.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/domain/model/LoyaltyProgramState;", "", "ENABLED", "DISABLED", "NEED_ACTIVATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgramState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoyaltyProgramState[] $VALUES;
    public static final LoyaltyProgramState DISABLED;
    public static final LoyaltyProgramState ENABLED;
    public static final LoyaltyProgramState NEED_ACTIVATION;

    static {
        LoyaltyProgramState loyaltyProgramState = new LoyaltyProgramState("ENABLED", 0);
        ENABLED = loyaltyProgramState;
        LoyaltyProgramState loyaltyProgramState2 = new LoyaltyProgramState("DISABLED", 1);
        DISABLED = loyaltyProgramState2;
        LoyaltyProgramState loyaltyProgramState3 = new LoyaltyProgramState("NEED_ACTIVATION", 2);
        NEED_ACTIVATION = loyaltyProgramState3;
        LoyaltyProgramState[] loyaltyProgramStateArr = {loyaltyProgramState, loyaltyProgramState2, loyaltyProgramState3};
        $VALUES = loyaltyProgramStateArr;
        $ENTRIES = a.a(loyaltyProgramStateArr);
    }

    public static LoyaltyProgramState valueOf(String str) {
        return (LoyaltyProgramState) Enum.valueOf(LoyaltyProgramState.class, str);
    }

    public static LoyaltyProgramState[] values() {
        return (LoyaltyProgramState[]) $VALUES.clone();
    }
}
