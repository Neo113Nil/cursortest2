package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class odi0 implements e52 {
    public final kf5 a;

    public odi0(kf5 kf5Var) {
        this.a = kf5Var;
    }

    @Override // defpackage.e52
    public final void a(String str, c cVar) {
        vei0 vei0Var = new vei0(str, System.currentTimeMillis(), cVar);
        kf5 kf5Var = this.a;
        ArrayList arrayList = (ArrayList) kf5Var.e;
        xei0 xei0Var = (xei0) kf5Var.b;
        if (xei0Var.a) {
            arrayList.add(vei0Var);
            if (arrayList.size() >= xei0Var.b) {
                kf5Var.d();
                return;
            }
            if (kf5Var.a) {
                return;
            }
            j32 j32Var = (j32) kf5Var.d;
            long j = xei0Var.c;
            ((Handler) j32Var.a.getValue()).postDelayed((b7) kf5Var.f, j);
            kf5Var.a = true;
        }
    }
}
