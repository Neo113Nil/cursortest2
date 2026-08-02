package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.webview.UrlMatch;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class hwy implements uxs {
    public static final hwy a;
    private static final SerialDescriptor descriptor;

    static {
        hwy hwyVar = new hwy();
        a = hwyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.customview.views.webview.LoadCompleteAction", hwyVar, 3);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("match", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = lwy.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lwy.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        UrlMatch urlMatch = null;
        hlk hlkVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                urlMatch = (UrlMatch) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), urlMatch);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                hlkVar = (hlk) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), hlkVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new lwy(i, str, urlMatch, hlkVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lwy lwyVar = (lwy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lwy.d;
        b.o(serialDescriptor, 0, lwyVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), lwyVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), lwyVar.c);
        b.c(serialDescriptor);
    }
}
