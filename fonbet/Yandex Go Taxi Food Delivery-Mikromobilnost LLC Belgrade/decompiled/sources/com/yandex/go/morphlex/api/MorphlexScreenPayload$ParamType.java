package com.yandex.go.morphlex.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/morphlex/api/MorphlexScreenPayload$ParamType", "", "Lcom/yandex/go/morphlex/api/MorphlexScreenPayload$ParamType;", "AUTH", "GEO", "POINT_A", "ORDERS", "SYSTEM_SOUND_IS_MUTED", "PAYMENT_METHOD", "TARIFF_CLASS", "PREORDER_DUE", "ADDITIONAL_PREORDER_INFO", "TARIFF_REQUIREMENTS", "ORDER_COMMENT", "ROUTE", "go-client-android.features.morphlex:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MorphlexScreenPayload$ParamType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MorphlexScreenPayload$ParamType[] $VALUES;
    public static final MorphlexScreenPayload$ParamType ADDITIONAL_PREORDER_INFO;
    public static final MorphlexScreenPayload$ParamType AUTH;
    public static final MorphlexScreenPayload$ParamType GEO;
    public static final MorphlexScreenPayload$ParamType ORDERS;
    public static final MorphlexScreenPayload$ParamType ORDER_COMMENT;
    public static final MorphlexScreenPayload$ParamType PAYMENT_METHOD;
    public static final MorphlexScreenPayload$ParamType POINT_A;
    public static final MorphlexScreenPayload$ParamType PREORDER_DUE;
    public static final MorphlexScreenPayload$ParamType ROUTE;
    public static final MorphlexScreenPayload$ParamType SYSTEM_SOUND_IS_MUTED;
    public static final MorphlexScreenPayload$ParamType TARIFF_CLASS;
    public static final MorphlexScreenPayload$ParamType TARIFF_REQUIREMENTS;

    static {
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType = new MorphlexScreenPayload$ParamType("AUTH", 0);
        AUTH = morphlexScreenPayload$ParamType;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType2 = new MorphlexScreenPayload$ParamType("GEO", 1);
        GEO = morphlexScreenPayload$ParamType2;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType3 = new MorphlexScreenPayload$ParamType("POINT_A", 2);
        POINT_A = morphlexScreenPayload$ParamType3;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType4 = new MorphlexScreenPayload$ParamType("ORDERS", 3);
        ORDERS = morphlexScreenPayload$ParamType4;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType5 = new MorphlexScreenPayload$ParamType("SYSTEM_SOUND_IS_MUTED", 4);
        SYSTEM_SOUND_IS_MUTED = morphlexScreenPayload$ParamType5;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType6 = new MorphlexScreenPayload$ParamType("PAYMENT_METHOD", 5);
        PAYMENT_METHOD = morphlexScreenPayload$ParamType6;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType7 = new MorphlexScreenPayload$ParamType("TARIFF_CLASS", 6);
        TARIFF_CLASS = morphlexScreenPayload$ParamType7;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType8 = new MorphlexScreenPayload$ParamType("PREORDER_DUE", 7);
        PREORDER_DUE = morphlexScreenPayload$ParamType8;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType9 = new MorphlexScreenPayload$ParamType("ADDITIONAL_PREORDER_INFO", 8);
        ADDITIONAL_PREORDER_INFO = morphlexScreenPayload$ParamType9;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType10 = new MorphlexScreenPayload$ParamType("TARIFF_REQUIREMENTS", 9);
        TARIFF_REQUIREMENTS = morphlexScreenPayload$ParamType10;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType11 = new MorphlexScreenPayload$ParamType("ORDER_COMMENT", 10);
        ORDER_COMMENT = morphlexScreenPayload$ParamType11;
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType12 = new MorphlexScreenPayload$ParamType("ROUTE", 11);
        ROUTE = morphlexScreenPayload$ParamType12;
        MorphlexScreenPayload$ParamType[] morphlexScreenPayload$ParamTypeArr = {morphlexScreenPayload$ParamType, morphlexScreenPayload$ParamType2, morphlexScreenPayload$ParamType3, morphlexScreenPayload$ParamType4, morphlexScreenPayload$ParamType5, morphlexScreenPayload$ParamType6, morphlexScreenPayload$ParamType7, morphlexScreenPayload$ParamType8, morphlexScreenPayload$ParamType9, morphlexScreenPayload$ParamType10, morphlexScreenPayload$ParamType11, morphlexScreenPayload$ParamType12};
        $VALUES = morphlexScreenPayload$ParamTypeArr;
        $ENTRIES = a.a(morphlexScreenPayload$ParamTypeArr);
    }

    public static MorphlexScreenPayload$ParamType valueOf(String str) {
        return (MorphlexScreenPayload$ParamType) Enum.valueOf(MorphlexScreenPayload$ParamType.class, str);
    }

    public static MorphlexScreenPayload$ParamType[] values() {
        return (MorphlexScreenPayload$ParamType[]) $VALUES.clone();
    }
}
