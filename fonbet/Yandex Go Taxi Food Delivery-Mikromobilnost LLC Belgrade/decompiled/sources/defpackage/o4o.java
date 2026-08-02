package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class o4o implements KSerializer {
    public final /* synthetic */ int a;
    public final i3y b;
    public final Object c;
    public Object d;

    public o4o(String str, Object obj) {
        this.a = 1;
        this.c = obj;
        this.d = EmptyList.a;
        this.b = a.b(LazyThreadSafetyMode.PUBLICATION, new l2z(str, this, 8));
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int q = decoder.q(getDescriptor());
                if (q >= 0 && q < enumArr.length) {
                    return enumArr[q];
                }
                throw new SerializationException(q + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
            default:
                SerialDescriptor descriptor = getDescriptor();
                sjd b = decoder.b(descriptor);
                b.getClass();
                int v = b.v(getDescriptor());
                if (v == -1) {
                    b.c(descriptor);
                    return obj;
                }
                yci0.m(oyr.i(v, "Unexpected index "));
                return null;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
        }
        return (SerialDescriptor) this.b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                Enum r5 = (Enum) obj;
                Enum[] enumArr = (Enum[]) this.c;
                int H = j73.H(enumArr, r5);
                if (H != -1) {
                    encoder.h(getDescriptor(), H);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String h = getDescriptor().h();
                String arrays = Arrays.toString(enumArr);
                sb.append(" is not a valid enum ");
                sb.append(h);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new SerializationException(sb.toString());
            default:
                encoder.b(getDescriptor()).c(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o4o(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.a = 1;
        this.d = Arrays.asList(annotationArr);
    }

    public o4o(String str, Enum[] enumArr) {
        this.a = 0;
        this.c = enumArr;
        this.b = a.a(new ou(14, this, str));
    }
}
