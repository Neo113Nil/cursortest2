package com.yandex.go.zone.dto.response;

import defpackage.b64;
import defpackage.bd61;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/zone/dto/response/ZoneAcceptance$Default", "Lcom/yandex/go/zone/dto/response/p;", "Companion", "IconStyle", "$serializer", "com/yandex/go/zone/dto/response/m", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneAcceptance$Default extends p {
    public static final m Companion = new m();
    public static final i3y[] m = {null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bd61(0))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final IconStyle l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/response/ZoneAcceptance$Default$IconStyle;", "", "Companion", "com/yandex/go/zone/dto/response/n", "LEFT", "CENTER", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class IconStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ IconStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final IconStyle CENTER;
        public static final n Companion;
        public static final IconStyle LEFT;

        static {
            IconStyle iconStyle = new IconStyle("LEFT", 0);
            LEFT = iconStyle;
            IconStyle iconStyle2 = new IconStyle("CENTER", 1);
            CENTER = iconStyle2;
            IconStyle[] iconStyleArr = {iconStyle, iconStyle2};
            $VALUES = iconStyleArr;
            $ENTRIES = kotlin.enums.a.a(iconStyleArr);
            Companion = new n();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bd61(1));
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    public ZoneAcceptance$Default(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, boolean z2, boolean z3, IconStyle iconStyle) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = 86400L;
        } else {
            this.g = j;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z3;
        }
        if ((i & 2048) == 0) {
            this.l = IconStyle.CENTER;
        } else {
            this.l = iconStyle;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneAcceptance$Default)) {
            return false;
        }
        ZoneAcceptance$Default zoneAcceptance$Default = (ZoneAcceptance$Default) obj;
        return jl40.l(this.a, zoneAcceptance$Default.a) && jl40.l(this.b, zoneAcceptance$Default.b) && jl40.l(this.c, zoneAcceptance$Default.c) && jl40.l(this.d, zoneAcceptance$Default.d) && jl40.l(this.e, zoneAcceptance$Default.e) && jl40.l(this.f, zoneAcceptance$Default.f) && this.g == zoneAcceptance$Default.g && this.h == zoneAcceptance$Default.h && jl40.l(this.i, zoneAcceptance$Default.i) && this.j == zoneAcceptance$Default.j && this.k == zoneAcceptance$Default.k && this.l == zoneAcceptance$Default.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int e = unr0.e(qv10.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g), 31, this.h);
        String str6 = this.i;
        return this.l.hashCode() + unr0.e(unr0.e((e + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder v = b64.v("Default(type=", this.a, ", title=", this.b, ", content=");
        g8e.D(v, this.c, ", acceptButton=", this.d, ", cancelButton=");
        g8e.D(v, this.e, ", imageTag=", this.f, ", ttl=");
        v.append(this.g);
        v.append(", isOnDemand=");
        v.append(this.h);
        uw51.x(", webviewUrl=", this.i, ", isCloseButtonVisible=", v, this.j);
        v.append(", isOnBackPressEnabled=");
        v.append(this.k);
        v.append(", iconStyle=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ZoneAcceptance$Default() {
        IconStyle iconStyle = IconStyle.CENTER;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 86400L;
        this.h = false;
        this.i = null;
        this.j = true;
        this.k = true;
        this.l = iconStyle;
    }
}
