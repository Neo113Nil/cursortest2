package com.yandex.go.navigator.main_screen;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Loe50;", "<anonymous>", "(Ltse;)Loe50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainScreenRootRouter$initFromAddress$1$address$1", f = "MainScreenRootRouter.kt", l = {120, 120}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainScreenRootRouter$initFromAddress$1$address$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenRootRouter$initFromAddress$1$address$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenRootRouter$initFromAddress$1$address$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenRootRouter$initFromAddress$1$address$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.address.a aVar = this.this$0.J;
            this.label = 1;
            obj = aVar.b(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return new oe50((Address) obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        oe50 oe50Var = (oe50) obj;
        if (oe50Var != null) {
            return oe50Var;
        }
        com.yandex.go.navigator.domain.b bVar = this.this$0.K;
        this.label = 2;
        obj = bVar.a(this);
    }
}
