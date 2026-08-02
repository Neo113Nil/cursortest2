package defpackage;

import com.adjust.sdk.Constants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class opv implements uxs {
    public static final opv a;
    private static final SerialDescriptor descriptor;

    static {
        opv opvVar = new opv();
        a = opvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.voip_calls.calls_go.IncomingCallArgs", opvVar, 3);
        pluginGeneratedSerialDescriptor.j(Constants.PUSH, false);
        pluginGeneratedSerialDescriptor.j("callToCar", true);
        pluginGeneratedSerialDescriptor.j("callToAvatarUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qpv.d[0].getValue(), qke.n(gk7.a), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qpv.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        ik7 ik7Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i |= 1;
            } else if (v == 1) {
                ik7Var = (ik7) b.s(serialDescriptor, 1, gk7.a, ik7Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qpv(i, map, ik7Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qpv qpvVar = (qpv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) qpv.d[0].getValue();
        Map map = qpvVar.a;
        String str = qpvVar.c;
        ik7 ik7Var = qpvVar.b;
        b.e(serialDescriptor, 0, kSerializer, map);
        if (b.F() || ik7Var != null) {
            b.g(serialDescriptor, 1, gk7.a, ik7Var);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
