package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class nlc0 implements uxs {
    public static final nlc0 a;
    private static final SerialDescriptor descriptor;

    static {
        nlc0 nlc0Var = new nlc0();
        a = nlc0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.PlaqueDefinitionsDto", nlc0Var, 5);
        pluginGeneratedSerialDescriptor.j("widgets", false);
        pluginGeneratedSerialDescriptor.j("conditionalPlaques", false);
        pluginGeneratedSerialDescriptor.j("prefetchPlaques", false);
        pluginGeneratedSerialDescriptor.j("defaultPlaques", false);
        pluginGeneratedSerialDescriptor.j("fallbackPlaques", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = plc0.f;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = plc0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                i |= 4;
            } else if (v == 3) {
                list4 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list5 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new plc0(i, list, list2, list3, list4, list5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        plc0 plc0Var = (plc0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = plc0.f;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), plc0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), plc0Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), plc0Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), plc0Var.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), plc0Var.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
