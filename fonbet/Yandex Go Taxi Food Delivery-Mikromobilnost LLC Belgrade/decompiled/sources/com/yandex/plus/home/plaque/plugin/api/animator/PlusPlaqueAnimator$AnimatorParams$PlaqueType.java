package com.yandex.plus.home.plaque.plugin.api.animator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/plaque/plugin/api/animator/PlusPlaqueAnimator$AnimatorParams$PlaqueType", "", "Lcom/yandex/plus/home/plaque/plugin/api/animator/PlusPlaqueAnimator$AnimatorParams$PlaqueType;", "DEFAULT", "CONDITIONAL", "plus-home-plaque-plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusPlaqueAnimator$AnimatorParams$PlaqueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPlaqueAnimator$AnimatorParams$PlaqueType[] $VALUES;
    public static final PlusPlaqueAnimator$AnimatorParams$PlaqueType CONDITIONAL;
    public static final PlusPlaqueAnimator$AnimatorParams$PlaqueType DEFAULT;

    static {
        PlusPlaqueAnimator$AnimatorParams$PlaqueType plusPlaqueAnimator$AnimatorParams$PlaqueType = new PlusPlaqueAnimator$AnimatorParams$PlaqueType("DEFAULT", 0);
        DEFAULT = plusPlaqueAnimator$AnimatorParams$PlaqueType;
        PlusPlaqueAnimator$AnimatorParams$PlaqueType plusPlaqueAnimator$AnimatorParams$PlaqueType2 = new PlusPlaqueAnimator$AnimatorParams$PlaqueType("CONDITIONAL", 1);
        CONDITIONAL = plusPlaqueAnimator$AnimatorParams$PlaqueType2;
        PlusPlaqueAnimator$AnimatorParams$PlaqueType[] plusPlaqueAnimator$AnimatorParams$PlaqueTypeArr = {plusPlaqueAnimator$AnimatorParams$PlaqueType, plusPlaqueAnimator$AnimatorParams$PlaqueType2};
        $VALUES = plusPlaqueAnimator$AnimatorParams$PlaqueTypeArr;
        $ENTRIES = a.a(plusPlaqueAnimator$AnimatorParams$PlaqueTypeArr);
    }

    public static PlusPlaqueAnimator$AnimatorParams$PlaqueType valueOf(String str) {
        return (PlusPlaqueAnimator$AnimatorParams$PlaqueType) Enum.valueOf(PlusPlaqueAnimator$AnimatorParams$PlaqueType.class, str);
    }

    public static PlusPlaqueAnimator$AnimatorParams$PlaqueType[] values() {
        return (PlusPlaqueAnimator$AnimatorParams$PlaqueType[]) $VALUES.clone();
    }
}
