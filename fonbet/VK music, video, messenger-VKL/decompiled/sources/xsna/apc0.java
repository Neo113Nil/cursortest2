package xsna;

import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fmc0;

/* compiled from: PostingTechStatsSideEffectsDelegate.kt */
/* loaded from: classes4.dex */
public final class apc0 {
    public final io.reactivex.rxjava3.disposables.b a;
    public final yu60 b;
    public final uv20 c;

    /* compiled from: PostingTechStatsSideEffectsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public apc0(io.reactivex.rxjava3.disposables.b bVar, yu60 yu60Var, uv20 uv20Var) {
        this.a = bVar;
        this.b = yu60Var;
        this.c = uv20Var;
    }

    public final void a(fmc0.v vVar) {
        if (!(vVar instanceof fmc0.v.a)) {
            if (!(vVar instanceof pmc0)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingContentView postingContentView = ((PostingFragment) this.b.c).R;
            if (postingContentView != null) {
                postingContentView.o6(vVar);
                return;
            }
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar2 = new io.reactivex.rxjava3.internal.operators.single.v(new zoc0(this, 0));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar2.q(asu0.m());
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new fs00(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 12));
        if (subscribe != null) {
            this.a.b(subscribe);
        }
    }
}
