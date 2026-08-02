package com.yandex.go.masstransit.sdk.checkout.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/api/analytics/StopSelectorButtonAction;", "", "Stop", "Back", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StopSelectorButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StopSelectorButtonAction[] $VALUES;
    public static final StopSelectorButtonAction Back;
    public static final StopSelectorButtonAction Stop;

    static {
        StopSelectorButtonAction stopSelectorButtonAction = new StopSelectorButtonAction("Stop", 0);
        Stop = stopSelectorButtonAction;
        StopSelectorButtonAction stopSelectorButtonAction2 = new StopSelectorButtonAction("Back", 1);
        Back = stopSelectorButtonAction2;
        StopSelectorButtonAction[] stopSelectorButtonActionArr = {stopSelectorButtonAction, stopSelectorButtonAction2};
        $VALUES = stopSelectorButtonActionArr;
        $ENTRIES = a.a(stopSelectorButtonActionArr);
    }

    public static StopSelectorButtonAction valueOf(String str) {
        return (StopSelectorButtonAction) Enum.valueOf(StopSelectorButtonAction.class, str);
    }

    public static StopSelectorButtonAction[] values() {
        return (StopSelectorButtonAction[]) $VALUES.clone();
    }
}
