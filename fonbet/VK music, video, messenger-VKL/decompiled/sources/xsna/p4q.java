package xsna;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.Z3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.ImageSizeKey;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.r4q;

/* compiled from: ExifInterface.java */
/* loaded from: classes12.dex */
public final class p4q {
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final HashMap<Integer, e>[] X;
    public static final HashMap<String, e>[] Y;
    public static final HashSet<String> Z;
    public static final HashMap<Integer, Integer> a0;
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final Pattern e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap<String, d>[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> u = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> v = Arrays.asList(2, 7, 4, 5);
    public static final int[] w = {8, 8, 8};
    public static final int[] x = {8};
    public static final byte[] y = {-1, -40, -1};
    public static final byte[] z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, AmfConstants.TYPE_UNSUPPORTED_MARKER, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    public static class b extends InputStream implements DataInput {
        public static final ByteOrder f = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder g = ByteOrder.BIG_ENDIAN;
        public final DataInputStream b;
        public ByteOrder c;
        public int d;
        public byte[] e;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.b.available();
        }

        public final void b(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.b;
                int skip = (int) dataInputStream.skip(i3);
                if (skip <= 0) {
                    if (this.e == null) {
                        this.e = new byte[8192];
                    }
                    skip = dataInputStream.read(this.e, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException(tgw.b(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += skip;
            }
            this.d += i2;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.d++;
            return this.b.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.d++;
            return this.b.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.d++;
            int read = this.b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.d += 2;
            return this.b.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.d += i2;
            this.b.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.d += 4;
            DataInputStream dataInputStream = this.b;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == g) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j;
            long j2;
            this.d += 8;
            DataInputStream dataInputStream = this.b;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j2 = read;
            } else {
                if (byteOrder != g) {
                    throw new IOException("Invalid byte order: " + this.c);
                }
                j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j2 = read8;
            }
            return j + j2;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.d += 2;
            DataInputStream dataInputStream = this.b;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == g) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.d += 2;
            return this.b.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.d++;
            return this.b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.d += 2;
            DataInputStream dataInputStream = this.b;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == f) {
                return (read2 << 8) + read;
            }
            if (byteOrder == g) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.b = dataInputStream;
            dataInputStream.mark(0);
            this.d = 0;
            this.c = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.b.read(bArr, i, i2);
            this.d += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.d += bArr.length;
            this.b.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    public static class c extends FilterOutputStream {
        public final OutputStream b;
        public ByteOrder c;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.b = outputStream;
            this.c = byteOrder;
        }

        public final void b(int i) throws IOException {
            this.b.write(i);
        }

        public final void c(int i) throws IOException {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.b;
            if (byteOrder == byteOrder2) {
                outputStream.write(i & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i >>> 24) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write(i & 255);
            }
        }

        public final void h(short s) throws IOException {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.b;
            if (byteOrder == byteOrder2) {
                outputStream.write(s & 255);
                outputStream.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s >>> 8) & 255);
                outputStream.write(s & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.b.write(bArr, i, i2);
        }
    }

