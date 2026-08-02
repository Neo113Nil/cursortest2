package xsna;

import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: VkVideoPromoFullscreenConfig.kt */
/* loaded from: classes11.dex */
public final class f0w0 {
    public static final a l = new a();
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: VkVideoPromoFullscreenConfig.kt */
    public static final class a {
        public static f0w0 a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new f0w0(jSONObject.getLong("show_interval"), jSONObject.getLong("show_interval_after_close"), jSONObject.optString("text_title"), jSONObject.optString("text_first_button"), jSONObject.optString("text_first_button_with_app"), jSONObject.optString("text_second_button"), jSONObject.optString("link"), jSONObject.optString("huawei_link"), jSONObject.optString("rustore_link"), jSONObject.optString("samsung_link"), jSONObject.optString("xiaomi_link"));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    public f0w0() {
        this(1L, 3L, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0w0)) {
            return false;
        }
        f0w0 f0w0Var = (f0w0) obj;
        return this.a == f0w0Var.a && this.b == f0w0Var.b && epx.f(this.c, f0w0Var.c) && epx.f(this.d, f0w0Var.d) && epx.f(this.e, f0w0Var.e) && epx.f(this.f, f0w0Var.f) && epx.f(this.g, f0w0Var.g) && epx.f(this.h, f0w0Var.h) && epx.f(this.i, f0w0Var.i) && epx.f(this.j, f0w0Var.j) && epx.f(this.k, f0w0Var.k);
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkVideoPromoFullscreenConfig(showIntervalSeconds=");
        sb.append(this.a);
        sb.append(", showIntervalAfterCloseDays=");
        sb.append(this.b);
        sb.append(", textTitle=");
        sb.append(this.c);
        sb.append(", textFirstButton=");
        sb.append(this.d);
        sb.append(", textFirstButtonWithApp=");
        sb.append(this.e);
        sb.append(", textSecondButton=");
        sb.append(this.f);
        sb.append(", link=");
        sb.append(this.g);
        sb.append(", huaweiLink=");
        sb.append(this.h);
        sb.append(", rustoreLink=");
        sb.append(this.i);
        sb.append(", samsungLink=");
        sb.append(this.j);
        sb.append(", xiaomiLink=");
        return ho8.a(sb, this.k, ')');
    }

    public f0w0(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
    }
}
