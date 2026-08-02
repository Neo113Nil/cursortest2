package com.yandex.go.taxi.order.communications;

import defpackage.dpf0;
import defpackage.ipf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1", f = "DeeplinkArrowButtonCommunicationsViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ CommunicationItem $item;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1(i iVar, CommunicationItem communicationItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$item = communicationItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1 deeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1 = (DeeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deeplinkArrowButtonCommunicationsViewHolder$reportPromoPlaqueShown$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DriveState c;
        String name;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        ipf0 ipf0Var = iVar.n0;
        String str2 = this.$item.a;
        int G = iVar.G();
        Locale locale = Locale.ROOT;
        List singletonList = Collections.singletonList("DEEPLINK".toLowerCase(locale));
        o2y0 o2y0Var = this.this$0.k0;
        String str3 = o2y0Var != null ? o2y0Var.b().a : null;
        o2y0 o2y0Var2 = this.this$0.k0;
        if (o2y0Var2 != null && (c = o2y0Var2.c()) != null && (name = c.name()) != null) {
            str = name.toLowerCase(locale);
        }
        ipf0Var.b(new dpf0(str2, str3, str, G, singletonList, this.$item.k), this.this$0.m0);
        return zy11.a;
    }
}
