package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class pl7 implements uxs {
    public static final pl7 a;
    private static final SerialDescriptor descriptor;

    static {
        pl7 pl7Var = new pl7();
        a = pl7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.voip_calls.calls_go.CallsGoStartArgs", pl7Var, 13);
        pluginGeneratedSerialDescriptor.j("strings", false);
        pluginGeneratedSerialDescriptor.j("authToken", false);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("acceptLanguage", false);
        pluginGeneratedSerialDescriptor.j("userAgent", false);
        pluginGeneratedSerialDescriptor.j("isTesting", false);
        pluginGeneratedSerialDescriptor.j("baseUrl", false);
        pluginGeneratedSerialDescriptor.j("outgoingCallArgs", true);
        pluginGeneratedSerialDescriptor.j("incomingCallArgs", true);
        pluginGeneratedSerialDescriptor.j("callExperimentsArgs", false);
        pluginGeneratedSerialDescriptor.j("callConfigsArgs", false);
        pluginGeneratedSerialDescriptor.j("isDarkTheme", true);
        pluginGeneratedSerialDescriptor.j("isRtl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{rl7.n[0].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, z96Var, auu0Var, qke.n(vw80.a), qke.n(opv.a), wg7.a, lg7.a, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = rl7.n;
        b.getClass();
        ng7 ng7Var = null;
        yg7 yg7Var = null;
        qpv qpvVar = null;
        boolean z2 = true;
        xw80 xw80Var = null;
        int i = 0;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        String str5 = null;
        boolean z4 = false;
        boolean z5 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr3;
                    z2 = false;
                    i3yVarArr3 = i3yVarArr;
                case 0:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr2[0].getValue(), map);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr;
                case 6:
                    i3yVarArr = i3yVarArr3;
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr;
                case 7:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    xw80Var = (xw80) b.s(serialDescriptor, 7, vw80.a, xw80Var);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    qpvVar = (qpv) b.s(serialDescriptor, 8, opv.a, qpvVar);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    yg7Var = (yg7) b.A(serialDescriptor, 9, wg7.a, yg7Var);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    ng7Var = (ng7) b.A(serialDescriptor, 10, lg7.a, ng7Var);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    z4 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                case 12:
                    i3yVarArr = i3yVarArr3;
                    z5 = b.C(serialDescriptor, 12);
                    i |= 4096;
                    i3yVarArr3 = i3yVarArr;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new rl7(i, map, str, str2, str3, str4, z3, str5, xw80Var, qpvVar, yg7Var, ng7Var, z4, z5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rl7 rl7Var = (rl7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) rl7.n[0].getValue();
        Map map = rl7Var.a;
        qpv qpvVar = rl7Var.i;
        xw80 xw80Var = rl7Var.h;
        b.e(serialDescriptor, 0, kSerializer, map);
        b.o(serialDescriptor, 1, rl7Var.b);
        b.o(serialDescriptor, 2, rl7Var.c);
        b.o(serialDescriptor, 3, rl7Var.d);
        b.o(serialDescriptor, 4, rl7Var.e);
        b.n(serialDescriptor, 5, rl7Var.f);
        b.o(serialDescriptor, 6, rl7Var.g);
        if (b.F() || xw80Var != null) {
            b.g(serialDescriptor, 7, vw80.a, xw80Var);
        }
        if (b.F() || qpvVar != null) {
            b.g(serialDescriptor, 8, opv.a, qpvVar);
        }
        b.e(serialDescriptor, 9, wg7.a, rl7Var.j);
        b.e(serialDescriptor, 10, lg7.a, rl7Var.k);
        if (b.F() || rl7Var.l) {
            b.n(serialDescriptor, 11, rl7Var.l);
        }
        if (b.F() || rl7Var.m) {
            b.n(serialDescriptor, 12, rl7Var.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
