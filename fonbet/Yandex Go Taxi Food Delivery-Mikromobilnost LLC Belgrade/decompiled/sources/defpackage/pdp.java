package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.tdp;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class pdp implements uxs {
    public static final pdp a;
    private static final SerialDescriptor descriptor;

    static {
        pdp pdpVar = new pdp();
        a = pdpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.address.api.experiment.FavoriteAddressNewUiExperiment", pdpVar, 10);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("emoji_enabled", true);
        pluginGeneratedSerialDescriptor.j("edit_enabled", true);
        pluginGeneratedSerialDescriptor.j("entry_point_map_enabled", true);
        pluginGeneratedSerialDescriptor.j("default_emoji", true);
        pluginGeneratedSerialDescriptor.j("min_save_distance", true);
        pluginGeneratedSerialDescriptor.j("nearby_update_distance", true);
        pluginGeneratedSerialDescriptor.j("modal", true);
        pluginGeneratedSerialDescriptor.j("nearby_modal", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tdp.l;
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, auu0.a, h6wVar, h6wVar, rdp.a, udp.a, i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = tdp.l;
        b.getClass();
        Map map = null;
        tdp.b bVar = null;
        boolean z = true;
        tdp.a aVar = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    i3 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    aVar = (tdp.a) b.A(serialDescriptor, 7, rdp.a, aVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    bVar = (tdp.b) b.A(serialDescriptor, 8, udp.a, bVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), map);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new tdp(i, z2, z3, z4, z5, str, i2, i3, aVar, bVar, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tdp tdpVar = (tdp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tdp.l;
        if (b.F() || tdpVar.b) {
            b.n(serialDescriptor, 0, tdpVar.b);
        }
        if (b.F() || tdpVar.c) {
            b.n(serialDescriptor, 1, tdpVar.c);
        }
        if (b.F() || tdpVar.d) {
            b.n(serialDescriptor, 2, tdpVar.d);
        }
        if (b.F() || tdpVar.e) {
            b.n(serialDescriptor, 3, tdpVar.e);
        }
        if (b.F() || !jl40.l(tdpVar.f, "⭐")) {
            b.o(serialDescriptor, 4, tdpVar.f);
        }
        if (b.F() || tdpVar.g != 0) {
            b.A(5, tdpVar.g, serialDescriptor);
        }
        if (b.F() || tdpVar.h != 0) {
            b.A(6, tdpVar.h, serialDescriptor);
        }
        if (b.F() || !jl40.l(tdpVar.i, new tdp.a(0))) {
            b.e(serialDescriptor, 7, rdp.a, tdpVar.i);
        }
        if (b.F() || !jl40.l(tdpVar.j, new tdp.b(0))) {
            b.e(serialDescriptor, 8, udp.a, tdpVar.j);
        }
        if (b.F() || !jl40.l(tdpVar.k, b.f())) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), tdpVar.k);
        }
        b.c(serialDescriptor);
    }
}
