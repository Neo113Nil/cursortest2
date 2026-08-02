package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public class ewc0 implements wfg {
    public final Handler a = Handler.createAsync(Looper.getMainLooper());

    @Override // defpackage.wfg
    public final void a(wt7 wt7Var) {
        this.a.post(wt7Var);
    }
}
