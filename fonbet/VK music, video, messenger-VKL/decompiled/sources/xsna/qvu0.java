package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.im.mediascope.MediaScopeCommand;

/* compiled from: VkFragmentTracker.kt */
/* loaded from: classes2.dex */
public final class qvu0 implements obs {
    public final /* synthetic */ rvu0 b;
    public final /* synthetic */ mbs c;

    public qvu0(rvu0 rvu0Var, mbs mbsVar) {
        this.b = rvu0Var;
        this.c = mbsVar;
    }

    @Override // xsna.obs
    public final void onDestroy() {
        this.c.d(this);
    }

    @Override // xsna.obs
    public final void onPause() {
        this.b.a.b();
    }

    @Override // xsna.obs
    public final void onResume() {
        zx10 zx10Var = this.b.a;
        zx10Var.d++;
        if (zx10Var.e) {
            return;
        }
        zx10Var.h.dispose();
        zx10Var.h = zx10Var.a(MediaScopeCommand.START);
        zx10Var.c.postDelayed(zx10Var.j, 10000L);
        zx10Var.e = true;
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
