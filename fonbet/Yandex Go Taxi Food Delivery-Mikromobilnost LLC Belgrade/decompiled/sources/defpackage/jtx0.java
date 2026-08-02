package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes11.dex */
public abstract class jtx0 extends ltx0 {
    @Override // defpackage.ltx0
    public final ko2 d(Task task) {
        if (task.o()) {
            return new ko2(task.k(), Status.RESULT_SUCCESS);
        }
        if (task.m()) {
            return new ko2(null, new Status(16, "The task has been canceled."));
        }
        Status status = this.a;
        return status != null ? new ko2(null, status) : new ko2(null, Status.RESULT_INTERNAL_ERROR);
    }

    @Override // defpackage.x40
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ko2 c(int i, Intent intent) {
        if (i != -1) {
            return i != 0 ? new ko2(null, Status.RESULT_INTERNAL_ERROR) : new ko2(null, Status.RESULT_CANCELED);
        }
        PaymentData f = intent != null ? f(intent) : null;
        return f != null ? new ko2(f, Status.RESULT_SUCCESS) : new ko2(null, Status.RESULT_INTERNAL_ERROR);
    }

    public abstract PaymentData f(Intent intent);
}
