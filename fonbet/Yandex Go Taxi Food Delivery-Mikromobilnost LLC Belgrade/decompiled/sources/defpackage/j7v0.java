package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class j7v0 implements uxs {
    public static final j7v0 a;
    private static final SerialDescriptor descriptor;

    static {
        j7v0 j7v0Var = new j7v0();
        a = j7v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.suggest.SuggestParams.SessionInfo", j7v0Var, 2);
        pluginGeneratedSerialDescriptor.j("session_time", true);
        pluginGeneratedSerialDescriptor.j("result_seen_fully", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(pnz.a), qke.n((KSerializer) l7v0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l7v0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new l7v0(i, l, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l7v0 l7v0Var = (l7v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l7v0.c;
        if (b.F() || l7v0Var.a != null) {
            b.g(serialDescriptor, 0, pnz.a, l7v0Var.a);
        }
        if (b.F() || l7v0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), l7v0Var.b);
        }
        b.c(serialDescriptor);
    }
}
