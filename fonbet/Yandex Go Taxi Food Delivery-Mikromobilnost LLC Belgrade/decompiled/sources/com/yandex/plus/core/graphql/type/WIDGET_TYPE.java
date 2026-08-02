package com.yandex.plus.core.graphql.type;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.i041;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/core/graphql/type/WIDGET_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "i041", "BALANCE", "BUTTON", "ICON", "SPACER", "SWITCH", BaseDatabaseHelper.TYPE_TEXT, "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WIDGET_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WIDGET_TYPE[] $VALUES;

    @jxi
    public static final WIDGET_TYPE BALANCE;
    public static final WIDGET_TYPE BUTTON;
    public static final i041 Companion;
    public static final WIDGET_TYPE ICON;
    public static final WIDGET_TYPE SPACER;
    public static final WIDGET_TYPE SWITCH;
    public static final WIDGET_TYPE TEXT;
    public static final WIDGET_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        WIDGET_TYPE widget_type = new WIDGET_TYPE("BALANCE", 0, "BALANCE");
        BALANCE = widget_type;
        WIDGET_TYPE widget_type2 = new WIDGET_TYPE("BUTTON", 1, "BUTTON");
        BUTTON = widget_type2;
        WIDGET_TYPE widget_type3 = new WIDGET_TYPE("ICON", 2, "ICON");
        ICON = widget_type3;
        WIDGET_TYPE widget_type4 = new WIDGET_TYPE("SPACER", 3, "SPACER");
        SPACER = widget_type4;
        WIDGET_TYPE widget_type5 = new WIDGET_TYPE("SWITCH", 4, "SWITCH");
        SWITCH = widget_type5;
        WIDGET_TYPE widget_type6 = new WIDGET_TYPE(BaseDatabaseHelper.TYPE_TEXT, 5, BaseDatabaseHelper.TYPE_TEXT);
        TEXT = widget_type6;
        WIDGET_TYPE widget_type7 = new WIDGET_TYPE("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = widget_type7;
        WIDGET_TYPE[] widget_typeArr = {widget_type, widget_type2, widget_type3, widget_type4, widget_type5, widget_type6, widget_type7};
        $VALUES = widget_typeArr;
        $ENTRIES = a.a(widget_typeArr);
        Companion = new i041();
        scc.g("BALANCE", "BUTTON", "ICON", "SPACER", "SWITCH", BaseDatabaseHelper.TYPE_TEXT);
        type = new p4o("WIDGET_TYPE");
    }

    public WIDGET_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static WIDGET_TYPE valueOf(String str) {
        return (WIDGET_TYPE) Enum.valueOf(WIDGET_TYPE.class, str);
    }

    public static WIDGET_TYPE[] values() {
        return (WIDGET_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
