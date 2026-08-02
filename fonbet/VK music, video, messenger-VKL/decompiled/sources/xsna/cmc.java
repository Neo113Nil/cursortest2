package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import xsna.dmc;

/* compiled from: ClipAutoPlayAfterScrollPerformanceTracker.kt */
/* loaded from: classes17.dex */
public final class cmc implements obs {
    public final /* synthetic */ q8e b;
    public final /* synthetic */ dmc c;

    public cmc(q8e q8eVar, dmc dmcVar) {
        this.b = q8eVar;
        this.c = dmcVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        q8e q8eVar = this.b;
        dmc dmcVar = this.c;
        q8eVar.removeOnScrollListener(dmcVar);
        dmcVar.e = null;
        dmcVar.f = null;
        dmcVar.g = null;
        dmc.a aVar = dmcVar.h;
        if (aVar != null) {
            aVar.a.o(aVar);
        }
        dmcVar.h = null;
        dmcVar.i = null;
        dmcVar.j = null;
        dmcVar.k = null;
        dmcVar.m = false;
    }

    @Override // xsna.obs
    public final void onPause() {
        q8e q8eVar = this.b;
        dmc dmcVar = this.c;
        q8eVar.removeOnScrollListener(dmcVar);
        dmcVar.e = null;
        dmcVar.f = null;
        dmcVar.g = null;
        dmc.a aVar = dmcVar.h;
        if (aVar != null) {
            aVar.a.o(aVar);
        }
        dmcVar.h = null;
        dmcVar.i = null;
        dmcVar.j = null;
        dmcVar.k = null;
        dmcVar.m = false;
    }

    @Override // xsna.obs
    public final void onResume() {
        q8e q8eVar = this.b;
        dmc dmcVar = this.c;
        q8eVar.removeOnScrollListener(dmcVar);
        q8eVar.addOnScrollListener(dmcVar);
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
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
