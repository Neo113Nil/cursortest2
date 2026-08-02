package org.msgpack.core;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.b;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* compiled from: MessagePacker.java */
/* loaded from: classes8.dex */
public final class c implements Closeable, Flushable {
    public static final boolean i;
    public final int b;
    public final int c;
    public final boolean d;
    public final OutputStreamBufferOutput e;
    public MessageBuffer f;
    public int g = 0;
    public CharsetEncoder h;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i2 = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i2 >= 14 && i2 < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        i = z;
    }

    public c(OutputStreamBufferOutput outputStreamBufferOutput, b.C2186b c2186b) {
        this.e = outputStreamBufferOutput;
        this.b = c2186b.b;
        this.c = c2186b.c;
        this.d = c2186b.e;
    }

    public final int b(int i2, String str) {
        if (this.h == null) {
            CharsetEncoder newEncoder = b.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.h = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.h.reset();
        MessageBuffer messageBuffer = this.f;
        ByteBuffer sliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i2, messageBuffer.size() - i2);
        int position = sliceAsByteBuffer.position();
        CoderResult encode = this.h.encode(CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (encode.isUnderflow() && !encode.isOverflow() && this.h.flush(sliceAsByteBuffer).isUnderflow()) {
            return sliceAsByteBuffer.position() - position;
        }
        return -1;
    }

    public final void c(int i2) throws IOException {
        MessageBuffer messageBuffer = this.f;
        OutputStreamBufferOutput outputStreamBufferOutput = this.e;
        if (messageBuffer == null) {
            this.f = outputStreamBufferOutput.next(i2);
        } else if (this.g + i2 >= messageBuffer.size()) {
            this.e.writeBuffer(this.g);
            this.f = null;
            this.g = 0;
            this.f = outputStreamBufferOutput.next(i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStreamBufferOutput outputStreamBufferOutput = this.e;
        try {
            flush();
        } finally {
            outputStreamBufferOutput.close();
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        int i2 = this.g;
        if (i2 > 0) {
            this.e.writeBuffer(i2);
            this.f = null;
            this.g = 0;
        }
        this.e.flush();
    }

    public final void h(int i2) throws IOException {
        if (i2 < -32) {
            if (i2 < -32768) {
                o((byte) -46, i2);
                return;
            } else if (i2 < -128) {
                q((byte) -47, (short) i2);
                return;
            } else {
                n((byte) -48, (byte) i2);
                return;
            }
        }
        if (i2 < 128) {
            m((byte) i2);
            return;
        }
        if (i2 < 256) {
            n((byte) -52, (byte) i2);
        } else if (i2 < 65536) {
            q((byte) -51, (short) i2);
        } else {
            o((byte) -50, i2);
        }
    }

    public final void i(long j) throws IOException {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    p(j, (byte) -45);
                    return;
                } else {
                    o((byte) -46, (int) j);
                    return;
                }
            }
            if (j < -128) {
                q((byte) -47, (short) j);
                return;
            } else {
                n((byte) -48, (byte) j);
                return;
            }
        }
        if (j < 128) {
            m((byte) j);
            return;
        }
        if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            if (j < 256) {
                n((byte) -52, (byte) j);
                return;
            } else {
                q((byte) -51, (short) j);
                return;
            }
        }
        if (j < 4294967296L) {
            o((byte) -50, (int) j);
        } else {
            p(j, (byte) -49);
        }
    }

    public final void j(int i2) throws IOException {
        if (i2 < 32) {
            m((byte) (i2 | (-96)));
            return;
        }
        if (this.d && i2 < 256) {
            n((byte) -39, (byte) i2);
        } else if (i2 < 65536) {
            q((byte) -38, (short) i2);
        } else {
            o((byte) -37, i2);
        }
    }

    public final void k(String str) throws IOException {
        byte[] bytes = str.getBytes(b.a);
        j(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.f;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i2 = this.g;
            if (size - i2 >= length && length <= this.c) {
                this.f.putBytes(i2, bytes, 0, length);
                this.g += length;
                return;
            }
        }
        flush();
        this.e.add(bytes, 0, length);
    }

    public final void m(byte b) throws IOException {
        c(1);
        MessageBuffer messageBuffer = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        messageBuffer.putByte(i2, b);
    }

    public final void n(byte b, byte b2) throws IOException {
        c(2);
        MessageBuffer messageBuffer = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        messageBuffer.putByte(i2, b);
        MessageBuffer messageBuffer2 = this.f;
        int i3 = this.g;
        this.g = i3 + 1;
        messageBuffer2.putByte(i3, b2);
    }

    public final void o(byte b, int i2) throws IOException {
        c(5);
        MessageBuffer messageBuffer = this.f;
        int i3 = this.g;
        this.g = i3 + 1;
        messageBuffer.putByte(i3, b);
        this.f.putInt(this.g, i2);
        this.g += 4;
    }

    public final void p(long j, byte b) throws IOException {
        c(9);
        MessageBuffer messageBuffer = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.f.putLong(this.g, j);
        this.g += 8;
    }

    public final void q(byte b, short s) throws IOException {
        c(3);
        MessageBuffer messageBuffer = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.f.putShort(this.g, s);
        this.g += 2;
    }
}
