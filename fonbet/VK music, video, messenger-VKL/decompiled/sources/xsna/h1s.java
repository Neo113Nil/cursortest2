package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: FoldersOnboardingController.kt */
/* loaded from: classes18.dex */
public final class h1s implements obs {
    public final /* synthetic */ i1s b;

    public h1s(i1s i1sVar) {
        this.b = i1sVar;
    }

    @Override // xsna.obs
    public final void onPause() {
        i1s i1sVar = this.b;
        i1sVar.i = false;
        i1sVar.h = false;
        i1sVar.g.removeCallbacksAndMessages(null);
    }

    @Override // xsna.obs
    public final void onResume() {
        i1s i1sVar = this.b;
        i1sVar.i = true;
        if (i1sVar.h) {
            return;
        }
        Handler handler = i1sVar.g;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new j0(i1sVar, 9), 1000L);
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onDestroy() {
    }

    @Override // xsna.obs
    public final void onDestroyView() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
