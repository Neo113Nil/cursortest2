package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class MetrikaObjectMetadata implements BaseMetadata, Serializable {
    private String counter;
    private boolean counter__is_initialized;
    private Goals goals;
    private boolean goals__is_initialized;
    private NativeObject nativeObject;

    public MetrikaObjectMetadata(String str, Goals goals) {
        this.counter__is_initialized = false;
        this.goals__is_initialized = false;
        this.nativeObject = init(str, goals);
        this.counter = str;
        this.counter__is_initialized = true;
        this.goals = goals;
        this.goals__is_initialized = true;
    }

    private native String getCounter__Native();

    private native Goals getGoals__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::MetrikaObjectMetadata";
    }

    private native NativeObject init(String str, Goals goals);

    public synchronized String getCounter() {
        try {
            if (!this.counter__is_initialized) {
                this.counter = getCounter__Native();
                this.counter__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.counter;
    }

    public synchronized Goals getGoals() {
        try {
            if (!this.goals__is_initialized) {
                this.goals = getGoals__Native();
                this.goals__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.goals;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCounter(), true);
            archive.add((Archive) getGoals(), true, (Class<Archive>) Goals.class);
            return;
        }
        this.counter = archive.add(this.counter, true);
        this.counter__is_initialized = true;
        Goals goals = (Goals) archive.add((Archive) this.goals, true, (Class<Archive>) Goals.class);
        this.goals = goals;
        this.goals__is_initialized = true;
        this.nativeObject = init(this.counter, goals);
    }

    public MetrikaObjectMetadata() {
        this.counter__is_initialized = false;
        this.goals__is_initialized = false;
    }

    private MetrikaObjectMetadata(NativeObject nativeObject) {
        this.counter__is_initialized = false;
        this.goals__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
