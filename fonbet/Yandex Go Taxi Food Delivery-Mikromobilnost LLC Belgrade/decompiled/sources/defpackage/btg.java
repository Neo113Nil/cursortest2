package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class btg implements uxs {
    public static final btg a;
    private static final SerialDescriptor descriptor;

    static {
        btg btgVar = new btg();
        a = btgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DebounceAction", btgVar, 3);
        pluginGeneratedSerialDescriptor.j("debounceId", false);
        pluginGeneratedSerialDescriptor.j("debounceMillis", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), pnz.a, dtg.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dtg.d;
        b.getClass();
        int i = 0;
        kr krVar = null;
        String str = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                krVar = (kr) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), krVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new dtg(i, j, krVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dtg dtgVar = (dtg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dtg.d;
        b.g(serialDescriptor, 0, auu0.a, dtgVar.a);
        b.s(serialDescriptor, 1, dtgVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), dtgVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
