package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class oee0 implements uxs {
    public static final oee0 a;
    private static final SerialDescriptor descriptor;

    static {
        oee0 oee0Var = new oee0();
        a = oee0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.PostMessageData", oee0Var, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(mdx.a), qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        c cVar = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                cVar = (c) b.s(serialDescriptor, 1, mdx.a, cVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.s(serialDescriptor, 2, rcx.a, bVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qee0(i, str, cVar, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qee0 qee0Var = (qee0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = qee0Var.a;
        b bVar = qee0Var.c;
        c cVar = qee0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || cVar != null) {
            b.g(serialDescriptor, 1, mdx.a, cVar);
        }
        if (b.F() || bVar != null) {
            b.g(serialDescriptor, 2, rcx.a, bVar);
        }
        b.c(serialDescriptor);
    }
}
