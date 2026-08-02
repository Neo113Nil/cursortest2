package com.yandex.go.taxi.order.feedback.data;

import com.yandex.div.state.db.StateEntry;
import com.yandex.go.taxi.order.feedback.data.model.FeedbackProposalParam;
import com.yandex.go.taxi.order.feedback.data.model.FeedbackProposalResponse;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/data/FeedbackSurveyApi;", "", "", StateEntry.COLUMN_PATH, "Lcom/yandex/go/taxi/order/feedback/data/model/FeedbackProposalParam;", "param", "Lcmt;", "Lcom/yandex/go/taxi/order/feedback/data/model/FeedbackProposalResponse;", "a", "(Ljava/lang/String;Lcom/yandex/go/taxi/order/feedback/data/model/FeedbackProposalParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface FeedbackSurveyApi {
    @s490("{path}")
    cmt<FeedbackProposalResponse> a(@pq90(encoded = true, value = "path") String path, @q76 FeedbackProposalParam param);
}
