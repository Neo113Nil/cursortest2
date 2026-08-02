package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class iwx implements uxs {
    public static final iwx a;
    private static final SerialDescriptor descriptor;

    static {
        iwx iwxVar = new iwx();
        a = iwxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.dto.LaunchPushSettingsParam", iwxVar, 3);
        pluginGeneratedSerialDescriptor.j("enabled_by_system", false);
        pluginGeneratedSerialDescriptor.j("included_tags", false);
        pluginGeneratedSerialDescriptor.j("excluded_tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kwx.d;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kwx.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Set set = null;
        Set set2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kwx(i, set, set2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kwx kwxVar = (kwx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kwx.d;
        b.n(serialDescriptor, 0, kwxVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kwxVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), kwxVar.c);
        b.c(serialDescriptor);
    }
}
