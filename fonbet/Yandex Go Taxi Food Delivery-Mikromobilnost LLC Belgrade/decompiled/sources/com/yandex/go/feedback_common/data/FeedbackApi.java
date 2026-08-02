package com.yandex.go.feedback_common.data;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.data.model.UpdateTipsParams;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/feedback_common/data/FeedbackApi;", "", "Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "productsParam", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Lcom/yandex/go/feedback_common/data/model/FeedbackParam;)Lcmt;", "Lcom/yandex/go/feedback_common/data/model/UpdateTipsParams;", "routeEtaParam", "a", "(Lcom/yandex/go/feedback_common/data/model/UpdateTipsParams;)Lcmt;", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FeedbackApi {
    @s490("updatetips")
    cmt<zy11> a(@q76 UpdateTipsParams routeEtaParam);

    @s490("feedback")
    cmt<zy11> b(@q76 FeedbackParam productsParam);
}
