package com.yandex.mapkit.navigation.automotive;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public class SpeedLimitsRules implements Serializable {
    private Type expressway;
    private Type rural;
    private Type urban;

    public enum Type {
        ABSOLUTE,
        RELATIVE
    }

    public SpeedLimitsRules(Type type, Type type2, Type type3) {
        if (type == null) {
            ny61.g("Required field \"urban\" cannot be null");
            throw null;
        }
        if (type2 == null) {
            ny61.g("Required field \"rural\" cannot be null");
            throw null;
        }
        if (type3 == null) {
            ny61.g("Required field \"expressway\" cannot be null");
            throw null;
        }
        this.urban = type;
        this.rural = type2;
        this.expressway = type3;
    }

    public Type getExpressway() {
        return this.expressway;
    }

    public Type getRural() {
        return this.rural;
    }

    public Type getUrban() {
        return this.urban;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.urban = (Type) archive.add((Archive) this.urban, false, (Class<Archive>) Type.class);
        this.rural = (Type) archive.add((Archive) this.rural, false, (Class<Archive>) Type.class);
        this.expressway = (Type) archive.add((Archive) this.expressway, false, (Class<Archive>) Type.class);
    }

    public SpeedLimitsRules() {
    }
}
