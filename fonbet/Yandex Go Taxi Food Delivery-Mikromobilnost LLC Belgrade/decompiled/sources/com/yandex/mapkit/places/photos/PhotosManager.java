package com.yandex.mapkit.places.photos;

import com.yandex.mapkit.places.photos.ImageSession;
import java.util.List;

/* loaded from: classes15.dex */
public interface PhotosManager {
    void clear();

    ImageSession image(String str, String str2, ImageSession.ImageListener imageListener);

    PhotoSession photos(String str);

    PhotoSession photos(String str, List<String> list);

    PhotoSession photos(String str, List<String> list, List<String> list2);
}
