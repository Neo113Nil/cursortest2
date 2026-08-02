package xsna;

import android.os.SystemClock;
import com.vk.metrics.eventtracking.Event;

/* compiled from: ImScreenCreateReporterImpl.kt */
/* loaded from: classes5.dex */
public final class ccw implements bcw {
    public static final ccw a = new ccw();
    public static long b;
    public static long c;

    @Override // xsna.bcw
    public final void a() {
        b = SystemClock.uptimeMillis();
    }

    @Override // xsna.bcw
    public final void b() {
        if (c == 0) {
            tv4.b("chat screen create was't called", com.vk.metrics.eventtracking.b.a);
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("vkm_chat_screen_open");
        b2.b("time", Long.valueOf(SystemClock.uptimeMillis() - c));
        b2.i("StatlogTracker");
        bVar.k(b2.e());
    }

    @Override // xsna.bcw
    public final void c() {
        c = SystemClock.uptimeMillis();
    }

    @Override // xsna.bcw
    public final void d() {
        if (b == 0) {
            tv4.b("dialogs screen create was't called", com.vk.metrics.eventtracking.b.a);
            return;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("vkm_dialogs_screen_open");
        b2.b("time", Long.valueOf(SystemClock.uptimeMillis() - b));
        b2.i("StatlogTracker");
        bVar.k(b2.e());
    }
}
