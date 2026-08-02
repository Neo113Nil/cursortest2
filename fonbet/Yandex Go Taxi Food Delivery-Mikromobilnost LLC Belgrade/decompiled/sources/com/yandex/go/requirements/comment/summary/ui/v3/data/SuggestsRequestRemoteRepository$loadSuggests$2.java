package com.yandex.go.requirements.comment.summary.ui.v3.data;

import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentResponseDto;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/SuggestCommentResponseDto;", "<anonymous>", "(Ltse;)Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/SuggestCommentResponseDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.data.SuggestsRequestRemoteRepository$loadSuggests$2", f = "SuggestsRequestRemoteRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuggestsRequestRemoteRepository$loadSuggests$2 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<SuggestCommentResponseDto> $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestsRequestRemoteRepository$loadSuggests$2(cmt cmtVar, Continuation continuation) {
        super(2, continuation);
        this.$request = cmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestsRequestRemoteRepository$loadSuggests$2(this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestsRequestRemoteRepository$loadSuggests$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cmt<SuggestCommentResponseDto> cmtVar = this.$request;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.a(cmtVar, null, this);
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
            failure = (SuggestCommentResponseDto) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "SUMMARY:COMMENT_V3:SUGGEST_COMMENTS_REQUEST_ERROR", null, a, "Failed to load suggests", 2);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
