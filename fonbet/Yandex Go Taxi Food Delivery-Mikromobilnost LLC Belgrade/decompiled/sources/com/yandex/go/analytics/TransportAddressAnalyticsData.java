package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.n7r;
import defpackage.zzs;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/TransportAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Ln7r;", "Companion", "$serializer", "com/yandex/go/analytics/j", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransportAddressAnalyticsData extends e implements n7r {
    public static final j Companion = new j();
    public final String a;
    public final zzs b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final zzs g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public TransportAddressAnalyticsData(int i, String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3, String str5, String str6, String str7, String str8, String str9, String str10) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = zzs.f;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = zzs.f;
        } else {
            this.g = zzsVar3;
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
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
    }

    @Override // defpackage.hh70
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // defpackage.hh70, defpackage.n7r
    public final LinkedHashMap b() {
        LinkedHashMap b = super.b();
        String str = this.h;
        if (str != null) {
            b.put("transport_final_suggest_trace_id", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            b.put("point_id", str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            b.put("choice_id", str3);
        }
        String str4 = this.m;
        if (str4 != null) {
            b.put("Type", str4);
        }
        String str5 = this.k;
        if (str5 != null) {
            b.put("ShortcutID", str5);
        }
        String str6 = this.l;
        if (str6 != null) {
            b.put("GridID", str6);
        }
        return b;
    }

    @Override // defpackage.n7r
    /* renamed from: d, reason: from getter */
    public final zzs getG() {
        return this.g;
    }

    @Override // defpackage.hh70
    /* renamed from: e, reason: from getter */
    public final zzs getB() {
        return this.b;
    }

    @Override // defpackage.hh70
    /* renamed from: f, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.hh70
    /* renamed from: g */
    public final boolean getH() {
        return false;
    }

    @Override // defpackage.hh70
    /* renamed from: getMethod, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // defpackage.hh70
    /* renamed from: getMyLocation, reason: from getter */
    public final zzs getC() {
        return this.c;
    }

    @Override // defpackage.hh70
    /* renamed from: getScreen, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public TransportAddressAnalyticsData(String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = zzsVar3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransportAddressAnalyticsData() {
        this("", r2, null, null, "", null, r2, null, null, null, null, null, null);
        zzs zzsVar = zzs.f;
    }
}
