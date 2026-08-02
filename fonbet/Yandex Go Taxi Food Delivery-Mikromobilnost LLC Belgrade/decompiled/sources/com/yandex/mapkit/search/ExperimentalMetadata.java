package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class ExperimentalMetadata implements BaseMetadata, Serializable {
    private ExperimentalStorage experimentalStorage;
    private boolean experimentalStorage__is_initialized;
    private NativeObject nativeObject;

    public ExperimentalMetadata(ExperimentalStorage experimentalStorage) {
        this.experimentalStorage__is_initialized = false;
        this.nativeObject = init(experimentalStorage);
        this.experimentalStorage = experimentalStorage;
        this.experimentalStorage__is_initialized = true;
    }

    private native ExperimentalStorage getExperimentalStorage__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ExperimentalMetadata";
    }

    private native NativeObject init(ExperimentalStorage experimentalStorage);

    public synchronized ExperimentalStorage getExperimentalStorage() {
        try {
            if (!this.experimentalStorage__is_initialized) {
                this.experimentalStorage = getExperimentalStorage__Native();
                this.experimentalStorage__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.experimentalStorage;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getExperimentalStorage(), true, (Class<Archive>) ExperimentalStorage.class);
            return;
        }
        ExperimentalStorage experimentalStorage = (ExperimentalStorage) archive.add((Archive) this.experimentalStorage, true, (Class<Archive>) ExperimentalStorage.class);
        this.experimentalStorage = experimentalStorage;
        this.experimentalStorage__is_initialized = true;
        this.nativeObject = init(experimentalStorage);
    }

    public ExperimentalMetadata() {
        this.experimentalStorage__is_initialized = false;
    }

    private ExperimentalMetadata(NativeObject nativeObject) {
        this.experimentalStorage__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
