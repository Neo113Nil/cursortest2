package ru.ok.android.webrtc.signaling.api;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import xsna.de;
import xsna.efz;
import xsna.epx;
import xsna.jax0;
import xsna.mq;
import xsna.n6j;
import xsna.nyh0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class EndpointParameters {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final List f;
    public final String g;
    public final Long h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final Integer m;
    public final String n;
    public final String o;
    public final String p;
    public final Locale q;
    public final String r;
    public final long s;

    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public int d;
        public String e;
        public List f;
        public String g;
        public Long h;
        public String i;
        public String j;
        public int k;
        public String l;
        public Integer m;
        public String n;
        public String o;
        public String p;
        public Locale q;
        public long r;
        public String s;

        public final EndpointParameters build() {
            Objects.requireNonNull(this.a, "conversation id must not be null");
            Objects.requireNonNull(this.e, "endpointBaseUrl must not be null");
            Objects.requireNonNull(this.g, "appVersion must not be null");
            Objects.requireNonNull(this.i, "clientType must not be null");
            Objects.requireNonNull(this.l, "capabilities must not be null");
            return new EndpointParameters(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.r, null);
        }

        public final Builder setAppVersion(String str) {
            this.g = str;
            return this;
        }

        public final Builder setCapabilities(String str) {
            this.l = str;
            return this;
        }

        public final Builder setClientType(String str) {
            this.i = str;
            return this;
        }

        public final Builder setCompression(String str) {
            this.s = str;
            return this;
        }

        public final Builder setConversationId(String str) {
            this.a = str;
            return this;
        }

        public final Builder setDeviceIdx(int i) {
            this.d = i;
            return this;
        }

        public final Builder setEndpointBaseUrl(String str) {
            this.e = str;
            return this;
        }

        public final Builder setEndpointIPs(List<String> list) {
            this.f = list;
            return this;
        }

        public final Builder setIspAsNo(Integer num) {
            this.m = num;
            return this;
        }

        public final Builder setIspAsOrg(String str) {
            this.n = str;
            return this;
        }

        public final Builder setLocCc(String str) {
            this.o = str;
            return this;
        }

        public final Builder setLocReg(String str) {
            this.p = str;
            return this;
        }

        public final Builder setLocale(Locale locale) {
            this.q = locale;
            return this;
        }

        public final Builder setPeerid(Long l) {
            this.h = l;
            return this;
        }

        public final Builder setProtocolVersion(int i) {
            this.k = i;
            return this;
        }

        public final Builder setRecoverTs(long j) {
            this.r = j;
            return this;
        }

        public final Builder setStartUrlType(String str) {
            this.j = str;
            return this;
        }

        public final Builder setToken(String str) {
            this.b = str;
            return this;
        }

        public final Builder setUserId(String str) {
            this.c = str;
            return this;
        }
    }

    public static final class Name {
        public static final String APP_VERSION = "appVersion";
        public static final String CAPABILITIES = "capabilities";
        public static final String CLIENT_TYPE = "clientType";
        public static final String COMPRESSION = "compression";
        public static final String CONVERSATION_ID = "conversationId";
        public static final String DEVICE = "device";
        public static final String DEVICE_IDX = "deviceIdx";
        public static final Name INSTANCE = new Name();
        public static final String ISP_AS_NO = "ispAsNo";
        public static final String ISP_AS_ORG = "ispAsOrg";
        public static final String LOCALE = "locale";
        public static final String LOC_CC = "locCc";
        public static final String LOC_REG = "locReg";
        public static final String OS_VERSION = "osVersion";
        public static final String PEER_ID = "peerId";
        public static final String PLATFORM = "platform";
        public static final String RECOVER_TS = "recoverTs";
        public static final String TGT = "tgt";
        public static final String TOKEN = "token";
        public static final String USER_ID = "userId";
        public static final String VERSION = "version";
    }

    public /* synthetic */ EndpointParameters(String str, String str2, String str3, int i, String str4, List list, String str5, Long l, String str6, String str7, int i2, String str8, Integer num, String str9, String str10, String str11, Locale locale, String str12, long j, zcl zclVar) {
        this(str, str2, str3, i, str4, list, str5, l, str6, str7, i2, str8, num, str9, str10, str11, locale, str12, j);
    }

    public static /* synthetic */ EndpointParameters copy$default(EndpointParameters endpointParameters, String str, String str2, String str3, int i, String str4, List list, String str5, Long l, String str6, String str7, int i2, String str8, Integer num, String str9, String str10, String str11, Locale locale, String str12, long j, int i3, Object obj) {
        long j2;
        String str13;
        String str14;
        String str15 = (i3 & 1) != 0 ? endpointParameters.a : str;
        String str16 = (i3 & 2) != 0 ? endpointParameters.b : str2;
        String str17 = (i3 & 4) != 0 ? endpointParameters.c : str3;
        int i4 = (i3 & 8) != 0 ? endpointParameters.d : i;
        String str18 = (i3 & 16) != 0 ? endpointParameters.e : str4;
        List list2 = (i3 & 32) != 0 ? endpointParameters.f : list;
        String str19 = (i3 & 64) != 0 ? endpointParameters.g : str5;
        Long l2 = (i3 & 128) != 0 ? endpointParameters.h : l;
        String str20 = (i3 & 256) != 0 ? endpointParameters.i : str6;
        String str21 = (i3 & 512) != 0 ? endpointParameters.j : str7;
        int i5 = (i3 & 1024) != 0 ? endpointParameters.k : i2;
        String str22 = (i3 & 2048) != 0 ? endpointParameters.l : str8;
        Integer num2 = (i3 & 4096) != 0 ? endpointParameters.m : num;
        String str23 = (i3 & 8192) != 0 ? endpointParameters.n : str9;
        String str24 = str15;
        String str25 = (i3 & 16384) != 0 ? endpointParameters.o : str10;
        String str26 = (i3 & 32768) != 0 ? endpointParameters.p : str11;
        Locale locale2 = (i3 & 65536) != 0 ? endpointParameters.q : locale;
        String str27 = (i3 & 131072) != 0 ? endpointParameters.r : str12;
        if ((i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            str14 = str25;
            str13 = str27;
            j2 = endpointParameters.s;
        } else {
            j2 = j;
            str13 = str27;
            str14 = str25;
        }
        return endpointParameters.copy(str24, str16, str17, i4, str18, list2, str19, l2, str20, str21, i5, str22, num2, str23, str14, str26, locale2, str13, j2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    public final String component12() {
        return this.l;
    }

    public final Integer component13() {
        return this.m;
    }

    public final String component14() {
        return this.n;
    }

    public final String component15() {
        return this.o;
    }

    public final String component16() {
        return this.p;
    }

    public final Locale component17() {
        return this.q;
    }

    public final String component18() {
        return this.r;
    }

    public final long component19() {
        return this.s;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final List<String> component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final Long component8() {
        return this.h;
    }

    public final String component9() {
        return this.i;
    }

    public final EndpointParameters copy(String str, String str2, String str3, int i, String str4, List<String> list, String str5, Long l, String str6, String str7, int i2, String str8, Integer num, String str9, String str10, String str11, Locale locale, String str12, long j) {
        return new EndpointParameters(str, str2, str3, i, str4, list, str5, l, str6, str7, i2, str8, num, str9, str10, str11, locale, str12, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndpointParameters)) {
            return false;
        }
        EndpointParameters endpointParameters = (EndpointParameters) obj;
        return epx.f(this.a, endpointParameters.a) && epx.f(this.b, endpointParameters.b) && epx.f(this.c, endpointParameters.c) && this.d == endpointParameters.d && epx.f(this.e, endpointParameters.e) && epx.f(this.f, endpointParameters.f) && epx.f(this.g, endpointParameters.g) && epx.f(this.h, endpointParameters.h) && epx.f(this.i, endpointParameters.i) && epx.f(this.j, endpointParameters.j) && this.k == endpointParameters.k && epx.f(this.l, endpointParameters.l) && epx.f(this.m, endpointParameters.m) && epx.f(this.n, endpointParameters.n) && epx.f(this.o, endpointParameters.o) && epx.f(this.p, endpointParameters.p) && epx.f(this.q, endpointParameters.q) && epx.f(this.r, endpointParameters.r) && this.s == endpointParameters.s;
    }

    public final String getAppVersion() {
        return this.g;
    }

    public final String getCapabilities() {
        return this.l;
    }

    public final String getClientType() {
        return this.i;
    }

    public final String getCompression() {
        return this.r;
    }

    public final String getConversationId() {
        return this.a;
    }

    public final int getDeviceIndex() {
        return this.d;
    }

    public final String getEndpointBaseUrl() {
        return this.e;
    }

    public final List<String> getEndpointIPs() {
        return this.f;
    }

    public final Integer getIspAsNo() {
        return this.m;
    }

    public final String getIspAsOrg() {
        return this.n;
    }

    public final String getLocCc() {
        return this.o;
    }

    public final String getLocReg() {
        return this.p;
    }

    public final Locale getLocale() {
        return this.q;
    }

    public final Long getPeerId() {
        return this.h;
    }

    public final int getProtocolVersion() {
        return this.k;
    }

    public final long getRecoverTs() {
        return this.s;
    }

    public final String getStartUrlType() {
        return this.j;
    }

    public final String getToken() {
        return this.b;
    }

    public final String getUserId() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int a = urd0.a(de.v(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31), 31, this.e);
        List list = this.f;
        int a2 = urd0.a((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        Long l = this.h;
        int a3 = urd0.a((a2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.i);
        String str3 = this.j;
        int a4 = urd0.a(de.v(this.k, (a3 + (str3 == null ? 0 : str3.hashCode())) * 31), 31, this.l);
        Integer num = this.m;
        int hashCode3 = (a4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.n;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Locale locale = this.q;
        int hashCode7 = (hashCode6 + (locale == null ? 0 : locale.hashCode())) * 31;
        String str7 = this.r;
        return Long.hashCode(this.s) + ((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        String str4 = this.e;
        List list = this.f;
        String str5 = this.g;
        Long l = this.h;
        String str6 = this.i;
        String str7 = this.j;
        int i2 = this.k;
        String str8 = this.l;
        Integer num = this.m;
        String str9 = this.n;
        String str10 = this.o;
        String str11 = this.p;
        Locale locale = this.q;
        String str12 = this.r;
        long j = this.s;
        StringBuilder a = xe9.a("EndpointParameters(conversationId=", str, ", token=", str2, ", userId=");
        nyh0.a(i, str3, ", deviceIndex=", ", endpointBaseUrl=", a);
        com.vk.movika.sdk.base.model.history.b.c(str4, ", endpointIPs=", ", appVersion=", a, list);
        a.append(str5);
        a.append(", peerId=");
        a.append(l);
        a.append(", clientType=");
        n6j.b(a, str6, ", startUrlType=", str7, ", protocolVersion=");
        jax0.a(i2, ", capabilities=", str8, ", ispAsNo=", a);
        mq.b(num, ", ispAsOrg=", str9, ", locCc=", a);
        n6j.b(a, str10, ", locReg=", str11, ", locale=");
        a.append(locale);
        a.append(", compression=");
        a.append(str12);
        a.append(", recoverTs=");
        return efz.b(j, ")", a);
    }

    public EndpointParameters(String str, String str2, String str3, int i, String str4, List list, String str5, Long l, String str6, String str7, int i2, String str8, Integer num, String str9, String str10, String str11, Locale locale, String str12, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = l;
        this.i = str6;
        this.j = str7;
        this.k = i2;
        this.l = str8;
        this.m = num;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = locale;
        this.r = str12;
        this.s = j;
    }
}
