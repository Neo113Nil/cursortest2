package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class pbr implements uxs {
    public static final pbr a;
    private static final SerialDescriptor descriptor;

    static {
        pbr pbrVar = new pbr();
        a = pbrVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote.FintechRemoteQuery", pbrVar, 3);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(mdx.a), qke.n((KSerializer) rbr.d[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rbr.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        c cVar = null;
        Map map = null;
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
                map = (Map) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rbr(i, str, map, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rbr rbrVar = (rbr) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rbr.d;
        String str = rbrVar.a;
        Map map = rbrVar.c;
        c cVar = rbrVar.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || cVar != null) {
            b.g(serialDescriptor, 1, mdx.a, cVar);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), map);
        }
        b.c(serialDescriptor);
    }
}
