package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class iaj implements uxs {
    public static final iaj a;
    private static final SerialDescriptor descriptor;

    static {
        iaj iajVar = new iaj();
        a = iajVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.devicechallenge.DeviceChallengePubkeyAction", iajVar, 3);
        pluginGeneratedSerialDescriptor.j("analyticsParams", true);
        pluginGeneratedSerialDescriptor.j("onCompleteAction", true);
        pluginGeneratedSerialDescriptor.j("publicKeyVarPath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kaj.d;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kaj.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        vm50 vm50Var = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                vm50Var = (vm50) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), vm50Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kaj(i, map, vm50Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kaj kajVar = (kaj) obj;
        List list = kajVar.c;
        vm50 vm50Var = kajVar.b;
        Map map = kajVar.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kaj.d;
        if (b.F() || map != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), map);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), vm50Var);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
