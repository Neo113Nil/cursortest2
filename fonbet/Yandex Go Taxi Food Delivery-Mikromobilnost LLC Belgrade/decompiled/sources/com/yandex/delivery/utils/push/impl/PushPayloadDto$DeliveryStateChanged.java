package com.yandex.delivery.utils.push.impl;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.u2g0;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"com/yandex/delivery/utils/push/impl/PushPayloadDto$DeliveryStateChanged", "Lu2g0;", "", "type", "deliveryId", "", "", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "Lcom/yandex/delivery/utils/push/impl/PushPayloadDto$DeliveryStateChanged;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/delivery/utils/push/impl/PushPayloadDto$DeliveryStateChanged;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getDeliveryId", "Ljava/util/Map;", "getMeta", Constants.PUSH}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PushPayloadDto$DeliveryStateChanged extends u2g0 {
    private final String deliveryId;
    private final Map<String, Object> meta;
    private final String type;

    public PushPayloadDto$DeliveryStateChanged(@Json(name = "type") String str, @Json(name = "delivery_id") String str2, @Json(name = "meta") Map<String, ? extends Object> map) {
        this.type = str;
        this.deliveryId = str2;
        this.meta = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushPayloadDto$DeliveryStateChanged copy$default(PushPayloadDto$DeliveryStateChanged pushPayloadDto$DeliveryStateChanged, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushPayloadDto$DeliveryStateChanged.type;
        }
        if ((i & 2) != 0) {
            str2 = pushPayloadDto$DeliveryStateChanged.deliveryId;
        }
        if ((i & 4) != 0) {
            map = pushPayloadDto$DeliveryStateChanged.meta;
        }
        return pushPayloadDto$DeliveryStateChanged.copy(str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Map<String, Object> component3() {
        return this.meta;
    }

    public final PushPayloadDto$DeliveryStateChanged copy(@Json(name = "type") String type, @Json(name = "delivery_id") String deliveryId, @Json(name = "meta") Map<String, ? extends Object> meta) {
        return new PushPayloadDto$DeliveryStateChanged(type, deliveryId, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPayloadDto$DeliveryStateChanged)) {
            return false;
        }
        PushPayloadDto$DeliveryStateChanged pushPayloadDto$DeliveryStateChanged = (PushPayloadDto$DeliveryStateChanged) other;
        return jl40.l(this.type, pushPayloadDto$DeliveryStateChanged.type) && jl40.l(this.deliveryId, pushPayloadDto$DeliveryStateChanged.deliveryId) && jl40.l(this.meta, pushPayloadDto$DeliveryStateChanged.meta);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final Map<String, Object> getMeta() {
        return this.meta;
    }

    @Override // defpackage.u2g0
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.meta.hashCode() + unr0.b(this.type.hashCode() * 31, 31, this.deliveryId);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.deliveryId;
        return b64.r(b64.v("DeliveryStateChanged(type=", str, ", deliveryId=", str2, ", meta="), this.meta, Extension.C_BRAKE);
    }
}
