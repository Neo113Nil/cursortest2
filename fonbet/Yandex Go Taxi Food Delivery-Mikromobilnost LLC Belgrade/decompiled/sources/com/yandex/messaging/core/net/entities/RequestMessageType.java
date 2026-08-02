package com.yandex.messaging.core.net.entities;

import defpackage.gw00;
import defpackage.k4o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RequestMessageType;", "", "", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "UNKNOWN", "IMPORTANT", "IMAGE", "GALLERY", JCSP.FILE_STORE_NAME, "LINK", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestMessageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestMessageType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RequestMessageType FILE;
    public static final RequestMessageType GALLERY;
    public static final RequestMessageType IMAGE;
    public static final RequestMessageType IMPORTANT;
    public static final RequestMessageType LINK;
    public static final RequestMessageType UNKNOWN;
    private static final Map<String, RequestMessageType> map;
    private final String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RequestMessageType$Companion;", "", "", "", "Lcom/yandex/messaging/core/net/entities/RequestMessageType;", PolicyMappingsExtension.MAP, "Ljava/util/Map;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RequestMessageType requestMessageType = new RequestMessageType("UNKNOWN", 0, "");
        UNKNOWN = requestMessageType;
        RequestMessageType requestMessageType2 = new RequestMessageType("IMPORTANT", 1, "important");
        IMPORTANT = requestMessageType2;
        RequestMessageType requestMessageType3 = new RequestMessageType("IMAGE", 2, "image");
        IMAGE = requestMessageType3;
        RequestMessageType requestMessageType4 = new RequestMessageType("GALLERY", 3, "gallery");
        GALLERY = requestMessageType4;
        RequestMessageType requestMessageType5 = new RequestMessageType(JCSP.FILE_STORE_NAME, 4, "file");
        FILE = requestMessageType5;
        RequestMessageType requestMessageType6 = new RequestMessageType("LINK", 5, "link");
        LINK = requestMessageType6;
        RequestMessageType[] requestMessageTypeArr = {requestMessageType, requestMessageType2, requestMessageType3, requestMessageType4, requestMessageType5, requestMessageType6};
        $VALUES = requestMessageTypeArr;
        $ENTRIES = a.a(requestMessageTypeArr);
        INSTANCE = new Companion();
        RequestMessageType[] values = values();
        int d = gw00.d(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (RequestMessageType requestMessageType7 : values) {
            linkedHashMap.put(requestMessageType7.type, requestMessageType7);
        }
        map = linkedHashMap;
    }

    public RequestMessageType(String str, int i, String str2) {
        this.type = str2;
    }

    public static RequestMessageType valueOf(String str) {
        return (RequestMessageType) Enum.valueOf(RequestMessageType.class, str);
    }

    public static RequestMessageType[] values() {
        return (RequestMessageType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
