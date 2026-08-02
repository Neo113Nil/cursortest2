package xsna;

/* compiled from: ImItemListMviPatch.kt */
/* loaded from: classes2.dex */
public interface m6w extends yl50 {

    /* compiled from: ImItemListMviPatch.kt */
    public static final class a implements m6w {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1710991408;
        }

        public final String toString() {
            return "ItemUpdate";
        }
    }

    /* compiled from: ImItemListMviPatch.kt */
    public static final class b implements m6w {
        public final n5w a;

        public b(n5w n5wVar) {
            this.a = n5wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NewItemList(itemList=" + this.a + ')';
        }
    }

    /* compiled from: ImItemListMviPatch.kt */
    public static final class c implements m6w {
        public final f8w a;

        public c(f8w f8wVar) {
            this.a = f8wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "NewItemsHeader(header=" + this.a + ')';
        }
    }

    /* compiled from: ImItemListMviPatch.kt */
    public static final class d implements m6w {
        public final i8w a;

        public d(i8w i8wVar) {
            this.a = i8wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NewItemsMeta(meta=" + this.a + ')';
        }
    }

    /* compiled from: ImItemListMviPatch.kt */
    public static final class e implements m6w {
        public final p8w a;

        public e(p8w p8wVar) {
            this.a = p8wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "NewItemsStories(stories=" + this.a + ')';
        }
    }
}
