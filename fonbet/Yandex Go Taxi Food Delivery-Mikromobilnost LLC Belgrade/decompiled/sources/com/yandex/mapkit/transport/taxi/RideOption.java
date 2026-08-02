package com.yandex.mapkit.transport.taxi;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.Money;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RideOption implements Serializable {
    private Money cost;
    private boolean isMinPrice;
    private LocalizedValue waitingTime;

    public RideOption(LocalizedValue localizedValue, Money money, boolean z) {
        if (localizedValue == null) {
            ny61.g("Required field \"waitingTime\" cannot be null");
            throw null;
        }
        if (money == null) {
            ny61.g("Required field \"cost\" cannot be null");
            throw null;
        }
        this.waitingTime = localizedValue;
        this.cost = money;
        this.isMinPrice = z;
    }

    public Money getCost() {
        return this.cost;
    }

    public boolean getIsMinPrice() {
        return this.isMinPrice;
    }

    public LocalizedValue getWaitingTime() {
        return this.waitingTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.waitingTime = (LocalizedValue) archive.add((Archive) this.waitingTime, false, (Class<Archive>) LocalizedValue.class);
        this.cost = (Money) archive.add((Archive) this.cost, false, (Class<Archive>) Money.class);
        this.isMinPrice = archive.add(this.isMinPrice);
    }

    public RideOption() {
    }
}
