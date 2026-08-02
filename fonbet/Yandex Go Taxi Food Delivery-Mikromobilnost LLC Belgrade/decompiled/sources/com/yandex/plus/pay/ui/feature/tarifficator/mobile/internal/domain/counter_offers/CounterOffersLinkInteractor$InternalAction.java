package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import com.yandex.div.state.db.StateEntry;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/domain/counter_offers/CounterOffersLinkInteractor$InternalAction", "", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/domain/counter_offers/CounterOffersLinkInteractor$InternalAction;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/domain/counter_offers/a", "RETRY", "CHANGE_PAYMENT_METHOD", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CounterOffersLinkInteractor$InternalAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CounterOffersLinkInteractor$InternalAction[] $VALUES;
    public static final CounterOffersLinkInteractor$InternalAction CHANGE_PAYMENT_METHOD;
    public static final a Companion;
    public static final CounterOffersLinkInteractor$InternalAction RETRY;
    private final String path;

    static {
        CounterOffersLinkInteractor$InternalAction counterOffersLinkInteractor$InternalAction = new CounterOffersLinkInteractor$InternalAction("RETRY", 0, "/retry");
        RETRY = counterOffersLinkInteractor$InternalAction;
        CounterOffersLinkInteractor$InternalAction counterOffersLinkInteractor$InternalAction2 = new CounterOffersLinkInteractor$InternalAction("CHANGE_PAYMENT_METHOD", 1, "/change-payment-method");
        CHANGE_PAYMENT_METHOD = counterOffersLinkInteractor$InternalAction2;
        CounterOffersLinkInteractor$InternalAction[] counterOffersLinkInteractor$InternalActionArr = {counterOffersLinkInteractor$InternalAction, counterOffersLinkInteractor$InternalAction2};
        $VALUES = counterOffersLinkInteractor$InternalActionArr;
        $ENTRIES = kotlin.enums.a.a(counterOffersLinkInteractor$InternalActionArr);
        Companion = new a();
    }

    public CounterOffersLinkInteractor$InternalAction(String str, int i, String str2) {
        this.path = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static CounterOffersLinkInteractor$InternalAction valueOf(String str) {
        return (CounterOffersLinkInteractor$InternalAction) Enum.valueOf(CounterOffersLinkInteractor$InternalAction.class, str);
    }

    public static CounterOffersLinkInteractor$InternalAction[] values() {
        return (CounterOffersLinkInteractor$InternalAction[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }
}
