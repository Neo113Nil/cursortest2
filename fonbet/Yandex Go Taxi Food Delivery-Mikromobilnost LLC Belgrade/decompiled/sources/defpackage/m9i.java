package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class m9i implements uxs {
    public static final m9i a;
    private static final SerialDescriptor descriptor;

    static {
        m9i m9iVar = new m9i();
        a = m9iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.DeliveryExtraDto", m9iVar, 7);
        pluginGeneratedSerialDescriptor.j("is_delivery_business_account_enabled", true);
        pluginGeneratedSerialDescriptor.j("includes_delivery_intervals", true);
        pluginGeneratedSerialDescriptor.j("rental_duration", true);
        pluginGeneratedSerialDescriptor.j("insurance", true);
        pluginGeneratedSerialDescriptor.j("marketplace_chat_id", true);
        pluginGeneratedSerialDescriptor.j("door_to_door", true);
        pluginGeneratedSerialDescriptor.j("pay_on_delivery", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, qke.n(h6w.a), qke.n(x4w.a), qke.n(auu0.a), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Integer num = null;
        z4w z4wVar = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    z4wVar = (z4w) b.s(serialDescriptor, 3, x4w.a, z4wVar);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) b.s(serialDescriptor, 5, z96.a, bool);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new o9i(i, z2, z3, num, z4wVar, str, bool, bool2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o9i o9iVar = (o9i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || o9iVar.a) {
            b.n(serialDescriptor, 0, o9iVar.a);
        }
        if (b.F() || o9iVar.b) {
            b.n(serialDescriptor, 1, o9iVar.b);
        }
        if (b.F() || o9iVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, o9iVar.c);
        }
        if (b.F() || o9iVar.d != null) {
            b.g(serialDescriptor, 3, x4w.a, o9iVar.d);
        }
        if (b.F() || o9iVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, o9iVar.e);
        }
        if (b.F() || o9iVar.f != null) {
            b.g(serialDescriptor, 5, z96.a, o9iVar.f);
        }
        if (b.F() || o9iVar.g != null) {
            b.g(serialDescriptor, 6, z96.a, o9iVar.g);
        }
        b.c(serialDescriptor);
    }
}
