package xsna;

/* compiled from: SearchDatabaseSideEffect.kt */
/* loaded from: classes5.dex */
public interface uph0<Item> {

    /* compiled from: SearchDatabaseSideEffect.kt */
    public static final class a<Item> implements uph0<Item> {
        public final Item a;

        public a(Item item) {
            this.a = item;
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
            return k73.c(new StringBuilder("SetResult(item="), this.a, ')');
        }
    }
}
