package com.yandex.plus.core.graphql.type;

import defpackage.f97;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/core/graphql/type/CONSUMER_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "f97", "ACTIVITY", "HOME", "LK", "MISSIONS", "PULT", "SP", "SP_ADD_ONS", "SP_FOOTBALL", "SP_LEVELS", "SP_POINTS", "SP_PROMO_CODES", "SP_SEASONS", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CONSUMER_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CONSUMER_TYPE[] $VALUES;
    public static final CONSUMER_TYPE ACTIVITY;
    public static final f97 Companion;
    public static final CONSUMER_TYPE HOME;
    public static final CONSUMER_TYPE LK;
    public static final CONSUMER_TYPE MISSIONS;
    public static final CONSUMER_TYPE PULT;
    public static final CONSUMER_TYPE SP;
    public static final CONSUMER_TYPE SP_ADD_ONS;
    public static final CONSUMER_TYPE SP_FOOTBALL;
    public static final CONSUMER_TYPE SP_LEVELS;
    public static final CONSUMER_TYPE SP_POINTS;
    public static final CONSUMER_TYPE SP_PROMO_CODES;
    public static final CONSUMER_TYPE SP_SEASONS;
    public static final CONSUMER_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        CONSUMER_TYPE consumer_type = new CONSUMER_TYPE("ACTIVITY", 0, "ACTIVITY");
        ACTIVITY = consumer_type;
        CONSUMER_TYPE consumer_type2 = new CONSUMER_TYPE("HOME", 1, "HOME");
        HOME = consumer_type2;
        CONSUMER_TYPE consumer_type3 = new CONSUMER_TYPE("LK", 2, "LK");
        LK = consumer_type3;
        CONSUMER_TYPE consumer_type4 = new CONSUMER_TYPE("MISSIONS", 3, "MISSIONS");
        MISSIONS = consumer_type4;
        CONSUMER_TYPE consumer_type5 = new CONSUMER_TYPE("PULT", 4, "PULT");
        PULT = consumer_type5;
        CONSUMER_TYPE consumer_type6 = new CONSUMER_TYPE("SP", 5, "SP");
        SP = consumer_type6;
        CONSUMER_TYPE consumer_type7 = new CONSUMER_TYPE("SP_ADD_ONS", 6, "SP_ADD_ONS");
        SP_ADD_ONS = consumer_type7;
        CONSUMER_TYPE consumer_type8 = new CONSUMER_TYPE("SP_FOOTBALL", 7, "SP_FOOTBALL");
        SP_FOOTBALL = consumer_type8;
        CONSUMER_TYPE consumer_type9 = new CONSUMER_TYPE("SP_LEVELS", 8, "SP_LEVELS");
        SP_LEVELS = consumer_type9;
        CONSUMER_TYPE consumer_type10 = new CONSUMER_TYPE("SP_POINTS", 9, "SP_POINTS");
        SP_POINTS = consumer_type10;
        CONSUMER_TYPE consumer_type11 = new CONSUMER_TYPE("SP_PROMO_CODES", 10, "SP_PROMO_CODES");
        SP_PROMO_CODES = consumer_type11;
        CONSUMER_TYPE consumer_type12 = new CONSUMER_TYPE("SP_SEASONS", 11, "SP_SEASONS");
        SP_SEASONS = consumer_type12;
        CONSUMER_TYPE consumer_type13 = new CONSUMER_TYPE("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = consumer_type13;
        CONSUMER_TYPE[] consumer_typeArr = {consumer_type, consumer_type2, consumer_type3, consumer_type4, consumer_type5, consumer_type6, consumer_type7, consumer_type8, consumer_type9, consumer_type10, consumer_type11, consumer_type12, consumer_type13};
        $VALUES = consumer_typeArr;
        $ENTRIES = a.a(consumer_typeArr);
        Companion = new f97();
        scc.g("ACTIVITY", "HOME", "LK", "MISSIONS", "PULT", "SP", "SP_ADD_ONS", "SP_FOOTBALL", "SP_LEVELS", "SP_POINTS", "SP_PROMO_CODES", "SP_SEASONS");
        type = new p4o("CONSUMER_TYPE");
    }

    public CONSUMER_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static CONSUMER_TYPE valueOf(String str) {
        return (CONSUMER_TYPE) Enum.valueOf(CONSUMER_TYPE.class, str);
    }

    public static CONSUMER_TYPE[] values() {
        return (CONSUMER_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
