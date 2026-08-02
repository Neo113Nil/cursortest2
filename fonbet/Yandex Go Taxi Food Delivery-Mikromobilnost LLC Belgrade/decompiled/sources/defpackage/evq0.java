package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class evq0 implements uxs {
    public static final evq0 a;
    private static final SerialDescriptor descriptor;

    static {
        evq0 evq0Var = new evq0();
        a = evq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.ServiceContext", evq0Var, 3);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("user_location", false);
        pluginGeneratedSerialDescriptor.j("orders", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(d0t.a), tzs.a, gvq0.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gvq0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        f0t f0tVar = null;
        xzs xzsVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f0tVar = (f0t) b.s(serialDescriptor, 0, d0t.a, f0tVar);
                i |= 1;
            } else if (v == 1) {
                xzsVar = (xzs) b.A(serialDescriptor, 1, tzs.a, xzsVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new gvq0(i, f0tVar, xzsVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gvq0 gvq0Var = (gvq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gvq0.d;
        b.g(serialDescriptor, 0, d0t.a, gvq0Var.a);
        b.e(serialDescriptor, 1, tzs.a, gvq0Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), gvq0Var.c);
        b.c(serialDescriptor);
    }
}
