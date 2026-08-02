package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: FragmentImplExt.kt */
/* loaded from: classes18.dex */
public final class kbs implements obs {
    public final /* synthetic */ l5l b;
    public final /* synthetic */ FragmentImpl c;

    public kbs(FragmentImpl fragmentImpl, l5l l5lVar) {
        this.b = l5lVar;
        this.c = fragmentImpl;
    }

    @Override // xsna.obs
    public final void b() {
        this.b.invoke();
        this.c.D.d(this);
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
