package com.yandex.go.taxi.order.cancel.similar.notification;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mb9;
import defpackage.mvg;
import defpackage.nb9;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lob9;", "<anonymous>", "(Ltse;)Lob9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.notification.CancelSimilarOrdersNotificationInteractor$downloadIcon$2", f = "CancelSimilarOrdersNotificationInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelSimilarOrdersNotificationInteractor$downloadIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $fallback;
    final /* synthetic */ String $iconTag;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersNotificationInteractor$downloadIcon$2(a aVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$iconTag = str;
        this.$fallback = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelSimilarOrdersNotificationInteractor$downloadIcon$2(this.this$0, this.$iconTag, this.$fallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelSimilarOrdersNotificationInteractor$downloadIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.c;
            String str = this.$iconTag;
            this.label = 1;
            obj = e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        return bitmapDrawable != null ? new mb9(bitmapDrawable) : new nb9(this.$fallback);
    }
}
