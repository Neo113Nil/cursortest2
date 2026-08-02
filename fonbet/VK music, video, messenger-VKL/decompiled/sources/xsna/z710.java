package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;

/* compiled from: MarketMultiPickerAction.kt */
/* loaded from: classes18.dex */
public interface z710 extends kj50 {

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class a implements z710 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 126615383;
        }

        public final String toString() {
            return "ClickCloseMarketMultiPicker";
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class b implements z710 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -65199213;
        }

        public final String toString() {
            return "ClickCreateGoodAction";
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class c implements z710 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 813874649;
        }

        public final String toString() {
            return "ClickEnableMarketAction";
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class d implements z710 {
        public final MultipickerProductId b;

        public d(MultipickerProductId multipickerProductId) {
            this.b = multipickerProductId;
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class e implements z710 {
        public static final e b = new e();
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static abstract class f implements z710 {
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static abstract class g implements z710 {

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class a extends g {
        }

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class b extends g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1966318297;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static abstract class h implements z710 {

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class a extends h {
            public static final a b = new a();
        }

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class b extends h {
            public static final b b = new b();
        }

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class c extends h {
            public static final c b = new c();
        }

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class d extends h {
            public static final d b = new d();
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class i implements z710 {
        public final UserId b;

        public i(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("MarketForGroupEnabled(groupId="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class j implements z710 {
        public static final j b = new j();
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class k implements z710 {
        public static final k b = new k();
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class l implements z710 {
        public static final l b = new l();
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class m implements z710 {
        public final UserId b;

        public m(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnGroupTabItemChangesAction(groupId="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class n implements z710 {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 894758254;
        }

        public final String toString() {
            return "OnNewGoodCreated";
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class o implements z710 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -595166822;
        }

        public final String toString() {
            return "OnSearchQueryFocused";
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class p implements z710 {
        public final String b;

        public p(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnSearchQueryUpdate(query="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public static final class q implements z710 {
        public final int b;

        public q(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnTabSelected(position="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerAction.kt */
    public interface r extends z710 {

        /* compiled from: MarketMultiPickerAction.kt */
        public static final class a implements r {
            public final long b;

            public a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("SaveInteractTime(elapsedTime="));
            }
        }
    }
}
