package org.msgpack.core;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import org.msgpack.core.b;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ValueType;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.apw;
import xsna.bow;
import xsna.dpw;
import xsna.fow;
import xsna.fpw;
import xsna.kjr0;
import xsna.lhg;
import xsna.mow;
import xsna.npw;
import xsna.ppw;
import xsna.re;
import xsna.wnw;
import xsna.xnw;
import xsna.znw;
import xsna.zr;

/* compiled from: MessageUnpacker.java */
/* loaded from: classes8.dex */
public final class d implements Closeable {
    public static final MessageBuffer p = MessageBuffer.wrap(new byte[0]);
    public final boolean b;
    public final boolean c;
    public final CodingErrorAction d;
    public final CodingErrorAction e;
    public final int f;
    public final int g;
    public final MessageBufferInput h;
    public int j;
    public int l;
    public StringBuilder m;
    public CharsetDecoder n;
    public CharBuffer o;
    public MessageBuffer i = p;
    public final MessageBuffer k = MessageBuffer.allocate(8);

    /* compiled from: MessageUnpacker.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ValueType.values().length];
            b = iArr;
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ValueType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ValueType.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ValueType.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[ValueType.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[MessageFormat.values().length];
            a = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    public d(MessageBufferInput messageBufferInput, b.c cVar) {
        this.h = messageBufferInput;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.h;
    }

    public static MessagePackException w(String str, byte b) {
        MessageFormat i = MessageFormat.i(b);
        if (i == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(zr.a("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String name = i.h().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, name.substring(0, 1) + name.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    public final long A() throws IOException {
        byte readByte = readByte();
        if (b.a.a(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                return readInt < 0 ? (readInt & Integer.MAX_VALUE) + 2147483648L : readInt;
            case -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63));
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw w("Integer", readByte);
        }
    }

    public final int E() throws IOException {
        byte readByte = readByte();
        if ((readByte & (-16)) == -128) {
            return readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
        }
        if (readByte == -34) {
            return r();
        }
        if (readByte == -33) {
            return s();
        }
        throw w("Map", readByte);
    }

    public final int H() throws IOException {
        int readByte;
        byte readByte2 = readByte();
        if ((readByte2 & (-32)) == -96) {
            return readByte2 & 31;
        }
        int i = -1;
        switch (readByte2) {
            case -39:
                readByte = readByte() & 255;
                break;
            case -38:
                readByte = r();
                break;
            case -37:
                readByte = s();
                break;
            default:
                readByte = -1;
                break;
        }
        if (readByte >= 0) {
            return readByte;
        }
        if (this.c) {
            switch (readByte2) {
                case -60:
                    i = readByte() & 255;
                    break;
                case -59:
                    i = r();
                    break;
                case -58:
                    i = s();
                    break;
            }
            if (i >= 0) {
                return i;
            }
        }
        throw w("String", readByte2);
    }

    public final String I() throws IOException {
        int remaining;
        int H = H();
        if (H == 0) {
            return "";
        }
        int i = this.f;
        if (H > i) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(i), Integer.valueOf(H)), H);
        }
        CharsetDecoder charsetDecoder = this.n;
        if (charsetDecoder == null) {
            this.o = CharBuffer.allocate(this.g);
            this.n = b.a.newDecoder().onMalformedInput(this.d).onUnmappableCharacter(this.e);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.m;
        if (sb == null) {
            this.m = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        if (this.i.size() - this.j >= H) {
            return b(H);
        }
        while (true) {
            if (H <= 0) {
                break;
            }
            try {
                int size = this.i.size();
                int i2 = this.j;
                int i3 = size - i2;
                if (i3 >= H) {
                    this.m.append(b(H));
                    break;
                }
                if (i3 == 0) {
                    p();
                } else {
                    ByteBuffer sliceAsByteBuffer = this.i.sliceAsByteBuffer(i2, i3);
                    int position = sliceAsByteBuffer.position();
                    this.o.clear();
                    CoderResult decode = this.n.decode(sliceAsByteBuffer, this.o, false);
                    int position2 = sliceAsByteBuffer.position() - position;
                    this.j += position2;
                    H -= position2;
                    this.m.append(this.o.flip());
                    if (decode.isError()) {
                        o(decode);
                    }
                    if (decode.isUnderflow() && position2 < i3) {
                        ByteBuffer allocate = ByteBuffer.allocate(Integer.numberOfLeadingZeros((~(this.i.getByte(this.j) & 255)) << 24));
                        MessageBuffer messageBuffer = this.i;
                        messageBuffer.getBytes(this.j, messageBuffer.size() - this.j, allocate);
                        while (true) {
                            p();
                            remaining = allocate.remaining();
                            if (this.i.size() >= remaining) {
                                break;
                            }
                            MessageBuffer messageBuffer2 = this.i;
                            messageBuffer2.getBytes(0, messageBuffer2.size(), allocate);
                            this.j = this.i.size();
                        }
                        this.i.getBytes(0, remaining, allocate);
                        this.j = remaining;
                        allocate.position(0);
                        this.o.clear();
                        CoderResult decode2 = this.n.decode(allocate, this.o, false);
                        if (decode2.isError()) {
                            o(decode2);
                        }
                        if (decode2.isOverflow() || (decode2.isUnderflow() && allocate.position() < allocate.limit())) {
                            try {
                                decode2.throwException();
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                            } catch (Exception e) {
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                            }
                        }
                        H -= allocate.limit();
                        this.m.append(this.o.flip());
                    }
                }
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        return this.m.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final re J() throws IOException {
        BigInteger valueOf;
        double d;
        int readByte;
        int i;
        org.msgpack.core.a aVar;
        org.msgpack.core.a aVar2;
        byte b;
        Instant ofEpochSecond;
        MessageFormat n = n();
        int i2 = 0;
        int i3 = -1;
        switch (a.b[n.h().ordinal()]) {
            case 1:
                readByte();
                return fpw.b;
            case 2:
                return y() ? bow.c : bow.d;
            case 3:
                if (n != MessageFormat.UINT64) {
                    return new apw(A());
                }
                byte readByte2 = readByte();
                if (b.a.a(readByte2)) {
                    valueOf = BigInteger.valueOf(readByte2);
                } else {
                    switch (readByte2) {
                        case -52:
                            valueOf = BigInteger.valueOf(readByte() & 255);
                            break;
                        case -51:
                            valueOf = BigInteger.valueOf(readShort() & 65535);
                            break;
                        case -50:
                            int readInt = readInt();
                            if (readInt >= 0) {
                                valueOf = BigInteger.valueOf(readInt);
                                break;
                            } else {
                                valueOf = BigInteger.valueOf((readInt & Integer.MAX_VALUE) + 2147483648L);
                                break;
                            }
                        case -49:
                            long readLong = readLong();
                            if (readLong >= 0) {
                                valueOf = BigInteger.valueOf(readLong);
                                break;
                            } else {
                                valueOf = BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63);
                                break;
                            }
                        case -48:
                            valueOf = BigInteger.valueOf(readByte());
                            break;
                        case -47:
                            valueOf = BigInteger.valueOf(readShort());
                            break;
                        case -46:
                            valueOf = BigInteger.valueOf(readInt());
                            break;
                        case -45:
                            valueOf = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw w("Integer", readByte2);
                    }
                }
                return new xnw(valueOf);
            case 4:
                byte readByte3 = readByte();
                if (readByte3 == -54) {
                    d = q(4).getFloat(this.l);
                } else {
                    if (readByte3 != -53) {
                        throw w("Float", readByte3);
                    }
                    d = q(8).getDouble(this.l);
                }
                return new fow(d);
            case 5:
                return new npw(t(H()));
            case 6:
                byte readByte4 = readByte();
                if ((readByte4 & (-32)) == -96) {
                    i = readByte4 & 31;
                } else {
                    switch (readByte4) {
                        case -60:
                            readByte = readByte() & 255;
                            break;
                        case -59:
                            readByte = r();
                            break;
                        case -58:
                            readByte = s();
                            break;
                        default:
                            readByte = -1;
                            break;
                    }
                    if (readByte < 0) {
                        if (this.b) {
                            switch (readByte4) {
                                case -39:
                                    i3 = readByte() & 255;
                                    break;
                                case -38:
                                    i3 = r();
                                    break;
                                case -37:
                                    i3 = s();
                                    break;
                            }
                            if (i3 >= 0) {
                                i = i3;
                            }
                        }
                        throw w("Binary", readByte4);
                    }
                    i = readByte;
                }
                return new znw(t(i));
            case 7:
                int x = x();
                kjr0[] kjr0VarArr = new kjr0[x];
                while (i2 < x) {
                    kjr0VarArr[i2] = J();
                    i2++;
                }
                return x == 0 ? wnw.c : new wnw(kjr0VarArr);
            case 8:
                int E = E() * 2;
                kjr0[] kjr0VarArr2 = new kjr0[E];
                while (i2 < E) {
                    kjr0VarArr2[i2] = J();
                    kjr0VarArr2[i2 + 1] = J();
                    i2 += 2;
                }
                return E == 0 ? dpw.c : new dpw(kjr0VarArr2);
            case 9:
                byte readByte5 = readByte();
                switch (readByte5) {
                    case -57:
                        MessageBuffer q = q(2);
                        aVar = new org.msgpack.core.a(q.getByte(this.l + 1), q.getByte(this.l) & 255);
                        int i4 = aVar.b;
                        b = aVar.a;
                        if (b == -1) {
                            return new mow(b, t(i4));
                        }
                        if (b != -1) {
                            throw new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", "Timestamp", -1, Integer.valueOf(b)));
                        }
                        if (i4 == 4) {
                            ofEpochSecond = Instant.ofEpochSecond(readInt() & 4294967295L);
                        } else if (i4 == 8) {
                            ofEpochSecond = Instant.ofEpochSecond(readLong() & 17179869183L, (int) (r0 >>> 34));
                        } else {
                            if (i4 != 12) {
                                throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte) -1, Integer.valueOf(i4)));
                            }
                            ofEpochSecond = Instant.ofEpochSecond(readLong(), readInt() & 4294967295L);
                        }
                        return new ppw(ofEpochSecond);
                    case -56:
                        MessageBuffer q2 = q(3);
                        aVar2 = new org.msgpack.core.a(q2.getByte(this.l + 2), q2.getShort(this.l) & 65535);
                        aVar = aVar2;
                        int i42 = aVar.b;
                        b = aVar.a;
                        if (b == -1) {
                        }
                        break;
                    case -55:
                        MessageBuffer q3 = q(5);
                        int i5 = q3.getInt(this.l);
                        if (i5 < 0) {
                            throw new MessageSizeException((i5 & Integer.MAX_VALUE) + 2147483648L);
                        }
                        aVar2 = new org.msgpack.core.a(q3.getByte(this.l + 4), i5);
                        aVar = aVar2;
                        int i422 = aVar.b;
                        b = aVar.a;
                        if (b == -1) {
                        }
                        break;
                    default:
                        switch (readByte5) {
                            case -44:
                                aVar2 = new org.msgpack.core.a(readByte(), 1);
                                aVar = aVar2;
                                int i4222 = aVar.b;
                                b = aVar.a;
                                if (b == -1) {
                                }
                                break;
                            case -43:
                                aVar = new org.msgpack.core.a(readByte(), 2);
                                int i42222 = aVar.b;
                                b = aVar.a;
                                if (b == -1) {
                                }
                                break;
                            case -42:
                                aVar = new org.msgpack.core.a(readByte(), 4);
                                int i422222 = aVar.b;
                                b = aVar.a;
                                if (b == -1) {
                                }
                                break;
                            case -41:
                                aVar = new org.msgpack.core.a(readByte(), 8);
                                int i4222222 = aVar.b;
                                b = aVar.a;
                                if (b == -1) {
                                }
                                break;
                            case -40:
                                aVar = new org.msgpack.core.a(readByte(), 16);
                                int i42222222 = aVar.b;
                                b = aVar.a;
                                if (b == -1) {
                                }
                                break;
                            default:
                                throw w("Ext", readByte5);
                        }
                }
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public final String b(int i) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.d == codingErrorAction && this.e == codingErrorAction && this.i.hasArray()) {
            String str = new String(this.i.array(), this.i.arrayOffset() + this.j, i, b.a);
            this.j += i;
            return str;
        }
        try {
            CharBuffer decode = this.n.decode(this.i.sliceAsByteBuffer(this.j, i));
            this.j += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = p;
        this.j = 0;
        this.h.close();
    }

    public final boolean m() throws IOException {
        while (this.i.size() <= this.j) {
            MessageBuffer next = this.h.next();
            if (next == null) {
                return false;
            }
            this.i.size();
            this.i = next;
            this.j = 0;
        }
        return true;
    }

    public final MessageFormat n() throws IOException {
        if (m()) {
            return MessageFormat.i(this.i.getByte(this.j));
        }
        throw new MessageInsufficientBufferException();
    }

    public final void o(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.d == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.e == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final void p() throws IOException {
        MessageBuffer next = this.h.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.i.size();
        this.i = next;
        this.j = 0;
    }

    public final MessageBuffer q(int i) throws IOException {
        int size = this.i.size();
        int i2 = this.j;
        int i3 = size - i2;
        if (i3 >= i) {
            this.l = i2;
            this.j = i2 + i;
            return this.i;
        }
        MessageBuffer messageBuffer = this.k;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.i, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            p();
            int size2 = this.i.size();
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.i, 0, i);
                this.j = i;
                this.l = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.i, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final int r() throws IOException {
        return readShort() & 65535;
    }

    public final byte readByte() throws IOException {
        int size = this.i.size();
        int i = this.j;
        if (size > i) {
            byte b = this.i.getByte(i);
            this.j++;
            return b;
        }
        p();
        if (this.i.size() <= 0) {
            return readByte();
        }
        byte b2 = this.i.getByte(0);
        this.j = 1;
        return b2;
    }

    public final int readInt() throws IOException {
        return q(4).getInt(this.l);
    }

    public final long readLong() throws IOException {
        return q(8).getLong(this.l);
    }

    public final short readShort() throws IOException {
        return q(2).getShort(this.l);
    }

    public final int s() throws IOException {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new MessageSizeException((readInt & Integer.MAX_VALUE) + 2147483648L);
    }

    public final void skipValue() throws IOException {
        int i;
        int r;
        int i2 = 1;
        while (i2 > 0) {
            byte readByte = readByte();
            switch (a.a[MessageFormat.i(readByte).ordinal()]) {
                case 5:
                    i = readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
                    r = i * 2;
                    i2 += r;
                    i2--;
                case 6:
                    i2 += readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
                    i2--;
                case 7:
                    v(readByte & 31);
                    i2--;
                case 8:
                case 9:
                    v(1);
                    i2--;
                case 10:
                case 11:
                    v(2);
                    i2--;
                case 12:
                case 13:
                case 14:
                    v(4);
                    i2--;
                case 15:
                case 16:
                case 17:
                    v(8);
                    i2--;
                case 18:
                case 19:
                    v(readByte() & 255);
                    i2--;
                case 20:
                case 21:
                    v(r());
                    i2--;
                case 22:
                case 23:
                    v(s());
                    i2--;
                case 24:
                    v(2);
                    i2--;
                case 25:
                    v(3);
                    i2--;
                case 26:
                    v(5);
                    i2--;
                case 27:
                    v(9);
                    i2--;
                case 28:
                    v(17);
                    i2--;
                case 29:
                    v((readByte() & 255) + 1);
                    i2--;
                case 30:
                    v(r() + 1);
                    i2--;
                case 31:
                    int s = s();
                    v(1);
                    v(s);
                    i2--;
                case 32:
                    r = r();
                    i2 += r;
                    i2--;
                case 33:
                    r = s();
                    i2 += r;
                    i2--;
                case 34:
                    i = r();
                    r = i * 2;
                    i2 += r;
                    i2--;
                case 35:
                    i = s();
                    r = i * 2;
                    i2 += r;
                    i2--;
                case 36:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i2--;
            }
        }
    }

    public final byte[] t(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.i.size();
            int i3 = this.j;
            int i4 = size - i3;
            if (i4 >= i) {
                this.i.getBytes(i3, bArr, i2, i);
                this.j += i;
                return bArr;
            }
            this.i.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.j += i4;
            p();
        }
    }

    public final void v(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "payload size must be >= 0: "));
        }
        while (true) {
            int size = this.i.size();
            int i2 = this.j;
            int i3 = size - i2;
            if (i3 >= i) {
                this.j = i2 + i;
                return;
            } else {
                this.j = i2 + i3;
                i -= i3;
                p();
            }
        }
    }

    public final int x() throws IOException {
        byte readByte = readByte();
        if ((readByte & (-16)) == -112) {
            return readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
        }
        if (readByte == -36) {
            return r();
        }
        if (readByte == -35) {
            return s();
        }
        throw w("Array", readByte);
    }

    public final boolean y() throws IOException {
        byte readByte = readByte();
        if (readByte == -62) {
            return false;
        }
        if (readByte == -61) {
            return true;
        }
        throw w("boolean", readByte);
    }

    public final int z() throws IOException {
        byte readByte = readByte();
        if (b.a.a(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf((readInt & Integer.MAX_VALUE) + 2147483648L));
            case -49:
                long readLong = readLong();
                if (readLong < 0 || readLong > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63));
                }
                return (int) readLong;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 < -2147483648L || readLong2 > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong2));
                }
                return (int) readLong2;
            default:
                throw w("Integer", readByte);
        }
    }
}
