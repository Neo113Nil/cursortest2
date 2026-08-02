package androidx.compose.animation.core;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class Animatable$snapTo$2 extends SuspendLambda implements tls {
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(a aVar, Object obj, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$targetValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Animatable$snapTo$2 animatable$snapTo$2 = (Animatable$snapTo$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        animatable$snapTo$2.invokeSuspend(zy11Var);
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
        a.b(this.this$0);
        Object a = a.a(this.this$0, this.$targetValue);
        this.this$0.d.k(a);
        this.this$0.f.setValue(a);
        return zy11.a;
    }
}
