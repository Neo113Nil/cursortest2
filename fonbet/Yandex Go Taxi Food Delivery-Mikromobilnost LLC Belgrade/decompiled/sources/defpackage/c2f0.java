package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class c2f0 extends ysy {
    public final String b;

    public c2f0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        this.b = serialDescriptor.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.b;
    }
}
