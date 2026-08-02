package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes8.dex */
public final class ebd0 extends wfz {
    public final String b;

    public ebd0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        this.b = serialDescriptor.f() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f() {
        return this.b;
    }
}
