package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Encoding.kt */
/* loaded from: classes8.dex */
public interface cti {
    Encoder D(ebd0 ebd0Var, int i);

    void G(ebd0 ebd0Var, int i, short s);

    void M(int i, int i2, SerialDescriptor serialDescriptor);

    void O(ebd0 ebd0Var, int i, char c);

    void Q(SerialDescriptor serialDescriptor, int i, double d);

    void e(SerialDescriptor serialDescriptor);

    void l(SerialDescriptor serialDescriptor, int i, boolean z);

    void m(SerialDescriptor serialDescriptor, int i, String str);

    <T> void n(SerialDescriptor serialDescriptor, int i, mmi0<? super T> mmi0Var, T t);

    void p(ebd0 ebd0Var, int i, byte b);

    void q(SerialDescriptor serialDescriptor, int i, long j);

    <T> void s(SerialDescriptor serialDescriptor, int i, mmi0<? super T> mmi0Var, T t);

    void w(SerialDescriptor serialDescriptor, int i, float f);

    boolean z();
}
