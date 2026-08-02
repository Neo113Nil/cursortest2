package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jpz0 implements uxs {
    public static final jpz0 a;
    private static final SerialDescriptor descriptor;

    static {
        jpz0 jpz0Var = new jpz0();
        a = jpz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.Titles", jpz0Var, 5);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_default_price_key", true);
        pluginGeneratedSerialDescriptor.j("title_with_toll_road_price_key", true);
        pluginGeneratedSerialDescriptor.j("toll_road_selected_summary_title_redesigned_key", true);
        pluginGeneratedSerialDescriptor.j("select_road_summary_title_redesigned_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new soz0.j(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.j jVar = (soz0.j) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(jVar.a, "")) {
            b.o(serialDescriptor, 0, jVar.a);
        }
        if (b.F() || !jl40.l(jVar.b, "")) {
            b.o(serialDescriptor, 1, jVar.b);
        }
        if (b.F() || !jl40.l(jVar.c, "")) {
            b.o(serialDescriptor, 2, jVar.c);
        }
        if (b.F() || !jl40.l(jVar.d, "")) {
            b.o(serialDescriptor, 3, jVar.d);
        }
        if (b.F() || !jl40.l(jVar.e, "")) {
            b.o(serialDescriptor, 4, jVar.e);
        }
        b.c(serialDescriptor);
    }
}
