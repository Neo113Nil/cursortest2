package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class f9d0 implements uxs {
    public static final f9d0 a;
    private static final SerialDescriptor descriptor;

    static {
        f9d0 f9d0Var = new f9d0();
        a = f9d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer", f9d0Var, 10);
        pluginGeneratedSerialDescriptor.j("analyticData", false);
        pluginGeneratedSerialDescriptor.j("purchaseToken", true);
        pluginGeneratedSerialDescriptor.j("place", true);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("target", false);
        pluginGeneratedSerialDescriptor.j("requestedFeatures", true);
        pluginGeneratedSerialDescriptor.j("oneClickAvailable", true);
        pluginGeneratedSerialDescriptor.j("offerTexts", false);
        pluginGeneratedSerialDescriptor.j("legalInfo", false);
        pluginGeneratedSerialDescriptor.j("catalogCompositeOffer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w9d0.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{g9d0.a, qke.n(auu0Var), qke.n(auu0Var), h6w.a, auu0Var, qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(z96.a), t9d0.a, k9d0.a, q8d0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = w9d0.k;
        b.getClass();
        s8d0 s8d0Var = null;
        s9d0 s9d0Var = null;
        boolean z = true;
        v9d0 v9d0Var = null;
        int i = 0;
        i9d0 i9d0Var = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        Set set = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    i9d0Var = (i9d0) b.A(serialDescriptor, 0, g9d0.a, i9d0Var);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    set = (Set) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), set);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 6, z96.a, bool);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    v9d0Var = (v9d0) b.A(serialDescriptor, 7, t9d0.a, v9d0Var);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    s9d0Var = (s9d0) b.A(serialDescriptor, 8, k9d0.a, s9d0Var);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    s8d0Var = (s8d0) b.A(serialDescriptor, 9, q8d0.a, s8d0Var);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new w9d0(i, i9d0Var, str, str2, i2, str3, set, bool, v9d0Var, s9d0Var, s8d0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w9d0 w9d0Var = (w9d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w9d0.k;
        g9d0 g9d0Var = g9d0.a;
        i9d0 i9d0Var = w9d0Var.a;
        Boolean bool = w9d0Var.g;
        Set set = w9d0Var.f;
        String str = w9d0Var.c;
        String str2 = w9d0Var.b;
        b.e(serialDescriptor, 0, g9d0Var, i9d0Var);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 1, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        b.A(3, w9d0Var.d, serialDescriptor);
        b.o(serialDescriptor, 4, w9d0Var.e);
        if (b.F() || set != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), set);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 6, z96.a, bool);
        }
        b.e(serialDescriptor, 7, t9d0.a, w9d0Var.h);
        b.e(serialDescriptor, 8, k9d0.a, w9d0Var.i);
        b.e(serialDescriptor, 9, q8d0.a, w9d0Var.j);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
