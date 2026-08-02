package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bcj implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bcj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                y9e0 y9e0Var = (y9e0) this.c;
                synchronized (com.vk.contacts.c.b) {
                    if (y9e0Var.isCancelled()) {
                        return s3q0.a;
                    }
                    ExecutorService executorService = com.vk.contacts.c.l;
                    if (executorService == null) {
                        executorService = null;
                    }
                    Future<V> submit = executorService.submit(new vbj(0));
                    synchronized (y9e0Var.b) {
                        y9e0Var.d = submit;
                        y9e0Var.c.countDown();
                    }
                    return s3q0.a;
                }
            default:
                ExternalNpsCondition externalNpsCondition = (ExternalNpsCondition) this.c;
                blq0 blq0Var = l4r0.a;
                return Boolean.valueOf(l4r0.a(externalNpsCondition.h()));
        }
    }
}
