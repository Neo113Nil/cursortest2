package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jph implements uxs {
    public static final jph a;
    private static final SerialDescriptor descriptor;

    static {
        jph jphVar = new jph();
        a = jphVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DelayedAction", jphVar, 2);
        pluginGeneratedSerialDescriptor.j("millis", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, uph.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uph.c;
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        kr krVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                krVar = (kr) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new uph(i, j, krVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uph uphVar = (uph) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uph.c;
        b.s(serialDescriptor, 0, uphVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), uphVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
