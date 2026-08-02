package com.yandex.quark.js.serializer;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/quark/js/serializer/JsDataSerializationStrategy;", "", "JSON", "PROTO", "quark-js_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class JsDataSerializationStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ JsDataSerializationStrategy[] $VALUES;
    public static final JsDataSerializationStrategy JSON;
    public static final JsDataSerializationStrategy PROTO;

    static {
        JsDataSerializationStrategy jsDataSerializationStrategy = new JsDataSerializationStrategy("JSON", 0);
        JSON = jsDataSerializationStrategy;
        JsDataSerializationStrategy jsDataSerializationStrategy2 = new JsDataSerializationStrategy("PROTO", 1);
        PROTO = jsDataSerializationStrategy2;
        JsDataSerializationStrategy[] jsDataSerializationStrategyArr = {jsDataSerializationStrategy, jsDataSerializationStrategy2};
        $VALUES = jsDataSerializationStrategyArr;
        $ENTRIES = a.a(jsDataSerializationStrategyArr);
    }

    public static JsDataSerializationStrategy valueOf(String str) {
        return (JsDataSerializationStrategy) Enum.valueOf(JsDataSerializationStrategy.class, str);
    }

    public static JsDataSerializationStrategy[] values() {
        return (JsDataSerializationStrategy[]) $VALUES.clone();
    }
}
