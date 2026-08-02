package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class d1b0 implements uxs {
    public static final d1b0 a;
    private static final SerialDescriptor descriptor;

    static {
        d1b0 d1b0Var = new d1b0();
        a = d1b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.PersistencePolicyDto", d1b0Var, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("storage_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f1b0.c[0].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f1b0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        PersistenceTypeDto persistenceTypeDto = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                persistenceTypeDto = (PersistenceTypeDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), persistenceTypeDto);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new f1b0(i, persistenceTypeDto, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f1b0 f1b0Var = (f1b0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f1b0.c;
        if (b.F() || f1b0Var.a != PersistenceTypeDto.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), f1b0Var.a);
        }
        if (b.F() || !jl40.l(f1b0Var.b, "")) {
            b.o(serialDescriptor, 1, f1b0Var.b);
        }
        b.c(serialDescriptor);
    }
}
