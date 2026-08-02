package com.yandex.payment.divkit.exitscreen;

import com.yandex.payment.divkit.usecases.g;
import defpackage.cnk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.tse;
import defpackage.u2l;
import defpackage.wls;
import defpackage.xmo;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.exitscreen.ExitScreenViewModel$loadAndShowDivJson$1", f = "ExitScreenViewModel.kt", l = {58, 59}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class ExitScreenViewModel$loadAndShowDivJson$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ xmo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitScreenViewModel$loadAndShowDivJson$1(xmo xmoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xmoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitScreenViewModel$loadAndShowDivJson$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitScreenViewModel$loadAndShowDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r8 == r0) goto L19;
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
            b.b(obj);
            xmo xmoVar = this.this$0;
            g gVar = xmoVar.b;
            boolean z = xmoVar.x;
            u2l u2lVar = xmoVar.w;
            this.label = 1;
            obj = gVar.b(z, u2lVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            b.b(obj);
        }
        xmo xmoVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        Object emit = xmoVar2.y.emit(new cnk((omk) obj, Collections.singletonList(new Pair("exit_screen_is_payment", String.valueOf(xmoVar2.x)))), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
