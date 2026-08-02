package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public abstract class i9 implements KSerializer {
    public myi a(sjd sjdVar, String str) {
        kf5 a = sjdVar.a();
        lfx c = c();
        Map map = (Map) ((Map) a.e).get(c);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = ((Map) a.f).get(c);
        tls tlsVar = ym11.f(1, obj) ? (tls) obj : null;
        if (tlsVar != null) {
            return (myi) tlsVar.invoke(str);
        }
        return null;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        return encoder.a().c(c(), obj);
    }

    public abstract lfx c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        sjd b = decoder.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        b.getClass();
        Object obj = null;
        while (true) {
            int v = b.v(getDescriptor());
            if (v == -1) {
                if (obj != null) {
                    b.c(descriptor);
                    return obj;
                }
                vg10.r((String) ref$ObjectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (v != 0) {
                T t = ref$ObjectRef.element;
                if (v != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(v);
                    throw new SerializationException(sb.toString());
                }
                if (t == 0) {
                    ny61.g("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.element = t;
                obj = b.A(getDescriptor(), v, rzo.w(this, b, (String) t), null);
            } else {
                ref$ObjectRef.element = b.k(getDescriptor(), v);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        KSerializer x = rzo.x(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        yjd b = encoder.b(descriptor);
        b.o(getDescriptor(), 0, x.getDescriptor().h());
        b.e(getDescriptor(), 1, x, obj);
        b.c(descriptor);
    }
}
