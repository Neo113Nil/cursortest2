package xsna;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncResultUtil.kt */
/* loaded from: classes2.dex */
public final class gz3 implements fz3<Object>, io.reactivex.rxjava3.disposables.c {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;
    public final /* synthetic */ mla c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ CountDownLatch f;
    public final /* synthetic */ AtomicReference<pdg0<Object>> g;

    public gz3(io.reactivex.rxjava3.disposables.c cVar, mla mlaVar, String str, ArrayList arrayList, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.c = mlaVar;
        this.d = str;
        this.e = arrayList;
        this.f = countDownLatch;
        this.g = atomicReference;
        this.b = cVar;
    }

    @Override // xsna.fz3
    public final Object await() {
        if (i0q0.b()) {
            throw new IllegalArgumentException("Call on ui thread is prohibited");
        }
        String str = this.d;
        ArrayList arrayList = this.e;
        mla mlaVar = this.c;
        hz3.a(mlaVar, str, arrayList);
        hz3.b(mlaVar);
        if (this.f.await(300L, TimeUnit.SECONDS)) {
            return vdg0.c(this.g.get());
        }
        throw new IllegalStateException("AsyncResult await timed out after 300 seconds for cause=" + mlaVar);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b.h();
    }
}
