package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class fqj0 implements uxs {
    public static final fqj0 a;
    private static final SerialDescriptor descriptor;

    static {
        fqj0 fqj0Var = new fqj0();
        a = fqj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsV2Experiment", fqj0Var, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        pluginGeneratedSerialDescriptor.j("order_popup", true);
        pluginGeneratedSerialDescriptor.j("disable_order_popup", true);
        pluginGeneratedSerialDescriptor.j("bubble_unavailable", true);
        pluginGeneratedSerialDescriptor.j("bubbles", true);
        pluginGeneratedSerialDescriptor.j("multiclass", true);
        pluginGeneratedSerialDescriptor.j("disable_order_button_requirements", true);
        pluginGeneratedSerialDescriptor.j("ignored_requirements", true);
        pluginGeneratedSerialDescriptor.j("hide_bubbles_control_for_tariff_class", true);
        pluginGeneratedSerialDescriptor.j("disable_requirements_for_order_flow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c.o;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), auu0.a, i3yVarArr[6].getValue(), wij0.a, i3yVarArr[8].getValue(), rgj0.a, i3yVarArr[10].getValue(), i3yVarArr[11].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c.o;
        b.getClass();
        List list = null;
        List list2 = null;
        tgj0 tgj0Var = null;
        List list3 = null;
        boolean z4 = true;
        yij0 yij0Var = null;
        int i = 0;
        boolean z5 = false;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        List list4 = null;
        String str = null;
        Map map4 = null;
        int i2 = 1;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z4 = false;
                case 0:
                    z3 = z4;
                    i |= 1;
                    i2 = i2;
                    z5 = b.C(serialDescriptor, 0);
                    z4 = z3;
                case 1:
                    z = z4;
                    z2 = z5;
                    map = (Map) b.A(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), map);
                    i |= 2;
                    z4 = z;
                    z5 = z2;
                case 2:
                    z = z4;
                    z2 = z5;
                    map2 = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map2);
                    i |= 4;
                    z4 = z;
                    z5 = z2;
                case 3:
                    z = z4;
                    z2 = z5;
                    map3 = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map3);
                    i |= 8;
                    z4 = z;
                    z5 = z2;
                case 4:
                    z = z4;
                    z2 = z5;
                    list4 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list4);
                    i |= 16;
                    z4 = z;
                    z5 = z2;
                case 5:
                    z3 = z4;
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    z4 = z3;
                case 6:
                    z = z4;
                    z2 = z5;
                    map4 = (Map) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), map4);
                    i |= 64;
                    z4 = z;
                    z5 = z2;
                case 7:
                    z = z4;
                    z2 = z5;
                    yij0Var = (yij0) b.A(serialDescriptor, 7, wij0.a, yij0Var);
                    i |= 128;
                    z4 = z;
                    z5 = z2;
                case 8:
                    z = z4;
                    z2 = z5;
                    list3 = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list3);
                    i |= 256;
                    z4 = z;
                    z5 = z2;
                case 9:
                    z = z4;
                    z2 = z5;
                    tgj0Var = (tgj0) b.A(serialDescriptor, 9, rgj0.a, tgj0Var);
                    i |= 512;
                    z4 = z;
                    z5 = z2;
                case 10:
                    z = z4;
                    z2 = z5;
                    list2 = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list2);
                    i |= 1024;
                    z4 = z;
                    z5 = z2;
                case 11:
                    z = z4;
                    z2 = z5;
                    list = (List) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list);
                    i |= 2048;
                    z4 = z;
                    z5 = z2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new c(i, z5, map, map2, map3, list4, str, map4, yij0Var, list3, tgj0Var, list2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c.o;
        if (b.F() || cVar.b) {
            b.n(serialDescriptor, 0, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cVar.c);
        }
        if (b.F() || !jl40.l(cVar.d, b.f())) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), cVar.d);
        }
        if (b.F() || !jl40.l(cVar.e, b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), cVar.e);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(cVar.f, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), cVar.f);
        }
        if (b.F() || !jl40.l(cVar.g, "")) {
            b.o(serialDescriptor, 5, cVar.g);
        }
        if (b.F() || !jl40.l(cVar.h, b.f())) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), cVar.h);
        }
        if (b.F() || !jl40.l(cVar.i, new yij0(0))) {
            b.e(serialDescriptor, 7, wij0.a, cVar.i);
        }
        if (b.F() || !jl40.l(cVar.j, emptyList)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), cVar.j);
        }
        if (b.F() || !jl40.l(cVar.k, new tgj0(0))) {
            b.e(serialDescriptor, 9, rgj0.a, cVar.k);
        }
        if (b.F() || !jl40.l(cVar.l, emptyList)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), cVar.l);
        }
        if (b.F() || !jl40.l(cVar.m, emptyList)) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), cVar.m);
        }
        b.c(serialDescriptor);
    }
}
