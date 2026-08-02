package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7r;
import defpackage.zzs;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/ListBasedOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Ln7r;", "Companion", "$serializer", "com/yandex/go/analytics/d", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListBasedOrderAddressAnalyticsData extends e implements n7r {
    public static final d Companion = new d();
    public final String a;
    public final zzs b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final zzs g;
    public final int h;
    public final String i;
    public final boolean j;
    public final String k;

    public ListBasedOrderAddressAnalyticsData(int i, String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3, int i2, String str5, boolean z, String str6) {
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
            this.h = 0;
        } else {
            this.h = i2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
    }

    @Override // defpackage.hh70
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.f;
    }

    @Override // defpackage.hh70, defpackage.n7r
    public final LinkedHashMap b() {
        LinkedHashMap b = super.b();
        b.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, Integer.valueOf(this.h));
        b.put("clarify_points", Boolean.valueOf(this.j));
        String str = this.i;
        if (str != null) {
            b.put("action", str);
        }
        String h = h();
        if (h != null) {
            b.put("zero_suggest_trace_id", h);
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
    public final zzs getA() {
        return this.b;
    }

    @Override // defpackage.hh70
    /* renamed from: f, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.hh70
    /* renamed from: g, reason: from getter */
    public final boolean getG() {
        return this.j;
    }

    @Override // defpackage.hh70
    /* renamed from: getMethod, reason: from getter */
    public final String getC() {
        return this.d;
    }

    @Override // defpackage.hh70
    /* renamed from: getMyLocation, reason: from getter */
    public final zzs getB() {
        return this.c;
    }

    @Override // defpackage.hh70
    /* renamed from: getScreen, reason: from getter */
    public final String getD() {
        return this.e;
    }

    public final String h() {
        if (jl40.l(this.a, "zerosuggest")) {
            return this.k;
        }
        return null;
    }

    public ListBasedOrderAddressAnalyticsData(String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3, int i, boolean z, String str5) {
        this.a = str;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = zzsVar3;
        this.h = i;
        this.i = null;
        this.j = z;
        this.k = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListBasedOrderAddressAnalyticsData() {
        this("", r2, null, null, "", null, r2, 0, false, null);
        zzs zzsVar = zzs.f;
    }
}
