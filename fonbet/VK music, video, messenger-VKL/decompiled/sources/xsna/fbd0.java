package xsna;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.dbd0;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public abstract class fbd0<Element, Array, Builder extends dbd0<Array>> extends u4g<Element, Array, Builder> {
    public final ebd0 b;

    public fbd0(KSerializer<Element> kSerializer) {
        super(kSerializer);
        this.b = new ebd0(kSerializer.getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rd
    public final Object a() {
        return (dbd0) g(j());
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((dbd0) obj).d();
    }

    @Override // xsna.rd
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // xsna.rd, xsna.a3m
    public final Array deserialize(Decoder decoder) {
        return (Array) e(decoder);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return ((dbd0) obj).a();
    }

    @Override // xsna.u4g
    public final void i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(cti ctiVar, Array array, int i);

    @Override // xsna.u4g, xsna.mmi0
    public final void serialize(Encoder encoder, Array array) {
        int d = d(array);
        ebd0 ebd0Var = this.b;
        cti F = encoder.F(ebd0Var);
        k(F, array, d);
        F.e(ebd0Var);
    }
}
