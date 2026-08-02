package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel$Position;
import java.net.URI;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class av50 implements uxs {
    public static final av50 a;
    private static final SerialDescriptor descriptor;

    static {
        av50 av50Var = new av50();
        a = av50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkIconNotificationModel", av50Var, 3);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cv50.d[0].getValue(), auu0.a, j7x.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cv50.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        NetworkNotificationModel$Position networkNotificationModel$Position = null;
        String str = null;
        URI uri = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                networkNotificationModel$Position = (NetworkNotificationModel$Position) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), networkNotificationModel$Position);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                uri = (URI) b.A(serialDescriptor, 2, j7x.a, uri);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new cv50(i, networkNotificationModel$Position, str, uri);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cv50 cv50Var = (cv50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) cv50.d[0].getValue(), cv50Var.a);
        b.o(serialDescriptor, 1, cv50Var.b);
        b.e(serialDescriptor, 2, j7x.a, cv50Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
