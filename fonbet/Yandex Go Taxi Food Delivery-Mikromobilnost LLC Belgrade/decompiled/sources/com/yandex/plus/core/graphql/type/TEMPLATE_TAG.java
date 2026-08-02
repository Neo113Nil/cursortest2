package com.yandex.plus.core.graphql.type;

import defpackage.h4x0;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/TEMPLATE_TAG;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "h4x0", "DESKTOP", "MOBILE", "SMART_TV", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TEMPLATE_TAG {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TEMPLATE_TAG[] $VALUES;
    public static final h4x0 Companion;
    public static final TEMPLATE_TAG DESKTOP;
    public static final TEMPLATE_TAG MOBILE;
    public static final TEMPLATE_TAG SMART_TV;
    public static final TEMPLATE_TAG UNKNOWN__;
    private static final p4o type;
    private final String rawValue;

    static {
        TEMPLATE_TAG template_tag = new TEMPLATE_TAG("DESKTOP", 0, "DESKTOP");
        DESKTOP = template_tag;
        TEMPLATE_TAG template_tag2 = new TEMPLATE_TAG("MOBILE", 1, "MOBILE");
        MOBILE = template_tag2;
        TEMPLATE_TAG template_tag3 = new TEMPLATE_TAG("SMART_TV", 2, "SMART_TV");
        SMART_TV = template_tag3;
        TEMPLATE_TAG template_tag4 = new TEMPLATE_TAG("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = template_tag4;
        TEMPLATE_TAG[] template_tagArr = {template_tag, template_tag2, template_tag3, template_tag4};
        $VALUES = template_tagArr;
        $ENTRIES = a.a(template_tagArr);
        Companion = new h4x0();
        scc.g("DESKTOP", "MOBILE", "SMART_TV");
        type = new p4o("TEMPLATE_TAG");
    }

    public TEMPLATE_TAG(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static TEMPLATE_TAG valueOf(String str) {
        return (TEMPLATE_TAG) Enum.valueOf(TEMPLATE_TAG.class, str);
    }

    public static TEMPLATE_TAG[] values() {
        return (TEMPLATE_TAG[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
