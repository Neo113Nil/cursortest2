package com.yandex.messaging.input.util;

import defpackage.dkx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zq60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.util.KeyboardDetector$keyboardVisibility$2", f = "KeyboardDetector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class KeyboardDetector$keyboardVisibility$2 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardDetector$keyboardVisibility$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyboardDetector$keyboardVisibility$2 keyboardDetector$keyboardVisibility$2 = new KeyboardDetector$keyboardVisibility$2(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        keyboardDetector$keyboardVisibility$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((Number) this.this$0.d.j().getValue()).intValue() == 0) {
            a aVar = this.this$0;
            dkx dkxVar = aVar.c;
            zq60 zq60Var = aVar.b;
            zq60Var.d(dkxVar);
            if (zq60Var.isEmpty()) {
                aVar.a.getViewTreeObserver().removeOnGlobalLayoutListener(aVar.f);
            }
        }
        return zy11.a;
    }
}
