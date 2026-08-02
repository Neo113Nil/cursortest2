package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class nwg implements uxs {
    public static final nwg a;
    private static final SerialDescriptor descriptor;

    static {
        nwg nwgVar = new nwg();
        a = nwgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.debug.DebugSection", nwgVar, 5);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, false);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.j("crit", false);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("reloadable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, n, qke.n(z96Var), auu0Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new pwg(i, str, str2, bool, str3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pwg pwgVar = (pwg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = pwgVar.a;
        boolean z = pwgVar.e;
        String str2 = pwgVar.d;
        b.o(serialDescriptor, 0, str);
        b.g(serialDescriptor, 1, auu0.a, pwgVar.b);
        b.g(serialDescriptor, 2, z96.a, pwgVar.c);
        if (b.F() || !jl40.l(str2, UUID.randomUUID().toString())) {
            b.o(serialDescriptor, 3, str2);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 4, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
