package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Source", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Source;", "REST", "GRAPHQL", JCP.RAW_PREFIX, "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaqueModel$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueModel$Source[] $VALUES;
    public static final PlaqueModel$Source GRAPHQL;
    public static final PlaqueModel$Source NONE;
    public static final PlaqueModel$Source REST;

    static {
        PlaqueModel$Source plaqueModel$Source = new PlaqueModel$Source("REST", 0);
        REST = plaqueModel$Source;
        PlaqueModel$Source plaqueModel$Source2 = new PlaqueModel$Source("GRAPHQL", 1);
        GRAPHQL = plaqueModel$Source2;
        PlaqueModel$Source plaqueModel$Source3 = new PlaqueModel$Source(JCP.RAW_PREFIX, 2);
        NONE = plaqueModel$Source3;
        PlaqueModel$Source[] plaqueModel$SourceArr = {plaqueModel$Source, plaqueModel$Source2, plaqueModel$Source3};
        $VALUES = plaqueModel$SourceArr;
        $ENTRIES = a.a(plaqueModel$SourceArr);
    }

    public static PlaqueModel$Source valueOf(String str) {
        return (PlaqueModel$Source) Enum.valueOf(PlaqueModel$Source.class, str);
    }

    public static PlaqueModel$Source[] values() {
        return (PlaqueModel$Source[]) $VALUES.clone();
    }
}
