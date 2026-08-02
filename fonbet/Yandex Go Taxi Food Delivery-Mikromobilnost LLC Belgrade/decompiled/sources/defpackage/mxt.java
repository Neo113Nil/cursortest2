package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class mxt implements uxs {
    public static final mxt a;
    private static final SerialDescriptor descriptor;

    static {
        mxt mxtVar = new mxt();
        a = mxtVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent.GradientLineItem.ImageItem", mxtVar, 4);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("height", true);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, e6m.a, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        double d = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new oxt(i, str, str2, d, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        oxt oxtVar = (oxt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(oxtVar.a, "")) {
            b.o(serialDescriptor, 0, oxtVar.a);
        }
        if (b.F() || Double.compare(oxtVar.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, oxtVar.b);
        }
        if (b.F() || !jl40.l(oxtVar.c, "")) {
            b.o(serialDescriptor, 2, oxtVar.c);
        }
        if (b.F() || !jl40.l(oxtVar.d, "")) {
            b.o(serialDescriptor, 3, oxtVar.d);
        }
        b.c(serialDescriptor);
    }
}
