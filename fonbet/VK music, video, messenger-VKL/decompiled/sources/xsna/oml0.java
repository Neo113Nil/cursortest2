package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: StorefrontPatch.kt */
/* loaded from: classes18.dex */
public interface oml0 extends yl50 {

    /* compiled from: StorefrontPatch.kt */
    public static final class a implements oml0 {
        public final Integer a;
        public final List<b5u> b;

        public a(Integer num, List<b5u> list) {
            this.a = num;
            this.b = list;
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class b implements oml0 {
        public final List<b5u> a;

        public b(List<b5u> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("AdultConfirmed(goods="), this.a);
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class c implements oml0 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("BookmarksReloaded(bookmarksCount="), this.a, ')');
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class d implements oml0 {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            UserId userId = this.a;
            if (userId == null) {
                return 0;
            }
            return Long.hashCode(userId.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CancelGoodCtaType(ownerId="), this.a, ')');
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class e implements oml0 {
        public final UserId a;
        public final long b;

        public e(long j, UserId userId) {
            this.a = userId;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b;
        }

        public final int hashCode() {
            UserId userId = this.a;
            return Long.hashCode(this.b) + ((userId == null ? 0 : Long.hashCode(userId.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelGoodCtaTypeViaBuyNow(ownerId=");
            sb.append(this.a);
            sb.append(", itemId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class f implements oml0 {
        public final ay00 a;

        public f(ay00 ay00Var) {
            this.a = ay00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CartUpdated(event=" + this.a + ')';
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class g implements oml0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1644191771;
        }

        public final String toString() {
            return "DismissSnackBar";
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class h implements oml0 {
        public final wll0 a;

        public h(wll0 wll0Var) {
            this.a = wll0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.a + ')';
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class i implements oml0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1964428394;
        }

        public final String toString() {
            return "LoadingError";
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class j implements oml0 {
        public final ArrayList a;
        public final int b;

        public j(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b == jVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Paging(goods=");
            sb.append(this.a);
            sb.append(", pagingOffset=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static abstract class k implements oml0 {

        /* compiled from: StorefrontPatch.kt */
        public static final class a extends k {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 364296471;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: StorefrontPatch.kt */
        public static final class b extends k {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class l implements oml0 {
        public final apl0 a;

        public l(apl0 apl0Var) {
            this.a = apl0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Result(state=" + this.a + ')';
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class m implements oml0 {
        public final tlo0.f a;
        public final tlo0.f b;
        public final Throwable c;

        public m(tlo0.f fVar, tlo0.f fVar2, Throwable th) {
            this.a = fVar;
            this.b = fVar2;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a.equals(mVar.a) && this.b.equals(mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
            Throwable th = this.c;
            return a + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowSnackBar(title=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", throwable=");
            return oq.c(sb, this.c, ')');
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class n implements oml0 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -282863048;
        }

        public final String toString() {
            return "Start";
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class o implements oml0 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -138390556;
        }

        public final String toString() {
            return "StartPaging";
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class p implements oml0 {
        public final List<w4p0> a;
        public final w4p0 b;

        public p(List<w4p0> list, w4p0 w4p0Var) {
            this.a = list;
            this.b = w4p0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            w4p0 w4p0Var = this.b;
            return hashCode + (w4p0Var == null ? 0 : w4p0Var.hashCode());
        }

        public final String toString() {
            return "TooltipsUpdate(tooltips=" + this.a + ", currentTooltip=" + this.b + ')';
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class q implements oml0 {
        public final long a;
        public final ProductTileCtaButtonType b;

        public q(long j, ProductTileCtaButtonType productTileCtaButtonType) {
            this.a = j;
            this.b = productTileCtaButtonType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a == qVar.a && this.b == qVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "UpdateGoodCtaType(itemId=" + this.a + ", newType=" + this.b + ')';
        }
    }
}
