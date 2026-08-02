package defpackage;

import defpackage.f9o0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class c9o0 implements uxs {
    public static final c9o0 a;
    private static final SerialDescriptor descriptor;

    static {
        c9o0 c9o0Var = new c9o0();
        a = c9o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPackagesPurchaseWindowDto", c9o0Var, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("promo", true);
        pluginGeneratedSerialDescriptor.j("context", true);
        pluginGeneratedSerialDescriptor.j("packages", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = f9o0.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, qke.n(d9o0.a), qke.n(aao0.a), qke.n(h9o0.a), i3yVarArr[5].getValue(), qke.n(j9o0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f9o0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        f9o0.a aVar = null;
        f9o0.e eVar = null;
        f9o0.b bVar = null;
        List list = null;
        f9o0.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    aVar = (f9o0.a) b.s(serialDescriptor, 2, d9o0.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    eVar = (f9o0.e) b.s(serialDescriptor, 3, aao0.a, eVar);
                    i |= 8;
                    break;
                case 4:
                    bVar = (f9o0.b) b.s(serialDescriptor, 4, h9o0.a, bVar);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    cVar = (f9o0.c) b.s(serialDescriptor, 6, j9o0.a, cVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new f9o0(i, formattedText, formattedText2, aVar, eVar, bVar, list, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f9o0 f9o0Var = (f9o0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f9o0.h;
        if (b.F() || !jl40.l(f9o0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, f9o0Var.a);
        }
        if (b.F() || !jl40.l(f9o0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, f9o0Var.b);
        }
        if (b.F() || f9o0Var.c != null) {
            b.g(serialDescriptor, 2, d9o0.a, f9o0Var.c);
        }
        if (b.F() || f9o0Var.d != null) {
            b.g(serialDescriptor, 3, aao0.a, f9o0Var.d);
        }
        if (b.F() || f9o0Var.e != null) {
            b.g(serialDescriptor, 4, h9o0.a, f9o0Var.e);
        }
        if (b.F() || !jl40.l(f9o0Var.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), f9o0Var.f);
        }
        if (b.F() || f9o0Var.g != null) {
            b.g(serialDescriptor, 6, j9o0.a, f9o0Var.g);
        }
        b.c(serialDescriptor);
    }
}
