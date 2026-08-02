package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class okc implements uxs {
    public static final okc a;
    private static final SerialDescriptor descriptor;

    static {
        okc okcVar = new okc();
        a = okcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.quark.js.command.Command.SendPlatformCapabilityEventCommand.Payload", okcVar, 2);
        pluginGeneratedSerialDescriptor.j("capabilityId", false);
        pluginGeneratedSerialDescriptor.j(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qkc.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qkc.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        png pngVar = null;
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
                pngVar = (png) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), pngVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new qkc(i, str, pngVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qkc qkcVar = (qkc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qkc.c;
        b.o(serialDescriptor, 0, qkcVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qkcVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
