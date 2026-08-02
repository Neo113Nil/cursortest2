package xsna;

import com.vk.catalog.mvi.block.BlockId;

/* compiled from: UploadEvent.kt */
/* loaded from: classes.dex */
public interface saq0 extends smk {

    /* compiled from: UploadEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements saq0 {
        public final BlockId.Simple a;
        public final int b;

        public a(BlockId.Simple simple, int i) {
            this.a = simple;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideoMenu(blockId=");
            sb.append(this.a);
            sb.append(", uploadTaskId=");
            return vu5.b(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
