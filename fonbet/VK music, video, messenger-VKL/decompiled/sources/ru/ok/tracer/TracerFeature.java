package ru.ok.tracer;

import xsna.go9;

/* compiled from: TracerFeature.kt */
/* loaded from: classes11.dex */
public final class TracerFeature {
    private final String name;

    public TracerFeature(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return go9.b("TracerFeature::", this.name);
    }
}
