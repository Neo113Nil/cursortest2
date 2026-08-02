package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class eyd implements uxs {
    public static final eyd a;
    private static final SerialDescriptor descriptor;

    static {
        eyd eydVar = new eyd();
        a = eydVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ConditionalAction2", eydVar, 2);
        pluginGeneratedSerialDescriptor.j("condition", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = iyd.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = iyd.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        v5x v5xVar = null;
        kr krVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                v5xVar = (v5x) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), v5xVar);
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
        return new iyd(i, v5xVar, krVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iyd iydVar = (iyd) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iyd.c;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), iydVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), iydVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
