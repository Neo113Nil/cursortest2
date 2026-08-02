package com.yandex.quark.js.implementation.facade;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/quark/js/implementation/facade/PreferredDirectivePayloadFormat;", "", "JSON", "PROTO", "quark-js_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PreferredDirectivePayloadFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PreferredDirectivePayloadFormat[] $VALUES;
    public static final PreferredDirectivePayloadFormat JSON;
    public static final PreferredDirectivePayloadFormat PROTO;

    static {
        PreferredDirectivePayloadFormat preferredDirectivePayloadFormat = new PreferredDirectivePayloadFormat("JSON", 0);
        JSON = preferredDirectivePayloadFormat;
        PreferredDirectivePayloadFormat preferredDirectivePayloadFormat2 = new PreferredDirectivePayloadFormat("PROTO", 1);
        PROTO = preferredDirectivePayloadFormat2;
        PreferredDirectivePayloadFormat[] preferredDirectivePayloadFormatArr = {preferredDirectivePayloadFormat, preferredDirectivePayloadFormat2};
        $VALUES = preferredDirectivePayloadFormatArr;
        $ENTRIES = a.a(preferredDirectivePayloadFormatArr);
    }

    public static PreferredDirectivePayloadFormat valueOf(String str) {
        return (PreferredDirectivePayloadFormat) Enum.valueOf(PreferredDirectivePayloadFormat.class, str);
    }

    public static PreferredDirectivePayloadFormat[] values() {
        return (PreferredDirectivePayloadFormat[]) $VALUES.clone();
    }
}
