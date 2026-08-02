package com.yandex.messaging.internal.net;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/internal/net/HttpRequestTag;", "", "FileRequest", "YaDiskFileRequest", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HttpRequestTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HttpRequestTag[] $VALUES;
    public static final HttpRequestTag FileRequest;
    public static final HttpRequestTag YaDiskFileRequest;

    static {
        HttpRequestTag httpRequestTag = new HttpRequestTag("FileRequest", 0);
        FileRequest = httpRequestTag;
        HttpRequestTag httpRequestTag2 = new HttpRequestTag("YaDiskFileRequest", 1);
        YaDiskFileRequest = httpRequestTag2;
        HttpRequestTag[] httpRequestTagArr = {httpRequestTag, httpRequestTag2};
        $VALUES = httpRequestTagArr;
        $ENTRIES = kotlin.enums.a.a(httpRequestTagArr);
    }

    public static HttpRequestTag valueOf(String str) {
        return (HttpRequestTag) Enum.valueOf(HttpRequestTag.class, str);
    }

    public static HttpRequestTag[] values() {
        return (HttpRequestTag[]) $VALUES.clone();
    }
}
