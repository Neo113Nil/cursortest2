package xsna;

import com.vk.vmoji.character.model.VmojiProductModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class l9w0 extends z6w0 {
    public final VmojiProductModel b;
    public final boolean c;

    public l9w0(VmojiProductModel vmojiProductModel, boolean z) {
        this.b = vmojiProductModel;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9w0)) {
            return false;
        }
        l9w0 l9w0Var = (l9w0) obj;
        return epx.f(this.b, l9w0Var.b) && this.c == l9w0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductItem(product=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
