package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tkz implements io.reactivex.rxjava3.functions.l, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tkz(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        final AtomicInteger atomicInteger = (AtomicInteger) this.c;
        final int i = this.b;
        return ((io.reactivex.rxjava3.core.q) obj).L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.ukz
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj2) {
                Throwable th = (Throwable) obj2;
                boolean z = (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 6;
                int andIncrement = atomicInteger.getAndIncrement();
                if (!z || andIncrement >= i) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                io.reactivex.rxjava3.core.q.T(new Object());
                return io.reactivex.rxjava3.core.q.B0(3000L, TimeUnit.MILLISECONDS);
            }
        }, false);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        int i = this.b;
        ((yads.af) obj).getClass();
    }
}
