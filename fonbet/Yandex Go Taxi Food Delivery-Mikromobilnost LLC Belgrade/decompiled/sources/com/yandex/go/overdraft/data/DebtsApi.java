package com.yandex.go.overdraft.data;

import com.yandex.go.overdraft.data.model.PayOrderParam;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/overdraft/data/DebtsApi;", "", "Lcom/yandex/go/overdraft/data/model/PayOrderParam;", "p", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Lcom/yandex/go/overdraft/data/model/PayOrderParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DebtsApi {
    @s490("payorder")
    cmt<zy11> a(@q76 PayOrderParam p);
}
