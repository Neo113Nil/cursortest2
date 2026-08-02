package defpackage;

import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class msq0 implements KSerializer {
    public static final KSerializer d = qke.n(auu0.a);
    public final KSerializer a;
    public final KSerializer b;
    public final k8u c;

    public msq0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = new k8u(kSerializer, kSerializer2, 1);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        k8u k8uVar = this.c;
        i8u i8uVar = k8uVar.d;
        sjd b = decoder.b(i8uVar);
        MapBuilder mapBuilder = new MapBuilder();
        while (true) {
            int v = b.v(k8uVar.d);
            if (v == -1) {
                MapBuilder j = mapBuilder.j();
                b.c(i8uVar);
                return new nsq0(j);
            }
            Enum j2 = gtq0.j((String) b.A(k8uVar.d, v, d, null), this.a);
            Object A = b.A(k8uVar.d, b.v(k8uVar.d), this.b, null);
            if (j2 != null) {
                mapBuilder.put(j2, A);
            }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.c.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(((nsq0) obj).a, this.c);
    }
}
