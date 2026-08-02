package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.oqj0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class pqj0 implements uxs {
    public static final pqj0 a;
    private static final SerialDescriptor descriptor;

    static {
        pqj0 pqj0Var = new pqj0();
        a = pqj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsWithIconExperiment.RequirementInfo", pqj0Var, 8);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("show_title_on_options_screen", true);
        pluginGeneratedSerialDescriptor.j("top_title_key", true);
        pluginGeneratedSerialDescriptor.j("top_description_key", true);
        pluginGeneratedSerialDescriptor.j("info_screen_link_title_key", true);
        pluginGeneratedSerialDescriptor.j("info_screen_texts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = oqj0.b.i;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, qke.n(auu0Var), qke.n(auu0Var), z96Var, auu0Var, auu0Var, auu0Var, i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = oqj0.b.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    z3 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new oqj0.b(i, z2, str, str2, z3, str3, str4, str5, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oqj0.b bVar = (oqj0.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = oqj0.b.i;
        if (b.F() || bVar.a) {
            b.n(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bVar.c);
        }
        if (b.F() || bVar.d) {
            b.n(serialDescriptor, 3, bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, "")) {
            b.o(serialDescriptor, 4, bVar.e);
        }
        if (b.F() || !jl40.l(bVar.f, "")) {
            b.o(serialDescriptor, 5, bVar.f);
        }
        if (b.F() || !jl40.l(bVar.g, "")) {
            b.o(serialDescriptor, 6, bVar.g);
        }
        if (b.F() || !jl40.l(bVar.h, EmptyList.a)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), bVar.h);
        }
        b.c(serialDescriptor);
    }
}
