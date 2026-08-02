package defpackage;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lnow;", "", "Companion", "a", "jow", "kow", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class now {
    public static final kow Companion = new kow();
    public final Boolean a;
    public final a b;

    public /* synthetic */ now(int i, Boolean bool, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aVar;
        }
    }

    public static final /* synthetic */ void b(now nowVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || nowVar.a != null) {
            yjdVar.g(serialDescriptor, 0, z96.a, nowVar.a);
        }
        if (!yjdVar.F() && nowVar.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, low.a, nowVar.b);
    }

    /* renamed from: a, reason: from getter */
    public final a getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof now)) {
            return false;
        }
        now nowVar = (now) obj;
        return jl40.l(this.a, nowVar.a) && jl40.l(this.b, nowVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        a aVar = this.b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "IntercityParams(preorderFlow=" + this.a + ", citiesOnSummaryFormat=" + this.b + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnow$a;", "", "Companion", Constants.LOW, "mow", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final /* data */ class a {
        public static final mow Companion = new mow();
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
            return unr0.p("Format(rtl=", this.a, ", ltr=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public now() {
        this.a = null;
        this.b = null;
    }
}