    /* compiled from: ExifInterface.java */
    public static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(int i, int i2, byte[] bArr) {
            this(-1L, bArr, i, i2);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(p4q.b0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[p4q.S[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[p4q.S[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d e(int i, ByteOrder byteOrder) {
            return f(new int[]{i}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[p4q.S[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (j instanceof String) {
                return Double.parseDouble((String) j);
            }
            if (j instanceof long[]) {
                if (((long[]) j).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j instanceof int[]) {
                if (((int[]) j).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) j;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.a / fVar.b;
        }

        public final int h(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (j instanceof String) {
                return Integer.parseInt((String) j);
            }
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) j;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                return null;
            }
            if (j instanceof String) {
                return (String) j;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (!(j instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) j;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].a);
                sb.append('/');
                sb.append(fVarArr[i].b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v20, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v21, types: [long[]] */
        /* JADX WARN: Type inference failed for: r14v22, types: [xsna.p4q$f[]] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v24, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v25, types: [xsna.p4q$f[]] */
        /* JADX WARN: Type inference failed for: r14v26, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v27, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v28, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.String] */
        public final Serializable j(ByteOrder byteOrder) {
            b bVar;
            ?? str;
            byte b;
            byte[] bArr = this.d;
            b bVar2 = null;
            try {
                bVar = new b(bArr);
                try {
                    bVar.c = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, p4q.b0);
                            break;
                        case 2:
                        case 7:
                            if (i3 >= p4q.T.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = p4q.T;
                                    if (i4 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i4] == bArr2[i4]) {
                                        i4++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i3) {
                                byte b2 = bArr[i2];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i2++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readUnsignedShort();
                                i2++;
                            }
                        case 4:
                            str = new long[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readInt() & 4294967295L;
                                i2++;
                            }
                        case 5:
                            str = new f[i3];
                            while (i2 < i3) {
                                str[i2] = new f(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                i2++;
                            }
                        case 8:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readShort();
                                i2++;
                            }
                        case 9:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readInt();
                                i2++;
                            }
                        case 10:
                            str = new f[i3];
                            while (i2 < i3) {
                                str[i2] = new f(bVar.readInt(), bVar.readInt());
                                i2++;
                            }
                        case 11:
                            str = new double[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readFloat();
                                i2++;
                            }
                        case 12:
                            str = new double[i3];
                            while (i2 < i3) {
                                str[i2] = bVar.readDouble();
                                i2++;
                            }
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return null;
                            }
                    }
                    try {
                        bVar.close();
                        return str;
                    } catch (IOException e3) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        return str;
                    }
                } catch (IOException unused) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e4) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(p4q.R[this.a]);
            sb.append(", data length:");
            return h5s.c(this.d.length, ")", sb);
        }

        public d(long j, byte[] bArr, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    public static class f {
        public final long a;
        public final long b;

        public f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public final String toString() {
            return this.a + DomExceptionUtils.SEPARATOR + this.b;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", atv0.b, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new e("DateTime", 306, 2), new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", atv0.b, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new e("DateTime", 306, 2), new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        U = new e("StripOffsets", 273, 3);
        V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        a0 = new HashMap<>();
        Charset forName = Charset.forName(C.ASCII_NAME);
        b0 = forName;
        c0 = "Exif\u0000\u0000".getBytes(forName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr6 = V;
            if (i >= eVarArr6.length) {
                HashMap<Integer, Integer> hashMap = a0;
                e[] eVarArr7 = W;
                hashMap.put(Integer.valueOf(eVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(eVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(eVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(eVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(eVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(eVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i] = new HashMap<>();
            Y[i] = new HashMap<>();
            for (e eVar : eVarArr6[i]) {
                X[i].put(Integer.valueOf(eVar.a), eVar);
                Y[i].put(eVar.b, eVar);
            }
            i++;
        }
    }

    public p4q(@NonNull String str) throws IOException {
        FileInputStream fileInputStream;
        boolean z2;
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                r4q.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            s(fileInputStream);
            r4q.c(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            r4q.c(fileInputStream2);
            throw th;
        }
    }

    public static void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = b0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.c(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            r4q.f(bVar, cVar, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair<Integer, Integer> p(String str) {
        if (str.contains(StringUtils.COMMA)) {
            String[] split = str.split(StringUtils.COMMA, -1);
            Pair<Integer, Integer> p = p(split[0]);
            if (((Integer) p.first).intValue() == 2) {
                return p;
            }
            for (int i = 1; i < split.length; i++) {
                Pair<Integer, Integer> p2 = p(split[i]);
                int intValue = (((Integer) p2.first).equals(p.first) || ((Integer) p2.second).equals(p.first)) ? ((Integer) p.first).intValue() : -1;
                int intValue2 = (((Integer) p.second).intValue() == -1 || !(((Integer) p2.first).equals(p.second) || ((Integer) p2.second).equals(p.second))) ? -1 : ((Integer) p.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    p = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    p = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return p;
        }
        if (!str.contains(DomExceptionUtils.SEPARATOR)) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] split2 = str.split(DomExceptionUtils.SEPARATOR, -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder v(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(et.a(readShort, new StringBuilder("Invalid byte order: ")));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9 A[Catch: all -> 0x0109, Exception -> 0x010c, TryCatch #18 {Exception -> 0x010c, all -> 0x0109, blocks: (B:67:0x00f5, B:69:0x00f9, B:71:0x0117, B:75:0x010f), top: B:66:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f A[Catch: all -> 0x0109, Exception -> 0x010c, TryCatch #18 {Exception -> 0x010c, all -> 0x0109, blocks: (B:67:0x00f5, B:69:0x00f9, B:71:0x0117, B:75:0x010f), top: B:66:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() throws IOException {
        FileOutputStream fileOutputStream;
        InputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        InputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream3;
        Object obj;
        BufferedInputStream bufferedInputStream;
        int i = this.d;
        if (i != 4 && i != 13 && i != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.b == null && this.a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.h && this.i && !this.j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i2 = this.n;
        InputStream inputStream = null;
        this.m = (i2 == 6 || i2 == 7) ? n() : null;
        try {
            File createTempFile = File.createTempFile(Z3.D, "tmp");
            if (this.a != null) {
                fileInputStream = new FileInputStream(this.a);
            } else {
                r4q.a.c(this.b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.b);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    r4q.e(fileInputStream, fileOutputStream);
                    r4q.c(fileInputStream);
                    r4q.c(fileOutputStream);
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        try {
                            fileInputStream3 = new FileInputStream(createTempFile);
                            try {
                                if (this.a != null) {
                                    fileOutputStream2 = new FileOutputStream(this.a);
                                } else {
                                    r4q.a.c(this.b, 0L, OsConstants.SEEK_SET);
                                    fileOutputStream2 = new FileOutputStream(this.b);
                                }
                                try {
                                    bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                } catch (Exception e2) {
                                    e = e2;
                                    obj = null;
                                    inputStream = fileInputStream3;
                                    try {
                                        try {
                                            fileInputStream2 = new FileInputStream(createTempFile);
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        if (this.a != null) {
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        r4q.e(fileInputStream2, fileOutputStream2);
                                        r4q.c(fileInputStream2);
                                        r4q.c(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    } catch (Exception e4) {
                                        e = e4;
                                        inputStream = fileInputStream2;
                                        throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = fileInputStream2;
                                        r4q.c(inputStream);
                                        r4q.c(fileOutputStream2);
                                        throw th;
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                fileOutputStream2 = null;
                                obj = null;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = null;
                        r4q.c(inputStream);
                        r4q.c(closeable);
                        if (0 == 0) {
                            createTempFile.delete();
                        }
                        throw th;
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                        try {
                            int i3 = this.d;
                            if (i3 == 4) {
                                B(bufferedInputStream, bufferedOutputStream);
                            } else if (i3 == 13) {
                                C(bufferedInputStream, bufferedOutputStream);
                            } else if (i3 == 14) {
                                D(bufferedInputStream, bufferedOutputStream);
                            }
                            r4q.c(bufferedInputStream);
                            r4q.c(bufferedOutputStream);
                            createTempFile.delete();
                            this.m = null;
                        } catch (Exception e7) {
                            e = e7;
                            inputStream = fileInputStream3;
                            fileInputStream2 = new FileInputStream(createTempFile);
                            if (this.a != null) {
                                r4q.a.c(this.b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream3 = new FileOutputStream(this.b);
                            } else {
                                fileOutputStream3 = new FileOutputStream(this.a);
                            }
                            fileOutputStream2 = fileOutputStream3;
                            r4q.e(fileInputStream2, fileOutputStream2);
                            r4q.c(fileInputStream2);
                            r4q.c(fileOutputStream2);
                            throw new IOException("Failed to save new file", e);
                        }
                    } catch (Exception e8) {
                        e = e8;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = null;
                        inputStream = bufferedInputStream;
                        r4q.c(inputStream);
                        r4q.c(closeable);
                        if (0 == 0) {
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th6) {
                        th = th6;
                        r4q.c(inputStream);
                        r4q.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = fileInputStream;
                    r4q.c(inputStream);
                    r4q.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
        }
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        String c2 = c("Xmp");
        HashMap<String, d>[] hashMapArr = this.e;
        d remove = (c2 == null || !this.s) ? null : hashMapArr[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        J(cVar);
        if (remove != null) {
            hashMapArr[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                r4q.e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.h((short) readUnsignedShort);
                int i = readUnsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i2 = readUnsignedShort2 - 2;
                if (i2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i2 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, c0)) {
                        bVar.b(readUnsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.h((short) readUnsignedShort2);
                if (i2 >= 6) {
                    i2 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i2 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        r4q.f(bVar, cVar, E.length);
        if (this.o == 0) {
            int readInt = bVar.readInt();
            cVar.c(readInt);
            r4q.f(bVar, cVar, readInt + 8);
        } else {
            r4q.f(bVar, cVar, (r2 - r7.length) - 8);
            bVar.b(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                J(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                r4q.c(byteArrayOutputStream2);
                r4q.e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                r4q.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        ?? r3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteArrayOutputStream byteArrayOutputStream;
        c cVar;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = I;
        r4q.f(bVar, cVar2, bArr.length);
        byte[] bArr2 = J;
        bVar.b(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream3, byteOrder);
                    r3 = this.o;
                    try {
                        try {
                            if (r3 != 0) {
                                r4q.f(bVar, cVar3, (r3 - ((bArr.length + 4) + bArr2.length)) - 8);
                                bVar.b(4);
                                int readInt = bVar.readInt();
                                if (readInt % 2 != 0) {
                                    readInt++;
                                }
                                bVar.b(readInt);
                                J(cVar3);
                            } else {
                                byte[] bArr3 = new byte[4];
                                if (bVar.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = M;
                                boolean equals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = O;
                                byte[] bArr6 = N;
                                if (equals) {
                                    int readInt2 = bVar.readInt();
                                    byte[] bArr7 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                                    bVar.read(bArr7);
                                    byte b2 = (byte) (bArr7[0] | 8);
                                    bArr7[0] = b2;
                                    boolean z2 = ((b2 >> 1) & 1) == 1;
                                    cVar3.write(bArr4);
                                    cVar3.c(readInt2);
                                    cVar3.write(bArr7);
                                    if (z2) {
                                        b(bVar, cVar3, P, null);
                                        while (true) {
                                            byte[] bArr8 = new byte[4];
                                            bufferedInputStream.read(bArr8);
                                            if (!Arrays.equals(bArr8, Q)) {
                                                break;
                                            }
                                            int readInt3 = bVar.readInt();
                                            cVar3.write(bArr8);
                                            cVar3.c(readInt3);
                                            if (readInt3 % 2 == 1) {
                                                readInt3++;
                                            }
                                            r4q.f(bVar, cVar3, readInt3);
                                        }
                                        J(cVar3);
                                    } else {
                                        b(bVar, cVar3, bArr5, bArr6);
                                        J(cVar3);
                                    }
                                } else if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                    int readInt4 = bVar.readInt();
                                    int i6 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                                    byte[] bArr9 = new byte[3];
                                    boolean equals2 = Arrays.equals(bArr3, bArr5);
                                    boolean z3 = true;
                                    byte[] bArr10 = L;
                                    if (equals2) {
                                        bVar.read(bArr9);
                                        byte[] bArr11 = new byte[3];
                                        int i7 = i6;
                                        if (bVar.read(bArr11) != 3 || !Arrays.equals(bArr10, bArr11)) {
                                            throw new IOException("Encountered error while checking VP8 signature");
                                        }
                                        i2 = bVar.readInt();
                                        i3 = (i2 << 18) >> 18;
                                        i = i7 - 10;
                                        i4 = (i2 << 2) >> 18;
                                        z3 = false;
                                    } else {
                                        int i8 = i6;
                                        if (!Arrays.equals(bArr3, bArr6)) {
                                            i = i8;
                                            i2 = 0;
                                            i3 = 0;
                                            i4 = 0;
                                            z3 = false;
                                        } else {
                                            if (bVar.readByte() != 47) {
                                                throw new IOException("Encountered error while checking VP8L signature");
                                            }
                                            i2 = bVar.readInt();
                                            int i9 = (i2 & 16383) + 1;
                                            int i10 = ((268419072 & i2) >>> 14) + 1;
                                            if ((i2 & 268435456) == 0) {
                                                z3 = false;
                                            }
                                            i3 = i9;
                                            i = i8 - 5;
                                            i4 = i10;
                                        }
                                    }
                                    cVar3.write(bArr4);
                                    cVar3.c(10);
                                    byte[] bArr12 = new byte[10];
                                    if (z3) {
                                        i5 = i3;
                                        bArr12[0] = (byte) (bArr12[0] | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
                                    } else {
                                        i5 = i3;
                                    }
                                    bArr12[0] = (byte) (bArr12[0] | 8);
                                    int i11 = i5 - 1;
                                    byteArrayOutputStream = byteArrayOutputStream3;
                                    int i12 = i4 - 1;
                                    cVar = cVar2;
                                    try {
                                        bArr12[4] = (byte) i11;
                                        bArr12[5] = (byte) (i11 >> 8);
                                        bArr12[6] = (byte) (i11 >> 16);
                                        bArr12[7] = (byte) i12;
                                        bArr12[8] = (byte) (i12 >> 8);
                                        bArr12[9] = (byte) (i12 >> 16);
                                        cVar3.write(bArr12);
                                        cVar3.write(bArr3);
                                        cVar3.c(readInt4);
                                        try {
                                            if (!Arrays.equals(bArr3, bArr5)) {
                                                if (Arrays.equals(bArr3, bArr6)) {
                                                    cVar3.write(47);
                                                    cVar3.c(i2);
                                                }
                                                r4q.f(bVar, cVar3, i);
                                                J(cVar3);
                                                r4q.e(bVar, cVar3);
                                                c cVar4 = cVar;
                                                cVar4.c(byteArrayOutputStream.size() + bArr2.length);
                                                cVar4.write(bArr2);
                                                ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                                                byteArrayOutputStream4.writeTo(cVar4);
                                                r4q.c(byteArrayOutputStream4);
                                            }
                                            cVar3.write(bArr9);
                                            cVar3.write(bArr10);
                                            cVar3.c(i2);
                                            r4q.f(bVar, cVar3, i);
                                            J(cVar3);
                                            r4q.e(bVar, cVar3);
                                            c cVar42 = cVar;
                                            cVar42.c(byteArrayOutputStream.size() + bArr2.length);
                                            cVar42.write(bArr2);
                                            ByteArrayOutputStream byteArrayOutputStream42 = byteArrayOutputStream;
                                            byteArrayOutputStream42.writeTo(cVar42);
                                            r4q.c(byteArrayOutputStream42);
                                        } catch (Exception e2) {
                                            e = e2;
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            r4q.c(byteArrayOutputStream2);
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        r3 = byteArrayOutputStream;
                                        byteArrayOutputStream2 = r3;
                                        throw new IOException("Failed to save WebP file", e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r3 = byteArrayOutputStream;
                                        byteArrayOutputStream2 = r3;
                                        r4q.c(byteArrayOutputStream2);
                                        throw th;
                                    }
                                }
                            }
                            cVar = cVar2;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            r4q.e(bVar, cVar3);
                            c cVar422 = cVar;
                            cVar422.c(byteArrayOutputStream.size() + bArr2.length);
                            cVar422.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream422 = byteArrayOutputStream;
                            byteArrayOutputStream422.writeTo(cVar422);
                            r4q.c(byteArrayOutputStream422);
                        } catch (Exception e4) {
                            e = e4;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        byteArrayOutputStream2 = byteArrayOutputStream3;
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream2 = byteArrayOutputStream3;
                    }
                } catch (Exception e6) {
                    e = e6;
                    r3 = byteArrayOutputStream3;
                } catch (Throwable th5) {
                    th = th5;
                    r3 = byteArrayOutputStream3;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(@NonNull String str, @Nullable String str2) {
        e eVar;
        int i;
        d dVar;
        int i2;
        String str3 = str;
        String str4 = str2;
        if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
            boolean find = f0.matcher(str4).find();
            boolean find2 = g0.matcher(str4).find();
            if (str4.length() != 19) {
                return;
            }
            if (!find && !find2) {
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i3 = 2;
        if (str4 != null && Z.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = e0.matcher(str4);
                if (!matcher.find()) {
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + DomExceptionUtils.SEPARATOR + 10000L;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < V.length) {
            if ((i5 != 4 || this.h) && (eVar = Y[i5].get(str3)) != null) {
                int i6 = eVar.d;
                int i7 = eVar.c;
                HashMap<String, d>[] hashMapArr = this.e;
                if (str4 == null) {
                    hashMapArr[i5].remove(str3);
                } else {
                    Pair<Integer, Integer> p = p(str4);
                    int i8 = -1;
                    if (i7 != ((Integer) p.first).intValue() && i7 != ((Integer) p.second).intValue()) {
                        if (i6 == -1 || (i6 != ((Integer) p.first).intValue() && i6 != ((Integer) p.second).intValue())) {
                            if (i7 != 1 && i7 != 7 && i7 != i3) {
                                if (t) {
                                    String[] strArr = R;
                                    String str5 = strArr[i7];
                                    if (i6 != -1) {
                                        String str6 = strArr[i6];
                                    }
                                    String str7 = strArr[((Integer) p.first).intValue()];
                                    if (((Integer) p.second).intValue() != -1) {
                                        String str8 = strArr[((Integer) p.second).intValue()];
                                    }
                                }
                            }
                        }
                        int[] iArr = S;
                        switch (i6) {
                            case 1:
                                int i9 = i4;
                                i = i5;
                                HashMap<String, d> hashMap = hashMapArr[i];
                                if (str4.length() == 1) {
                                    i4 = i9;
                                    if (str4.charAt(i4) >= '0' && str4.charAt(i4) <= '1') {
                                        byte[] bArr = new byte[1];
                                        bArr[i4] = (byte) (str4.charAt(i4) - ImageSizeKey.SIZE_KEY_UNDEFINED);
                                        dVar = new d(1, 1, bArr);
                                        hashMap.put(str3, dVar);
                                        break;
                                    }
                                } else {
                                    i4 = i9;
                                }
                                byte[] bytes = str4.getBytes(b0);
                                dVar = new d(1, bytes.length, bytes);
                                hashMap.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i2 = i4;
                                i = i5;
                                hashMapArr[i].put(str3, d.a(str4));
                                i4 = i2;
                                break;
                            case 3:
                                i2 = i4;
                                i = i5;
                                String[] split = str4.split(StringUtils.COMMA, -1);
                                int[] iArr2 = new int[split.length];
                                for (int i10 = i2; i10 < split.length; i10++) {
                                    iArr2[i10] = Integer.parseInt(split[i10]);
                                }
                                hashMapArr[i].put(str3, d.f(iArr2, this.g));
                                i4 = i2;
                                break;
                            case 4:
                                i2 = i4;
                                i = i5;
                                String[] split2 = str4.split(StringUtils.COMMA, -1);
                                long[] jArr = new long[split2.length];
                                for (int i11 = i2; i11 < split2.length; i11++) {
                                    jArr[i11] = Long.parseLong(split2[i11]);
                                }
                                hashMapArr[i].put(str3, d.c(jArr, this.g));
                                i4 = i2;
                                break;
                            case 5:
                                i2 = i4;
                                i = i5;
                                int i12 = -1;
                                String[] split3 = str4.split(StringUtils.COMMA, -1);
                                f[] fVarArr = new f[split3.length];
                                int i13 = i2;
                                while (i13 < split3.length) {
                                    String[] split4 = split3[i13].split(DomExceptionUtils.SEPARATOR, i12);
                                    fVarArr[i13] = new f((long) Double.parseDouble(split4[i2]), (long) Double.parseDouble(split4[1]));
                                    i13++;
                                    i12 = -1;
                                }
                                hashMapArr[i].put(str3, d.d(fVarArr, this.g));
                                i4 = i2;
                                break;
                            case 9:
                                i2 = i4;
                                i = i5;
                                String[] split5 = str4.split(StringUtils.COMMA, -1);
                                int length = split5.length;
                                int[] iArr3 = new int[length];
                                for (int i14 = i2; i14 < split5.length; i14++) {
                                    iArr3[i14] = Integer.parseInt(split5[i14]);
                                }
                                HashMap<String, d> hashMap2 = hashMapArr[i];
                                ByteOrder byteOrder = this.g;
                                ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                wrap.order(byteOrder);
                                for (int i15 = i2; i15 < length; i15++) {
                                    wrap.putInt(iArr3[i15]);
                                }
                                hashMap2.put(str3, new d(9, length, wrap.array()));
                                i4 = i2;
                                break;
                            case 10:
                                String[] split6 = str4.split(StringUtils.COMMA, -1);
                                int length2 = split6.length;
                                f[] fVarArr2 = new f[length2];
                                int i16 = i4;
                                while (i16 < split6.length) {
                                    String[] split7 = split6[i16].split(DomExceptionUtils.SEPARATOR, i8);
                                    int i17 = i16;
                                    fVarArr2[i17] = new f((long) Double.parseDouble(split7[i4]), (long) Double.parseDouble(split7[1]));
                                    i16 = i17 + 1;
                                    i4 = i4;
                                    i5 = i5;
                                    i8 = -1;
                                }
                                i2 = i4;
                                i = i5;
                                HashMap<String, d> hashMap3 = hashMapArr[i];
                                ByteOrder byteOrder2 = this.g;
                                ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                wrap2.order(byteOrder2);
                                for (int i18 = i2; i18 < length2; i18++) {
                                    f fVar = fVarArr2[i18];
                                    wrap2.putInt((int) fVar.a);
                                    wrap2.putInt((int) fVar.b);
                                }
                                hashMap3.put(str3, new d(10, length2, wrap2.array()));
                                i4 = i2;
                                break;
                            case 12:
                                String[] split8 = str4.split(StringUtils.COMMA, -1);
                                int length3 = split8.length;
                                double[] dArr = new double[length3];
                                for (int i19 = i4; i19 < split8.length; i19++) {
                                    dArr[i19] = Double.parseDouble(split8[i19]);
                                }
                                HashMap<String, d> hashMap4 = hashMapArr[i5];
                                ByteOrder byteOrder3 = this.g;
                                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                wrap3.order(byteOrder3);
                                for (int i20 = i4; i20 < length3; i20++) {
                                    wrap3.putDouble(dArr[i20]);
                                }
                                hashMap4.put(str3, new d(12, length3, wrap3.array()));
                                break;
                        }
                        i5 = i + 1;
                        i3 = 2;
                    }
                    i6 = i7;
                    int[] iArr4 = S;
                    switch (i6) {
                    }
                    i5 = i + 1;
                    i3 = 2;
                }
            }
            i = i5;
            i5 = i + 1;
            i3 = 2;
        }
    }

    public final void F(b bVar) throws IOException {
        d dVar;
        HashMap<String, d> hashMap = this.e[4];
        d dVar2 = hashMap.get("Compression");
        if (dVar2 == null) {
            this.n = 6;
            q(bVar, hashMap);
            return;
        }
        int h = dVar2.h(this.g);
        this.n = h;
        if (h != 1) {
            if (h == 6) {
                q(bVar, hashMap);
                return;
            } else if (h != 7) {
                return;
            }
        }
        d dVar3 = hashMap.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.g);
            int[] iArr2 = w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (dVar = hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int h2 = dVar.h(this.g);
                if ((h2 != 1 || !Arrays.equals(iArr, x)) && (h2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            d dVar4 = hashMap.get("StripOffsets");
            d dVar5 = hashMap.get("StripByteCounts");
            if (dVar4 == null || dVar5 == null) {
                return;
            }
            long[] d2 = r4q.d(dVar4.j(this.g));
            long[] d3 = r4q.d(dVar5.j(this.g));
            if (d2 == null || d2.length == 0 || d3 == null || d3.length == 0 || d2.length != d3.length) {
                return;
            }
            long j = 0;
            for (long j2 : d3) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.j = true;
            this.i = true;
            this.h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < d2.length; i4++) {
                int i5 = (int) d2[i4];
                int i6 = (int) d3[i4];
                if (i4 < d2.length - 1 && i5 + i6 != d2[i4 + 1]) {
                    this.j = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (bVar.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (bVar.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.m = bArr;
            if (this.j) {
                this.k = (int) d2[0];
                this.l = i;
            }
        }
    }

    public final void G(int i, int i2) throws IOException {
        HashMap<String, d>[] hashMapArr = this.e;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        d dVar = hashMapArr[i].get("ImageLength");
        d dVar2 = hashMapArr[i].get("ImageWidth");
        d dVar3 = hashMapArr[i2].get("ImageLength");
        d dVar4 = hashMapArr[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null || dVar3 == null || dVar4 == null) {
            return;
        }
        int h = dVar.h(this.g);
        int h2 = dVar2.h(this.g);
        int h3 = dVar3.h(this.g);
        int h4 = dVar4.h(this.g);
        if (h >= h3 || h2 >= h4) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void H(g gVar, int i) throws IOException {
        d e2;
        d e3;
        HashMap<String, d>[] hashMapArr = this.e;
        d dVar = hashMapArr[i].get("DefaultCropSize");
        d dVar2 = hashMapArr[i].get("SensorTopBorder");
        d dVar3 = hashMapArr[i].get("SensorLeftBorder");
        d dVar4 = hashMapArr[i].get("SensorBottomBorder");
        d dVar5 = hashMapArr[i].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                }
                e2 = d.d(new f[]{fVarArr[0]}, this.g);
                e3 = d.d(new f[]{fVarArr[1]}, this.g);
            } else {
                int[] iArr = (int[]) dVar.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    e2 = d.e(iArr[0], this.g);
                    e3 = d.e(iArr[1], this.g);
                }
            }
            hashMapArr[i].put("ImageWidth", e2);
            hashMapArr[i].put("ImageLength", e3);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int h = dVar2.h(this.g);
            int h2 = dVar4.h(this.g);
            int h3 = dVar5.h(this.g);
            int h4 = dVar3.h(this.g);
            if (h2 <= h || h3 <= h4) {
                return;
            }
            d e4 = d.e(h2 - h, this.g);
            d e5 = d.e(h3 - h4, this.g);
            hashMapArr[i].put("ImageLength", e4);
            hashMapArr[i].put("ImageWidth", e5);
            return;
        }
        d dVar6 = hashMapArr[i].get("ImageLength");
        d dVar7 = hashMapArr[i].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = hashMapArr[i].get("JPEGInterchangeFormat");
            d dVar9 = hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int h5 = dVar8.h(this.g);
            int h6 = dVar8.h(this.g);
            gVar.h(h5);
            byte[] bArr = new byte[h6];
            gVar.read(bArr);
            g(new b(bArr), h5, i);
        }
    }

    public final void I() throws IOException {
        G(0, 5);
        G(0, 4);
        G(5, 4);
        HashMap<String, d>[] hashMapArr = this.e;
        d dVar = hashMapArr[1].get("PixelXDimension");
        d dVar2 = hashMapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            hashMapArr[0].put("ImageWidth", dVar);
            hashMapArr[0].put("ImageLength", dVar2);
        }
        if (hashMapArr[4].isEmpty() && r(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        r(hashMapArr[4]);
        z(0, "ThumbnailOrientation", "Orientation");
        z(0, "ThumbnailImageLength", "ImageLength");
        z(0, "ThumbnailImageWidth", "ImageWidth");
        z(5, "ThumbnailOrientation", "Orientation");
        z(5, "ThumbnailImageLength", "ImageLength");
        z(5, "ThumbnailImageWidth", "ImageWidth");
        z(4, "Orientation", "ThumbnailOrientation");
        z(4, "ImageLength", "ThumbnailImageLength");
        z(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d A[EDGE_INSN: B:55:0x014d->B:56:0x014d BREAK  A[LOOP:3: B:42:0x0111->B:54:0x0143], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(c cVar) throws IOException {
        HashMap<String, d>[] hashMapArr;
        char c2;
        char c3;
        int i;
        int[] iArr;
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        e[][] eVarArr = V;
        int[] iArr4 = new int[eVarArr.length];
        int[] iArr5 = new int[eVarArr.length];
        e[] eVarArr2 = W;
        for (e eVar : eVarArr2) {
            y(eVar.b);
        }
        if (this.h) {
            if (this.i) {
                y("StripOffsets");
                y("StripByteCounts");
            } else {
                y("JPEGInterchangeFormat");
                y("JPEGInterchangeFormatLength");
            }
        }
        int i6 = 0;
        while (true) {
            int length2 = eVarArr.length;
            hashMapArr = this.e;
            if (i6 >= length2) {
                break;
            }
            Object[] array = hashMapArr[i6].entrySet().toArray();
            int length3 = array.length;
            int i7 = 0;
            while (i7 < length3) {
                Map.Entry entry = (Map.Entry) array[i7];
                if (entry.getValue() == null) {
                    iArr3 = iArr4;
                    hashMapArr[i6].remove(entry.getKey());
                } else {
                    iArr3 = iArr4;
                }
                i7++;
                iArr4 = iArr3;
            }
            i6++;
        }
        int[] iArr6 = iArr4;
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].b, d.b(0L, this.g));
        }
        if (hashMapArr[2].isEmpty()) {
            c2 = 2;
        } else {
            c2 = 2;
            hashMapArr[0].put(eVarArr2[2].b, d.b(0L, this.g));
        }
        if (hashMapArr[3].isEmpty()) {
            c3 = 3;
        } else {
            c3 = 3;
            hashMapArr[1].put(eVarArr2[3].b, d.b(0L, this.g));
        }
        if (this.h) {
            if (!this.i) {
                hashMapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.g));
                i = 1;
                iArr = iArr5;
                hashMapArr[4].put("JPEGInterchangeFormatLength", d.b(this.l, this.g));
                i2 = 0;
                while (true) {
                    length = eVarArr.length;
                    iArr2 = S;
                    if (i2 < length) {
                        break;
                    }
                    Iterator<Map.Entry<String, d>> it = hashMapArr[i2].entrySet().iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        d value = it.next().getValue();
                        value.getClass();
                        int i9 = iArr2[value.a] * value.b;
                        if (i9 > 4) {
                            i8 += i9;
                        }
                    }
                    iArr[i2] = iArr[i2] + i8;
                    i2++;
                }
                int i10 = 8;
                for (i3 = 0; i3 < eVarArr.length; i3++) {
                    if (!hashMapArr[i3].isEmpty()) {
                        iArr6[i3] = i10;
                        i10 = (hashMapArr[i3].size() * 12) + 6 + iArr[i3] + i10;
                    }
                }
                if (this.h) {
                    if (this.i) {
                        hashMapArr[4].put("StripOffsets", d.e(i10, this.g));
                    } else {
                        hashMapArr[4].put("JPEGInterchangeFormat", d.b(i10, this.g));
                    }
                    this.k = i10;
                    i10 += this.l;
                }
                if (this.d == 4) {
                    i10 += 8;
                }
                if (t) {
                    for (int i11 = 0; i11 < eVarArr.length; i11++) {
                        String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr6[i11]), Integer.valueOf(hashMapArr[i11].size()), Integer.valueOf(iArr[i11]), Integer.valueOf(i10));
                    }
                }
                if (!hashMapArr[i].isEmpty()) {
                    hashMapArr[0].put(eVarArr2[i].b, d.b(iArr6[i], this.g));
                }
                if (!hashMapArr[c2].isEmpty()) {
                    hashMapArr[0].put(eVarArr2[c2].b, d.b(iArr6[c2], this.g));
                }
                if (!hashMapArr[c3].isEmpty()) {
                    hashMapArr[i].put(eVarArr2[c3].b, d.b(iArr6[c3], this.g));
                }
                i4 = this.d;
                if (i4 != 4) {
                    cVar.h((short) i10);
                    cVar.write(c0);
                } else if (i4 == 13) {
                    cVar.c(i10);
                    cVar.write(F);
                } else if (i4 == 14) {
                    cVar.write(K);
                    cVar.c(i10);
                }
                cVar.h(this.g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                cVar.c = this.g;
                cVar.h((short) 42);
                cVar.c((int) 8);
                for (i5 = 0; i5 < eVarArr.length; i5++) {
                    if (!hashMapArr[i5].isEmpty()) {
                        cVar.h((short) hashMapArr[i5].size());
                        int size = (hashMapArr[i5].size() * 12) + iArr6[i5] + 2 + 4;
                        for (Map.Entry<String, d> entry2 : hashMapArr[i5].entrySet()) {
                            int i12 = Y[i5].get(entry2.getKey()).a;
                            d value2 = entry2.getValue();
                            value2.getClass();
                            int i13 = value2.b;
                            int i14 = value2.a;
                            int i15 = iArr2[i14] * i13;
                            cVar.h((short) i12);
                            cVar.h((short) i14);
                            cVar.c(i13);
                            if (i15 > 4) {
                                cVar.c(size);
                                size += i15;
                            } else {
                                cVar.write(value2.d);
                                if (i15 < 4) {
                                    while (i15 < 4) {
                                        cVar.b(0);
                                        i15++;
                                    }
                                }
                            }
                        }
                        if (i5 != 0 || hashMapArr[4].isEmpty()) {
                            cVar.c((int) 0);
                        } else {
                            cVar.c(iArr6[4]);
                        }
                        Iterator<Map.Entry<String, d>> it2 = hashMapArr[i5].entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr = it2.next().getValue().d;
                            if (bArr.length > 4) {
                                cVar.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                }
                if (this.h) {
                    cVar.write(n());
                }
                if (this.d == 14 && i10 % 2 == i) {
                    cVar.b(0);
                }
                cVar.c = ByteOrder.BIG_ENDIAN;
            }
            hashMapArr[4].put("StripOffsets", d.e(0, this.g));
            hashMapArr[4].put("StripByteCounts", d.e(this.l, this.g));
        }
        i = 1;
        iArr = iArr5;
        i2 = 0;
        while (true) {
            length = eVarArr.length;
            iArr2 = S;
            if (i2 < length) {
            }
            iArr[i2] = iArr[i2] + i8;
            i2++;
        }
        int i102 = 8;
        while (i3 < eVarArr.length) {
        }
        if (this.h) {
        }
        if (this.d == 4) {
        }
        if (t) {
        }
        if (!hashMapArr[i].isEmpty()) {
        }
        if (!hashMapArr[c2].isEmpty()) {
        }
        if (!hashMapArr[c3].isEmpty()) {
        }
        i4 = this.d;
        if (i4 != 4) {
        }
        cVar.h(this.g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.c = this.g;
        cVar.h((short) 42);
        cVar.c((int) 8);
        while (i5 < eVarArr.length) {
        }
        if (this.h) {
        }
        if (this.d == 14) {
            cVar.b(0);
        }
        cVar.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        HashMap<String, d>[] hashMapArr = this.e;
        if (c2 != null && c("DateTime") == null) {
            hashMapArr[0].put("DateTime", d.a(c2));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", d.b(0L, this.g));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", d.b(0L, this.g));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", d.b(0L, this.g));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", d.b(0L, this.g));
        }
    }

    @Nullable
    public final String c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d e2 = e(str);
        if (e2 != null) {
            if (!Z.contains(str)) {
                return e2.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = e2.a;
                if (i == 5 || i == 10) {
                    f[] fVarArr = (f[]) e2.j(this.g);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Arrays.toString(fVarArr);
                        return null;
                    }
                    f fVar = fVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (fVar.a / fVar.b));
                    f fVar2 = fVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (fVar2.a / fVar2.b));
                    f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.a / fVar3.b)));
                }
            } else {
                try {
                    return Double.toString(e2.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int d(int i, @NonNull String str) {
        d e2 = e(str);
        if (e2 == null) {
            return i;
        }
        try {
            return e2.h(this.g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Nullable
    public final d e(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < V.length; i++) {
            d dVar = this.e[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void f(g gVar) throws IOException {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                r4q.b.a(mediaMetadataRetriever, new a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap<String, d>[] hashMapArr = this.e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", d.e(Integer.parseInt(str), this.g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", d.e(Integer.parseInt(str2), this.g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", d.e(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.h(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    if (gVar.read(bArr2) != i2) {
                        throw new IOException("Can't read exif");
                    }
                    this.o = i;
                    w(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
    
        r23.c = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0141 A[LOOP:0: B:9:0x0023->B:32:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(b bVar, int i, int i2) throws IOException {
        boolean z2 = t;
        if (z2) {
            Objects.toString(bVar);
        }
        bVar.c = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException(et.a(readByte & 255, new StringBuilder("Invalid marker: ")));
        }
        if (bVar.readByte() != -40) {
            throw new IOException(et.a(readByte & 255, new StringBuilder("Invalid marker: ")));
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b2) {
                throw new IOException(et.a(readByte2 & 255, new StringBuilder("Invalid marker:")));
            }
            byte readByte3 = bVar.readByte();
            if (z2) {
                Integer.toHexString(readByte3 & 255);
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i4 = readUnsignedShort - 2;
                int i5 = i3 + 4;
                if (z2) {
                    Integer.toHexString(readByte3 & 255);
                }
                if (i4 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap<String, d>[] hashMapArr = this.e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i4];
                    bVar.readFully(bArr);
                    int i6 = i5 + i4;
                    byte[] bArr2 = c0;
                    if (bArr2 != null && i4 >= bArr2.length) {
                        for (int i7 = 0; i7 < bArr2.length; i7++) {
                            if (bArr[i7] == bArr2[i7]) {
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i4);
                        this.o = i + i5 + bArr2.length;
                        w(i2, copyOfRange);
                        F(new b(copyOfRange));
                        i5 = i6;
                    }
                    byte[] bArr3 = d0;
                    if (bArr3 != null && i4 >= bArr3.length) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= bArr3.length) {
                                int length = i5 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i4);
                                if (c("Xmp") == null) {
                                    hashMapArr[0].put("Xmp", new d(length, copyOfRange2, 1, copyOfRange2.length));
                                    this.s = true;
                                }
                            } else if (bArr[i8] == bArr3[i8]) {
                                i8++;
                            }
                        }
                    }
                    i5 = i6;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            bVar.b(1);
                                            hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", d.b(bVar.readUnsignedShort(), this.g));
                                            hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", d.b(bVar.readUnsignedShort(), this.g));
                                            i4 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    if (i4 >= 0) {
                        throw new IOException("Invalid length");
                    }
                    bVar.b(i4);
                    i3 = i5 + i4;
                    b2 = -1;
                } else {
                    byte[] bArr4 = new byte[i4];
                    if (bVar.read(bArr4) != i4) {
                        throw new IOException("Invalid exif");
                    }
                    if (c("UserComment") == null) {
                        hashMapArr[1].put("UserComment", d.a(new String(bArr4, b0)));
                    }
                }
                i4 = 0;
                if (i4 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00b6, code lost:
    
        if (r6 == null) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(BufferedInputStream bufferedInputStream) throws IOException {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z2;
        b bVar5;
        b bVar6;
        boolean z3;
        boolean z4;
        boolean z5;
        b bVar7;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = y;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    if (bArr[i2] != bytes[i2]) {
                        try {
                            bVar2 = new b(bArr);
                            try {
                                long readInt = bVar2.readInt();
                                byte[] bArr3 = new byte[4];
                                bVar2.read(bArr3);
                                if (Arrays.equals(bArr3, z)) {
                                    if (readInt == 1) {
                                        readInt = bVar2.readLong();
                                        j = 16;
                                        if (readInt < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j2 = 5000;
                                    if (readInt > j2) {
                                        readInt = j2;
                                    }
                                    long j3 = readInt - j;
                                    if (j3 >= 8) {
                                        byte[] bArr4 = new byte[4];
                                        boolean z6 = false;
                                        boolean z7 = false;
                                        for (long j4 = 0; j4 < j3 / 4 && bVar2.read(bArr4) == 4; j4++) {
                                            if (j4 != 1) {
                                                if (Arrays.equals(bArr4, A)) {
                                                    z6 = true;
                                                } else if (Arrays.equals(bArr4, B)) {
                                                    z7 = true;
                                                }
                                                if (z6 && z7) {
                                                    bVar2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            bVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            bVar4 = new b(bArr);
                        } catch (Exception unused3) {
                            bVar4 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar3 = null;
                        }
                        try {
                            ByteOrder v2 = v(bVar4);
                            this.g = v2;
                            bVar4.c = v2;
                            short readShort = bVar4.readShort();
                            z2 = readShort == 20306 || readShort == 21330;
                            bVar4.close();
                        } catch (Exception unused4) {
                            if (bVar4 != null) {
                                bVar4.close();
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bVar3 = bVar4;
                            if (bVar3 != null) {
                                bVar3.close();
                            }
                            throw th;
                        }
                        if (!z2) {
                            return 7;
                        }
                        try {
                            bVar7 = new b(bArr);
                        } catch (Exception unused5) {
                            bVar6 = null;
                        } catch (Throwable th5) {
                            th = th5;
                            bVar5 = null;
                        }
                        try {
                            ByteOrder v3 = v(bVar7);
                            this.g = v3;
                            bVar7.c = v3;
                            z3 = bVar7.readShort() == 85;
                            bVar7.close();
                        } catch (Exception unused6) {
                            bVar6 = bVar7;
                            if (bVar6 != null) {
                                bVar6.close();
                            }
                            z3 = false;
                            if (!z3) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bVar5 = bVar7;
                            if (bVar5 != null) {
                                bVar5.close();
                            }
                            throw th;
                        }
                        if (!z3) {
                            return 10;
                        }
                        int i3 = 0;
                        while (true) {
                            byte[] bArr5 = E;
                            if (i3 >= bArr5.length) {
                                z4 = true;
                                break;
                            }
                            if (bArr[i3] != bArr5[i3]) {
                                z4 = false;
                                break;
                            }
                            i3++;
                        }
                        if (z4) {
                            return 13;
                        }
                        int i4 = 0;
                        while (true) {
                            byte[] bArr6 = I;
                            if (i4 >= bArr6.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr7 = J;
                                    if (i5 >= bArr7.length) {
                                        z5 = true;
                                        break;
                                    }
                                    if (bArr[bArr6.length + i5 + 4] != bArr7[i5]) {
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                if (bArr[i4] != bArr6[i4]) {
                                    break;
                                }
                                i4++;
                            }
                        }
                        z5 = false;
                        return z5 ? 14 : 0;
                    }
                }
                return 9;
            }
            i++;
        }
    }

    public final void i(g gVar) throws IOException {
        int i;
        int i2;
        l(gVar);
        HashMap<String, d>[] hashMapArr = this.e;
        d dVar = hashMapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.d);
            gVar2.c = this.g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.h(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.h(12L);
            }
            x(gVar2, 6);
            d dVar2 = hashMapArr[7].get("PreviewImageStart");
            d dVar3 = hashMapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", dVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = hashMapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d e2 = d.e(i5, this.g);
                d e3 = d.e(i6, this.g);
                hashMapArr[0].put("ImageWidth", e2);
                hashMapArr[0].put("ImageLength", e3);
            }
        }
    }

    public final void j(b bVar) throws IOException {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + r4q.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.o = i;
                        w(0, bArr3);
                        I();
                        F(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                bVar.b(i2);
                length = i + i2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) throws IOException {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.b(i - bVar.d);
        bVar.read(bArr4);
        g(new b(bArr4), i, 5);
        bVar.b(i3 - bVar.d);
        bVar.c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == U.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e2 = d.e(readShort, this.g);
                d e3 = d.e(readShort2, this.g);
                HashMap<String, d>[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", e2);
                hashMapArr[0].put("ImageWidth", e3);
                return;
            }
            bVar.b(readUnsignedShort2);
        }
    }

    public final void l(g gVar) throws IOException {
        t(gVar);
        x(gVar, 0);
        H(gVar, 0);
        H(gVar, 5);
        H(gVar, 4);
        I();
        if (this.d == 8) {
            HashMap<String, d>[] hashMapArr = this.e;
            d dVar = hashMapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.d);
                gVar2.c = this.g;
                gVar2.b(6);
                x(gVar2, 9);
                d dVar2 = hashMapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    hashMapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void m(g gVar) throws IOException {
        if (t) {
            Objects.toString(gVar);
        }
        l(gVar);
        HashMap<String, d>[] hashMapArr = this.e;
        d dVar = hashMapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = hashMapArr[0].get("ISO");
        d dVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x0080, Exception -> 0x00a1, TRY_ENTER, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:15:0x0053, B:18:0x0069, B:20:0x0075, B:25:0x0085, B:26:0x008a, B:27:0x008b, B:28:0x0090), top: B:14:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x0080, Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:15:0x0053, B:18:0x0069, B:20:0x0075, B:25:0x0085, B:26:0x008a, B:27:0x008b, B:28:0x0090), top: B:14:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] n() {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        Throwable th2;
        InputStream inputStream2 = null;
        if (this.h) {
            byte[] bArr = this.m;
            if (bArr != null) {
                return bArr;
            }
            try {
                inputStream = this.c;
                try {
                    if (inputStream != null) {
                        try {
                            if (!inputStream.markSupported()) {
                                r4q.c(inputStream);
                                return null;
                            }
                            inputStream.reset();
                        } catch (Exception unused) {
                            fileDescriptor = null;
                            r4q.c(inputStream);
                            if (fileDescriptor != null) {
                            }
                            return null;
                        } catch (Throwable th3) {
                            inputStream2 = inputStream;
                            th = th3;
                            fileDescriptor = null;
                            r4q.c(inputStream2);
                            if (fileDescriptor == null) {
                            }
                        }
                    } else if (this.a != null) {
                        inputStream = new FileInputStream(this.a);
                    } else {
                        FileDescriptor b2 = r4q.a.b(this.b);
                        try {
                            r4q.a.c(b2, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = b2;
                            inputStream = new FileInputStream(b2);
                            if (inputStream.skip(this.k + this.o) == this.k + this.o) {
                                throw new IOException("Corrupted image");
                            }
                            byte[] bArr2 = new byte[this.l];
                            if (inputStream.read(bArr2) != this.l) {
                                throw new IOException("Corrupted image");
                            }
                            this.m = bArr2;
                            r4q.c(inputStream);
                            if (fileDescriptor != null) {
                                r4q.b(fileDescriptor);
                            }
                            return bArr2;
                        } catch (Exception unused2) {
                            fileDescriptor = b2;
                            inputStream = null;
                            r4q.c(inputStream);
                            if (fileDescriptor != null) {
                            }
                            return null;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileDescriptor = b2;
                            th = th2;
                            r4q.c(inputStream2);
                            if (fileDescriptor == null) {
                            }
                        }
                    }
                    if (inputStream.skip(this.k + this.o) == this.k + this.o) {
                    }
                } catch (Exception unused3) {
                    r4q.c(inputStream);
                    if (fileDescriptor != null) {
                        r4q.b(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th5) {
                    th2 = th5;
                    inputStream2 = inputStream;
                    th = th2;
                    r4q.c(inputStream2);
                    if (fileDescriptor == null) {
                        throw th;
                    }
                    r4q.b(fileDescriptor);
                    throw th;
                }
                fileDescriptor = null;
            } catch (Exception unused4) {
                inputStream = null;
                fileDescriptor = null;
            } catch (Throwable th6) {
                th = th6;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void o(b bVar) throws IOException {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.c = ByteOrder.LITTLE_ENDIAN;
        bVar.b(I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = J;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.o = i;
                        w(0, bArr3);
                        F(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + r4q.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.b(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void q(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int h = dVar.h(this.g);
        int h2 = dVar2.h(this.g);
        if (this.d == 7) {
            h += this.p;
        }
        if (h <= 0 || h2 <= 0) {
            return;
        }
        this.h = true;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[h2];
            bVar.skip(h);
            bVar.read(bArr);
            this.m = bArr;
        }
        this.k = h;
        this.l = h2;
    }

    public final boolean r(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.g) <= 512 && dVar2.h(this.g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(@NonNull InputStream inputStream) {
        boolean z2 = t;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < V.length; i++) {
            try {
                this.e[i] = new HashMap<>();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (z2) {
                    u();
                    return;
                }
                return;
            } catch (Throwable th) {
                a();
                if (z2) {
                    u();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int h = h(bufferedInputStream);
        this.d = h;
        if (h != 4 && h != 9 && h != 13 && h != 14) {
            g gVar = new g(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 12) {
                f(gVar);
            } else if (i2 == 7) {
                i(gVar);
            } else if (i2 == 10) {
                m(gVar);
            } else {
                l(gVar);
            }
            gVar.h(this.o);
            F(gVar);
            a();
            if (z2) {
                return;
            }
            u();
            return;
        }
        b bVar = new b(bufferedInputStream);
        int i3 = this.d;
        if (i3 == 4) {
            g(bVar, 0, 0);
        } else if (i3 == 13) {
            j(bVar);
        } else if (i3 == 9) {
            k(bVar);
        } else if (i3 == 14) {
            o(bVar);
        }
        a();
        if (z2) {
        }
    }

    public final void t(g gVar) throws IOException {
        ByteOrder v2 = v(gVar);
        this.g = v2;
        gVar.c = v2;
        int readUnsignedShort = gVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException(et.a(readUnsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int readInt = gVar.readInt();
        if (readInt < 8) {
            throw new IOException(lhg.a(readInt, "Invalid first Ifd offset: "));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            gVar.b(i2);
        }
    }

    public final void u() {
        int i = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.e;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry<String, d> entry : hashMapArr[i].entrySet()) {
                d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.i(this.g);
            }
            i++;
        }
    }

    public final void w(int i, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        t(gVar);
        x(gVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(g gVar, int i) throws IOException {
        boolean z2;
        HashMap<String, d>[] hashMapArr;
        short s;
        boolean z3;
        long j;
        HashMap<String, d>[] hashMapArr2;
        e eVar;
        long j2;
        boolean z4;
        int i2;
        HashMap<String, d>[] hashMapArr3;
        int i3;
        e eVar2;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5 = i;
        Integer valueOf = Integer.valueOf(gVar.d);
        HashSet hashSet = this.f;
        hashSet.add(valueOf);
        short readShort = gVar.readShort();
        if (readShort <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z2 = t;
            hashMapArr = this.e;
            if (s2 >= readShort) {
                break;
            }
            int readUnsignedShort2 = gVar.readUnsignedShort();
            int readUnsignedShort3 = gVar.readUnsignedShort();
            int readInt = gVar.readInt();
            short s3 = s2;
            long j4 = gVar.d + 4;
            e eVar3 = X[i5].get(Integer.valueOf(readUnsignedShort2));
            if (z2) {
                j = 4;
                s = readShort;
                z3 = z2;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i5), Integer.valueOf(readUnsignedShort2), eVar3 != null ? eVar3.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
            } else {
                s = readShort;
                z3 = z2;
                j = 4;
            }
            if (eVar3 != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < S.length) {
                    int i6 = eVar3.c;
                    if (i6 == 7 || readUnsignedShort3 == 7 || i6 == readUnsignedShort3 || (i2 = eVar3.d) == readUnsignedShort3 || (((i6 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i6;
                        }
                        hashMapArr2 = hashMapArr;
                        eVar = eVar3;
                        j2 = readInt * r15[readUnsignedShort3];
                        if (j2 >= 0 && j2 <= 2147483647L) {
                            z4 = true;
                            if (z4) {
                                if (j2 > j) {
                                    int readInt2 = gVar.readInt();
                                    if (this.d == 7) {
                                        hashMapArr3 = hashMapArr2;
                                        eVar2 = eVar;
                                        if ("MakerNote".equals(eVar2.b)) {
                                            this.p = readInt2;
                                        } else if (i5 == 6 && "ThumbnailImage".equals(eVar2.b)) {
                                            this.q = readInt2;
                                            this.r = readInt;
                                            d e2 = d.e(6, this.g);
                                            i3 = readUnsignedShort2;
                                            d b2 = d.b(this.q, this.g);
                                            i4 = readInt;
                                            d b3 = d.b(this.r, this.g);
                                            hashMapArr3[4].put("Compression", e2);
                                            hashMapArr3[4].put("JPEGInterchangeFormat", b2);
                                            hashMapArr3[4].put("JPEGInterchangeFormatLength", b3);
                                            gVar.h(readInt2);
                                        }
                                        i3 = readUnsignedShort2;
                                    } else {
                                        hashMapArr3 = hashMapArr2;
                                        i3 = readUnsignedShort2;
                                        eVar2 = eVar;
                                    }
                                    i4 = readInt;
                                    gVar.h(readInt2);
                                } else {
                                    hashMapArr3 = hashMapArr2;
                                    i3 = readUnsignedShort2;
                                    eVar2 = eVar;
                                    i4 = readInt;
                                }
                                Integer num = a0.get(Integer.valueOf(i3));
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 == 4) {
                                            j3 = gVar.readInt() & 4294967295L;
                                        } else if (readUnsignedShort3 == 8) {
                                            readUnsignedShort = gVar.readShort();
                                        } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                            readUnsignedShort = gVar.readInt();
                                        } else {
                                            j3 = -1;
                                        }
                                        if (z3) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j3), eVar2.b);
                                        }
                                        if (j3 > 0 && !hashSet.contains(Integer.valueOf((int) j3))) {
                                            gVar.h(j3);
                                            x(gVar, num.intValue());
                                        }
                                        gVar.h(j4);
                                    } else {
                                        readUnsignedShort = gVar.readUnsignedShort();
                                    }
                                    j3 = readUnsignedShort;
                                    if (z3) {
                                    }
                                    if (j3 > 0) {
                                        gVar.h(j3);
                                        x(gVar, num.intValue());
                                    }
                                    gVar.h(j4);
                                } else {
                                    int i7 = gVar.d + this.o;
                                    byte[] bArr = new byte[(int) j2];
                                    gVar.readFully(bArr);
                                    d dVar = new d(i7, bArr, readUnsignedShort3, i4);
                                    HashMap<String, d> hashMap = hashMapArr3[i];
                                    String str = eVar2.b;
                                    hashMap.put(str, dVar);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && dVar.i(this.g).contains("PENTAX")) || ("Compression".equals(str) && dVar.h(this.g) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (gVar.d != j4) {
                                        gVar.h(j4);
                                    }
                                }
                            } else {
                                gVar.h(j4);
                            }
                            s2 = (short) (s3 + 1);
                            i5 = i;
                            readShort = s;
                        }
                        z4 = false;
                        if (z4) {
                        }
                        s2 = (short) (s3 + 1);
                        i5 = i;
                        readShort = s;
                    } else if (z3) {
                        String str2 = R[readUnsignedShort3];
                    }
                }
            }
            eVar = eVar3;
            hashMapArr2 = hashMapArr;
            j2 = 0;
            z4 = false;
            if (z4) {
            }
            s2 = (short) (s3 + 1);
            i5 = i;
            readShort = s;
        }
        int readInt3 = gVar.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
        }
        long j5 = readInt3;
        if (j5 <= 0 || hashSet.contains(Integer.valueOf(readInt3))) {
            return;
        }
        gVar.h(j5);
        if (hashMapArr[4].isEmpty()) {
            x(gVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            x(gVar, 5);
        }
    }

    public final void y(String str) {
        for (int i = 0; i < V.length; i++) {
            this.e[i].remove(str);
        }
    }

    public final void z(int i, String str, String str2) {
        HashMap<String, d>[] hashMapArr = this.e;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    /* compiled from: ExifInterface.java */
    public static class g extends b {
        public g(byte[] bArr) throws IOException {
            super(bArr);
            this.b.mark(Integer.MAX_VALUE);
        }

        public final void h(long j) throws IOException {
            int i = this.d;
            if (i > j) {
                this.d = 0;
                this.b.reset();
            } else {
                j -= i;
            }
            b((int) j);
        }

        public g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public p4q(@NonNull FileDescriptor fileDescriptor) throws IOException {
        boolean z2;
        FileInputStream fileInputStream;
        Throwable th;
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.c = null;
            this.a = null;
            try {
                r4q.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.b = fileDescriptor;
                try {
                    fileDescriptor = r4q.a.b(fileDescriptor);
                    z2 = true;
                } catch (Exception e2) {
                    throw new IOException("Failed to duplicate file descriptor", e2);
                }
            } catch (Exception unused) {
                this.b = null;
                z2 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    s(fileInputStream);
                    r4q.c(fileInputStream);
                    if (z2) {
                        r4q.b(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4q.c(fileInputStream);
                    if (z2) {
                        r4q.b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* compiled from: ExifInterface.java */
    public class a extends MediaDataSource {
        public long b;
        public final /* synthetic */ g c;

        public a(g gVar) {
            this.c = gVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.b;
                g gVar = this.c;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + gVar.b.available()) {
                        return -1;
                    }
                    gVar.h(j);
                    this.b = j;
                }
                if (i2 > gVar.b.available()) {
                    i2 = gVar.b.available();
                }
                int read = gVar.read(bArr, i, i2);
                if (read >= 0) {
                    this.b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }

    public p4q(@NonNull InputStream inputStream) throws IOException {
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        r4q.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    } catch (Exception unused) {
                    }
                }
                this.c = null;
                this.b = null;
            }
            s(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
