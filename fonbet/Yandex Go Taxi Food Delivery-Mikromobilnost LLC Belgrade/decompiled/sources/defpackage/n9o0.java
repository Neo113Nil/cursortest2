package defpackage;

import defpackage.f9o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class n9o0 implements uxs {
    public static final n9o0 a;
    private static final SerialDescriptor descriptor;

    static {
        n9o0 n9o0Var = new n9o0();
        a = n9o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPackagesPurchaseWindowDto.PackageDto", n9o0Var, 6);
        pluginGeneratedSerialDescriptor.j("package_product_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("price_subtitle", true);
        pluginGeneratedSerialDescriptor.j("purchase_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, w7sVar, x9o0.e, w7sVar, y9o0.a};
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
        w9o0 w9o0Var = null;
        FormattedText formattedText3 = null;
        f9o0.d.a aVar = null;
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
                    w9o0Var = (w9o0) b.A(serialDescriptor, 3, x9o0.e, w9o0Var);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    aVar = (f9o0.d.a) b.A(serialDescriptor, 5, y9o0.a, aVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new f9o0.d(i, str, formattedText, formattedText2, w9o0Var, formattedText3, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (defpackage.jl40.l(r0, f9o0.d.a.c) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        f9o0.d dVar = (f9o0.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dVar.a, "")) {
            b.o(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, dVar.c);
        }
        if (b.F() || !jl40.l(dVar.d, new v9o0(0))) {
            b.e(serialDescriptor, 3, x9o0.e, dVar.d);
        }
        if (b.F() || !jl40.l(dVar.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, dVar.e);
        }
        if (!b.F()) {
            f9o0.d.a aVar = dVar.f;
            f9o0.d.a.Companion.getClass();
        }
        b.e(serialDescriptor, 5, y9o0.a, dVar.f);
        b.c(serialDescriptor);
    }
}
