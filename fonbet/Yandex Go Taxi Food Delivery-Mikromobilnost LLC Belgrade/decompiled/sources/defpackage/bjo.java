package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public final /* synthetic */ class bjo implements uxs {
    public static final bjo a;
    private static final SerialDescriptor descriptor;

    static {
        bjo bjoVar = new bjo();
        a = bjoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.EvolveOfferParams", bjoVar, 5);
        pluginGeneratedSerialDescriptor.j("tag_name", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("dry_run", false);
        pluginGeneratedSerialDescriptor.j("use_bluetooth", false);
        pluginGeneratedSerialDescriptor.j("ble_flow_is_used", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{djo.f[0].getValue(), auu0.a, qke.n(z96Var), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = djo.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        EvolveState evolveState = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                evolveState = (EvolveState) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), evolveState);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                bool2 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool3 = (Boolean) b.s(serialDescriptor, 4, z96.a, bool3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new djo(i, evolveState, str, bool, bool2, bool3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        djo djoVar = (djo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) djo.f[0].getValue(), djoVar.a);
        b.o(serialDescriptor, 1, djoVar.b);
        z96 z96Var = z96.a;
        b.g(serialDescriptor, 2, z96Var, djoVar.c);
        b.g(serialDescriptor, 3, z96Var, djoVar.d);
        b.g(serialDescriptor, 4, z96Var, djoVar.e);
        b.c(serialDescriptor);
    }
}
