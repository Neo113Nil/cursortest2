package com.yandex.go.scooters.ignition.data;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionParams;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/ScootersIgnitionApi;", "", "", "", "headers", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionParams;", "scootersIgnitionParams", "Lcmt;", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionResponse;", "a", "(Ljava/util/Map;Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersIgnitionApi {
    @s490("scooters/v1/ignition-key")
    cmt<ScootersIgnitionResponse> a(@uau Map<String, String> headers, @q76 ScootersIgnitionParams scootersIgnitionParams);
}
