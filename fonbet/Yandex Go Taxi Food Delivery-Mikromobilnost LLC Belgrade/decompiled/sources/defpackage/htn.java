package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes10.dex */
public final class htn extends etn {
    public final /* synthetic */ etn a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public htn(etn etnVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = etnVar;
        this.b = threadPoolExecutor;
    }

    @Override // defpackage.etn
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.etn
    public final void b(wjm wjmVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(wjmVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
