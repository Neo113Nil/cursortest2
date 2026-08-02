package com.yandex.go.navigator.notifications;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.core.app.e;
import defpackage.ab50;
import defpackage.af50;
import defpackage.ej60;
import defpackage.h6r;
import defpackage.jgu0;
import defpackage.ky2;
import defpackage.ld50;
import defpackage.md50;
import defpackage.r8h;
import defpackage.tje;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/navigator/notifications/NavigatorService;", "Landroid/app/Service;", "Lab50;", "<init>", "()V", "Laf50;", "presenter", "()Laf50;", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lzy11;", "onCreate", "onDestroy", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lld50;", "notification", "", "withLocation", "startForeground", "(Lld50;Z)V", "Laf50;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorService extends Service implements ab50 {
    public static final int $stable = 8;
    private af50 presenter;

    private final af50 presenter() {
        af50 af50Var = this.presenter;
        if (af50Var != null) {
            return af50Var;
        }
        zzf zzfVar = (zzf) ((h6r) wwg.e(this, h6r.class));
        af50 af50Var2 = new af50((r8h) zzfVar.s.get(), (md50) zzfVar.yg.get(), (ky2) zzfVar.b0.get(), (ej60) zzfVar.Hd.get(), zzfVar.i1(), (jgu0) zzfVar.zg.get());
        this.presenter = af50Var2;
        return af50Var2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        af50 presenter = presenter();
        presenter.Bg(this);
        presenter.x.getClass();
        presenter.D = SystemClock.uptimeMillis();
        tje.N(presenter.Jg(), null, null, new NavigatorServicePresenter$attachView$$inlined$safeCollectIn$1(presenter.C.b, null, presenter), 3);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        af50 af50Var = this.presenter;
        if (af50Var != null) {
            af50Var.Cg();
        }
        this.presenter = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        presenter().resume();
        return 1;
    }

    @Override // defpackage.ab50
    public void startForeground(ld50 notification, boolean withLocation) {
        int i = withLocation ? 8 : 1;
        notification.getClass();
        e.m(this, 172332, notification.a, i);
    }
}
