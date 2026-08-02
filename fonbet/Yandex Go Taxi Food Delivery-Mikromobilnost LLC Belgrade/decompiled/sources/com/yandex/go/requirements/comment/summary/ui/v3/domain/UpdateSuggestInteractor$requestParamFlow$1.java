package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.SuggestCommentRequestDto;
import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lzzs;", "route", "", "zone", "tariffClass", "verticalId", "Lkmx0;", DownloadService.KEY_REQUIREMENTS, "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/SuggestCommentRequestDto;", "<anonymous>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/SuggestCommentRequestDto;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.UpdateSuggestInteractor$requestParamFlow$1", f = "UpdateSuggestInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class UpdateSuggestInteractor$requestParamFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    public UpdateSuggestInteractor$requestParamFlow$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        UpdateSuggestInteractor$requestParamFlow$1 updateSuggestInteractor$requestParamFlow$1 = new UpdateSuggestInteractor$requestParamFlow$1((Continuation) obj6);
        updateSuggestInteractor$requestParamFlow$1.L$0 = (List) obj;
        updateSuggestInteractor$requestParamFlow$1.L$1 = (String) obj2;
        updateSuggestInteractor$requestParamFlow$1.L$2 = (String) obj3;
        updateSuggestInteractor$requestParamFlow$1.L$3 = (String) obj4;
        updateSuggestInteractor$requestParamFlow$1.L$4 = (List) obj5;
        return updateSuggestInteractor$requestParamFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        String str2 = (String) this.L$2;
        String str3 = (String) this.L$3;
        List list2 = (List) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new SuggestCommentRequestDto(str, list2, str2, list, str3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
