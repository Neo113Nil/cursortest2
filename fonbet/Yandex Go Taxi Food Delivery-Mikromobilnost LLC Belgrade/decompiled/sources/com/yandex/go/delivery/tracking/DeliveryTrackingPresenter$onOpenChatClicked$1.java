package com.yandex.go.delivery.tracking;

import com.yandex.messenger.websdk.api.ChatRequest;
import defpackage.bui;
import defpackage.f8b;
import defpackage.g8b;
import defpackage.h8b;
import defpackage.hxx;
import defpackage.j470;
import defpackage.j8b;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8b;
import defpackage.pep0;
import defpackage.rkb1;
import defpackage.tse;
import defpackage.v120;
import defpackage.w511;
import defpackage.wls;
import defpackage.x2i;
import defpackage.z220;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.DeliveryTrackingPresenter$onOpenChatClicked$1", f = "DeliveryTrackingPresenter.kt", l = {397}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryTrackingPresenter$onOpenChatClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ j470 $action;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTrackingPresenter$onOpenChatClicked$1(l lVar, j470 j470Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$action = j470Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryTrackingPresenter$onOpenChatClicked$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryTrackingPresenter$onOpenChatClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatRequest chatRequest;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ChatRequest chatRequest2 = null;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            rkb1 rkb1Var = this.$action.b.b;
            lVar.getClass();
            if (rkb1Var instanceof h8b) {
                chatRequest2 = new f8b(((h8b) rkb1Var).a);
            } else if (rkb1Var instanceof g8b) {
                chatRequest2 = new j8b(((g8b) rkb1Var).a);
            } else if (!(rkb1Var instanceof o8b)) {
                w511.b();
                return null;
            }
            if (chatRequest2 != null) {
                ru.yandex.taxi.messenger.a aVar = this.this$0.N;
                this.L$0 = chatRequest2;
                this.label = 1;
                obj = aVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chatRequest = chatRequest2;
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ChatRequest chatRequest3 = (ChatRequest) this.L$0;
        kotlin.b.b(obj);
        chatRequest = chatRequest3;
        if (((Boolean) obj).booleanValue()) {
            j470 j470Var = this.$action;
            z220 z220Var = j470Var.b;
            v120 v120Var = z220Var.a;
            x2i x2iVar = new x2i(chatRequest, v120Var.a, v120Var.b, v120Var.c, z220Var.c, j470Var.d);
            bui buiVar = (bui) this.this$0.C;
            ((pep0) buiVar.p).f((m950) buiVar.g.get(), x2iVar, hxx.a);
            return zy11Var;
        }
        return zy11Var;
    }
}
