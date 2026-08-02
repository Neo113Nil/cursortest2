package com.yandex.mapkit.places.panorama;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ImageSize implements Serializable {
    private int height;
    private int width;

    public ImageSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.width = archive.add(this.width);
        this.height = archive.add(this.height);
    }

    public ImageSize() {
    }
}
