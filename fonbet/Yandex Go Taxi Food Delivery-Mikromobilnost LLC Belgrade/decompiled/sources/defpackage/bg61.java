package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class bg61 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final String b = evu0.S("Client", evu0.Q("okhttp3.", OkHttpClient.class.getName()));

    public static final boolean a(kwu kwuVar, kwu kwuVar2) {
        return jl40.l(kwuVar.d, kwuVar2.d) && kwuVar.e == kwuVar2.e && jl40.l(kwuVar.a, kwuVar2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            xfo.g("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            w511.f("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        w511.f("timeout".concat(" too small"));
        return 0;
    }

    public static final int c(long j) {
        o430 o430Var = e3n.b;
        if (j < 0) {
            xfo.g("duration".concat(" < 0"));
            return 0;
        }
        long e = e3n.e(j);
        if (e > 2147483647L) {
            w511.f("duration".concat(" too large"));
            return 0;
        }
        if (e != 0 || !e3n.j(j)) {
            return (int) e;
        }
        w511.f("duration".concat(" too small"));
        return 0;
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!jl40.l(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String e(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long f(kvj0 kvj0Var) {
        String a2 = kvj0Var.y.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = yf61.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset g(qq6 qq6Var, Charset charset) {
        int h0 = qq6Var.h0(yf61.b);
        if (h0 == -1) {
            return charset;
        }
        if (h0 == 0) {
            return uza.a;
        }
        if (h0 == 1) {
            return uza.b;
        }
        if (h0 == 2) {
            Charset charset2 = uza.a;
            Charset charset3 = uza.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            uza.f = forName;
            return forName;
        }
        if (h0 == 3) {
            return uza.c;
        }
        if (h0 != 4) {
            ny61.w();
            return null;
        }
        Charset charset4 = uza.a;
        Charset charset5 = uza.g;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        uza.g = forName2;
        return forName2;
    }

    public static final boolean h(y9t0 y9t0Var, int i) {
        long nanoTime = System.nanoTime();
        long c = y9t0Var.timeout().e() ? y9t0Var.timeout().c() - nanoTime : Long.MAX_VALUE;
        y9t0Var.timeout().d(Math.min(c, TimeUnit.MILLISECONDS.toNanos(i)) + nanoTime);
        try {
            yp6 yp6Var = new yp6();
            while (y9t0Var.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                yp6Var.clear();
            }
            if (c == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                y9t0Var.timeout().a();
                return true;
            }
            y9t0Var.timeout().d(nanoTime + c);
            return true;
        } catch (InterruptedIOException unused) {
            if (c == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                y9t0Var.timeout().a();
                return false;
            }
            y9t0Var.timeout().d(nanoTime + c);
            return false;
        } catch (Throwable th) {
            if (c == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                y9t0Var.timeout().a();
            } else {
                y9t0Var.timeout().d(nanoTime + c);
            }
            throw th;
        }
    }

    public static final meu i(List list) {
        keu keuVar = new keu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y8u y8uVar = (y8u) it.next();
            ooc.h(keuVar, y8uVar.a.w(), y8uVar.b.w());
        }
        return keuVar.d();
    }

    public static final String j(kwu kwuVar, boolean z) {
        int i = kwuVar.e;
        String str = kwuVar.d;
        if (evu0.y(str, ":", false)) {
            str = unr0.l(']', "[", str);
        }
        if (!z) {
            String str2 = kwuVar.a;
            if (i == (str2.equals("http") ? 80 : str2.equals(Constants.SCHEME) ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List k(List list) {
        return list.isEmpty() ? EmptyList.a : list.size() == 1 ? Collections.singletonList(list.get(0)) : Collections.unmodifiableList(Arrays.asList(list.toArray()));
    }

    public static final List l(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? EmptyList.a : objArr.length == 1 ? Collections.singletonList(objArr[0]) : Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }
}
