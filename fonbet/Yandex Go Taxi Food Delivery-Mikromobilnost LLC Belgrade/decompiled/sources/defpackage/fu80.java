package defpackage;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$OpenType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class fu80 implements uxs {
    public static final fu80 a;
    private static final SerialDescriptor descriptor;

    static {
        fu80 fu80Var = new fu80();
        a = fu80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OPEN_LINK", fu80Var, 6);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("urlType", false);
        pluginGeneratedSerialDescriptor.j("openType", false);
        pluginGeneratedSerialDescriptor.j("needAuth", false);
        pluginGeneratedSerialDescriptor.j("presentationOptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ju80.g;
        return new KSerializer[]{qke.n(auu0.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), z96.a, qke.n(twe0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ju80.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        Uri uri = null;
        OutMessage$OpenUrl$UrlType outMessage$OpenUrl$UrlType = null;
        OutMessage$OpenUrl$OpenType outMessage$OpenUrl$OpenType = null;
        exe0 exe0Var = null;
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
                    uri = (Uri) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), uri);
                    i |= 2;
                    break;
                case 2:
                    outMessage$OpenUrl$UrlType = (OutMessage$OpenUrl$UrlType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), outMessage$OpenUrl$UrlType);
                    i |= 4;
                    break;
                case 3:
                    outMessage$OpenUrl$OpenType = (OutMessage$OpenUrl$OpenType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), outMessage$OpenUrl$OpenType);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    exe0Var = (exe0) b.s(serialDescriptor, 5, twe0.a, exe0Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ju80(i, str, uri, outMessage$OpenUrl$UrlType, outMessage$OpenUrl$OpenType, z2, exe0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ju80 ju80Var = (ju80) obj;
        String str = ju80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ju80.g;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        KSerializer kSerializer = (KSerializer) i3yVarArr[1].getValue();
        Uri uri = ju80Var.b;
        exe0 exe0Var = ju80Var.f;
        b.e(serialDescriptor, 1, kSerializer, uri);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ju80Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), ju80Var.d);
        b.n(serialDescriptor, 4, ju80Var.e);
        if (b.F() || exe0Var != null) {
            b.g(serialDescriptor, 5, twe0.a, exe0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
