package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class fvx implements uxs {
    public static final fvx a;
    private static final SerialDescriptor descriptor;

    static {
        fvx fvxVar = new fvx();
        a = fvxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LaunchLinkedOrderInfoDto", fvxVar, 3);
        pluginGeneratedSerialDescriptor.j("key", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("order_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = hvx.d;
        return new KSerializer[]{auu0.a, qke.n((KSerializer) i3yVarArr[1].getValue()), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = hvx.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        LinkedOrderStatusDto linkedOrderStatusDto = null;
        LinkedOrderTypeDto linkedOrderTypeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                linkedOrderStatusDto = (LinkedOrderStatusDto) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), linkedOrderStatusDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                linkedOrderTypeDto = (LinkedOrderTypeDto) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), linkedOrderTypeDto);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new hvx(i, str, linkedOrderStatusDto, linkedOrderTypeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        hvx.e((hvx) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
