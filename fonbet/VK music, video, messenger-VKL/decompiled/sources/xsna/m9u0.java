package xsna;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VkAppDialogsScreenUiConfig.kt */
/* loaded from: classes.dex */
public final class m9u0 {
    public static final m9u0 a = new m9u0();

    @Nullable
    public static ThreadPoolExecutor b;
    public static ExecutorService c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress a(int i, int i2, String str) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i5 == 16) {
                return null;
            }
            int i8 = i4 + 2;
            if (i8 <= i2 && str.startsWith("::", i4)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                int i9 = 0;
                i4 = i7;
                while (i4 < i2) {
                }
                i3 = i4 - i7;
                return i3 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (str.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER, i4)) {
                    i4++;
                } else {
                    if (!str.startsWith(".", i4)) {
                        return null;
                    }
                    int i10 = i5 - 2;
                    int i11 = i10;
                    while (i7 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i12 = 0;
                        int i13 = i7;
                        while (i13 < i2) {
                            char charAt = str.charAt(i13);
                            if (epx.g(charAt, 48) < 0 || epx.g(charAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i7 != i13) || ((i12 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i7 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i7 = i13;
                    }
                    if (i11 != i5 + 2) {
                        return null;
                    }
                    i5 += 2;
                }
            }
            i7 = i4;
            int i92 = 0;
            i4 = i7;
            while (i4 < i2) {
                int q = x2r0.q(str.charAt(i4));
                if (q == -1) {
                    break;
                }
                i92 = (i92 << 4) + q;
                i4++;
            }
            i3 = i4 - i7;
            if (i3 == 0 && i3 <= 4) {
                int i14 = i5 + 1;
                bArr[i5] = (byte) (255 & (i92 >>> 8));
                i5 += 2;
                bArr[i14] = (byte) (i92 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i15 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final long b(long j, long j2, long j3, String str) {
        String str2;
        int i = crn0.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long n = arm0.n(str2);
        if (n == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = n.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder d = rqi.d(j2, "System property '", str, "' should be in range ");
        tj0.d(d, "..", j3, ", but is '");
        d.append(longValue);
        d.append('\'');
        throw new IllegalStateException(d.toString().toString());
    }

    public static int c(int i, int i2, String str) {
        return (int) b(i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final String d(String str) {
        int i = 0;
        int i2 = -1;
        if (!drm0.D(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (epx.g(charAt, 31) <= 0 || epx.g(charAt, 127) >= 0 || drm0.L(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress a2 = (brm0.B(str, X3.j.d, false) && brm0.v(str, X3.j.e, false)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (a2 == null) {
            return null;
        }
        byte[] address = a2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return a2.getHostAddress();
            }
            throw new AssertionError(air.b('\'', "Invalid IPv6 address: '", str));
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        vl8 vl8Var = new vl8();
        while (i < address.length) {
            if (i == i2) {
                vl8Var.I(58);
                i += i5;
                if (i == 16) {
                    vl8Var.I(58);
                }
            } else {
                if (i > 0) {
                    vl8Var.I(58);
                }
                byte b2 = address[i];
                byte[] bArr = x2r0.a;
                vl8Var.L(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return vl8Var.x();
    }

    public static ThreadPoolExecutor e() {
        if (b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new u501());
            b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return b;
    }
}
