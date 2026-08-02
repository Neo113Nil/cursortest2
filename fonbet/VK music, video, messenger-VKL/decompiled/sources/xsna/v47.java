package xsna;

import com.vkontakte.android.R;
import java.util.concurrent.Executor;
import xsna.o57;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class v47 implements fr70<Boolean> {
    public final /* synthetic */ q47 b;

    public v47(q47 q47Var) {
        this.b = q47Var;
    }

    @Override // xsna.fr70
    public final void a(Boolean bool) {
        if (bool.booleanValue()) {
            q47 q47Var = this.b;
            if (q47Var.wn()) {
                q47Var.An(q47Var.getString(R.string.fingerprint_not_recognized));
            }
            o57 o57Var = q47Var.i;
            if (o57Var.l) {
                Executor executor = o57Var.b;
                if (executor == null) {
                    executor = new o57.b();
                }
                executor.execute(new r47(q47Var));
            }
            o57 o57Var2 = q47Var.i;
            if (o57Var2.s == null) {
                o57Var2.s = new ug50<>();
            }
            o57.n(o57Var2.s, Boolean.FALSE);
        }
    }
}
