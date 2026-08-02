package xsna;

import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthorCabinetLinksConfig.kt */
/* loaded from: classes6.dex */
public final class s75 {
    public static final s75 d = new s75("https://vkvideo.ru/dashboard/@%s?section=video_video_analytics&vid=%d", "https://vkvideo.ru/dashboard", "https://vkvideo.ru/dashboard/@%s");
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: AuthorCabinetLinksConfig.kt */
    public static final class a {
        public static s75 a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new s75(jSONObject.optString("video_analytics_link", "https://vkvideo.ru/dashboard/@%s?section=video_video_analytics&vid=%d"), jSONObject.optString("common_author_cabinet_link", "https://vkvideo.ru/dashboard"), jSONObject.optString("author_cabinet_link", "https://vkvideo.ru/dashboard/@%s"));
            } catch (JSONException e) {
                L.i(e);
                return s75.d;
            }
        }
    }

    public s75(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s75)) {
            return false;
        }
        s75 s75Var = (s75) obj;
        return epx.f(this.a, s75Var.a) && epx.f(this.b, s75Var.b) && epx.f(this.c, s75Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorCabinetLinksConfig(videoAnalyticsLink=");
        sb.append(this.a);
        sb.append(", commonAuthorCabinetLink=");
        sb.append(this.b);
        sb.append(", authorCabinetLink=");
        return ho8.a(sb, this.c, ')');
    }
}
