package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;

/* loaded from: classes4.dex */
public final class dv10 implements Closeable, Flushable {
    public static final boolean A;
    public final int a;
    public final int b;
    public final boolean c;
    public final py80 w;
    public MessageBuffer x;
    public int y = 0;
    public CharsetEncoder z;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        A = z;
    }

    public dv10(py80 py80Var, av10 av10Var) {
        this.w = py80Var;
        this.a = av10Var.a;
        this.b = av10Var.b;
        this.c = av10Var.w;
    }

    public final void B(byte b, short s) {
        c(3);
        MessageBuffer messageBuffer = this.x;
        int i = this.y;
        this.y = i + 1;
        messageBuffer.h(b, i);
        this.x.l(this.y, s);
        this.y += 2;
    }

    public final int a(int i, String str) {
        if (this.z == null) {
            CharsetEncoder newEncoder = cv10.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.z = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.z.reset();
        MessageBuffer messageBuffer = this.x;
        ByteBuffer m = messageBuffer.m(i, messageBuffer.c - i);
        int position = m.position();
        CoderResult encode = this.z.encode(CharBuffer.wrap(str), m, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (encode.isUnderflow() && !encode.isOverflow() && this.z.flush(m).isUnderflow()) {
            return m.position() - position;
        }
        return -1;
    }

    public final void c(int i) {
        MessageBuffer messageBuffer = this.x;
        py80 py80Var = this.w;
        if (messageBuffer == null) {
            if (py80Var.b.c < i) {
                py80Var.b = MessageBuffer.a(i);
            }
            this.x = py80Var.b;
        } else if (this.y + i >= messageBuffer.c) {
            d();
            if (py80Var.b.c < i) {
                py80Var.b = MessageBuffer.a(i);
            }
            this.x = py80Var.b;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        py80 py80Var = this.w;
        try {
            flush();
        } finally {
            py80Var.getClass();
        }
    }

    public final void d() {
        int i = this.y;
        py80 py80Var = this.w;
        MessageBuffer messageBuffer = py80Var.b;
        py80Var.a.write((byte[]) messageBuffer.a, ((int) messageBuffer.b) - MessageBuffer.h, i);
        this.x = null;
        this.y = 0;
    }

    public final void e(int i) {
        if (i < 32) {
            o((byte) (i | (-96)));
            return;
        }
        if (this.c && i < 256) {
            v((byte) -39, (byte) i);
        } else if (i < 65536) {
            B((byte) -38, (short) i);
        } else {
            w((byte) -37, i);
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.y > 0) {
            d();
        }
        this.w.getClass();
    }

    public final void k(String str) {
        if (str.length() <= 0) {
            e(0);
            return;
        }
        if (A || str.length() < this.a) {
            n(str);
            return;
        }
        if (str.length() < 256) {
            c((str.length() * 6) + 3);
            int a = a(this.y + 2, str);
            if (a >= 0) {
                if (this.c && a < 256) {
                    MessageBuffer messageBuffer = this.x;
                    int i = this.y;
                    this.y = i + 1;
                    messageBuffer.h((byte) -39, i);
                    MessageBuffer messageBuffer2 = this.x;
                    int i2 = this.y;
                    this.y = i2 + 1;
                    messageBuffer2.h((byte) a, i2);
                    this.y += a;
                    return;
                }
                if (a >= 65536) {
                    ny61.g("Unexpected UTF-8 encoder state");
                    return;
                }
                MessageBuffer messageBuffer3 = this.x;
                int i3 = this.y;
                messageBuffer3.k(i3 + 3, messageBuffer3, i3 + 2, a);
                MessageBuffer messageBuffer4 = this.x;
                int i4 = this.y;
                this.y = i4 + 1;
                messageBuffer4.h((byte) -38, i4);
                this.x.l(this.y, (short) a);
                this.y = this.y + 2 + a;
                return;
            }
        } else if (str.length() < 65536) {
            c((str.length() * 6) + 5);
            int a2 = a(this.y + 3, str);
            if (a2 >= 0) {
                if (a2 < 65536) {
                    MessageBuffer messageBuffer5 = this.x;
                    int i5 = this.y;
                    this.y = i5 + 1;
                    messageBuffer5.h((byte) -38, i5);
                    this.x.l(this.y, (short) a2);
                    this.y = this.y + 2 + a2;
                    return;
                }
                if (a2 >= 4294967296L) {
                    ny61.g("Unexpected UTF-8 encoder state");
                    return;
                }
                MessageBuffer messageBuffer6 = this.x;
                int i6 = this.y;
                messageBuffer6.k(i6 + 5, messageBuffer6, i6 + 3, a2);
                MessageBuffer messageBuffer7 = this.x;
                int i7 = this.y;
                this.y = i7 + 1;
                messageBuffer7.h((byte) -37, i7);
                this.x.j(this.y, a2);
                this.y = this.y + 4 + a2;
                return;
            }
        }
        n(str);
    }

    public final void n(String str) {
        byte[] bytes = str.getBytes(cv10.a);
        e(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.x;
        if (messageBuffer != null) {
            int i = messageBuffer.c;
            int i2 = this.y;
            if (i - i2 >= length && length <= this.b) {
                messageBuffer.i(i2, 0, length, bytes);
                this.y += length;
                return;
            }
        }
        flush();
        this.w.a.write(bytes, 0, length);
    }

    public final void o(byte b) {
        c(1);
        MessageBuffer messageBuffer = this.x;
        int i = this.y;
        this.y = i + 1;
        messageBuffer.h(b, i);
    }

    public final void v(byte b, byte b2) {
        c(2);
        MessageBuffer messageBuffer = this.x;
        int i = this.y;
        this.y = i + 1;
        messageBuffer.h(b, i);
        MessageBuffer messageBuffer2 = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        messageBuffer2.h(b2, i2);
    }

    public final void w(byte b, int i) {
        c(5);
        MessageBuffer messageBuffer = this.x;
        int i2 = this.y;
        this.y = i2 + 1;
        messageBuffer.h(b, i2);
        this.x.j(this.y, i);
        this.y += 4;
    }
}
