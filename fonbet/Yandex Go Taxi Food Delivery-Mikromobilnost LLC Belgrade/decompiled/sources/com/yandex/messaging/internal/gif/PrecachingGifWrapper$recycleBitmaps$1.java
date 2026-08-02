package com.yandex.messaging.internal.gif;

import android.graphics.Bitmap;
import defpackage.che0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ydz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.PrecachingGifWrapper$recycleBitmaps$1", f = "PrecachingGifWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PrecachingGifWrapper$recycleBitmaps$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<che0> $currentFrame;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrecachingGifWrapper$recycleBitmaps$1(Ref$ObjectRef ref$ObjectRef, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$currentFrame = ref$ObjectRef;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrecachingGifWrapper$recycleBitmaps$1(this.$currentFrame, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PrecachingGifWrapper$recycleBitmaps$1 precachingGifWrapper$recycleBitmaps$1 = (PrecachingGifWrapper$recycleBitmaps$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        precachingGifWrapper$recycleBitmaps$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, che0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        if (ydz.a.a()) {
            int i = bVar.c.c;
            ydz.a();
        }
        while (true) {
            Bitmap bitmap = this.$currentFrame.element.a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            Ref$ObjectRef<che0> ref$ObjectRef = this.$currentFrame;
            che0 che0Var = ref$ObjectRef.element;
            ?? r2 = che0Var.c;
            che0Var.c = null;
            if (r2 == 0) {
                return zy11.a;
            }
            ref$ObjectRef.element = r2;
        }
    }
}
