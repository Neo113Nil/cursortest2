package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class foh implements uxs {
    public static final foh a;
    private static final SerialDescriptor descriptor;

    static {
        foh fohVar = new foh();
        a = fohVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.widgets.data.dto.request.DeferTrackingRequestDto", fohVar, 2);
        pluginGeneratedSerialDescriptor.j("deferred_tracking", false);
        pluginGeneratedSerialDescriptor.j("orders_info", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hoh.a, koh.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = koh.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        joh johVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                johVar = (joh) b.A(serialDescriptor, 0, hoh.a, johVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new koh(i, johVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        koh kohVar = (koh) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = koh.c;
        b.e(serialDescriptor, 0, hoh.a, kohVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kohVar.b);
        b.c(serialDescriptor);
    }
}
