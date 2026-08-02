package xsna;

import com.vk.im.mvicomponent.MultiComponentFragment;
import java.util.Iterator;

/* compiled from: SimpleBroadcastHub.kt */
/* loaded from: classes2.dex */
public final class kpj0 implements mg8 {
    public final MultiComponentFragment.a b;
    public final MultiComponentFragment.b c;
    public final io.reactivex.rxjava3.core.w d = io.reactivex.rxjava3.schedulers.a.b();
    public final io.reactivex.rxjava3.subjects.f<kj50> e = new io.reactivex.rxjava3.subjects.f<>();

    public kpj0(MultiComponentFragment.a aVar, MultiComponentFragment.b bVar) {
        this.b = aVar;
        this.c = bVar;
    }

    @Override // xsna.mg8
    public final <T extends yn50> void H9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        Iterator<T> it = this.b.invoke(yj50Var, t).iterator();
        while (it.hasNext()) {
            this.e.onNext((kj50) it.next());
        }
    }

    @Override // xsna.mg8
    public final <T extends kj50> void P9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        Iterator<T> it = this.c.invoke(yj50Var, t).iterator();
        while (it.hasNext()) {
            this.e.onNext((kj50) it.next());
        }
    }

    @Override // xsna.mg8
    public final io.reactivex.rxjava3.core.q<kj50> v() {
        return this.e.a0(this.d);
    }
}
