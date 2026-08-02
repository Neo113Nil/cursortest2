package com.yandex.plus.pay.ui.core.mobile.domain;

import defpackage.dgd0;
import defpackage.fgd0;
import defpackage.ggd0;
import defpackage.hgd0;
import defpackage.igd0;
import defpackage.kgd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zgd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkgd0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.mobile.domain.PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1", f = "PlusPayToolbarStateInteractorImpl.kt", l = {16, 23}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1 plusPayToolbarStateInteractorImpl$getToolbarStateFlow$1 = new PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1(this.this$0, continuation);
        plusPayToolbarStateInteractorImpl$getToolbarStateFlow$1.L$0 = obj;
        return plusPayToolbarStateInteractorImpl$getToolbarStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPayToolbarStateInteractorImpl$getToolbarStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r9 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.plus.pay.ui.core.internal.common.a aVar = this.this$0.a;
            this.L$0 = vprVar;
            this.label = 1;
            obj = aVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        zgd0 zgd0Var = (zgd0) obj;
        this.this$0.getClass();
        ggd0 fgd0Var = (zgd0Var == null || (str2 = zgd0Var.d) == null) ? dgd0.a : new fgd0(str2, zgd0Var.c);
        this.this$0.getClass();
        kgd0 kgd0Var = new kgd0(fgd0Var, (zgd0Var == null || (str = zgd0Var.b) == null) ? hgd0.a : new igd0(str));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
