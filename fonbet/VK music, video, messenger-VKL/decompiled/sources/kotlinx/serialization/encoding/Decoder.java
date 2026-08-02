package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.a3m;
import xsna.de;
import xsna.ssi;

/* compiled from: Decoding.kt */
/* loaded from: classes8.dex */
public interface Decoder {
    int B();

    Decoder C(SerialDescriptor serialDescriptor);

    float D();

    boolean E();

    boolean G();

    de c();

    ssi d(SerialDescriptor serialDescriptor);

    double g();

    <T> T h(a3m<? extends T> a3mVar);

    int j(SerialDescriptor serialDescriptor);

    byte p();

    long t();

    short v();

    char w();

    String x();
}
