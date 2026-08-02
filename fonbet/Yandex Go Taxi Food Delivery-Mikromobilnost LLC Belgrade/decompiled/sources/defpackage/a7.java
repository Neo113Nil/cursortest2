package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes9.dex */
public abstract class a7 implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.myi
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object a = a();
        int b = b(a);
        sjd b2 = decoder.b(getDescriptor());
        b2.getClass();
        while (true) {
            int v = b2.v(getDescriptor());
            if (v == -1) {
                b2.c(getDescriptor());
                return h(a);
            }
            f(b2, v + b, a);
        }
    }

    public abstract void f(sjd sjdVar, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
