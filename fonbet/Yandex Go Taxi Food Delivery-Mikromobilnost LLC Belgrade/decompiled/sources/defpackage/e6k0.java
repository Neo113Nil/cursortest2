package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class e6k0 implements uxs {
    public static final e6k0 a;
    private static final SerialDescriptor descriptor;

    static {
        e6k0 e6k0Var = new e6k0();
        a = e6k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.RidaInfo", e6k0Var, 5);
        pluginGeneratedSerialDescriptor.j("ride_time_subtitle", true);
        pluginGeneratedSerialDescriptor.j("prices", true);
        pluginGeneratedSerialDescriptor.j("suggested_price_index", true);
        pluginGeneratedSerialDescriptor.j("states", true);
        pluginGeneratedSerialDescriptor.j("auction_prices", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = h6k0.f;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), h6w.a, i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = h6k0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list3 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new h6k0(i, str, list, i2, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        h6k0.g((h6k0) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
