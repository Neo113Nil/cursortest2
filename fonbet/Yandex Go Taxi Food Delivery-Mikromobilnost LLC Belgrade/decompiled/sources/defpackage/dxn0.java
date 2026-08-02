package defpackage;

import android.app.Notification;
import android.os.SystemClock;
import androidx.core.app.e;
import com.yandex.go.analytics.b;
import com.yandex.go.scooters.live.ScootersLiveService;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes13.dex */
public final class dxn0 {
    public final /* synthetic */ ScootersLiveService a;

    public dxn0(ScootersLiveService scootersLiveService) {
        this.a = scootersLiveService;
    }

    public final void a(int i, Notification notification) {
        exn0 dependencies;
        ScootersLiveService scootersLiveService = this.a;
        dependencies = scootersLiveService.getDependencies();
        b r = ((zzf) dependencies).r();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        r.b("Scooters.Live.StartForeground", mapBuilder.j());
        e.m(scootersLiveService, 8844975, notification, i);
    }
}
