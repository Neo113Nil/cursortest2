package com.yandex.plus.home.common.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "O", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.common.utils.StartForResultHelper$startActivityForResult$1", f = "StartForResultHelper.kt", l = {44, 44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class StartForResultHelper$startActivityForResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ x40 $activityResultContract;
    final /* synthetic */ Object $input;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartForResultHelper$startActivityForResult$1(d dVar, x40 x40Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$activityResultContract = x40Var;
        this.$input = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StartForResultHelper$startActivityForResult$1 startForResultHelper$startActivityForResult$1 = new StartForResultHelper$startActivityForResult$1(this.this$0, this.$activityResultContract, this.$input, continuation);
        startForResultHelper$startActivityForResult$1.L$0 = obj;
        return startForResultHelper$startActivityForResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StartForResultHelper$startActivityForResult$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r8 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            x40 x40Var = this.$activityResultContract;
            Object obj2 = this.$input;
            this.L$0 = vprVar;
            this.label = 1;
            b = dVar.b(x40Var, obj2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        if (!(b instanceof Result.Failure)) {
            this.L$0 = null;
            this.L$1 = b;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 2;
        }
        return zy11.a;
    }
}
