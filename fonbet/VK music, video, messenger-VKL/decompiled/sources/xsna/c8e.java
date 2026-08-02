package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;

/* compiled from: ClipsFeedMviView.kt */
/* loaded from: classes17.dex */
public final class c8e implements obs {
    public final /* synthetic */ d8e b;

    public c8e(d8e d8eVar) {
        this.b = d8eVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        d8e d8eVar = this.b;
        d8eVar.d.b.e(Lifecycle.State.DESTROYED);
        d8eVar.h.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        n4r spinnerRenderDelegate;
        spinnerRenderDelegate = this.b.getSpinnerRenderDelegate();
        Window a = spinnerRenderDelegate.b.a();
        View decorView = a != null ? a.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.post(new o4(spinnerRenderDelegate, 11));
        }
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onPause() {
    }

    @Override // xsna.obs
    public final void onResume() {
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
