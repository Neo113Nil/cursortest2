package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class m6c implements uxs {
    public static final m6c a;
    private static final SerialDescriptor descriptor;

    static {
        m6c m6cVar = new m6c();
        a = m6cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.ClosingOfferDto", m6cVar, 11);
        pluginGeneratedSerialDescriptor.j("eventSessionId", false);
        pluginGeneratedSerialDescriptor.j("batchId", false);
        pluginGeneratedSerialDescriptor.j("closingOfferTarget", false);
        pluginGeneratedSerialDescriptor.j("backgroundImage", false);
        pluginGeneratedSerialDescriptor.j("closingOfferTitle", false);
        pluginGeneratedSerialDescriptor.j("closingOfferSubtitle", true);
        pluginGeneratedSerialDescriptor.j("offer", false);
        pluginGeneratedSerialDescriptor.j("offerAssets", false);
        pluginGeneratedSerialDescriptor.j("acceptButtonText", false);
        pluginGeneratedSerialDescriptor.j("rejectButtonText", false);
        pluginGeneratedSerialDescriptor.j("footer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = r6c.l;
        auu0 auu0Var = auu0.a;
        k3k0 k3k0Var = k3k0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, m9v.a, k3k0Var, qke.n(k3k0Var), tnd.a, i3yVarArr[7].getValue(), auu0Var, auu0Var, qke.n(k3k0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r6c.l;
        b.getClass();
        q3k0 q3k0Var = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        q9v q9vVar = null;
        q3k0 q3k0Var2 = null;
        q3k0 q3k0Var3 = null;
        spd spdVar = null;
        String str4 = null;
        String str5 = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    q9vVar = (q9v) b.A(serialDescriptor, 3, m9v.a, q9vVar);
                    i |= 8;
                    break;
                case 4:
                    q3k0Var2 = (q3k0) b.A(serialDescriptor, 4, k3k0.a, q3k0Var2);
                    i |= 16;
                    break;
                case 5:
                    q3k0Var3 = (q3k0) b.s(serialDescriptor, 5, k3k0.a, q3k0Var3);
                    i |= 32;
                    break;
                case 6:
                    spdVar = (spd) b.A(serialDescriptor, 6, tnd.a, spdVar);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    str4 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str5 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    q3k0Var = (q3k0) b.s(serialDescriptor, 10, k3k0.a, q3k0Var);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new r6c(i, str, str2, str3, q9vVar, q3k0Var2, q3k0Var3, spdVar, list, str4, str5, q3k0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r6c r6cVar = (r6c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r6c.l;
        String str = r6cVar.a;
        q3k0 q3k0Var = r6cVar.k;
        q3k0 q3k0Var2 = r6cVar.f;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, r6cVar.b);
        b.o(serialDescriptor, 2, r6cVar.c);
        b.e(serialDescriptor, 3, m9v.a, r6cVar.d);
        k3k0 k3k0Var = k3k0.a;
        b.e(serialDescriptor, 4, k3k0Var, r6cVar.e);
        if (b.F() || q3k0Var2 != null) {
            b.g(serialDescriptor, 5, k3k0Var, q3k0Var2);
        }
        b.e(serialDescriptor, 6, tnd.a, r6cVar.g);
        b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), r6cVar.h);
        b.o(serialDescriptor, 8, r6cVar.i);
        b.o(serialDescriptor, 9, r6cVar.j);
        if (b.F() || q3k0Var != null) {
            b.g(serialDescriptor, 10, k3k0Var, q3k0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
