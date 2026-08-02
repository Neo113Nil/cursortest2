package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class lia0 implements uxs {
    public static final lia0 a;
    private static final SerialDescriptor descriptor;

    static {
        lia0 lia0Var = new lia0();
        a = lia0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.PaymentScreenRequestDto", lia0Var, 5);
        pluginGeneratedSerialDescriptor.j("supportedFeatures", false);
        pluginGeneratedSerialDescriptor.j("requestedScreenName", false);
        pluginGeneratedSerialDescriptor.j("language", false);
        pluginGeneratedSerialDescriptor.j(DivkitThemeChangeListener.THEME_VARIABLE_NAME, false);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qia0.f[0].getValue(), auu0Var, auu0Var, auu0Var, nia0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qia0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        pia0 pia0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                pia0Var = (pia0) b.A(serialDescriptor, 4, nia0.a, pia0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new qia0(i, list, str, str2, str3, pia0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qia0 qia0Var = (qia0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) qia0.f[0].getValue(), qia0Var.a);
        b.o(serialDescriptor, 1, qia0Var.b);
        b.o(serialDescriptor, 2, qia0Var.c);
        b.o(serialDescriptor, 3, qia0Var.d);
        b.e(serialDescriptor, 4, nia0.a, qia0Var.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
