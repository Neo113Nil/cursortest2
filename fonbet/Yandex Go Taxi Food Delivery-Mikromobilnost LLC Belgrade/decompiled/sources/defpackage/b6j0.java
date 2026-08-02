package defpackage;

import com.yandex.div.state.db.StateEntry;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.eatskit.dto.ErrorType;

/* loaded from: classes5.dex */
public final /* synthetic */ class b6j0 implements uxs {
    public static final b6j0 a;
    private static final SerialDescriptor descriptor;

    static {
        b6j0 b6j0Var = new b6j0();
        a = b6j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.RequestError", b6j0Var, 5);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("localizedMessage", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = d6j0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d6j0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        ErrorType errorType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                errorType = (ErrorType) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), errorType);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new d6j0(i, str, str2, str3, num, errorType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d6j0 d6j0Var = (d6j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d6j0.f;
        if (b.F() || d6j0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, d6j0Var.a);
        }
        if (b.F() || !jl40.l(d6j0Var.b, "")) {
            b.o(serialDescriptor, 1, d6j0Var.b);
        }
        if (b.F() || d6j0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, d6j0Var.c);
        }
        if (b.F() || d6j0Var.d != null) {
            b.g(serialDescriptor, 3, h6w.a, d6j0Var.d);
        }
        if (b.F() || d6j0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), d6j0Var.e);
        }
        b.c(serialDescriptor);
    }
}
