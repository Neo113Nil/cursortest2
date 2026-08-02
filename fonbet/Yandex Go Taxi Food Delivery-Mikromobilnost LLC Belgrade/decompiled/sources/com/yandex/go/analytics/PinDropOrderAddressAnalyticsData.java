package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.zzs;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/PinDropOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Companion", "$serializer", "com/yandex/go/analytics/f", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PinDropOrderAddressAnalyticsData extends e {
    public static final f Companion = new f();
    public final zzs a;
    public final zzs b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;

    public PinDropOrderAddressAnalyticsData(int i, zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
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
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
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
        b.put("action", this.f);
        b.put("clarify_points", Boolean.valueOf(this.g));
        String str = this.h;
        if (str != null) {
            b.put("pin_drop_trace_id", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            b.put("pickup_point_id", str2);
        }
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
        return "pin_drop";
    }

    @Override // defpackage.hh70
    /* renamed from: g, reason: from getter */
    public final boolean getG() {
        return this.g;
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

    public PinDropOrderAddressAnalyticsData(zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.a = zzsVar;
        this.b = zzsVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
    }

    public PinDropOrderAddressAnalyticsData() {
        this(zzs.f, null, null, "", null, "", false, null, null);
    }
}
