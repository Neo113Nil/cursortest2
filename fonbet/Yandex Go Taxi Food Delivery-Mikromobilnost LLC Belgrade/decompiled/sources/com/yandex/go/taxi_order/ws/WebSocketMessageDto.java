package com.yandex.go.taxi_order.ws;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import defpackage.qje;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi_order/ws/WebSocketMessageDto;", "", "Companion", "$serializer", "com/yandex/go/taxi_order/ws/c", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class WebSocketMessageDto {
    public static final c Companion = new c();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final kotlinx.serialization.json.c i;

    public /* synthetic */ WebSocketMessageDto(int i, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, Long l, kotlinx.serialization.json.c cVar) {
        if (511 != (i & 511)) {
            qje.Z(i, 511, WebSocketMessageDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = l;
        this.i = cVar;
    }

    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.json.c getI() {
        return this.i;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketMessageDto)) {
            return false;
        }
        WebSocketMessageDto webSocketMessageDto = (WebSocketMessageDto) obj;
        return jl40.l(this.a, webSocketMessageDto.a) && jl40.l(this.b, webSocketMessageDto.b) && jl40.l(this.c, webSocketMessageDto.c) && jl40.l(this.d, webSocketMessageDto.d) && jl40.l(this.e, webSocketMessageDto.e) && jl40.l(this.f, webSocketMessageDto.f) && jl40.l(this.g, webSocketMessageDto.g) && jl40.l(this.h, webSocketMessageDto.h) && jl40.l(this.i, webSocketMessageDto.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.h;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.i;
        return hashCode8 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("WebSocketMessageDto(id=", this.b, this.a, ", action=", ", ttl=");
        tse0.w(this.c, ", clientId=", this.d, ", type=", q);
        g8e.D(q, this.e, ", timestamp=", this.f, ", version=");
        q.append(this.g);
        q.append(", pushTs=");
        q.append(this.h);
        q.append(", data=");
        q.append(this.i);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
