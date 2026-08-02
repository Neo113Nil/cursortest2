package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Type", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Type;", "DEFAULT", "CONDITIONAL", "PREFETCH", "FALLBACK", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaqueModel$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueModel$Type[] $VALUES;
    public static final PlaqueModel$Type CONDITIONAL;
    public static final PlaqueModel$Type DEFAULT;
    public static final PlaqueModel$Type FALLBACK;
    public static final PlaqueModel$Type PREFETCH;

    static {
        PlaqueModel$Type plaqueModel$Type = new PlaqueModel$Type("DEFAULT", 0);
        DEFAULT = plaqueModel$Type;
        PlaqueModel$Type plaqueModel$Type2 = new PlaqueModel$Type("CONDITIONAL", 1);
        CONDITIONAL = plaqueModel$Type2;
        PlaqueModel$Type plaqueModel$Type3 = new PlaqueModel$Type("PREFETCH", 2);
        PREFETCH = plaqueModel$Type3;
        PlaqueModel$Type plaqueModel$Type4 = new PlaqueModel$Type("FALLBACK", 3);
        FALLBACK = plaqueModel$Type4;
        PlaqueModel$Type[] plaqueModel$TypeArr = {plaqueModel$Type, plaqueModel$Type2, plaqueModel$Type3, plaqueModel$Type4};
        $VALUES = plaqueModel$TypeArr;
        $ENTRIES = a.a(plaqueModel$TypeArr);
    }

    public static PlaqueModel$Type valueOf(String str) {
        return (PlaqueModel$Type) Enum.valueOf(PlaqueModel$Type.class, str);
    }

    public static PlaqueModel$Type[] values() {
        return (PlaqueModel$Type[]) $VALUES.clone();
    }
}
