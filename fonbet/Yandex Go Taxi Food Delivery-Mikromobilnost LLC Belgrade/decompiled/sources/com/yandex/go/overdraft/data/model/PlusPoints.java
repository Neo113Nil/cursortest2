package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/PlusPoints;", "", "Companion", "com/yandex/go/overdraft/data/model/c0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlusPoints {
    public static final c0 Companion = new c0();
    public static final PlusPoints d = new PlusPoints(0);
    public final String a;
    public final String b;
    public final t0 c;

    public /* synthetic */ PlusPoints(int i, String str, String str2, t0 t0Var) {
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
            this.c = s0.INSTANCE;
        } else {
            this.c = t0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlusPoints)) {
            return false;
        }
        PlusPoints plusPoints = (PlusPoints) obj;
        return jl40.l(this.a, plusPoints.a) && jl40.l(this.b, plusPoints.b) && jl40.l(this.c, plusPoints.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlusPoints(title=", this.a, ", subtitle=", this.b, ", tapAction=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PlusPoints() {
        this(0);
    }

    public PlusPoints(int i) {
        s0 s0Var = s0.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = s0Var;
    }
}
