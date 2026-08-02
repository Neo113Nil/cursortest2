package xsna;

import com.vk.im.engine.models.chats.ChatPreview;

/* compiled from: Model.kt */
/* loaded from: classes2.dex */
public final class u230 {
    public final String a;
    public final ChatPreview b;
    public final boolean c;

    public u230(String str, ChatPreview chatPreview, boolean z) {
        this.a = str;
        this.b = chatPreview;
        this.c = z;
    }

    public static u230 a(u230 u230Var, String str, ChatPreview chatPreview, int i) {
        if ((i & 1) != 0) {
            str = u230Var.a;
        }
        boolean z = u230Var.c;
        u230Var.getClass();
        return new u230(str, chatPreview, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u230)) {
            return false;
        }
        u230 u230Var = (u230) obj;
        return epx.f(this.a, u230Var.a) && epx.f(this.b, u230Var.b) && this.c == u230Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Model(link=");
        sb.append(this.a);
        sb.append(", chatPreview=");
        sb.append(this.b);
        sb.append(", isAlreadyInChat=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
