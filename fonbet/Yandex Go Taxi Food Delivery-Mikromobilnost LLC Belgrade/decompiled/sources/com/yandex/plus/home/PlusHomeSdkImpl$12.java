package com.yandex.plus.home;

import com.yandex.plus.home.api.PlusSdkComponentLifecycleEvent;
import com.yandex.plus.home.internal.di.i;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4d0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lcom/yandex/plus/home/api/PlusSdkComponentLifecycleEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Ltse;Lcom/yandex/plus/home/api/PlusSdkComponentLifecycleEvent;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$12", f = "PlusHomeSdkImpl.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusHomeSdkImpl$12 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeSdkImpl$12(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusHomeSdkImpl$12 plusHomeSdkImpl$12 = new PlusHomeSdkImpl$12(this.this$0, (Continuation) obj3);
        plusHomeSdkImpl$12.L$0 = (PlusSdkComponentLifecycleEvent) obj2;
        return plusHomeSdkImpl$12.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlusSdkComponentLifecycleEvent plusSdkComponentLifecycleEvent = (PlusSdkComponentLifecycleEvent) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = o4d0.a[plusSdkComponentLifecycleEvent.ordinal()];
            if (i2 == 1) {
                i.a(true);
            } else if (i2 == 2) {
                com.yandex.plus.home.payment.google.a aVar = (com.yandex.plus.home.payment.google.a) this.this$0.f.A.getValue();
                this.L$0 = null;
                this.label = 1;
                if (aVar.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 != 3) {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                i.a(false);
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
