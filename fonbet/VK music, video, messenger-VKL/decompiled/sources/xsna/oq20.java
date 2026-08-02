package xsna;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import xsna.so20;
import xsna.w2x0;

/* compiled from: MiniAppVoipUiLauncher.kt */
/* loaded from: classes7.dex */
public final class oq20 implements w2x0 {
    public final Context a;

    public oq20(Context context) {
        this.a = context;
    }

    @Override // xsna.w2x0
    public final void b(w2x0.a aVar) {
        so20.a aVar2 = new so20.a(aVar.b, new drg(aVar, 25));
        c63 c63Var = c63.a;
        Context b = c63.b();
        if (b == null) {
            b = this.a;
        }
        so20 so20Var = new so20(b);
        gvw0 gvw0Var = so20Var.b;
        if (Settings.canDrawOverlays(gvw0Var.a) && gvw0Var.d()) {
            so20Var.a(aVar2);
            return;
        }
        if (!Settings.canDrawOverlays(gvw0Var.a)) {
            gvw0.j(gvw0Var, new com.vk.movika.sdk.base.flow.binding.j(16, so20Var, aVar2), new n7w(aVar2, 8), 12);
            return;
        }
        if (gvw0Var.d()) {
            so20Var.a(aVar2);
            return;
        }
        gvw0Var.getClass();
        com.vk.voip.ui.c.b.B(false);
        so20Var.a(aVar2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.w2x0
    public final Intent c() {
        return new Intent();
    }
}
