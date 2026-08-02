package xsna;

import android.os.SystemClock;
import com.vk.api.request.core.persistent.PersistentRequest;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PersistentRequestManager.kt */
/* loaded from: classes.dex */
public abstract class y0a0 {
    public final bpn0 a = new bpn0(new s3a(5));
    public long b;
    public a c;
    public final Object d;

    /* compiled from: PersistentRequestManager.kt */
    public interface a {
        public static final C4066a a = C4066a.a;

        /* compiled from: PersistentRequestManager.kt */
        /* renamed from: xsna.y0a0$a$a, reason: collision with other inner class name */
        public static final class C4066a {
            public static final /* synthetic */ C4066a a = new C4066a();
            public static final C4067a b = new C4067a();

            /* compiled from: PersistentRequestManager.kt */
            /* renamed from: xsna.y0a0$a$a$a, reason: collision with other inner class name */
            public static final class C4067a implements a {
                @Override // xsna.y0a0.a
                public final boolean b() {
                    return false;
                }
            }
        }

        default boolean b() {
            return false;
        }
    }

    public y0a0() {
        a.a.getClass();
        this.c = a.C4066a.b;
        this.d = new Object();
    }

    public final void a() {
        if (SystemClock.elapsedRealtime() - this.b < 10000) {
            SystemClock.elapsedRealtime();
        }
        this.b = SystemClock.elapsedRealtime();
        ((ScheduledExecutorService) this.a.getValue()).submit(new kv3(this, 14));
    }

    public abstract boolean b(PersistentRequest persistentRequest);

    public final void c() {
        Object obj;
        Object removeFirst;
        Object obj2 = null;
        try {
            obj = wmi0.a.e("persistent_request_queue").a();
        } catch (Throwable unused) {
            obj = null;
        }
        List list = (List) obj;
        PersistentRequest persistentRequest = (list == null || list.isEmpty()) ? null : (PersistentRequest) list.get(0);
        Objects.toString(persistentRequest);
        if (persistentRequest != null && this.c.b() && b(persistentRequest)) {
            try {
                obj2 = wmi0.a.e("persistent_request_queue").a();
            } catch (Throwable unused2) {
            }
            List list2 = (List) obj2;
            if (list2 != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(list2);
                removeFirst = linkedHashSet.removeFirst();
                wmi0.a.m("persistent_request_queue", j5g.O0(linkedHashSet));
                Objects.toString((PersistentRequest) removeFirst);
            }
            Thread.sleep(3000L);
            ((ScheduledExecutorService) this.a.getValue()).submit(new a72(this, 16));
        }
    }
}
