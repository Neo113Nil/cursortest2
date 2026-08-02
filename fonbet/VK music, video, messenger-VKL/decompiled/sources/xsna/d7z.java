package xsna;

import com.vk.dto.reactions.ItemReactions;

/* compiled from: LikesResult.kt */
/* loaded from: classes18.dex */
public final class d7z {
    public final int a = 0;
    public final int b = 0;
    public final ItemReactions c = null;
    public final boolean d = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7z)) {
            return false;
        }
        d7z d7zVar = (d7z) obj;
        return this.a == d7zVar.a && this.b == d7zVar.b && epx.f(this.c, d7zVar.c) && this.d == d7zVar.d;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        ItemReactions itemReactions = this.c;
        return Boolean.hashCode(this.d) + ((a + (itemReactions == null ? 0 : itemReactions.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesResult(likes=");
        sb.append(this.a);
        sb.append(", reposts=");
        sb.append(this.b);
        sb.append(", reactions=");
        sb.append(this.c);
        sb.append(", needShowSubscribeSuggestion=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
