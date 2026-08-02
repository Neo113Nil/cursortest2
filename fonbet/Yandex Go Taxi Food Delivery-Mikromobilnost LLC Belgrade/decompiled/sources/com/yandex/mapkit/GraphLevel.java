package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class GraphLevel implements Serializable {
    private int zBegin;
    private int zEnd;

    public GraphLevel(int i, int i2) {
        this.zBegin = i;
        this.zEnd = i2;
    }

    public int getZBegin() {
        return this.zBegin;
    }

    public int getZEnd() {
        return this.zEnd;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.zBegin = archive.add(this.zBegin);
        this.zEnd = archive.add(this.zEnd);
    }

    public GraphLevel() {
    }
}
