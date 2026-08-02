package com.yandex.runtime.config;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.ny61;
import java.util.Map;

/* loaded from: classes15.dex */
public class UIExperiment implements Serializable {
    private ExperimentData data;
    private boolean data__is_initialized;
    private NativeObject nativeObject;
    private Map<String, String> parameters;
    private boolean parameters__is_initialized;

    public UIExperiment(ExperimentData experimentData, Map<String, String> map) {
        this.data__is_initialized = false;
        this.parameters__is_initialized = false;
        if (experimentData == null) {
            ny61.g("Required field \"data\" cannot be null");
            throw null;
        }
        if (map == null) {
            ny61.g("Required field \"parameters\" cannot be null");
            throw null;
        }
        this.nativeObject = init(experimentData, map);
        this.data = experimentData;
        this.data__is_initialized = true;
        this.parameters = map;
        this.parameters__is_initialized = true;
    }

    private native ExperimentData getData__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::config::UIExperiment";
    }

    private native Map<String, String> getParameters__Native();

    private native NativeObject init(ExperimentData experimentData, Map<String, String> map);

    public synchronized ExperimentData getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.data;
    }

    public synchronized Map<String, String> getParameters() {
        try {
            if (!this.parameters__is_initialized) {
                this.parameters = getParameters__Native();
                this.parameters__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.parameters;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getData(), false, (Class<Archive>) ExperimentData.class);
            archive.add(getParameters(), false, new StringHandler(), new StringHandler());
            return;
        }
        this.data = (ExperimentData) archive.add((Archive) this.data, false, (Class<Archive>) ExperimentData.class);
        this.data__is_initialized = true;
        Map<String, String> add = archive.add(this.parameters, false, new StringHandler(), new StringHandler());
        this.parameters = add;
        this.parameters__is_initialized = true;
        this.nativeObject = init(this.data, add);
    }

    public UIExperiment() {
        this.data__is_initialized = false;
        this.parameters__is_initialized = false;
    }

    private UIExperiment(NativeObject nativeObject) {
        this.data__is_initialized = false;
        this.parameters__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
