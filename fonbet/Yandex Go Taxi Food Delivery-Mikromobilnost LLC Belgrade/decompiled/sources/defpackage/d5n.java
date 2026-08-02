package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class d5n implements uxs {
    public static final d5n a;
    private static final SerialDescriptor descriptor;

    static {
        d5n d5nVar = new d5n();
        a = d5nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.DynamicBinInfoProps", d5nVar, 2);
        pluginGeneratedSerialDescriptor.j("nextActionLockDelayInMillis", false);
        pluginGeneratedSerialDescriptor.j("cardNetworkDetails", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, f5n.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f5n.c;
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new f5n(j, i, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f5n f5nVar = (f5n) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f5n.c;
        b.s(serialDescriptor, 0, f5nVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), f5nVar.b);
        b.c(serialDescriptor);
    }
}
