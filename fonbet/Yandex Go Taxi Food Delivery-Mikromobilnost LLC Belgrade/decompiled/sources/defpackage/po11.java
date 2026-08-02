package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class po11 implements uxs {
    public static final po11 a;
    private static final SerialDescriptor descriptor;

    static {
        po11 po11Var = new po11();
        a = po11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.TypedScreens", po11Var, 2);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("items_to_delete", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ro11.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ro11.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ro11(list, list2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ro11 ro11Var = (ro11) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ro11.c;
        if (b.F() || !jl40.l(ro11Var.a, EmptyList.a)) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ro11Var.a);
        }
        if (b.F() || ro11Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ro11Var.b);
        }
        b.c(serialDescriptor);
    }
}
