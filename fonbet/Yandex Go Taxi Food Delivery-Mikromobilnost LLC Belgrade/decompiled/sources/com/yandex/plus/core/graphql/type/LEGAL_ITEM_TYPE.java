package com.yandex.plus.core.graphql.type;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import defpackage.wpx;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/core/graphql/type/LEGAL_ITEM_TYPE;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "wpx", "LINK", BaseDatabaseHelper.TYPE_TEXT, "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LEGAL_ITEM_TYPE {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LEGAL_ITEM_TYPE[] $VALUES;
    public static final wpx Companion;
    public static final LEGAL_ITEM_TYPE LINK;
    public static final LEGAL_ITEM_TYPE TEXT;
    public static final LEGAL_ITEM_TYPE UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        LEGAL_ITEM_TYPE legal_item_type = new LEGAL_ITEM_TYPE("LINK", 0, "LINK");
        LINK = legal_item_type;
        LEGAL_ITEM_TYPE legal_item_type2 = new LEGAL_ITEM_TYPE(BaseDatabaseHelper.TYPE_TEXT, 1, BaseDatabaseHelper.TYPE_TEXT);
        TEXT = legal_item_type2;
        LEGAL_ITEM_TYPE legal_item_type3 = new LEGAL_ITEM_TYPE("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = legal_item_type3;
        LEGAL_ITEM_TYPE[] legal_item_typeArr = {legal_item_type, legal_item_type2, legal_item_type3};
        $VALUES = legal_item_typeArr;
        $ENTRIES = a.a(legal_item_typeArr);
        Companion = new wpx();
        scc.g("LINK", BaseDatabaseHelper.TYPE_TEXT);
        type = new p4o("LEGAL_ITEM_TYPE");
    }

    public LEGAL_ITEM_TYPE(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static LEGAL_ITEM_TYPE valueOf(String str) {
        return (LEGAL_ITEM_TYPE) Enum.valueOf(LEGAL_ITEM_TYPE.class, str);
    }

    public static LEGAL_ITEM_TYPE[] values() {
        return (LEGAL_ITEM_TYPE[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
