package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReasonCode;

/* loaded from: classes9.dex */
public final /* synthetic */ class iw11 implements uxs {
    public static final iw11 a;
    private static final SerialDescriptor descriptor;

    static {
        iw11 iw11Var = new iw11();
        a = iw11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReason", iw11Var, 6);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("uber_link", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("url_text", true);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kw11.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kw11.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        UnavailabilityReasonCode unavailabilityReasonCode = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
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
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    unavailabilityReasonCode = (UnavailabilityReasonCode) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), unavailabilityReasonCode);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new kw11(i, str, str2, str3, str4, str5, unavailabilityReasonCode);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kw11 kw11Var = (kw11) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kw11.g;
        if (b.F() || kw11Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, kw11Var.a);
        }
        if (b.F() || kw11Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, kw11Var.b);
        }
        if (b.F() || kw11Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, kw11Var.c);
        }
        if (b.F() || kw11Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, kw11Var.d);
        }
        if (b.F() || kw11Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, kw11Var.e);
        }
        if (b.F() || kw11Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), kw11Var.f);
        }
        b.c(serialDescriptor);
    }
}
