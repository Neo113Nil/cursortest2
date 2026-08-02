package com.yandex.go.image.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/image/api/domain/models/ImageModel$Tag$Theme", "", "Lcom/yandex/go/image/api/domain/models/ImageModel$Tag$Theme;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Light", "Dark", "go-client-android.libs.image_loader:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageModel$Tag$Theme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageModel$Tag$Theme[] $VALUES;
    public static final ImageModel$Tag$Theme Dark;
    public static final ImageModel$Tag$Theme Light;
    private final String id;

    static {
        ImageModel$Tag$Theme imageModel$Tag$Theme = new ImageModel$Tag$Theme("Light", 0, "light");
        Light = imageModel$Tag$Theme;
        ImageModel$Tag$Theme imageModel$Tag$Theme2 = new ImageModel$Tag$Theme("Dark", 1, "dark");
        Dark = imageModel$Tag$Theme2;
        ImageModel$Tag$Theme[] imageModel$Tag$ThemeArr = {imageModel$Tag$Theme, imageModel$Tag$Theme2};
        $VALUES = imageModel$Tag$ThemeArr;
        $ENTRIES = a.a(imageModel$Tag$ThemeArr);
    }

    public ImageModel$Tag$Theme(String str, int i, String str2) {
        this.id = str2;
    }

    public static ImageModel$Tag$Theme valueOf(String str) {
        return (ImageModel$Tag$Theme) Enum.valueOf(ImageModel$Tag$Theme.class, str);
    }

    public static ImageModel$Tag$Theme[] values() {
        return (ImageModel$Tag$Theme[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
