package com.yandex.go.parks.nearest.data.models;

import com.yandex.go.address.models.Address;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/parks/nearest/data/models/NotSupportedAddressException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/yandex/go/address/models/Address;", "address", "Lcom/yandex/go/address/models/Address;", "a", "()Lcom/yandex/go/address/models/Address;", "Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "nearestZoneResponse", "Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "b", "()Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotSupportedAddressException extends RuntimeException {
    private final Address address;
    private final NearestZoneResponse nearestZoneResponse;

    public NotSupportedAddressException(Address address, NearestZoneResponse nearestZoneResponse) {
        this.address = address;
        this.nearestZoneResponse = nearestZoneResponse;
    }

    /* renamed from: a, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final NearestZoneResponse getNearestZoneResponse() {
        return this.nearestZoneResponse;
    }
}
