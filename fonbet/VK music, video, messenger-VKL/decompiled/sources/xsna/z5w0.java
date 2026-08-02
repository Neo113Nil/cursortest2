package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.stickers.VmojiAvatar;

/* compiled from: VmojiAvatarEntity.kt */
/* loaded from: classes5.dex */
public final class z5w0 {
    public final VmojiAvatar a;
    public final Image b;
    public final Image c;
    public final int d;
    public final int e;
    public final Integer f;

    public z5w0(VmojiAvatar vmojiAvatar, Image image, Image image2, int i, int i2, Integer num) {
        this.a = vmojiAvatar;
        this.b = image;
        this.c = image2;
        this.d = i;
        this.e = i2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5w0)) {
            return false;
        }
        z5w0 z5w0Var = (z5w0) obj;
        return epx.f(this.a, z5w0Var.a) && epx.f(this.b, z5w0Var.b) && epx.f(this.c, z5w0Var.c) && this.d == z5w0Var.d && this.e == z5w0Var.e && epx.f(this.f, z5w0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Image image = this.b;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.c;
        int a = shy.a(this.e, shy.a(this.d, (hashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31, 31), 31);
        Integer num = this.f;
        return a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAvatarEntity(avatar=");
        sb.append(this.a);
        sb.append(", avatarIcon=");
        sb.append(this.b);
        sb.append(", avatarIconDark=");
        sb.append(this.c);
        sb.append(", avatarColor=");
        sb.append(this.d);
        sb.append(", avatarColorDark=");
        sb.append(this.e);
        sb.append(", contextStickerPackId=");
        return uqi.b(sb, this.f, ')');
    }
}
