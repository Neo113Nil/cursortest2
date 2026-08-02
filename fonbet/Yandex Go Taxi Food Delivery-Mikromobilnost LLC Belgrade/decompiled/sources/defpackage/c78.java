package defpackage;

import defpackage.e78;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class c78 implements uxs {
    public static final c78 a;
    private static final SerialDescriptor descriptor;

    static {
        c78 c78Var = new c78();
        a = c78Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.carplates.experiments.CarPlatesFormatterExperiment.CarNumberFormatEntity", c78Var, 4);
        pluginGeneratedSerialDescriptor.j("background-color", true);
        pluginGeneratedSerialDescriptor.j("text-color", true);
        pluginGeneratedSerialDescriptor.j("format", true);
        pluginGeneratedSerialDescriptor.j("font-styles", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = e78.a.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e78.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new e78.a(map, str, str2, str3, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e78.a aVar = (e78.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e78.a.e;
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), aVar.d);
        }
        b.c(serialDescriptor);
    }
}
