package com.yandex.go.messenger_native.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Action", "", "Lcom/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Action;", "CALL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeMessengerAnalyticsFacade$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalyticsFacade$Action[] $VALUES;
    public static final NativeMessengerAnalyticsFacade$Action CALL;

    static {
        NativeMessengerAnalyticsFacade$Action nativeMessengerAnalyticsFacade$Action = new NativeMessengerAnalyticsFacade$Action("CALL", 0);
        CALL = nativeMessengerAnalyticsFacade$Action;
        NativeMessengerAnalyticsFacade$Action[] nativeMessengerAnalyticsFacade$ActionArr = {nativeMessengerAnalyticsFacade$Action};
        $VALUES = nativeMessengerAnalyticsFacade$ActionArr;
        $ENTRIES = a.a(nativeMessengerAnalyticsFacade$ActionArr);
    }

    public static NativeMessengerAnalyticsFacade$Action valueOf(String str) {
        return (NativeMessengerAnalyticsFacade$Action) Enum.valueOf(NativeMessengerAnalyticsFacade$Action.class, str);
    }

    public static NativeMessengerAnalyticsFacade$Action[] values() {
        return (NativeMessengerAnalyticsFacade$Action[]) $VALUES.clone();
    }
}
