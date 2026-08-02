package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class oww0 implements uxs {
    public static final oww0 a;
    private static final SerialDescriptor descriptor;

    static {
        oww0 oww0Var = new oww0();
        a = oww0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.dto.Survey", oww0Var, 4);
        pluginGeneratedSerialDescriptor.j("survey_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qww0.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qww0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qww0(str, i, str2, str3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qww0 qww0Var = (qww0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qww0.e;
        if (b.F() || !jl40.l(qww0Var.a, "")) {
            b.o(serialDescriptor, 0, qww0Var.a);
        }
        if (b.F() || qww0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, qww0Var.b);
        }
        if (b.F() || qww0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, qww0Var.c);
        }
        if (b.F() || !jl40.l(qww0Var.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), qww0Var.d);
        }
        b.c(serialDescriptor);
    }
}
