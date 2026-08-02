package xsna;

import android.graphics.Bitmap;
import com.vk.dto.stories.model.ads.DisclaimerType;

/* compiled from: MyTargetAdStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class dt50 {
    public final Bitmap a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final DisclaimerType f;
    public final String g;
    public final Long h;
    public final Float i;

    public dt50(Bitmap bitmap, String str, String str2, String str3, String str4, DisclaimerType disclaimerType, String str5, Long l, Float f) {
        this.a = bitmap;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = disclaimerType;
        this.g = str5;
        this.h = l;
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt50)) {
            return false;
        }
        dt50 dt50Var = (dt50) obj;
        return epx.f(this.a, dt50Var.a) && epx.f(this.b, dt50Var.b) && epx.f(this.c, dt50Var.c) && epx.f(this.d, dt50Var.d) && epx.f(this.e, dt50Var.e) && this.f == dt50Var.f && epx.f(this.g, dt50Var.g) && epx.f(this.h, dt50Var.h) && epx.f(this.i, dt50Var.i);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DisclaimerType disclaimerType = this.f;
        int hashCode6 = (hashCode5 + (disclaimerType == null ? 0 : disclaimerType.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.h;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.i;
        return hashCode8 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetStoryEntryData(icon=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", ctaText=");
        sb.append(this.e);
        sb.append(", disclaimerType=");
        sb.append(this.f);
        sb.append(", disclaimerText=");
        sb.append(this.g);
        sb.append(", videoDuration=");
        sb.append(this.h);
        sb.append(", aspectRatio=");
        return so.b(sb, this.i, ')');
    }
}
