package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/savings/internal/entities/CellType;", "", "<init>", "(Ljava/lang/String;I)V", "OPENING", "EXISTING", "EXISTING_NON_DRAGGABLE", "SUGGEST_TO_CREATE", "CLOSING", "BANNER", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CellType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CellType[] $VALUES;
    public static final CellType OPENING = new CellType("OPENING", 0);
    public static final CellType EXISTING = new CellType("EXISTING", 1);
    public static final CellType EXISTING_NON_DRAGGABLE = new CellType("EXISTING_NON_DRAGGABLE", 2);
    public static final CellType SUGGEST_TO_CREATE = new CellType("SUGGEST_TO_CREATE", 3);
    public static final CellType CLOSING = new CellType("CLOSING", 4);
    public static final CellType BANNER = new CellType("BANNER", 5);

    private static final /* synthetic */ CellType[] $values() {
        return new CellType[]{OPENING, EXISTING, EXISTING_NON_DRAGGABLE, SUGGEST_TO_CREATE, CLOSING, BANNER};
    }

    static {
        CellType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CellType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CellType valueOf(String str) {
        return (CellType) Enum.valueOf(CellType.class, str);
    }

    public static CellType[] values() {
        return (CellType[]) $VALUES.clone();
    }
}
