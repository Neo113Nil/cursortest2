package com.yandex.go.loyalty.impl.selector.data;

import com.yandex.go.loyalty.impl.common.data.model.UnbindParam;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyAcceptParam;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramAuthResponse;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateParam;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateResponse;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/LoyaltyApi;", "", "Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyStateParam;", "param", "Lcmt;", "Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyStateResponse;", "d", "(Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyStateParam;)Lcmt;", "Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyAcceptParam;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "c", "(Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyAcceptParam;)Lcmt;", "", "programName", "Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltyProgramAuthResponse;", "b", "(Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/loyalty/impl/common/data/model/UnbindParam;", "a", "(Lcom/yandex/go/loyalty/impl/common/data/model/UnbindParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LoyaltyApi {
    @s490("superapp-loyalty/v1/unbind-loyalty-program")
    cmt<zy11> a(@q76 UnbindParam param);

    @s490("wallet-platform/v1/{loyalty_program_name}/auth")
    cmt<LoyaltyProgramAuthResponse> b(@pq90("loyalty_program_name") String programName);

    @s490("superapp-loyalty/v1/accept")
    cmt<zy11> c(@q76 LoyaltyAcceptParam param);

    @s490("superapp-loyalty/v1/state")
    cmt<LoyaltyStateResponse> d(@q76 LoyaltyStateParam param);
}
