package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.b0;

/* loaded from: classes5.dex */
public final /* synthetic */ class kde0 implements uxs {
    public static final kde0 a;
    private static final SerialDescriptor descriptor;

    static {
        kde0 kde0Var = new kde0();
        a = kde0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PositionConfirmationAction", kde0Var, 7);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("accept_button_title", true);
        pluginGeneratedSerialDescriptor.j("decline_button_title", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("action_reason", true);
        pluginGeneratedSerialDescriptor.j("action_on_decline", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = b0.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0Var, auu0Var, auu0Var, i3yVarArr[4].getValue(), auu0Var, tde0.e};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        jsq0 jsq0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        sde0 sde0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jsq0Var = (jsq0) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), jsq0Var);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    sde0Var = (sde0) b.A(serialDescriptor, 6, tde0.e, sde0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new b0(i, jsq0Var, str, str2, str3, list, str4, sde0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b0 b0Var = (b0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = b0.h;
        if (b.F() || !jl40.l(b0Var.a, ksq0.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), b0Var.a);
        }
        if (b.F() || !jl40.l(b0Var.b, "")) {
            b.o(serialDescriptor, 1, b0Var.b);
        }
        if (b.F() || !jl40.l(b0Var.c, "")) {
            b.o(serialDescriptor, 2, b0Var.c);
        }
        if (b.F() || !jl40.l(b0Var.d, "")) {
            b.o(serialDescriptor, 3, b0Var.d);
        }
        if (b.F() || !jl40.l(b0Var.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), b0Var.e);
        }
        if (b.F() || !jl40.l(b0Var.f, "")) {
            b.o(serialDescriptor, 5, b0Var.f);
        }
        if (b.F() || !jl40.l(b0Var.g, rde0.INSTANCE)) {
            b.e(serialDescriptor, 6, tde0.e, b0Var.g);
        }
        b.c(serialDescriptor);
    }
}
