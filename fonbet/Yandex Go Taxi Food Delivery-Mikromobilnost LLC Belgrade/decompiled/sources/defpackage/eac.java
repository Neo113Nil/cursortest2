package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.f;
import com.google.protobuf.g;
import com.google.protobuf.i;
import java.io.InputStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class eac {
    public int a;
    public int b;
    public i c;

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static eac f(InputStream inputStream) {
        if (inputStream != null) {
            return new g(inputStream);
        }
        byte[] bArr = rqw.b;
        return g(bArr, 0, bArr.length, false);
    }

    public static f g(byte[] bArr, int i, int i2, boolean z) {
        f fVar = new f(bArr, i, i2, z);
        try {
            fVar.i(i2);
            return fVar;
        } catch (InvalidProtocolBufferException e) {
            yci0.r(e);
            return null;
        }
    }

    public static int s(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & HProv.PP_VERSION_TIMESTAMP;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.m();
            }
            i2 |= (read & HProv.PP_VERSION_TIMESTAMP) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.h();
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public final void D() {
        int z;
        do {
            z = z();
            if (z == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i2 + 1;
            this.b--;
        } while (C(z));
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
