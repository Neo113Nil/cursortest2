package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.X3;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.ImageSizeKey;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import okhttp3.k;
import okhttp3.t;
import okhttp3.v;
import okio.ByteString;
import ru.ok.android.commons.http.Http;
import xsna.zt80;

/* compiled from: Util.kt */
/* loaded from: classes11.dex */
public final class x2r0 {
    public static final byte[] a;
    public static final okhttp3.k b = k.b.d(new String[0]);
    public static final okhttp3.w c;
    public static final okhttp3.s d;
    public static final zt80 e;
    public static final TimeZone f;
    public static final Regex g;
    public static final String h;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        okhttp3.v.Companion.getClass();
        c = v.b.b(bArr, null);
        d = t.a.d(okhttp3.t.Companion, bArr, null, 0, 7);
        e = zt80.a.b(ByteString.a.a("efbbbf"), ByteString.a.a("feff"), ByteString.a.a("fffe"), ByteString.a.a("0000ffff"), ByteString.a.a("ffff0000"));
        f = TimeZone.getTimeZone("GMT");
        g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = drm0.W(drm0.U(okhttp3.o.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(okhttp3.l lVar, okhttp3.l lVar2) {
        return epx.f(lVar.d, lVar2.d) && lVar.e == lVar2.e && epx.f(lVar.a, lVar2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!epx.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (drm0.E(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(char c2, int i, int i2, int i3, String str) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(str, i, i2, c2);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int i2 = 0;
                while (true) {
                    if (i2 < strArr2.length) {
                        int i3 = i2 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i2]) == 0) {
                                return true;
                            }
                            i2 = i3;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(okhttp3.u uVar) {
        String a2 = uVar.s().a(Http.Header.CONTENT_LENGTH);
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(e43.l(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (epx.g(charAt, 31) <= 0 || epx.g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] o(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        return str.equalsIgnoreCase(Http.Header.AUTHORIZATION) || str.equalsIgnoreCase(Http.Header.COOKIE) || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase(Http.Header.SET_COOKIE);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - ImageSizeKey.SIZE_KEY_UNDEFINED;
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(bn8 bn8Var, Charset charset) throws IOException {
        int F3 = bn8Var.F3(e);
        if (F3 == -1) {
            return charset;
        }
        if (F3 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (F3 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (F3 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (F3 == 3) {
            emb.a.getClass();
            Charset charset2 = emb.f;
            if (charset2 != null) {
                return charset2;
            }
            Charset forName = Charset.forName("UTF-32BE");
            emb.f = forName;
            return forName;
        }
        if (F3 != 4) {
            throw new AssertionError();
        }
        emb.a.getClass();
        Charset charset3 = emb.e;
        if (charset3 != null) {
            return charset3;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        emb.e = forName2;
        return forName2;
    }

    public static final int s(bn8 bn8Var) throws IOException {
        return (bn8Var.readByte() & 255) | ((bn8Var.readByte() & 255) << 16) | ((bn8Var.readByte() & 255) << 8);
    }

    public static final boolean t(agk0 agk0Var, int i) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        long c2 = agk0Var.timeout().e() ? agk0Var.timeout().c() - nanoTime : Long.MAX_VALUE;
        agk0Var.timeout().d(Math.min(c2, timeUnit.toNanos(i)) + nanoTime);
        try {
            vl8 vl8Var = new vl8();
            while (agk0Var.read(vl8Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                vl8Var.m();
            }
            if (c2 == Long.MAX_VALUE) {
                agk0Var.timeout().a();
                return true;
            }
            agk0Var.timeout().d(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                agk0Var.timeout().a();
                return false;
            }
            agk0Var.timeout().d(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                agk0Var.timeout().a();
            } else {
                agk0Var.timeout().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final okhttp3.k u(List<wvu> list) {
        k.a aVar = new k.a();
        for (wvu wvuVar : list) {
            aVar.d(wvuVar.a().A(), wvuVar.b().A());
        }
        return aVar.e();
    }

    public static final String v(okhttp3.l lVar, boolean z) {
        int i = lVar.e;
        String str = lVar.d;
        if (drm0.D(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = air.b(']', X3.j.d, str);
        }
        if (!z) {
            String str2 = lVar.a;
            if (i == (str2.equals("http") ? 80 : str2.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final <T> List<T> w(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int x(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(int i, int i2, String str) {
        int m = m(i, i2, str);
        return str.substring(m, n(m, i2, str));
    }
}
