package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final /* synthetic */ class de7 implements uxs {
    public static final de7 a;
    private static final SerialDescriptor descriptor;

    static {
        de7 de7Var = new de7();
        a = de7Var;
        exv exvVar = new exv("flex.network.cache.model.CachingKey", de7Var);
        exvVar.j("rawValue", false);
        descriptor = exvVar;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new fe7(decoder.w(descriptor).p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((fe7) obj).a;
        Encoder i = encoder.i(descriptor);
        if (i == null) {
            return;
        }
        i.t(str);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
