package com.yandex.mapkit.map;

import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;

@Deprecated
/* loaded from: classes15.dex */
public interface IconSet {
    void add(AnimatedImageProvider animatedImageProvider);

    void add(ImageProvider imageProvider);

    void add(String str, AnimatedImageProvider animatedImageProvider);

    void add(String str, ImageProvider imageProvider);

    boolean isValid();
}
