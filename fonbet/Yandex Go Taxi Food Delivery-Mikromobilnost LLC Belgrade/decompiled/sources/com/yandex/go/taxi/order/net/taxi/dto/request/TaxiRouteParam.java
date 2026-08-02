package com.yandex.go.taxi.order.net.taxi.dto.request;

import defpackage.gsq0;
import defpackage.zzs;
import java.util.Date;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/request/TaxiRouteParam;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/request/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiRouteParam {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final zzs d;
    public final Date e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ TaxiRouteParam(int i, String str, String str2, String str3, zzs zzsVar, Date date, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = zzsVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = date;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
    }

    public TaxiRouteParam(String str, String str2, String str3, zzs zzsVar, Date date, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzsVar;
        this.e = date;
        this.f = bool;
        this.g = bool2;
    }

    public TaxiRouteParam() {
        this(null, "", null, null, null, null, null);
    }
}
