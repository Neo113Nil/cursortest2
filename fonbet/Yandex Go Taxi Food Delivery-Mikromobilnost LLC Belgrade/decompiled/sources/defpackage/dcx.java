package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public abstract class dcx implements KSerializer {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public dcx(g0c g0cVar) {
        this.b = g0cVar;
        this.c = d6z.i("JsonContentPolymorphicSerializer<" + g0cVar.d() + '>', r5e0.g, new SerialDescriptor[0]);
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract myi c(b bVar);

    public abstract Object d(Object obj, Object obj2);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        switch (this.a) {
            case 0:
                ncx e = y5e.e(decoder);
                b t = e.t();
                return e.d().a((KSerializer) c(t), t);
            default:
                SerialDescriptor descriptor = getDescriptor();
                sjd b = decoder.b(descriptor);
                b.getClass();
                Object obj = j6a1.a;
                Object obj2 = obj;
                Object obj3 = obj2;
                while (true) {
                    int v = b.v(getDescriptor());
                    if (v == -1) {
                        if (obj2 == obj) {
                            yci0.m("Element 'key' is missing");
                            return null;
                        }
                        if (obj3 == obj) {
                            yci0.m("Element 'value' is missing");
                            return null;
                        }
                        Object d = d(obj2, obj3);
                        b.c(descriptor);
                        return d;
                    }
                    if (v == 0) {
                        obj2 = b.A(getDescriptor(), 0, (KSerializer) this.b, null);
                    } else {
                        if (v != 1) {
                            yci0.m(oyr.i(v, "Invalid index: "));
                            return null;
                        }
                        obj3 = b.A(getDescriptor(), 1, (KSerializer) this.c, null);
                    }
                }
        }
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return (asq0) this.c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj2;
                KSerializer c = encoder.a().c(g0cVar, obj);
                if (c == null) {
                    KSerializer K = gtq0.K(qoi0.a(obj.getClass()));
                    if (K == null) {
                        g0c a = qoi0.a(obj.getClass());
                        String d = a.d();
                        if (d == null) {
                            d = String.valueOf(a);
                        }
                        yci0.m(unr0.p("Class '", d, "' is not registered for polymorphic serialization ", "in the scope of '" + g0cVar.d() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                        break;
                    } else {
                        c = K;
                    }
                }
                c.serialize(encoder, obj);
                break;
            default:
                yjd b = encoder.b(getDescriptor());
                b.e(getDescriptor(), 0, (KSerializer) obj2, a(obj));
                b.e(getDescriptor(), 1, (KSerializer) this.c, b(obj));
                b.c(getDescriptor());
                break;
        }
    }

    public dcx(KSerializer kSerializer, KSerializer kSerializer2) {
        this.b = kSerializer;
        this.c = kSerializer2;
    }
}
