package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class hsn implements uxs {
    public static final hsn a;
    private static final SerialDescriptor descriptor;

    static {
        hsn hsnVar = new hsn();
        a = hsnVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.EmailResponse", hsnVar, 2);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new jsn(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jsn jsnVar = (jsn) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || jsnVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, jsnVar.a);
        }
        if (b.F() || jsnVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, jsnVar.b);
        }
        b.c(serialDescriptor);
    }
}
