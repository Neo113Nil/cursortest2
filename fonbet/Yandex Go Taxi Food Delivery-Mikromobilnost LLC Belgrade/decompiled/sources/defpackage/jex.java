package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public abstract class jex implements KSerializer {
    public final KSerializer a;

    public jex(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public abstract b a(b bVar);

    public b b(b bVar) {
        return bVar;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx e = y5e.e(decoder);
        return e.d().a(this.a, a(e.t()));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vcx f = y5e.f(encoder);
        f.p(b(gwk0.J(f.d(), obj, this.a)));
    }
}
