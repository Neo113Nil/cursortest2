package xsna;

import com.vkontakte.android.VKApplication;
import java.util.concurrent.ExecutorService;

/* compiled from: RestoreNotificationTask.kt */
/* loaded from: classes11.dex */
public final class ccg0 implements gzs<s3q0> {
    public final VKApplication b;

    public ccg0(VKApplication vKApplication) {
        this.b = vKApplication;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        yh70.b.getClass();
        if (yh70.d) {
            ExecutorService executorService = m9u0.c;
            if (executorService == null) {
                executorService = null;
            }
            executorService.submit(new zir(this, 1));
        }
        return s3q0.a;
    }
}
