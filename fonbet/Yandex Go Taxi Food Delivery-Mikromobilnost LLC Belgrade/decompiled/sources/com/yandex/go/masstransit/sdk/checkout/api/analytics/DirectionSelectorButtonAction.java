package com.yandex.go.masstransit.sdk.checkout.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/api/analytics/DirectionSelectorButtonAction;", "", "Direction", "Back", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DirectionSelectorButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DirectionSelectorButtonAction[] $VALUES;
    public static final DirectionSelectorButtonAction Back;
    public static final DirectionSelectorButtonAction Direction;

    static {
        DirectionSelectorButtonAction directionSelectorButtonAction = new DirectionSelectorButtonAction("Direction", 0);
        Direction = directionSelectorButtonAction;
        DirectionSelectorButtonAction directionSelectorButtonAction2 = new DirectionSelectorButtonAction("Back", 1);
        Back = directionSelectorButtonAction2;
        DirectionSelectorButtonAction[] directionSelectorButtonActionArr = {directionSelectorButtonAction, directionSelectorButtonAction2};
        $VALUES = directionSelectorButtonActionArr;
        $ENTRIES = a.a(directionSelectorButtonActionArr);
    }

    public static DirectionSelectorButtonAction valueOf(String str) {
        return (DirectionSelectorButtonAction) Enum.valueOf(DirectionSelectorButtonAction.class, str);
    }

    public static DirectionSelectorButtonAction[] values() {
        return (DirectionSelectorButtonAction[]) $VALUES.clone();
    }
}
