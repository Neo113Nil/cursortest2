package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* loaded from: classes9.dex */
public final class b {
    private static final Map<InterfaceC2413b, a> a = new WeakHashMap();

    public static final class a {
        final long[] a;

        private a() {
            this.a = new long[9];
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC2413b {
    }

    public static <T extends Ad> long a(InterfaceC2413b interfaceC2413b, long j) {
        if (j == -1) {
            return -1L;
        }
        return j - j(interfaceC2413b).a[4];
    }

    public static <T extends Ad> void b(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 1);
    }

    public static <T extends Ad> void c(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 2);
    }

    public static <T extends Ad> void d(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 3);
    }

    public static <T extends Ad> void e(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 4);
    }

    public static <T extends Ad> void f(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 5);
    }

    public static <T extends Ad> void g(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 6);
    }

    public static <T extends Ad> void h(InterfaceC2413b interfaceC2413b) {
        a.remove(interfaceC2413b);
    }

    public static <T extends Ad> long i(InterfaceC2413b interfaceC2413b) {
        long[] jArr = j(interfaceC2413b).a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC2413b interfaceC2413b) {
        Map<InterfaceC2413b, a> map = a;
        a aVar = map.get(interfaceC2413b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC2413b, aVar2);
        return aVar2;
    }

    public static <T extends Ad> void a(InterfaceC2413b interfaceC2413b) {
        a(interfaceC2413b, 0);
    }

    private static <T extends Ad> void a(InterfaceC2413b interfaceC2413b, int i) {
        j(interfaceC2413b).a[i] = SystemClock.elapsedRealtime();
    }
}
