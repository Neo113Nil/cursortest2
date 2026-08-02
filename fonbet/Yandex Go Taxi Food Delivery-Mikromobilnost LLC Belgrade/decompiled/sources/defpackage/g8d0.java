package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class g8d0 implements uxs {
    public static final g8d0 a;
    private static final SerialDescriptor descriptor;

    static {
        g8d0 g8d0Var = new g8d0();
        a = g8d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGetSmartOffersRequestDto.TargetAndFeatures", g8d0Var, 2);
        pluginGeneratedSerialDescriptor.j("target", false);
        pluginGeneratedSerialDescriptor.j("features", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, i8d0.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = i8d0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Set set = null;
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
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new i8d0(i, str, set);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i8d0 i8d0Var = (i8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = i8d0.c;
        b.o(serialDescriptor, 0, i8d0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), i8d0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
