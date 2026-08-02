package xsna;

import java.util.HashMap;
import java.util.Map;
import xsna.v7z0;
import xsna.z5z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ffl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ffl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.qy90$c, xsna.wf] */
    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        switch (this.b) {
            case 0:
                ?? r0 = ((hfl0) this.c).c;
                if (r0 != 0) {
                    r0.setVisible(true);
                    if (r0.v3()) {
                        r0.q();
                        return;
                    }
                    return;
                }
                return;
            default:
                z5z0 z5z0Var = (z5z0) this.c;
                synchronized (z5z0Var) {
                    hashMap = z5z0Var.g;
                    z5z0Var.g = new HashMap();
                }
                v7z0 v7z0Var = z5z0Var.c;
                fpy0 fpy0Var = z5z0Var.d;
                v7z0Var.getClass();
                for (Map.Entry entry : hashMap.entrySet()) {
                    udz0 udz0Var = (udz0) entry.getKey();
                    z5z0.a aVar = (z5z0.a) entry.getValue();
                    if (!aVar.a.isEmpty()) {
                        try {
                            mcz0.s().f(v7z0.a(new v7z0.a(fpy0Var, udz0Var, aVar.a)).toString());
                        } catch (Throwable unused) {
                        }
                    }
                    for (Map.Entry entry2 : aVar.b.entrySet()) {
                        giy0 giy0Var = (giy0) entry2.getKey();
                        z5z0.b bVar = (z5z0.b) entry2.getValue();
                        if (!bVar.a.isEmpty()) {
                            try {
                                mcz0.s().f(v7z0.a(new v7z0.a(fpy0Var, udz0Var, giy0Var, bVar.a)).toString());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return;
        }
    }
}
