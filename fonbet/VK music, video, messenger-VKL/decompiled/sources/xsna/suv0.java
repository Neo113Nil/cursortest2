package xsna;

import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.metrics.eventtracking.Event;

/* compiled from: VkTrackerDynamicLibListener.kt */
/* loaded from: classes11.dex */
public final class suv0 implements vpo {
    public static final suv0 a = new suv0();

    @Override // xsna.vpo
    public final void a(DynamicTask dynamicTask, int i, long j) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("DYNAMIC.RESULT.ERROR");
        b.c("name", dynamicTask.name());
        b.b("session_id", Integer.valueOf(i));
        b.b("duration", Long.valueOf(j));
        b.c("type", "error");
        b.i("FirebaseTracker");
        bVar.k(b.e());
    }

    @Override // xsna.vpo
    public final void b(DynamicTask dynamicTask, int i, long j) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("DYNAMIC.RESULT.CANCEL");
        b.c("name", dynamicTask.name());
        b.b("session_id", Integer.valueOf(i));
        b.b("duration", Long.valueOf(j));
        b.c("type", "cancel");
        b.i("FirebaseTracker");
        bVar.k(b.e());
    }

    @Override // xsna.vpo
    public final void c(DynamicTask dynamicTask, int i) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("DYNAMIC.START");
        b.c("name", dynamicTask.name());
        b.b("session_id", Integer.valueOf(i));
        b.i("FirebaseTracker");
        bVar.k(b.e());
    }

    @Override // xsna.vpo
    public final void d(DynamicTask dynamicTask, int i, long j) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("DYNAMIC.RESULT.SUCCESS");
        b.c("name", dynamicTask.name());
        b.b("session_id", Integer.valueOf(i));
        b.b("duration", Long.valueOf(j));
        b.c("type", "success");
        b.i("FirebaseTracker");
        bVar.k(b.e());
    }
}
