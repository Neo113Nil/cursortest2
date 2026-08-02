package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.yandex.go.scooters.ignition.analytics.a;
import com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1;
import defpackage.hbp0;
import defpackage.psn0;

/* loaded from: classes8.dex */
public final class psn0 {
    public final Context a;
    public final a b;
    public final vqn0 c;
    public final ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1 d = new ComponentCallbacks2() { // from class: com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            hbp0.e(psn0.this.c.a(), null, null, new ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1$onTrimMemory$1(psn0.this, level, null), 3);
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.go.scooters.ignition.data.ScootersIgnitionTechnicalAnalyticsTrimMemoryRepository$trimMemoryCallbacks$1] */
    public psn0(Context context, a aVar, vqn0 vqn0Var) {
        this.a = context;
        this.b = aVar;
        this.c = vqn0Var;
    }
}
