package com.yandex.go.superapp.api.loading_tracker;

import defpackage.fdn;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/superapp/api/loading_tracker/ServiceLoadingEvent;", "Lfdn;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "WEBVIEW_CREATE_START", "WEBVIEW_CREATE_FINISH", "AUTH_START", "AUTH_FINISH", "REDIRECT", "OPEN_URL", "WEB_VIEW_READY", "WILL_OPEN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceLoadingEvent implements fdn {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServiceLoadingEvent[] $VALUES;
    public static final ServiceLoadingEvent AUTH_FINISH;
    public static final ServiceLoadingEvent AUTH_START;
    public static final ServiceLoadingEvent OPEN_URL;
    public static final ServiceLoadingEvent REDIRECT;
    public static final ServiceLoadingEvent WEBVIEW_CREATE_FINISH;
    public static final ServiceLoadingEvent WEBVIEW_CREATE_START;
    public static final ServiceLoadingEvent WEB_VIEW_READY;
    public static final ServiceLoadingEvent WILL_OPEN;
    private final String key;

    static {
        ServiceLoadingEvent serviceLoadingEvent = new ServiceLoadingEvent("WEBVIEW_CREATE_START", 0, "webview_create_start");
        WEBVIEW_CREATE_START = serviceLoadingEvent;
        ServiceLoadingEvent serviceLoadingEvent2 = new ServiceLoadingEvent("WEBVIEW_CREATE_FINISH", 1, "webview_create_finish");
        WEBVIEW_CREATE_FINISH = serviceLoadingEvent2;
        ServiceLoadingEvent serviceLoadingEvent3 = new ServiceLoadingEvent("AUTH_START", 2, "auth_start");
        AUTH_START = serviceLoadingEvent3;
        ServiceLoadingEvent serviceLoadingEvent4 = new ServiceLoadingEvent("AUTH_FINISH", 3, "auth_finish");
        AUTH_FINISH = serviceLoadingEvent4;
        ServiceLoadingEvent serviceLoadingEvent5 = new ServiceLoadingEvent("REDIRECT", 4, "redirect");
        REDIRECT = serviceLoadingEvent5;
        ServiceLoadingEvent serviceLoadingEvent6 = new ServiceLoadingEvent("OPEN_URL", 5, "open_url");
        OPEN_URL = serviceLoadingEvent6;
        ServiceLoadingEvent serviceLoadingEvent7 = new ServiceLoadingEvent("WEB_VIEW_READY", 6, "web_view_ready");
        WEB_VIEW_READY = serviceLoadingEvent7;
        ServiceLoadingEvent serviceLoadingEvent8 = new ServiceLoadingEvent("WILL_OPEN", 7, "will_open");
        WILL_OPEN = serviceLoadingEvent8;
        ServiceLoadingEvent[] serviceLoadingEventArr = {serviceLoadingEvent, serviceLoadingEvent2, serviceLoadingEvent3, serviceLoadingEvent4, serviceLoadingEvent5, serviceLoadingEvent6, serviceLoadingEvent7, serviceLoadingEvent8};
        $VALUES = serviceLoadingEventArr;
        $ENTRIES = a.a(serviceLoadingEventArr);
    }

    public ServiceLoadingEvent(String str, int i, String str2) {
        this.key = str2;
    }

    public static ServiceLoadingEvent valueOf(String str) {
        return (ServiceLoadingEvent) Enum.valueOf(ServiceLoadingEvent.class, str);
    }

    public static ServiceLoadingEvent[] values() {
        return (ServiceLoadingEvent[]) $VALUES.clone();
    }

    @Override // defpackage.fdn
    public final String getKey() {
        return this.key;
    }
}
