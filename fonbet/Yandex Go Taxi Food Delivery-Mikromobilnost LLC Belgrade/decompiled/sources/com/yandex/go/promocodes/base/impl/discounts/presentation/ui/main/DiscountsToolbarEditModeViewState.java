package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/main/DiscountsToolbarEditModeViewState;", "", "ENABLED", "DISABLED", "HIDDEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsToolbarEditModeViewState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsToolbarEditModeViewState[] $VALUES;
    public static final DiscountsToolbarEditModeViewState DISABLED;
    public static final DiscountsToolbarEditModeViewState ENABLED;
    public static final DiscountsToolbarEditModeViewState HIDDEN;

    static {
        DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState = new DiscountsToolbarEditModeViewState("ENABLED", 0);
        ENABLED = discountsToolbarEditModeViewState;
        DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState2 = new DiscountsToolbarEditModeViewState("DISABLED", 1);
        DISABLED = discountsToolbarEditModeViewState2;
        DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState3 = new DiscountsToolbarEditModeViewState("HIDDEN", 2);
        HIDDEN = discountsToolbarEditModeViewState3;
        DiscountsToolbarEditModeViewState[] discountsToolbarEditModeViewStateArr = {discountsToolbarEditModeViewState, discountsToolbarEditModeViewState2, discountsToolbarEditModeViewState3};
        $VALUES = discountsToolbarEditModeViewStateArr;
        $ENTRIES = kotlin.enums.a.a(discountsToolbarEditModeViewStateArr);
    }

    public static DiscountsToolbarEditModeViewState valueOf(String str) {
        return (DiscountsToolbarEditModeViewState) Enum.valueOf(DiscountsToolbarEditModeViewState.class, str);
    }

    public static DiscountsToolbarEditModeViewState[] values() {
        return (DiscountsToolbarEditModeViewState[]) $VALUES.clone();
    }
}
