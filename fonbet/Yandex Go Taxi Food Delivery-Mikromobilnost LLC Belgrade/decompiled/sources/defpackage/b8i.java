package defpackage;

import defpackage.d8i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class b8i implements uxs {
    public static final b8i a;
    private static final SerialDescriptor descriptor;

    static {
        b8i b8iVar = new b8i();
        a = b8iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.explicitcomment.DeliveryExplicitCommentCourierExperiment.ChooseMessageRecipient", b8iVar, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("first_block_title", true);
        pluginGeneratedSerialDescriptor.j("first_block_description", true);
        pluginGeneratedSerialDescriptor.j("second_block_title", true);
        pluginGeneratedSerialDescriptor.j("second_block_description", true);
        pluginGeneratedSerialDescriptor.j("button_receiver", true);
        pluginGeneratedSerialDescriptor.j("button_courier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str6 = null;
        String str7 = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d8i.a(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d8i.a aVar = (d8i.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 4, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, "")) {
            b.o(serialDescriptor, 5, aVar.f);
        }
        if (b.F() || !jl40.l(aVar.g, "")) {
            b.o(serialDescriptor, 6, aVar.g);
        }
        b.c(serialDescriptor);
    }
}
