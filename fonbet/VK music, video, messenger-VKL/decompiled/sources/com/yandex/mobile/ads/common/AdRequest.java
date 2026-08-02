package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class AdRequest {
    private final String a;
    private final String b;
    private final Location c;
    private final String d;
    private final List e;
    private final Map f;
    private final String g;
    private final AdTheme h;

    public static final class Builder {
        private String a;
        private String b;
        private Location c;
        private String d;
        private List e;
        private Map f;
        private String g;
        private AdTheme h;

        public final AdRequest build() {
            return new AdRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
        }

        public final Builder setBiddingData(String str) {
            this.g = str;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f = map;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, zcl zclVar) {
        this(str, str2, str3, str4, list, location, map, adTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdRequest.class.equals(obj.getClass())) {
            AdRequest adRequest = (AdRequest) obj;
            if (epx.f(this.a, adRequest.a) && epx.f(this.b, adRequest.b) && epx.f(this.d, adRequest.d) && epx.f(this.e, adRequest.e) && epx.f(this.c, adRequest.c) && epx.f(this.f, adRequest.f) && epx.f(this.g, adRequest.g) && this.h == adRequest.h) {
                return true;
            }
        }
        return false;
    }

    public final String getAge() {
        return this.a;
    }

    public final String getBiddingData() {
        return this.g;
    }

    public final String getContextQuery() {
        return this.d;
    }

    public final List<String> getContextTags() {
        return this.e;
    }

    public final String getGender() {
        return this.b;
    }

    public final Location getLocation() {
        return this.c;
    }

    public final Map<String, String> getParameters() {
        return this.f;
    }

    public final AdTheme getPreferredTheme() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.c;
        int hashCode5 = (hashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.h;
        return hashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequest(String str, String str2, String str3, String str4, List list, Location location, Map map, AdTheme adTheme) {
        this.a = str;
        this.b = str2;
        this.c = location;
        this.d = str3;
        this.e = list;
        this.f = map;
        this.g = str4;
        this.h = adTheme;
    }
}
