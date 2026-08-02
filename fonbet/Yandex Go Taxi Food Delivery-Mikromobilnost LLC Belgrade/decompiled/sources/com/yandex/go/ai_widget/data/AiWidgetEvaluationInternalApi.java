package com.yandex.go.ai_widget.data;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationRequestBody;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/ai_widget/data/AiWidgetEvaluationInternalApi;", "", "", "batchId", "", "showOnboarding", "Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;", "body", "Lcmt;", "Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationResponse;", "a", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AiWidgetEvaluationInternalApi {
    @s490("ai-widget/evaluation")
    cmt<AiWidgetEvaluationResponse> a(@djg0("batch_id") String batchId, @djg0("show_onboarding") Boolean showOnboarding, @q76 AiWidgetEvaluationRequestBody body);
}
