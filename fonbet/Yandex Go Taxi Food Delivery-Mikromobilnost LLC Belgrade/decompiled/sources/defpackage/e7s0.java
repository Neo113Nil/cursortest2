package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class e7s0 implements uxs {
    public static final e7s0 a;
    private static final SerialDescriptor descriptor;

    static {
        e7s0 e7s0Var = new e7s0();
        a = e7s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.actions.ShowNativeScreenAction", e7s0Var, 2);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, i7s0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i7s0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new i7s0(i, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i7s0 i7s0Var = (i7s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i7s0.c;
        String str = i7s0Var.a;
        Map map = i7s0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || !jl40.l(map, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), map);
        }
        b.c(serialDescriptor);
    }
}
