package com.yandex.go.flex.main_screen.presentation;

import defpackage.aa00;
import defpackage.ajr;
import defpackage.b5q0;
import defpackage.bvf0;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.hst;
import defpackage.jse;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s630;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1m;
import defpackage.ute0;
import defpackage.voh;
import defpackage.wls;
import defpackage.zir;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.experiments.superapp.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$2", f = "MainScreenFlexSdkPresenter.kt", l = {143, 151, 157}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexSdkPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ l8x $showInitialDocumentJob;
    final /* synthetic */ jse $startAppDispatcher;
    final /* synthetic */ com.yandex.go.flex.main_screen.utils.query.a $startAppQuery;
    final /* synthetic */ b5q0 $trigger;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ aa00 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$2$1", f = "MainScreenFlexSdkPresenter.kt", l = {160}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ute0 $preparedQuery;
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aa00 aa00Var, ute0 ute0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
            this.$preparedQuery = ute0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$preparedQuery, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.flex.main_screen.interactors.c cVar = this.this$0.B;
                u1m u1mVar = this.$preparedQuery.a;
                this.label = 1;
                if (cVar.a(u1mVar, this) == coroutineSingletons) {
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
    public MainScreenFlexSdkPresenter$attachView$2(aa00 aa00Var, com.yandex.go.flex.main_screen.utils.query.a aVar, b5q0 b5q0Var, l8x l8xVar, jse jseVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aa00Var;
        this.$startAppQuery = aVar;
        this.$trigger = b5q0Var;
        this.$showInitialDocumentJob = l8xVar;
        this.$startAppDispatcher = jseVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenFlexSdkPresenter$attachView$2(this.this$0, this.$startAppQuery, this.$trigger, this.$showInitialDocumentJob, this.$startAppDispatcher, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexSdkPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        voh vohVar;
        long j;
        Object a;
        ute0 ute0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ajr ajrVar = this.this$0.J;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(new mth(ajrVar.b, 6), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ute0Var = (ute0) this.L$2;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue() && this.$showInitialDocumentJob.isActive()) {
                        aa00 aa00Var = this.this$0;
                        tje.M(aa00Var.y, this.$startAppDispatcher, CoroutineStart.UNDISPATCHED, new AnonymousClass1(aa00Var, ute0Var, null));
                    }
                    return zy11Var;
                }
                j = this.J$0;
                vohVar = (voh) this.L$1;
                kotlin.b.b(obj);
                ute0 ute0Var2 = (ute0) obj;
                hst hstVar = jst.e;
                e3n.p(f8z0.a(j));
                hstVar.getClass();
                vohVar.b.T(ute0Var2);
                k kVar = this.this$0.Z;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = ute0Var2;
                this.J$0 = j;
                this.label = 3;
                a = kVar.a(this);
                if (a != coroutineSingletons) {
                    ute0Var = ute0Var2;
                    obj = a;
                    if (((Boolean) obj).booleanValue()) {
                        aa00 aa00Var2 = this.this$0;
                        tje.M(aa00Var2.y, this.$startAppDispatcher, CoroutineStart.UNDISPATCHED, new AnonymousClass1(aa00Var2, ute0Var, null));
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        zir zirVar = (zir) obj;
        if (!bvf0.G(this.this$0.P, zirVar)) {
            this.$startAppQuery.b();
            return zy11Var;
        }
        vohVar = new voh(zirVar.c());
        com.yandex.go.flex.main_screen.utils.query.a aVar = this.$startAppQuery;
        aVar.b.set(vohVar);
        aVar.a.j0();
        long a2 = s630.a();
        com.yandex.go.flex.main_screen.interactors.d dVar = this.this$0.A;
        List singletonList = Collections.singletonList(this.$trigger.a);
        zzs a3 = zirVar.a();
        this.L$0 = null;
        this.L$1 = vohVar;
        this.J$0 = a2;
        this.label = 2;
        obj = dVar.a(a3, singletonList, this);
        if (obj != coroutineSingletons) {
            j = a2;
            ute0 ute0Var22 = (ute0) obj;
            hst hstVar2 = jst.e;
            e3n.p(f8z0.a(j));
            hstVar2.getClass();
            vohVar.b.T(ute0Var22);
            k kVar2 = this.this$0.Z;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ute0Var22;
            this.J$0 = j;
            this.label = 3;
            a = kVar2.a(this);
            if (a != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
