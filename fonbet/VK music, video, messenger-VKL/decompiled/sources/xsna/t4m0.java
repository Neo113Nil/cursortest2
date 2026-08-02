package xsna;

import com.vkontakte.android.R;

/* compiled from: StoryHashtagInfo.kt */
/* loaded from: classes5.dex */
public final class t4m0 {
    public final com.vk.stickers.api.styles.a a;
    public final Float b;
    public final String c;

    public t4m0(com.vk.stickers.api.styles.a aVar, Float f, String str) {
        this.a = aVar;
        this.b = f;
        this.c = str;
    }

    public static t4m0 a(t4m0 t4m0Var, com.vk.stickers.api.styles.a aVar) {
        Float f = t4m0Var.b;
        String str = t4m0Var.c;
        t4m0Var.getClass();
        t4m0Var.getClass();
        return new t4m0(aVar, f, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4m0)) {
            return false;
        }
        t4m0 t4m0Var = (t4m0) obj;
        return epx.f(this.a, t4m0Var.a) && epx.f(this.b, t4m0Var.b) && epx.f(this.c, t4m0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return Integer.hashCode(R.drawable.vk_icon_hashtag_16) + urd0.a((hashCode + (f == null ? 0 : f.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryHashtagInfo(styleInfo=");
        sb.append(this.a);
        sb.append(", textSize=");
        sb.append(this.b);
        sb.append(", text=");
        return i5s.a(sb, this.c, ", hashtagIconRes=2131237219)");
    }
}
