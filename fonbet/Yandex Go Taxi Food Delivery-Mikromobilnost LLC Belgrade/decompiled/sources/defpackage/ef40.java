package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lef40;", "", "Companion", "df40", "cf40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ef40 {
    public static final df40 Companion = new df40();
    public final String a;
    public final String b;
    public final String c;
    public final mf40 d;
    public final mf40 e;
    public final hf40 f;

    static {
        new ef40(0);
    }

    public ef40(int i, String str, String str2, String str3, mf40 mf40Var, mf40 mf40Var2, hf40 hf40Var) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        int i2 = i & 8;
        mf40 mf40Var3 = mf40.d;
        if (i2 == 0) {
            mf40.Companion.getClass();
            this.d = mf40Var3;
        } else {
            this.d = mf40Var;
        }
        if ((i & 16) == 0) {
            mf40.Companion.getClass();
            this.e = mf40Var3;
        } else {
            this.e = mf40Var2;
        }
        if ((i & 32) == 0) {
            this.f = e5r.INSTANCE;
        } else {
            this.f = hf40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef40)) {
            return false;
        }
        ef40 ef40Var = (ef40) obj;
        return jl40.l(this.a, ef40Var.a) && jl40.l(this.b, ef40Var.b) && jl40.l(this.c, ef40Var.c) && jl40.l(this.d, ef40Var.d) && jl40.l(this.e, ef40Var.e) && jl40.l(this.f, ef40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainFilter(id=", this.a, ", icon=", this.b, ", title=");
        v.append(this.c);
        v.append(", state=");
        v.append(this.d);
        v.append(", selectedState=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ef40() {
        this(0);
    }

    public ef40(int i) {
        lf40 lf40Var = mf40.Companion;
        lf40Var.getClass();
        lf40Var.getClass();
        e5r e5rVar = e5r.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = "";
        mf40 mf40Var = mf40.d;
        this.d = mf40Var;
        this.e = mf40Var;
        this.f = e5rVar;
    }
}
