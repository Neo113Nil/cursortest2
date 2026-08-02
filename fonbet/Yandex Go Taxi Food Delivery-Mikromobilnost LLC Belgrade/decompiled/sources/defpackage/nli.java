package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lnli;", "Lxn11;", "Lc6z;", "Companion", "b", "c", "d", "a", "kli", "jli", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class nli implements xn11, c6z {
    public static final kli Companion = new kli();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(13)), null, null, null};
    public static final nli h = new nli(0);
    public final boolean b;
    public final Map c;
    public final b d;
    public final c e;
    public final c f;

    public /* synthetic */ nli(int i, boolean z, Map map, b bVar, c cVar, c cVar2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new b(0);
        } else {
            this.d = bVar;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = cVar;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = cVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nli)) {
            return false;
        }
        nli nliVar = (nli) obj;
        return this.b == nliVar.b && jl40.l(this.c, nliVar.c) && jl40.l(this.d, nliVar.d) && jl40.l(this.e, nliVar.e) && jl40.l(this.f, nliVar.f);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31;
        c cVar = this.e;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = nnm.l("DeliveryPvzMapFiltersExperiment(enabled=", ", l10n=", ", button=", this.c, this.b);
        l.append(this.d);
        l.append(", filtersListSource=");
        l.append(this.e);
        l.append(", filtersListDestination=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnli$b;", "", "Companion", "oli", "pli", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final pli Companion = new pli();
        public final String a;
        public final String b;

        public /* synthetic */ b(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return unr0.p("FiltersButton(textKey=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public b(int i) {
            this.a = "";
            this.b = null;
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnli$d;", "", "Companion", "sli", "tli", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final tli Companion = new tli();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(17))};
        public final String a;
        public final List b;

        public /* synthetic */ d(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nnm.h("FiltersSection(sectionTitleKey=", this.a, ", filters=", Extension.C_BRAKE, this.b);
        }

        public d() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnli$a;", "", "Companion", "lli", "mli", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final mli Companion = new mli();
        public static final i3y[] d;
        public final String a;
        public final Map b;
        public final Map c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jgi(14)), kotlin.a.b(lazyThreadSafetyMode, new jgi(15))};
        }

        public /* synthetic */ a(int i, String str, Map map, Map map2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
            if ((i & 4) == 0) {
                this.c = kotlin.collections.b.f();
            } else {
                this.c = map2;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Map map = this.b;
            return this.c.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilterObject(nameKey=");
            sb.append(this.a);
            sb.append(", matchOptions=");
            sb.append(this.b);
            sb.append(", meta=");
            return b64.r(sb, this.c, Extension.C_BRAKE);
        }

        public a() {
            Map f = kotlin.collections.b.f();
            this.a = "";
            this.b = null;
            this.c = f;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnli$c;", "", "Companion", "qli", "rli", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final rli Companion = new rli();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(16))};
        public final String a;
        public final String b;
        public final List c;

        public /* synthetic */ c(int i, String str, String str2, List list) {
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
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ly3.s(b64.v("FiltersList(titleKey=", this.a, ", doneButtonKey=", this.b, ", filtersSections="), this.c, Extension.C_BRAKE);
        }

        public c(int i) {
            this.a = "";
            this.b = "";
            this.c = EmptyList.a;
        }

        public c() {
            this(0);
        }
    }

    public nli() {
        this(0);
    }

    public nli(int i) {
        Map f = kotlin.collections.b.f();
        b bVar = new b(0);
        this.b = false;
        this.c = f;
        this.d = bVar;
        this.e = null;
        this.f = null;
    }
}
