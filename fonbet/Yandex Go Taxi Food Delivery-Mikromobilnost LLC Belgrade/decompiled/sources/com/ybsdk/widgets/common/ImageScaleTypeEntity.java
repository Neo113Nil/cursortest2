package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/widgets/common/ImageScaleTypeEntity;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FIT_TOP", "FIT_CENTER", "FIT_BOTTOM", "FIT_XY", "DEFAULT", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageScaleTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageScaleTypeEntity[] $VALUES;
    private final int value;
    public static final ImageScaleTypeEntity FIT_TOP = new ImageScaleTypeEntity("FIT_TOP", 0, 0);
    public static final ImageScaleTypeEntity FIT_CENTER = new ImageScaleTypeEntity("FIT_CENTER", 1, 1);
    public static final ImageScaleTypeEntity FIT_BOTTOM = new ImageScaleTypeEntity("FIT_BOTTOM", 2, 2);
    public static final ImageScaleTypeEntity FIT_XY = new ImageScaleTypeEntity("FIT_XY", 3, 3);
    public static final ImageScaleTypeEntity DEFAULT = new ImageScaleTypeEntity("DEFAULT", 4, 4);

    private static final /* synthetic */ ImageScaleTypeEntity[] $values() {
        return new ImageScaleTypeEntity[]{FIT_TOP, FIT_CENTER, FIT_BOTTOM, FIT_XY, DEFAULT};
    }

    static {
        ImageScaleTypeEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ImageScaleTypeEntity(String str, int i, int i2) {
        this.value = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ImageScaleTypeEntity valueOf(String str) {
        return (ImageScaleTypeEntity) Enum.valueOf(ImageScaleTypeEntity.class, str);
    }

    public static ImageScaleTypeEntity[] values() {
        return (ImageScaleTypeEntity[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
