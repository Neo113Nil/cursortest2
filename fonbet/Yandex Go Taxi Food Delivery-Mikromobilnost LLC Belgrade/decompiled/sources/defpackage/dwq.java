package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class dwq implements uxs {
    public static final dwq a;
    private static final SerialDescriptor descriptor;

    static {
        dwq dwqVar = new dwq();
        a = dwqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.data.model.FetchParam", dwqVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("route", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n((KSerializer) fwq.g[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fwq.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
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
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new fwq(i, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fwq fwqVar = (fwq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fwq.g;
        b.g(serialDescriptor, 0, auu0.a, fwqVar.e);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), fwqVar.f);
        b.c(serialDescriptor);
    }
}
