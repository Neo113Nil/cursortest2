package defpackage;

import defpackage.d8i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class j8i implements uxs {
    public static final j8i a;
    private static final SerialDescriptor descriptor;

    static {
        j8i j8iVar = new j8i();
        a = j8iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.explicitcomment.DeliveryExplicitCommentCourierExperiment.TariffExplicitCommentItem", j8iVar, 7);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("button_requirement_title_courier", true);
        pluginGeneratedSerialDescriptor.j("button_requirement_title_recipient", true);
        pluginGeneratedSerialDescriptor.j("button_requirement_subtitle_courier", true);
        pluginGeneratedSerialDescriptor.j("comment_view_courier", true);
        pluginGeneratedSerialDescriptor.j("choose_message_recipient_view", true);
        pluginGeneratedSerialDescriptor.j("pop_upped", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, e8i.a, b8i.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        d8i.b bVar = null;
        d8i.a aVar = null;
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
                    bVar = (d8i.b) b.A(serialDescriptor, 4, e8i.a, bVar);
                    i |= 16;
                    break;
                case 5:
                    aVar = (d8i.a) b.A(serialDescriptor, 5, b8i.a, aVar);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d8i.d(i, str, str2, str3, str4, bVar, aVar, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        d8i.d.a((d8i.d) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
