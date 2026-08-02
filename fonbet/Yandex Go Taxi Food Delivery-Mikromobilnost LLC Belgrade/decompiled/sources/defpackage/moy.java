package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class moy implements uxs {
    public static final moy a;
    private static final SerialDescriptor descriptor;

    static {
        moy moyVar = new moy();
        a = moyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderOriginalRequestDto", moyVar, 1);
        pluginGeneratedSerialDescriptor.j("route", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ooy.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ooy.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new ooy(i, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ooy ooyVar = (ooy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ooy.b;
        if (b.F() || !jl40.l(ooyVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ooyVar.a);
        }
        b.c(serialDescriptor);
    }
}
