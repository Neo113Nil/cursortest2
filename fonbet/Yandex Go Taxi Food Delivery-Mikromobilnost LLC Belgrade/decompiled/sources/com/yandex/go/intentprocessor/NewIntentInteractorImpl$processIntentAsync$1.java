package com.yandex.go.intentprocessor;

import android.content.Intent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.NewIntentInteractorImpl$processIntentAsync$1", f = "NewIntentInteractorImpl.kt", l = {43, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class NewIntentInteractorImpl$processIntentAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ wls $onProcessed;
    Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewIntentInteractorImpl$processIntentAsync$1(k kVar, Intent intent, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$intent = intent;
        this.$onProcessed = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewIntentInteractorImpl$processIntentAsync$1(this.this$0, this.$intent, this.$onProcessed, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NewIntentInteractorImpl$processIntentAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.invoke((defpackage.o5u) r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6 == r0) goto L15;
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
            k kVar = this.this$0;
            Intent intent = this.$intent;
            this.label = 1;
            obj = k.a(kVar, intent, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        wls wlsVar = this.$onProcessed;
        this.L$0 = null;
        this.label = 2;
    }
}
