package xsna;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.bridgeimpl.PushBridgeType;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;

/* compiled from: GmsDefaultPushBridgeImpl.kt */
/* loaded from: classes.dex */
public final class w2u implements rmr0 {
    public final bpn0 b = new bpn0(new a68(5));
    public final int c = PushBridgeType.GOOGLE.h();

    @Override // xsna.rmr0
    public final void b() {
        ((g3u) this.b.getValue()).getClass();
        rhr.a(new b4r(6));
    }

    @Override // xsna.rmr0
    public final Pair<String, Long> c() {
        String str;
        ExecutionException e;
        tmv s;
        Task<String> task;
        ((g3u) this.b.getValue()).getClass();
        String str2 = "";
        try {
        } catch (ExecutionException e2) {
            str = "";
            e = e2;
        }
        if (!rhr.b(null)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"Fetching FCM registration token failed: FirebaseApp not initialized"});
            }
            return new Pair<>(str2, Long.valueOf(System.currentTimeMillis()));
        }
        FirebaseMessaging d = FirebaseMessaging.d();
        vir virVar = d.b;
        if (virVar != null) {
            task = virVar.c();
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            d.h.execute(new ajr(d, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        str = (String) Tasks.await(task);
        try {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{"Fetching FCM registration token success"});
            }
        } catch (ExecutionException e3) {
            e = e3;
            Throwable cause = e.getCause();
            if (cause != null) {
                if (com.vk.toggle.d.H() && (s = q6x.s()) != null) {
                    ((qtq) s).c(cause);
                }
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.w, new Object[]{"Fetching FCM registration token failed: " + cause + '!'});
                }
            }
            str2 = str;
            return new Pair<>(str2, Long.valueOf(System.currentTimeMillis()));
        }
        str2 = str;
        return new Pair<>(str2, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // xsna.rmr0
    public final String d() {
        ((g3u) this.b.getValue()).getClass();
        return "fcm";
    }

    @Override // xsna.rmr0
    public final boolean e() {
        return false;
    }

    @Override // xsna.rmr0
    public final int g() {
        return this.c;
    }

    @Override // xsna.rmr0
    public final void a() {
    }

    @Override // xsna.rmr0
    public final void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
    }
}
