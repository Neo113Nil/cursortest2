package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class n8r implements uxs {
    public static final n8r a;
    private static final SerialDescriptor descriptor;

    static {
        n8r n8rVar = new n8r();
        a = n8rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.fingerprint.FingerprintCurrentActivity", n8rVar, 3);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("values", false);
        pluginGeneratedSerialDescriptor.j("confidence", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p8r.d;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, i3yVarArr[1].getValue(), h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p8r.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new p8r(i, i2, i3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p8r p8rVar = (p8r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p8r.d;
        b.A(0, p8rVar.a, serialDescriptor);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), p8rVar.b);
        b.A(2, p8rVar.c, serialDescriptor);
        b.c(serialDescriptor);
    }
}
