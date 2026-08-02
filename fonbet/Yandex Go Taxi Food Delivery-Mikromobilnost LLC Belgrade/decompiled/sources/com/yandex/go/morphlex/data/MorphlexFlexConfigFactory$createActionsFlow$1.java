package com.yandex.go.morphlex.data;

import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import defpackage.aks0;
import defpackage.cnr0;
import defpackage.h830;
import defpackage.i830;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.pwy;
import defpackage.t730;
import defpackage.tpr;
import defpackage.u1m;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.morphlex.data.MorphlexFlexConfigFactory$createActionsFlow$1", f = "MorphlexFlexConfigFactory.kt", l = {185, 187, 189, 193, 199}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MorphlexFlexConfigFactory$createActionsFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ h830 $screen;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphlexFlexConfigFactory$createActionsFlow$1(h830 h830Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$screen = h830Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MorphlexFlexConfigFactory$createActionsFlow$1 morphlexFlexConfigFactory$createActionsFlow$1 = new MorphlexFlexConfigFactory$createActionsFlow$1(this.$screen, this.this$0, continuation);
        morphlexFlexConfigFactory$createActionsFlow$1.L$0 = obj;
        return morphlexFlexConfigFactory$createActionsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MorphlexFlexConfigFactory$createActionsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (r1.emit(r7, r18) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r8 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ywl ywlVar;
        Object c;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 4;
        if (i == 0) {
            kotlin.b.b(obj);
            i830 i830Var = this.this$0.f;
            h830 h830Var = this.$screen;
            i830Var.a = h830Var;
            String str = h830Var.g;
            if (str == null || str.length() == 0) {
                str = "(theme bgMinor 0.0p (col (padded 60.0p 12.0p (bone 100.0% 231.0p 16.0p)) (padded 0.0p 12.0p 16.0p 12.0p (bone 100.0% 56.0p 16.0p)) (padded 20.0p 48.0p 0.0p 16.0p (bone 100.0% 16.0p 100.0p)) (space 11.0p) (col (repeat 2 (padded 16.0p 16.0p 0.0p 16.0p (row 100.0% sa (col (bone 50.0% 190.0p 12.0p) (space 6.0p) (padded 0.0p 8.0p 0.0p 0.0p (bone 50.0% 20.0p 10.0p)) (space 4.0p) (padded 0.0p 8.0p 0.0p 0.0p (bone 50.0% 20.0p 10.0p))) (space 12.0p) (col (bone 50.0% 190.0p 12.0p) (space 6.0p) (padded 0.0p 8.0p 0.0p 0.0p (bone 50.0% 20.0p 10.0p)) (space 4.0p) (padded 0.0p 8.0p 0.0p 0.0p (bone 50.0% 20.0p 10.0p)))))))))";
            }
            ywl ywlVar2 = new ywl(new aks0(str, null), t730.INSTANCE, cnr0.b, null, null, null);
            o6s0 o6s0Var = new o6s0(new xzl(ywlVar2, null, null, 30));
            this.L$0 = vprVar;
            this.L$1 = ywlVar2;
            this.label = 1;
            if (vprVar.emit(o6s0Var, this) != coroutineSingletons) {
                ywlVar = ywlVar2;
            }
        }
        if (i != 1) {
            if (i == 2) {
                ywlVar = (ywl) this.L$1;
                kotlin.b.b(obj);
                c = obj;
                u1m u1mVar = (u1m) c;
                if (u1mVar == null) {
                    CloseFlexScreenAction closeFlexScreenAction = new CloseFlexScreenAction();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (vprVar.emit(closeFlexScreenAction, this) == coroutineSingletons) {
                    }
                } else {
                    pwy pwyVar = new pwy(u1mVar, ywlVar, false, i2);
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
            }
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    tpr b = this.this$0.e.b();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    return kotlinx.coroutines.flow.e.u(b, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        ywlVar = (ywl) this.L$1;
        kotlin.b.b(obj);
        e eVar = this.this$0;
        h830 h830Var2 = this.$screen;
        this.L$0 = vprVar;
        this.L$1 = ywlVar;
        this.label = 2;
        c = eVar.c(h830Var2, this);
    }
}
