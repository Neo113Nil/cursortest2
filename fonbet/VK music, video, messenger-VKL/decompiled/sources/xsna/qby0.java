package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bI;

/* compiled from: BaseAeadImpl.java */
/* loaded from: classes8.dex */
public abstract class qby0 implements nby0 {
    public static final Charset q = Charset.forName("ISO-8859-1");
    public final bI a;
    public final kgy0 b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public Cipher j;
    public SecretKeySpec k;
    public SecretKeySpec l;
    public Cipher m;
    public int n = 0;
    public boolean o = false;
    public volatile qby0 p;

    public qby0(kgy0 kgy0Var, bI bIVar, sp spVar) {
        this.a = bIVar;
        this.b = kgy0Var;
    }

    public final synchronized void c(boolean z) {
        try {
            byte[] f = f(this.c, (this.b.b() ? "quicv2 " : "quic ").concat("ku"), i());
            this.d = f;
            e(f, false, z);
            if (z) {
                this.c = this.d;
                this.n++;
                this.d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(byte[] bArr) {
        this.c = bArr;
        e(bArr, true, true);
    }

    public final void e(byte[] bArr, boolean z, boolean z2) {
        String str = this.b.b() ? "quicv2 " : "quic ";
        byte[] f = f(bArr, str.concat("key"), h());
        if (z2) {
            this.e = f;
            this.k = null;
        } else {
            this.f = f;
            this.l = null;
        }
        bI bIVar = this.a;
        Objects.toString(bIVar);
        byte[] f2 = f(bArr, str.concat("iv"), (short) 12);
        if (z2) {
            this.g = f2;
        } else {
            this.h = f2;
        }
        Objects.toString(bIVar);
        if (z) {
            this.i = f(bArr, str.concat("hp"), h());
            Objects.toString(bIVar);
        }
    }

    public final byte[] f(byte[] bArr, String str, short s) {
        Charset charset = q;
        byte[] bytes = "tls13 ".getBytes(charset);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 3 + str.getBytes(charset).length + 1 + "".getBytes(charset).length);
        allocate.putShort(s);
        allocate.put((byte) (bytes.length + str.getBytes().length));
        allocate.put(bytes);
        allocate.put(str.getBytes(charset));
        allocate.put((byte) "".getBytes(charset).length);
        allocate.put("".getBytes(charset));
        return j().g(bArr, allocate.array(), s);
    }

    public final synchronized void g() {
        if (this.o) {
            this.c = this.d;
            this.e = this.f;
            this.k = null;
            this.g = this.h;
            this.n++;
            this.d = null;
            this.o = false;
            this.f = null;
            this.h = null;
            if (this.p.n < this.n) {
                this.p.c(true);
            }
        }
    }

    public abstract short h();

    public abstract short i();

    public abstract m6o0 j();

    public qby0(kgy0 kgy0Var, byte[] bArr, bI bIVar, sp spVar) {
        this.a = bIVar;
        this.b = kgy0Var;
        byte[] f = f(bArr, bIVar == bI.a ? "client in" : "server in", i());
        Objects.toString(bIVar);
        e(f, true, true);
    }
}
