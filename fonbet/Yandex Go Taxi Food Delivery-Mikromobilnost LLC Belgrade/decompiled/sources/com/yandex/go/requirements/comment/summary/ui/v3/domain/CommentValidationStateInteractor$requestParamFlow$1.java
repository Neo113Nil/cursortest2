package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.PaymentInfoDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "Lzzs;", "route", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/PaymentInfoDto;", "paymentMethod", "", "tariffClass", "verticalId", "Lkmx0;", DownloadService.KEY_REQUIREMENTS, "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;", "<anonymous>", "(Ljava/util/List;Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/PaymentInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$requestParamFlow$1", f = "CommentValidationStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationStateInteractor$requestParamFlow$1 extends SuspendLambda implements ems {
    final /* synthetic */ String $comment;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$requestParamFlow$1(String str, Continuation continuation) {
        super(6, continuation);
        this.$comment = str;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        CommentValidationStateInteractor$requestParamFlow$1 commentValidationStateInteractor$requestParamFlow$1 = new CommentValidationStateInteractor$requestParamFlow$1(this.$comment, (Continuation) obj6);
        commentValidationStateInteractor$requestParamFlow$1.L$0 = (List) obj;
        commentValidationStateInteractor$requestParamFlow$1.L$1 = (PaymentInfoDto) obj2;
        commentValidationStateInteractor$requestParamFlow$1.L$2 = (String) obj3;
        commentValidationStateInteractor$requestParamFlow$1.L$3 = (String) obj4;
        commentValidationStateInteractor$requestParamFlow$1.L$4 = (List) obj5;
        return commentValidationStateInteractor$requestParamFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        PaymentInfoDto paymentInfoDto = (PaymentInfoDto) this.L$1;
        String str = (String) this.L$2;
        String str2 = (String) this.L$3;
        List list2 = (List) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new ValidateCommentRequestDto(list, this.$comment, str, str2, paymentInfoDto, list2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
