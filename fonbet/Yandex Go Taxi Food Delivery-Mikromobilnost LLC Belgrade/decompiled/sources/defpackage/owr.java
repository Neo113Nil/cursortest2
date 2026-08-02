package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final /* synthetic */ class owr implements uxs {
    public static final owr a;
    private static final SerialDescriptor descriptor;

    static {
        owr owrVar = new owr();
        a = owrVar;
        exv exvVar = new exv("com.yandex.quark.dialog.FolderId", owrVar);
        exvVar.j("value", false);
        descriptor = exvVar;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new qwr(decoder.w(descriptor).p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((qwr) obj).a;
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
