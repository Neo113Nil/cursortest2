package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

/* loaded from: classes5.dex */
public final /* synthetic */ class len implements uxs {
    public static final len a;
    private static final SerialDescriptor descriptor;

    static {
        len lenVar = new len();
        a = lenVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.internal.nativeapi.EatsNativeApi.ConfigResult", lenVar, 5);
        pluginGeneratedSerialDescriptor.j("supportedMethods", false);
        pluginGeneratedSerialDescriptor.j("promo", false);
        pluginGeneratedSerialDescriptor.j("separatePharmacy", false);
        pluginGeneratedSerialDescriptor.j("supportNativeAddressPicker", false);
        pluginGeneratedSerialDescriptor.j("extraConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = nen.f;
        z96 z96Var = z96.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue()), z96Var, z96Var, qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nen.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        List list = null;
        ServicePromo servicePromo = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                servicePromo = (ServicePromo) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), servicePromo);
                i |= 2;
            } else if (v == 2) {
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z3 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.s(serialDescriptor, 4, rcx.a, bVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new nen(i, list, servicePromo, z2, z3, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nen nenVar = (nen) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nen.f;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        List list = nenVar.a;
        b bVar = nenVar.e;
        b.e(serialDescriptor, 0, kSerializer, list);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), nenVar.b);
        b.n(serialDescriptor, 2, nenVar.c);
        b.n(serialDescriptor, 3, nenVar.d);
        if (b.F() || bVar != null) {
            b.g(serialDescriptor, 4, rcx.a, bVar);
        }
        b.c(serialDescriptor);
    }
}
