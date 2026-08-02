package xsna;

import com.vk.dto.common.Source;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: ObservableProvider.kt */
/* loaded from: classes2.dex */
public abstract class yq70<T, S> implements io.reactivex.rxjava3.disposables.c {
    public final a1w b;
    public final io.reactivex.rxjava3.subjects.d<T> c;
    public final io.reactivex.rxjava3.disposables.b d;

    public yq70(a1w a1wVar, io.reactivex.rxjava3.core.w wVar) {
        T t;
        this.b = a1wVar;
        io.reactivex.rxjava3.subjects.d<T> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.c = N0;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        pdg0 o = a1wVar.o(this, b(Source.CACHE), 200L);
        if (o instanceof pdg0.a) {
            t = null;
        } else {
            if (!(o instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            t = ((pdg0.b) o).a;
        }
        if (t != null) {
            N0.onNext(c(t));
        }
        e1w<S> b = b(Source.ACTUAL);
        sl30 sl30Var = new sl30(this, 8);
        L l = L.a;
        bVar.b(a1wVar.E(this, b).subscribe(sl30Var, new g68(2)));
        int i = 7;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a().a0(wVar), new xq70(new sec(1, this, yq70.class, "isEventRequiresReload", "isEventRequiresReload(Lcom/vk/im/engine/models/events/Event;)Z", 0, 6), 0)).y(200L, TimeUnit.MILLISECONDS).subscribe(new s440(new kb40(this, i), i)));
    }

    public abstract boolean a(sxp sxpVar);

    public abstract e1w<S> b(Source source);

    public abstract T c(S s);

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.c.onComplete();
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.d.c;
    }
}
