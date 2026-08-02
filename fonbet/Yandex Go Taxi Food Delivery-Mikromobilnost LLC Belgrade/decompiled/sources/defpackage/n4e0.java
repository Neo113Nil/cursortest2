package defpackage;

import com.yandex.go.dto.response.Action$Payload;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class n4e0 implements uxs {
    public static final n4e0 a;
    private static final SerialDescriptor descriptor;

    static {
        n4e0 n4e0Var = new n4e0();
        a = n4e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolylineFeatureProperties", n4e0Var, 5);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("display_settings", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p4e0.f;
        return new KSerializer[]{qke.n(y4e0.a), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(q4e0.a), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p4e0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        a5e0 a5e0Var = null;
        Action$Payload.ObjectType objectType = null;
        s4e0 s4e0Var = null;
        List list = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                a5e0Var = (a5e0) b.s(serialDescriptor, 0, y4e0.a, a5e0Var);
                i |= 1;
            } else if (v == 1) {
                objectType = (Action$Payload.ObjectType) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), objectType);
                i |= 2;
            } else if (v == 2) {
                s4e0Var = (s4e0) b.s(serialDescriptor, 2, q4e0.a, s4e0Var);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new p4e0(i, a5e0Var, objectType, s4e0Var, list, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p4e0 p4e0Var = (p4e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p4e0.f;
        if (b.F() || p4e0Var.a != null) {
            b.g(serialDescriptor, 0, y4e0.a, p4e0Var.a);
        }
        if (b.F() || p4e0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), p4e0Var.b);
        }
        if (b.F() || p4e0Var.c != null) {
            b.g(serialDescriptor, 2, q4e0.a, p4e0Var.c);
        }
        if (b.F() || p4e0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), p4e0Var.d);
        }
        if (b.F() || p4e0Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, p4e0Var.e);
        }
        b.c(serialDescriptor);
    }
}
