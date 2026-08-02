package com.yandex.go.chargers.order.completion.pre_finish.data;

import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishProgressResponse;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersFinishResponse;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishParams;
import com.yandex.go.chargers.order.completion.pre_finish.data.model.ChargersPreFinishResponse;
import defpackage.cmt;
import defpackage.n851;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\t\u0010\nJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/data/ChargersFinishApi;", "", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishParams;", "params", "", "", "headers", "Lcmt;", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishResponse;", "b", "(Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersPreFinishParams;Ljava/util/Map;)Lcmt;", "Lkotlinx/serialization/json/b;", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersFinishResponse;", "c", "(Lkotlinx/serialization/json/b;Ljava/util/Map;)Lcmt;", "Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ChargersFinishProgressResponse;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersFinishApi {
    @n851
    @s490("chargers/v1/station/return-powerbank/wait")
    cmt<ChargersFinishProgressResponse> a(@q76 b params, @uau Map<String, String> headers);

    @n851
    @s490("chargers/v1/station/pre-finish-order")
    cmt<ChargersPreFinishResponse> b(@q76 ChargersPreFinishParams params, @uau Map<String, String> headers);

    @n851
    @s490("chargers/v1/station/return-powerbank")
    cmt<ChargersFinishResponse> c(@q76 b params, @uau Map<String, String> headers);
}
