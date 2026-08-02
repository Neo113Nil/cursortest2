package com.yx360.design.compose.atoms;

import defpackage.dtm;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yx360/design/compose/atoms/DsStatus$Preset", "Ldtm;", "", "Lcom/yx360/design/compose/atoms/DsStatus$Preset;", "Success", "Danger", "Unknown", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsStatus$Preset implements dtm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsStatus$Preset[] $VALUES;
    public static final DsStatus$Preset Danger;
    public static final DsStatus$Preset Success;
    public static final DsStatus$Preset Unknown;

    static {
        DsStatus$Preset dsStatus$Preset = new DsStatus$Preset("Success", 0);
        Success = dsStatus$Preset;
        DsStatus$Preset dsStatus$Preset2 = new DsStatus$Preset("Danger", 1);
        Danger = dsStatus$Preset2;
        DsStatus$Preset dsStatus$Preset3 = new DsStatus$Preset("Unknown", 2);
        Unknown = dsStatus$Preset3;
        DsStatus$Preset[] dsStatus$PresetArr = {dsStatus$Preset, dsStatus$Preset2, dsStatus$Preset3};
        $VALUES = dsStatus$PresetArr;
        $ENTRIES = kotlin.enums.a.a(dsStatus$PresetArr);
    }

    public static DsStatus$Preset valueOf(String str) {
        return (DsStatus$Preset) Enum.valueOf(DsStatus$Preset.class, str);
    }

    public static DsStatus$Preset[] values() {
        return (DsStatus$Preset[]) $VALUES.clone();
    }
}
