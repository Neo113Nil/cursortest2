package xsna;

import com.vk.sharing.core.cancellation.TargetSharingTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.controls.VerificationController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nq9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nq9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                pq9 pq9Var = (pq9) this.c;
                TargetSharingTask targetSharingTask = (TargetSharingTask) this.d;
                pq9Var.c(targetSharingTask.c, (nhi0) this.e, targetSharingTask.e);
                break;
            default:
                VerificationController.lambda$onUiThread$0((AtomicReference) this.c, (gzs) this.d, (CountDownLatch) this.e);
                break;
        }
    }
}
