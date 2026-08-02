package coil3.graphics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/decode/DataSource;", "", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.decode.DataSource, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0136DataSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EnumC0136DataSource[] $VALUES;
    public static final EnumC0136DataSource DISK;
    public static final EnumC0136DataSource MEMORY;
    public static final EnumC0136DataSource MEMORY_CACHE;
    public static final EnumC0136DataSource NETWORK;

    static {
        EnumC0136DataSource enumC0136DataSource = new EnumC0136DataSource("MEMORY_CACHE", 0);
        MEMORY_CACHE = enumC0136DataSource;
        EnumC0136DataSource enumC0136DataSource2 = new EnumC0136DataSource("MEMORY", 1);
        MEMORY = enumC0136DataSource2;
        EnumC0136DataSource enumC0136DataSource3 = new EnumC0136DataSource("DISK", 2);
        DISK = enumC0136DataSource3;
        EnumC0136DataSource enumC0136DataSource4 = new EnumC0136DataSource("NETWORK", 3);
        NETWORK = enumC0136DataSource4;
        EnumC0136DataSource[] enumC0136DataSourceArr = {enumC0136DataSource, enumC0136DataSource2, enumC0136DataSource3, enumC0136DataSource4};
        $VALUES = enumC0136DataSourceArr;
        $ENTRIES = a.a(enumC0136DataSourceArr);
    }

    public static EnumC0136DataSource valueOf(String str) {
        return (EnumC0136DataSource) Enum.valueOf(EnumC0136DataSource.class, str);
    }

    public static EnumC0136DataSource[] values() {
        return (EnumC0136DataSource[]) $VALUES.clone();
    }
}
