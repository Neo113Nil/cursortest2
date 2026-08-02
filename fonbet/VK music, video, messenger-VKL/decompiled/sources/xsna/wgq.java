package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* compiled from: TlsState.java */
/* loaded from: classes8.dex */
public final class wgq {
    public static final Charset u = Charset.forName("ISO-8859-1");
    public static final String v = "tls13 ";
    public final MessageDigest a;
    public final m6o0 b;
    public final byte[] c;
    public final short d;
    public final short e;
    public boolean f;
    public PublicKey g;
    public PrivateKey h;
    public final byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public final g1t r;
    public byte[] s;
    public byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public wgq(g1t g1tVar, byte[] bArr, int i, int i2) {
        this.i = bArr;
        this.r = g1tVar;
        this.d = (short) i;
        int i3 = (short) i2;
        this.e = i3;
        int i4 = i3 << 3;
        String a = lhg.a(i4, "SHA-");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(a);
            this.a = messageDigest;
            this.b = new m6o0(new y6i(lhg.a(i4, "HmacSHA")));
            byte[] digest = messageDigest.digest(new byte[0]);
            this.c = digest;
            hdy0.a(digest);
            b(bArr == null ? new byte[i3] : bArr);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException(zr.a("Missing ", a, " support"));
        }
    }

    public final byte[] a(byte[] bArr, String str, byte[] bArr2, short s) {
        String str2 = v;
        int length = str2.length() + 3;
        Charset charset = u;
        ByteBuffer allocate = ByteBuffer.allocate(length + str.getBytes(charset).length + 1 + bArr2.length);
        allocate.putShort(s);
        allocate.put((byte) (str2.length() + str.getBytes().length));
        allocate.put(str2.getBytes(charset));
        allocate.put(str.getBytes(charset));
        allocate.put((byte) bArr2.length);
        allocate.put(bArr2);
        return this.b.g(bArr, allocate.array(), s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(byte[] bArr) {
        int i = this.e;
        byte[] f = this.b.f(new byte[i], bArr);
        this.j = f;
        hdy0.a(f);
        byte[] a = a(this.j, "res binder", this.c, i);
        this.k = a;
        hdy0.a(a);
    }
}
