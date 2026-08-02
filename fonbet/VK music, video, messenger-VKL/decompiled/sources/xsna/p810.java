package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: MarketMultiPickerPatch.kt */
/* loaded from: classes18.dex */
public abstract class p810 implements xl50 {

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class a extends p810 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 923514260;
        }

        public final String toString() {
            return "ClearGroupItemsPatch";
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class b extends p810 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -630540165;
        }

        public final String toString() {
            return "ClearSearchQueryPatch";
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class c extends p810 {
        public final ArrayList b;
        public final int c;
        public final int d = 20;
        public final ArrayList e;

        public c(int i, ArrayList arrayList, ArrayList arrayList2) {
            this.b = arrayList;
            this.c = i;
            this.e = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateGoodPatch(groupItems=");
            sb.append(this.b);
            sb.append(", groupItemsCount=");
            sb.append(this.c);
            sb.append(", groupItemsOffset=");
            sb.append(this.d);
            sb.append(", groups=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class d extends p810 {
        public final Throwable b;

        public d(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FaveItemsNextPageErrorPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class e extends p810 {
        public static final e b = new e();
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class f extends p810 {
        public static final f b = new f();
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class g extends p810 {
        public static final g b = new g();
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class h extends p810 {
        public final Throwable b;

        public h(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("GroupItemsNextPageErrorPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class i extends p810 {
        public static final i b = new i();
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class k extends p810 {
        public final List<glu> b;
        public final List<ha10> c;
        public final int d;
        public final int e;
        public final List<ha10> f;
        public final Integer g;
        public final List<MultipickerProduct> h;
        public final int i;

        public k() {
            this(null, null, null, null, 0, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && epx.f(this.f, kVar.f) && epx.f(this.g, kVar.g) && epx.f(this.h, kVar.h) && this.i == kVar.i;
        }

        public final int hashCode() {
            int a = fw3.a(shy.a(this.e, shy.a(this.d, fw3.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31, this.f);
            Integer num = this.g;
            return Integer.hashCode(this.i) + fw3.a((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialScreenSuccessLoadDataPatch(groups=");
            sb.append(this.b);
            sb.append(", groupItems=");
            sb.append(this.c);
            sb.append(", groupItemsCount=");
            sb.append(this.d);
            sb.append(", groupItemsOffset=");
            sb.append(this.e);
            sb.append(", faveItems=");
            sb.append(this.f);
            sb.append(", faveItemsNextFrom=");
            sb.append(this.g);
            sb.append(", products=");
            sb.append(this.h);
            sb.append(", maxCount=");
            return vu5.b(sb, this.i, ')');
        }

        public k(List<glu> list, List<ha10> list2, int i, int i2, List<ha10> list3, Integer num, List<MultipickerProduct> list4, int i3) {
            this.b = list;
            this.c = list2;
            this.d = i;
            this.e = i2;
            this.f = list3;
            this.g = num;
            this.h = list4;
            this.i = i3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public k(ArrayList arrayList, ArrayList arrayList2, Integer num, List list, int i, int i2) {
            this(r1, r2, 0, 0, (i2 & 16) != 0 ? r2 : arrayList2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? r2 : list, (i2 & 128) != 0 ? 10 : i);
            List list2 = (i2 & 1) != 0 ? EmptyList.b : arrayList;
            EmptyList emptyList = EmptyList.b;
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class l extends p810 {
        public final String b;

        public l(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnSearchQueryUpdatePatch(query="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class m extends p810 {
        public final int b;

        public m(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectTabPatch(position="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static abstract class n extends p810 {

        /* compiled from: MarketMultiPickerPatch.kt */
        public static final class a extends n {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 423484289;
            }

            public final String toString() {
                return "MeasuringColdStarted";
            }
        }

        /* compiled from: MarketMultiPickerPatch.kt */
        public static final class b extends n {
            public final long b;

            public b(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("SaveInteractTime(elapsedTime="));
            }
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class p extends p810 {
        public final Throwable b;

        public p(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            Throwable th = this.b;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("UpdateGroupItemsErrorPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class q extends p810 {
        public final int b;
        public final ArrayList c;
        public final int d;

        public q(ArrayList arrayList, int i, int i2) {
            this.b = i;
            this.c = arrayList;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.b == qVar.b && epx.f(this.c, qVar.c) && this.d == qVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + qr.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateGroupItemsPatch(groupItemsOffset=");
            sb.append(this.b);
            sb.append(", groupItems=");
            sb.append(this.c);
            sb.append(", groupItemsCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class r extends p810 {
        public final ArrayList b;

        public r(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdateGroupsPatch(groups="), this.b);
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class j extends p810 {
        public final Throwable b;

        public j(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            Throwable th = this.b;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("InitialScreenErrorLoadDataPatch(throwable="), this.b, ')');
        }

        public j() {
            this(null);
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class s extends p810 {
        public final Set<MultipickerProduct> b;

        public s(Set<MultipickerProduct> set) {
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateSelectedIdsPatch(selectedGoods="), this.b, ')');
        }

        public s() {
            this(EmptySet.b);
        }
    }

    /* compiled from: MarketMultiPickerPatch.kt */
    public static final class o extends p810 {
        public final List<ha10> b;
        public final Integer c;

        public o(List<ha10> list, Integer num) {
            this.b = list;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateFaveItemsPatch(faveItems=");
            sb.append(this.b);
            sb.append(", faveItemsNextFrom=");
            return uqi.b(sb, this.c, ')');
        }

        public o() {
            this(EmptyList.b, null);
        }
    }
}
