package xsna;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Enums.kt */
/* loaded from: classes8.dex */
public final class bsp<T extends Enum<T>> implements KSerializer<T> {
    public final T[] a;
    public yrp b;
    public final bpn0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public bsp(Enum[] enumArr, String str) {
        this.a = enumArr;
        this.c = new bpn0(new defpackage.u(15, this, str));
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        int j = decoder.j(getDescriptor());
        T[] tArr = this.a;
        if (j >= 0 && j < tArr.length) {
            return tArr[j];
        }
        throw new SerializationException(j + " is not among valid " + getDescriptor().f() + " enum values, values size is " + tArr.length);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        T[] tArr = this.a;
        int U = rl3.U(r5, tArr);
        if (U != -1) {
            encoder.h(getDescriptor(), U);
            return;
        }
        throw new SerializationException(r5 + " is not a valid enum " + getDescriptor().f() + ", must be one of " + Arrays.toString(tArr));
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().f() + '>';
    }
}
