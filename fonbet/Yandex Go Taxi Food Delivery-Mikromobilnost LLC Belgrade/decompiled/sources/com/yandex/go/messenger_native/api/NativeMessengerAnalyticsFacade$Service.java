package com.yandex.go.messenger_native.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Service", "", "Lcom/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Service;", "TAXI", "MARKETPLACE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeMessengerAnalyticsFacade$Service {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalyticsFacade$Service[] $VALUES;
    public static final NativeMessengerAnalyticsFacade$Service MARKETPLACE;
    public static final NativeMessengerAnalyticsFacade$Service TAXI;

    static {
        NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service = new NativeMessengerAnalyticsFacade$Service("TAXI", 0);
        TAXI = nativeMessengerAnalyticsFacade$Service;
        NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service2 = new NativeMessengerAnalyticsFacade$Service("MARKETPLACE", 1);
        MARKETPLACE = nativeMessengerAnalyticsFacade$Service2;
        NativeMessengerAnalyticsFacade$Service[] nativeMessengerAnalyticsFacade$ServiceArr = {nativeMessengerAnalyticsFacade$Service, nativeMessengerAnalyticsFacade$Service2};
        $VALUES = nativeMessengerAnalyticsFacade$ServiceArr;
        $ENTRIES = a.a(nativeMessengerAnalyticsFacade$ServiceArr);
    }

    public static NativeMessengerAnalyticsFacade$Service valueOf(String str) {
        return (NativeMessengerAnalyticsFacade$Service) Enum.valueOf(NativeMessengerAnalyticsFacade$Service.class, str);
    }

    public static NativeMessengerAnalyticsFacade$Service[] values() {
        return (NativeMessengerAnalyticsFacade$Service[]) $VALUES.clone();
    }
}
