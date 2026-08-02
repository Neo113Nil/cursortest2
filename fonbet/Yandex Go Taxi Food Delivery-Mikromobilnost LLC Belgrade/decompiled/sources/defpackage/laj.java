package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class laj implements uxs {
    public static final laj a;
    private static final SerialDescriptor descriptor;

    static {
        laj lajVar = new laj();
        a = lajVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.devicechallenge.DeviceChallengeSignatureAction", lajVar, 8);
        pluginGeneratedSerialDescriptor.j("deviceChallengePostDelay", false);
        pluginGeneratedSerialDescriptor.j("deviceChallengeStartDelay", false);
        pluginGeneratedSerialDescriptor.j("paymentMethodId", false);
        pluginGeneratedSerialDescriptor.j("purchaseToken", false);
        pluginGeneratedSerialDescriptor.j("dataVarPath", true);
        pluginGeneratedSerialDescriptor.j("onCompleteAction", true);
        pluginGeneratedSerialDescriptor.j("signatureVarPath", true);
        pluginGeneratedSerialDescriptor.j("userSuccessVarPath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = naj.i;
        KSerializer n = qke.n((KSerializer) i3yVarArr[4].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[6].getValue());
        KSerializer n4 = qke.n((KSerializer) i3yVarArr[7].getValue());
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h6wVar, h6wVar, auu0Var, auu0Var, n, n2, n3, n4};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = naj.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        String str2 = null;
        List list2 = null;
        vm50 vm50Var = null;
        List list3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    vm50Var = (vm50) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), vm50Var);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new naj(i, i2, i3, str, str2, list2, vm50Var, list3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        naj najVar = (naj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = naj.i;
        int i = najVar.a;
        List list = najVar.h;
        List list2 = najVar.g;
        vm50 vm50Var = najVar.f;
        List list3 = najVar.e;
        b.A(0, i, serialDescriptor);
        b.A(1, najVar.b, serialDescriptor);
        b.o(serialDescriptor, 2, najVar.c);
        b.o(serialDescriptor, 3, najVar.d);
        if (b.F() || list3 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), list3);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), vm50Var);
        }
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), list2);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
