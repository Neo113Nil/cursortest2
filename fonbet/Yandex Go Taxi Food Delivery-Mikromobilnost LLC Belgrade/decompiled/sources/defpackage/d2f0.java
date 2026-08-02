package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public abstract class d2f0 extends jcc {
    public final c2f0 b;

    public d2f0(KSerializer kSerializer) {
        super(kSerializer);
        this.b = new c2f0(kSerializer.getDescriptor());
    }

    @Override // defpackage.a7
    public final Object a() {
        return (b2f0) g(j());
    }

    @Override // defpackage.a7
    public final int b(Object obj) {
        return ((b2f0) obj).d();
    }

    @Override // defpackage.a7
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.a7, defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.a7
    public final Object h(Object obj) {
        return ((b2f0) obj).a();
    }

    @Override // defpackage.jcc
    public final void i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(yjd yjdVar, Object obj, int i);

    @Override // defpackage.jcc, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        c2f0 c2f0Var = this.b;
        yjd r = encoder.r(c2f0Var);
        k(r, obj, d);
        r.c(c2f0Var);
    }
}
