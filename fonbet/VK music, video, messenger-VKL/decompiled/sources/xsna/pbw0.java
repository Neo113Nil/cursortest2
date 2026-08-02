package xsna;

import com.vk.dto.stickers.VmojiAvatarModel;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class pbw0 extends h3l0 {
    public final VmojiAvatarModel b;
    public final boolean c;

    public pbw0(VmojiAvatarModel vmojiAvatarModel, boolean z) {
        this.b = vmojiAvatarModel;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbw0)) {
            return false;
        }
        pbw0 pbw0Var = (pbw0) obj;
        return epx.f(this.b, pbw0Var.b) && this.c == pbw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiSwitcherItem(avatar=");
        sb.append(this.b);
        sb.append(", showWithMyCharacter=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
