package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;

/* loaded from: classes9.dex */
public final /* synthetic */ class au implements uxs {
    public static final au a;
    private static final SerialDescriptor descriptor;

    static {
        au auVar = new au();
        a = auVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.api.network.objects.ActionData", auVar, 3);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("popup", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) cu.d[0].getValue()), qke.n(hu.a), qke.n(eu.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cu.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        DataType dataType = null;
        ju juVar = null;
        gu guVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dataType = (DataType) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), dataType);
                i |= 1;
            } else if (v == 1) {
                juVar = (ju) b.s(serialDescriptor, 1, hu.a, juVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                guVar = (gu) b.s(serialDescriptor, 2, eu.a, guVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new cu(i, dataType, juVar, guVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cu cuVar = (cu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cu.d;
        if (b.F() || cuVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), cuVar.a);
        }
        if (b.F() || cuVar.b != null) {
            b.g(serialDescriptor, 1, hu.a, cuVar.b);
        }
        if (b.F() || cuVar.c != null) {
            b.g(serialDescriptor, 2, eu.a, cuVar.c);
        }
        b.c(serialDescriptor);
    }
}
