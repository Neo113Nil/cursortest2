package com.yandex.xplat.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/xplat/common/RequestEncodingKind;", "", "url", "json", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestEncodingKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestEncodingKind[] $VALUES;

    /* renamed from: json, reason: collision with root package name */
    public static final RequestEncodingKind f101json;
    public static final RequestEncodingKind url;

    static {
        RequestEncodingKind requestEncodingKind = new RequestEncodingKind("url", 0);
        url = requestEncodingKind;
        RequestEncodingKind requestEncodingKind2 = new RequestEncodingKind("json", 1);
        f101json = requestEncodingKind2;
        RequestEncodingKind[] requestEncodingKindArr = {requestEncodingKind, requestEncodingKind2};
        $VALUES = requestEncodingKindArr;
        $ENTRIES = kotlin.enums.a.a(requestEncodingKindArr);
    }

    public static RequestEncodingKind valueOf(String str) {
        return (RequestEncodingKind) Enum.valueOf(RequestEncodingKind.class, str);
    }

    public static RequestEncodingKind[] values() {
        return (RequestEncodingKind[]) $VALUES.clone();
    }
}
