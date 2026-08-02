package com.yandex.go.analytics;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/SimpleOrderAddressAnalyticsData;", "Lcom/yandex/go/analytics/e;", "Companion", "$serializer", "com/yandex/go/analytics/i", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimpleOrderAddressAnalyticsData extends e {
    public static final i Companion = new i();
    public final String a;
    public final zzs b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public SimpleOrderAddressAnalyticsData(int i, String str, zzs zzsVar, zzs zzsVar2, String str2, String str3, String str4, boolean z) {
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
            this.g = false;
        } else {
            this.g = z;
        }
    }

    @Override // defpackage.hh70
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
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
    public final boolean getG() {
        return this.g;
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

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleOrderAddressAnalyticsData() {
        this(HProv.PP_VERSION_TIMESTAMP, null, 0 == true ? 1 : 0);
    }

    public SimpleOrderAddressAnalyticsData(zzs zzsVar, zzs zzsVar2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = false;
    }

    public /* synthetic */ SimpleOrderAddressAnalyticsData(int i, zzs zzsVar, String str) {
        this((i & 2) != 0 ? zzs.f : zzsVar, null, (i & 1) != 0 ? "" : "taxiontheway", null, (i & 16) != 0 ? "" : str, null);
    }
}
