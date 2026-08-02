package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class kx implements uxs {
    public static final kx a;
    private static final SerialDescriptor descriptor;

    static {
        kx kxVar = new kx();
        a = kxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.core.action.remote.parser.ActionQuerySurrogate", kxVar, 3);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("params", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) mx.d[1].getValue()), qke.n(mdx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mx.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Map map = null;
        c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                cVar = (c) b.s(serialDescriptor, 2, mdx.a, cVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new mx(i, str, map, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mx mxVar = (mx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mx.d;
        b.o(serialDescriptor, 0, mxVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mxVar.b);
        b.g(serialDescriptor, 2, mdx.a, mxVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
