package com.yandex.paymentsdk.opentelemetry;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/paymentsdk/opentelemetry/SpanKind;", "", "SPAN_KIND_UNSPECIFIED", "SPAN_KIND_INTERNAL", "SPAN_KIND_SERVER", "SPAN_KIND_CLIENT", "SPAN_KIND_PRODUCER", "SPAN_KIND_CONSUMER", "UNRECOGNIZED", "opentelemetry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpanKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SpanKind[] $VALUES;
    public static final SpanKind SPAN_KIND_CLIENT;
    public static final SpanKind SPAN_KIND_CONSUMER;
    public static final SpanKind SPAN_KIND_INTERNAL;
    public static final SpanKind SPAN_KIND_PRODUCER;
    public static final SpanKind SPAN_KIND_SERVER;
    public static final SpanKind SPAN_KIND_UNSPECIFIED;
    public static final SpanKind UNRECOGNIZED;

    static {
        SpanKind spanKind = new SpanKind("SPAN_KIND_UNSPECIFIED", 0);
        SPAN_KIND_UNSPECIFIED = spanKind;
        SpanKind spanKind2 = new SpanKind("SPAN_KIND_INTERNAL", 1);
        SPAN_KIND_INTERNAL = spanKind2;
        SpanKind spanKind3 = new SpanKind("SPAN_KIND_SERVER", 2);
        SPAN_KIND_SERVER = spanKind3;
        SpanKind spanKind4 = new SpanKind("SPAN_KIND_CLIENT", 3);
        SPAN_KIND_CLIENT = spanKind4;
        SpanKind spanKind5 = new SpanKind("SPAN_KIND_PRODUCER", 4);
        SPAN_KIND_PRODUCER = spanKind5;
        SpanKind spanKind6 = new SpanKind("SPAN_KIND_CONSUMER", 5);
        SPAN_KIND_CONSUMER = spanKind6;
        SpanKind spanKind7 = new SpanKind("UNRECOGNIZED", 6);
        UNRECOGNIZED = spanKind7;
        SpanKind[] spanKindArr = {spanKind, spanKind2, spanKind3, spanKind4, spanKind5, spanKind6, spanKind7};
        $VALUES = spanKindArr;
        $ENTRIES = kotlin.enums.a.a(spanKindArr);
    }

    public static SpanKind valueOf(String str) {
        return (SpanKind) Enum.valueOf(SpanKind.class, str);
    }

    public static SpanKind[] values() {
        return (SpanKind[]) $VALUES.clone();
    }
}
