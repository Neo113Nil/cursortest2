package com.yandex.mapkit.map;

import android.graphics.PointF;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Rect implements Serializable {
    private PointF max;
    private PointF min;

    public Rect(PointF pointF, PointF pointF2) {
        if (pointF == null) {
            ny61.g("Required field \"min\" cannot be null");
            throw null;
        }
        if (pointF2 == null) {
            ny61.g("Required field \"max\" cannot be null");
            throw null;
        }
        this.min = pointF;
        this.max = pointF2;
    }

    public PointF getMax() {
        return this.max;
    }

    public PointF getMin() {
        return this.min;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.min = archive.add(this.min, false);
        this.max = archive.add(this.max, false);
    }

    public Rect() {
    }
}
