package defpackage;

import android.os.SystemClock;
import com.yandex.go.analytics.b;
import com.yandex.go.scooters.live.domain.ScootersLiveServiceStarterLifecycleInteractor$onFirstContentfulPaint$$inlined$collectIn$1;
import com.yandex.go.scooters.live.domain.c;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes8.dex */
public final class fxn0 implements jy60 {
    public final tse a;
    public final b b;
    public final com.yandex.go.scooters.live.domain.b c;
    public final c d;

    public fxn0(tse tseVar, b bVar, com.yandex.go.scooters.live.domain.b bVar2, c cVar) {
        this.a = tseVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = cVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersLiveServiceStarterLifecycleInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("current_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        this.b.b("Scooters.Live.FcpListenActive", mapBuilder.j());
        tje.N(this.a, null, null, new ScootersLiveServiceStarterLifecycleInteractor$onFirstContentfulPaint$$inlined$collectIn$1(this.c.c(), null, this), 3);
    }
}
