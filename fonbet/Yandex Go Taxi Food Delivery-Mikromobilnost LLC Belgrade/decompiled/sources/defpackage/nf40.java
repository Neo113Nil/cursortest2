package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class nf40 implements uxs {
    public static final nf40 a;
    private static final SerialDescriptor descriptor;

    static {
        nf40 nf40Var = new nf40();
        a = nf40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainFilters", nf40Var, 2);
        pluginGeneratedSerialDescriptor.j("selected_ids", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pf40.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pf40.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new pf40(i, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pf40 pf40Var = (pf40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pf40.c;
        if (b.F() || !jl40.l(pf40Var.a, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), pf40Var.a);
        }
        if (b.F() || !jl40.l(pf40Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pf40Var.b);
        }
        b.c(serialDescriptor);
    }
}
