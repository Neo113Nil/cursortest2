package com.yandex.go.design.compose.ratingbar;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/design/compose/ratingbar/RatingBarStarStyle$AnimationParams$AnimationType", "", "Lcom/yandex/go/design/compose/ratingbar/RatingBarStarStyle$AnimationParams$AnimationType;", "ONE_SELECTED", "ALL_SELECTED", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RatingBarStarStyle$AnimationParams$AnimationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RatingBarStarStyle$AnimationParams$AnimationType[] $VALUES;
    public static final RatingBarStarStyle$AnimationParams$AnimationType ALL_SELECTED;
    public static final RatingBarStarStyle$AnimationParams$AnimationType ONE_SELECTED;

    static {
        RatingBarStarStyle$AnimationParams$AnimationType ratingBarStarStyle$AnimationParams$AnimationType = new RatingBarStarStyle$AnimationParams$AnimationType("ONE_SELECTED", 0);
        ONE_SELECTED = ratingBarStarStyle$AnimationParams$AnimationType;
        RatingBarStarStyle$AnimationParams$AnimationType ratingBarStarStyle$AnimationParams$AnimationType2 = new RatingBarStarStyle$AnimationParams$AnimationType("ALL_SELECTED", 1);
        ALL_SELECTED = ratingBarStarStyle$AnimationParams$AnimationType2;
        RatingBarStarStyle$AnimationParams$AnimationType[] ratingBarStarStyle$AnimationParams$AnimationTypeArr = {ratingBarStarStyle$AnimationParams$AnimationType, ratingBarStarStyle$AnimationParams$AnimationType2};
        $VALUES = ratingBarStarStyle$AnimationParams$AnimationTypeArr;
        $ENTRIES = kotlin.enums.a.a(ratingBarStarStyle$AnimationParams$AnimationTypeArr);
    }

    public static RatingBarStarStyle$AnimationParams$AnimationType valueOf(String str) {
        return (RatingBarStarStyle$AnimationParams$AnimationType) Enum.valueOf(RatingBarStarStyle$AnimationParams$AnimationType.class, str);
    }

    public static RatingBarStarStyle$AnimationParams$AnimationType[] values() {
        return (RatingBarStarStyle$AnimationParams$AnimationType[]) $VALUES.clone();
    }
}
