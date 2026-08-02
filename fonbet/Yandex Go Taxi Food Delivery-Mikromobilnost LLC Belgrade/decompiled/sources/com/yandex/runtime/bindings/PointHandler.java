package com.yandex.runtime.bindings;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public class PointHandler implements ArchivingHandler<PointF> {
    private final boolean isOptional;

    public PointHandler(boolean z) {
        this.isOptional = z;
    }

    public PointHandler() {
        this(false);
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public PointF add(PointF pointF, Archive archive) {
        return archive.add(pointF, this.isOptional);
    }
}
