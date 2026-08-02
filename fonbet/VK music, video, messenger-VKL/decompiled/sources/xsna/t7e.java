package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: ClipsFeedListView.kt */
/* loaded from: classes17.dex */
public final class t7e implements obs {
    public final /* synthetic */ s7e b;

    public t7e(s7e s7eVar) {
        this.b = s7eVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.b.Q.d(this);
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        owi.b(s7e.S);
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
