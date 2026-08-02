package defpackage;

import android.app.Application;
import com.yandex.mapkit.mapview.MapTexture;
import com.yandex.mobile.drive.sdk.map.GlTextureHandler$lifecycleDelegate$1;
import com.yandex.mobile.drive.tools.MainActivityStartedCallbacks;

/* loaded from: classes15.dex */
public final class lht implements lbp0 {
    public final MapTexture a;
    public final GlTextureHandler$lifecycleDelegate$1 b;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.mobile.drive.sdk.map.GlTextureHandler$lifecycleDelegate$1] */
    public lht(Application application, MapTexture mapTexture) {
        this.a = mapTexture;
        this.b = new MainActivityStartedCallbacks(application) { // from class: com.yandex.mobile.drive.sdk.map.GlTextureHandler$lifecycleDelegate$1
            @Override // com.yandex.mobile.drive.tools.MainActivityStartedCallbacks
            public void onActivityStarted() {
                this.a.onStart();
            }

            @Override // com.yandex.mobile.drive.tools.MainActivityStartedCallbacks
            public void onActivityStopped() {
                this.a.onStop();
            }
        };
    }

    @Override // defpackage.lbp0
    public final mwi0 a() {
        register();
        return new kht(0, this);
    }
}
