package xsna;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gmi0;

/* compiled from: ContextualSerializer.kt */
/* loaded from: classes8.dex */
public final class rpj<T> implements KSerializer<T> {
    public final rfc a;
    public final KSerializer<T> b;
    public final List<KSerializer<?>> c;
    public final bnj d;

    public rpj(rfc rfcVar, tub0 tub0Var, KSerializer[] kSerializerArr) {
        this.a = rfcVar;
        this.b = tub0Var;
        this.c = Arrays.asList(kSerializerArr);
        this.d = new bnj(cmi0.b("kotlinx.serialization.ContextualSerializer", gmi0.a.a, new SerialDescriptor[0], new qpj(this, 0)), rfcVar);
    }

    @Override // xsna.a3m
    public final T deserialize(Decoder decoder) {
        de c = decoder.c();
        List<KSerializer<?>> list = this.c;
        rfc rfcVar = this.a;
        KSerializer<T> X = c.X(rfcVar, list);
        if (X != null || (X = this.b) != null) {
            return (T) decoder.h(X);
        }
        fvr.w(rfcVar);
        throw null;
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, T t) {
        de c = encoder.c();
        List<KSerializer<?>> list = this.c;
        rfc rfcVar = this.a;
        KSerializer<T> X = c.X(rfcVar, list);
        if (X == null && (X = this.b) == null) {
            fvr.w(rfcVar);
            throw null;
        }
        encoder.B(X, t);
    }
}
