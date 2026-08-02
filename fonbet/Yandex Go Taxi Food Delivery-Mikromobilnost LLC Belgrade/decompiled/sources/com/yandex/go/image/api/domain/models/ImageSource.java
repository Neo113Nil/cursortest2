package com.yandex.go.image.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/image/api/domain/models/ImageSource;", "", "MEMORY", "DISK", "NETWORK", "go-client-android.libs.image_loader:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageSource[] $VALUES;
    public static final ImageSource DISK;
    public static final ImageSource MEMORY;
    public static final ImageSource NETWORK;

    static {
        ImageSource imageSource = new ImageSource("MEMORY", 0);
        MEMORY = imageSource;
        ImageSource imageSource2 = new ImageSource("DISK", 1);
        DISK = imageSource2;
        ImageSource imageSource3 = new ImageSource("NETWORK", 2);
        NETWORK = imageSource3;
        ImageSource[] imageSourceArr = {imageSource, imageSource2, imageSource3};
        $VALUES = imageSourceArr;
        $ENTRIES = a.a(imageSourceArr);
    }

    public static ImageSource valueOf(String str) {
        return (ImageSource) Enum.valueOf(ImageSource.class, str);
    }

    public static ImageSource[] values() {
        return (ImageSource[]) $VALUES.clone();
    }
}
