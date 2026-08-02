package com.yandex.runtime.model;

/* loaded from: classes2.dex */
public class Frame {
    private final long duration;
    private final ModelProvider model;

    public Frame(ModelProvider modelProvider, long j) {
        this.model = modelProvider;
        this.duration = j;
    }

    public long getDuration() {
        return this.duration;
    }

    public ModelProvider getModel() {
        return this.model;
    }
}
