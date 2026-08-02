package xsna;

/* compiled from: SelectionItem.kt */
/* loaded from: classes2.dex */
public interface ldi0 {

    /* compiled from: SelectionItem.kt */
    public static final class a implements ldi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.ldi0
        public final long getId() {
            return 0L;
        }

        public final int hashCode() {
            return -647915837;
        }

        public final String toString() {
            return "ChannelItem";
        }
    }

    /* compiled from: SelectionItem.kt */
    public static final class b implements ldi0 {
        public final qtd0 a;

        public b(qtd0 qtd0Var) {
            this.a = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        @Override // xsna.ldi0
        public final long getId() {
            return this.a.G3();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("ProfileItem(profile="), this.a, ')');
        }
    }

    long getId();
}
