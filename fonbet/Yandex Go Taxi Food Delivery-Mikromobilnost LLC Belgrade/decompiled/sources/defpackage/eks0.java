package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class eks0 implements uxs {
    public static final eks0 a;
    private static final SerialDescriptor descriptor;

    static {
        eks0 eks0Var = new eks0();
        a = eks0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.skeleton.content.serializer.SkeletonContentSerializer.SkeletonContentSurrogate.Animations", eks0Var, 1);
        pluginGeneratedSerialDescriptor.j("onShow", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) gks0.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gks0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        tg2 tg2Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                tg2Var = (tg2) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), tg2Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new gks0(i, tg2Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, (KSerializer) gks0.b[0].getValue(), ((gks0) obj).a);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
