package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class ModuleAdRevenue {
    private final BigDecimal a;
    private final Currency b;
    private final ModuleAdType c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Map j;
    private final boolean k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z) {
        this.a = bigDecimal;
        this.b = currency;
        this.c = moduleAdType;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = map;
        this.k = z;
    }

    public final String getAdNetwork() {
        return this.d;
    }

    public final String getAdPlacementId() {
        return this.g;
    }

    public final String getAdPlacementName() {
        return this.h;
    }

    public final BigDecimal getAdRevenue() {
        return this.a;
    }

    public final ModuleAdType getAdType() {
        return this.c;
    }

    public final String getAdUnitId() {
        return this.e;
    }

    public final String getAdUnitName() {
        return this.f;
    }

    public final boolean getAutoCollected() {
        return this.k;
    }

    public final Currency getCurrency() {
        return this.b;
    }

    public final Map<String, String> getPayload() {
        return this.j;
    }

    public final String getPrecision() {
        return this.i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i, zcl zclVar) {
        this(bigDecimal, currency, (i & 4) != 0 ? null : moduleAdType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? true : z);
    }
}
