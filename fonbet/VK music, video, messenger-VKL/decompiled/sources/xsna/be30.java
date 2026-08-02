package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.de30;

/* compiled from: MovieInfoInlineActor.kt */
/* loaded from: classes.dex */
public final class be30 extends u1a<MovieInfoView$MovieInfoBlockState, de30> {
    public final ae30 c;

    /* compiled from: MovieInfoInlineActor.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        public a(be30 be30Var) {
            super(be30Var, be30.class, "currentState", "getCurrentState()Lcom/vk/catalog/mvi/block/CatalogBlockState;", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((b2a) ((be30) this.receiver).b.b).getCurrentState();
        }
    }

    public be30(b2a b2aVar) {
        super(b2aVar);
        this.c = new ae30(new a(this));
    }

    @Override // xsna.u1a
    public final void g(de30 de30Var) {
        de30 de30Var2 = de30Var;
        this.c.a(de30Var2);
        if (!(de30Var2 instanceof de30.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m(new n9w(7));
    }
}
