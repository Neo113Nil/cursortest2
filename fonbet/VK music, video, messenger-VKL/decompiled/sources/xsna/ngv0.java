package xsna;

import android.util.Size;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public interface ngv0 {

    /* compiled from: VkRichCell.kt */
    public static final class a implements ngv0 {
        public final dko a;
        public final cut0 b;
        public final tlo0 c;
        public final Size d;

        public a(dko dkoVar, cut0 cut0Var, tlo0.f fVar, Size size, int i) {
            cut0Var = (i & 2) != 0 ? new x7g(R.attr.vk_ui_icon_primary) : cut0Var;
            fVar = (i & 4) != 0 ? null : fVar;
            size = (i & 8) != 0 ? null : size;
            this.a = dkoVar;
            this.b = cut0Var;
            this.c = fVar;
            this.d = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            tlo0 tlo0Var = this.c;
            int hashCode3 = (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            Size size = this.d;
            return hashCode3 + (size != null ? size.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=" + this.c + ", iconSize=" + this.d + ')';
        }
    }

    /* compiled from: VkRichCell.kt */
    public static final class b implements ngv0 {
        public final a a;
        public final a b;

        public b(a aVar, a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Pair(left=" + this.a + ", right=" + this.b + ')';
        }
    }
}
