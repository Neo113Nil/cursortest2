package xsna;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* compiled from: BufferedSink.kt */
/* loaded from: classes11.dex */
public interface an8 extends qwj0, WritableByteChannel {
    vl8 C();

    long L2(agk0 agk0Var) throws IOException;

    an8 P0(ByteString byteString) throws IOException;

    an8 W2(int i) throws IOException;

    an8 a4(int i, int i2, byte[] bArr) throws IOException;

    OutputStream b4();

    @Override // xsna.qwj0, java.io.Flushable
    void flush() throws IOException;

    an8 o1() throws IOException;

    an8 r3(long j) throws IOException;

    an8 t3() throws IOException;

    an8 v0(long j) throws IOException;

    an8 write(byte[] bArr) throws IOException;

    an8 writeByte(int i) throws IOException;

    an8 writeInt(int i) throws IOException;

    an8 writeShort(int i) throws IOException;

    an8 y1(String str) throws IOException;

    an8 y2(long j) throws IOException;
}
