package com.yandex.plus.home.plaque.repository.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/home/plaque/repository/api/model/Predicate$Compare$Type", "", "Lcom/yandex/plus/home/plaque/repository/api/model/Predicate$Compare$Type;", "EQUALS", "GREATER", "GREATER_OR_EQUALS", "LESSER", "LESSER_OR_EQUALS", "plus-home-plaque-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Predicate$Compare$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Predicate$Compare$Type[] $VALUES;
    public static final Predicate$Compare$Type EQUALS;
    public static final Predicate$Compare$Type GREATER;
    public static final Predicate$Compare$Type GREATER_OR_EQUALS;
    public static final Predicate$Compare$Type LESSER;
    public static final Predicate$Compare$Type LESSER_OR_EQUALS;

    static {
        Predicate$Compare$Type predicate$Compare$Type = new Predicate$Compare$Type("EQUALS", 0);
        EQUALS = predicate$Compare$Type;
        Predicate$Compare$Type predicate$Compare$Type2 = new Predicate$Compare$Type("GREATER", 1);
        GREATER = predicate$Compare$Type2;
        Predicate$Compare$Type predicate$Compare$Type3 = new Predicate$Compare$Type("GREATER_OR_EQUALS", 2);
        GREATER_OR_EQUALS = predicate$Compare$Type3;
        Predicate$Compare$Type predicate$Compare$Type4 = new Predicate$Compare$Type("LESSER", 3);
        LESSER = predicate$Compare$Type4;
        Predicate$Compare$Type predicate$Compare$Type5 = new Predicate$Compare$Type("LESSER_OR_EQUALS", 4);
        LESSER_OR_EQUALS = predicate$Compare$Type5;
        Predicate$Compare$Type[] predicate$Compare$TypeArr = {predicate$Compare$Type, predicate$Compare$Type2, predicate$Compare$Type3, predicate$Compare$Type4, predicate$Compare$Type5};
        $VALUES = predicate$Compare$TypeArr;
        $ENTRIES = a.a(predicate$Compare$TypeArr);
    }

    public static Predicate$Compare$Type valueOf(String str) {
        return (Predicate$Compare$Type) Enum.valueOf(Predicate$Compare$Type.class, str);
    }

    public static Predicate$Compare$Type[] values() {
        return (Predicate$Compare$Type[]) $VALUES.clone();
    }
}
