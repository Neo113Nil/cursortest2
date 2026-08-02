package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final /* synthetic */ class pqh implements uqh {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqh b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pqh(tqh tqhVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = tqhVar;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.uqh
    public final ScheduledFuture a(zgf zgfVar) {
        int i = this.a;
        TimeUnit timeUnit = this.d;
        long j = this.c;
        Object obj = this.e;
        tqh tqhVar = this.b;
        switch (i) {
            case 0:
                return tqhVar.b.schedule(new sqh(tqhVar, (Runnable) obj, zgfVar, 1), j, timeUnit);
            default:
                return tqhVar.b.schedule(new psz(2, tqhVar, (Callable) obj, zgfVar), j, timeUnit);
        }
    }
}
