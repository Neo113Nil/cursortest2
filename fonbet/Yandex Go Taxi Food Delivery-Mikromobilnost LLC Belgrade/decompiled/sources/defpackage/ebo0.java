package defpackage;

import defpackage.hbo0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class ebo0 implements uxs {
    public static final ebo0 a;
    private static final SerialDescriptor descriptor;

    static {
        ebo0 ebo0Var = new ebo0();
        a = ebo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPackagesUpsaleWindowDto", ebo0Var, 7);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("about", true);
        pluginGeneratedSerialDescriptor.j("buttons_texts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(fbo0.a);
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, w7sVar, w7sVar, auu0Var, n, ibo0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        String str2 = null;
        hbo0.a aVar = null;
        hbo0.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    aVar = (hbo0.a) b.s(serialDescriptor, 5, fbo0.a, aVar);
                    i |= 32;
                    break;
                case 6:
                    bVar = (hbo0.b) b.A(serialDescriptor, 6, ibo0.a, bVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new hbo0(i, str, formattedText, formattedText2, formattedText3, str2, aVar, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.jl40.l(r0, hbo0.b.e) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        hbo0 hbo0Var = (hbo0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(hbo0Var.a, "")) {
            b.o(serialDescriptor, 0, hbo0Var.a);
        }
        if (b.F() || !jl40.l(hbo0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, hbo0Var.b);
        }
        if (b.F() || !jl40.l(hbo0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, hbo0Var.c);
        }
        if (b.F() || !jl40.l(hbo0Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, hbo0Var.d);
        }
        if (b.F() || !jl40.l(hbo0Var.e, "")) {
            b.o(serialDescriptor, 4, hbo0Var.e);
        }
        if (b.F() || hbo0Var.f != null) {
            b.g(serialDescriptor, 5, fbo0.a, hbo0Var.f);
        }
        if (!b.F()) {
            hbo0.b bVar = hbo0Var.g;
            hbo0.b.Companion.getClass();
        }
        b.e(serialDescriptor, 6, ibo0.a, hbo0Var.g);
        b.c(serialDescriptor);
    }
}
