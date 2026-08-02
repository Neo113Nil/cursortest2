package com.yandex.go.personal_goals_v2.data;

import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptParam;
import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/personal_goals_v2/data/PersonalGoalsInternalApi;", "", "Lcom/yandex/go/personal_goals_v2/data/model/PersonalGoalAcceptParam;", "param", "Lcmt;", "Lcom/yandex/go/personal_goals_v2/data/model/PersonalGoalAcceptResponse;", "a", "(Lcom/yandex/go/personal_goals_v2/data/model/PersonalGoalAcceptParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PersonalGoalsInternalApi {
    @s490("superapp-missions/v1/missions/accept")
    cmt<PersonalGoalAcceptResponse> a(@q76 PersonalGoalAcceptParam param);
}
