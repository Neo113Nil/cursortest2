package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public final class ModelParams implements Serializable {
    private CSOrientation csOrientation;

    public enum CSOrientation {
        RIGHT_HANDED,
        LEFT_HANDED
    }

    public ModelParams(CSOrientation cSOrientation) {
        this.csOrientation = CSOrientation.RIGHT_HANDED;
        if (cSOrientation != null) {
            this.csOrientation = cSOrientation;
        } else {
            ny61.g("Required field \"csOrientation\" cannot be null");
            throw null;
        }
    }

    public CSOrientation getCsOrientation() {
        return this.csOrientation;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.csOrientation = (CSOrientation) archive.add((Archive) this.csOrientation, false, (Class<Archive>) CSOrientation.class);
    }

    public ModelParams setCsOrientation(CSOrientation cSOrientation) {
        if (cSOrientation != null) {
            this.csOrientation = cSOrientation;
            return this;
        }
        ny61.g("Required field \"csOrientation\" cannot be null");
        return null;
    }

    public ModelParams() {
        this.csOrientation = CSOrientation.RIGHT_HANDED;
    }
}
