package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$LogoPosition;
import defpackage.jpr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.tcu;
import defpackage.tse;
import defpackage.ucu;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvcu;", "<anonymous>", "(Ltse;)Lvcu;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$initHeaderType$1", f = "SuperAppMainScreenViewRouter.kt", l = {411, 415}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenViewRouter$initHeaderType$1 extends SuspendLambda implements wls {
    boolean Z$0;
    int label;
    final /* synthetic */ o4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenViewRouter$initHeaderType$1(o4w0 o4w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenViewRouter$initHeaderType$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenViewRouter$initHeaderType$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r5 == r0) goto L19;
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
            jpr jprVar = this.this$0.b0;
            this.label = 1;
            obj = jprVar.a.c(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return new ucu((SuperAppLogoPositionRepository$LogoPosition) obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            return tcu.a;
        }
        com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a aVar = this.this$0.c0;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = aVar.d.a(this);
    }
}
