package defpackage;

import defpackage.np40;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jp40 implements uxs {
    public static final jp40 a;
    private static final SerialDescriptor descriptor;

    static {
        jp40 jp40Var = new jp40();
        a = jp40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.data.model.MulticlassOptionsState", jp40Var, 4);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("selected", true);
        pluginGeneratedSerialDescriptor.j("selected_vertical_id", true);
        pluginGeneratedSerialDescriptor.j("override_summary_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{np40.e[0].getValue(), z96.a, qke.n(auu0.a), qke.n(lp40.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = np40.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Set set = null;
        String str = null;
        np40.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar = (np40.a) b.s(serialDescriptor, 3, lp40.a, aVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new np40(i, set, z2, str, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        np40 np40Var = (np40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = np40.e;
        if (b.F() || !jl40.l(np40Var.a, EmptySet.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), np40Var.a);
        }
        if (b.F() || np40Var.b) {
            b.n(serialDescriptor, 1, np40Var.b);
        }
        if (b.F() || np40Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, np40Var.c);
        }
        if (b.F() || np40Var.d != null) {
            b.g(serialDescriptor, 3, lp40.a, np40Var.d);
        }
        b.c(serialDescriptor);
    }
}
