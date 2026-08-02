package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.p0;
import ru.yandex.taxi.communications.api.dto.q0;

/* loaded from: classes5.dex */
public final /* synthetic */ class equ0 implements uxs {
    public static final equ0 a;
    private static final SerialDescriptor descriptor;

    static {
        equ0 equ0Var = new equ0();
        a = equ0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.StoryWidgets.ActionButton", equ0Var, 6);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("text_color", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("element_payload", true);
        pluginGeneratedSerialDescriptor.j("extra_actions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gqu0.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(p0.a), qke.n((KSerializer) i3yVarArr[4].getValue()), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gqu0.i;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        q0 q0Var = null;
        Map map = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    q0Var = (q0) b.s(serialDescriptor, 3, p0.a, q0Var);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new gqu0(i, str, str2, str3, q0Var, map, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gqu0 gqu0Var = (gqu0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gqu0.i;
        auu0 auu0Var = auu0.a;
        String str = gqu0Var.a;
        List list = gqu0Var.f;
        Map map = gqu0Var.e;
        b.g(serialDescriptor, 0, auu0Var, str);
        b.g(serialDescriptor, 1, auu0Var, gqu0Var.b);
        b.g(serialDescriptor, 2, auu0Var, gqu0Var.c);
        b.g(serialDescriptor, 3, p0.a, gqu0Var.d);
        if (b.F() || map != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), map);
        }
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), list);
        }
        b.c(serialDescriptor);
    }
}
