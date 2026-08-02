package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class tc30<State extends CatalogBlockState> implements t1a {
    public static final tc30<State> b = new tc30<>();

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    /* loaded from: classes16.dex */
    public static final class a extends u1a<State, q1a> {
        public a(b2a b2aVar) {
            super(b2aVar);
        }

        @Override // xsna.u1a
        public final void g(q1a q1aVar) {
            throw new IllegalStateException(("Empty actor, registered for state " + MovieActorsView$MovieActorsState.class.getCanonicalName() + ", trying to handle action " + q1aVar).toString());
        }
    }

    @Override // xsna.t1a
    public final s1a<State> a(b2a b2aVar) {
        return new a(b2aVar);
    }
}
