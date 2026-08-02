package com.yandex.go.about;

import com.yandex.go.about.domain.d;
import defpackage.b5;
import defpackage.c5;
import defpackage.d6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.about.AboutComposeRouter$content$1$1$1", f = "AboutComposeRouter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AboutComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d6 $it;
    final /* synthetic */ b5 $navigator;
    int label;
    final /* synthetic */ c5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutComposeRouter$content$1$1$1(c5 c5Var, d6 d6Var, b5 b5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c5Var;
        this.$it = d6Var;
        this.$navigator = b5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AboutComposeRouter$content$1$1$1(this.this$0, this.$it, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AboutComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d dVar = this.this$0.H;
            d6 d6Var = this.$it;
            b5 b5Var = this.$navigator;
            this.label = 1;
            if (dVar.a(d6Var, b5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
