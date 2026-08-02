package defpackage;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* loaded from: classes9.dex */
public interface oq6 extends uis0, WritableByteChannel {
    oq6 H(long j);

    oq6 N0(ByteString byteString);

    long N1(y9t0 y9t0Var);

    oq6 a2(int i, int i2, String str);

    oq6 d0(long j);

    @Override // defpackage.uis0, java.io.Flushable
    void flush();

    yp6 h();

    oq6 n2(int i, int i2, byte[] bArr);

    oq6 p1(String str);

    oq6 t0(int i);

    oq6 write(byte[] bArr);

    oq6 writeByte(int i);

    oq6 writeInt(int i);

    oq6 writeShort(int i);
}
