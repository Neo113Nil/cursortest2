package xsna;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r8l0 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ r8l0(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k6q0 k6q0Var;
        f370 f370Var;
        yo20 yo20Var;
        switch (this.b) {
            case 0:
                try {
                    try {
                        s8l0.b();
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.q(e);
                    }
                    return;
                } finally {
                    s8l0.b = false;
                }
            case 1:
                ThreadUtils.sThreadAssertsDisabledForTesting = false;
                return;
            default:
                WeakReference<AppCompatActivity> weakReference = d6q0.m;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                bxi bxiVar = d6q0.b;
                if (bxiVar == null || (yo20Var = bxiVar.e) == null) {
                    k6q0Var = null;
                } else {
                    nhp0 nhp0Var = d6q0.n;
                    if (nhp0Var == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    k6q0Var = (k6q0) yo20Var.invoke(nhp0Var);
                }
                bxi bxiVar2 = d6q0.b;
                if (bxiVar2 != null && (f370Var = bxiVar2.h) != null) {
                    f370Var.b(new jzm0(4));
                }
                if (k6q0Var != null) {
                    k6q0Var.hide();
                } else {
                    wil.a.getClass();
                    wil.a();
                }
                Iterator<ny1> it = d6q0.d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                bxi bxiVar3 = d6q0.b;
                if (bxiVar3 == null || bxiVar3.s) {
                    return;
                }
                d6q0.c.e();
                return;
        }
    }
}
