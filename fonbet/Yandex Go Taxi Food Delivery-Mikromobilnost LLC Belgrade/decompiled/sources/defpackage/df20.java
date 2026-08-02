package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ldf20;", "", "Companion", "a", "ze20", "af20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class df20 {
    public static final af20 Companion = new af20();
    public static final i3y[] h;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new g320(9)), kotlin.a.b(lazyThreadSafetyMode, new g320(10)), kotlin.a.b(lazyThreadSafetyMode, new g320(11)), kotlin.a.b(lazyThreadSafetyMode, new g320(12)), kotlin.a.b(lazyThreadSafetyMode, new g320(13)), kotlin.a.b(lazyThreadSafetyMode, new g320(14)), kotlin.a.b(lazyThreadSafetyMode, new g320(15))};
    }

    public /* synthetic */ df20(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list7;
        }
    }

    public final ArrayList a() {
        List<a> list = this.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (a aVar : list) {
            arrayList.add(new s2c(aVar.a, aVar.b));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df20)) {
            return false;
        }
        df20 df20Var = (df20) obj;
        return jl40.l(this.a, df20Var.a) && jl40.l(this.b, df20Var.b) && jl40.l(this.c, df20Var.c) && jl40.l(this.d, df20Var.d) && jl40.l(this.e, df20Var.e) && jl40.l(this.f, df20Var.f) && jl40.l(this.g, df20Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.c(unr0.c(unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = qv10.v("MicroWidgetConditionDto(screens=", this.a, ", orderStates=", this.b, ", tariffs=");
        nnm.w(v, this.c, ", selectedTariffsResponse=", this.d, ", availableTariffsResponse=");
        nnm.w(v, this.e, ", unseenTypedScreens=", this.f, ", paymentMethods=");
        return ly3.s(v, this.g, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldf20$a;", "", "Companion", "bf20", "cf20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final cf20 Companion = new cf20();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("TariffDto(tariff=", this.a, ", vertical=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public df20() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        this.g = emptyList;
    }
}
