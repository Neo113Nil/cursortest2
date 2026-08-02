package xsna;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import xsna.kq50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kjz0 implements yix {
    public final HashMap a = new HashMap();
    public int b;

    public kjz0(s6z0 s6z0Var) {
        new HashMap();
        this.b = 0;
    }

    public static kjz0 c(s6z0 s6z0Var) {
        return new kjz0(s6z0Var);
    }

    @Override // xsna.yix
    public final void a(kq50.b bVar) {
        kq50 kq50Var = kq50.this;
        int i = kq50Var.getContext().getResources().getDisplayMetrics().widthPixels;
        boolean z = this.b != i;
        this.b = i;
        if (z) {
            gu8.c("IntlAdCtrlFactory", "Device configuration was changed");
        }
        for (fkz0 fkz0Var : this.a.values()) {
            if (z) {
                fkz0Var.getClass();
                Iterator it = new HashSet(fkz0Var.e.keySet()).iterator();
                while (it.hasNext()) {
                    ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
                    if (viewGroup != null) {
                        fkz0Var.y(viewGroup);
                    }
                }
            } else if (fkz0Var.t(kq50Var) != null) {
                fkz0Var.f(bVar);
                return;
            }
        }
    }

    @Override // xsna.yix
    public final fkz0 b(gjx gjxVar) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(gjxVar)) {
            hashMap.put(gjxVar, new fkz0(gjxVar));
        }
        fkz0 fkz0Var = (fkz0) hashMap.get(gjxVar);
        Objects.requireNonNull(fkz0Var);
        return fkz0Var;
    }
}
