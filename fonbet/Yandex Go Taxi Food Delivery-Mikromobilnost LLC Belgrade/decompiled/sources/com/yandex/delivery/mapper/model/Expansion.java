package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/mapper/model/Expansion;", "", "EXPANDED", "ANCHORED", "COLLAPSED", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Expansion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Expansion[] $VALUES;
    public static final Expansion ANCHORED;
    public static final Expansion COLLAPSED;
    public static final Expansion EXPANDED;

    static {
        Expansion expansion = new Expansion("EXPANDED", 0);
        EXPANDED = expansion;
        Expansion expansion2 = new Expansion("ANCHORED", 1);
        ANCHORED = expansion2;
        Expansion expansion3 = new Expansion("COLLAPSED", 2);
        COLLAPSED = expansion3;
        Expansion[] expansionArr = {expansion, expansion2, expansion3};
        $VALUES = expansionArr;
        $ENTRIES = a.a(expansionArr);
    }

    public static Expansion valueOf(String str) {
        return (Expansion) Enum.valueOf(Expansion.class, str);
    }

    public static Expansion[] values() {
        return (Expansion[]) $VALUES.clone();
    }
}
