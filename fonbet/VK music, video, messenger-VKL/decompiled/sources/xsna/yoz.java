package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.catalog.mvi.section.domain.CatalogBlockDo;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bea;
import xsna.el50;
import xsna.ln50;

/* compiled from: LoadDelegate.kt */
/* loaded from: classes16.dex */
public final class yoz {

    /* compiled from: LoadDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$loadNextSection$2", f = "LoadDelegate.kt", l = {204}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $nextFrom;
        final /* synthetic */ eea $this_loadNextSection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eea eeaVar, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_loadNextSection = eeaVar;
            this.$nextFrom = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_loadNextSection, this.$nextFrom, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eea eeaVar = this.$this_loadNextSection;
                zea zeaVar = eeaVar.f;
                String str = ((CatalogSectionState) eeaVar.b.getCurrentState()).c;
                String str2 = this.$nextFrom;
                this.label = 1;
                d = zeaVar.d(str, str2, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                d = ((Result) obj).d();
            }
            eea eeaVar2 = this.$this_loadNextSection;
            if (!(d instanceof Result.Failure)) {
                fto0.s(eeaVar2, new hxl((CatalogSectionDo) d, 14));
            }
            eea eeaVar3 = this.$this_loadNextSection;
            Throwable a = Result.a(d);
            if (a != null) {
                wik wikVar = new wik(a, 18);
                eeaVar3.getClass();
                el50.a.b(eeaVar3, wikVar);
            }
            return s3q0.a;
        }
    }

    /* compiled from: LoadDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$refreshBlock$2$1", f = "LoadDelegate.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $blockId;
        final /* synthetic */ eea $this_refreshBlock;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eea eeaVar, String str, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_refreshBlock = eeaVar;
            this.$blockId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_refreshBlock, this.$blockId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zea zeaVar = this.$this_refreshBlock.f;
                String str = this.$blockId;
                this.label = 1;
                b = zeaVar.b(str, null, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                b = ((Result) obj).d();
            }
            eea eeaVar = this.$this_refreshBlock;
            String str2 = this.$blockId;
            if (!(b instanceof Result.Failure)) {
                CatalogBlockDo catalogBlockDo = (CatalogBlockDo) b;
                wxm wxmVar = new wxm(new ArrayList(((CatalogSectionState) eeaVar.b.getCurrentState()).d));
                wxmVar.a(Collections.singletonList(str2), catalogBlockDo.b, new n1g0(0));
                fto0.s(eeaVar, new eaa(19, wxmVar, catalogBlockDo));
            }
            eea eeaVar2 = this.$this_refreshBlock;
            Throwable a = Result.a(b);
            if (a != null) {
                String str3 = ((CatalogSectionState) eeaVar2.b.getCurrentState()).c;
                eeaVar2.c(new bea.b(a));
            }
            return s3q0.a;
        }
    }

    /* compiled from: LoadDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$refreshSection$1", f = "LoadDelegate.kt", l = {108}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super Result<?>>, Object> {
        final /* synthetic */ eea $this_refreshSection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(eea eeaVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$this_refreshSection = eeaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$this_refreshSection, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<?>> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                CatalogPerformanceMetrics catalogPerformanceMetrics = this.$this_refreshSection.c.g;
                if (catalogPerformanceMetrics != null) {
                    catalogPerformanceMetrics.f();
                }
                eea eeaVar = this.$this_refreshSection;
                zea zeaVar = eeaVar.f;
                String str = ((CatalogSectionState) eeaVar.b.getCurrentState()).c;
                this.label = 1;
                d = zeaVar.d(str, null, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                d = ((Result) obj).d();
            }
            eea eeaVar2 = this.$this_refreshSection;
            if (!(d instanceof Result.Failure)) {
                CatalogSectionDo catalogSectionDo = (CatalogSectionDo) d;
                CatalogPerformanceMetrics catalogPerformanceMetrics2 = eeaVar2.c.g;
                if (catalogPerformanceMetrics2 != null) {
                    catalogPerformanceMetrics2.c();
                }
                ArrayList arrayList = new ArrayList(((CatalogSectionState) eeaVar2.b.getCurrentState()).d);
                wxm wxmVar = new wxm(arrayList);
                List<CatalogBlockState> list = catalogSectionDo.c;
                arrayList.clear();
                List<CatalogBlockState> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (CatalogBlockState catalogBlockState : list2) {
                    CatalogBlockData catalogBlockData = (CatalogBlockData) ((LinkedHashMap) wxmVar.c).get(catalogBlockState.w());
                    if (catalogBlockData != null) {
                        s1a<? super CatalogBlockState> s1aVar = catalogBlockData.c;
                        if (s1aVar != null) {
                            s1aVar.M(catalogBlockState);
                        }
                    } else {
                        catalogBlockData = new CatalogBlockData(catalogBlockState);
                    }
                    arrayList2.add(catalogBlockData);
                }
                arrayList.addAll(arrayList2);
                fto0.s(eeaVar2, new u9(20, wxmVar, catalogSectionDo));
            }
            return new Result(d);
        }
    }

    /* compiled from: LoadDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.section.impl.ui.store.delegate.LoadDelegateKt$sectionModificationTask$2", f = "LoadDelegate.kt", l = {234}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wzs<yvj, spj<? super Result<?>>, Object> $block;
        final /* synthetic */ eea $this_sectionModificationTask;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(wzs<? super yvj, ? super spj<? super Result<?>>, ? extends Object> wzsVar, eea eeaVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$block = wzsVar;
            this.$this_sectionModificationTask = eeaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            d dVar = new d(this.$block, this.$this_sectionModificationTask, spjVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                wzs<yvj, spj<? super Result<?>>, Object> wzsVar = this.$block;
                this.L$0 = null;
                this.label = 1;
                obj = wzsVar.invoke(yvjVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            Object d = ((Result) obj).d();
            eea eeaVar = this.$this_sectionModificationTask;
            Throwable a = Result.a(d);
            if (a != null) {
                srg srgVar = new srg(a, 25);
                eeaVar.getClass();
                el50.a.b(eeaVar, srgVar);
            }
            return s3q0.a;
        }
    }

    public static final void a(eea eeaVar) {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = eeaVar.b;
        String str = ((CatalogSectionState) sj50Var.getCurrentState()).m.b;
        if (str == null || sj50Var.h(new f730(((CatalogSectionState) sj50Var.getCurrentState()).c))) {
            return;
        }
        CatalogSectionState catalogSectionState = (CatalogSectionState) sj50Var.getCurrentState();
        eeaVar.f(eeaVar, new dqz(catalogSectionState.c, catalogSectionState.m.b), ln50.a.b, new g22(new xgv(eeaVar, 6), new a(eeaVar, str, null)));
    }

    public static final void b(eea eeaVar, String str) {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = eeaVar.b;
        List<CatalogBlockData> list = ((CatalogSectionState) sj50Var.getCurrentState()).d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (epx.f(((CatalogBlockState) ((CatalogBlockData) it.next()).b.getValue()).w().getId(), str)) {
                el50.a.a(eeaVar, new f730(((CatalogSectionState) sj50Var.getCurrentState()).c), ln50.a.b, new z5a(17, eeaVar, str));
                return;
            }
        }
    }

    public static final void c(eea eeaVar) {
        e(eeaVar, new c(eeaVar, null));
    }

    public static final void d(eea eeaVar) {
        if (((CatalogSectionState) eeaVar.b.getCurrentState()).h != null) {
            c(eeaVar);
        } else if (((CatalogSectionState) eeaVar.b.getCurrentState()).i != null) {
            a(eeaVar);
        }
    }

    public static final void e(eea eeaVar, wzs<? super yvj, ? super spj<? super Result<?>>, ? extends Object> wzsVar) {
        CatalogSectionState catalogSectionState = (CatalogSectionState) eeaVar.b.getCurrentState();
        eeaVar.g(new dqz(catalogSectionState.c, catalogSectionState.m.b));
        eeaVar.f(eeaVar, new f730(((CatalogSectionState) eeaVar.b.getCurrentState()).c), ln50.a.c, new g22(new ozh(eeaVar, 26), new d(wzsVar, eeaVar, null)));
    }
}
