package defpackage;

import android.app.Activity;
import android.util.Log;
import io.flutter.plugins.urllauncher.a;

/* loaded from: classes4.dex */
public final class bh21 implements tsr, r30 {
    public a a;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        a aVar = this.a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            aVar.c = (Activity) ((wrr) l40Var).b;
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        a aVar = new a(ssrVar.a);
        this.a = aVar;
        tx10.a(ssrVar.c, aVar);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        a aVar = this.a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            aVar.c = null;
        }
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        if (this.a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            tx10.a(ssrVar.c, null);
            this.a = null;
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        onAttachedToActivity(l40Var);
    }
}
