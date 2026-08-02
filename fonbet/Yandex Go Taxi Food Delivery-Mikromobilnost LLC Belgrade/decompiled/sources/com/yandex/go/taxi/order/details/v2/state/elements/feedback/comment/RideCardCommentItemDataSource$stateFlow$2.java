package com.yandex.go.taxi.order.details.v2.state.elements.feedback.comment;

import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$FeedbackModels$Titles;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$PlainComment;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.ibk0;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lbk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppa1;
import defpackage.wdk0;
import defpackage.wls;
import defpackage.xdk0;
import defpackage.xng0;
import defpackage.yjk0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwdk0;", "payload", "Lzjk0;", "<anonymous>", "(Lwdk0;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.comment.RideCardCommentItemDataSource$stateFlow$2", f = "RideCardCommentItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCommentItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$PlainComment $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCommentItemDataSource$stateFlow$2(RideCardItemDto$PlainComment rideCardItemDto$PlainComment, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$PlainComment;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCommentItemDataSource$stateFlow$2 rideCardCommentItemDataSource$stateFlow$2 = new RideCardCommentItemDataSource$stateFlow$2(this.$item, this.this$0, continuation);
        rideCardCommentItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardCommentItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCommentItemDataSource$stateFlow$2) create((wdk0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        wdk0 wdk0Var = (wdk0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean c = ppa1.c(wdk0Var.a, this.$item.e);
        RideCardItemDto$PlainComment rideCardItemDto$PlainComment = this.$item;
        if (!c) {
            return new yjk0(rideCardItemDto$PlainComment.a);
        }
        Iterator it = rideCardItemDto$PlainComment.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (ppa1.c(wdk0Var.a, ((RideCardItemDto$FeedbackModels$Titles) obj2).b)) {
                break;
            }
        }
        RideCardItemDto$FeedbackModels$Titles rideCardItemDto$FeedbackModels$Titles = (RideCardItemDto$FeedbackModels$Titles) obj2;
        String str = rideCardItemDto$FeedbackModels$Titles != null ? rideCardItemDto$FeedbackModels$Titles.a : null;
        String h = ((avj0) this.this$0.d).h(kyh0.comment_hint);
        e eVar = this.this$0.c;
        RideCardItemDto$PlainComment.Properties properties = this.$item.c;
        kdc a = eVar.a(properties != null ? properties.a : null);
        if (a == null) {
            a = new bdc(xng0.controlMinor);
        }
        kdc kdcVar = a;
        lbk0 lbk0Var = this.this$0.b;
        b2 b2Var = this.$item.d;
        lbk0Var.getClass();
        ibk0 b = lbk0.b(b2Var);
        TaxiOrder b2 = this.this$0.a.b();
        b2.j = new TaxiOrderAdditionalData(b2.b().a, str);
        RideCardItemDto$PlainComment rideCardItemDto$PlainComment2 = this.$item;
        return new xdk0(rideCardItemDto$PlainComment2.a, rideCardItemDto$PlainComment2.b, str, h, wdk0Var.b, kdcVar, b);
    }
}
