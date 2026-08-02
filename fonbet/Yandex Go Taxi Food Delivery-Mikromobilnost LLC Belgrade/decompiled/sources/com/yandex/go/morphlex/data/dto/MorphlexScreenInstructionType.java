package com.yandex.go.morphlex.data.dto;

import defpackage.d830;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexScreenInstructionType;", "", "Companion", "d830", "AUTH", "GEO", "POINT_A", "ORDERS", "SYSTEM_SOUND_IS_MUTED", "PAYMENT_METHOD", "TARIFF_REQUIREMENTS", "ORDER_COMMENT", "TARIFF_CLASS", "PREORDER_DUE", "ADDITIONAL_PREORDER_INFO", "ROUTE", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MorphlexScreenInstructionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MorphlexScreenInstructionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MorphlexScreenInstructionType ADDITIONAL_PREORDER_INFO;
    public static final MorphlexScreenInstructionType AUTH;
    public static final d830 Companion;
    public static final MorphlexScreenInstructionType GEO;
    public static final MorphlexScreenInstructionType ORDERS;
    public static final MorphlexScreenInstructionType ORDER_COMMENT;
    public static final MorphlexScreenInstructionType PAYMENT_METHOD;
    public static final MorphlexScreenInstructionType POINT_A;
    public static final MorphlexScreenInstructionType PREORDER_DUE;
    public static final MorphlexScreenInstructionType ROUTE;
    public static final MorphlexScreenInstructionType SYSTEM_SOUND_IS_MUTED;
    public static final MorphlexScreenInstructionType TARIFF_CLASS;
    public static final MorphlexScreenInstructionType TARIFF_REQUIREMENTS;
    public static final MorphlexScreenInstructionType UNSUPPORTED;

    static {
        MorphlexScreenInstructionType morphlexScreenInstructionType = new MorphlexScreenInstructionType("AUTH", 0);
        AUTH = morphlexScreenInstructionType;
        MorphlexScreenInstructionType morphlexScreenInstructionType2 = new MorphlexScreenInstructionType("GEO", 1);
        GEO = morphlexScreenInstructionType2;
        MorphlexScreenInstructionType morphlexScreenInstructionType3 = new MorphlexScreenInstructionType("POINT_A", 2);
        POINT_A = morphlexScreenInstructionType3;
        MorphlexScreenInstructionType morphlexScreenInstructionType4 = new MorphlexScreenInstructionType("ORDERS", 3);
        ORDERS = morphlexScreenInstructionType4;
        MorphlexScreenInstructionType morphlexScreenInstructionType5 = new MorphlexScreenInstructionType("SYSTEM_SOUND_IS_MUTED", 4);
        SYSTEM_SOUND_IS_MUTED = morphlexScreenInstructionType5;
        MorphlexScreenInstructionType morphlexScreenInstructionType6 = new MorphlexScreenInstructionType("PAYMENT_METHOD", 5);
        PAYMENT_METHOD = morphlexScreenInstructionType6;
        MorphlexScreenInstructionType morphlexScreenInstructionType7 = new MorphlexScreenInstructionType("TARIFF_REQUIREMENTS", 6);
        TARIFF_REQUIREMENTS = morphlexScreenInstructionType7;
        MorphlexScreenInstructionType morphlexScreenInstructionType8 = new MorphlexScreenInstructionType("ORDER_COMMENT", 7);
        ORDER_COMMENT = morphlexScreenInstructionType8;
        MorphlexScreenInstructionType morphlexScreenInstructionType9 = new MorphlexScreenInstructionType("TARIFF_CLASS", 8);
        TARIFF_CLASS = morphlexScreenInstructionType9;
        MorphlexScreenInstructionType morphlexScreenInstructionType10 = new MorphlexScreenInstructionType("PREORDER_DUE", 9);
        PREORDER_DUE = morphlexScreenInstructionType10;
        MorphlexScreenInstructionType morphlexScreenInstructionType11 = new MorphlexScreenInstructionType("ADDITIONAL_PREORDER_INFO", 10);
        ADDITIONAL_PREORDER_INFO = morphlexScreenInstructionType11;
        MorphlexScreenInstructionType morphlexScreenInstructionType12 = new MorphlexScreenInstructionType("ROUTE", 11);
        ROUTE = morphlexScreenInstructionType12;
        MorphlexScreenInstructionType morphlexScreenInstructionType13 = new MorphlexScreenInstructionType("UNSUPPORTED", 12);
        UNSUPPORTED = morphlexScreenInstructionType13;
        MorphlexScreenInstructionType[] morphlexScreenInstructionTypeArr = {morphlexScreenInstructionType, morphlexScreenInstructionType2, morphlexScreenInstructionType3, morphlexScreenInstructionType4, morphlexScreenInstructionType5, morphlexScreenInstructionType6, morphlexScreenInstructionType7, morphlexScreenInstructionType8, morphlexScreenInstructionType9, morphlexScreenInstructionType10, morphlexScreenInstructionType11, morphlexScreenInstructionType12, morphlexScreenInstructionType13};
        $VALUES = morphlexScreenInstructionTypeArr;
        $ENTRIES = kotlin.enums.a.a(morphlexScreenInstructionTypeArr);
        Companion = new d830();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(21));
    }

    public static MorphlexScreenInstructionType valueOf(String str) {
        return (MorphlexScreenInstructionType) Enum.valueOf(MorphlexScreenInstructionType.class, str);
    }

    public static MorphlexScreenInstructionType[] values() {
        return (MorphlexScreenInstructionType[]) $VALUES.clone();
    }
}
