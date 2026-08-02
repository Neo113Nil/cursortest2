package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class jj60 implements uxs {
    public static final jj60 a;
    private static final SerialDescriptor descriptor;

    static {
        jj60 jj60Var = new jj60();
        a = jj60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.tips.NotificationShowedInfo", jj60Var, 1);
        pluginGeneratedSerialDescriptor.j("orderToTimestampMap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lj60.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lj60.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new lj60(i, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lj60 lj60Var = (lj60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lj60.b;
        if (b.F() || !jl40.l(lj60Var.a, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), lj60Var.a);
        }
        b.c(serialDescriptor);
    }
}
