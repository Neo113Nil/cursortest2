package xsna;

import com.squareup.wire.Message;
import com.vk.core.store.entity.models.StoriesEventsStack;

/* compiled from: RxPersistentEntityCacheImpl.kt */
/* loaded from: classes17.dex */
public final class hvg0<T extends Message<?, ?>> implements gvg0<T> {
    public final uy90 a;

    public hvg0(uy90 uy90Var) {
        this.a = uy90Var;
    }

    @Override // xsna.gvg0
    public final io.reactivex.rxjava3.core.a a(StoriesEventsStack storiesEventsStack, io.reactivex.rxjava3.core.w wVar) {
        return io.reactivex.rxjava3.core.a.l(new qk8(2, this, storiesEventsStack)).q(wVar);
    }

    @Override // xsna.gvg0
    public final io.reactivex.rxjava3.core.k<T> b(io.reactivex.rxjava3.core.w wVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.c(new x34(this, 28)).n(wVar);
    }
}
