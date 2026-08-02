package com.yandex.go.beginners.domain.model;

import defpackage.k4o;
import defpackage.zk5;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/beginners/domain/model/BeginnersOnboardingModel$ServiceInfo$IconType", "", "Lcom/yandex/go/beginners/domain/model/BeginnersOnboardingModel$ServiceInfo$IconType;", "", "tag", "Ljava/lang/String;", "Companion", "zk5", "Pin", "Ride", "Sell", "Taste", "Delivery", "Undefined", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BeginnersOnboardingModel$ServiceInfo$IconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BeginnersOnboardingModel$ServiceInfo$IconType[] $VALUES;
    public static final zk5 Companion;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Delivery;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Pin;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Ride;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Sell;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Taste;
    public static final BeginnersOnboardingModel$ServiceInfo$IconType Undefined;
    private final String tag;

    static {
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType = new BeginnersOnboardingModel$ServiceInfo$IconType("Pin", 0, "pin");
        Pin = beginnersOnboardingModel$ServiceInfo$IconType;
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType2 = new BeginnersOnboardingModel$ServiceInfo$IconType("Ride", 1, "ride");
        Ride = beginnersOnboardingModel$ServiceInfo$IconType2;
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType3 = new BeginnersOnboardingModel$ServiceInfo$IconType("Sell", 2, "sell");
        Sell = beginnersOnboardingModel$ServiceInfo$IconType3;
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType4 = new BeginnersOnboardingModel$ServiceInfo$IconType("Taste", 3, "taste");
        Taste = beginnersOnboardingModel$ServiceInfo$IconType4;
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType5 = new BeginnersOnboardingModel$ServiceInfo$IconType("Delivery", 4, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        Delivery = beginnersOnboardingModel$ServiceInfo$IconType5;
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType6 = new BeginnersOnboardingModel$ServiceInfo$IconType("Undefined", 5, "");
        Undefined = beginnersOnboardingModel$ServiceInfo$IconType6;
        BeginnersOnboardingModel$ServiceInfo$IconType[] beginnersOnboardingModel$ServiceInfo$IconTypeArr = {beginnersOnboardingModel$ServiceInfo$IconType, beginnersOnboardingModel$ServiceInfo$IconType2, beginnersOnboardingModel$ServiceInfo$IconType3, beginnersOnboardingModel$ServiceInfo$IconType4, beginnersOnboardingModel$ServiceInfo$IconType5, beginnersOnboardingModel$ServiceInfo$IconType6};
        $VALUES = beginnersOnboardingModel$ServiceInfo$IconTypeArr;
        $ENTRIES = a.a(beginnersOnboardingModel$ServiceInfo$IconTypeArr);
        Companion = new zk5();
    }

    public BeginnersOnboardingModel$ServiceInfo$IconType(String str, int i, String str2) {
        this.tag = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static BeginnersOnboardingModel$ServiceInfo$IconType valueOf(String str) {
        return (BeginnersOnboardingModel$ServiceInfo$IconType) Enum.valueOf(BeginnersOnboardingModel$ServiceInfo$IconType.class, str);
    }

    public static BeginnersOnboardingModel$ServiceInfo$IconType[] values() {
        return (BeginnersOnboardingModel$ServiceInfo$IconType[]) $VALUES.clone();
    }
}
