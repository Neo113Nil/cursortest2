package xsna;

/* compiled from: ItemAcceptor.kt */
/* loaded from: classes5.dex */
public interface ltx<Item> {

    /* compiled from: ItemAcceptor.kt */
    public static final class a<Item> implements ltx<Item> {
        public final Item a;

        public a(Item item) {
            this.a = item;
        }

        @Override // xsna.ltx
        public final boolean accept(Item item) {
            return epx.f(this.a, item);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Item item = this.a;
            if (item == null) {
                return 0;
            }
            return item.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Equals(item="), this.a, ')');
        }
    }

    boolean accept(Item item);
}
