package com.yandex.go.requirements.comment.summary.ui.v3.data;

import com.yandex.go.requirements.comment.summary.ui.v3.data.net.api.AIRequirementsCommentApi;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.ValidateCommentResponseDto;
import defpackage.cmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/ValidateCommentResponseDto;", "<anonymous>", "(Ltse;)Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/ValidateCommentResponseDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.data.CommentValidationRemoteRepository$validateComment$2", f = "CommentValidationRemoteRepository.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationRemoteRepository$validateComment$2 extends SuspendLambda implements wls {
    final /* synthetic */ ValidateCommentRequestDto $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationRemoteRepository$validateComment$2(a aVar, ValidateCommentRequestDto validateCommentRequestDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = validateCommentRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommentValidationRemoteRepository$validateComment$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentValidationRemoteRepository$validateComment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                cmt<ValidateCommentResponseDto> b = ((AIRequirementsCommentApi) aVar.c.getValue()).b(this.$request);
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.d(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = (ValidateCommentResponseDto) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "SUMMARY:COMMENT_V3:COMMENT_VALIDATE_REQUEST_ERROR", null, a, "Failed validate comment request", 2);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
