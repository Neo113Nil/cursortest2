package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public abstract class jcc extends a7 {
    public final KSerializer a;

    public jcc(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.a7
    public void f(sjd sjdVar, int i, Object obj) {
        i(i, obj, sjdVar.A(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        yjd r = encoder.r(descriptor);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            r.e(getDescriptor(), i, this.a, c.next());
        }
        r.c(descriptor);
    }
}
