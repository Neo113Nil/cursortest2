package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpnj0;", "Ln96;", "Companion", "b", "a", "c", "mnj0", "lnj0", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class pnj0 extends n96 {
    public static final mnj0 Companion = new mnj0();
    public static final i3y[] f;
    public final boolean b;
    public final Map c;
    public final String d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vci0(25)), null, kotlin.a.b(lazyThreadSafetyMode, new vci0(26))};
    }

    public /* synthetic */ pnj0(int i, String str, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        this.d = (i & 4) == 0 ? "" : str;
        if ((i & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnj0)) {
            return false;
        }
        pnj0 pnj0Var = (pnj0) obj;
        return this.b == pnj0Var.b && jl40.l(this.c, pnj0Var.c) && jl40.l(this.d, pnj0Var.d) && jl40.l(this.e, pnj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return tse0.j(this.d, ", overridesByTariff=", Extension.C_BRAKE, nnm.l("RequirementsCarouselOverrideExperiment(enabled=", ", overrides=", ", defaultOverrideName=", this.c, this.b), this.e);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpnj0$a;", "", "Companion", "nnj0", "onj0", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class a {
        public static final onj0 Companion = new onj0();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public static final /* synthetic */ void a(a aVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (!yjdVar.F() && aVar.a == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 0, auu0.a, aVar.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("OptionOverride(bigImageTag=", this.a, Extension.C_BRAKE);
        }

        public a() {
            this.a = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpnj0$b;", "", "Companion", "qnj0", "rnj0", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final rnj0 Companion = new rnj0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(27))};
        public final String a;
        public final Map b;

        public /* synthetic */ b(int i, String str, Map map) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = kotlin.collections.b.f();
            } else {
                this.b = map;
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
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return xvz.j("RequirementOverride(bigImageTag=", this.a, ", optionsOverrideMap=", Extension.C_BRAKE, this.b);
        }

        public b() {
            Map f = kotlin.collections.b.f();
            this.a = null;
            this.b = f;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpnj0$c;", "", "Companion", "snj0", "tnj0", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final tnj0 Companion = new tnj0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ c(int i, String str, String str2, String str3) {
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
                this.c = null;
            } else {
                this.c = str3;
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
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return oyr.t(b64.v("TariffOverride(overrideName=", this.a, ", tariffClass=", this.b, ", verticalId="), this.c, Extension.C_BRAKE);
        }

        public c() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    public pnj0() {
        this(0);
    }

    public pnj0(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = "";
        this.e = EmptyList.a;
    }
}
