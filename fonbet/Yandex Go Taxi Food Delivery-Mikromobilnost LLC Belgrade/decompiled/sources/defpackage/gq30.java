package defpackage;

import com.yandex.go.dto.response.q1;
import defpackage.kq30;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.model.MtPositionOverMap;

/* loaded from: classes6.dex */
public final /* synthetic */ class gq30 implements uxs {
    public static final gq30 a;
    private static final SerialDescriptor descriptor;

    static {
        gq30 gq30Var = new gq30();
        a = gq30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.model.MtObjectOverMap", gq30Var, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("accessibility_text", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kq30.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(iq30.a), qke.n(xc30.e), qke.n(xx.f), qke.n(w7s.a), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kq30.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String str = null;
        kq30.a aVar = null;
        wc30 wc30Var = null;
        q1 q1Var = null;
        FormattedText formattedText = null;
        MtPositionOverMap mtPositionOverMap = null;
        String str2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    aVar = (kq30.a) b.s(serialDescriptor, 1, iq30.a, aVar);
                    i |= 2;
                    break;
                case 2:
                    wc30Var = (wc30) b.s(serialDescriptor, 2, xc30.e, wc30Var);
                    i |= 4;
                    break;
                case 3:
                    q1Var = (q1) b.s(serialDescriptor, 3, xx.f, q1Var);
                    i |= 8;
                    break;
                case 4:
                    formattedText = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText);
                    i |= 16;
                    break;
                case 5:
                    mtPositionOverMap = (MtPositionOverMap) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), mtPositionOverMap);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new kq30(i, str, aVar, wc30Var, q1Var, formattedText, mtPositionOverMap, str2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kq30 kq30Var = (kq30) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kq30.i;
        if (b.F() || !jl40.l(kq30Var.a, "")) {
            b.o(serialDescriptor, 0, kq30Var.a);
        }
        if (b.F() || kq30Var.b != null) {
            b.g(serialDescriptor, 1, iq30.a, kq30Var.b);
        }
        if (b.F() || kq30Var.c != null) {
            b.g(serialDescriptor, 2, xc30.e, kq30Var.c);
        }
        if (b.F() || kq30Var.d != null) {
            b.g(serialDescriptor, 3, xx.f, kq30Var.d);
        }
        if (b.F() || kq30Var.e != null) {
            b.g(serialDescriptor, 4, w7s.a, kq30Var.e);
        }
        if (b.F() || kq30Var.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), kq30Var.f);
        }
        if (b.F() || kq30Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, kq30Var.g);
        }
        if (b.F() || kq30Var.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), kq30Var.h);
        }
        b.c(serialDescriptor);
    }
}
