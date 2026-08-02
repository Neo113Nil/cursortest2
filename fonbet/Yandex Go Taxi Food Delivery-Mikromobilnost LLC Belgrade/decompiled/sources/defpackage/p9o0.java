package defpackage;

import defpackage.f9o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class p9o0 implements uxs {
    public static final p9o0 a;
    private static final SerialDescriptor descriptor;

    static {
        p9o0 p9o0Var = new p9o0();
        a = p9o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPackagesPurchaseWindowDto.PackageDto.PriceTitleDto.Badge", p9o0Var, 1);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d9o0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        f9o0.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                aVar = (f9o0.a) b.A(serialDescriptor, 0, d9o0.a, aVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new r9o0(i, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, f9o0.a.c) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        r9o0 r9o0Var = (r9o0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            f9o0.a aVar = r9o0Var.a;
            f9o0.a.Companion.getClass();
        }
        b.e(serialDescriptor, 0, d9o0.a, r9o0Var.a);
        b.c(serialDescriptor);
    }
}
