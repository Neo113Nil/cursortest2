package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.zzs;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/PositionChoicesOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Companion", "$serializer", "com/yandex/go/analytics/g", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PositionChoicesOrderAddressAnalyticsData extends e {
    public static final g Companion = new g();
    public final zzs a;
    public final zzs b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public PositionChoicesOrderAddressAnalyticsData(int i, zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4, String str5) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
    }

    @Override // defpackage.hh70
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // defpackage.hh70, defpackage.n7r
    public final LinkedHashMap b() {
        LinkedHashMap b = super.b();
        b.put("choice_id", this.f);
        b.put("point_id", this.g);
        return b;
    }

    @Override // defpackage.hh70
    /* renamed from: e, reason: from getter */
    public final zzs getA() {
        return this.a;
    }

    @Override // defpackage.hh70
    /* renamed from: f */
    public final String getA() {
        return "positionchoice";
    }

    @Override // defpackage.hh70
    /* renamed from: g */
    public final boolean getG() {
        return false;
    }

    @Override // defpackage.hh70
    /* renamed from: getMethod, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.hh70
    /* renamed from: getMyLocation, reason: from getter */
    public final zzs getB() {
        return this.b;
    }

    @Override // defpackage.hh70
    /* renamed from: getScreen, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: h, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: i, reason: from getter */
    public final String getG() {
        return this.g;
    }

    public PositionChoicesOrderAddressAnalyticsData(zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4, String str5) {
        this.a = zzsVar;
        this.b = zzsVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public PositionChoicesOrderAddressAnalyticsData() {
        this(zzs.f, null, null, "", null, "", "");
    }
}
