package com.yandex.go.rida.bids.data;

import com.yandex.go.rida.bids.data.model.AcceptBidParam;
import com.yandex.go.rida.bids.data.model.ChangeAutoAcceptParam;
import com.yandex.go.rida.bids.data.model.IncreasePassengerPriceParam;
import com.yandex.go.rida.bids.data.model.RejectBidParam;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0005\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/yandex/go/rida/bids/data/BidsApi;", "", "", "idempotencyToken", "Lcom/yandex/go/rida/bids/data/model/IncreasePassengerPriceParam;", "param", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "c", "(Ljava/lang/String;Lcom/yandex/go/rida/bids/data/model/IncreasePassengerPriceParam;)Lcmt;", "Lcom/yandex/go/rida/bids/data/model/ChangeAutoAcceptParam;", "a", "(Lcom/yandex/go/rida/bids/data/model/ChangeAutoAcceptParam;)Lcmt;", "Lcom/yandex/go/rida/bids/data/model/RejectBidParam;", "d", "(Lcom/yandex/go/rida/bids/data/model/RejectBidParam;)Lcmt;", "Lcom/yandex/go/rida/bids/data/model/AcceptBidParam;", "b", "(Lcom/yandex/go/rida/bids/data/model/AcceptBidParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BidsApi {
    @s490("/rida/v2/change_autoaccept")
    cmt<zy11> a(@q76 ChangeAutoAcceptParam param);

    @s490("/rida/v2/accept_bid")
    cmt<zy11> b(@q76 AcceptBidParam param);

    @s490("/rida/v2/increase_passenger_price")
    cmt<zy11> c(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 IncreasePassengerPriceParam param);

    @s490("/rida/v2/reject_bid")
    cmt<zy11> d(@q76 RejectBidParam param);
}
