package xsna;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: ComposeViewContext.android.kt */
/* loaded from: classes11.dex */
public final class kri implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ iri b;

    public kri(iri iriVar) {
        this.b = iriVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @ozl
    public final void onLowMemory() {
        iri iriVar = this.b;
        iriVar.f.a.clear();
        iriVar.g.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        iri iriVar = this.b;
        iriVar.f.a.clear();
        iriVar.g.a();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((zak0) this.b.s.c).setValue(Boolean.valueOf(z));
    }
}
