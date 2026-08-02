package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class BytesHandler implements ArchivingHandler<byte[]> {
    private final boolean isOptional;

    public BytesHandler(boolean z) {
        this.isOptional = z;
    }

    public BytesHandler() {
        this(false);
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public byte[] add(byte[] bArr, Archive archive) {
        return archive.add(bArr, this.isOptional);
    }
}
