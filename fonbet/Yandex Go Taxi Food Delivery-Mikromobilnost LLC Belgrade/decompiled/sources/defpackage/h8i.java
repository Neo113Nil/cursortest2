package defpackage;

import defpackage.d8i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class h8i implements uxs {
    public static final h8i a;
    private static final SerialDescriptor descriptor;

    static {
        h8i h8iVar = new h8i();
        a = h8iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.explicitcomment.DeliveryExplicitCommentCourierExperiment.PhotoAttachments", h8iVar, 3);
        pluginGeneratedSerialDescriptor.j("max_photos", true);
        pluginGeneratedSerialDescriptor.j("max_photo_width", true);
        pluginGeneratedSerialDescriptor.j("max_photo_height", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new d8i.c(i, i2, i3, i4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d8i.c cVar = (d8i.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cVar.a != 0) {
            b.A(0, cVar.a, serialDescriptor);
        }
        if (b.F() || cVar.b != 0) {
            b.A(1, cVar.b, serialDescriptor);
        }
        if (b.F() || cVar.c != 0) {
            b.A(2, cVar.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
