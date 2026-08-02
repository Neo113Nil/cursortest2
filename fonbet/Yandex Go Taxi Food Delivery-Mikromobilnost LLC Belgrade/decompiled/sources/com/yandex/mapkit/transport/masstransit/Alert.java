package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Alert implements Serializable {
    private Effect effect;
    private boolean effect__is_initialized;
    private NativeObject nativeObject;

    public enum Effect {
        UNKNOWN_EFFECT,
        NO_SERVICE
    }

    public Alert(Effect effect) {
        this.effect__is_initialized = false;
        this.nativeObject = init(effect);
        this.effect = effect;
        this.effect__is_initialized = true;
    }

    private native Effect getEffect__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Alert";
    }

    private native NativeObject init(Effect effect);

    public synchronized Effect getEffect() {
        try {
            if (!this.effect__is_initialized) {
                this.effect = getEffect__Native();
                this.effect__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.effect;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getEffect(), true, (Class<Archive>) Effect.class);
            return;
        }
        Effect effect = (Effect) archive.add((Archive) this.effect, true, (Class<Archive>) Effect.class);
        this.effect = effect;
        this.effect__is_initialized = true;
        this.nativeObject = init(effect);
    }

    public Alert() {
        this.effect__is_initialized = false;
    }

    private Alert(NativeObject nativeObject) {
        this.effect__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
