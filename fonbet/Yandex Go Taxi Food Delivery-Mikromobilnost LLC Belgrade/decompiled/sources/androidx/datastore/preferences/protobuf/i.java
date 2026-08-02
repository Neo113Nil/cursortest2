package androidx.datastore.preferences.protobuf;

import defpackage.a421;
import defpackage.au50;
import defpackage.l77;
import defpackage.tom0;
import defpackage.tqw;
import defpackage.xt10;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class i extends l77 {
    public static final Logger b = Logger.getLogger(i.class.getName());
    public static final boolean c = a421.e;
    public au50 a;

    public static int b(int i, ByteString byteString) {
        int d = d(i);
        int size = byteString.size();
        return e(size) + size + d;
    }

    public static int c(String str) {
        int length;
        try {
            length = u.a(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(tqw.a).length;
        }
        return e(length) + length;
    }

    public static int d(int i) {
        return e(i << 3);
    }

    public static int e(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int f(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A(int i);

    public abstract void B(int i, long j);

    public abstract void C(long j);

    public final void g(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(tqw.a);
        try {
            A(bytes.length);
            a(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public abstract void h(byte b2);

    public abstract void i(int i, boolean z);

    public abstract void j(int i, byte[] bArr);

    public abstract void k(int i, ByteString byteString);

    public abstract void l(ByteString byteString);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, long j);

    public abstract void p(long j);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, xt10 xt10Var, tom0 tom0Var);

    public abstract void t(xt10 xt10Var);

    public abstract void u(int i, xt10 xt10Var);

    public abstract void v(int i, ByteString byteString);

    public abstract void w(int i, String str);

    public abstract void x(String str);

    public abstract void y(int i, int i2);

    public abstract void z(int i, int i2);
}
