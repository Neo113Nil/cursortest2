package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class nj8 implements uxs {
    public static final nj8 a;
    private static final SerialDescriptor descriptor;

    static {
        nj8 nj8Var = new nj8();
        a = nj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardNetworkData", nj8Var, 7);
        pluginGeneratedSerialDescriptor.j("iconUrl", false);
        pluginGeneratedSerialDescriptor.j("stringCode", false);
        pluginGeneratedSerialDescriptor.j("intervals", true);
        pluginGeneratedSerialDescriptor.j("securityCodeLabel", true);
        pluginGeneratedSerialDescriptor.j("securityCodeLength", false);
        pluginGeneratedSerialDescriptor.j("validLengths", false);
        pluginGeneratedSerialDescriptor.j("spaceIndexes", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pj8.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{uj8.a, auu0Var, qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0Var), h6w.a, i3yVarArr[5].getValue(), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pj8.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        wj8 wj8Var = null;
        String str = null;
        List list = null;
        String str2 = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    wj8Var = (wj8) b.A(serialDescriptor, 0, uj8.a, wj8Var);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new pj8(i, wj8Var, str, list, str2, i2, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pj8 pj8Var = (pj8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pj8.h;
        uj8 uj8Var = uj8.a;
        wj8 wj8Var = pj8Var.a;
        String str = pj8Var.d;
        List list = pj8Var.c;
        b.e(serialDescriptor, 0, uj8Var, wj8Var);
        b.o(serialDescriptor, 1, pj8Var.b);
        if (b.F() || list != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        b.A(4, pj8Var.e, serialDescriptor);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), pj8Var.f);
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), pj8Var.g);
        b.c(serialDescriptor);
    }
}
