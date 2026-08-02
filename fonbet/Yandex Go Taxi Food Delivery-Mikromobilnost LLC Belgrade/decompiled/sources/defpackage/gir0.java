package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class gir0 implements uxs {
    public static final gir0 a;
    private static final SerialDescriptor descriptor;

    static {
        gir0 gir0Var = new gir0();
        a = gir0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ShapeSettingsDto", gir0Var, 4);
        pluginGeneratedSerialDescriptor.j("leftTopCorner", false);
        pluginGeneratedSerialDescriptor.j("rightTopCorner", false);
        pluginGeneratedSerialDescriptor.j("leftBottomCorner", false);
        pluginGeneratedSerialDescriptor.j("rightBottomCorner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = oir0.e;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = oir0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        nir0 nir0Var = null;
        nir0 nir0Var2 = null;
        nir0 nir0Var3 = null;
        nir0 nir0Var4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                nir0Var = (nir0) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), nir0Var);
                i |= 1;
            } else if (v == 1) {
                nir0Var2 = (nir0) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), nir0Var2);
                i |= 2;
            } else if (v == 2) {
                nir0Var3 = (nir0) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), nir0Var3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                nir0Var4 = (nir0) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), nir0Var4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new oir0(i, nir0Var, nir0Var2, nir0Var3, nir0Var4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oir0 oir0Var = (oir0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = oir0.e;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), oir0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), oir0Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), oir0Var.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), oir0Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
