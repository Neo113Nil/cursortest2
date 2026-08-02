package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class a4g0 implements uxs {
    public static final a4g0 a;
    private static final SerialDescriptor descriptor;

    static {
        a4g0 a4g0Var = new a4g0();
        a = a4g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.common_params.PushSettingsParam", a4g0Var, 3);
        pluginGeneratedSerialDescriptor.j("enabled_by_system", false);
        pluginGeneratedSerialDescriptor.j("included_tags", false);
        pluginGeneratedSerialDescriptor.j("excluded_tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c4g0.d;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c4g0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Set set = null;
        Set set2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new c4g0(i, set, set2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c4g0 c4g0Var = (c4g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c4g0.d;
        b.n(serialDescriptor, 0, c4g0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), c4g0Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), c4g0Var.c);
        b.c(serialDescriptor);
    }
}
