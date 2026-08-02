package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class BooleanHandler implements ArchivingHandler<Boolean> {
    private final boolean isOptional;

    public BooleanHandler(boolean z) {
        this.isOptional = z;
    }

    public BooleanHandler() {
        this(false);
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Boolean add(Boolean bool, Archive archive) {
        return archive.add(bool, this.isOptional);
    }
}
