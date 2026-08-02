package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class IntegerHandler implements ArchivingHandler<Integer> {
    private final boolean isOptional;

    public IntegerHandler(boolean z) {
        this.isOptional = z;
    }

    public IntegerHandler() {
        this(false);
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Integer add(Integer num, Archive archive) {
        return archive.add(num, this.isOptional);
    }
}
