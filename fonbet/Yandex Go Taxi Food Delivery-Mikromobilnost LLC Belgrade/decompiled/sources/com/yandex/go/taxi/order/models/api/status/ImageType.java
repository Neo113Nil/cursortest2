package com.yandex.go.taxi.order.models.api.status;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.syu;
import defpackage.wfv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/ImageType;", "", "Companion", "wfv", "ICON_SPOT", "PHOTO", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final wfv Companion;
    public static final ImageType ICON_SPOT;
    public static final ImageType PHOTO;

    static {
        ImageType imageType = new ImageType("ICON_SPOT", 0);
        ICON_SPOT = imageType;
        ImageType imageType2 = new ImageType("PHOTO", 1);
        PHOTO = imageType2;
        ImageType[] imageTypeArr = {imageType, imageType2};
        $VALUES = imageTypeArr;
        $ENTRIES = kotlin.enums.a.a(imageTypeArr);
        Companion = new wfv();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(19));
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }
}
