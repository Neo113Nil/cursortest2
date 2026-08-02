package coil.graphics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil/decode/DataSource;", "", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DataSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DataSource[] $VALUES;
    public static final DataSource DISK;
    public static final DataSource MEMORY;
    public static final DataSource MEMORY_CACHE;
    public static final DataSource NETWORK;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        MEMORY_CACHE = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        MEMORY = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        DISK = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        NETWORK = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        $VALUES = dataSourceArr;
        $ENTRIES = a.a(dataSourceArr);
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) $VALUES.clone();
    }
}
