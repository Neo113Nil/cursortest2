package defpackage;

import java.util.Collection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class bp40 implements uxs {
    public static final bp40 a;
    private static final SerialDescriptor descriptor;

    static {
        bp40 bp40Var = new bp40();
        a = bp40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.MulticlassOptions", bp40Var, 2);
        pluginGeneratedSerialDescriptor.j("selected", true);
        pluginGeneratedSerialDescriptor.j("class", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n((KSerializer) hp40.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = hp40.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Collection collection = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                collection = (Collection) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), collection);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new hp40(i, bool, collection);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hp40 hp40Var = (hp40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = hp40.c;
        if (b.F() || hp40Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, hp40Var.a);
        }
        if (b.F() || hp40Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hp40Var.b);
        }
        b.c(serialDescriptor);
    }
}
