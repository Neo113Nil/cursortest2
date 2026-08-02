package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NeedAuthorization$Reason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes2.dex */
public final /* synthetic */ class mt80 implements uxs {
    public static final mt80 a;
    private static final SerialDescriptor descriptor;

    static {
        mt80 mt80Var = new mt80();
        a = mt80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("NEED_AUTHORIZATION", mt80Var, 3);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, false);
        pluginGeneratedSerialDescriptor.j("callbackUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pt80.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pt80.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                outMessage$NeedAuthorization$Reason = (OutMessage$NeedAuthorization$Reason) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), outMessage$NeedAuthorization$Reason);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pt80(i, str, outMessage$NeedAuthorization$Reason, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pt80 pt80Var = (pt80) obj;
        String str = pt80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pt80.d;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pt80Var.b);
        b.o(serialDescriptor, 2, pt80Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
