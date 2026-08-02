package com.yandex.go.scooters.live;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.lifecycle.y;
import com.yandex.go.scooters.live.ScootersLiveService;
import com.yandex.go.scooters.live.notification.d;
import defpackage.axn0;
import defpackage.bxn0;
import defpackage.dxn0;
import defpackage.eja1;
import defpackage.exn0;
import defpackage.i3y;
import defpackage.k7x0;
import defpackage.ky2;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.qxm0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wwg;
import defpackage.x4o0;
import defpackage.y72;
import defpackage.zuj0;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.scooters.utils.timers.h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/scooters/live/ScootersLiveService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lzy11;", "onCreate", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Lexn0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lexn0;", "dependencies", "Lbxn0;", "scootersLivePresenter$delegate", "getScootersLivePresenter", "()Lbxn0;", "scootersLivePresenter", "dxn0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersLiveService extends Service {
    public static final int $stable = 8;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: scootersLivePresenter$delegate, reason: from kotlin metadata */
    private final i3y scootersLivePresenter;

    public ScootersLiveService() {
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: cxn0
            public final /* synthetic */ ScootersLiveService b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                exn0 dependencies_delegate$lambda$0;
                bxn0 scootersLivePresenter_delegate$lambda$0;
                int i2 = i;
                ScootersLiveService scootersLiveService = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = ScootersLiveService.dependencies_delegate$lambda$0(scootersLiveService);
                        return dependencies_delegate$lambda$0;
                    default:
                        scootersLivePresenter_delegate$lambda$0 = ScootersLiveService.scootersLivePresenter_delegate$lambda$0(scootersLiveService);
                        return scootersLivePresenter_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.scootersLivePresenter = kotlin.a.a(new sls(this) { // from class: cxn0
            public final /* synthetic */ ScootersLiveService b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                exn0 dependencies_delegate$lambda$0;
                bxn0 scootersLivePresenter_delegate$lambda$0;
                int i22 = i2;
                ScootersLiveService scootersLiveService = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ScootersLiveService.dependencies_delegate$lambda$0(scootersLiveService);
                        return dependencies_delegate$lambda$0;
                    default:
                        scootersLivePresenter_delegate$lambda$0 = ScootersLiveService.scootersLivePresenter_delegate$lambda$0(scootersLiveService);
                        return scootersLivePresenter_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final exn0 dependencies_delegate$lambda$0(ScootersLiveService scootersLiveService) {
        return (exn0) wwg.e(scootersLiveService, exn0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final exn0 getDependencies() {
        return (exn0) this.dependencies.getValue();
    }

    private final bxn0 getScootersLivePresenter() {
        return (bxn0) this.scootersLivePresenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bxn0 scootersLivePresenter_delegate$lambda$0(ScootersLiveService scootersLiveService) {
        zzf zzfVar = (zzf) scootersLiveService.getDependencies();
        zzfVar.getClass();
        return new bxn0(eja1.s(y.A), (com.yandex.go.analytics.b) zzfVar.i3.get(), (qxm0) zzfVar.Cg.get(), (ky2) zzfVar.b0.get(), zzfVar.i1(), new com.yandex.go.scooters.live.notification.a(zzfVar.a, (tt2) zzfVar.n.get(), (q) zzfVar.M1.get(), (y72) zzfVar.R.get(), zzfVar.q1()), zzfVar.p1(), new axn0((com.yandex.go.analytics.b) zzfVar.i3.get(), (h) zzfVar.Kg.get(), new d((pav) zzfVar.p3.get(), (com.yandex.go.analytics.b) zzfVar.i3.get(), (zuj0) zzfVar.W.get(), (k7x0) zzfVar.M3.get()), (g) zzfVar.gb.get(), (x4o0) zzfVar.Ig.get()));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.yandex.go.analytics.b r = ((zzf) getDependencies()).r();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        r.b("Scooters.Live.ServiceOnCreate", mapBuilder.j());
        bxn0 scootersLivePresenter = getScootersLivePresenter();
        scootersLivePresenter.j = new dxn0(this);
        scootersLivePresenter.d.k(ScootersLiveService.class);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.yandex.go.analytics.b r = ((zzf) getDependencies()).r();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        r.b("Scooters.Live.ServiceOnDestroy", mapBuilder.j());
        bxn0 scootersLivePresenter = getScootersLivePresenter();
        scootersLivePresenter.f.e.c.i.a(8844975, null);
        scootersLivePresenter.j = null;
        pzt0 pzt0Var = scootersLivePresenter.i;
        if (pzt0Var != null) {
            scootersLivePresenter.i = null;
            pzt0Var.a(null);
        }
        scootersLivePresenter.d.m(ScootersLiveService.class);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        com.yandex.go.analytics.b r = ((zzf) getDependencies()).r();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        r.b("Scooters.Live.ServiceOnStartCommand", mapBuilder.j());
        bxn0 scootersLivePresenter = getScootersLivePresenter();
        com.yandex.go.analytics.b bVar = scootersLivePresenter.b;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        pzt0 pzt0Var = scootersLivePresenter.i;
        boolean z = false;
        if (pzt0Var != null && pzt0Var.isActive()) {
            z = true;
        }
        mapBuilder2.put("job_is_active", Boolean.valueOf(z));
        bVar.b("Scooters.Live.PresenterOnStartCommand", mapBuilder2.j());
        pzt0 pzt0Var2 = scootersLivePresenter.i;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        scootersLivePresenter.i = tje.N(scootersLivePresenter.a, null, null, new ScootersLivePresenter$onStartCommand$2(scootersLivePresenter, null), 3);
        return 2;
    }
}
