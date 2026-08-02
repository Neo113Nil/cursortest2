package xsna;

import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import java.util.List;

/* compiled from: ConfigureItemListAction.kt */
/* loaded from: classes18.dex */
public abstract class izi implements kj50 {

    /* compiled from: ConfigureItemListAction.kt */
    public static final class a extends izi {
        public final List<ConfigureItem> b;

        public a(List<ConfigureItem> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ConfigureScreenAction(items="), this.b);
        }
    }

    /* compiled from: ConfigureItemListAction.kt */
    public static final class b extends izi {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1767804954;
        }

        public final String toString() {
            return "OnAddNewItemsButtonTapAction";
        }
    }

    /* compiled from: ConfigureItemListAction.kt */
    public static final class c extends izi {
        public final long b;

        public c(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnDeleteItemButtonTapAction(id="));
        }
    }

    /* compiled from: ConfigureItemListAction.kt */
    public static final class d extends izi {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1957748673;
        }

        public final String toString() {
            return "OnReturnBackAction";
        }
    }
}
