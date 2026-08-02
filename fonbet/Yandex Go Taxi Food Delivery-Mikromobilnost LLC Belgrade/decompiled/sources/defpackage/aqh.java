package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class aqh {
    public final WeakHashMap a = new WeakHashMap();

    public static final void c(aqh aqhVar, u45 u45Var, bsa0 bsa0Var, n3v n3vVar, sls slsVar) {
        if (aqhVar.a.get(u45Var) == bsa0Var && n3vVar.isReadyForDelayedGone()) {
            bsa0Var.d = true;
            slsVar.invoke();
        }
    }

    public final void a(u45 u45Var) {
        View view;
        bsa0 bsa0Var = (bsa0) this.a.remove(u45Var);
        if (bsa0Var == null || (view = bsa0Var.c) == null) {
            return;
        }
        zph zphVar = bsa0Var.b;
        if (zphVar == null) {
            zphVar = null;
        }
        view.removeOnLayoutChangeListener(zphVar);
    }

    public final void b(u45 u45Var, boolean z, sls slsVar) {
        View delayedGoneLayoutReadyView;
        n3v n3vVar = u45Var instanceof n3v ? (n3v) u45Var : null;
        if (n3vVar == null || (delayedGoneLayoutReadyView = n3vVar.getDelayedGoneLayoutReadyView()) == null) {
            return;
        }
        a(u45Var);
        bsa0 bsa0Var = new bsa0(z);
        zph zphVar = new zph(this, u45Var, bsa0Var, n3vVar, slsVar, 0);
        bsa0Var.b = zphVar;
        bsa0Var.c = delayedGoneLayoutReadyView;
        this.a.put(u45Var, bsa0Var);
        delayedGoneLayoutReadyView.addOnLayoutChangeListener(zphVar);
        c(this, u45Var, bsa0Var, n3vVar, slsVar);
        delayedGoneLayoutReadyView.post(new te5(this, u45Var, bsa0Var, n3vVar, slsVar, 1));
    }
}
