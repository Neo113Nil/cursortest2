package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes15.dex */
public final class abj implements tsr {
    public ea20 a;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        Context context = ssrVar.a;
        this.a = new ea20(tt5Var, "dev.fluttercommunity.plus/device_info");
        ht10 ht10Var = new ht10(context.getPackageManager(), (WindowManager) context.getSystemService("window"), false, 6);
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(ht10Var);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }
}
