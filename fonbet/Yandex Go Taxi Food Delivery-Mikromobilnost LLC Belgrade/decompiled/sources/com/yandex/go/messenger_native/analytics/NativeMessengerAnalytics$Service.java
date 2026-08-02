package com.yandex.go.messenger_native.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Service", "", "Lcom/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Service;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Taxi", "Marketplace", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeMessengerAnalytics$Service {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalytics$Service[] $VALUES;
    public static final NativeMessengerAnalytics$Service Marketplace;
    public static final NativeMessengerAnalytics$Service Taxi;
    private final String eventValue;

    static {
        NativeMessengerAnalytics$Service nativeMessengerAnalytics$Service = new NativeMessengerAnalytics$Service("Taxi", 0, TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        Taxi = nativeMessengerAnalytics$Service;
        NativeMessengerAnalytics$Service nativeMessengerAnalytics$Service2 = new NativeMessengerAnalytics$Service("Marketplace", 1, "marketplace");
        Marketplace = nativeMessengerAnalytics$Service2;
        NativeMessengerAnalytics$Service[] nativeMessengerAnalytics$ServiceArr = {nativeMessengerAnalytics$Service, nativeMessengerAnalytics$Service2};
        $VALUES = nativeMessengerAnalytics$ServiceArr;
        $ENTRIES = a.a(nativeMessengerAnalytics$ServiceArr);
    }

    public NativeMessengerAnalytics$Service(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NativeMessengerAnalytics$Service valueOf(String str) {
        return (NativeMessengerAnalytics$Service) Enum.valueOf(NativeMessengerAnalytics$Service.class, str);
    }

    public static NativeMessengerAnalytics$Service[] values() {
        return (NativeMessengerAnalytics$Service[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
