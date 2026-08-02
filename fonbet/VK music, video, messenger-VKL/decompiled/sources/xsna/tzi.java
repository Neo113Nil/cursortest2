package xsna;

import java.util.ArrayList;

/* compiled from: ConfigureItemListEvent.kt */
/* loaded from: classes18.dex */
public abstract class tzi {

    /* compiled from: ConfigureItemListEvent.kt */
    public static final class a extends tzi {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1598690401;
        }

        public final String toString() {
            return "ShowSelectLimitItemsMessage";
        }
    }

    /* compiled from: ConfigureItemListEvent.kt */
    public static final class b extends tzi {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
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
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ToAddNewItems(items="), this.a);
        }
    }

    /* compiled from: ConfigureItemListEvent.kt */
    public static final class c extends tzi {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ToCloseView(items="), this.a);
        }
    }
}
