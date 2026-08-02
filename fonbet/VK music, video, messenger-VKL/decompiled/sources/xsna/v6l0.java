package xsna;

import com.vk.dto.stickers.VmojiAvatarModel;

/* compiled from: StickerSettingsItem.kt */
/* loaded from: classes6.dex */
public final class v6l0 extends bk7 {
    public final VmojiAvatarModel c;
    public final boolean d;

    public v6l0(VmojiAvatarModel vmojiAvatarModel, boolean z) {
        super(1);
        this.c = vmojiAvatarModel;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6l0)) {
            return false;
        }
        v6l0 v6l0Var = (v6l0) obj;
        return epx.f(this.c, v6l0Var.c) && this.d == v6l0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSettingsVmojiPackItem(avatar=");
        sb.append(this.c);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
