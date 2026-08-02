package xsna;

import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;
import xsna.baw0;

/* compiled from: VmojiProductsState.kt */
/* loaded from: classes7.dex */
public final class gaw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VmojiProductsState.kt */
    public static final class a implements fm50<baw0.a> {
        public final yzt0<List<VmojiProductModel>> a;
        public final yzt0<VmojiProductModel> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(vmojiProducts=");
            sb.append(this.a);
            sb.append(", selectedVmojiProduct=");
            sb.append(this.b);
            sb.append(", reloadingInBackground=");
            return tr.c(sb, this.c, ')');
        }
    }

    public gaw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
