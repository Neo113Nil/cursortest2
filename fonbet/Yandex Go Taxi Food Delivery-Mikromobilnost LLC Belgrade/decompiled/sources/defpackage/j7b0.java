package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lj7b0;", "", "Companion", "d", "c", "b", "a", "f7b0", "g7b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class j7b0 {
    public static final g7b0 Companion = new g7b0();
    public static final i3y[] j;
    public final boolean a;
    public final String b;
    public final int c;
    public final d580 d;
    public final cu e;
    public final List f;
    public final np40 g;
    public final String h;
    public final Map i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(2)), null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(3)), null, null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(4))};
    }

    public /* synthetic */ j7b0(int i, boolean z, String str, int i2, d580 d580Var, cu cuVar, List list, np40 np40Var, String str2, Map map) {
        int i3 = 0;
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = new d580(i3);
        } else {
            this.d = d580Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cuVar;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = np40Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = new HashMap();
        } else {
            this.i = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7b0)) {
            return false;
        }
        j7b0 j7b0Var = (j7b0) obj;
        return this.a == j7b0Var.a && jl40.l(this.b, j7b0Var.b) && this.c == j7b0Var.c && jl40.l(this.d, j7b0Var.d) && jl40.l(this.e, j7b0Var.e) && jl40.l(this.f, j7b0Var.f) && jl40.l(this.g, j7b0Var.g) && jl40.l(this.h, j7b0Var.h) && jl40.l(this.i, j7b0Var.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        cu cuVar = this.e;
        int c2 = unr0.c((hashCode2 + (cuVar == null ? 0 : cuVar.hashCode())) * 31, 31, this.f);
        np40 np40Var = this.g;
        int hashCode3 = (c2 + (np40Var == null ? 0 : np40Var.hashCode())) * 31;
        String str2 = this.h;
        return this.i.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("PersonalStateResponse(isFallback=", ", selectedClass=", this.b, ", revisionId=", this.a);
        v.append(this.c);
        v.append(", requirements=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", tariffs=");
        v.append(this.f);
        v.append(", multiclassOptions=");
        v.append(this.g);
        v.append(", selectedVertical=");
        v.append(this.h);
        v.append(", selectedOptionsInVerticals=");
        return b64.r(v, this.i, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj7b0$d;", "", "Companion", "o7b0", "p7b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class d {
        public static final p7b0 Companion = new p7b0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(1))};
        public final String a;
        public final List b;

        public /* synthetic */ d(int i, String str, List list) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public static final /* synthetic */ void b(d dVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || dVar.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, dVar.a);
            }
            if (!yjdVar.F() && jl40.l(dVar.b, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), dVar.b);
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
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return nnm.h("TariffInfo(tariffClass=", this.a, ", payments=", Extension.C_BRAKE, this.b);
        }

        public d(int i) {
            this.a = null;
            this.b = EmptyList.a;
        }

        public d() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj7b0$a;", "", "Companion", "h7b0", "i7b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class a {
        public static final i7b0 Companion = new i7b0();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ a(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.v("EventInfo(name=", this.a, ", type=", this.b, ", tag="), this.c, Extension.C_BRAKE);
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj7b0$b;", "", "Companion", "k7b0", "l7b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class b {
        public static final l7b0 Companion = new l7b0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ b(String str, String str2, String str3, String str4, int i, String str5) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
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
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d) && jl40.l(this.e, bVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int b = unr0.b(unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
            String str3 = this.e;
            return b + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("InfoScreen(content=", this.a, ", details=", this.b, ", iconTag=");
            g8e.D(v, this.c, ", detailsUrl=", this.d, ", detailsButtonTitle=");
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = "";
            this.d = "";
            this.e = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj7b0$c;", "", "Companion", "m7b0", "n7b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class c {
        public static final n7b0 Companion = new n7b0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final b e;
        public final a f;

        public /* synthetic */ c(int i, String str, String str2, String str3, String str4, b bVar, a aVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bVar;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = aVar;
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
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            b bVar = this.e;
            int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.f;
            return hashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("PaymentInfo(id=", this.a, ", message=", this.b, ", info=");
            g8e.D(v, this.c, ", infoInsteadDate=", this.d, ", infoScreen=");
            v.append(this.e);
            v.append(", eventInfo=");
            v.append(this.f);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public c() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }

    public j7b0() {
        d580 d580Var = new d580(0);
        HashMap hashMap = new HashMap();
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = d580Var;
        this.e = null;
        this.f = EmptyList.a;
        this.g = null;
        this.h = null;
        this.i = hashMap;
    }
}
