package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/Ride;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Ride {
    public static final e0 Companion = new e0();
    public final String a;
    public final String b;
    public final ief c;
    public final String d;
    public final t0 e;

    public /* synthetic */ Ride(int i, String str, String str2, ief iefVar, String str3, t0 t0Var) {
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
            this.c = iefVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = s0.INSTANCE;
        } else {
            this.e = t0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ride)) {
            return false;
        }
        Ride ride = (Ride) obj;
        return jl40.l(this.a, ride.a) && jl40.l(this.b, ride.b) && jl40.l(this.c, ride.c) && jl40.l(this.d, ride.d) && jl40.l(this.e, ride.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ief iefVar = this.c;
        return this.e.hashCode() + unr0.b((b + (iefVar == null ? 0 : iefVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("Ride(title=", this.a, ", subtitle=", this.b, ", currencyRulesDto=");
        v.append(this.c);
        v.append(", description=");
        v.append(this.d);
        v.append(", tapAction=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public Ride() {
        s0 s0Var = s0.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = s0Var;
    }
}
