package xsna;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dialogtags.api.a;
import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.dialogtags.impl.list.b;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverScopedComponent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mut0;

/* compiled from: TagsFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class w1o0 implements com.vk.dialogtags.api.a {

    /* compiled from: TagsFactoryImpl.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<TagsListState, TagsListState, com.vk.dialogtags.impl.list.a, com.vk.dialogtags.impl.list.b> b;

        public a(bn50<TagsListState, TagsListState, com.vk.dialogtags.impl.list.a, com.vk.dialogtags.impl.list.b> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((com.vk.dialogtags.impl.list.a) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: TagsFactoryImpl.kt */
    @b6l(c = "com.vk.dialogtags.impl.TagsFactoryImpl$ScreenContent$2$1", f = "TagsFactoryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<com.vk.dialogtags.impl.list.a>, com.vk.dialogtags.impl.list.b, spj<? super s3q0>, Object> {
        final /* synthetic */ dk3 $wrapper;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dk3 dk3Var, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$wrapper = dk3Var;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<com.vk.dialogtags.impl.list.a> z37Var, com.vk.dialogtags.impl.list.b bVar, spj<? super s3q0> spjVar) {
            b bVar2 = w1o0.this.new b(this.$wrapper, spjVar);
            bVar2.L$0 = bVar;
            return bVar2.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.vk.dialogtags.impl.list.b bVar = (com.vk.dialogtags.impl.list.b) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (epx.f(bVar, b.c.a)) {
                w1o0 w1o0Var = w1o0.this;
                ComponentActivity componentActivity = this.$wrapper.a;
                w1o0Var.getClass();
            } else if (bVar instanceof b.C0899b) {
                this.$wrapper.d.a(((b.C0899b) bVar).a);
            } else {
                if (!epx.f(bVar, b.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$wrapper.d.b();
            }
            return s3q0.a;
        }
    }

    /* compiled from: TagsFactoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<com.vk.dialogtags.impl.list.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.dialogtags.impl.list.a aVar) {
            ((bn50) this.receiver).b(aVar);
            return s3q0.a;
        }
    }

    @Override // com.vk.dialogtags.api.a
    public final View a(FragmentActivity fragmentActivity, long j, a.b bVar, d2o0 d2o0Var) {
        dk3 dk3Var = new dk3(fragmentActivity, j, bVar, d2o0Var);
        ComposeView composeView = new ComposeView(fragmentActivity, null, 6);
        composeView.setViewCompositionStrategy(mut0.a.a);
        composeView.setContent(new jai(-109749680, new pmg(5, this, dk3Var), true));
        return composeView;
    }

    public final void b(final dk3 dk3Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1473986053);
        int i2 = (M.J(dk3Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1473986053, i2, -1, "com.vk.dialogtags.impl.TagsFactoryImpl.ScreenContent (TagsFactoryImpl.kt:63)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                l7m a2 = m7m.a(dk3Var.a);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b2 = Peer.a.b(dk3Var.b);
                final ezv g = ((ImCmdCoroutinesExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) a2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), b2, a2).a(fpf0.a(ImCmdCoroutinesExecutorScopedComponent.class))).g();
                final xzv l = ((ImCoroutinesEventObserverScopedComponent) xq.f((ImFeatureScopeProviderComponent) a2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), b2, a2).a(fpf0.a(ImCoroutinesEventObserverScopedComponent.class))).l();
                cn50 cn50Var = new cn50(up2.d(new vqe0(6), new wb0() { // from class: xsna.f2o0
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new com.vk.dialogtags.impl.list.c(sj50Var, ezv.this, l);
                    }
                }, svj.b));
                M.R(cn50Var);
                x = cn50Var;
            }
            final bn50 bn50Var = (bn50) x;
            boolean y = M.y(bn50Var);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new mmm0(bn50Var, 3);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new b(dk3Var, null);
                M.R(x3);
            }
            r37.a(izsVar, (yzs) x3, kai.c(-1616072185, new zzs() { // from class: xsna.v1o0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j2o0 j2o0Var = (j2o0) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= aVar2.J(j2o0Var) ? 32 : 16;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1616072185, intValue, -1, "com.vk.dialogtags.impl.TagsFactoryImpl.ScreenContent.<anonymous> (TagsFactoryImpl.kt:73)");
                        }
                        rrv0.d(null, null, null, null, kai.c(-1515608148, new zl3(j2o0Var, w1o0.this, dk3Var, bn50Var), aVar2), aVar2, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d6(this, dk3Var, i, 10);
        }
    }
}
