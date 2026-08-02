package androidx.compose.material3.tokens;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;", "", "DefaultSpatial", "FastSpatial", "SlowSpatial", "DefaultEffects", "FastEffects", "SlowEffects", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MotionSchemeKeyTokens {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MotionSchemeKeyTokens[] $VALUES;
    public static final MotionSchemeKeyTokens DefaultEffects;
    public static final MotionSchemeKeyTokens DefaultSpatial;
    public static final MotionSchemeKeyTokens FastEffects;
    public static final MotionSchemeKeyTokens FastSpatial;
    public static final MotionSchemeKeyTokens SlowEffects;
    public static final MotionSchemeKeyTokens SlowSpatial;

    static {
        MotionSchemeKeyTokens motionSchemeKeyTokens = new MotionSchemeKeyTokens("DefaultSpatial", 0);
        DefaultSpatial = motionSchemeKeyTokens;
        MotionSchemeKeyTokens motionSchemeKeyTokens2 = new MotionSchemeKeyTokens("FastSpatial", 1);
        FastSpatial = motionSchemeKeyTokens2;
        MotionSchemeKeyTokens motionSchemeKeyTokens3 = new MotionSchemeKeyTokens("SlowSpatial", 2);
        SlowSpatial = motionSchemeKeyTokens3;
        MotionSchemeKeyTokens motionSchemeKeyTokens4 = new MotionSchemeKeyTokens("DefaultEffects", 3);
        DefaultEffects = motionSchemeKeyTokens4;
        MotionSchemeKeyTokens motionSchemeKeyTokens5 = new MotionSchemeKeyTokens("FastEffects", 4);
        FastEffects = motionSchemeKeyTokens5;
        MotionSchemeKeyTokens motionSchemeKeyTokens6 = new MotionSchemeKeyTokens("SlowEffects", 5);
        SlowEffects = motionSchemeKeyTokens6;
        MotionSchemeKeyTokens[] motionSchemeKeyTokensArr = {motionSchemeKeyTokens, motionSchemeKeyTokens2, motionSchemeKeyTokens3, motionSchemeKeyTokens4, motionSchemeKeyTokens5, motionSchemeKeyTokens6};
        $VALUES = motionSchemeKeyTokensArr;
        $ENTRIES = a.a(motionSchemeKeyTokensArr);
    }

    public static MotionSchemeKeyTokens valueOf(String str) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, str);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) $VALUES.clone();
    }
}
