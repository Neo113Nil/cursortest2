package com.yandex.go.loyalty.impl.selector.domain;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/domain/LoyaltySelectorLoadingState;", "", "FIRST_LOADING", "ACCEPT_PROGRAM_LOADING", "GET_DATA_FOR_AUTH", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltySelectorLoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoyaltySelectorLoadingState[] $VALUES;
    public static final LoyaltySelectorLoadingState ACCEPT_PROGRAM_LOADING;
    public static final LoyaltySelectorLoadingState FIRST_LOADING;
    public static final LoyaltySelectorLoadingState GET_DATA_FOR_AUTH;
    public static final LoyaltySelectorLoadingState NONE;

    static {
        LoyaltySelectorLoadingState loyaltySelectorLoadingState = new LoyaltySelectorLoadingState("FIRST_LOADING", 0);
        FIRST_LOADING = loyaltySelectorLoadingState;
        LoyaltySelectorLoadingState loyaltySelectorLoadingState2 = new LoyaltySelectorLoadingState("ACCEPT_PROGRAM_LOADING", 1);
        ACCEPT_PROGRAM_LOADING = loyaltySelectorLoadingState2;
        LoyaltySelectorLoadingState loyaltySelectorLoadingState3 = new LoyaltySelectorLoadingState("GET_DATA_FOR_AUTH", 2);
        GET_DATA_FOR_AUTH = loyaltySelectorLoadingState3;
        LoyaltySelectorLoadingState loyaltySelectorLoadingState4 = new LoyaltySelectorLoadingState(JCP.RAW_PREFIX, 3);
        NONE = loyaltySelectorLoadingState4;
        LoyaltySelectorLoadingState[] loyaltySelectorLoadingStateArr = {loyaltySelectorLoadingState, loyaltySelectorLoadingState2, loyaltySelectorLoadingState3, loyaltySelectorLoadingState4};
        $VALUES = loyaltySelectorLoadingStateArr;
        $ENTRIES = kotlin.enums.a.a(loyaltySelectorLoadingStateArr);
    }

    public static LoyaltySelectorLoadingState valueOf(String str) {
        return (LoyaltySelectorLoadingState) Enum.valueOf(LoyaltySelectorLoadingState.class, str);
    }

    public static LoyaltySelectorLoadingState[] values() {
        return (LoyaltySelectorLoadingState[]) $VALUES.clone();
    }
}
