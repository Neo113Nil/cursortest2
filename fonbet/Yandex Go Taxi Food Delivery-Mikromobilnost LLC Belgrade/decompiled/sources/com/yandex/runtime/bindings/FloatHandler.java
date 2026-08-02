package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class FloatHandler implements ArchivingHandler<Float> {
    private final boolean isOptional;

    public FloatHandler(boolean z) {
        this.isOptional = z;
    }

    public FloatHandler() {
        this(false);
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Float add(Float f, Archive archive) {
        return archive.add(f, this.isOptional);
    }
}
