package com.yandex.go.chargers.debt.data;

import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusParams;
import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse;
import com.yandex.go.chargers.debt.screen.data.model.ChargersDebtPayOffParams;
import com.yandex.go.chargers.debt.screen.data.model.ChargersDebtPayOffResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/debt/data/ChargersDebtApi;", "", "Lcom/yandex/go/chargers/debt/screen/data/model/ChargersDebtPayOffParams;", "params", "Lcmt;", "Lcom/yandex/go/chargers/debt/screen/data/model/ChargersDebtPayOffResponse;", "a", "(Lcom/yandex/go/chargers/debt/screen/data/model/ChargersDebtPayOffParams;)Lcmt;", "Lcom/yandex/go/chargers/debt/data/model/ChargersDebtStatusParams;", "Lcom/yandex/go/chargers/debt/data/model/ChargersDebtStatusResponse;", "b", "(Lcom/yandex/go/chargers/debt/data/model/ChargersDebtStatusParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersDebtApi {
    @s490("chargers/v1/debts/pay")
    cmt<ChargersDebtPayOffResponse> a(@q76 ChargersDebtPayOffParams params);

    @s490("chargers/v1/debts/status")
    cmt<ChargersDebtStatusResponse> b(@q76 ChargersDebtStatusParams params);
}
