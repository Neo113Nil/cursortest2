package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.id.UserId;

/* compiled from: AuthorsChannelEvent.kt */
/* loaded from: classes.dex */
public interface yd5 extends smk {

    /* compiled from: AuthorsChannelEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements yd5 {
        public final BlockId a;

        public a(BlockId blockId) {
            this.a = blockId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Login(blockId=" + this.a + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: AuthorsChannelEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements yd5 {
        public final BlockId a;
        public final UserId b;

        public b(BlockId blockId, UserId userId) {
            this.a = blockId;
            this.b = userId;
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
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAuthorsChannel(blockId=");
            sb.append(this.a);
            sb.append(", channelId=");
            return gp.b(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
