package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.JsonMap;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xuf0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0012\b\u0001\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0012\b\u0003\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR \u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "", "type", "", "name", "payload", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getName", "getPayload", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AiBotDirective {

    @xuf0(tag = 2)
    private final String name;

    @xuf0(encoding = 1, tag = 3)
    private final Map<String, ?> payload;

    @xuf0(tag = 1)
    private final String type;

    public AiBotDirective(@Json(name = "Type") String str, @Json(name = "Name") String str2, @JsonMap @Json(name = "Payload") Map<String, ?> map) {
        this.type = str;
        this.name = str2;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiBotDirective copy$default(AiBotDirective aiBotDirective, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiBotDirective.type;
        }
        if ((i & 2) != 0) {
            str2 = aiBotDirective.name;
        }
        if ((i & 4) != 0) {
            map = aiBotDirective.payload;
        }
        return aiBotDirective.copy(str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, ?> component3() {
        return this.payload;
    }

    public final AiBotDirective copy(@Json(name = "Type") String type, @Json(name = "Name") String name, @JsonMap @Json(name = "Payload") Map<String, ?> payload) {
        return new AiBotDirective(type, name, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiBotDirective)) {
            return false;
        }
        AiBotDirective aiBotDirective = (AiBotDirective) other;
        return jl40.l(this.type, aiBotDirective.type) && jl40.l(this.name, aiBotDirective.name) && jl40.l(this.payload, aiBotDirective.payload);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, ?> getPayload() {
        return this.payload;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.payload.hashCode() + unr0.b(this.type.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.name;
        return b64.r(b64.v("AiBotDirective(type=", str, ", name=", str2, ", payload="), this.payload, Extension.C_BRAKE);
    }
}
