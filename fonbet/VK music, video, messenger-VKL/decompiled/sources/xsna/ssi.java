package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: Decoding.kt */
/* loaded from: classes8.dex */
public interface ssi {
    Decoder A(ebd0 ebd0Var, int i);

    boolean F(SerialDescriptor serialDescriptor, int i);

    de c();

    void e(SerialDescriptor serialDescriptor);

    <T> T i(SerialDescriptor serialDescriptor, int i, a3m<? extends T> a3mVar, T t);

    byte k(ebd0 ebd0Var, int i);

    int m(SerialDescriptor serialDescriptor);

    float n(SerialDescriptor serialDescriptor, int i);

    double o(SerialDescriptor serialDescriptor, int i);

    char q(ebd0 ebd0Var, int i);

    long r(SerialDescriptor serialDescriptor, int i);

    int s(SerialDescriptor serialDescriptor, int i);

    String u(SerialDescriptor serialDescriptor, int i);

    <T> T y(SerialDescriptor serialDescriptor, int i, a3m<? extends T> a3mVar, T t);

    short z(ebd0 ebd0Var, int i);
}
