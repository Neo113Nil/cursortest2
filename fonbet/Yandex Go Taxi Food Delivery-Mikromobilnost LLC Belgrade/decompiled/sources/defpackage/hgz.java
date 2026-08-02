package defpackage;

import android.util.Log;
import com.yandex.pulse.metrics.NetworkChangeDetector;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class hgz implements f8x, Decoder {
    public static final Object b = new Object();
    public static volatile hgz c;
    public final int a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r3 != 9) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hgz(boolean z, int i, int i2) {
        int i3;
        int i4 = 6;
        if (z) {
            NetworkChangeDetector.Companion.getClass();
            if (i != 0) {
                i3 = 1;
                if (i != 1) {
                    if (i != 6) {
                        if (i == 7) {
                            i4 = 7;
                        }
                    }
                    i3 = 5;
                } else {
                    i3 = 2;
                }
                i4 = i3;
            } else {
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i3 = 3;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i3 = 4;
                        break;
                    case 13:
                        i3 = 5;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                i4 = i3;
            }
        }
        this.a = i4;
    }

    public static hgz g() {
        hgz hgzVar;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new hgz(3);
                }
                hgzVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hgzVar;
    }

    public static void k() {
        throw new SerializationException("ProcessedEnumDecoder does not support decode instance");
    }

    public static String o(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean D() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte F() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.sjd
    public kf5 a() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public sjd b(SerialDescriptor serialDescriptor) {
        k();
        throw null;
    }

    @Override // defpackage.f8x
    public long c(long j) {
        int i = this.a;
        if (i == 0) {
            return j;
        }
        double d = i;
        return xz91.c(new evc(new e3n(e3n.l((100.0d - d) / 100.0d, j)), new e3n(e3n.l((d + 100.0d) / 100.0d, j))));
    }

    public void e(String str, String str2) {
        if (this.a <= 6) {
            Log.e(str, str2);
        }
    }

    public void f(String str, String str2, Throwable th) {
        if (this.a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void h(String str, String str2) {
        if (this.a <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void i() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long j() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short l() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double m() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char n() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String p() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int q(SerialDescriptor serialDescriptor) {
        return this.a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int u() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder w(SerialDescriptor serialDescriptor) {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float x() {
        k();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean z() {
        k();
        throw null;
    }

    public /* synthetic */ hgz(int i) {
        this.a = i;
    }
}
