package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lh6k0;", "", "Companion", "c", "b", "a", "e6k0", "k6k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class h6k0 {
    public static final k6k0 Companion = new k6k0();
    public static final i3y[] f;
    public final String a;
    public final List b;
    public final int c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new zfj0(19)), null, kotlin.a.b(lazyThreadSafetyMode, new zfj0(20)), kotlin.a.b(lazyThreadSafetyMode, new zfj0(21))};
    }

    public /* synthetic */ h6k0(int i, String str, List list, int i2, List list2, List list3) {
        this.a = (i & 1) == 0 ? "" : str;
        int i3 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
    }

    public static final /* synthetic */ void g(h6k0 h6k0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(h6k0Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, h6k0Var.a);
        }
        boolean F = yjdVar.F();
        EmptyList emptyList = EmptyList.a;
        i3y[] i3yVarArr = f;
        if (F || !jl40.l(h6k0Var.b, emptyList)) {
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), h6k0Var.b);
        }
        if (yjdVar.F() || h6k0Var.c != 0) {
            yjdVar.A(2, h6k0Var.c, serialDescriptor);
        }
        if (yjdVar.F() || !jl40.l(h6k0Var.d, emptyList)) {
            yjdVar.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), h6k0Var.d);
        }
        if (!yjdVar.F() && jl40.l(h6k0Var.e, emptyList)) {
            return;
        }
        yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), h6k0Var.e);
    }

    /* renamed from: b, reason: from getter */
    public final List getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6k0)) {
            return false;
        }
        h6k0 h6k0Var = (h6k0) obj;
        return jl40.l(this.a, h6k0Var.a) && jl40.l(this.b, h6k0Var.b) && this.c == h6k0Var.c && jl40.l(this.d, h6k0Var.d) && jl40.l(this.e, h6k0Var.e);
    }

    /* renamed from: f, reason: from getter */
    public final int getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder r = xvz.r("RidaInfo(rideTimeSubtitle=", this.a, ", prices=", this.b, ", suggestedPriceIndex=");
        r.append(this.c);
        r.append(", priceTitles=");
        r.append(this.d);
        r.append(", auctionPrices=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh6k0$a;", "", "Companion", "f6k0", "g6k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final g6k0 Companion = new g6k0();
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

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
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
            return unr0.p("AuctionPrice(raw=", this.a, ", formatted=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh6k0$b;", "", "Companion", "i6k0", "j6k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final j6k0 Companion = new j6k0();
        public final String a;
        public final String b;

        public /* synthetic */ b(int i, String str, String str2) {
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

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("BackgroundGradient(startColor=", this.a, ", endColor=", this.b, Extension.C_BRAKE);
        }

        public b(int i) {
            this.a = "";
            this.b = "";
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh6k0$c;", "", "Companion", "l6k0", "m6k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final m6k0 Companion = new m6k0();
        public final int a;
        public final FormattedText b;
        public final b c;

        public /* synthetic */ c(int i, int i2, FormattedText formattedText, b bVar) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = new b(0);
            } else {
                this.c = bVar;
            }
        }

        /* renamed from: a, reason: from getter */
        public final b getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final int getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final FormattedText getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(Integer.hashCode(this.a) * 31, 31, this.b.a);
        }

        public final String toString() {
            return "PriceTitle(priceIndex=" + this.a + ", title=" + this.b + ", backgroundGradient=" + this.c + Extension.C_BRAKE;
        }

        public c() {
            FormattedText formattedText = FormattedText.c;
            b bVar = new b(0);
            this.a = 0;
            this.b = formattedText;
            this.c = bVar;
        }
    }

    public h6k0() {
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = 0;
        this.d = emptyList;
        this.e = emptyList;
    }
}
