package com.yandex.fintechsdk.features.splash.internal.presentation;

import android.content.Context;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqt0;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv7w;", "Lzy11;", "Lzrt0;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.splash.internal.presentation.SplashViewModel$initViewModel$1", f = "SplashViewModel.kt", l = {58, 66}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SplashViewModel$initViewModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$initViewModel$1(b bVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SplashViewModel$initViewModel$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashViewModel$initViewModel$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.B.getClass();
            b bVar = this.this$0;
            Context context = this.$context;
            this.label = 1;
            obj = b.Y(bVar, context, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sqt0 sqt0Var = this.this$0.D;
                if (booleanValue) {
                    sqt0Var.b();
                    return zy11Var;
                }
                sqt0Var.D();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        b bVar2 = this.this$0;
        if (!booleanValue2) {
            bVar2.D.a();
            return zy11Var;
        }
        this.label = 2;
        obj = b.X(bVar2, this);
    }
}
