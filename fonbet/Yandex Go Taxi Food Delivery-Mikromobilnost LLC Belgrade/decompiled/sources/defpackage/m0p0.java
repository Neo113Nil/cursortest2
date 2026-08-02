package defpackage;

import defpackage.p0p0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class m0p0 implements uxs {
    public static final m0p0 a;
    private static final SerialDescriptor descriptor;

    static {
        m0p0 m0p0Var = new m0p0();
        a = m0p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersSuperPassUpsaleWindowDto", m0p0Var, 7);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("trial_period", true);
        pluginGeneratedSerialDescriptor.j("buttons_texts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(r0p0.a);
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, w7sVar, w7sVar, auu0Var, n, n0p0.a};
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
        p0p0.b bVar = null;
        p0p0.a aVar = null;
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
                    bVar = (p0p0.b) b.s(serialDescriptor, 5, r0p0.a, bVar);
                    i |= 32;
                    break;
                case 6:
                    aVar = (p0p0.a) b.A(serialDescriptor, 6, n0p0.a, aVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new p0p0(i, str, formattedText, formattedText2, formattedText3, str2, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (defpackage.jl40.l(r0, p0p0.a.e) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        p0p0 p0p0Var = (p0p0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(p0p0Var.a, "")) {
            b.o(serialDescriptor, 0, p0p0Var.a);
        }
        if (b.F() || !jl40.l(p0p0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, p0p0Var.b);
        }
        if (b.F() || !jl40.l(p0p0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, p0p0Var.c);
        }
        if (b.F() || !jl40.l(p0p0Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, p0p0Var.d);
        }
        if (b.F() || !jl40.l(p0p0Var.e, "")) {
            b.o(serialDescriptor, 4, p0p0Var.e);
        }
        if (b.F() || p0p0Var.f != null) {
            b.g(serialDescriptor, 5, r0p0.a, p0p0Var.f);
        }
        if (!b.F()) {
            p0p0.a aVar = p0p0Var.g;
            p0p0.a.Companion.getClass();
        }
        b.e(serialDescriptor, 6, n0p0.a, p0p0Var.g);
        b.c(serialDescriptor);
    }
}
