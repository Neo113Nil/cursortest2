package xsna;

/* compiled from: ChannelControlsButtonsItem.kt */
/* loaded from: classes2.dex */
public interface swa extends hfz {

    /* compiled from: ChannelControlsButtonsItem.kt */
    public static final class a implements swa {
        public final boolean b;
        public final int c;

        public a() {
            this(false, 0);
        }

        @Override // xsna.swa
        public final int W5() {
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
            return this.b == aVar.b && this.c == aVar.c;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        @Override // xsna.swa
        public final boolean p() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectAll(isSelected=");
            sb.append(this.b);
            sb.append(", counter=");
            return vu5.b(sb, this.c, ')');
        }

        public a(boolean z, int i) {
            this.b = z;
            this.c = i;
        }
    }

    /* compiled from: ChannelControlsButtonsItem.kt */
    public static final class b implements swa {
        public final boolean b;
        public final int c;

        public b() {
            this(false, 0);
        }

        @Override // xsna.swa
        public final int W5() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        @Override // xsna.swa
        public final boolean p() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectSubscribers(isSelected=");
            sb.append(this.b);
            sb.append(", counter=");
            return vu5.b(sb, this.c, ')');
        }

        public b(boolean z, int i) {
            this.b = z;
            this.c = i;
        }
    }

    int W5();

    boolean p();
}
