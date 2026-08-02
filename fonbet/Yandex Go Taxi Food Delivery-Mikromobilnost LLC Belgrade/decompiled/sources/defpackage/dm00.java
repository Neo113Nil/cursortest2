package defpackage;

import android.app.Application;
import com.yandex.mobile.drive.map.LocationDirectionHandler;

/* loaded from: classes7.dex */
public final class dm00 implements tsr, r30 {
    public LocationDirectionHandler a;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        LocationDirectionHandler locationDirectionHandler = this.a;
        if (locationDirectionHandler != null) {
            locationDirectionHandler.start();
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = new LocationDirectionHandler((Application) ssrVar.a, ssrVar.c);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        LocationDirectionHandler locationDirectionHandler = this.a;
        if (locationDirectionHandler != null) {
            locationDirectionHandler.stop();
        }
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        LocationDirectionHandler locationDirectionHandler = this.a;
        if (locationDirectionHandler != null) {
            locationDirectionHandler.dispose();
        }
        this.a = null;
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
    }
}
