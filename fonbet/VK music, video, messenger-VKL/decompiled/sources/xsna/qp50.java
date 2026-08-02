package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.my.target.common.MyTargetContentProvider;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import xsna.alq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qp50 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qp50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, String> unmodifiableMap;
        Map<String, String> map = null;
        switch (this.b) {
            case 0:
                MyTargetContentProvider myTargetContentProvider = (MyTargetContentProvider) this.c;
                int i = MyTargetContentProvider.c;
                myTargetContentProvider.getClass();
                try {
                    Context context = myTargetContentProvider.getContext();
                    Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.autoInitMode");
                    if (num == null || num.intValue() != 0) {
                        gu8.d("Start autoinitialization");
                        xr50.a(context);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    gu8.d("Autoinitialization failed - " + th.getMessage());
                    return;
                }
            case 1:
                j5o0 j5o0Var = (j5o0) this.c;
                j5o0Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long m = Preference.m(0L, "task_execution_metrics_prefs", "task_execution_metrics_send_time");
                boolean z = ((m > 0L ? 1 : (m == 0L ? 0 : -1)) == 0) || ((elapsedRealtime > m ? 1 : (elapsedRealtime == m ? 0 : -1)) < 0) || (((elapsedRealtime - m) > j5o0.c ? 1 : ((elapsedRealtime - m) == j5o0.c ? 0 : -1)) >= 0);
                if (z) {
                    Preference.F(elapsedRealtime, "task_execution_metrics_prefs", "task_execution_metrics_send_time");
                }
                if (z) {
                    for (i5o0 i5o0Var : j5o0Var.b.values()) {
                        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.PARALLEL_TASK_STATE.h(), null, i5o0Var.c, Integer.valueOf(i5o0Var.a), i5o0Var.d, Integer.valueOf(i5o0Var.b), i5o0Var.e, null, i5o0Var.f, null, BuildInfo.b, null, BuildInfo.c().i(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5502, 3, null);
                        l5m l5mVar = new l5m(null, null, 3);
                        l5mVar.g = schemeStat$TypeDevNullItem;
                        l5mVar.q();
                    }
                    return;
                }
                return;
            case 2:
                alq0.a aVar = (alq0.a) this.c;
                aVar.b.set(null);
                synchronized (aVar) {
                    if (aVar.a.isMarked()) {
                        zhy reference = aVar.a.getReference();
                        synchronized (reference) {
                            unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                        }
                        AtomicMarkableReference<zhy> atomicMarkableReference = aVar.a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                        map = unmodifiableMap;
                    }
                }
                if (map != null) {
                    alq0 alq0Var = alq0.this;
                    alq0Var.a.h(alq0Var.c, map, aVar.c);
                    return;
                }
                return;
            default:
                final jfz0 jfz0Var = (jfz0) this.c;
                Looper.prepare();
                Looper myLooper = Looper.myLooper();
                Objects.requireNonNull(myLooper);
                Handler handler = new Handler(myLooper);
                jfz0Var.g = handler;
                new saz0(handler, SmsRetrieverService.SMS_SAVE_STATE_TIMEOUT).c(new Runnable() { // from class: xsna.efz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jfz0 jfz0Var2 = jfz0.this;
                        jfz0Var2.b.a(System.currentTimeMillis());
                        jfz0Var2.c();
                        jfz0Var2.b(null);
                    }
                });
                Runnable runnable = new Runnable() { // from class: xsna.efz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jfz0 jfz0Var2 = jfz0.this;
                        jfz0Var2.b.a(System.currentTimeMillis());
                        jfz0Var2.c();
                        jfz0Var2.b(null);
                    }
                };
                Handler handler2 = jfz0Var.g;
                Objects.requireNonNull(handler2);
                handler2.post(runnable);
                Looper.loop();
                return;
        }
    }
}
