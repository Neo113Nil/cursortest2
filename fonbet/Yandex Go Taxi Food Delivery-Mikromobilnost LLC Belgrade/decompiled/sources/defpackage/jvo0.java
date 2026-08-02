package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class jvo0 implements uxs {
    public static final jvo0 a;
    private static final SerialDescriptor descriptor;

    static {
        jvo0 jvo0Var = new jvo0();
        a = jvo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.share_location.data.model.ScootersShareLocationParams", jvo0Var, 1);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ovo0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        qvo0 qvo0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                qvo0Var = (qvo0) b.A(serialDescriptor, 0, ovo0.a, qvo0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new rvo0(i, qvo0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, ovo0.a, ((rvo0) obj).a);
        b.c(serialDescriptor);
    }
}
