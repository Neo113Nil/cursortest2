package com.yandex.go.requirements.comment.summary.ui.v3.data.net.api;

import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.SuggestCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentResponseDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.ValidateCommentResponseDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/api/AIRequirementsCommentApi;", "", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/SuggestCommentRequestDto;", "request", "Lcmt;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/SuggestCommentResponseDto;", "a", "(Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/SuggestCommentRequestDto;)Lcmt;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/ValidateCommentResponseDto;", "b", "(Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AIRequirementsCommentApi {
    @s490("user-state/v1/suggested-comments")
    cmt<SuggestCommentResponseDto> a(@q76 SuggestCommentRequestDto request);

    @s490("/user-state/v1/validate-comment")
    cmt<ValidateCommentResponseDto> b(@q76 ValidateCommentRequestDto request);
}
