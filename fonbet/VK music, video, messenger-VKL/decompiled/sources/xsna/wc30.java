package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: MovieButtonsAction.kt */
/* loaded from: classes16.dex */
public interface wc30 extends q1a {

    /* compiled from: MovieButtonsAction.kt */
    public static final class a implements wc30 {
        public final BlockId b;
        public final t5s0 c;

        public a(BlockId blockId, t5s0 t5s0Var) {
            this.b = blockId;
            this.c = t5s0Var;
        }

        public final t5s0 a() {
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
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Return(blockId=" + this.b + ", returnAction=" + this.c + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: MovieButtonsAction.kt */
    public static final class b implements wc30 {
        public final BlockId b;

        public b(BlockId blockId) {
            this.b = blockId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WatchClicked(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: MovieButtonsAction.kt */
    public static final class c implements wc30 {
        public final BlockId b;

        public c(BlockId blockId) {
            this.b = blockId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WatchLaterClicked(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
