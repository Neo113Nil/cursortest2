package xsna;

import com.vk.vmoji.character.model.VmojiCharacterModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class t9w0 extends z6w0 {
    public final VmojiCharacterModel b;
    public final List<l9w0> c;

    public t9w0(VmojiCharacterModel vmojiCharacterModel, ArrayList arrayList) {
        this.b = vmojiCharacterModel;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9w0)) {
            return false;
        }
        t9w0 t9w0Var = (t9w0) obj;
        return epx.f(this.b, t9w0Var.b) && epx.f(this.c, t9w0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<l9w0> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductsItem(character=");
        sb.append(this.b);
        sb.append(", productsItems=");
        return ms9.a(')', sb, this.c);
    }
}
