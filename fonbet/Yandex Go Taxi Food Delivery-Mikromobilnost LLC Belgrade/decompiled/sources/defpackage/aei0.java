package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes13.dex */
public final /* synthetic */ class aei0 implements uxs {
    public static final aei0 a;
    private static final SerialDescriptor descriptor;

    static {
        aei0 aei0Var = new aei0();
        a = aei0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.media.RealtimeAnalytics", aei0Var, 2);
        pluginGeneratedSerialDescriptor.j("creative_id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, cei0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cei0.c;
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
        return new cei0(i, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cei0 cei0Var = (cei0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cei0.c;
        if (b.F() || !jl40.l(cei0Var.a, "")) {
            b.o(serialDescriptor, 0, cei0Var.a);
        }
        if (b.F() || !jl40.l(cei0Var.b, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cei0Var.b);
        }
        b.c(serialDescriptor);
    }
}
