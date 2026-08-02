package com.yandex.mapkit.car_info;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class SpeedValue implements Serializable {
    private Long age;
    private double speed;

    public SpeedValue(double d, Long l) {
        this.speed = d;
        this.age = l;
    }

    public Long getAge() {
        return this.age;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.speed = archive.add(this.speed);
        this.age = archive.add(this.age, true);
    }

    public SpeedValue() {
    }
}
