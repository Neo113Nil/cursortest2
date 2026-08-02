package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.core.view.components.topbar.VkTopBar;

/* compiled from: VkAppDialogsToolbarViewController.kt */
/* loaded from: classes18.dex */
public final class r9u0 implements obs {
    public final /* synthetic */ q9u0 b;

    public r9u0(q9u0 q9u0Var) {
        this.b = q9u0Var;
    }

    @Override // xsna.obs
    public final void onPause() {
        this.b.w = false;
    }

    @Override // xsna.obs
    public final void onResume() {
        VkTopBar vkTopBar;
        q9u0 q9u0Var = this.b;
        q9u0Var.w = true;
        q9u0Var.U();
        if (!q9u0Var.h || (vkTopBar = q9u0Var.j) == null) {
            return;
        }
        vkTopBar.setViewCompositionStrategy(sv1.g(vkTopBar.getContext()));
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
