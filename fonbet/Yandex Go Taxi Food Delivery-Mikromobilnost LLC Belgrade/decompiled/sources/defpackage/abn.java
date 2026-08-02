package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class abn implements uxs {
    public static final abn a;
    private static final SerialDescriptor descriptor;

    static {
        abn abnVar = new abn();
        a = abnVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.EarlyAuthorizationOnboarding", abnVar, 5);
        pluginGeneratedSerialDescriptor.j("title_prefix", true);
        pluginGeneratedSerialDescriptor.j("title_highlight", true);
        pluginGeneratedSerialDescriptor.j("button_title", true);
        pluginGeneratedSerialDescriptor.j("agreement_type", true);
        pluginGeneratedSerialDescriptor.j("languages_with_reversed_title_order", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cbn.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(auu0Var), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cbn.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new cbn(i, str, str2, str3, str4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cbn cbnVar = (cbn) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cbn.f;
        if (b.F() || !jl40.l(cbnVar.a, "")) {
            b.o(serialDescriptor, 0, cbnVar.a);
        }
        if (b.F() || !jl40.l(cbnVar.b, "")) {
            b.o(serialDescriptor, 1, cbnVar.b);
        }
        if (b.F() || !jl40.l(cbnVar.c, "")) {
            b.o(serialDescriptor, 2, cbnVar.c);
        }
        if (b.F() || cbnVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cbnVar.d);
        }
        if (b.F() || !jl40.l(cbnVar.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), cbnVar.e);
        }
        b.c(serialDescriptor);
    }
}
