package xsna;

/* compiled from: ClipsPlaylistsSmallFolderItemVs.kt */
/* loaded from: classes16.dex */
public interface mue {

    /* compiled from: ClipsPlaylistsSmallFolderItemVs.kt */
    public static final class a implements mue {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        @Override // xsna.mue
        public final int getId() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Folder(id=");
            sb.append(this.a);
            sb.append(", name=");
            return ho8.a(sb, this.b, ')');
        }
    }

    int getId();
}
