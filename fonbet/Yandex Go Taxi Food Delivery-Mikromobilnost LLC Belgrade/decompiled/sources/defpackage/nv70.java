package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* loaded from: classes14.dex */
public final /* synthetic */ class nv70 implements uxs {
    public static final nv70 a;
    private static final SerialDescriptor descriptor;

    static {
        nv70 nv70Var = new nv70();
        a = nv70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.orderforanother.model.OrderForAnother", nv70Var, 3);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("formedFrom", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pv70.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pv70.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        FormedFrom formedFrom = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                formedFrom = (FormedFrom) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), formedFrom);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pv70(i, str, str2, formedFrom);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pv70 pv70Var = (pv70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pv70.d;
        if (b.F() || pv70Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, pv70Var.a);
        }
        if (b.F() || pv70Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, pv70Var.b);
        }
        if (b.F() || pv70Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), pv70Var.c);
        }
        b.c(serialDescriptor);
    }
}
