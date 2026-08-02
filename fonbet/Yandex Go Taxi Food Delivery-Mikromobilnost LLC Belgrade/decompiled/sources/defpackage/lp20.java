package defpackage;

import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import com.yandex.mob.model.MobNotificationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class lp20 implements uxs {
    public static final lp20 a;
    private static final SerialDescriptor descriptor;

    static {
        lp20 lp20Var = new lp20();
        a = lp20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.model.MobNotification", lp20Var, 2);
        pluginGeneratedSerialDescriptor.j(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, false);
        pluginGeneratedSerialDescriptor.j("notification_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) np20.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = np20.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        MobNotificationType mobNotificationType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                mobNotificationType = (MobNotificationType) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), mobNotificationType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new np20(i, str, mobNotificationType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        np20 np20Var = (np20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = np20.c;
        String str = np20Var.a;
        MobNotificationType mobNotificationType = np20Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || mobNotificationType != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mobNotificationType);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
