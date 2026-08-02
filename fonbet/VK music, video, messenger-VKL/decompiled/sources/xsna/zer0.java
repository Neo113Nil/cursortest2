package xsna;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import com.vk.pushes.PushComponent;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.vkontakte.android.data.b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import receivers.TimeSyncRequestedReceiver;
import xsna.ext;
import xsna.fre0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zer0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zer0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ext.b bVar = (ext.b) this.d;
                boolean z = this.c;
                L.p(">>> update session");
                l7m f = m7m.f(new afr0());
                ((PushComponent) j6i.b(f, PushComponent.class)).sc().h(z, false, null);
                j6i.a().c();
                CacheComponent cacheComponent = (CacheComponent) j6i.b(f, CacheComponent.class);
                r8u0 r8u0Var = new r8u0();
                gx8 yc = cacheComponent.yc();
                if (c7r0.h.compareAndSet(false, true)) {
                    itg0.i(6, wmi0.a.e("animated_stickers_list_v21"), null, new yml0(6), null);
                }
                yc.c(r8u0Var);
                if (!TextUtils.isEmpty(bVar.c)) {
                    pro0.e(new bfr0(bVar));
                }
                if (z) {
                    MenuApiApplicationsCache.b.h();
                }
                b.d dVar = new b.d("app_launch_theme");
                dVar.b(dhr0.C().d, "value");
                dVar.e();
                Context context = e43.a;
                ro roVar = qni0.r;
                if (roVar != null) {
                    roVar.k("startAutoSync()");
                }
                qni0 qni0Var = qni0.a;
                qni0Var.getClass();
                qni0.d(context);
                ro roVar2 = qni0.r;
                if (roVar2 != null) {
                    roVar2.k("stopAutoSync()");
                }
                AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                qni0Var.getClass();
                alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) TimeSyncRequestedReceiver.class), 33554432));
                qni0.s = false;
                AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) TimeSyncRequestedReceiver.class), 33554432);
                ro roVar3 = qni0.r;
                if (roVar3 != null) {
                    roVar3.k("scheduling sync");
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = qni0.c;
                alarmManager2.setInexactRepeating(3, elapsedRealtime + j, j, broadcast);
                qni0.s = true;
                yb00 yb00Var = xkg.c;
                yb00Var.getClass();
                io.reactivex.rxjava3.internal.operators.single.i0 t = io.reactivex.rxjava3.core.x.t(1000L, TimeUnit.MILLISECONDS);
                xn xnVar = new xn(new xgv(yb00Var, 8), 27);
                int i = kwg0.a;
                t.subscribe(xnVar, new iwg0());
                pc0.c(false);
                if (z) {
                    com.vk.ml.b bVar2 = MLFeatures.a;
                    bVar2.f.incrementAndGet();
                    bVar2.c = false;
                    yb00Var.b = false;
                }
                List<fre0.a> list = rau0.d;
                fre0 fre0Var = fre0.b;
                if (o25.a().b()) {
                    fre0 fre0Var2 = fre0.b;
                    if (!BuildInfo.t() && !BuildInfo.g()) {
                        synchronized (fre0Var2) {
                            fre0.a(list);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
                fxc0.B().s().init();
                xx1.F();
                L.p("<<< update session");
                return;
            default:
                udz0 udz0Var = (udz0) this.d;
                boolean z2 = this.c;
                if (udz0Var.i == 0) {
                    udz0Var.i = z2 ? 1 : 2;
                    return;
                }
                return;
        }
    }
}
