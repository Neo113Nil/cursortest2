package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class kyq0 implements uxs {
    public static final kyq0 a;
    private static final SerialDescriptor descriptor;

    static {
        kyq0 kyq0Var = new kyq0();
        a = kyq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.google.firebase.sessions.settings.SessionConfigs", kyq0Var, 5);
        pluginGeneratedSerialDescriptor.j("sessionsEnabled", false);
        pluginGeneratedSerialDescriptor.j("sessionSamplingRate", false);
        pluginGeneratedSerialDescriptor.j("sessionTimeoutSeconds", false);
        pluginGeneratedSerialDescriptor.j("cacheDurationSeconds", false);
        pluginGeneratedSerialDescriptor.j("cacheUpdatedTimeSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(z96.a);
        KSerializer n2 = qke.n(e6m.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, qke.n(h6wVar), qke.n(h6wVar), qke.n(pnz.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                d = (Double) b.s(serialDescriptor, 1, e6m.a, d);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else if (v == 3) {
                num2 = (Integer) b.s(serialDescriptor, 3, h6w.a, num2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                l = (Long) b.s(serialDescriptor, 4, pnz.a, l);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new myq0(i, bool, d, num, num2, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        myq0 myq0Var = (myq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, z96.a, myq0Var.a);
        b.g(serialDescriptor, 1, e6m.a, myq0Var.b);
        h6w h6wVar = h6w.a;
        b.g(serialDescriptor, 2, h6wVar, myq0Var.c);
        b.g(serialDescriptor, 3, h6wVar, myq0Var.d);
        b.g(serialDescriptor, 4, pnz.a, myq0Var.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
