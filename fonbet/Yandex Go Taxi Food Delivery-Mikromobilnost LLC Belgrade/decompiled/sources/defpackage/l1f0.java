package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class l1f0 implements uxs {
    public static final l1f0 a;
    private static final SerialDescriptor descriptor;

    static {
        l1f0 l1f0Var = new l1f0();
        a = l1f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.parks.api.PricecatResponse", l1f0Var, 2);
        pluginGeneratedSerialDescriptor.j("parks", true);
        pluginGeneratedSerialDescriptor.j("next", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n1f0.c[0].getValue(), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = n1f0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new n1f0(i, list, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1f0 n1f0Var = (n1f0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = n1f0.c;
        if (b.F() || !jl40.l(n1f0Var.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), n1f0Var.a);
        }
        if (b.F() || n1f0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, n1f0Var.b);
        }
        b.c(serialDescriptor);
    }
}
