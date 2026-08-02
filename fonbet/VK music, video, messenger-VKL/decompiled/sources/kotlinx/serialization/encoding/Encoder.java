package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.de;
import xsna.mmi0;

/* compiled from: Encoding.kt */
/* loaded from: classes8.dex */
public interface Encoder {
    void A(byte b);

    <T> void B(mmi0<? super T> mmi0Var, T t);

    void C(float f);

    cti F(SerialDescriptor serialDescriptor);

    void H(double d);

    void J();

    void N();

    de c();

    cti d(SerialDescriptor serialDescriptor);

    void h(SerialDescriptor serialDescriptor, int i);

    Encoder i(SerialDescriptor serialDescriptor);

    void j(short s);

    void k(boolean z);

    void o(int i);

    void r(String str);

    void u(long j);

    void y(char c);
}
