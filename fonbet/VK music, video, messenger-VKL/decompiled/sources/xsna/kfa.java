package xsna;

import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.utils.newtork.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.bea;
import xsna.bfa;
import xsna.dfa;
import xsna.r1a;
import xsna.yda;

/* compiled from: CatalogSectionScreenInlineActor.kt */
/* loaded from: classes16.dex */
public final class kfa extends bl50<CatalogSectionScreenState, bfa, on50, bwj, dwj, dfa> {
    public final CatalogSectionScreenArguments c;
    public final cea d;
    public final qfa e;
    public final sj50<CatalogSectionScreenState, on50, ll50<on50, bwj, dwj>, jl50<CatalogSectionScreenState>, dfa> f;

    /* compiled from: CatalogSectionScreenInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.store.CatalogSectionScreenInlineActor$init$1", f = "CatalogSectionScreenInlineActor.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: CatalogSectionScreenInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.section.screen.impl.ui.store.CatalogSectionScreenInlineActor$init$1$1", f = "CatalogSectionScreenInlineActor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.kfa$a$a, reason: collision with other inner class name */
        public static final class C3178a extends SuspendLambda implements wzs<d.a, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ kfa this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3178a(kfa kfaVar, spj<? super C3178a> spjVar) {
                super(2, spjVar);
                this.this$0 = kfaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3178a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(d.a aVar, spj<? super s3q0> spjVar) {
                return ((C3178a) create(aVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                if (((CatalogSectionScreenState) this.this$0.b.getCurrentState()).e != null) {
                    kfa kfaVar = this.this$0;
                    kfaVar.getClass();
                    g3q.a(kfaVar, new mfa(kfaVar, null));
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return kfa.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.core.utils.newtork.b.a.getClass();
                nb9 a = cdn.a(com.vk.core.utils.newtork.b.f());
                C3178a c3178a = new C3178a(kfa.this, null);
                this.label = 1;
                if (rsr.k(a, c3178a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public kfa(CatalogSectionScreenArguments catalogSectionScreenArguments, cea ceaVar, qfa qfaVar, sj50 sj50Var) {
        super(sj50Var);
        this.c = catalogSectionScreenArguments;
        this.d = ceaVar;
        this.e = qfaVar;
        this.f = sj50Var;
    }

    public static final void m(kfa kfaVar, mm50 mm50Var, yvj yvjVar) {
        kfaVar.getClass();
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(tci.l(mm50Var), new ifa(kfaVar, null)), yvjVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(tci.k(mm50Var), new jfa(kfaVar, null)), yvjVar);
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CatalogSectionScreenState, on50, ll50<on50, bwj, dwj>, jl50<CatalogSectionScreenState>, dfa> W() {
        return this.f;
    }

    @Override // xsna.bl50, xsna.uic
    public final void clear() {
        mm50<CatalogSectionState, yda, bea> mm50Var = ((CatalogSectionScreenState) this.b.getCurrentState()).f;
        if (mm50Var != null) {
            mm50Var.clear();
        }
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new mfa(this, null));
        g3q.a(this, new a(null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        CatalogLinkButtonActionDo catalogLinkButtonActionDo;
        bfa bfaVar = (bfa) lj50Var;
        if (bfaVar.equals(bfa.a.b)) {
            c(dfa.a.a);
            return;
        }
        boolean z = bfaVar instanceof bfa.c;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (!z) {
            if (!(bfaVar instanceof bfa.b)) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogButtonDo catalogButtonDo = (CatalogButtonDo) j5g.b0(((bfa.b) bfaVar).b, ((CatalogSectionScreenState) sj50Var.getCurrentState()).d);
            if (catalogButtonDo == null || (catalogLinkButtonActionDo = catalogButtonDo.c) == null) {
                return;
            }
            CatalogSectionState catalogSectionState = ((CatalogSectionScreenState) sj50Var.getCurrentState()).b;
            c(new dfa.b(new bea.a(new r1a.a(catalogLinkButtonActionDo))));
            return;
        }
        yda ydaVar = ((bfa.c) bfaVar).b;
        if (((CatalogSectionScreenState) sj50Var.getCurrentState()).f == null) {
            if (ydaVar instanceof yda.c) {
                g3q.a(this, new mfa(this, null));
            }
        } else {
            mm50<CatalogSectionState, yda, bea> mm50Var = ((CatalogSectionScreenState) sj50Var.getCurrentState()).f;
            if (mm50Var != null) {
                mm50Var.b(ydaVar);
            }
        }
    }
}
