package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class dtf0 implements uxs {
    public static final dtf0 a;
    private static final SerialDescriptor descriptor;

    static {
        dtf0 dtf0Var = new dtf0();
        a = dtf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.promotions.storage.PromotionsStorageImpl.Data", dtf0Var, 1);
        pluginGeneratedSerialDescriptor.j("promotions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) ftf0.b[0].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ftf0.b;
        b.getClass();
        boolean z = true;
        boolean z2 = false;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                set = (Set) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                z2 = true;
            }
        }
        b.c(serialDescriptor);
        ftf0 ftf0Var = new ftf0();
        if (z2) {
            ftf0Var.a = set;
            return ftf0Var;
        }
        ftf0Var.a = null;
        return ftf0Var;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ftf0 ftf0Var = (ftf0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ftf0.b;
        if (b.F() || ftf0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ftf0Var.a);
        }
        b.c(serialDescriptor);
    }
}
