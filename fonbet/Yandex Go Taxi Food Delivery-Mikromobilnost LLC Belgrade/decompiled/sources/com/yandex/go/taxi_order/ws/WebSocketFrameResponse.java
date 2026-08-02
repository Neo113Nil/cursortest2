package com.yandex.go.taxi_order.ws;

import defpackage.b64;
import defpackage.b931;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi_order/ws/WebSocketFrameResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi_order/ws/b", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class WebSocketFrameResponse {
    public static final b Companion = new b();
    public static final i3y[] m = {null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(29)), null};
    public final String a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final int l;

    public /* synthetic */ WebSocketFrameResponse(int i, String str, String str2, Integer num, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i2) {
        if (1009 != (i & Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND)) {
            qje.Z(i, Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND, WebSocketFrameResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        if ((i & 1024) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = 0;
        } else {
            this.l = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketFrameResponse)) {
            return false;
        }
        WebSocketFrameResponse webSocketFrameResponse = (WebSocketFrameResponse) obj;
        return jl40.l(this.a, webSocketFrameResponse.a) && jl40.l(this.b, webSocketFrameResponse.b) && jl40.l(this.c, webSocketFrameResponse.c) && this.d == webSocketFrameResponse.d && jl40.l(this.e, webSocketFrameResponse.e) && jl40.l(this.f, webSocketFrameResponse.f) && jl40.l(this.g, webSocketFrameResponse.g) && jl40.l(this.h, webSocketFrameResponse.h) && jl40.l(this.i, webSocketFrameResponse.i) && jl40.l(this.j, webSocketFrameResponse.j) && jl40.l(this.k, webSocketFrameResponse.k) && this.l == webSocketFrameResponse.l;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int e = unr0.e((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        return Integer.hashCode(this.l) + unr0.c((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder v = b64.v("WebSocketFrameResponse(operation=", this.a, ", message=", this.b, ", serverIntervalSec=");
        v.append(this.c);
        v.append(", bright=");
        v.append(this.d);
        v.append(", uid=");
        g8e.D(v, this.e, ", service=", this.f, ", version=");
        g8e.D(v, this.g, ", lcn=", this.h, ", sessionKey=");
        g8e.D(v, this.i, ", serverNotifyId=", this.j, ", tags=");
        v.append(this.k);
        v.append(", position=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
