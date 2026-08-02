package com.yandex.messaging.internal.view.timeline;

import defpackage.mvg;
import defpackage.mw10;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLinksEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.BaseGalleryMessageViewHolder$bind$3$1", f = "BaseGalleryMessageViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseGalleryMessageViewHolder$bind$3$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGalleryMessageViewHolder$bind$3$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseGalleryMessageViewHolder$bind$3$1 baseGalleryMessageViewHolder$bind$3$1 = new BaseGalleryMessageViewHolder$bind$3$1(this.this$0, continuation);
        baseGalleryMessageViewHolder$bind$3$1.Z$0 = ((Boolean) obj).booleanValue();
        return baseGalleryMessageViewHolder$bind$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        BaseGalleryMessageViewHolder$bind$3$1 baseGalleryMessageViewHolder$bind$3$1 = (BaseGalleryMessageViewHolder$bind$3$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseGalleryMessageViewHolder$bind$3$1.invokeSuspend(zy11Var);
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
        boolean z = this.Z$0;
        mw10 mw10Var = this.this$0.O0;
        if (mw10Var != null && mw10Var.y != z) {
            mw10Var.y = z;
            mw10Var.d();
        }
        return zy11.a;
    }
}
