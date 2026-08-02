package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.u5s0;
import xsna.wc30;

/* compiled from: MovieButtonsInlineActor.kt */
/* loaded from: classes.dex */
public final class dd30 extends u1a<MovieButtonsBlockState, wc30> {
    public final xc30 c;

    /* compiled from: MovieButtonsInlineActor.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        public a(dd30 dd30Var) {
            super(dd30Var, dd30.class, "currentState", "getCurrentState()Lcom/vk/catalog/mvi/block/CatalogBlockState;", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((b2a) ((dd30) this.receiver).b.b).getCurrentState();
        }
    }

    public dd30(b2a b2aVar) {
        super(b2aVar);
        this.c = new xc30(new a(this));
        w1a.b(this, null, new ed30(this, null), 3);
    }

    @Override // xsna.u1a
    public final void g(wc30 wc30Var) {
        wc30 wc30Var2 = wc30Var;
        this.c.a(wc30Var2);
        boolean z = wc30Var2 instanceof wc30.b;
        mcc0 mcc0Var = this.b;
        if (z) {
            t(new u5s0.d(((wc30.b) wc30Var2).w(), ((MovieButtonsBlockState) mcc0Var.n()).f, ((MovieButtonsBlockState) mcc0Var.n()).f.r()));
            return;
        }
        if (wc30Var2 instanceof wc30.c) {
            t(new u5s0.h(((wc30.c) wc30Var2).w(), ((MovieButtonsBlockState) mcc0Var.n()).f));
        } else {
            if (!(wc30Var2 instanceof wc30.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((wc30.a) wc30Var2).a() instanceof s5s0) {
                m(new y8m(15));
            }
        }
    }
}
