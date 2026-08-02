package com.yandex.images;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class ImageDownloadReporter$Status {
    private static final /* synthetic */ ImageDownloadReporter$Status[] $VALUES;
    public static final ImageDownloadReporter$Status ENQUEUED;
    public static final ImageDownloadReporter$Status FAILED;
    public static final ImageDownloadReporter$Status NO_CONNECTIVITY;
    public static final ImageDownloadReporter$Status SUCCEED_FROM_CACHE;
    public static final ImageDownloadReporter$Status SUCCEED_FROM_NETWORK;

    static {
        ImageDownloadReporter$Status imageDownloadReporter$Status = new ImageDownloadReporter$Status("ENQUEUED", 0);
        ENQUEUED = imageDownloadReporter$Status;
        ImageDownloadReporter$Status imageDownloadReporter$Status2 = new ImageDownloadReporter$Status("SUCCEED_FROM_CACHE", 1);
        SUCCEED_FROM_CACHE = imageDownloadReporter$Status2;
        ImageDownloadReporter$Status imageDownloadReporter$Status3 = new ImageDownloadReporter$Status("SUCCEED_FROM_NETWORK", 2);
        SUCCEED_FROM_NETWORK = imageDownloadReporter$Status3;
        ImageDownloadReporter$Status imageDownloadReporter$Status4 = new ImageDownloadReporter$Status("FAILED", 3);
        FAILED = imageDownloadReporter$Status4;
        ImageDownloadReporter$Status imageDownloadReporter$Status5 = new ImageDownloadReporter$Status("NO_CONNECTIVITY", 4);
        NO_CONNECTIVITY = imageDownloadReporter$Status5;
        $VALUES = new ImageDownloadReporter$Status[]{imageDownloadReporter$Status, imageDownloadReporter$Status2, imageDownloadReporter$Status3, imageDownloadReporter$Status4, imageDownloadReporter$Status5};
    }

    public static ImageDownloadReporter$Status valueOf(String str) {
        return (ImageDownloadReporter$Status) Enum.valueOf(ImageDownloadReporter$Status.class, str);
    }

    public static ImageDownloadReporter$Status[] values() {
        return (ImageDownloadReporter$Status[]) $VALUES.clone();
    }
}
