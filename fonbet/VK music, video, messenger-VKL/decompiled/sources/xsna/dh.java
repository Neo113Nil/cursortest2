package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: AbstractPolymorphicSerializer.kt */
/* loaded from: classes8.dex */
public abstract class dh<T> implements KSerializer<T> {
    public a3m<T> a(ssi ssiVar, String str) {
        return ssiVar.c().i0(str, c());
    }

    public mmi0<T> b(Encoder encoder, T t) {
        return encoder.c().j0(c(), t);
    }

    public abstract dcy<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a3m
    public final T deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        ssi d = decoder.d(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = null;
        while (true) {
            int m = d.m(getDescriptor());
            if (m == -1) {
                if (t != null) {
                    d.e(descriptor);
                    return t;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
            }
            if (m == 0) {
                ref$ObjectRef.element = (T) d.u(getDescriptor(), m);
            } else {
                if (m != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) ref$ObjectRef.element;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(m);
                    throw new SerializationException(sb.toString());
                }
                T t2 = ref$ObjectRef.element;
                if (t2 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                ref$ObjectRef.element = t2;
                t = (T) d.y(getDescriptor(), m, rte0.l(this, d, (String) t2), null);
            }
        }
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, T t) {
        mmi0<? super T> m = rte0.m(this, encoder, t);
        SerialDescriptor descriptor = getDescriptor();
        cti d = encoder.d(descriptor);
        d.m(getDescriptor(), 0, m.getDescriptor().f());
        d.n(getDescriptor(), 1, m, t);
        d.e(descriptor);
    }
}
