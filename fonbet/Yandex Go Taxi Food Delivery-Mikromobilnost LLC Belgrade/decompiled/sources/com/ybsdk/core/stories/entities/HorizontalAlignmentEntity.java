package com.ybsdk.core.stories.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/stories/entities/HorizontalAlignmentEntity;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalAlignmentEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HorizontalAlignmentEntity[] $VALUES;
    public static final HorizontalAlignmentEntity LEFT = new HorizontalAlignmentEntity("LEFT", 0);
    public static final HorizontalAlignmentEntity CENTER = new HorizontalAlignmentEntity("CENTER", 1);
    public static final HorizontalAlignmentEntity RIGHT = new HorizontalAlignmentEntity("RIGHT", 2);

    private static final /* synthetic */ HorizontalAlignmentEntity[] $values() {
        return new HorizontalAlignmentEntity[]{LEFT, CENTER, RIGHT};
    }

    static {
        HorizontalAlignmentEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HorizontalAlignmentEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HorizontalAlignmentEntity valueOf(String str) {
        return (HorizontalAlignmentEntity) Enum.valueOf(HorizontalAlignmentEntity.class, str);
    }

    public static HorizontalAlignmentEntity[] values() {
        return (HorizontalAlignmentEntity[]) $VALUES.clone();
    }
}
