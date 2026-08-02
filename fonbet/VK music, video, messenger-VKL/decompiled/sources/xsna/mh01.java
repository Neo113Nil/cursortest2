package xsna;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.zzfk;
import java.util.ArrayDeque;
import java.util.TimerTask;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class mh01 extends TimerTask {
    public final /* synthetic */ pv10 b;

    public mh01(pv10 pv10Var) {
        this.b = pv10Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        final pv10 pv10Var = this.b;
        ArrayDeque arrayDeque = pv10Var.h;
        if (arrayDeque.isEmpty() || pv10Var.k != null || pv10Var.b == 0) {
            return;
        }
        lvf0 lvf0Var = pv10Var.c;
        int[] d = o0a.d(arrayDeque);
        lvf0Var.getClass();
        exc0.e("Must be called from the main thread.");
        if (lvf0Var.H()) {
            pxz0 pxz0Var = new pxz0(lvf0Var, d);
            lvf0.J(pxz0Var);
            basePendingResult = pxz0Var;
        } else {
            basePendingResult = lvf0.G();
        }
        pv10Var.k = basePendingResult;
        basePendingResult.setResultCallback(new tdg0() { // from class: xsna.fk01
            @Override // xsna.tdg0
            public final void a(qdg0 qdg0Var) {
                pv10 pv10Var2 = pv10.this;
                pv10Var2.getClass();
                Status status = ((lvf0.c) qdg0Var).getStatus();
                int i = status.b;
                if (i != 0) {
                    pv10Var2.a.c(com.vk.movika.sdk.base.model.history.b.b(i, "Error fetching queue items, statusCode=", ", statusMessage=", status.c), new Object[0]);
                }
                pv10Var2.k = null;
                if (pv10Var2.h.isEmpty()) {
                    return;
                }
                zzfk zzfkVar = pv10Var2.i;
                mh01 mh01Var = pv10Var2.j;
                zzfkVar.removeCallbacks(mh01Var);
                zzfkVar.postDelayed(mh01Var, 500L);
            }
        });
        arrayDeque.clear();
    }
}
