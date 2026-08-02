package com.ybsdk.screens.notice.data;

import com.ybsdk.screens.divbottomsheet.DivBottomSheetResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;", "entityResult", "Lahk;", "<anonymous>", "(Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;)Lahk;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.notice.data.TopupNoticeRepository$getTopupNotice$3$1", f = "TopupNoticeRepository.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TopupNoticeRepository$getTopupNotice$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TopupNoticeRepository$getTopupNotice$3$1 topupNoticeRepository$getTopupNotice$3$1 = new TopupNoticeRepository$getTopupNotice$3$1(2, continuation);
        topupNoticeRepository$getTopupNotice$3$1.L$0 = obj;
        return topupNoticeRepository$getTopupNotice$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopupNoticeRepository$getTopupNotice$3$1) create((DivBottomSheetResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        DivBottomSheetResponse divBottomSheetResponse = (DivBottomSheetResponse) this.L$0;
        this.label = 1;
        Object a = com.ybsdk.screens.divbottomsheet.b.a(divBottomSheetResponse, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
