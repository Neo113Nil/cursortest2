package com.yandex.messaging.internal.view.stickers.panel;

import defpackage.mdu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocu0;
import defpackage.vcu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvcu0;", "it", "Lzy11;", "<anonymous>", "(Lvcu0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.stickers.panel.StickerPanelViewController$onBrickAttach$1", f = "StickerPanelViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class StickerPanelViewController$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPanelViewController$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StickerPanelViewController$onBrickAttach$1 stickerPanelViewController$onBrickAttach$1 = new StickerPanelViewController$onBrickAttach$1(this.this$0, continuation);
        stickerPanelViewController$onBrickAttach$1.L$0 = obj;
        return stickerPanelViewController$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StickerPanelViewController$onBrickAttach$1 stickerPanelViewController$onBrickAttach$1 = (StickerPanelViewController$onBrickAttach$1) create((vcu0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        stickerPanelViewController$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        vcu0 vcu0Var = (vcu0) this.L$0;
        a aVar = this.this$0;
        aVar.B = vcu0Var;
        ocu0 ocu0Var = aVar.z;
        ocu0Var.c = vcu0Var.x;
        ocu0Var.notifyDataSetChanged();
        mdu0 mdu0Var = aVar.y;
        mdu0Var.c = vcu0Var.w;
        mdu0Var.notifyDataSetChanged();
        return zy11.a;
    }
}
