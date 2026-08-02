package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class dz11 implements KSerializer {
    public static final dz11 b = new dz11();
    public final /* synthetic */ o4o a = new o4o("kotlin.Unit", zy11.a);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return zy11.a;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        this.a.serialize(encoder, (zy11) obj);
    }
}
