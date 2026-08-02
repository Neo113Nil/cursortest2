package com.yandex.go.suggest.impl.data.flex.document;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.bwp0;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1m;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$requestPartialUpdate$2", f = "SuperappSuggestDocumentInteractor.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestDocumentInteractor$requestPartialUpdate$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isImmediate;
    final /* synthetic */ bwp0 $query;
    final /* synthetic */ vpr $this_requestPartialUpdate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$requestPartialUpdate$2$1", f = "SuperappSuggestDocumentInteractor.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$requestPartialUpdate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ u1m $documentQuery;
        final /* synthetic */ boolean $isImmediate;
        final /* synthetic */ bwp0 $query;
        final /* synthetic */ vpr $this_requestPartialUpdate;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, vpr vprVar, bwp0 bwp0Var, u1m u1mVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$this_requestPartialUpdate = vprVar;
            this.$query = bwp0Var;
            this.$documentQuery = u1mVar;
            this.$isImmediate = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$this_requestPartialUpdate, this.$query, this.$documentQuery, this.$isImmediate, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                vpr vprVar = this.$this_requestPartialUpdate;
                bwp0 bwp0Var = this.$query;
                Map map = this.$documentQuery.c;
                String label = SuperappSuggestLabels.AddressSearch.getLabel();
                if (this.$isImmediate) {
                    o430 o430Var = e3n.b;
                    i = 0;
                } else {
                    o430 o430Var2 = e3n.b;
                    i = this.this$0.k;
                }
                long U = kp50.U(i, DurationUnit.MILLISECONDS);
                this.label = 1;
                if (c.c(cVar, vprVar, bwp0Var, map, label, U, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$requestPartialUpdate$2$2", f = "SuperappSuggestDocumentInteractor.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.data.flex.document.SuperappSuggestDocumentInteractor$requestPartialUpdate$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ u1m $documentQuery;
        final /* synthetic */ bwp0 $query;
        final /* synthetic */ vpr $this_requestPartialUpdate;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, vpr vprVar, bwp0 bwp0Var, u1m u1mVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$this_requestPartialUpdate = vprVar;
            this.$query = bwp0Var;
            this.$documentQuery = u1mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$this_requestPartialUpdate, this.$query, this.$documentQuery, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                vpr vprVar = this.$this_requestPartialUpdate;
                bwp0 bwp0Var = this.$query;
                Map map = this.$documentQuery.c;
                String label = SuperappSuggestLabels.ProductsSearch.getLabel();
                o430 o430Var = e3n.b;
                long U = kp50.U(this.this$0.l, DurationUnit.MILLISECONDS);
                this.label = 1;
                if (c.c(cVar, vprVar, bwp0Var, map, label, U, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestDocumentInteractor$requestPartialUpdate$2(c cVar, bwp0 bwp0Var, vpr vprVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$query = bwp0Var;
        this.$this_requestPartialUpdate = vprVar;
        this.$isImmediate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappSuggestDocumentInteractor$requestPartialUpdate$2 superappSuggestDocumentInteractor$requestPartialUpdate$2 = new SuperappSuggestDocumentInteractor$requestPartialUpdate$2(this.this$0, this.$query, this.$this_requestPartialUpdate, this.$isImmediate, continuation);
        superappSuggestDocumentInteractor$requestPartialUpdate$2.L$0 = obj;
        return superappSuggestDocumentInteractor$requestPartialUpdate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestDocumentInteractor$requestPartialUpdate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            bwp0 bwp0Var = this.$query;
            this.L$0 = tseVar;
            this.label = 1;
            obj = cVar.h.a(bwp0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        u1m u1mVar = (u1m) obj;
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$this_requestPartialUpdate, this.$query, u1mVar, this.$isImmediate, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$this_requestPartialUpdate, this.$query, u1mVar, null), 3);
    }
}
