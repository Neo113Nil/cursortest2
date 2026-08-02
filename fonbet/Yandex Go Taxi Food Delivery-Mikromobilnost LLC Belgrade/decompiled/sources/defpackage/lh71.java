package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class lh71 implements uxs {
    public static final lh71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        lh71 lh71Var = new lh71();
        a = lh71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.fonts.FontUrls", lh71Var, 4);
        pluginGeneratedSerialDescriptor.j("regular", false);
        pluginGeneratedSerialDescriptor.j("bold", false);
        pluginGeneratedSerialDescriptor.j("light", false);
        pluginGeneratedSerialDescriptor.j("medium", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b2.k(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b2.k(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = b2.k(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new wn71(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wn71 wn71Var = (wn71) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        b2.o(pluginGeneratedSerialDescriptor, 0, wn71Var.a);
        b2.o(pluginGeneratedSerialDescriptor, 1, wn71Var.b);
        b2.o(pluginGeneratedSerialDescriptor, 2, wn71Var.c);
        b2.o(pluginGeneratedSerialDescriptor, 3, wn71Var.d);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
