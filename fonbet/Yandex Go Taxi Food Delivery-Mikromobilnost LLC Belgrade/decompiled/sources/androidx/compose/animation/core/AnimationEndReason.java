package androidx.compose.animation.core;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "BoundReached", "Finished", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnimationEndReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnimationEndReason[] $VALUES;
    public static final AnimationEndReason BoundReached;
    public static final AnimationEndReason Finished;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        BoundReached = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        Finished = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        $VALUES = animationEndReasonArr;
        $ENTRIES = kotlin.enums.a.a(animationEndReasonArr);
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) $VALUES.clone();
    }
}
