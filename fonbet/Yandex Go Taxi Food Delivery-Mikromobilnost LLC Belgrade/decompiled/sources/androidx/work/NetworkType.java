package androidx.work;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/work/NetworkType;", "", "NOT_REQUIRED", "CONNECTED", "UNMETERED", "NOT_ROAMING", "METERED", "TEMPORARILY_UNMETERED", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType CONNECTED;
    public static final NetworkType METERED;
    public static final NetworkType NOT_REQUIRED;
    public static final NetworkType NOT_ROAMING;
    public static final NetworkType TEMPORARILY_UNMETERED;
    public static final NetworkType UNMETERED;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        NOT_REQUIRED = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        CONNECTED = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        UNMETERED = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        NOT_ROAMING = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        METERED = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = networkType6;
        NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
        $VALUES = networkTypeArr;
        $ENTRIES = kotlin.enums.a.a(networkTypeArr);
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
