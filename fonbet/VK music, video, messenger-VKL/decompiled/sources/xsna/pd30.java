package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: MovieHeaderAction.kt */
/* loaded from: classes16.dex */
public interface pd30 extends q1a {

    /* compiled from: MovieHeaderAction.kt */
    public static final class a implements pd30 {
        public final BlockId b;
        public final boolean c;

        public a(BlockId blockId, boolean z) {
            this.b = blockId;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibilityChanged(blockId=");
            sb.append(this.b);
            sb.append(", isVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
