package com.yandex.plus.home.plaque.feature.api.anim;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/plaque/feature/api/anim/PlaqueAnimator$PlaqueType", "", "Lcom/yandex/plus/home/plaque/feature/api/anim/PlaqueAnimator$PlaqueType;", "DEFAULT", "CONDITIONAL", "plus-home-plaque-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaqueAnimator$PlaqueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueAnimator$PlaqueType[] $VALUES;
    public static final PlaqueAnimator$PlaqueType CONDITIONAL;
    public static final PlaqueAnimator$PlaqueType DEFAULT;

    static {
        PlaqueAnimator$PlaqueType plaqueAnimator$PlaqueType = new PlaqueAnimator$PlaqueType("DEFAULT", 0);
        DEFAULT = plaqueAnimator$PlaqueType;
        PlaqueAnimator$PlaqueType plaqueAnimator$PlaqueType2 = new PlaqueAnimator$PlaqueType("CONDITIONAL", 1);
        CONDITIONAL = plaqueAnimator$PlaqueType2;
        PlaqueAnimator$PlaqueType[] plaqueAnimator$PlaqueTypeArr = {plaqueAnimator$PlaqueType, plaqueAnimator$PlaqueType2};
        $VALUES = plaqueAnimator$PlaqueTypeArr;
        $ENTRIES = a.a(plaqueAnimator$PlaqueTypeArr);
    }

    public static PlaqueAnimator$PlaqueType valueOf(String str) {
        return (PlaqueAnimator$PlaqueType) Enum.valueOf(PlaqueAnimator$PlaqueType.class, str);
    }

    public static PlaqueAnimator$PlaqueType[] values() {
        return (PlaqueAnimator$PlaqueType[]) $VALUES.clone();
    }
}
