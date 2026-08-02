package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public final /* synthetic */ class psd0 implements uxs {
    public static final psd0 a;
    private static final SerialDescriptor descriptor;

    static {
        psd0 psd0Var = new psd0();
        a = psd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.animation.generic.internal.transform.Point", psd0Var, 2);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.X, false);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.Y, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{norVar, norVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        float f = 0.0f;
        boolean z = true;
        int i = 0;
        float f2 = 0.0f;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                f2 = b.y(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new rsd0(i, f, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rsd0 rsd0Var = (rsd0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.z(serialDescriptor, 0, rsd0Var.a);
        b.z(serialDescriptor, 1, rsd0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
