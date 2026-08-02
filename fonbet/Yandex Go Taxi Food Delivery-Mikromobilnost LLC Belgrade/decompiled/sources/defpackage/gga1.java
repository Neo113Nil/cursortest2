package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import com.yandex.mobile.ads.network.interceptor.b;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.random.Random;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public abstract class gga1 {
    public static final jzz a = new jzz();
    public static b b;

    public static final void a(int i, int i2) {
        if (i2 > i) {
            return;
        }
        vg10.q("Random range is empty: [", Integer.valueOf(i), Extension.FIX_SPACE, Integer.valueOf(i2), ").");
    }

    public static final void b(long j, long j2) {
        if (j2 > j) {
            return;
        }
        vg10.q("Random range is empty: [", Long.valueOf(j), Extension.FIX_SPACE, Long.valueOf(j2), ").");
    }

    public static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e) {
            Log.e("ExifInterfaceUtils", "Error closing fd.", e);
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void f(mlo mloVar, i77 i77Var, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = mloVar.read(bArr, 0, min);
            if (read != min) {
                ny61.v("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= read;
                i77Var.write(bArr, 0, read);
            }
        }
    }

    public static void g(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static final int h(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int i(d6w d6wVar, Random random) {
        if (d6wVar.isEmpty()) {
            kbs.f(d6wVar, "Cannot get random in empty range: ");
            return 0;
        }
        int i = d6wVar.b;
        int i2 = d6wVar.a;
        return i < Integer.MAX_VALUE ? random.f(i2, i + 1) : i2 > Integer.MIN_VALUE ? random.f(i2 - 1, i) + 1 : random.b();
    }

    public static final long j(imz imzVar, Random random) {
        if (imzVar.isEmpty()) {
            kbs.f(imzVar, "Cannot get random in empty range: ");
            return 0L;
        }
        long j = imzVar.b;
        long j2 = imzVar.a;
        return j < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? random.i(j2, j + 1) : j2 > Long.MIN_VALUE ? random.i(j2 - 1, j) + 1 : random.g();
    }

    public static boolean k(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final int l(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
