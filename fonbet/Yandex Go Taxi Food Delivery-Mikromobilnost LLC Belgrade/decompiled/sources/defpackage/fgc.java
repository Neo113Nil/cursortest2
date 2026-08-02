package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class fgc implements uxs {
    public static final fgc a;
    private static final SerialDescriptor descriptor;

    static {
        fgc fgcVar = new fgc();
        a = fgcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ColorSettingsDto.ColorDto", fgcVar, 3);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("opacity", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(h6w.a), e6m.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        Integer num = null;
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
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d = b.E(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new hgc(i, str, num, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hgc hgcVar = (hgc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, hgcVar.a);
        b.g(serialDescriptor, 1, h6w.a, hgcVar.b);
        b.E(serialDescriptor, 2, hgcVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
