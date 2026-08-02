package yads;

import android.view.WindowManager;
import xsna.fe60;

/* loaded from: classes10.dex */
public final class vi3 implements ui3 {
    public final WindowManager a;

    public vi3(WindowManager windowManager) {
        this.a = windowManager;
    }

    @Override // yads.ui3
    public final void a() {
    }

    @Override // yads.ui3
    public final void a(ti3 ti3Var) {
        ((fe60) ti3Var).d(this.a.getDefaultDisplay());
    }
}
