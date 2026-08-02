package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public final /* synthetic */ class f9o implements uxs {
    public static final f9o a;
    private static final SerialDescriptor descriptor;

    static {
        f9o f9oVar = new f9o();
        a = f9oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ErrorResponseDetailsInfo", f9oVar, 3);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("trusted_completion_enabled", true);
        pluginGeneratedSerialDescriptor.j("story_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) h9o.d[0].getValue()), qke.n(z96.a), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = h9o.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersErrorCode scootersErrorCode = null;
        Boolean bool = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                scootersErrorCode = (ScootersErrorCode) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), scootersErrorCode);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new h9o(i, scootersErrorCode, bool, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h9o h9oVar = (h9o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = h9o.d;
        if (b.F() || h9oVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), h9oVar.a);
        }
        if (b.F() || h9oVar.b != null) {
            b.g(serialDescriptor, 1, z96.a, h9oVar.b);
        }
        if (b.F() || h9oVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, h9oVar.c);
        }
        b.c(serialDescriptor);
    }
}
