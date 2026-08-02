package xsna;

import android.app.Activity;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import xsna.c63;

/* compiled from: UIRebuilderDelegate.kt */
/* loaded from: classes7.dex */
public final class cxp0 extends c63.b {
    public final /* synthetic */ m6r0 b;

    public cxp0(m6r0 m6r0Var) {
        this.b = m6r0Var;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        if (activity instanceof BaseSharingExternalActivity) {
            BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) activity;
            m6r0 m6r0Var = this.b;
            if (m6r0Var != null) {
                i0q0.d(50L, new df6(6, baseSharingExternalActivity, m6r0Var));
            }
            c63 c63Var = c63.a;
            c63.c(this);
        }
    }
}
