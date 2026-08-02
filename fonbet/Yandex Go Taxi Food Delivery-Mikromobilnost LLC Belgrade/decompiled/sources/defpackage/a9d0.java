package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a9d0 implements uxs {
    public static final a9d0 a;
    private static final SerialDescriptor descriptor;

    static {
        a9d0 a9d0Var = new a9d0();
        a = a9d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto", a9d0Var, 7);
        pluginGeneratedSerialDescriptor.j("sessionId", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_PAGE, true);
        pluginGeneratedSerialDescriptor.j("mlRequestId", true);
        pluginGeneratedSerialDescriptor.j("offerConfigId", true);
        pluginGeneratedSerialDescriptor.j("language", false);
        pluginGeneratedSerialDescriptor.j("offers", true);
        pluginGeneratedSerialDescriptor.j("bdui", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = x9d0.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(pnz.a), auu0Var, qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(b9d0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = x9d0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        String str4 = null;
        List list = null;
        d9d0 d9d0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) b.s(serialDescriptor, 3, pnz.a, l);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    d9d0Var = (d9d0) b.s(serialDescriptor, 6, b9d0.a, d9d0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new x9d0(i, str, str2, str3, l, str4, list, d9d0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x9d0 x9d0Var = (x9d0) obj;
        Long l = x9d0Var.d;
        String str = x9d0Var.c;
        String str2 = x9d0Var.b;
        String str3 = x9d0Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = x9d0.h;
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 0, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 1, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        if (b.F() || l != null) {
            b.g(serialDescriptor, 3, pnz.a, l);
        }
        String str4 = x9d0Var.e;
        d9d0 d9d0Var = x9d0Var.g;
        List list = x9d0Var.f;
        b.o(serialDescriptor, 4, str4);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), list);
        }
        if (b.F() || d9d0Var != null) {
            b.g(serialDescriptor, 6, b9d0.a, d9d0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
