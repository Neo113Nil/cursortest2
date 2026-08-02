package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class ltv implements uxs {
    public static final ltv a;
    private static final SerialDescriptor descriptor;

    static {
        ltv ltvVar = new ltv();
        a = ltvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.orderpopup.analytics.InfoModalCardParams", ltvVar, 10);
        pluginGeneratedSerialDescriptor.j("show_policy_id", true);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("show_count", true);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("bullets", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("tariff_unavailable", true);
        pluginGeneratedSerialDescriptor.j("button_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        h6w h6wVar = h6w.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, h6wVar, h6wVar, n, n2, auu0Var, z96Var, z96Var, z96Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z3 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z4 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    str5 = b.k(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ntv(i, str, i2, i3, str2, str3, str4, z2, z3, z4, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ntv ntvVar = (ntv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ntvVar.a, "")) {
            b.o(serialDescriptor, 0, ntvVar.a);
        }
        if (b.F() || ntvVar.b != 0) {
            b.A(1, ntvVar.b, serialDescriptor);
        }
        if (b.F() || ntvVar.c != 0) {
            b.A(2, ntvVar.c, serialDescriptor);
        }
        if (b.F() || ntvVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, ntvVar.d);
        }
        if (b.F() || ntvVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, ntvVar.e);
        }
        if (b.F() || !jl40.l(ntvVar.f, "")) {
            b.o(serialDescriptor, 5, ntvVar.f);
        }
        if (b.F() || ntvVar.g) {
            b.n(serialDescriptor, 6, ntvVar.g);
        }
        if (b.F() || ntvVar.h) {
            b.n(serialDescriptor, 7, ntvVar.h);
        }
        if (b.F() || ntvVar.i) {
            b.n(serialDescriptor, 8, ntvVar.i);
        }
        if (b.F() || !jl40.l(ntvVar.j, "")) {
            b.o(serialDescriptor, 9, ntvVar.j);
        }
        b.c(serialDescriptor);
    }
}
