package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.PhotoType;

/* loaded from: classes6.dex */
public final /* synthetic */ class j60 implements uxs {
    public static final j60 a;
    private static final SerialDescriptor descriptor;

    static {
        j60 j60Var = new j60();
        a = j60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ActualizationParams", j60Var, 3);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("photos", false);
        pluginGeneratedSerialDescriptor.j("photo_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = l60.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = l60.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        PhotoType photoType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                photoType = (PhotoType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), photoType);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new l60(i, str, list, photoType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l60 l60Var = (l60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = l60.d;
        b.o(serialDescriptor, 0, l60Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), l60Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), l60Var.c);
        b.c(serialDescriptor);
    }
}
