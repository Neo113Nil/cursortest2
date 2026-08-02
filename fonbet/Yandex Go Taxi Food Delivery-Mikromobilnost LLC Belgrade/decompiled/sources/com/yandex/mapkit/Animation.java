package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes8.dex */
public class Animation implements Serializable {
    private float duration;
    private Type type;

    public enum Type {
        SMOOTH,
        LINEAR
    }

    public Animation(Type type, float f) {
        this.type = Type.LINEAR;
        this.duration = 0.0f;
        if (type == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.type = type;
        this.duration = f;
    }

    public float getDuration() {
        return this.duration;
    }

    public Type getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (Type) archive.add((Archive) this.type, false, (Class<Archive>) Type.class);
        this.duration = archive.add(this.duration);
    }

    public Animation() {
        this.type = Type.LINEAR;
        this.duration = 0.0f;
    }
}
