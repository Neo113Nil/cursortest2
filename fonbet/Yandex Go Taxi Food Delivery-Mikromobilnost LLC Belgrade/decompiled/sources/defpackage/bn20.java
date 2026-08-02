package defpackage;

import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class bn20 implements uxs {
    public static final bn20 a;
    private static final SerialDescriptor descriptor;

    static {
        bn20 bn20Var = new bn20();
        a = bn20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobContourAvailabilityCheckStrategy", bn20Var, 1);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = dn20.b;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = dn20.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        MobContourAvailabilityCheckStrategyName mobContourAvailabilityCheckStrategyName = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                mobContourAvailabilityCheckStrategyName = (MobContourAvailabilityCheckStrategyName) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), mobContourAvailabilityCheckStrategyName);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new dn20(i, mobContourAvailabilityCheckStrategyName);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        dn20.c((dn20) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
