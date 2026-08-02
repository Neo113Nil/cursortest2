package ru.ok.android.externcalls.sdk.ml.model;

import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvailableMLFeatureInfo.kt */
/* loaded from: classes9.dex */
public final class MLFeatureType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MLFeatureType[] $VALUES;
    private final String prefsKey;
    private final String subDirName;
    public static final MLFeatureType WS = new MLFeatureType("WS", 0, "ws", "ws");
    public static final MLFeatureType NS = new MLFeatureType("NS", 1, UcumUtils.UCUM_NANOSECONDS, UcumUtils.UCUM_NANOSECONDS);

    private static final /* synthetic */ MLFeatureType[] $values() {
        return new MLFeatureType[]{WS, NS};
    }

    static {
        MLFeatureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private MLFeatureType(String str, int i, String str2, String str3) {
        this.prefsKey = str2;
        this.subDirName = str3;
    }

    public static zrp<MLFeatureType> getEntries() {
        return $ENTRIES;
    }

    public static MLFeatureType valueOf(String str) {
        return (MLFeatureType) Enum.valueOf(MLFeatureType.class, str);
    }

    public static MLFeatureType[] values() {
        return (MLFeatureType[]) $VALUES.clone();
    }

    public final String getPrefsKey() {
        return this.prefsKey;
    }

    public final String getSubDirName() {
        return this.subDirName;
    }
}
