package com.yandex.mapkit.search.search_layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Size implements Serializable {
    private double height;
    private double width;

    public Size(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.width = archive.add(this.width);
        this.height = archive.add(this.height);
    }

    public Size() {
    }
}
