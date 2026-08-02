package com.yandex.go.scooters.passes.data;

import com.yandex.go.scooters.passes.data.model.PassUpdateAutorenewParams;
import com.yandex.go.scooters.passes.data.model.ScootersPassesFreezeParams;
import com.yandex.go.scooters.passes.data.model.ScootersPassesUnfreezeParams;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.jk90;
import defpackage.mk90;
import defpackage.q76;
import defpackage.qk90;
import defpackage.s490;
import defpackage.uau;
import defpackage.wqs;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/passes/data/ScootersPassesApi;", "", "", "", "headers", "Ljk90;", "passPurchaseParams", "Lcmt;", "Lmk90;", "d", "(Ljava/util/Map;Ljk90;)Lcmt;", "operationId", "Lqk90;", "a", "(Ljava/util/Map;Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/scooters/passes/data/model/PassUpdateAutorenewParams;", "params", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "f", "(Ljava/util/Map;Lcom/yandex/go/scooters/passes/data/model/PassUpdateAutorenewParams;)Lcmt;", "Lcom/yandex/go/scooters/passes/data/model/ScootersPassesFreezeParams;", "e", "(Ljava/util/Map;Lcom/yandex/go/scooters/passes/data/model/ScootersPassesFreezeParams;)Lcmt;", "Lcom/yandex/go/scooters/passes/data/model/ScootersPassesUnfreezeParams;", "b", "(Ljava/util/Map;Lcom/yandex/go/scooters/passes/data/model/ScootersPassesUnfreezeParams;)Lcmt;", "c", "(Ljava/util/Map;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersPassesApi {
    @wqs("scooters/v1/payment/passes/status")
    cmt<qk90> a(@uau Map<String, String> headers, @djg0("operation_id") String operationId);

    @s490("scooters/v1/passes/unfreeze")
    cmt<zy11> b(@uau Map<String, String> headers, @q76 ScootersPassesUnfreezeParams params);

    @s490("scooters/v1/passes/accept-winback")
    cmt<zy11> c(@uau Map<String, String> headers);

    @s490("scooters/v1/payment/passes")
    cmt<mk90> d(@uau Map<String, String> headers, @q76 jk90 passPurchaseParams);

    @s490("scooters/v1/passes/freeze")
    cmt<zy11> e(@uau Map<String, String> headers, @q76 ScootersPassesFreezeParams params);

    @s490("scooters/v1/passes/autorenew/update")
    cmt<zy11> f(@uau Map<String, String> headers, @q76 PassUpdateAutorenewParams params);
}
