package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HttpExecutorInitializer.kt */
/* loaded from: classes.dex */
public final class hjv {
    public static n460 c;
    public static t260 g;
    public static s73 h;
    public static final hjv a = new hjv();
    public static final bpn0 b = new bpn0(new l03(4));
    public static final bpn0 d = new bpn0(new g58(1));
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final bpn0 f = new bpn0(new q03(6));

    public static String a() {
        UiTracker uiTracker = UiTracker.a;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null) {
            return UiTracker.d();
        }
        String name = uiTrackingScreen.a.name();
        SchemeStat$EventItem schemeStat$EventItem = uiTrackingScreen.f;
        String str = schemeStat$EventItem != null ? schemeStat$EventItem.a : null;
        if (str == null) {
            return name.toLowerCase(Locale.ROOT);
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((' ' > charAt || charAt >= 127) && charAt != '\t') {
                com.vk.metrics.eventtracking.b.a.q(new Throwable("Non ascii symbol in header"));
                return name;
            }
        }
        return v1v.a('/', name, str);
    }

    public static void b(boolean z) {
        s73 s73Var = h;
        if (s73Var == null) {
            return;
        }
        if (z) {
            if (epx.f(s73Var.c(), "vk.com")) {
                s73Var.e("vk.ru");
            }
            a0a.d = s73Var.c();
        } else {
            if (epx.f(s73Var.c(), "vk.ru")) {
                s73Var.e("vk.com");
            }
            a0a.d = s73Var.c();
        }
    }
}
