package xsna;

import com.vkontakte.android.R;

/* compiled from: StoryMentionInfo.kt */
/* loaded from: classes5.dex */
public final class v6m0 {
    public final com.vk.stickers.api.styles.a a;
    public final Float b;
    public final a420 c;
    public final String d;

    public v6m0(com.vk.stickers.api.styles.a aVar, Float f, a420 a420Var, String str) {
        this.a = aVar;
        this.b = f;
        this.c = a420Var;
        this.d = str;
    }

    public static v6m0 a(v6m0 v6m0Var, com.vk.stickers.api.styles.a aVar) {
        Float f = v6m0Var.b;
        a420 a420Var = v6m0Var.c;
        String str = v6m0Var.d;
        v6m0Var.getClass();
        v6m0Var.getClass();
        return new v6m0(aVar, f, a420Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6m0)) {
            return false;
        }
        v6m0 v6m0Var = (v6m0) obj;
        return epx.f(this.a, v6m0Var.a) && epx.f(this.b, v6m0Var.b) && epx.f(this.c, v6m0Var.c) && epx.f(this.d, v6m0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        a420 a420Var = this.c;
        return Integer.hashCode(R.drawable.vk_icon_mention_16) + urd0.a((hashCode2 + (a420Var != null ? a420Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryMentionInfo(styleInfo=");
        sb.append(this.a);
        sb.append(", textSize=");
        sb.append(this.b);
        sb.append(", profile=");
        sb.append(this.c);
        sb.append(", text=");
        return i5s.a(sb, this.d, ", mentionIconRes=2131238503)");
    }
}
