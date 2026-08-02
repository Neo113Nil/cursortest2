package com.yandex.mapkit.location;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class SubscriptionSettings implements Serializable {
    private Purpose purpose;
    private UseInBackground useInBackground;

    public SubscriptionSettings(UseInBackground useInBackground, Purpose purpose) {
        if (useInBackground == null) {
            ny61.g("Required field \"useInBackground\" cannot be null");
            throw null;
        }
        if (purpose == null) {
            ny61.g("Required field \"purpose\" cannot be null");
            throw null;
        }
        this.useInBackground = useInBackground;
        this.purpose = purpose;
    }

    public Purpose getPurpose() {
        return this.purpose;
    }

    public UseInBackground getUseInBackground() {
        return this.useInBackground;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.useInBackground = (UseInBackground) archive.add((Archive) this.useInBackground, false, (Class<Archive>) UseInBackground.class);
        this.purpose = (Purpose) archive.add((Archive) this.purpose, false, (Class<Archive>) Purpose.class);
    }

    public SubscriptionSettings() {
    }
}
