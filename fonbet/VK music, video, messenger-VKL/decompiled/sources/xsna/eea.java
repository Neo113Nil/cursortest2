package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.domain.CatalogListenEvent$BlockUpdate;
import com.vk.catalog.mvi.domain.CatalogListenEvent$SectionUpdate;
import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.utils.newtork.d;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;
import xsna.ln50;
import xsna.yda;

/* compiled from: CatalogSectionInlineActor.kt */
/* loaded from: classes16.dex */
public final class eea extends bl50<CatalogSectionState, yda, on50, bwj, dwj, bea> {
    public final CatalogSectionParams c;
    public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> d;
    public final s0a e;
    public final zea f;
    public final m7a g;
    public final sj50<CatalogSectionState, on50, ll50<on50, bwj, dwj>, jl50<CatalogSectionState>, bea> h;

    /* compiled from: CatalogSectionInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.CatalogSectionInlineActor$init$2", f = "CatalogSectionInlineActor.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: CatalogSectionInlineActor.kt */
        /* renamed from: xsna.eea$a$a, reason: collision with other inner class name */
        public static final class C2800a<T> implements lsr {
            public final /* synthetic */ eea b;

            public C2800a(eea eeaVar) {
                this.b = eeaVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                y4a y4aVar = (y4a) obj;
                boolean z = y4aVar instanceof CatalogListenEvent$BlockUpdate;
                eea eeaVar = this.b;
                if (z) {
                    Set<String> set = ((CatalogSectionState) eeaVar.b.getCurrentState()).m.c.get((CatalogListenEvent$BlockUpdate) y4aVar);
                    if (set != null) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            yoz.b(eeaVar, (String) it.next());
                        }
                    }
                } else if (y4aVar instanceof CatalogListenEvent$SectionUpdate) {
                    if (((CatalogSectionState) eeaVar.b.getCurrentState()).m.d.contains((CatalogListenEvent$SectionUpdate) y4aVar)) {
                        yoz.c(eeaVar);
                    }
                } else if (y4aVar instanceof nf7) {
                    List<CatalogBlockData> list = ((CatalogSectionState) eeaVar.b.getCurrentState()).d;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (epx.f(((CatalogBlockState) ((CatalogBlockData) it2.next()).b.getValue()).w().getId(), null)) {
                                yoz.b(eeaVar, null);
                                break;
                            }
                        }
                    }
                } else if (y4aVar instanceof j2i0) {
                    if (epx.f(((CatalogSectionState) eeaVar.b.getCurrentState()).c, ((j2i0) y4aVar).b)) {
                        yoz.c(eeaVar);
                    }
                } else {
                    if (y4aVar instanceof aea) {
                        String str = ((CatalogSectionState) eeaVar.b.getCurrentState()).c;
                        throw null;
                    }
                    if (!(y4aVar instanceof rnn0) && !(y4aVar instanceof enn0) && !(y4aVar instanceof sxm0) && !(y4aVar instanceof aea) && !(y4aVar instanceof u580)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return eea.this.new a(spjVar);
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
                ksr<y4a> b = eea.this.g.b();
                C2800a c2800a = new C2800a(eea.this);
                this.label = 1;
                if (b.collect(c2800a, this) == coroutineSingletons) {
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

    /* compiled from: CatalogSectionInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.CatalogSectionInlineActor$init$3", f = "CatalogSectionInlineActor.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: CatalogSectionInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.CatalogSectionInlineActor$init$3$1", f = "CatalogSectionInlineActor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<d.a, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ eea this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(eea eeaVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.this$0 = eeaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(d.a aVar, spj<? super s3q0> spjVar) {
                return ((a) create(aVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                yoz.d(this.this$0);
                return s3q0.a;
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return eea.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.core.utils.newtork.b.a.getClass();
                nb9 a2 = cdn.a(com.vk.core.utils.newtork.b.f());
                a aVar = new a(eea.this, null);
                this.label = 1;
                if (rsr.k(a2, aVar, this) == coroutineSingletons) {
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

    public eea(CatalogSectionParams catalogSectionParams, Map map, s0a s0aVar, zea zeaVar, m7a m7aVar, sj50 sj50Var) {
        super(sj50Var);
        this.c = catalogSectionParams;
        this.d = map;
        this.e = s0aVar;
        this.f = zeaVar;
        this.g = m7aVar;
        this.h = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<CatalogSectionState, on50, ll50<on50, bwj, dwj>, jl50<CatalogSectionState>, bea> W() {
        return this.h;
    }

    @Override // xsna.bl50, xsna.uic
    public final void clear() {
        Iterator<T> it = ((CatalogSectionState) this.b.getCurrentState()).d.iterator();
        while (it.hasNext()) {
            ((CatalogBlockData) it.next()).clear();
        }
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        for (CatalogBlockData catalogBlockData : ((CatalogSectionState) sj50Var.getCurrentState()).d) {
            if (catalogBlockData.c == null) {
                catalogBlockData.c = fto0.g(this, catalogBlockData);
            }
        }
        if (((CatalogSectionState) sj50Var.getCurrentState()).d.isEmpty() || this.c.c) {
            yoz.c(this);
        }
        g3q.a(this, new a(null));
        g3q.a(this, new b(null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        Object obj;
        yda ydaVar = (yda) lj50Var;
        boolean z = ydaVar instanceof yda.a;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            q1a q1aVar = ((yda.a) ydaVar).b;
            Iterator<T> it = ((CatalogSectionState) sj50Var.getCurrentState()).d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((CatalogBlockState) ((CatalogBlockData) obj).b.getValue()).w(), q1aVar.w())) {
                        break;
                    }
                }
            }
            CatalogBlockData catalogBlockData = (CatalogBlockData) obj;
            if (catalogBlockData == null) {
                return;
            }
            if (catalogBlockData.c == null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"SectionInlineActor block data actor is empty for " + catalogBlockData.b.getValue()});
                }
                catalogBlockData.c = fto0.g(this, catalogBlockData);
            }
            s1a<? super CatalogBlockState> s1aVar = catalogBlockData.c;
            if (s1aVar != null) {
                s1aVar.j(q1aVar);
                return;
            }
            return;
        }
        if (ydaVar.equals(yda.b.b)) {
            yoz.a(this);
            return;
        }
        if (ydaVar.equals(yda.e.b)) {
            yoz.c(this);
            return;
        }
        if (ydaVar instanceof yda.c) {
            yoz.d(this);
            return;
        }
        if (!(ydaVar instanceof yda.d)) {
            if (!ydaVar.equals(yda.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogPerformanceMetrics catalogPerformanceMetrics = this.c.g;
            if (catalogPerformanceMetrics != null) {
                catalogPerformanceMetrics.i();
                return;
            }
            return;
        }
        yda.d dVar = (yda.d) ydaVar;
        if (dVar instanceof yda.d.a) {
            if (((CatalogSectionState) sj50Var.getCurrentState()).j) {
                el50.a.b(this, new qw30(dVar, 29));
            }
        } else {
            if (!dVar.equals(yda.d.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogReorderData catalogReorderData = (CatalogReorderData) j5g.a0(((CatalogSectionState) sj50Var.getCurrentState()).l);
            if (catalogReorderData != null) {
                el50.a.a(this, new f730(((CatalogSectionState) sj50Var.getCurrentState()).c), ln50.a.c, new com.vk.movika.sdk.base.ui.s0(25, this, catalogReorderData.b));
            }
        }
    }
}
