package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/widgets/common/ImageScaleTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_TOP", "FIT_CENTER", "FIT_BOTTOM", "FIT_XY", "LEGACY", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageScaleTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageScaleTypeDto[] $VALUES;
    public static final ImageScaleTypeDto FIT_TOP = new ImageScaleTypeDto("FIT_TOP", 0);
    public static final ImageScaleTypeDto FIT_CENTER = new ImageScaleTypeDto("FIT_CENTER", 1);
    public static final ImageScaleTypeDto FIT_BOTTOM = new ImageScaleTypeDto("FIT_BOTTOM", 2);
    public static final ImageScaleTypeDto FIT_XY = new ImageScaleTypeDto("FIT_XY", 3);
    public static final ImageScaleTypeDto LEGACY = new ImageScaleTypeDto("LEGACY", 4);

    private static final /* synthetic */ ImageScaleTypeDto[] $values() {
        return new ImageScaleTypeDto[]{FIT_TOP, FIT_CENTER, FIT_BOTTOM, FIT_XY, LEGACY};
    }

    static {
        ImageScaleTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ImageScaleTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ImageScaleTypeDto valueOf(String str) {
        return (ImageScaleTypeDto) Enum.valueOf(ImageScaleTypeDto.class, str);
    }

    public static ImageScaleTypeDto[] values() {
        return (ImageScaleTypeDto[]) $VALUES.clone();
    }
}
