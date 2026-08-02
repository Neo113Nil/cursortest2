package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.NotificationParams;

/* loaded from: classes9.dex */
public final /* synthetic */ class nq1 implements uxs {
    public static final nq1 a;
    private static final SerialDescriptor descriptor;

    static {
        nq1 nq1Var = new nq1();
        a = nq1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.Alert", nq1Var, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("notification_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(ti60.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        NotificationParams notificationParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                notificationParams = (NotificationParams) b.s(serialDescriptor, 4, ti60.a, notificationParams);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new pq1(i, str, str2, str3, str4, notificationParams);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pq1 pq1Var = (pq1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || pq1Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, pq1Var.a);
        }
        if (b.F() || pq1Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, pq1Var.b);
        }
        if (b.F() || pq1Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, pq1Var.c);
        }
        if (b.F() || pq1Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, pq1Var.d);
        }
        if (b.F() || pq1Var.e != null) {
            b.g(serialDescriptor, 4, ti60.a, pq1Var.e);
        }
        b.c(serialDescriptor);
    }
}
