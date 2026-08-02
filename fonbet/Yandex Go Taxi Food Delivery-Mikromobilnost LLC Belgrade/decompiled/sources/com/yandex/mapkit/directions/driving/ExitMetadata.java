package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ExitMetadata implements Serializable {
    private Integer numerationProximityMask;
    private Integer sequentialNumber;

    public ExitMetadata(Integer num, Integer num2) {
        this.sequentialNumber = num;
        this.numerationProximityMask = num2;
    }

    public Integer getNumerationProximityMask() {
        return this.numerationProximityMask;
    }

    public Integer getSequentialNumber() {
        return this.sequentialNumber;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.sequentialNumber = archive.add(this.sequentialNumber, true);
        this.numerationProximityMask = archive.add(this.numerationProximityMask, true);
    }

    public ExitMetadata() {
    }
}
