package defpackage;

import com.yandex.payment.common.result.ResultType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class cb41 implements uxs {
    public static final cb41 a;
    private static final SerialDescriptor descriptor;

    static {
        cb41 cb41Var = new cb41();
        a = cb41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.logistics.care.web_view.impl.js.WebCameraConfig", cb41Var, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("configuration", false);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("localizations", false);
        pluginGeneratedSerialDescriptor.j(ResultType.RESULT_TYPE_LOADING, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = fc41.g;
        return new KSerializer[]{auu0.a, h6w.a, hb41.a, i3yVarArr[3].getValue(), tb41.a, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = fc41.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        jb41 jb41Var = null;
        List list = null;
        vb41 vb41Var = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jb41Var = (jb41) b.A(serialDescriptor, 2, hb41.a, jb41Var);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    vb41Var = (vb41) b.A(serialDescriptor, 4, tb41.a, vb41Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new fc41(i, str, i2, jb41Var, list, vb41Var, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fc41 fc41Var = (fc41) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = fc41.g;
        String str = fc41Var.a;
        int i = fc41Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || i != 1) {
            b.A(1, i, serialDescriptor);
        }
        b.e(serialDescriptor, 2, hb41.a, fc41Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), fc41Var.d);
        b.e(serialDescriptor, 4, tb41.a, fc41Var.e);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), fc41Var.f);
        b.c(serialDescriptor);
    }
}
