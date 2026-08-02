package xsna;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class uk01 extends ah01 {
    public final /* synthetic */ ja01 c;
    public final /* synthetic */ up01 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk01(up01 up01Var, TaskCompletionSource taskCompletionSource, ja01 ja01Var) {
        super(taskCompletionSource);
        this.d = up01Var;
        this.c = ja01Var;
    }

    @Override // xsna.ah01
    public final void a() {
        up01 up01Var = this.d;
        ka01 ka01Var = up01Var.m;
        lf01 lf01Var = up01Var.b;
        ArrayList arrayList = up01Var.d;
        ja01 ja01Var = this.c;
        if (ka01Var != null || up01Var.g) {
            if (!up01Var.g) {
                ja01Var.run();
                return;
            } else {
                lf01Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(ja01Var);
                return;
            }
        }
        lf01Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(ja01Var);
        cp01 cp01Var = new cp01(up01Var);
        up01Var.l = cp01Var;
        up01Var.g = true;
        if (up01Var.a.bindService(up01Var.h, cp01Var, 1)) {
            return;
        }
        lf01Var.a("Failed to bind to the service.", new Object[0]);
        up01Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ah01 ah01Var = (ah01) it.next();
            com.google.android.play.core.review.internal.zzu zzuVar = new com.google.android.play.core.review.internal.zzu();
            TaskCompletionSource taskCompletionSource = ah01Var.b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzuVar);
            }
        }
        arrayList.clear();
    }
}
