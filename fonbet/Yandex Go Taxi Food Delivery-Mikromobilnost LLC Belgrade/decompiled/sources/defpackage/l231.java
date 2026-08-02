package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class l231 implements uxs {
    public static final l231 a;
    private static final SerialDescriptor descriptor;

    static {
        l231 l231Var = new l231();
        a = l231Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.nodes.VariableNode", l231Var, 3);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, false);
        pluginGeneratedSerialDescriptor.j("optional", true);
        pluginGeneratedSerialDescriptor.j("optionalDescriptor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n231.d[0].getValue(), z96.a, qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = n231.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
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
        return new n231(i, list, z2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n231 n231Var = (n231) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) n231.d[0].getValue();
        List list = n231Var.a;
        b bVar = n231Var.c;
        boolean z = n231Var.b;
        b.e(serialDescriptor, 0, kSerializer, list);
        if (b.F() || z) {
            b.n(serialDescriptor, 1, z);
        }
        if (b.F() || bVar != null) {
            b.g(serialDescriptor, 2, rcx.a, bVar);
        }
        b.c(serialDescriptor);
    }
}
