package xsna;

import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.utils.retry.Backoff;

/* loaded from: classes8.dex */
public final class jdz0 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ izs b;
    public final /* synthetic */ Backoff c;
    public final /* synthetic */ wzs d;
    public final /* synthetic */ io.reactivex.rxjava3.core.w e;
    public final /* synthetic */ izs f;

    public jdz0(izs izsVar, Backoff backoff, wzs wzsVar, io.reactivex.rxjava3.core.w wVar, izs izsVar2) {
        this.b = izsVar;
        this.c = backoff;
        this.d = wzsVar;
        this.e = wVar;
        this.f = izsVar2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (!((Boolean) this.b.invoke(th)).booleanValue()) {
            return io.reactivex.rxjava3.core.q.H(th);
        }
        Backoff backoff = this.c;
        long interval = backoff.interval();
        if (interval == 0) {
            this.f.invoke(th);
            return io.reactivex.rxjava3.core.q.H(th);
        }
        this.d.invoke(th, Integer.valueOf(backoff.getRetryCount()));
        return io.reactivex.rxjava3.core.q.C0(interval, TimeUnit.MILLISECONDS, this.e);
    }
}
