package one.video.exo.offline;

import kotlin.collections.builders.SetBuilder;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfflineRequirement.kt */
/* loaded from: classes8.dex */
public final class OfflineRequirement {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OfflineRequirement[] $VALUES;
    public static final a Companion;
    public static final OfflineRequirement DEVICE_CHARGING;
    public static final OfflineRequirement DEVICE_IDLE;
    public static final OfflineRequirement DEVICE_STORAGE_NOT_LOW;
    public static final OfflineRequirement NETWORK;
    public static final OfflineRequirement NETWORK_UNMETERED;
    private final int value;

    /* compiled from: OfflineRequirement.kt */
    public static final class a {
        public static SetBuilder a(int i) {
            SetBuilder setBuilder = new SetBuilder();
            for (OfflineRequirement offlineRequirement : OfflineRequirement.h()) {
                if ((offlineRequirement.i() & i) != 0) {
                    setBuilder.add(offlineRequirement);
                }
            }
            return setBuilder.d();
        }
    }

    static {
        OfflineRequirement offlineRequirement = new OfflineRequirement("NETWORK", 0, 1);
        NETWORK = offlineRequirement;
        OfflineRequirement offlineRequirement2 = new OfflineRequirement("NETWORK_UNMETERED", 1, 2);
        NETWORK_UNMETERED = offlineRequirement2;
        OfflineRequirement offlineRequirement3 = new OfflineRequirement("DEVICE_IDLE", 2, 4);
        DEVICE_IDLE = offlineRequirement3;
        OfflineRequirement offlineRequirement4 = new OfflineRequirement("DEVICE_CHARGING", 3, 8);
        DEVICE_CHARGING = offlineRequirement4;
        OfflineRequirement offlineRequirement5 = new OfflineRequirement("DEVICE_STORAGE_NOT_LOW", 4, 16);
        DEVICE_STORAGE_NOT_LOW = offlineRequirement5;
        OfflineRequirement[] offlineRequirementArr = {offlineRequirement, offlineRequirement2, offlineRequirement3, offlineRequirement4, offlineRequirement5};
        $VALUES = offlineRequirementArr;
        $ENTRIES = new asp(offlineRequirementArr);
        Companion = new a();
    }

    public OfflineRequirement(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<OfflineRequirement> h() {
        return $ENTRIES;
    }

    public static OfflineRequirement valueOf(String str) {
        return (OfflineRequirement) Enum.valueOf(OfflineRequirement.class, str);
    }

    public static OfflineRequirement[] values() {
        return (OfflineRequirement[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
