package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.zcl;
import yads.k4;

/* loaded from: classes8.dex */
public final class AdRequestConfiguration {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final Location f;
    private final Map g;
    private final String h;
    private final AdTheme i;

    public static final class Builder {
        private final String a;
        private String b;
        private String c;
        private Location d;
        private String e;
        private List f;
        private Map g;
        private String h;
        private AdTheme i;

        public Builder(String str) {
            this.a = str;
        }

        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.a, this.b, this.c, this.e, this.f, this.d, this.g, this.h, this.i, null);
        }

        public final Builder setBiddingData(String str) {
            this.h = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.g = map;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, zcl zclVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdRequestConfiguration.class.equals(obj.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
            if (epx.f(this.a, adRequestConfiguration.a) && epx.f(this.b, adRequestConfiguration.b) && epx.f(this.c, adRequestConfiguration.c) && epx.f(this.d, adRequestConfiguration.d) && epx.f(this.e, adRequestConfiguration.e) && epx.f(this.f, adRequestConfiguration.f) && epx.f(this.g, adRequestConfiguration.g) && epx.f(this.h, adRequestConfiguration.h) && this.i == adRequestConfiguration.i) {
                return true;
            }
        }
        return false;
    }

    public final String getAdUnitId() {
        return this.a;
    }

    public final String getAge() {
        return this.b;
    }

    public final String getBiddingData() {
        return this.h;
    }

    public final String getContextQuery() {
        return this.d;
    }

    public final List<String> getContextTags() {
        return this.e;
    }

    public final String getGender() {
        return this.c;
    }

    public final Location getLocation() {
        return this.f;
    }

    public final Map<String, String> getParameters() {
        return this.g;
    }

    public final AdTheme getPreferredTheme() {
        return this.i;
    }

    public int hashCode() {
        String str = this.b;
        int a = k4.a(this.a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.c;
        int hashCode = (a + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f;
        int hashCode4 = (hashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.g;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.i;
        return hashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = location;
        this.g = map;
        this.h = str5;
        this.i = adTheme;
    }
}
