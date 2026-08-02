package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* compiled from: NewsfeedMainFreshNewsInteractor.kt */
/* loaded from: classes4.dex */
public final class jt60 {
    public final io.reactivex.rxjava3.core.w a;
    public final xhs b;
    public final ts60 c;
    public final Lazy d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final ArrayList<yhs> f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final Object j;
    public int k;
    public final long l;
    public long m;
    public boolean n;
    public izs<? super gzs<s3q0>, ? extends io.reactivex.rxjava3.disposables.c> o;

    public jt60(xhs xhsVar, ts60 ts60Var, Lazy lazy) {
        asu0.a.getClass();
        this.a = asu0.i();
        this.b = xhsVar;
        this.c = ts60Var;
        this.d = lazy;
        this.e = new io.reactivex.rxjava3.disposables.b();
        this.f = new ArrayList<>();
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(true);
        this.i = new AtomicBoolean(false);
        this.j = new Object();
        long j = xhsVar.a;
        j = j < 0 ? TimeUnit.SECONDS.toMillis(600L) : j;
        this.l = j;
        this.m = j;
        this.n = true;
        this.o = new uh40(this, 2);
    }

    public final io.reactivex.rxjava3.disposables.c a(int i, izs izsVar, boolean z) {
        int i2 = this.k;
        ts60 ts60Var = this.c;
        if (i2 != i) {
            ts60Var.i();
            this.k = i;
            c();
        }
        ((NewsFeedComponent) this.d.getValue()).Bb().getClass();
        long longValue = ce60.h.getOrDefault(Integer.valueOf(i), 0L).longValue();
        boolean z2 = longValue == 0;
        long currentTimeMillis = System.currentTimeMillis() - longValue;
        long j = this.m;
        long j2 = j - currentTimeMillis;
        if (j2 > 0) {
            j = j2;
        } else if (!z || !z2) {
            j = 0;
        }
        ts60Var.l();
        return b(j, this.m, izsVar);
    }

    public final io.reactivex.rxjava3.disposables.c b(long j, long j2, izs<? super r070, s3q0> izsVar) {
        if (!this.h.get()) {
            return EmptyDisposable.INSTANCE;
        }
        if (!this.g.compareAndSet(false, true)) {
            return EmptyDisposable.INSTANCE;
        }
        WeakReference weakReference = new WeakReference(this.o);
        ag20 ag20Var = new ag20(izsVar);
        Object obj = this.j;
        ts60 ts60Var = this.c;
        yhs yhsVar = new yhs(weakReference, obj, ag20Var, ts60Var);
        this.i.set(false);
        ts60Var.g();
        io.reactivex.rxjava3.disposables.c e = this.a.e(yhsVar, j, j2, TimeUnit.MILLISECONDS);
        this.e.b(e);
        this.f.add(yhsVar);
        return e;
    }

    public final void c() {
        NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
        this.c.T();
        this.g.set(false);
        ArrayList<yhs> arrayList = this.f;
        Iterator<yhs> it = arrayList.iterator();
        while (it.hasNext()) {
            yhs next = it.next();
            next.g.set(true);
            io.reactivex.rxjava3.disposables.c andSet = next.f.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
        }
        arrayList.clear();
        this.e.e();
    }
}
