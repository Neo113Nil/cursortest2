package com.yandex.images;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class ImageManager$From {
    private static final /* synthetic */ ImageManager$From[] $VALUES;
    public static final ImageManager$From DISK;
    public static final ImageManager$From MEMORY;
    public static final ImageManager$From NETWORK;

    static {
        ImageManager$From imageManager$From = new ImageManager$From("NETWORK", 0);
        NETWORK = imageManager$From;
        ImageManager$From imageManager$From2 = new ImageManager$From("DISK", 1);
        DISK = imageManager$From2;
        ImageManager$From imageManager$From3 = new ImageManager$From("MEMORY", 2);
        MEMORY = imageManager$From3;
        $VALUES = new ImageManager$From[]{imageManager$From, imageManager$From2, imageManager$From3};
    }

    public static ImageManager$From valueOf(String str) {
        return (ImageManager$From) Enum.valueOf(ImageManager$From.class, str);
    }

    public static ImageManager$From[] values() {
        return (ImageManager$From[]) $VALUES.clone();
    }
}
