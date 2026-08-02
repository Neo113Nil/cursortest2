package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.n7r;
import defpackage.zzs;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/ShortcutOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Ln7r;", "Companion", "$serializer", "com/yandex/go/analytics/h", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShortcutOrderAddressAnalyticsData extends e implements n7r {
    public static final h Companion = new h();
    public final zzs a;
    public final zzs b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ShortcutOrderAddressAnalyticsData(int i, zzs zzsVar, zzs zzsVar2, zzs zzsVar3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = zzs.f;
        } else {
            this.b = zzsVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str6;
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
        b.put("Type", this.i);
        b.put("ShortcutID", this.h);
        b.put("GridID", this.g);
        return b;
    }

    @Override // defpackage.n7r
    /* renamed from: d, reason: from getter */
    public final zzs getB() {
        return this.b;
    }

    @Override // defpackage.hh70
    /* renamed from: e, reason: from getter */
    public final zzs getA() {
        return this.a;
    }

    @Override // defpackage.hh70
    /* renamed from: f */
    public final String getA() {
        return "shortcut";
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

    /* renamed from: h, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: i, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: j, reason: from getter */
    public final String getI() {
        return this.i;
    }

    public ShortcutOrderAddressAnalyticsData(zzs zzsVar, zzs zzsVar2, zzs zzsVar3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = zzsVar;
        this.b = zzsVar2;
        this.c = zzsVar3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShortcutOrderAddressAnalyticsData() {
        this(r1, r1, null, null, "", null, "", "", "");
        zzs zzsVar = zzs.f;
    }
}
