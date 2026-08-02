package xsna;

import android.os.SystemClock;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.superapp.api.core.WebPersistentRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: WebPersistentRequestManager.kt */
/* loaded from: classes11.dex */
public final class hhx0 {
    public static long c;
    public static final Object a = new Object();
    public static final bpn0 b = new bpn0(new rq6(20));
    public static a d = a.C2997a.a;

    /* compiled from: WebPersistentRequestManager.kt */
    public interface a {

        /* compiled from: WebPersistentRequestManager.kt */
        /* renamed from: xsna.hhx0$a$a, reason: collision with other inner class name */
        public static final class C2997a {
            public static final C2998a a = new C2998a();

            /* compiled from: WebPersistentRequestManager.kt */
            /* renamed from: xsna.hhx0$a$a$a, reason: collision with other inner class name */
            public static final class C2998a implements a {
                @Override // xsna.hhx0.a
                public final boolean b() {
                    return false;
                }
            }
        }

        boolean b();
    }

    public static void a() {
        if (SystemClock.elapsedRealtime() - c < 10000) {
            SystemClock.elapsedRealtime();
        }
        c = SystemClock.elapsedRealtime();
        ((ScheduledExecutorService) b.getValue()).submit(new Runnable() { // from class: xsna.ghx0
            @Override // java.lang.Runnable
            public final void run() {
                hhx0.b();
            }
        });
    }

    public static void b() {
        Object obj;
        Object obj2;
        Object obj3;
        JSONObject jSONObject;
        try {
            obj = wmi0.a.e("web_persistent_request_queue").a();
        } catch (Throwable unused) {
            obj = null;
        }
        List list = (List) obj;
        WebPersistentRequest webPersistentRequest = (list == null || list.isEmpty()) ? null : (WebPersistentRequest) list.get(0);
        Objects.toString(webPersistentRequest);
        if (webPersistentRequest == null || !d.b()) {
            return;
        }
        rdx0<JSONObject> Ab = webPersistentRequest.Ab();
        try {
            try {
                obj2 = new io.reactivex.rxjava3.internal.operators.observable.q(new ox2(Ab.b, Ab, dgn0.c(), Ab, new sdx0())).a();
            } catch (Throwable unused2) {
                return;
            }
        } catch (Exception unused3) {
            obj2 = null;
        }
        try {
            jSONObject = (JSONObject) obj2;
        } catch (VKApiExecutionException e) {
            int s = e.s();
            if (s == 1 || s == 6 || s == 10 || s <= 0) {
                return;
            }
        }
        if (jSONObject == null) {
            throw new IOException();
        }
        jSONObject.toString();
        if (webPersistentRequest.zb() != null) {
            try {
                webPersistentRequest.zb().invoke(null, jSONObject);
                Objects.toString(webPersistentRequest.zb());
            } catch (Throwable th) {
                String str = "Callback (" + webPersistentRequest.zb() + ") call fail";
                xgx0.a.getClass();
                xgx0.c(str, th);
                xgx0.d(th);
            }
        }
        try {
            obj3 = wmi0.a.e("web_persistent_request_queue").a();
        } catch (Throwable unused4) {
            obj3 = null;
        }
        List list2 = (List) obj3;
        LinkedHashSet linkedHashSet = list2 != null ? new LinkedHashSet(list2) : null;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                linkedHashSet.remove((WebPersistentRequest) it.next());
                wmi0.a.m("web_persistent_request_queue", j5g.O0(linkedHashSet));
            }
        }
        Thread.sleep(3000L);
        ((ScheduledExecutorService) b.getValue()).submit(new qk90(1));
    }
}
