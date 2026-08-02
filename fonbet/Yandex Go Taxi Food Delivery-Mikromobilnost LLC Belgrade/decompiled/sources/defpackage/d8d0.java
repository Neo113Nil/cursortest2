package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class d8d0 implements uxs {
    public static final d8d0 a;
    private static final SerialDescriptor descriptor;

    static {
        d8d0 d8d0Var = new d8d0();
        a = d8d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGetSmartOffersRequestDto.Context", d8d0Var, 9);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_PAGE, false);
        pluginGeneratedSerialDescriptor.j("places", false);
        pluginGeneratedSerialDescriptor.j("targetToFeatures", false);
        pluginGeneratedSerialDescriptor.j("expTestIds", false);
        pluginGeneratedSerialDescriptor.j("expFlags", false);
        pluginGeneratedSerialDescriptor.j("customProperties", false);
        pluginGeneratedSerialDescriptor.j("googleCountryCode", false);
        pluginGeneratedSerialDescriptor.j("isNativePaymentAllowed", false);
        pluginGeneratedSerialDescriptor.j("storeId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = f8d0.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(auu0Var), qke.n(z96.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f8d0.j;
        b.getClass();
        String str = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        String str2 = null;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        Set set4 = null;
        Map map = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    set = (Set) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                    i |= 2;
                    break;
                case 2:
                    set2 = (Set) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                    i |= 4;
                    break;
                case 3:
                    set3 = (Set) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set3);
                    i |= 8;
                    break;
                case 4:
                    set4 = (Set) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), set4);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new f8d0(i, str2, set, set2, set3, set4, map, str3, bool, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f8d0 f8d0Var = (f8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f8d0.j;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, f8d0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), f8d0Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), f8d0Var.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), f8d0Var.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), f8d0Var.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), f8d0Var.f);
        b.g(serialDescriptor, 6, auu0Var, f8d0Var.g);
        b.g(serialDescriptor, 7, z96.a, f8d0Var.h);
        b.g(serialDescriptor, 8, auu0Var, f8d0Var.i);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
