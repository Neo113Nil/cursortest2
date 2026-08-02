package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.beu;
import defpackage.evu0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.HeaderViewHolder$bindIcons$1", f = "HeaderViewHolder.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class HeaderViewHolder$bindIcons$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $trailIconTag;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder$bindIcons$1(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$trailIconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeaderViewHolder$bindIcons$1(this.this$0, this.$trailIconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderViewHolder$bindIcons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            String str = this.$trailIconTag;
            List list = g.f0;
            gVar.getClass();
            tpr g92Var = (str == null || evu0.J(str)) ? new g92(2, null) : gVar.c0.g(str);
            beu beuVar = new beu(this.this$0, 0);
            this.label = 1;
            if (g92Var.collect(beuVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
