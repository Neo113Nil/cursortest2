package xsna;

import com.vkontakte.android.R;

/* compiled from: DonutModalHintUiDto.kt */
/* loaded from: classes5.dex */
public final class v0o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public v0o(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0o)) {
            return false;
        }
        v0o v0oVar = (v0o) obj;
        return this.a.equals(v0oVar.a) && epx.f(this.b, v0oVar.b) && epx.f(this.c, v0oVar.c) && epx.f(this.d, v0oVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(R.drawable.vk_icon_donut_color_16) + urd0.a(urd0.a(shy.a(56, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutModalHintUiDto(imageUrl=");
        sb.append(this.a);
        sb.append(", imageContentDescription=");
        sb.append(this.b);
        sb.append(", imageSize=56, title=");
        sb.append(this.c);
        sb.append(", description=");
        return i5s.a(sb, this.d, ", badgeIcon=2131236957)");
    }
}
