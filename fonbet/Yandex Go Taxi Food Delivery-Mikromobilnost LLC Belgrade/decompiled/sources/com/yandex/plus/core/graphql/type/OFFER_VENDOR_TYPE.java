package com.yandex.plus.core.graphql.type;

import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import defpackage.yo60;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/graphql/type/OFFER_VENDOR_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "yo60", "APP_STORE", "GOOGLE_PLAY", "MICROSOFT_STORE", "NATIVE_YANDEX", "PARTNER", "UNKNOWN", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OFFER_VENDOR_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OFFER_VENDOR_TYPE[] $VALUES;
    public static final OFFER_VENDOR_TYPE APP_STORE;
    public static final yo60 Companion;
    public static final OFFER_VENDOR_TYPE GOOGLE_PLAY;
    public static final OFFER_VENDOR_TYPE MICROSOFT_STORE;
    public static final OFFER_VENDOR_TYPE NATIVE_YANDEX;
    public static final OFFER_VENDOR_TYPE PARTNER;
    public static final OFFER_VENDOR_TYPE UNKNOWN;
    public static final OFFER_VENDOR_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        OFFER_VENDOR_TYPE offer_vendor_type = new OFFER_VENDOR_TYPE("APP_STORE", 0, "APP_STORE");
        APP_STORE = offer_vendor_type;
        OFFER_VENDOR_TYPE offer_vendor_type2 = new OFFER_VENDOR_TYPE("GOOGLE_PLAY", 1, "GOOGLE_PLAY");
        GOOGLE_PLAY = offer_vendor_type2;
        OFFER_VENDOR_TYPE offer_vendor_type3 = new OFFER_VENDOR_TYPE("MICROSOFT_STORE", 2, "MICROSOFT_STORE");
        MICROSOFT_STORE = offer_vendor_type3;
        OFFER_VENDOR_TYPE offer_vendor_type4 = new OFFER_VENDOR_TYPE("NATIVE_YANDEX", 3, "NATIVE_YANDEX");
        NATIVE_YANDEX = offer_vendor_type4;
        OFFER_VENDOR_TYPE offer_vendor_type5 = new OFFER_VENDOR_TYPE("PARTNER", 4, "PARTNER");
        PARTNER = offer_vendor_type5;
        OFFER_VENDOR_TYPE offer_vendor_type6 = new OFFER_VENDOR_TYPE("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = offer_vendor_type6;
        OFFER_VENDOR_TYPE offer_vendor_type7 = new OFFER_VENDOR_TYPE("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = offer_vendor_type7;
        OFFER_VENDOR_TYPE[] offer_vendor_typeArr = {offer_vendor_type, offer_vendor_type2, offer_vendor_type3, offer_vendor_type4, offer_vendor_type5, offer_vendor_type6, offer_vendor_type7};
        $VALUES = offer_vendor_typeArr;
        $ENTRIES = a.a(offer_vendor_typeArr);
        Companion = new yo60();
        scc.g("APP_STORE", "GOOGLE_PLAY", "MICROSOFT_STORE", "NATIVE_YANDEX", "PARTNER", "UNKNOWN");
        type = new p4o("OFFER_VENDOR_TYPE");
    }

    public OFFER_VENDOR_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static OFFER_VENDOR_TYPE valueOf(String str) {
        return (OFFER_VENDOR_TYPE) Enum.valueOf(OFFER_VENDOR_TYPE.class, str);
    }

    public static OFFER_VENDOR_TYPE[] values() {
        return (OFFER_VENDOR_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
