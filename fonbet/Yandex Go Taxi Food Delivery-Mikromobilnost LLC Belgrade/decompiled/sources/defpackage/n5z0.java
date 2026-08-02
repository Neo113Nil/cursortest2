package defpackage;

import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes2.dex */
public final /* synthetic */ class n5z0 implements uxs {
    public static final n5z0 a;
    private static final SerialDescriptor descriptor;

    static {
        n5z0 n5z0Var = new n5z0();
        a = n5z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.quark.chrono.Time", n5z0Var, 2);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, false);
        pluginGeneratedSerialDescriptor.j("timeUnit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, r5z0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r5z0.c;
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        TimeUnit timeUnit = null;
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
                timeUnit = (TimeUnit) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), timeUnit);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new r5z0(i, j, timeUnit);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r5z0 r5z0Var = (r5z0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r5z0.c;
        long j = r5z0Var.a;
        TimeUnit timeUnit = r5z0Var.b;
        b.s(serialDescriptor, 0, j);
        if (b.F() || timeUnit != TimeUnit.MILLISECONDS) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), timeUnit);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
