package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lnp40;", "", "Companion", "a", "kp40", "jp40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class np40 {
    public static final kp40 Companion = new kp40();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d540(6)), null, null, null};
    public final Set a;
    public final boolean b;
    public final String c;
    public final a d;

    public /* synthetic */ np40(int i, Set set, boolean z, String str, a aVar) {
        this.a = (i & 1) == 0 ? EmptySet.a : set;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np40)) {
            return false;
        }
        np40 np40Var = (np40) obj;
        return jl40.l(this.a, np40Var.a) && this.b == np40Var.b && jl40.l(this.c, np40Var.c) && jl40.l(this.d, np40Var.d);
    }

    public final int hashCode() {
        int e2 = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MulticlassOptionsState(selectedClasses=" + this.a + ", isSelected=" + this.b + ", selectedVerticalId=" + this.c + ", overrideSummaryButton=" + this.d + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnp40$a;", "", "Companion", "lp40", "mp40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final mp40 Companion = new mp40();
        public final boolean a;
        public final String b;

        public /* synthetic */ a(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
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
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return xvz.m("OverrideSummaryButton(needExpandDetails=", this.a, ", text=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this.a = false;
            this.b = "";
        }
    }

    public np40() {
        this(15, null, null, false);
    }

    public np40(int i, String str, Set set, boolean z) {
        set = (i & 1) != 0 ? EmptySet.a : set;
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? null : str;
        this.a = set;
        this.b = z;
        this.c = str;
        this.d = null;
    }
}
