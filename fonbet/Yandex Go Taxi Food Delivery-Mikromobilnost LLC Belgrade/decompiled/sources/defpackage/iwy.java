package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class iwy implements uxs {
    public static final iwy a;
    private static final SerialDescriptor descriptor;

    static {
        iwy iwyVar = new iwy();
        a = iwyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.LoadCompleteAction", iwyVar, 3);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("match", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, mwy.d[1].getValue(), elk.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mwy.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        UrlMatch urlMatch = null;
        ilk ilkVar = null;
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
                ilkVar = (ilk) b.A(serialDescriptor, 2, elk.a, ilkVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new mwy(i, str, urlMatch, ilkVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mwy mwyVar = (mwy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mwy.d;
        b.o(serialDescriptor, 0, mwyVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mwyVar.b);
        b.e(serialDescriptor, 2, elk.a, mwyVar.c);
        b.c(serialDescriptor);
    }
}
