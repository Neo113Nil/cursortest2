package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutSlab$setupBottomsSheet$2", f = "RoundaboutSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoundaboutSlab$setupBottomsSheet$2 extends SuspendLambda implements tls {
    final /* synthetic */ VisualProperties $visualProperties;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundaboutSlab$setupBottomsSheet$2(VisualProperties visualProperties, v vVar, Continuation continuation) {
        super(1, continuation);
        this.$visualProperties = visualProperties;
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RoundaboutSlab$setupBottomsSheet$2(this.$visualProperties, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        RoundaboutSlab$setupBottomsSheet$2 roundaboutSlab$setupBottomsSheet$2 = (RoundaboutSlab$setupBottomsSheet$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        roundaboutSlab$setupBottomsSheet$2.invokeSuspend(zy11Var);
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
        if (!this.$visualProperties.getBlockBackButton()) {
            this.this$0.J.a(f2.b);
        }
        return zy11.a;
    }
}
