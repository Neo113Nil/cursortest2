package xsna;

import com.vk.im.engine.models.messages.Msg;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ym30;

/* compiled from: VisibleMessagesUpdater.kt */
/* loaded from: classes2.dex */
public final class n5u0 implements ym30.a {
    public final FunctionReferenceImpl a;
    public final io.reactivex.rxjava3.subjects.f<Msg> b;
    public final io.reactivex.rxjava3.subjects.f<Boolean> c;
    public io.reactivex.rxjava3.disposables.c d;

    /* JADX WARN: Multi-variable type inference failed */
    public n5u0(io.reactivex.rxjava3.disposables.b bVar, izs<? super Collection<? extends Msg>, ? extends io.reactivex.rxjava3.core.a> izsVar) {
        this.a = (FunctionReferenceImpl) izsVar;
        io.reactivex.rxjava3.subjects.f<Msg> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.subjects.f<Boolean> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar2;
        io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new qat0(new g2h0(10), 1)).c(fVar2).L(new dnz(new wql0(11), 28), false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        L.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(L.d(2L, timeUnit, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, ArrayListSupplier.INSTANCE), new n8c0(new acc0(18), 16));
        int i = kwg0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, i0Var, null, new nu2("failed to update visible messages", 2), new ozk0(5, this, bVar)));
    }

    @Override // xsna.ym30.a
    public final void a(Collection<? extends Msg> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            this.b.onNext((Msg) it.next());
        }
        if (this.d == null) {
            this.c.onNext(Boolean.TRUE);
        }
    }
}
