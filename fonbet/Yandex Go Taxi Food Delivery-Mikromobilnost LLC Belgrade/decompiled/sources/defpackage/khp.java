package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkhp;", "", "Companion", "a", "dhp", "ehp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class khp {
    public static final ehp Companion = new ehp();
    public final efp a;
    public final a b;

    public /* synthetic */ khp(int i, efp efpVar, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = efpVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khp)) {
            return false;
        }
        khp khpVar = (khp) obj;
        return jl40.l(this.a, khpVar.a) && jl40.l(this.b, khpVar.b);
    }

    public final int hashCode() {
        efp efpVar = this.a;
        int hashCode = (efpVar == null ? 0 : efpVar.hashCode()) * 31;
        a aVar = this.b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "FavoriteRidesAndAddressesResponse(addresses=" + this.a + ", rides=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkhp$a;", "", "Companion", "a", "fhp", "ghp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class a {
        public static final ghp Companion = new ghp();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d6p(29))};
        public final C0099a a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ a(int i, C0099a c0099a, FormattedText formattedText, List list) {
            this.a = (i & 1) == 0 ? new C0099a(0) : c0099a;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            FormattedText formattedText = this.b;
            return this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rides(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", items=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkhp$a$a;", "", "Companion", "a", "hhp", "lhp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* renamed from: khp$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0099a {
            public static final lhp Companion = new lhp();
            public final FormattedText a;
            public final C0100a b;

            public /* synthetic */ C0099a(int i, FormattedText formattedText, C0100a c0100a) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = c0100a;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0099a)) {
                    return false;
                }
                C0099a c0099a = (C0099a) obj;
                return jl40.l(this.a, c0099a.a) && jl40.l(this.b, c0099a.b);
            }

            public final int hashCode() {
                int hashCode = this.a.a.hashCode() * 31;
                C0100a c0100a = this.b;
                return hashCode + (c0100a == null ? 0 : c0100a.a.hashCode());
            }

            public final String toString() {
                return "Title(text=" + this.a + ", badge=" + this.b + Extension.C_BRAKE;
            }

            @gsq0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkhp$a$a$a;", "", "Companion", "ihp", "jhp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            /* renamed from: khp$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0100a {
                public static final jhp Companion = new jhp();
                public final String a;

                public /* synthetic */ C0100a(int i, String str) {
                    if ((i & 1) == 0) {
                        this.a = "";
                    } else {
                        this.a = str;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0100a) && jl40.l(this.a, ((C0100a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return oyr.p("Badge(text=", this.a, Extension.C_BRAKE);
                }

                public C0100a() {
                    this.a = "";
                }
            }

            public C0099a() {
                this(0);
            }

            public C0099a(int i) {
                this.a = FormattedText.c;
                this.b = null;
            }
        }

        public a() {
            this.a = new C0099a(0);
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    public khp() {
        this.a = null;
        this.b = null;
    }
}
