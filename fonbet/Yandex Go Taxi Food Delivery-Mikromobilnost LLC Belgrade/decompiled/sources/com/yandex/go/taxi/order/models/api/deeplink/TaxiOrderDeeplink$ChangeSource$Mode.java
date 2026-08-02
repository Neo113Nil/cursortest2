package com.yandex.go.taxi.order.models.api.deeplink;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mpx0;
import defpackage.yzx0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/deeplink/TaxiOrderDeeplink$ChangeSource$Mode", "", "Lcom/yandex/go/taxi/order/models/api/deeplink/TaxiOrderDeeplink$ChangeSource$Mode;", "Companion", "yzx0", "CHANGE_SOURCE_SCREEN", "MODAL_CONFIRM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderDeeplink$ChangeSource$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderDeeplink$ChangeSource$Mode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TaxiOrderDeeplink$ChangeSource$Mode CHANGE_SOURCE_SCREEN;
    public static final yzx0 Companion;
    public static final TaxiOrderDeeplink$ChangeSource$Mode MODAL_CONFIRM;

    static {
        TaxiOrderDeeplink$ChangeSource$Mode taxiOrderDeeplink$ChangeSource$Mode = new TaxiOrderDeeplink$ChangeSource$Mode("CHANGE_SOURCE_SCREEN", 0);
        CHANGE_SOURCE_SCREEN = taxiOrderDeeplink$ChangeSource$Mode;
        TaxiOrderDeeplink$ChangeSource$Mode taxiOrderDeeplink$ChangeSource$Mode2 = new TaxiOrderDeeplink$ChangeSource$Mode("MODAL_CONFIRM", 1);
        MODAL_CONFIRM = taxiOrderDeeplink$ChangeSource$Mode2;
        TaxiOrderDeeplink$ChangeSource$Mode[] taxiOrderDeeplink$ChangeSource$ModeArr = {taxiOrderDeeplink$ChangeSource$Mode, taxiOrderDeeplink$ChangeSource$Mode2};
        $VALUES = taxiOrderDeeplink$ChangeSource$ModeArr;
        $ENTRIES = a.a(taxiOrderDeeplink$ChangeSource$ModeArr);
        Companion = new yzx0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(13));
    }

    public static TaxiOrderDeeplink$ChangeSource$Mode valueOf(String str) {
        return (TaxiOrderDeeplink$ChangeSource$Mode) Enum.valueOf(TaxiOrderDeeplink$ChangeSource$Mode.class, str);
    }

    public static TaxiOrderDeeplink$ChangeSource$Mode[] values() {
        return (TaxiOrderDeeplink$ChangeSource$Mode[]) $VALUES.clone();
    }
}
