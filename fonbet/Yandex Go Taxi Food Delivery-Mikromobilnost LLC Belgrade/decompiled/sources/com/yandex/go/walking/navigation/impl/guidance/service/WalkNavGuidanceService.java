package com.yandex.go.walking.navigation.impl.guidance.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import androidx.core.app.v;
import defpackage.avj0;
import defpackage.b241;
import defpackage.ec31;
import defpackage.h6r;
import defpackage.i3y;
import defpackage.jst;
import defpackage.ky2;
import defpackage.kyh0;
import defpackage.l0b0;
import defpackage.pux0;
import defpackage.pw2;
import defpackage.v241;
import defpackage.w241;
import defpackage.wwg;
import defpackage.xk60;
import defpackage.y72;
import defpackage.zuj0;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/guidance/service/WalkNavGuidanceService;", "Landroid/app/Service;", "<init>", "()V", "", "startId", "Lzy11;", "safeStopSelf", "(I)V", "foregroundServiceType", "startForeground", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "fgsType", "onTimeout", "(II)V", "onDestroy", "Lw241;", "presenter$delegate", "Li3y;", "getPresenter", "()Lw241;", "presenter", "", "isSuccessfullyStarted", "Z", "Ljst;", "gol", "Ljst;", "Companion", "v241", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WalkNavGuidanceService extends Service {
    public static final int $stable = 8;
    private static final v241 Companion = new v241();
    private static final String LOG_TAG = "WALKING_NAVIGATION:GUIDANCE_SERVICE";
    private boolean isSuccessfullyStarted;

    /* renamed from: presenter$delegate, reason: from kotlin metadata */
    private final i3y presenter = kotlin.a.b(LazyThreadSafetyMode.NONE, new ec31(10, this));
    private final jst gol = jst.e.A(LOG_TAG).m(LOG_TAG);

    private final w241 getPresenter() {
        return (w241) this.presenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w241 presenter_delegate$lambda$0(WalkNavGuidanceService walkNavGuidanceService) {
        zzf zzfVar = (zzf) ((h6r) wwg.e(walkNavGuidanceService, h6r.class));
        return new w241((ky2) zzfVar.b0.get(), new b241(zzfVar.a, (zuj0) zzfVar.W.get(), (xk60) zzfVar.X.get(), (y72) zzfVar.R.get(), (pw2) zzfVar.K.get()), zzfVar.i1(), (com.yandex.go.walking.navigation.impl.navigation_core.guidance.b) zzfVar.ue.get());
    }

    private final void safeStopSelf(int startId) {
        this.gol.getClass();
        try {
            startForeground(1);
        } catch (Exception e) {
            this.gol.m("START_FOREGROUND_DATA_SYNC").k(e, "Fail to startForeground data sync service");
        } finally {
            stopSelf(startId);
        }
    }

    private final void startForeground(int foregroundServiceType) {
        b241 b241Var = getPresenter().b;
        xk60 xk60Var = b241Var.c;
        avj0 avj0Var = (avj0) b241Var.b;
        xk60Var.g("walking_navigator_low", 2, avj0Var.h(kyh0.notification_channel_navigator_low), null, false);
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.a = 172333;
        TaxiApplication taxiApplication = b241Var.a;
        Intent intent = new Intent(taxiApplication, (Class<?>) b241Var.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        Uri.Builder builder2 = new Uri.Builder();
        ((pux0) b241Var.e).getClass();
        PendingIntent activity = PendingIntent.getActivity(taxiApplication, 0, intent.setData(builder2.scheme(pux0.c).authority("walking_navigation").path("/guidance").build()).setAction("android.intent.action.VIEW").addFlags(SelfTester_JCP.IMITA), 201326592);
        v i = b241Var.c.i("", avj0Var.h(kyh0.walking_navigation_is_on), null, "walking_navigator_low", activity, 0L);
        i.h(8, true);
        i.h(2, true);
        i.h(16, false);
        i.n = false;
        i.x = Constants.KEY_SERVICE;
        i.A = 1;
        i.g(0);
        androidx.core.app.e.m(this, 172333, b241Var.c.l(builder, i), foregroundServiceType);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        getPresenter().a.m(WalkNavGuidanceService.class);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.gol.getClass();
        if (this.isSuccessfullyStarted) {
            this.gol.getClass();
            return 1;
        }
        l0b0 l0b0Var = getPresenter().c;
        if (!l0b0Var.a() && !l0b0Var.g()) {
            this.gol.getClass();
            safeStopSelf(startId);
            return 2;
        }
        try {
            startForeground(8);
            this.isSuccessfullyStarted = true;
            w241 presenter = getPresenter();
            boolean z = intent == null;
            presenter.a.k(WalkNavGuidanceService.class);
            if (z) {
                presenter.d.b();
            }
            return 1;
        } catch (Exception e) {
            this.gol.m("START_FOREGROUND_LOCATION").k(e, "Fail to startForeground location service");
            safeStopSelf(startId);
            return 2;
        }
    }

    public void onTimeout(int startId, int fgsType) {
        super.onTimeout(startId, fgsType);
        this.gol.m("ON_TIMEOUT").c("Data sync timed out");
        stopSelf();
    }
}
