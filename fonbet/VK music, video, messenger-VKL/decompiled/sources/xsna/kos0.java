package xsna;

import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: VideoGrowthFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class kos0 {
    public static final a r = new a();
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    /* compiled from: VideoGrowthFeatureConfig.kt */
    public static final class a {
        public static kos0 a(String str) {
            try {
                return b(new JSONObject(str));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }

        public static kos0 b(JSONObject jSONObject) {
            try {
                long optLong = jSONObject.optLong("show_interval");
                long optLong2 = jSONObject.optLong("show_interval_after_close");
                String optString = jSONObject.optString("text_title");
                String optString2 = jSONObject.optString("text_subtitle");
                String optString3 = jSONObject.optString("text_button");
                String optString4 = jSONObject.optString("link");
                String optString5 = jSONObject.optString("huawei_link");
                String optString6 = jSONObject.optString("rustore_link");
                String optString7 = jSONObject.optString("samsung_link");
                String optString8 = jSONObject.optString("xiaomi_link");
                boolean optBoolean = jSONObject.optBoolean("show_with_standalone_installed");
                String optString9 = jSONObject.optString("text_subtitle_for_huawei");
                return new kos0(Long.valueOf(optLong), Long.valueOf(optLong2), optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8, optBoolean, jSONObject.optString("text_title_for_huawei"), optString9, jSONObject.optString("text_button_for_huawei"), jSONObject.optString("text_button_for_rustore"), jSONObject.optString("text_button_for_samsung"), jSONObject.optString("text_button_for_xiaomi"));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    public kos0(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kos0)) {
            return false;
        }
        kos0 kos0Var = (kos0) obj;
        return epx.f(this.a, kos0Var.a) && epx.f(this.b, kos0Var.b) && epx.f(this.c, kos0Var.c) && epx.f(this.d, kos0Var.d) && epx.f(this.e, kos0Var.e) && epx.f(this.f, kos0Var.f) && epx.f(this.g, kos0Var.g) && epx.f(this.h, kos0Var.h) && epx.f(this.i, kos0Var.i) && epx.f(this.j, kos0Var.j) && this.k == kos0Var.k && epx.f(this.l, kos0Var.l) && epx.f(this.m, kos0Var.m) && epx.f(this.n, kos0Var.n) && epx.f(this.o, kos0Var.o) && epx.f(this.p, kos0Var.p) && epx.f(this.q, kos0Var.q);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int b = qoy.b((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.k);
        String str9 = this.l;
        int hashCode10 = (b + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.m;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.n;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.o;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.p;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.q;
        return hashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthFeatureConfig(showInterval=");
        sb.append(this.a);
        sb.append(", showIntervalAfterClose=");
        sb.append(this.b);
        sb.append(", textTitle=");
        sb.append(this.c);
        sb.append(", textSubtitle=");
        sb.append(this.d);
        sb.append(", textButton=");
        sb.append(this.e);
        sb.append(", link=");
        sb.append(this.f);
        sb.append(", huaweiLink=");
        sb.append(this.g);
        sb.append(", rustoreLink=");
        sb.append(this.h);
        sb.append(", samsungLink=");
        sb.append(this.i);
        sb.append(", xiaomiLink=");
        sb.append(this.j);
        sb.append(", showWithStandaloneInstalled=");
        sb.append(this.k);
        sb.append(", textTitleForHuawei=");
        sb.append(this.l);
        sb.append(", textSubtitleForHuawei=");
        sb.append(this.m);
        sb.append(", textButtonForHuawei=");
        sb.append(this.n);
        sb.append(", textButtonForRustore=");
        sb.append(this.o);
        sb.append(", textButtonForSamsung=");
        sb.append(this.p);
        sb.append(", textButtonForXiaomi=");
        return ho8.a(sb, this.q, ')');
    }
}
