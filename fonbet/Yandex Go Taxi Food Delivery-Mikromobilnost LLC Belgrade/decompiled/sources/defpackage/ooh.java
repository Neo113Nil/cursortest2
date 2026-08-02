package defpackage;

import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ooh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeferredBatchExecutor b;

    public /* synthetic */ ooh(DeferredBatchExecutor deferredBatchExecutor, int i) {
        this.a = i;
        this.b = deferredBatchExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DeferredBatchExecutor deferredBatchExecutor = this.b;
        switch (i) {
            case 0:
                DeferredBatchExecutor.a(deferredBatchExecutor);
                break;
            default:
                DeferredBatchExecutor.b(deferredBatchExecutor);
                break;
        }
    }
}
