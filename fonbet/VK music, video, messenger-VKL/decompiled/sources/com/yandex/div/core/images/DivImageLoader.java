package com.yandex.div.core.images;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface DivImageLoader {
    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @NonNull
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    default LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    default LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImageBytes(str, divImageDownloadCallback);
    }
}
