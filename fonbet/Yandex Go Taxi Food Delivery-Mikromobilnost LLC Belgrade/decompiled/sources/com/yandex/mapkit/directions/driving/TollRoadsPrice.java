package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.Money;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class TollRoadsPrice implements Serializable {
    private Money price;

    public TollRoadsPrice(Money money) {
        this.price = money;
    }

    public Money getPrice() {
        return this.price;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.price = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
    }

    public TollRoadsPrice() {
    }
}
