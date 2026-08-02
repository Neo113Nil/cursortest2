package xsna;

import com.vk.dto.stickers.PromoColor;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.ImageListModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class r6w0 extends z6w0 {
    public final String b;
    public final CharacterContext c;
    public final boolean d;
    public final ImageListModel e;
    public final ImageListModel f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final PromoColor l;

    public r6w0(String str, CharacterContext characterContext, boolean z, ImageListModel imageListModel, ImageListModel imageListModel2, int i, int i2, boolean z2, boolean z3, int i3, PromoColor promoColor) {
        this.b = str;
        this.c = characterContext;
        this.d = z;
        this.e = imageListModel;
        this.f = imageListModel2;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = z3;
        this.k = i3;
        this.l = promoColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6w0)) {
            return false;
        }
        r6w0 r6w0Var = (r6w0) obj;
        return epx.f(this.b, r6w0Var.b) && this.c == r6w0Var.c && this.d == r6w0Var.d && epx.f(this.e, r6w0Var.e) && epx.f(this.f, r6w0Var.f) && this.g == r6w0Var.g && this.h == r6w0Var.h && this.i == r6w0Var.i && this.j == r6w0Var.j && this.k == r6w0Var.k && this.l == r6w0Var.l;
    }

    public final int hashCode() {
        int b = qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        ImageListModel imageListModel = this.e;
        int hashCode = (b + (imageListModel == null ? 0 : imageListModel.b.hashCode())) * 31;
        ImageListModel imageListModel2 = this.f;
        int a = shy.a(this.k, qoy.b(qoy.b(shy.a(this.h, shy.a(this.g, (hashCode + (imageListModel2 == null ? 0 : imageListModel2.b.hashCode())) * 31, 31), 31), 31, this.i), 31, this.j), 31);
        PromoColor promoColor = this.l;
        return a + (promoColor != null ? promoColor.hashCode() : 0);
    }

    public final String toString() {
        return "VmojiCharacterHeaderItem(firstNameGen=" + this.b + ", characterContext=" + this.c + ", isVmojiAlreadyCreated=" + this.d + ", avatarIcon=" + this.e + ", avatarIconDark=" + this.f + ", bgColor=" + this.g + ", bgColorDark=" + this.h + ", isActive=" + this.i + ", isHideFromKeyboard=" + this.j + ", promoCounter=" + this.k + ", promoCounterColor=" + this.l + ')';
    }
}
