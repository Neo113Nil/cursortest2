package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$LogoutResponse$LogoutStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final /* synthetic */ class fmv implements uxs {
    public static final fmv a;
    private static final SerialDescriptor descriptor;

    static {
        fmv fmvVar = new fmv();
        a = fmvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("LOG_OUT_RESPONSE", fmvVar, 2);
        pluginGeneratedSerialDescriptor.j("trackId", false);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), imv.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = imv.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                inMessage$LogoutResponse$LogoutStatus = (InMessage$LogoutResponse$LogoutStatus) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), inMessage$LogoutResponse$LogoutStatus);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new imv(i, str, inMessage$LogoutResponse$LogoutStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        imv imvVar = (imv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = imv.c;
        b.g(serialDescriptor, 0, auu0.a, imvVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), imvVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
