package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.n7r;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/DeeplinkFinalizedOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Ln7r;", "Companion", "$serializer", "com/yandex/go/analytics/c", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkFinalizedOrderAddressAnalyticsData extends e implements n7r {
    public static final c Companion = new c();
    public final String a;
    public final zzs b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final zzs g;
    public final boolean h;

    public DeeplinkFinalizedOrderAddressAnalyticsData(int i, String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3, boolean z) {
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
            this.h = false;
        } else {
            this.h = z;
        }
    }

    @Override // defpackage.hh70
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
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
    /* renamed from: g, reason: from getter */
    public final boolean getH() {
        return this.h;
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

    public DeeplinkFinalizedOrderAddressAnalyticsData(String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, zzs zzsVar3) {
        this.a = str;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = zzsVar3;
        this.h = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeeplinkFinalizedOrderAddressAnalyticsData() {
        this("", r2, null, null, "", null, r2);
        zzs zzsVar = zzs.f;
    }
}
