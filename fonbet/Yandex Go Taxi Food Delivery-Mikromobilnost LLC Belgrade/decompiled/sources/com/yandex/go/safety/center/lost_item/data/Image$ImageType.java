package com.yandex.go.safety.center.lost_item.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/safety/center/lost_item/data/Image$ImageType", "", "Lcom/yandex/go/safety/center/lost_item/data/Image$ImageType;", "ICON", "IMAGE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Image$ImageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Image$ImageType[] $VALUES;
    public static final Image$ImageType ICON;
    public static final Image$ImageType IMAGE;
    public static final Image$ImageType UNKNOWN;

    static {
        Image$ImageType image$ImageType = new Image$ImageType("ICON", 0);
        ICON = image$ImageType;
        Image$ImageType image$ImageType2 = new Image$ImageType("IMAGE", 1);
        IMAGE = image$ImageType2;
        Image$ImageType image$ImageType3 = new Image$ImageType("UNKNOWN", 2);
        UNKNOWN = image$ImageType3;
        Image$ImageType[] image$ImageTypeArr = {image$ImageType, image$ImageType2, image$ImageType3};
        $VALUES = image$ImageTypeArr;
        $ENTRIES = kotlin.enums.a.a(image$ImageTypeArr);
    }

    public static Image$ImageType valueOf(String str) {
        return (Image$ImageType) Enum.valueOf(Image$ImageType.class, str);
    }

    public static Image$ImageType[] values() {
        return (Image$ImageType[]) $VALUES.clone();
    }
}
