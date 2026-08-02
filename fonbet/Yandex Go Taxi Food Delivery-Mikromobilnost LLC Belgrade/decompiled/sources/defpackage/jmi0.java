package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class jmi0 implements uxs {
    public static final jmi0 a;
    private static final SerialDescriptor descriptor;

    static {
        jmi0 jmi0Var = new jmi0();
        a = jmi0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.redirect.response.RedirectionConfigResponseDto", jmi0Var, 4);
        pluginGeneratedSerialDescriptor.j("features", false);
        pluginGeneratedSerialDescriptor.j("host_apps", false);
        pluginGeneratedSerialDescriptor.j("merchant_id", false);
        pluginGeneratedSerialDescriptor.j("browser_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = lmi0.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), auu0.a, qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lmi0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new lmi0(i, list, list2, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lmi0 lmi0Var = (lmi0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lmi0.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        List list = lmi0Var.a;
        Boolean bool = lmi0Var.d;
        b.e(serialDescriptor, 0, kSerializer, list);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), lmi0Var.b);
        b.o(serialDescriptor, 2, lmi0Var.c);
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 3, z96.a, bool);
        }
        b.c(serialDescriptor);
    }
}
