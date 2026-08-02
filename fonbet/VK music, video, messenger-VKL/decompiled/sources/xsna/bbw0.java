package xsna;

import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public final class bbw0 {
    public final VmojiAvatarModel a;
    public final boolean b;

    public bbw0(VmojiAvatarModel vmojiAvatarModel) {
        VmojiAvatar vmojiAvatar;
        boolean Cb = (vmojiAvatarModel == null || (vmojiAvatar = vmojiAvatarModel.b) == null) ? false : vmojiAvatar.Cb();
        this.a = vmojiAvatarModel;
        this.b = Cb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbw0)) {
            return false;
        }
        bbw0 bbw0Var = (bbw0) obj;
        return epx.f(this.a, bbw0Var.a) && this.b == bbw0Var.b;
    }

    public final int hashCode() {
        VmojiAvatarModel vmojiAvatarModel = this.a;
        return Boolean.hashCode(this.b) + ((vmojiAvatarModel == null ? 0 : vmojiAvatarModel.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiScreenData(avatar=");
        sb.append(this.a);
        sb.append(", active=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
