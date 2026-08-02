package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: BufferedSource.kt */
/* loaded from: classes11.dex */
public interface bn8 extends agk0, ReadableByteChannel {
    vl8 C();

    String D1() throws IOException;

    ByteString F0(long j) throws IOException;

    int F3(zt80 zt80Var) throws IOException;

    void G2(long j) throws IOException;

    ByteString H0() throws IOException;

    String Q2(long j) throws IOException;

    long U0() throws IOException;

    byte[] V2() throws IOException;

    boolean W1() throws IOException;

    short Z() throws IOException;

    long d(ByteString byteString) throws IOException;

    InputStream f4();

    long l0() throws IOException;

    int o2() throws IOException;

    boolean o3(long j) throws IOException;

    String p3(Charset charset) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    String s1(long j) throws IOException;

    void skip(long j) throws IOException;

    void z1(vl8 vl8Var, long j) throws IOException;

    long z3(vl8 vl8Var) throws IOException;
}
